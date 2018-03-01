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
import com.google.api.ads.adwords.axis.v201802.cm.BatchJob;
import com.google.api.ads.adwords.axis.v201802.cm.Operand;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateResponseInterface;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;

/**
 * A response downloaded from a {@link BatchJob#getDownloadUrl()}.
 */
public class BatchJobMutateResponse
    implements BatchJobMutateResponseInterface<Operand, ApiError, MutateResult> {
  
  private MutateResult[] mutateResults;

  private static final org.apache.axis.description.TypeDesc TYPE_DESC =
      new org.apache.axis.description.TypeDesc(BatchJobMutateResponse.class, true);

  static {
    TYPE_DESC.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "mutateResponse"));
    org.apache.axis.description.ElementDesc elemField =
        new org.apache.axis.description.ElementDesc();

    elemField.setFieldName("mutateResults");
    elemField.setXmlName(
        new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "rval"));
    elemField.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "MutateResult"));
    elemField.setMinOccurs(0);
    elemField.setMaxOccursUnbounded(true);
    elemField.setNillable(false);
    TYPE_DESC.addFieldDesc(elemField);
  }

  @Override
  public MutateResult[] getMutateResults() {
    return mutateResults;
  }

  public void setMutateResults(MutateResult[] mutateResults) {
    this.mutateResults = mutateResults;
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
      java.lang.Class<BatchJobMutateResponse> javaType, javax.xml.namespace.QName xmlType) {
    return new org.apache.axis.encoding.ser.BeanSerializer(javaType, xmlType, TYPE_DESC);
  }

  /**
   * Returns the Axis deserializer for this object.
   */
  public static Deserializer getDeserializer(@SuppressWarnings("unused") java.lang.String mechType,
      java.lang.Class<BatchJobMutateResponse> javaType, javax.xml.namespace.QName xmlType) {
    return new org.apache.axis.encoding.ser.BeanDeserializer(javaType, xmlType, TYPE_DESC);
  }
}
