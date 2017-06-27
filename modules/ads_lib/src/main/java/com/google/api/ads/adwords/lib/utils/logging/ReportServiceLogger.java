// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.logging;

import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate.RemoteCallType;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.Data;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.google.inject.name.Named;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;
import javax.inject.Inject;
import org.slf4j.Logger;

/**
 * Logger that logs report requests and responses according to the following rules.<br>
 *
 * <ul>
 *   <li>Log successful requests (header and payload) and responses to INFO.
 *   <li>Log failed requests (header and payload) and responses to WARN.
 * </ul>
 */
public class ReportServiceLogger {

  /**
   * Headers whose value should not be logged because they contain sensitive information. Entries
   * are in lowercase, but scrubbing should be case-insensitive.
   */
  @VisibleForTesting
  static final Set<String> SCRUBBED_HEADERS =
      Sets.newHashSet("authorization", "authtoken", "password", "developertoken");
  /** Value to log for a scrubbed header. */
  @VisibleForTesting static final String REDACTED_HEADER = "REDACTED";
  /** String to log in place of the report response contents. */
  @VisibleForTesting static final String REDACTED_REPORT_DATA = "REDACTED REPORT DATA";

  private static final String CLIENT_CUSTOMER_ID = "clientCustomerId";

  private final RemoteCallLoggerDelegate loggerDelegate;

  /**
   * Constructor that takes an injected logger identified by name.
   *
   * @param reportLogger underlying SLF4J logger for report service interactions
   */
  @Inject
  private ReportServiceLogger(@Named(AdWordsLoggingModule.REPORT_LOGGER_NAME) Logger reportLogger) {
    this(new RemoteCallLoggerDelegate(reportLogger, reportLogger, null, RemoteCallType.HTTP));
  }

  /** @param remoteCallLoggerDelegate */
  ReportServiceLogger(RemoteCallLoggerDelegate remoteCallLoggerDelegate) {
    this.loggerDelegate = remoteCallLoggerDelegate;
  }

  /**
   * Logs the specified request and response information.
   *
   * <p>Note that in order to avoid any temptation to consume the contents of the response, this
   * does <em>not</em> take an {@link com.google.api.client.http.HttpResponse} object, but instead
   * accepts the status code and message from the response.
   */
  public void logRequest(
      @Nullable HttpRequest request, int statusCode, @Nullable String statusMessage) {
    boolean isSuccess = HttpStatusCodes.isSuccess(statusCode);
    if (!loggerDelegate.isSummaryLoggable(isSuccess)
        && !loggerDelegate.isDetailsLoggable(isSuccess)) {
      return;
    }

    // Populate the RequestInfo builder from the request.
    RequestInfo requestInfo = buildRequestInfo(request);

    // Populate the ResponseInfo builder from the response.
    ResponseInfo responseInfo = buildResponseInfo(request, statusCode, statusMessage);

    RemoteCallReturn.Builder remoteCallReturnBuilder =
        new RemoteCallReturn.Builder().withRequestInfo(requestInfo).withResponseInfo(responseInfo);
    if (!isSuccess) {
      remoteCallReturnBuilder.withException(
          new ReportException(String.format("%s: %s", statusCode, statusMessage)));
    }
    RemoteCallReturn remoteCallReturn = remoteCallReturnBuilder.build();
    loggerDelegate.logRequestSummary(remoteCallReturn);
    loggerDelegate.logRequestDetails(remoteCallReturn);
  }

  @VisibleForTesting
  RequestInfo buildRequestInfo(HttpRequest request) {
    RequestInfo.Builder requestBuilder = new RequestInfo.Builder();
    if (request != null) {
      requestBuilder.withServiceName("reportdownload").withMethodName(request.getRequestMethod());
      try {
        requestBuilder.withUrl(request.getUrl().toURL().toString());
      } catch (IllegalArgumentException e) {
        requestBuilder.withUrl("Malformed URL: " + request.getUrl());
      }

      if (request.getHeaders() != null) {
        String clientCustomerId =
            request.getHeaders().getFirstHeaderStringValue(CLIENT_CUSTOMER_ID);
        requestBuilder.withContext(CLIENT_CUSTOMER_ID, clientCustomerId);
      }

      // Get the payload from the request.
      requestBuilder.withPayload(extractPayload(request.getHeaders(), request.getContent()));
    }
    return requestBuilder.build();
  }

  @VisibleForTesting
  ResponseInfo buildResponseInfo(HttpRequest request, int statusCode, String statusMessage) {
    ResponseInfo.Builder responseBuilder = new ResponseInfo.Builder();
    // Include all response headers + the redacted token for the response body.
    StringBuilder payloadBuilder = new StringBuilder();
    payloadBuilder.append(String.format("%d %s%n", statusCode, statusMessage));
    appendMapAsString(payloadBuilder, request.getResponseHeaders());
    payloadBuilder.append(String.format("%nContent:%n%s", REDACTED_REPORT_DATA));

    return responseBuilder.withPayload(payloadBuilder.toString()).build();
  }

  private String extractPayload(HttpHeaders headers, @Nullable HttpContent content) {
    StringBuilder messageBuilder = new StringBuilder();
    if (headers != null) {
      appendMapAsString(messageBuilder, headers);
    }
    if (content != null) {
      messageBuilder.append(String.format("%nContent:%n"));
      if (content instanceof UrlEncodedContent) {
        UrlEncodedContent encodedContent = (UrlEncodedContent) content;
        appendMapAsString(messageBuilder, Data.mapOf(encodedContent.getData()));
      } else if (content != null) {
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        try {
          content.writeTo(byteStream);
          messageBuilder.append(byteStream.toString(StandardCharsets.UTF_8.name()));
        } catch (IOException e) {
          messageBuilder.append("Unable to read request content due to exception: " + e);
        }
      }
    }
    return messageBuilder.toString();
  }

  /**
   * Converts the map of key/value pairs to a multi-line string (one line per key). Masks sensitive
   * information for a predefined set of header keys.
   *
   * @param map a non-null Map
   * @return a non-null String
   */
  private StringBuilder appendMapAsString(StringBuilder messageBuilder, Map<String, Object> map) {
    for (Entry<String, Object> mapEntry : map.entrySet()) {
      Object headerValue = mapEntry.getValue();
      // Perform a case-insensitive check if the header should be scrubbed.
      if (SCRUBBED_HEADERS.contains(mapEntry.getKey().toLowerCase())) {
        headerValue = REDACTED_HEADER;
      }
      messageBuilder.append(String.format("%s: %s%n", mapEntry.getKey(), headerValue));
    }
    return messageBuilder;
  }
}
