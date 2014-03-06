/**
 * BrowserVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class BrowserVersion  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.Browser browser;

    private int majorVersion;

    private java.lang.String minorVersion;

    public BrowserVersion() {
    }

    public BrowserVersion(
           com.google.api.ads.dfa.axis.v1_20.Browser browser,
           int majorVersion,
           java.lang.String minorVersion) {
           this.browser = browser;
           this.majorVersion = majorVersion;
           this.minorVersion = minorVersion;
    }


    /**
     * Gets the browser value for this BrowserVersion.
     * 
     * @return browser
     */
    public com.google.api.ads.dfa.axis.v1_20.Browser getBrowser() {
        return browser;
    }


    /**
     * Sets the browser value for this BrowserVersion.
     * 
     * @param browser
     */
    public void setBrowser(com.google.api.ads.dfa.axis.v1_20.Browser browser) {
        this.browser = browser;
    }


    /**
     * Gets the majorVersion value for this BrowserVersion.
     * 
     * @return majorVersion
     */
    public int getMajorVersion() {
        return majorVersion;
    }


    /**
     * Sets the majorVersion value for this BrowserVersion.
     * 
     * @param majorVersion
     */
    public void setMajorVersion(int majorVersion) {
        this.majorVersion = majorVersion;
    }


    /**
     * Gets the minorVersion value for this BrowserVersion.
     * 
     * @return minorVersion
     */
    public java.lang.String getMinorVersion() {
        return minorVersion;
    }


    /**
     * Sets the minorVersion value for this BrowserVersion.
     * 
     * @param minorVersion
     */
    public void setMinorVersion(java.lang.String minorVersion) {
        this.minorVersion = minorVersion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowserVersion)) return false;
        BrowserVersion other = (BrowserVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.browser==null && other.getBrowser()==null) || 
             (this.browser!=null &&
              this.browser.equals(other.getBrowser()))) &&
            this.majorVersion == other.getMajorVersion() &&
            ((this.minorVersion==null && other.getMinorVersion()==null) || 
             (this.minorVersion!=null &&
              this.minorVersion.equals(other.getMinorVersion())));
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
        if (getBrowser() != null) {
            _hashCode += getBrowser().hashCode();
        }
        _hashCode += getMajorVersion();
        if (getMinorVersion() != null) {
            _hashCode += getMinorVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrowserVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "BrowserVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "browser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "Browser"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("majorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "majorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minorVersion"));
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
