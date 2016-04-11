// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.axis.utils.v201601.batchjob;

import com.google.api.ads.adwords.axis.utils.AxisDeserializer;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupAdServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupBidModifierServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupCriterionServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.AdGroupServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.ApiError;
import com.google.api.ads.adwords.axis.v201601.cm.BatchJob;
import com.google.api.ads.adwords.axis.v201601.cm.BudgetServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.CampaignCriterionServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.CampaignServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.FeedItemServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201601.cm.Operand;
import com.google.api.ads.adwords.axis.v201601.cm.Operation;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.common.collect.ImmutableList;

import org.apache.axis.client.Call;
import org.apache.axis.encoding.TypeMapping;

import java.net.URI;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

/**
 * Utility for uploading operations and downloading results for a {@link BatchJob}.
 */
class BatchJobHelperImpl implements BatchJobHelperInterface<Operation, Operand, ApiError,
    MutateResult, BatchJobMutateResponse> {
  private final BatchJobUploader<Operand, ApiError, MutateResult, BatchJobMutateResponse> uploader;
  private final BatchJobLogger batchJobLogger;
  private final QName resultQName;
  private final QName operandQName;
  
  /**
   * Atomic reference to the lazily initialized list of type mappings. Use {@link
   * #getServiceTypeMappings()}
   * to retrieve the initialized list in a thread safe manner.
   */
  private static final AtomicReference<ImmutableList<TypeMapping>> SERVICE_TYPE_MAPPINGS_REF =
      new AtomicReference<ImmutableList<TypeMapping>>();
  
  public BatchJobHelperImpl(AdWordsSession session) {
    uploader = new BatchJobUploader<Operand, ApiError, MutateResult, BatchJobMutateResponse>(
        session, true);
    batchJobLogger = AdWordsInternals.getInstance().getAdWordsServiceLoggers().getBatchJobLogger();
    resultQName = new QName("https://adwords.google.com/api/adwords/cm/v201601", "MutateResult");
    operandQName = new QName("https://adwords.google.com/api/adwords/cm/v201601", "Operand");
  }
  
  @Override
  public BatchJobUploadResponse uploadBatchJobOperations(Iterable<Operation> operations,
      String uploadUrl) throws BatchJobException {
    // Starting with v201601, all uploads must go through the incremental upload workflow.
    return uploadIncrementalBatchJobOperations(
        operations, true, new BatchJobUploadStatus(0, URI.create(uploadUrl)));
  }
  
  @Override
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      Iterable<? extends Operation> operations, boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus) throws BatchJobException {
    BatchJobMutateRequest request = new BatchJobMutateRequest();
    request.addOperations(operations);
    return uploader.uploadIncrementalBatchJobOperations(
        request, isLastRequest, batchJobUploadStatus);
  }
  
  @Override
  public BatchJobMutateResponse downloadBatchJobMutateResponse(String downloadUrl)
      throws BatchJobException {
    AxisDeserializer deserializer = new AxisDeserializer();
    List<MutateResult> mutateResults;
    try {
      mutateResults = deserializer.deserializeBatchJobMutateResults(new URL(downloadUrl),
          getServiceTypeMappings(), MutateResult.class, resultQName, Operand.class, operandQName);
    } catch (Exception e) {
      batchJobLogger.logDownload(downloadUrl, null, e);
      throw new BatchJobException(
          "Failed to download batch job mutate response from URL: " + downloadUrl, e);
    }

    BatchJobMutateResponse response = new BatchJobMutateResponse();
    response.setMutateResults(mutateResults.toArray(new MutateResult[mutateResults.size()]));
    
    batchJobLogger.logDownload(downloadUrl, response, null);
    return response;
  }
  
  /**
   * Returns all of the service type mappings required to serialize/deserialize Axis
   * objects.
   */
  static List<TypeMapping> getServiceTypeMappings() {
    
    // Lazily initialize the list of type mappings.
    if (SERVICE_TYPE_MAPPINGS_REF.get() == null) {
      // Build the list of type mappings based on the synchronous service of each Operation
      // subclass supported by BatchJobService for this version of the API.
      ImmutableList.Builder<TypeMapping> mappings = ImmutableList.builder();
      
      try {
        mappings.add(new AdGroupAdServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new AdGroupBidModifierServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new AdGroupCriterionServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new AdGroupServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new BudgetServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new CampaignCriterionServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new CampaignServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
        
        mappings.add(new FeedItemServiceSoapBindingStub() {
          @Override
          public Call _createCall() throws ServiceException {
            try {
              return super.createCall();
            } catch (RemoteException e) {
              throw new RuntimeException(e);
            }
          }
        }._createCall().getTypeMapping());
      } catch (Exception e) {
        throw new RuntimeException("Failed to initialize service type mappings", e);
      }
      
      // Set the type mappings reference if another thread has not preempted this thread.
      SERVICE_TYPE_MAPPINGS_REF.compareAndSet(null, mappings.build());
    }
    
    return SERVICE_TYPE_MAPPINGS_REF.get();
  }
}

