/**
 * WorkflowRequestAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201311;


/**
 * Represents the actions that can be performed on {@link WorkflowRequest}
 * objects.
 */
public abstract class WorkflowRequestAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of WorkflowRequestAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String workflowRequestActionType;

    public WorkflowRequestAction() {
    }

    public WorkflowRequestAction(
           java.lang.String workflowRequestActionType) {
           this.workflowRequestActionType = workflowRequestActionType;
    }


    /**
     * Gets the workflowRequestActionType value for this WorkflowRequestAction.
     * 
     * @return workflowRequestActionType   * Indicates that this instance is a subtype of WorkflowRequestAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getWorkflowRequestActionType() {
        return workflowRequestActionType;
    }


    /**
     * Sets the workflowRequestActionType value for this WorkflowRequestAction.
     * 
     * @param workflowRequestActionType   * Indicates that this instance is a subtype of WorkflowRequestAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setWorkflowRequestActionType(java.lang.String workflowRequestActionType) {
        this.workflowRequestActionType = workflowRequestActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowRequestAction)) return false;
        WorkflowRequestAction other = (WorkflowRequestAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.workflowRequestActionType==null && other.getWorkflowRequestActionType()==null) || 
             (this.workflowRequestActionType!=null &&
              this.workflowRequestActionType.equals(other.getWorkflowRequestActionType())));
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
        if (getWorkflowRequestActionType() != null) {
            _hashCode += getWorkflowRequestActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowRequestAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowRequestAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowRequestActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowRequestAction.Type"));
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
