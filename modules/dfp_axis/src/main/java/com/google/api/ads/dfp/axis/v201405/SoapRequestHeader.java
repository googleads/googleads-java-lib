/**
 * SoapRequestHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * Represents the SOAP request header used by API requests.
 */
public class SoapRequestHeader  implements java.io.Serializable {
    /* The network code to use in the context of a request. */
    private java.lang.String networkCode;

    /* The name of client library application. */
    private java.lang.String applicationName;

    /* The credentials used to authenticate the request. */
    private com.google.api.ads.dfp.axis.v201405.Authentication authentication;

    public SoapRequestHeader() {
    }

    public SoapRequestHeader(
           java.lang.String networkCode,
           java.lang.String applicationName,
           com.google.api.ads.dfp.axis.v201405.Authentication authentication) {
           this.networkCode = networkCode;
           this.applicationName = applicationName;
           this.authentication = authentication;
    }


    /**
     * Gets the networkCode value for this SoapRequestHeader.
     * 
     * @return networkCode   * The network code to use in the context of a request.
     */
    public java.lang.String getNetworkCode() {
        return networkCode;
    }


    /**
     * Sets the networkCode value for this SoapRequestHeader.
     * 
     * @param networkCode   * The network code to use in the context of a request.
     */
    public void setNetworkCode(java.lang.String networkCode) {
        this.networkCode = networkCode;
    }


    /**
     * Gets the applicationName value for this SoapRequestHeader.
     * 
     * @return applicationName   * The name of client library application.
     */
    public java.lang.String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this SoapRequestHeader.
     * 
     * @param applicationName   * The name of client library application.
     */
    public void setApplicationName(java.lang.String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the authentication value for this SoapRequestHeader.
     * 
     * @return authentication   * The credentials used to authenticate the request.
     */
    public com.google.api.ads.dfp.axis.v201405.Authentication getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this SoapRequestHeader.
     * 
     * @param authentication   * The credentials used to authenticate the request.
     */
    public void setAuthentication(com.google.api.ads.dfp.axis.v201405.Authentication authentication) {
        this.authentication = authentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapRequestHeader)) return false;
        SoapRequestHeader other = (SoapRequestHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.networkCode==null && other.getNetworkCode()==null) || 
             (this.networkCode!=null &&
              this.networkCode.equals(other.getNetworkCode()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication())));
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
        if (getNetworkCode() != null) {
            _hashCode += getNetworkCode().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapRequestHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "SoapRequestHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "networkCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "applicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Authentication"));
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
