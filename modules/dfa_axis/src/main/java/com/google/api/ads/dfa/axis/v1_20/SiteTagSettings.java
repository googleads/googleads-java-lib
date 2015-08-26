/**
 * SiteTagSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class SiteTagSettings  extends com.google.api.ads.dfa.axis.v1_20.TagSettingsBase  implements java.io.Serializable {
    private java.lang.String keywordReferrer;

    public SiteTagSettings() {
    }

    public SiteTagSettings(
           java.lang.String additionalKeyValues,
           boolean includeClickTrackingStringInTags,
           int keywordHandlingOption,
           java.lang.String keywordReferrer) {
        super(
            additionalKeyValues,
            includeClickTrackingStringInTags,
            keywordHandlingOption);
        this.keywordReferrer = keywordReferrer;
    }


    /**
     * Gets the keywordReferrer value for this SiteTagSettings.
     * 
     * @return keywordReferrer
     */
    public java.lang.String getKeywordReferrer() {
        return keywordReferrer;
    }


    /**
     * Sets the keywordReferrer value for this SiteTagSettings.
     * 
     * @param keywordReferrer
     */
    public void setKeywordReferrer(java.lang.String keywordReferrer) {
        this.keywordReferrer = keywordReferrer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteTagSettings)) return false;
        SiteTagSettings other = (SiteTagSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keywordReferrer==null && other.getKeywordReferrer()==null) || 
             (this.keywordReferrer!=null &&
              this.keywordReferrer.equals(other.getKeywordReferrer())));
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
        if (getKeywordReferrer() != null) {
            _hashCode += getKeywordReferrer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteTagSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SiteTagSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordReferrer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keywordReferrer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
