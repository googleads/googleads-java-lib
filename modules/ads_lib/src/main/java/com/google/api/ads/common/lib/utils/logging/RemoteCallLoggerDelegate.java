// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.common.lib.utils.logging;

import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.slf4j.Logger;

/** Delegate for logging {@link RemoteCallReturn} objects. */
public class RemoteCallLoggerDelegate {

  /** Type of the request or response. */
  public enum RemoteCallType {
    SOAP,
    HTTP;
  }

  private final Logger summaryLogger;
  private final Logger detailLogger;
  private final PrettyPrinterInterface prettyPrinter;
  private final RemoteCallType remoteCallType;

  private static final Pattern NEWLINE_PATTERN =
      Pattern.compile(String.format("%n"), Pattern.LITERAL);

  /** The template string for summary log messages. */
  @VisibleForTesting
  static final String SUMMARY_TEMPLATE =
      "Request made: Service: {} Method: {} {}: {} URL: {} Request ID: {} "
          + "ResponseTime(ms): {} OperationsCount: {} IsFault: {} FaultMessage: {}";

  /** The template string for request details log messages. */
  @VisibleForTesting
  static final String DETAILS_REQUEST_TEMPLATE = String.format("{} request:%n{}");

  /** The template string for response details log messages. */
  @VisibleForTesting
  static final String DETAILS_RESPONSE_TEMPLATE = String.format("{} response:%n{}");

  /** When logging the one-line summary for a failed request, limit the error to this length. */
  private static final int MAX_SUMMARY_ERROR_LENGTH = 16_000;

  /** Trailing string to use for errors that exceed {@link #MAX_SUMMARY_ERROR_LENGTH}. */
  private static final String ELLIPSIS = "...";

  public RemoteCallLoggerDelegate(
      Logger summaryLogger,
      Logger detailLogger,
      @Nullable PrettyPrinterInterface prettyPrinter,
      RemoteCallType remoteCallType) {
    this.summaryLogger = Preconditions.checkNotNull(summaryLogger, "Null summary logger");
    this.detailLogger = Preconditions.checkNotNull(detailLogger, "Null detail logger");
    // If no pretty printer supplied, then use the default implementation that simply returns
    // the message with no modifications.
    this.prettyPrinter =
        MoreObjects.firstNonNull(prettyPrinter, PrettyPrinterInterface.NO_OP_PRETTY_PRINTER);
    this.remoteCallType = Preconditions.checkNotNull(remoteCallType, "Null remote call type");
  }

  /** Returns true if the log level for request summaries and the specified result is enabled. */
  public boolean isSummaryLoggable(boolean isSuccess) {
    if (isSuccess) {
      return summaryLogger.isInfoEnabled();
    }
    return summaryLogger.isWarnEnabled();
  }

  /** Returns true if the log level for request details and the specified result is enabled. */
  public boolean isDetailsLoggable(boolean isSuccess) {
    if (isSuccess) {
      return detailLogger.isDebugEnabled();
    }
    return detailLogger.isInfoEnabled();
  }

  public void logRequestDetails(RemoteCallReturn remoteCallReturn) {
    if (remoteCallReturn == null) {
      return;
    }
    boolean isSuccess = remoteCallReturn.getException() == null;
    if (!isDetailsLoggable(isSuccess)) {
      return;
    }
    String prettyRequest = null;
    if (remoteCallReturn.getRequestInfo() != null) {
      prettyRequest = prettyPrinter.prettyPrint(remoteCallReturn.getRequestInfo().getPayload());
    }
    String prettyResponse = null;
    if (remoteCallReturn.getResponseInfo() != null) {
      prettyResponse = prettyPrinter.prettyPrint(remoteCallReturn.getResponseInfo().getPayload());
    }
    if (isSuccess) {
      detailLogger.debug(DETAILS_REQUEST_TEMPLATE, remoteCallType, prettyRequest);
      detailLogger.debug(DETAILS_RESPONSE_TEMPLATE, remoteCallType, prettyResponse);
    } else {
      detailLogger.info(DETAILS_REQUEST_TEMPLATE, remoteCallType, prettyRequest);
      detailLogger.info(DETAILS_RESPONSE_TEMPLATE, remoteCallType, prettyResponse);
    }
  }

  public void logRequestSummary(RemoteCallReturn remoteCallReturn) {
    if (remoteCallReturn == null) {
      return;
    }
    boolean isSuccess = remoteCallReturn.getException() == null;
    if (!isSummaryLoggable(isSuccess)) {
      return;
    }
    RequestInfo request = remoteCallReturn.getRequestInfo();
    ResponseInfo response = remoteCallReturn.getResponseInfo();
    Object[] logArgs = new Object[10];
    if (request != null) {
      logArgs[0] = request.getServiceName();
      logArgs[1] = request.getMethodName();
      logArgs[2] = request.getContextName();
      logArgs[3] = request.getContextValue();
      logArgs[4] = request.getUrl();
    }
    if (response != null) {
      logArgs[5] = response.getRequestId();
      logArgs[6] = response.getResponseTime();
      logArgs[7] = response.getOperationsCount();
      Throwable throwable = remoteCallReturn.getException();
      logArgs[8] = throwable != null;
      logArgs[9] = truncateThrowable(throwable, MAX_SUMMARY_ERROR_LENGTH);
    }
    if (isSuccess) {
      summaryLogger.info(SUMMARY_TEMPLATE, logArgs);
    } else {
      summaryLogger.warn(SUMMARY_TEMPLATE, logArgs);
    }
  }

  @VisibleForTesting
  CharSequence truncateThrowable(Throwable throwable, int maxLength) {
    if (throwable == null) {
      return null;
    }
    String truncated = NEWLINE_PATTERN.matcher(throwable.toString()).replaceAll("");
    if (truncated.length() <= maxLength) {
      return truncated;
    }
    return new StringBuilder(maxLength)
        .append(truncated.substring(0, maxLength - ELLIPSIS.length()))
        .append(ELLIPSIS)
        .toString();
  }
}