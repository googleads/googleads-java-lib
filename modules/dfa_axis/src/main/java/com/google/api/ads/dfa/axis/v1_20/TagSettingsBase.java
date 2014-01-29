/**
 * TagSettingsBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class TagSettingsBase  implements java.io.Serializable {
    private java.lang.String additionalKeyValues;

    private boolean includeClickTrackingStringInTags;

    private int keywordHandlingOption;

    public TagSettingsBase() {
    }

    public TagSettingsBase(
           java.lang.String additionalKeyValues,
           boolean includeClickTrackingStringInTags,
           int keywordHandlingOption) {
           this.additionalKeyValues = additionalKeyValues;
           this.includeClickTrackingStringInTags = includeClickTrackingStringInTags;
           this.keywordHandlingOption = keywordHandlingOption;
    }


    /**
     * Gets the additionalKeyValues value for this TagSettingsBase.
     * 
     * @return additionalKeyValues
     */
    public java.lang.String getAdditionalKeyValues() {
        return additionalKeyValues;
    }


    /**
     * Sets the additionalKeyValues value for this TagSettingsBase.
     * 
     * @param additionalKeyValues
     */
    public void setAdditionalKeyValues(java.lang.String additionalKeyValues) {
        this.additionalKeyValues = additionalKeyValues;
    }


    /**
     * Gets the includeClickTrackingStringInTags value for this TagSettingsBase.
     * 
     * @return includeClickTrackingStringInTags
     */
    public boolean isIncludeClickTrackingStringInTags() {
        return includeClickTrackingStringInTags;
    }


    /**
     * Sets the includeClickTrackingStringInTags value for this TagSettingsBase.
     * 
     * @param includeClickTrackingStringInTags
     */
    public void setIncludeClickTrackingStringInTags(boolean includeClickTrackingStringInTags) {
        this.includeClickTrackingStringInTags = includeClickTrackingStringInTags;
    }


    /**
     * Gets the keywordHandlingOption value for this TagSettingsBase.
     * 
     * @return keywordHandlingOption
     */
    public int getKeywordHandlingOption() {
        return keywordHandlingOption;
    }


    /**
     * Sets the keywordHandlingOption value for this TagSettingsBase.
     * 
     * @param keywordHandlingOption
     */
    public void setKeywordHandlingOption(int keywordHandlingOption) {
        this.keywordHandlingOption = keywordHandlingOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TagSettingsBase)) return false;
        TagSettingsBase other = (TagSettingsBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalKeyValues==null && other.getAdditionalKeyValues()==null) || 
             (this.additionalKeyValues!=null &&
              this.additionalKeyValues.equals(other.getAdditionalKeyValues()))) &&
            this.includeClickTrackingStringInTags == other.isIncludeClickTrackingStringInTags() &&
            this.keywordHandlingOption == other.getKeywordHandlingOption();
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
        if (getAdditionalKeyValues() != null) {
            _hashCode += getAdditionalKeyValues().hashCode();
        }
        _hashCode += (isIncludeClickTrackingStringInTags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getKeywordHandlingOption();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TagSettingsBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "TagSettingsBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalKeyValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalKeyValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeClickTrackingStringInTags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includeClickTrackingStringInTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordHandlingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keywordHandlingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
