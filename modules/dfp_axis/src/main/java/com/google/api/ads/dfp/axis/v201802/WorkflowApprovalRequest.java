// Copyright 2018 Google Inc. All Rights Reserved.
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
 * WorkflowApprovalRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code WorkflowApprovalRequest} represents a workflow action
 * unit that requires user approval.
 */
public class WorkflowApprovalRequest  extends com.google.api.ads.dfp.axis.v201802.WorkflowRequest  implements java.io.Serializable {
    /* The status of the {@code WorkflowApprovalRequest}. This attribute
     * is readonly. */
    private com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus status;

    public WorkflowApprovalRequest() {
    }

    public WorkflowApprovalRequest(
           java.lang.Long id,
           java.lang.String workflowRuleName,
           java.lang.Long entityId,
           com.google.api.ads.dfp.axis.v201802.WorkflowEntityType entityType,
           com.google.api.ads.dfp.axis.v201802.WorkflowRequestType type,
           com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus status) {
        super(
            id,
            workflowRuleName,
            entityId,
            entityType,
            type);
        this.status = status;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("entityId", getEntityId())
            .add("entityType", getEntityType())
            .add("id", getId())
            .add("status", getStatus())
            .add("type", getType())
            .add("workflowRuleName", getWorkflowRuleName())
            .toString();
    }

    /**
     * Gets the status value for this WorkflowApprovalRequest.
     * 
     * @return status   * The status of the {@code WorkflowApprovalRequest}. This attribute
     * is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this WorkflowApprovalRequest.
     * 
     * @param status   * The status of the {@code WorkflowApprovalRequest}. This attribute
     * is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.WorkflowApprovalRequestStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowApprovalRequest)) return false;
        WorkflowApprovalRequest other = (WorkflowApprovalRequest) obj;
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
        new org.apache.axis.description.TypeDesc(WorkflowApprovalRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowApprovalRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowApprovalRequestStatus"));
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
