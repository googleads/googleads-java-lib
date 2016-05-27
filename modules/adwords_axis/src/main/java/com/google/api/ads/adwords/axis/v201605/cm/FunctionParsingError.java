/**
 * FunctionParsingError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * An error resulting from a failure to parse the textual representation
 * of a function.
 */
public class FunctionParsingError  extends com.google.api.ads.adwords.axis.v201605.cm.ApiError  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201605.cm.FunctionParsingErrorReason reason;

    private java.lang.String offendingText;

    private java.lang.Integer offendingTextIndex;

    public FunctionParsingError() {
    }

    public FunctionParsingError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.adwords.axis.v201605.cm.FunctionParsingErrorReason reason,
           java.lang.String offendingText,
           java.lang.Integer offendingTextIndex) {
        super(
            fieldPath,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
        this.offendingText = offendingText;
        this.offendingTextIndex = offendingTextIndex;
    }


    /**
     * Gets the reason value for this FunctionParsingError.
     * 
     * @return reason
     */
    public com.google.api.ads.adwords.axis.v201605.cm.FunctionParsingErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this FunctionParsingError.
     * 
     * @param reason
     */
    public void setReason(com.google.api.ads.adwords.axis.v201605.cm.FunctionParsingErrorReason reason) {
        this.reason = reason;
    }


    /**
     * Gets the offendingText value for this FunctionParsingError.
     * 
     * @return offendingText
     */
    public java.lang.String getOffendingText() {
        return offendingText;
    }


    /**
     * Sets the offendingText value for this FunctionParsingError.
     * 
     * @param offendingText
     */
    public void setOffendingText(java.lang.String offendingText) {
        this.offendingText = offendingText;
    }


    /**
     * Gets the offendingTextIndex value for this FunctionParsingError.
     * 
     * @return offendingTextIndex
     */
    public java.lang.Integer getOffendingTextIndex() {
        return offendingTextIndex;
    }


    /**
     * Sets the offendingTextIndex value for this FunctionParsingError.
     * 
     * @param offendingTextIndex
     */
    public void setOffendingTextIndex(java.lang.Integer offendingTextIndex) {
        this.offendingTextIndex = offendingTextIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FunctionParsingError)) return false;
        FunctionParsingError other = (FunctionParsingError) obj;
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
            ((this.offendingText==null && other.getOffendingText()==null) || 
             (this.offendingText!=null &&
              this.offendingText.equals(other.getOffendingText()))) &&
            ((this.offendingTextIndex==null && other.getOffendingTextIndex()==null) || 
             (this.offendingTextIndex!=null &&
              this.offendingTextIndex.equals(other.getOffendingTextIndex())));
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
        if (getOffendingText() != null) {
            _hashCode += getOffendingText().hashCode();
        }
        if (getOffendingTextIndex() != null) {
            _hashCode += getOffendingTextIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FunctionParsingError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FunctionParsingError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FunctionParsingError.Reason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offendingText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "offendingText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offendingTextIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "offendingTextIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
