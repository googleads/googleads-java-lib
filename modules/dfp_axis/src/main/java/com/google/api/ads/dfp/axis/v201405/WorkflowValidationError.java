/**
 * WorkflowValidationError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * Lists all errors associated with workflow validation.
 */
public class WorkflowValidationError  extends com.google.api.ads.dfp.axis.v201405.ApiError  implements java.io.Serializable {
    /* The error reason represented by an enum. */
    private com.google.api.ads.dfp.axis.v201405.WorkflowValidationErrorReason reason;

    /* The error message defined by a network administrator to indicate
     * the cause of the error. It
     *                     describes how a workflow rule is violated, and
     * it is stored in the database. */
    private java.lang.String workflowErrorMessage;

    public WorkflowValidationError() {
    }

    public WorkflowValidationError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.dfp.axis.v201405.WorkflowValidationErrorReason reason,
           java.lang.String workflowErrorMessage) {
        super(
            fieldPath,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.workflowErrorMessage = workflowErrorMessage;
    }


    /**
     * Gets the reason value for this WorkflowValidationError.
     * 
     * @return reason   * The error reason represented by an enum.
     */
    public com.google.api.ads.dfp.axis.v201405.WorkflowValidationErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this WorkflowValidationError.
     * 
     * @param reason   * The error reason represented by an enum.
     */
    public void setReason(com.google.api.ads.dfp.axis.v201405.WorkflowValidationErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the workflowErrorMessage value for this WorkflowValidationError.
     * 
     * @return workflowErrorMessage   * The error message defined by a network administrator to indicate
     * the cause of the error. It
     *                     describes how a workflow rule is violated, and
     * it is stored in the database.
     */
    public java.lang.String getWorkflowErrorMessage() {
        return workflowErrorMessage;
    }


    /**
     * Sets the workflowErrorMessage value for this WorkflowValidationError.
     * 
     * @param workflowErrorMessage   * The error message defined by a network administrator to indicate
     * the cause of the error. It
     *                     describes how a workflow rule is violated, and
     * it is stored in the database.
     */
    public void setWorkflowErrorMessage(java.lang.String workflowErrorMessage) {
        this.workflowErrorMessage = workflowErrorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowValidationError)) return false;
        WorkflowValidationError other = (WorkflowValidationError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.workflowErrorMessage==null && other.getWorkflowErrorMessage()==null) || 
             (this.workflowErrorMessage!=null &&
              this.workflowErrorMessage.equals(other.getWorkflowErrorMessage())));
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
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getWorkflowErrorMessage() != null) {
            _hashCode += getWorkflowErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowValidationError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "WorkflowValidationError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "WorkflowValidationError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "workflowErrorMessage"));
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
