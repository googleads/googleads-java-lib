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
import com.google.api.ads.adwords.axis.v201802.cm.Operation;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResultInterface.BatchJobErrorListInterface;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;

/**
 * The result for a single operation submitted to a batch job.
 */
public class ErrorList implements BatchJobErrorListInterface<ApiError> {
  private ApiError[] errors;

  private static final org.apache.axis.description.TypeDesc TYPE_DESC =
      new org.apache.axis.description.TypeDesc(ErrorList.class, true);

  static {
    TYPE_DESC.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "ErrorList"));

    ElementDesc errorsElemDesc = new ElementDesc();

    errorsElemDesc.setFieldName("errors");
    errorsElemDesc.setXmlName(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "errors"));
    errorsElemDesc.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "ApiError"));
    errorsElemDesc.setMinOccurs(0);
    errorsElemDesc.setNillable(false);
    TYPE_DESC.addFieldDesc(errorsElemDesc);
  }

  @Override
  public ApiError[] getErrors() {
    return errors;
  }

  public void setErrors(ApiError[] errors) {
    this.errors = errors;
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
