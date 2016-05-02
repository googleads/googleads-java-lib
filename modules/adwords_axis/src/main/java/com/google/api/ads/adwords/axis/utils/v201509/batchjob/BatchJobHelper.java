package com.google.api.ads.adwords.axis.utils.v201509.batchjob;

import com.google.api.ads.adwords.axis.v201509.cm.ApiError;
import com.google.api.ads.adwords.axis.v201509.cm.Operand;
import com.google.api.ads.adwords.axis.v201509.cm.Operation;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.common.lib.utils.AdsUtilityInvocationHandler;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.reflect.Reflection;

import java.lang.reflect.InvocationHandler;

/**
 * Implementation of {@link BatchJobHelperInterface} for Axis v201509.
 */
public class BatchJobHelper
    implements BatchJobHelperInterface<
        Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse> {

  private BatchJobHelperInterface<
          Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse>
      impl;

  @SuppressWarnings("unchecked")
  public BatchJobHelper(AdWordsSession session) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            new BatchJobHelperImpl(session),
            AdWordsInternals.getInstance().getAdsUtilityRegistry());
    this.impl = Reflection.newProxy(BatchJobHelperInterface.class, invocationHandler);
  }
  
  /**
   * Constructor for testing to allow mocking of the underlying uploader.
   */
  @SuppressWarnings("unchecked")
  @VisibleForTesting
  BatchJobHelper(
      BatchJobUploader<Operand, ApiError, MutateResult, BatchJobMutateResponse> uploader) {
    InvocationHandler invocationHandler =
        new AdsUtilityInvocationHandler(
            new BatchJobHelperImpl(uploader),
            AdWordsInternals.getInstance().getAdsUtilityRegistry());
    this.impl = Reflection.newProxy(BatchJobHelperInterface.class, invocationHandler); 
  }
  
  @Override
  public BatchJobUploadResponse uploadBatchJobOperations(
      Iterable<Operation> operations, String uploadUrl) throws BatchJobException {
    return impl.uploadBatchJobOperations(operations, uploadUrl);
  }

  @Override
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      Iterable<? extends Operation> operations,
      boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus)
      throws BatchJobException {
    return impl.uploadIncrementalBatchJobOperations(
        operations, isLastRequest, batchJobUploadStatus);
  }

  @Override
  public BatchJobMutateResponse downloadBatchJobMutateResponse(String downloadUrl)
      throws BatchJobException {
    return impl.downloadBatchJobMutateResponse(downloadUrl);
  }
}
