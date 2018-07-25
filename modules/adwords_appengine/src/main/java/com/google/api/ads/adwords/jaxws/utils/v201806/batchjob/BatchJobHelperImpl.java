// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.jaxws.utils.v201806.batchjob;

import com.google.api.ads.adwords.jaxws.utils.JaxWsBatchJobResponseDeserializer;
import com.google.api.ads.adwords.jaxws.v201806.cm.ApiError;
import com.google.api.ads.adwords.jaxws.v201806.cm.BatchJob;
import com.google.api.ads.adwords.jaxws.v201806.cm.Operand;
import com.google.api.ads.adwords.jaxws.v201806.cm.Operation;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.inject.Inject;
import java.net.URI;
import java.net.URL;

/** Utility for uploading operations and downloading results for a {@link BatchJob}. */
class BatchJobHelperImpl
    implements BatchJobHelperInterface<
        Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse> {
  private final BatchJobUploader uploader;
  private final BatchJobLogger batchJobLogger;
  private final JaxWsBatchJobResponseDeserializer deserializer;

  @Inject
  BatchJobHelperImpl(
      BatchJobUploader uploader,
      BatchJobLogger batchJobLogger,
      JaxWsBatchJobResponseDeserializer deserializer) {
    this.uploader = uploader;
    this.batchJobLogger = batchJobLogger;
    this.deserializer = deserializer;
  }

  @Override
  public BatchJobUploadResponse uploadBatchJobOperations(
      Iterable<Operation> operations, String uploadUrl) throws BatchJobException {
    // All uploads must go through the incremental upload workflow.
    return uploadIncrementalBatchJobOperations(
        operations, true, new BatchJobUploadStatus(0, URI.create(uploadUrl)));
  }

  @Override
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      Iterable<? extends Operation> operations,
      boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus)
      throws BatchJobException {
    BatchJobMutateRequest request = new BatchJobMutateRequest();
    request.addOperations(operations);
    return uploader.uploadIncrementalBatchJobOperations(
        request, isLastRequest, batchJobUploadStatus);
  }

  @Override
  public BatchJobMutateResponse downloadBatchJobMutateResponse(String downloadUrl)
      throws BatchJobException {
    return this.downloadBatchJobMutateResponse(downloadUrl, 0, Integer.MAX_VALUE);
  }

  @Override
  public BatchJobMutateResponse downloadBatchJobMutateResponse(
      String downloadUrl, int startIndex, int numberResults) throws BatchJobException {
    try {

      BatchJobMutateResponse response =
          deserializer.deserializeBatchJobMutateResults(
              BatchJobMutateResponse.class, new URL(downloadUrl), startIndex, numberResults);
      batchJobLogger.logDownload(downloadUrl, response, null);
      return response;
    } catch (Exception e) {
      batchJobLogger.logDownload(downloadUrl, null, e);
      throw new BatchJobException(
          "Failed to download batch job mutate response from URL: " + downloadUrl, e);
    }
  }
}
