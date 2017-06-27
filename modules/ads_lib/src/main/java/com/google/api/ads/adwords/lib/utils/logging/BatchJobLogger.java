// Copyright 2015 Google Inc. All Rights Reserved.
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

import com.google.api.ads.adwords.lib.utils.BatchJobMutateResponseInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.common.lib.client.RemoteCallReturn;
import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate.RemoteCallType;
import com.google.common.base.Strings;
import com.google.inject.name.Named;
import java.net.URI;
import javax.annotation.Nullable;
import javax.inject.Inject;
import org.slf4j.Logger;

/** Logger for batch job uploads/downloads. */
public class BatchJobLogger {
  private static final String CONTEXT_NAME = "clientCustomerId";
  private final RemoteCallLoggerDelegate loggerDelegate;

  /**
   * Constructor that takes an injected logger identified by name.
   *
   * @param batchJobLogger underlying SLF4J logger for batch job uploads/downloads
   */
  @Inject
  BatchJobLogger(@Named(AdWordsLoggingModule.BATCH_JOB_LOGGER_NAME) Logger batchJobLogger) {
    this(new RemoteCallLoggerDelegate(batchJobLogger, batchJobLogger, null, RemoteCallType.HTTP));
  }

  BatchJobLogger(RemoteCallLoggerDelegate loggerDelegate) {
    this.loggerDelegate = loggerDelegate;
  }

  /**
   * Logs a batch job operations upload.
   *
   * @param uploadContents the contents of the upload.
   * @param uploadUri the URI for the upload.
   * @param batchJobUploadResponse the upload response.
   * @param throwable the throwable that occurred during upload, or {@code null} if the upload
   *     succeeded.
   */
  public void logUpload(
      String uploadContents,
      URI uploadUri,
      @Nullable BatchJobUploadResponse batchJobUploadResponse,
      @Nullable Throwable throwable) {
    RequestInfo requestInfo =
        new RequestInfo.Builder()
            .withServiceName("batchjobupload")
            .withContext(CONTEXT_NAME, null)
            .withUrl(uploadUri.toString())
            // Trim upload contents since the contents may be padded to the next multiple of 256K
            // bytes.
            .withPayload(Strings.nullToEmpty(uploadContents).trim())
            .build();
    ResponseInfo.Builder responseInfoBuilder = new ResponseInfo.Builder();
    if (batchJobUploadResponse != null) {
      responseInfoBuilder.withPayload(
          String.format(
              "%d %s%n",
              batchJobUploadResponse.getHttpStatus(),
              batchJobUploadResponse.getHttpResponseMessage()));
    }
    RemoteCallReturn remoteCallReturn =
        new RemoteCallReturn.Builder()
            .withRequestInfo(requestInfo)
            .withResponseInfo(responseInfoBuilder.build())
            .withException(throwable)
            .build();
    loggerDelegate.logRequestSummary(remoteCallReturn);
    loggerDelegate.logRequestDetails(remoteCallReturn);
  }

  /**
   * Logs a batch job results download.
   *
   * @param downloadUrl the download URL for the batch job.
   * @param response the response - only not null if the download succeeded.
   * @param throwable the throwable that occurred during download, or {@code null} if the download
   *     succeeded.
   */
  public <O, E, R extends BatchJobMutateResultInterface<O, E>> void logDownload(
      String downloadUrl,
      @Nullable BatchJobMutateResponseInterface<O, E, R> response,
      @Nullable Throwable throwable) {
    RequestInfo requestInfo =
        new RequestInfo.Builder()
            .withServiceName("batchjobdownload")
            .withContext(CONTEXT_NAME, null)
            .withUrl(downloadUrl)
            .build();
    int resultsCount = 0;
    if (response != null && response.getMutateResults() != null) {
      resultsCount = response.getMutateResults().length;
    }
    // The response payload could be massive, so simply indicate the number of results instead.
    ResponseInfo responseInfo =
        new ResponseInfo.Builder()
            .withPayload(String.format("Results count: %d", resultsCount))
            .build();
    RemoteCallReturn remoteCallReturn =
        new RemoteCallReturn.Builder()
            .withRequestInfo(requestInfo)
            .withResponseInfo(responseInfo)
            .withException(throwable)
            .build();
    loggerDelegate.logRequestSummary(remoteCallReturn);
    loggerDelegate.logRequestDetails(remoteCallReturn);
  }
}
