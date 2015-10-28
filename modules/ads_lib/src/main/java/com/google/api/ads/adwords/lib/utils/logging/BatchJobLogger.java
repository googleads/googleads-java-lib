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
import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import org.slf4j.Logger;

import javax.annotation.Nullable;

/**
 * Logger for batch job uploads/downloads.
 */
public class BatchJobLogger {
  private final Logger batchJobLogger;

  @VisibleForTesting
  final static String SUCCESS_STATUS = "SUCCESSFUL";

  @VisibleForTesting
  final static String FAILURE_STATUS = "FAILED";

  /**
   * Constructor that takes an injected logger identified by name.
   *
   * @param batchJobLogger underlying SLF4J logger for batch job uploads/downloads
   */
  @Inject
  BatchJobLogger(@Named(AdWordsLoggingModule.BATCH_JOB_LOGGER_NAME) Logger batchJobLogger) {
    this.batchJobLogger = batchJobLogger;
  }

  /**
   * Logs a batch job operations upload.
   *
   * @param uploadContents the contents of the upload.
   * @param uploadUri the URI for the upload. This is of type Object because this method will
   * simply use {@link Object#toString()} when logging.
   * @param batchJobUploadResponse the upload response.
   * @param throwable the throwable that occurred during upload, or {@code null} if the upload
   * succeeded.
   */
  public void logUpload(String uploadContents, Object uploadUri,
      @Nullable BatchJobUploadResponse batchJobUploadResponse, @Nullable Throwable throwable) {
    boolean isSuccess = throwable == null;
    String httpResponseInfo = null;
    if (batchJobUploadResponse != null) {
      httpResponseInfo = String.format("%d: %s", batchJobUploadResponse.getHttpStatus(),
          batchJobUploadResponse.getHttpResponseMessage());
    }
    String resultString =
        String.format("%s (%s)", isSuccess ? SUCCESS_STATUS : FAILURE_STATUS, httpResponseInfo);

    if (isSuccess) {
      batchJobLogger.info("{} batch job upload to {}", resultString, uploadUri);
    } else {
      batchJobLogger.warn(
          "{} batch job upload to {}. Exception: {}", resultString, uploadUri, throwable);
    }

    if (batchJobLogger.isDebugEnabled()) {
      // Trim upload contents since the contents may be padded to the next multiple of 256K bytes.
      batchJobLogger.debug("Contents for {} upload to {}: {}", resultString, uploadUri,
          uploadContents == null ? null : uploadContents.trim());
    }
  }

  /**
   * Logs a batch job results download.
   *
   * @param downloadUrl the download URL for the batch job.
   * @param response the response - only not null if the download succeeded.
   * @param throwable the throwable that occurred during download, or {@code null} if the download
   * succeeded.
   */
  public <O, E, R extends BatchJobMutateResultInterface<O, E>> void logDownload(
      String downloadUrl, BatchJobMutateResponseInterface<O, E, R> response, Throwable throwable) {
    boolean isSuccess = throwable == null;
    if (isSuccess) {
      batchJobLogger.info(
          "{} download of {} mutate results from batch job download URL {}", SUCCESS_STATUS,
          (response == null || response.getMutateResults() == null)
              ? 0 : response.getMutateResults().length,
          downloadUrl);
    } else {
      batchJobLogger.warn(
          "{} to download mutate results from batch job download URL {}. Exception: {}",
          FAILURE_STATUS, downloadUrl, throwable);
    }
  }
}
