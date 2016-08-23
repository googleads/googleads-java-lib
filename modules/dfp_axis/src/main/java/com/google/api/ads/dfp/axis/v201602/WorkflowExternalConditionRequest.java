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

/**
 * WorkflowExternalConditionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;


/**
 * A {@code WorkflowExternalConditionRequest} represents a workflow
 * condition that requires external
 *             system to determine the result.
 */
public class WorkflowExternalConditionRequest  extends com.google.api.ads.dfp.axis.v201602.WorkflowRequest  implements java.io.Serializable {
    /* The status of the {@code WorkflowExternalConditionRequest}.
     * This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201602.WorkflowExternalConditionStatus status;

    public WorkflowExternalConditionRequest() {
    }

    public WorkflowExternalConditionRequest(
           java.lang.Long id,
           java.lang.String workflowRuleName,
           java.lang.Long entityId,
           com.google.api.ads.dfp.axis.v201602.WorkflowEntityType entityType,
           com.google.api.ads.dfp.axis.v201602.WorkflowRequestType type,
           com.google.api.ads.dfp.axis.v201602.WorkflowExternalConditionStatus status) {
        super(
            id,
            workflowRuleName,
            entityId,
            entityType,
            type);
        this.status = status;
    }


    /**
     * Gets the status value for this WorkflowExternalConditionRequest.
     * 
     * @return status   * The status of the {@code WorkflowExternalConditionRequest}.
     * This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201602.WorkflowExternalConditionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WorkflowExternalConditionRequest.
     * 
     * @param status   * The status of the {@code WorkflowExternalConditionRequest}.
     * This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201602.WorkflowExternalConditionStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowExternalConditionRequest)) return false;
        WorkflowExternalConditionRequest other = (WorkflowExternalConditionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowExternalConditionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "WorkflowExternalConditionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201602", "WorkflowExternalConditionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
