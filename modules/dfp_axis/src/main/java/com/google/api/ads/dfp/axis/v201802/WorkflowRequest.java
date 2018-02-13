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
 * WorkflowRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code WorkflowRequest} represents a workflow action unit that
 * requires external or manual
 *             interference.
 */
public abstract class WorkflowRequest  implements java.io.Serializable {
    /* The unique ID of the workflow request. This attribute is readonly
     * and is assigned by Google. */
    private java.lang.Long id;

    /* The name of the workflow rule that generated the request. This
     * attribute is readonly and is
     *                 assigned by Google. */
    private java.lang.String workflowRuleName;

    /* The ID of entity associated to this workflow request. */
    private java.lang.Long entityId;

    /* The {@link WorkflowEntityType} associated to this workflow
     * request. */
    private com.google.api.ads.dfp.axis.v201802.WorkflowEntityType entityType;

    /* The {@link WorkflowRequestType} of this workflow request. This
     * attribute is readonly and is
     *                 assigned by Google. */
    private com.google.api.ads.dfp.axis.v201802.WorkflowRequestType type;

    public WorkflowRequest() {
    }

    public WorkflowRequest(
           java.lang.Long id,
           java.lang.String workflowRuleName,
           java.lang.Long entityId,
           com.google.api.ads.dfp.axis.v201802.WorkflowEntityType entityType,
           com.google.api.ads.dfp.axis.v201802.WorkflowRequestType type) {
           this.id = id;
           this.workflowRuleName = workflowRuleName;
           this.entityId = entityId;
           this.entityType = entityType;
           this.type = type;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("entityId", getEntityId())
            .add("entityType", getEntityType())
            .add("id", getId())
            .add("type", getType())
            .add("workflowRuleName", getWorkflowRuleName())
            .toString();
    }

    /**
     * Gets the id value for this WorkflowRequest.
     * 
     * @return id   * The unique ID of the workflow request. This attribute is readonly
     * and is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this WorkflowRequest.
     * 
     * @param id   * The unique ID of the workflow request. This attribute is readonly
     * and is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the workflowRuleName value for this WorkflowRequest.
     * 
     * @return workflowRuleName   * The name of the workflow rule that generated the request. This
     * attribute is readonly and is
     *                 assigned by Google.
     */
    public java.lang.String getWorkflowRuleName() {
        return workflowRuleName;
    }


    /**
     * Sets the workflowRuleName value for this WorkflowRequest.
     * 
     * @param workflowRuleName   * The name of the workflow rule that generated the request. This
     * attribute is readonly and is
     *                 assigned by Google.
     */
    public void setWorkflowRuleName(java.lang.String workflowRuleName) {
        this.workflowRuleName = workflowRuleName;
    }


    /**
     * Gets the entityId value for this WorkflowRequest.
     * 
     * @return entityId   * The ID of entity associated to this workflow request.
     */
    public java.lang.Long getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this WorkflowRequest.
     * 
     * @param entityId   * The ID of entity associated to this workflow request.
     */
    public void setEntityId(java.lang.Long entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the entityType value for this WorkflowRequest.
     * 
     * @return entityType   * The {@link WorkflowEntityType} associated to this workflow
     * request.
     */
    public com.google.api.ads.dfp.axis.v201802.WorkflowEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this WorkflowRequest.
     * 
     * @param entityType   * The {@link WorkflowEntityType} associated to this workflow
     * request.
     */
    public void setEntityType(com.google.api.ads.dfp.axis.v201802.WorkflowEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the type value for this WorkflowRequest.
     * 
     * @return type   * The {@link WorkflowRequestType} of this workflow request. This
     * attribute is readonly and is
     *                 assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.WorkflowRequestType getType() {
        return type;
    }


    /**
     * Sets the type value for this WorkflowRequest.
     * 
     * @param type   * The {@link WorkflowRequestType} of this workflow request. This
     * attribute is readonly and is
     *                 assigned by Google.
     */
    public void setType(com.google.api.ads.dfp.axis.v201802.WorkflowRequestType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowRequest)) return false;
        WorkflowRequest other = (WorkflowRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.workflowRuleName==null && other.getWorkflowRuleName()==null) || 
             (this.workflowRuleName!=null &&
              this.workflowRuleName.equals(other.getWorkflowRuleName()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getWorkflowRuleName() != null) {
            _hashCode += getWorkflowRuleName().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "workflowRuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "WorkflowRequestType"));
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
