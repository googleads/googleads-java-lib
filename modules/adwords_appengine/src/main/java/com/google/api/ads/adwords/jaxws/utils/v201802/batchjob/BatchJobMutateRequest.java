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

package com.google.api.ads.adwords.jaxws.utils.v201802.batchjob;

import com.google.api.ads.adwords.jaxws.utils.JaxWsBatchJobUploadBodyProvider;
import com.google.api.ads.adwords.jaxws.v201802.cm.Operation;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadBodyProvider;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * JAX-WS implementation of {@link BatchJobMutateRequestInterface}.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mutate", propOrder = {
    "operations",
})
public class BatchJobMutateRequest implements BatchJobMutateRequestInterface {
  private List<Operation> operations = Lists.newArrayList();

  public Operation[] getOperations() {
    return operations.toArray(new Operation[operations.size()]);
  }

  public void addOperation(Operation op) {
    this.operations.add(Preconditions.checkNotNull(op, "Null operation"));
  }

  public <O extends Operation> void addOperations(Iterable<O> operations) {
    for (Operation operation : operations) {
      addOperation(operation);
    }
  }

  public void setOperations(Operation[] operations) {
    this.operations.clear();
    this.operations.addAll(Lists.newArrayList(operations));
  }

  @Override
  public BatchJobUploadBodyProvider createBatchJobUploadBodyProvider() {
    return new JaxWsBatchJobUploadBodyProvider<BatchJobMutateRequest>("v201802",
        BatchJobMutateRequest.class);
  }

}
