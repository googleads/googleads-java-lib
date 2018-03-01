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

import com.google.api.ads.adwords.axis.utils.AxisBatchJobUploadBodyProvider;
import com.google.api.ads.adwords.axis.v201802.cm.BatchJob;
import com.google.api.ads.adwords.axis.v201802.cm.Operation;
import com.google.api.ads.adwords.lib.utils.BatchJobMutateRequestInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadBodyProvider;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.TypeMapping;

/**
 * A request containing operations for a {@link BatchJob}.
 */
@VisibleForTesting
public class BatchJobMutateRequest implements BatchJobMutateRequestInterface {
  private List<Operation> operations = Lists.newArrayList();

  private static final org.apache.axis.description.TypeDesc TYPE_DESC =
      new org.apache.axis.description.TypeDesc(BatchJobMutateRequest.class, true);

  static {
    TYPE_DESC.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "mutate"));
    org.apache.axis.description.ElementDesc elemField =
        new org.apache.axis.description.ElementDesc();

    elemField.setFieldName("operations");
    elemField.setXmlName(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "operations"));
    elemField.setXmlType(new javax.xml.namespace.QName(
        "https://adwords.google.com/api/adwords/cm/v201802", "Operation"));
    elemField.setMinOccurs(0);
    elemField.setMaxOccursUnbounded(true);
    elemField.setNillable(false);
    TYPE_DESC.addFieldDesc(elemField);
  }

  @Override
  public BatchJobUploadBodyProvider createBatchJobUploadBodyProvider() {
    Set<String> namespaceUris = Sets.newHashSet();
    for (TypeMapping typeMapping : BatchJobHelperImpl.getServiceTypeMappings()) {
      for (Class<?> clazz : typeMapping.getAllClasses()) {
        QName qName = typeMapping.getTypeQName(clazz);
        if (qName != null) {
          namespaceUris.add(qName.getNamespaceURI());
        }
      }
    }
    return new AxisBatchJobUploadBodyProvider(namespaceUris);
  }

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
  
  /**
   * Returns the type descriptor for this type.
   */
  public static org.apache.axis.description.TypeDesc getTypeDesc() {
    return TYPE_DESC;
  }

  /**
   * Returns the Axis serializer for this object.
   */
  public static Serializer getSerializer(@SuppressWarnings("unused")
      java.lang.String mechType,
      java.lang.Class<BatchJobMutateRequest> javaType, javax.xml.namespace.QName xmlType) {
    return new org.apache.axis.encoding.ser.BeanSerializer(javaType, xmlType, TYPE_DESC);
  }

  /**
   * Returns the Axis deserializer for this object.
   */
  public static Deserializer getDeserializer(@SuppressWarnings("unused")
      java.lang.String mechType,
      java.lang.Class<BatchJobMutateRequest> javaType, javax.xml.namespace.QName xmlType) {
    return new org.apache.axis.encoding.ser.BeanDeserializer(javaType, xmlType, TYPE_DESC);
  }
}
