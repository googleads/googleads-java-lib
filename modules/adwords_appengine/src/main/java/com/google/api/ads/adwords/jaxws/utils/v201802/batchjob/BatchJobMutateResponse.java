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

import com.google.api.ads.adwords.jaxws.v201802.cm.ApiError;
import com.google.api.ads.adwords.jaxws.v201802.cm.BatchJob;
import com.google.api.ads.adwords.jaxws.v201802.cm.Operand;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResponseInterface;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * A response downloaded from a {@link BatchJob#getDownloadUrl()}.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "mutateResponse",
    propOrder = {
        "mutateResults",
    })
public class BatchJobMutateResponse
    implements BatchJobMutateResponseInterface<Operand, ApiError, MutateResult> {
  @XmlElement(name = "rval")
  private MutateResult[] mutateResults;

  @Override
  public MutateResult[] getMutateResults() {
    return mutateResults;
  }

  public void setMutateResults(MutateResult[] mutateResults) {
    this.mutateResults = mutateResults;
  }
}
