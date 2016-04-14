/**
 * ApiError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.ddp.axis.v201603.dmp;


/**
 * The API error base class that provides details about an error that
 * occurred
 *                         while processing a service request.
 * 
 *                         <p>The OGNL field path is provided for parsers
 * to identify the request data
 *                         element that may have caused the error.</p>
 */
public abstract class ApiError  implements java.io.Serializable {
    /* The OGNL field path to identify cause of error. */
    private java.lang.String fieldPath;

    /* The data that caused the error. */
    private java.lang.String trigger;

    /* A simple string representation of the error and reason. */
    private java.lang.String errorString;

    /* Indicates that this instance is a subtype of ApiError.
     *                                 Although this field is returned in
     * the response, it is ignored on input
     *                                 and cannot be selected. Specify xsi:type
     * instead. */
    private java.lang.String apiErrorType;

    public ApiError() {
    }

    public ApiError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType) {
           this.fieldPath = fieldPath;
           this.trigger = trigger;
           this.errorString = errorString;
           this.apiErrorType = apiErrorType;
    }


    /**
     * Gets the fieldPath value for this ApiError.
     * 
     * @return fieldPath   * The OGNL field path to identify cause of error.
     */
    public java.lang.String getFieldPath() {
        return fieldPath;
    }


    /**
     * Sets the fieldPath value for this ApiError.
     * 
     * @param fieldPath   * The OGNL field path to identify cause of error.
     */
    public void setFieldPath(java.lang.String fieldPath) {
        this.fieldPath = fieldPath;
    }


    /**
     * Gets the trigger value for this ApiError.
     * 
     * @return trigger   * The data that caused the error.
     */
    public java.lang.String getTrigger() {
        return trigger;
    }


    /**
     * Sets the trigger value for this ApiError.
     * 
     * @param trigger   * The data that caused the error.
     */
    public void setTrigger(java.lang.String trigger) {
        this.trigger = trigger;
    }


    /**
     * Gets the errorString value for this ApiError.
     * 
     * @return errorString   * A simple string representation of the error and reason.
     */
    public java.lang.String getErrorString() {
        return errorString;
    }


    /**
     * Sets the errorString value for this ApiError.
     * 
     * @param errorString   * A simple string representation of the error and reason.
     */
    public void setErrorString(java.lang.String errorString) {
        this.errorString = errorString;
    }


    /**
     * Gets the apiErrorType value for this ApiError.
     * 
     * @return apiErrorType   * Indicates that this instance is a subtype of ApiError.
     *                                 Although this field is returned in
     * the response, it is ignored on input
     *                                 and cannot be selected. Specify xsi:type
     * instead.
     */
    public java.lang.String getApiErrorType() {
        return apiErrorType;
    }


    /**
     * Sets the apiErrorType value for this ApiError.
     * 
     * @param apiErrorType   * Indicates that this instance is a subtype of ApiError.
     *                                 Although this field is returned in
     * the response, it is ignored on input
     *                                 and cannot be selected. Specify xsi:type
     * instead.
     */
    public void setApiErrorType(java.lang.String apiErrorType) {
        this.apiErrorType = apiErrorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiError)) return false;
        ApiError other = (ApiError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldPath==null && other.getFieldPath()==null) || 
             (this.fieldPath!=null &&
              this.fieldPath.equals(other.getFieldPath()))) &&
            ((this.trigger==null && other.getTrigger()==null) || 
             (this.trigger!=null &&
              this.trigger.equals(other.getTrigger()))) &&
            ((this.errorString==null && other.getErrorString()==null) || 
             (this.errorString!=null &&
              this.errorString.equals(other.getErrorString()))) &&
            ((this.apiErrorType==null && other.getApiErrorType()==null) || 
             (this.apiErrorType!=null &&
              this.apiErrorType.equals(other.getApiErrorType())));
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
        if (getFieldPath() != null) {
            _hashCode += getFieldPath().hashCode();
        }
        if (getTrigger() != null) {
            _hashCode += getTrigger().hashCode();
        }
        if (getErrorString() != null) {
            _hashCode += getErrorString().hashCode();
        }
        if (getApiErrorType() != null) {
            _hashCode += getApiErrorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "ApiError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldPath");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "fieldPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "errorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiErrorType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://ddp.googleapis.com/api/ddp/dmp/v201603", "ApiError.Type"));
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
