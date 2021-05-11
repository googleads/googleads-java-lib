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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.UsesAdsUtilities;

/**
 * Utility for uploading operations and downloading results for a {@code BatchJob}.
 *
 * @param <OperationT> the operation type for the API version and SOAP toolkit.
 * @param <OperandT> the operand type for the API version and SOAP toolkit.
 * @param <ErrorT> the {@code ApiError} type for the API version and SOAP toolkit.
 * @param <ResultT> the mutate result type for the API version and SOAP toolkit.
 * @param <ResponseT> the mutate response type for the API version and SOAP toolkit.
 */
public interface BatchJobHelperInterface<
    OperationT,
    OperandT,
    ErrorT,
    ResultT extends BatchJobMutateResultInterface<OperandT, ErrorT>,
    ResponseT extends BatchJobMutateResponseInterface<OperandT, ErrorT, ResultT>> {
  /**
   * Uploads the specified operations to the batch job. After this method returns successfully, the
   * job will transition to the {@code ACTIVE} state.
   *
   * <p>Use this method if you want to upload all operations in a single request. To upload
   * operations across multiple requests, use {@link #uploadIncrementalBatchJobOperations(Iterable,
   * boolean, BatchJobUploadStatus)} instead.
   *
   * @param operations the operations to upload to the batch job
   * @param uploadUrl the {@code BatchJob#getUploadUrl()}
   * @return the response from the upload if the request succeeded
   * @throws BatchJobException if the request failed
   */
  @UsesAdsUtilities({AdsUtility.BATCH_JOB_HELPER})
  BatchJobUploadResponse uploadBatchJobOperations(Iterable<OperationT> operations, String uploadUrl)
      throws BatchJobException;

  /**
   * Uploads the specified operations to the batch job. Use this method if you want to upload
   * operations incrementally. To upload all operations in a single request, use {@link
   * #uploadBatchJobOperations(Iterable, String)} instead.
   *
   * <p>If {@code isLastRequest}, then after this method returns successfully, the job will
   * transition to the {@code ACTIVE} state.
   *
   * @param operations the operations to upload to the batch job
   * @param isLastRequest if this is the last set of operations to upload for the job
   * @param batchJobUploadStatus the current upload status. If this is the first upload, set the
   *     {@link BatchJobUploadStatus#getResumableUploadUri()} to the {@code
   *     BatchJob#getUploadUrl()}.
   * @return the response from the upload if the request succeeded
   * @throws BatchJobException if the request failed
   */
  @UsesAdsUtilities({AdsUtility.BATCH_JOB_HELPER})
  BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      Iterable<? extends OperationT> operations,
      boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus)
      throws BatchJobException;

  /**
   * Downloads and returns the results from the attempted operations for a completed batch job.
   *
   * @param downloadUrl the {@code BatchJob.getDownloadUrl()}
   */
  @UsesAdsUtilities({AdsUtility.BATCH_JOB_HELPER})
  ResponseT downloadBatchJobMutateResponse(String downloadUrl) throws BatchJobException;

  /**
   * Downloads and returns a chunk of results from the attempted operations for a completed batch
   * job.
   * 
   * <p>NOTE: This is only available on Axis implementations of this interface. The JAX-WS
   * implementations will throw an UnsupportedOperationException.
   *
   * @param downloadUrl the {@code BatchJob.getDownloadUrl()}
   * @param startIndex zero-based index of the first result to return
   * @param numberResults maximum number of results to return
   * @throws BatchJobException if unable to download the results.
   * @throws UnsupportedOperationException if this method is not supported by the implementation.
   */
  @UsesAdsUtilities(AdsUtility.BATCH_JOB_HELPER)
  ResponseT downloadBatchJobMutateResponse(String downloadUrl, int startIndex, int numberResults)
      throws BatchJobException;
}
