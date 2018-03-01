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

import com.google.api.ads.adwords.axis.v201802.cm.ApiError;
import com.google.api.ads.adwords.axis.v201802.cm.Operand;
import com.google.api.ads.adwords.axis.v201802.cm.Operation;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface;
import java.io.Serializable;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;

/**
 * The result for a single operation submitted to a batch job.
 */
public class MutateResult
    implements Serializable, BatchJobMutateResultInterface<Operand, ApiError> {
  private Long index;
  private Operand operand;
  private ErrorList errorList;

  private static final org.apache.axis.description.TypeDesc TYPE_DESC =
      new org.apache.axis.description.TypeDesc(MutateResult.class, true);

  static {
    TYPE_DESC.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "MutateResult"));

    ElementDesc resultElemDesc = new ElementDesc();

    resultElemDesc.setFieldName("operand");
    resultElemDesc.setXmlName(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "result"));
    resultElemDesc.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "Operand"));
    resultElemDesc.setMinOccurs(0);
    resultElemDesc.setNillable(false);
    TYPE_DESC.addFieldDesc(resultElemDesc);

    ElementDesc errorsElemDesc = new ElementDesc();

    errorsElemDesc.setFieldName("errorList");
    errorsElemDesc.setXmlName(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "errorList"));
    errorsElemDesc.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "ErrorList"));
    errorsElemDesc.setMinOccurs(0);
    errorsElemDesc.setNillable(false);
    TYPE_DESC.addFieldDesc(errorsElemDesc);

    ElementDesc indexElemDesc = new ElementDesc();

    indexElemDesc.setFieldName("index");
    indexElemDesc.setXmlName(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "index"));
    indexElemDesc.setXmlType(
        new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
    indexElemDesc.setMinOccurs(0);
    indexElemDesc.setNillable(false);
    TYPE_DESC.addFieldDesc(indexElemDesc);
  }

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

  /**
   * Returns the type descriptor for this type.
   */
  public static org.apache.axis.description.TypeDesc getTypeDesc() {
    return TYPE_DESC;
  }

  /**
   * Returns the Axis serializer for this object.
   */
  public static Serializer getSerializer(@SuppressWarnings("unused") java.lang.String mechType,
      java.lang.Class<? extends Operation> javaType, javax.xml.namespace.QName xmlType) {
    return new org.apache.axis.encoding.ser.BeanSerializer(javaType, xmlType, TYPE_DESC);
  }

  /**
   * Returns the Axis deserializer for this object.
   */
  public static Deserializer getDeserializer(@SuppressWarnings("unused") java.lang.String mechType,
      java.lang.Class<? extends Operation> javaType, javax.xml.namespace.QName xmlType) {
    return new org.apache.axis.encoding.ser.BeanDeserializer(javaType, xmlType, TYPE_DESC);
  }
}
