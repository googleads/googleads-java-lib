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

package com.google.api.ads.adwords.axis.utils.v201802.batchjob;

import com.google.api.ads.adwords.axis.utils.AxisDeserializer;
import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.BatchJob;
import com.google.api.ads.adwords.axis.v201802.cm.BatchJobOpsServiceSoapBindingStub;
import com.google.api.ads.adwords.axis.v201802.cm.Operand;
import com.google.api.ads.adwords.axis.v201802.cm.Operation;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import java.net.URI;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import org.apache.axis.client.Call;
import org.apache.axis.encoding.TypeMapping;

/** Utility for uploading operations and downloading results for a {@link BatchJob}. */
class BatchJobHelperImpl
    implements BatchJobHelperInterface<
        Operation, Operand, ApiError, MutateResult, BatchJobMutateResponse> {
  private final BatchJobUploader uploader;
  private final BatchJobLogger batchJobLogger;
  private final QName resultQName;

  @Inject
  BatchJobHelperImpl(BatchJobUploader uploader, BatchJobLogger batchJobLogger) {
    this.uploader = uploader;
    this.batchJobLogger = batchJobLogger;
    resultQName = new QName("https://adwords.google.com/api/adwords/cm/v201802", "MutateResult");
  }

  @Override
  public BatchJobUploadResponse uploadBatchJobOperations(Iterable<Operation> operations,
      String uploadUrl) throws BatchJobException {
    // All uploads must go through the incremental upload workflow.
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
    /*
     * Deserialize using the generated cm.MutateResult class instead of the batchjob.MutateResult
     * class. The MutateResult and ErrorList types in the batchjob package have properties defined
     * in the BatchJobMutateResultInterface and BatchJobErrorListInterface interfaces, respectively.
     * On some Hotspot JVMs, if java.beans.Introspector (used by Axis) encounters a property
     * defined via an implemented interface, it will return a PropertyDescriptor where
     * getPropertType() returns the interface class instead of the type declared in the
     * implementing class (e.g., BatchJobErrorListInterface instead of ErrorList). This causes
     * problems during Axis deserialization because Axis relies on the presence of a static
     * getTypeDesc method on each property it encounters.
     */
    List<com.google.api.ads.adwords.axis.v201802.cm.MutateResult> cmMutateResults;
    try {
      cmMutateResults =
          deserializer.deserializeBatchJobMutateResults(
              new URL(downloadUrl),
              getServiceTypeMappings(),
              com.google.api.ads.adwords.axis.v201802.cm.MutateResult.class,
              resultQName);
    } catch (Exception e) {
      batchJobLogger.logDownload(downloadUrl, null, e);
      throw new BatchJobException(
          "Failed to download batch job mutate response from URL: " + downloadUrl, e);
    }

    // Translate the cm.MutateResults into batchjob.MutateResults.
    BatchJobMutateResponse response = new BatchJobMutateResponse();
    List<MutateResult> mutateResults = Lists.newArrayList();
    for (com.google.api.ads.adwords.axis.v201802.cm.MutateResult cmMutateResult : cmMutateResults) {
      MutateResult mutateResult = new MutateResult();
      mutateResult.setIndex(cmMutateResult.getIndex());
      mutateResult.setOperand(cmMutateResult.getResult());
      if (cmMutateResult.getErrorList() != null) {
        mutateResult.setErrorList(new ErrorList());
        if (cmMutateResult.getErrorList().getErrors() != null) {
          mutateResult.getErrorList().setErrors(cmMutateResult.getErrorList().getErrors());
        }
      }
      mutateResults.add(mutateResult);
    }
    response.setMutateResults(mutateResults.toArray(new MutateResult[mutateResults.size()]));

    batchJobLogger.logDownload(downloadUrl, response, null);
    return response;
  }

  /**
   * Returns all of the service type mappings required to serialize/deserialize Axis objects.
   */
  static List<TypeMapping> getServiceTypeMappings() {
    // Build the list of type mappings based on BatchJobOpsService for this version of the API.
    ImmutableList.Builder<TypeMapping> mappings = ImmutableList.builder();

    try {
      mappings.add(
          new BatchJobOpsServiceSoapBindingStub() {
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

    return mappings.build();
  }
}

