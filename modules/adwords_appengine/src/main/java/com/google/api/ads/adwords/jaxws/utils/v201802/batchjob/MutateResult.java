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
import com.google.api.ads.adwords.jaxws.v201802.cm.Operand;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The result for a single operation submitted to a batch job.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MutateResult", propOrder = {"operand", "errorList", "index"})
public class MutateResult
    implements Serializable, BatchJobMutateResultInterface<Operand, ApiError> {
  private Long index;

  @XmlElement(name = "result")
  private Operand operand;
  private ErrorList errorList;

  @Override
  public Operand getOperand() {
    return operand;
  }

  public void setOperand(Operand operand) {
    this.operand = operand;
  }

  @Override
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  @Override
  public ErrorList getErrorList() {
    return errorList;
  }

  public void setErrorList(ErrorList errorList) {
    this.errorList = errorList;
  }
}
