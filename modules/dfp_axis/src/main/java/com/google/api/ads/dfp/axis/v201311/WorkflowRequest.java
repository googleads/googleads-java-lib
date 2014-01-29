/**
 * WorkflowRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


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
    private com.google.api.ads.dfp.axis.v201311.WorkflowEntityType entityType;

    /* Indicates that this instance is a subtype of WorkflowRequest.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String workflowRequestType;

    public WorkflowRequest() {
    }

    public WorkflowRequest(
           java.lang.Long id,
           java.lang.String workflowRuleName,
           java.lang.Long entityId,
           com.google.api.ads.dfp.axis.v201311.WorkflowEntityType entityType,
           java.lang.String workflowRequestType) {
           this.id = id;
           this.workflowRuleName = workflowRuleName;
           this.entityId = entityId;
           this.entityType = entityType;
           this.workflowRequestType = workflowRequestType;
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
    public com.google.api.ads.dfp.axis.v201311.WorkflowEntityType getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this WorkflowRequest.
     * 
     * @param entityType   * The {@link WorkflowEntityType} associated to this workflow
     * request.
     */
    public void setEntityType(com.google.api.ads.dfp.axis.v201311.WorkflowEntityType entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the workflowRequestType value for this WorkflowRequest.
     * 
     * @return workflowRequestType   * Indicates that this instance is a subtype of WorkflowRequest.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getWorkflowRequestType() {
        return workflowRequestType;
    }


    /**
     * Sets the workflowRequestType value for this WorkflowRequest.
     * 
     * @param workflowRequestType   * Indicates that this instance is a subtype of WorkflowRequest.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setWorkflowRequestType(java.lang.String workflowRequestType) {
        this.workflowRequestType = workflowRequestType;
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
            ((this.workflowRequestType==null && other.getWorkflowRequestType()==null) || 
             (this.workflowRequestType!=null &&
              this.workflowRequestType.equals(other.getWorkflowRequestType())));
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
        if (getWorkflowRequestType() != null) {
            _hashCode += getWorkflowRequestType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRuleName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "workflowRuleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "entityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowRequest.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
