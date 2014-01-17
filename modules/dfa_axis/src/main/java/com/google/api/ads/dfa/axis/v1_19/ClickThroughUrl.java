/**
 * ClickThroughUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class ClickThroughUrl  implements java.io.Serializable {
    private java.lang.String customClickThroughUrl;

    private boolean defaultLandingPageUsed;

    private long landingPageId;

    public ClickThroughUrl() {
    }

    public ClickThroughUrl(
           java.lang.String customClickThroughUrl,
           boolean defaultLandingPageUsed,
           long landingPageId) {
           this.customClickThroughUrl = customClickThroughUrl;
           this.defaultLandingPageUsed = defaultLandingPageUsed;
           this.landingPageId = landingPageId;
    }


    /**
     * Gets the customClickThroughUrl value for this ClickThroughUrl.
     * 
     * @return customClickThroughUrl
     */
    public java.lang.String getCustomClickThroughUrl() {
        return customClickThroughUrl;
    }


    /**
     * Sets the customClickThroughUrl value for this ClickThroughUrl.
     * 
     * @param customClickThroughUrl
     */
    public void setCustomClickThroughUrl(java.lang.String customClickThroughUrl) {
        this.customClickThroughUrl = customClickThroughUrl;
    }


    /**
     * Gets the defaultLandingPageUsed value for this ClickThroughUrl.
     * 
     * @return defaultLandingPageUsed
     */
    public boolean isDefaultLandingPageUsed() {
        return defaultLandingPageUsed;
    }


    /**
     * Sets the defaultLandingPageUsed value for this ClickThroughUrl.
     * 
     * @param defaultLandingPageUsed
     */
    public void setDefaultLandingPageUsed(boolean defaultLandingPageUsed) {
        this.defaultLandingPageUsed = defaultLandingPageUsed;
    }


    /**
     * Gets the landingPageId value for this ClickThroughUrl.
     * 
     * @return landingPageId
     */
    public long getLandingPageId() {
        return landingPageId;
    }


    /**
     * Sets the landingPageId value for this ClickThroughUrl.
     * 
     * @param landingPageId
     */
    public void setLandingPageId(long landingPageId) {
        this.landingPageId = landingPageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClickThroughUrl)) return false;
        ClickThroughUrl other = (ClickThroughUrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customClickThroughUrl==null && other.getCustomClickThroughUrl()==null) || 
             (this.customClickThroughUrl!=null &&
              this.customClickThroughUrl.equals(other.getCustomClickThroughUrl()))) &&
            this.defaultLandingPageUsed == other.isDefaultLandingPageUsed() &&
            this.landingPageId == other.getLandingPageId();
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
        if (getCustomClickThroughUrl() != null) {
            _hashCode += getCustomClickThroughUrl().hashCode();
        }
        _hashCode += (isDefaultLandingPageUsed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getLandingPageId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClickThroughUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ClickThroughUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customClickThroughUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customClickThroughUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultLandingPageUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultLandingPageUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "landingPageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
