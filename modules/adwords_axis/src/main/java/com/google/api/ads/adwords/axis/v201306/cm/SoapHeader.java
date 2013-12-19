/**
 * SoapHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Defines the required and optional elements within the header of
 * a SOAP request.
 */
public class SoapHeader  implements java.io.Serializable {
    /* Authentication token from Google ClientLogin API. Developers
     * need to authenticate themselves
     *                 with that API before they can send a request to AdWords
     * API. This header identifies either the
     *                 MCC manager acting on behalf of their client, or the
     * advertiser managing their own account. */
    private java.lang.String authToken;

    /* Optional header: the customer id of the client of the MCC manager.
     * Applicable only
     *                 if an MCC manager, as identified by authToken, is
     * acting on behalf of their client. */
    private java.lang.String clientCustomerId;

    /* Developer token to identify that the person making the call
     * has enough
     *                 quota. */
    private java.lang.String developerToken;

    /* UserAgent is used to track distribution of API client programs
     * and
     *                 application usage. The client is responsible for putting
     * in a meaningful
     *                 value for tracking purposes. To be clear this is not
     * the same as an HTTP
     *                 user agent. */
    private java.lang.String userAgent;

    /* Used to validate the request without executing it. */
    private java.lang.Boolean validateOnly;

    /* If true, API will try to commit as many error free operations
     * as possible and
     *                 report the other operations' errors.
     *                 
     *                 <p>Ignored for non-mutate calls. */
    private java.lang.Boolean partialFailure;

    public SoapHeader() {
    }

    public SoapHeader(
           java.lang.String authToken,
           java.lang.String clientCustomerId,
           java.lang.String developerToken,
           java.lang.String userAgent,
           java.lang.Boolean validateOnly,
           java.lang.Boolean partialFailure) {
           this.authToken = authToken;
           this.clientCustomerId = clientCustomerId;
           this.developerToken = developerToken;
           this.userAgent = userAgent;
           this.validateOnly = validateOnly;
           this.partialFailure = partialFailure;
    }


    /**
     * Gets the authToken value for this SoapHeader.
     * 
     * @return authToken   * Authentication token from Google ClientLogin API. Developers
     * need to authenticate themselves
     *                 with that API before they can send a request to AdWords
     * API. This header identifies either the
     *                 MCC manager acting on behalf of their client, or the
     * advertiser managing their own account.
     */
    public java.lang.String getAuthToken() {
        return authToken;
    }


    /**
     * Sets the authToken value for this SoapHeader.
     * 
     * @param authToken   * Authentication token from Google ClientLogin API. Developers
     * need to authenticate themselves
     *                 with that API before they can send a request to AdWords
     * API. This header identifies either the
     *                 MCC manager acting on behalf of their client, or the
     * advertiser managing their own account.
     */
    public void setAuthToken(java.lang.String authToken) {
        this.authToken = authToken;
    }


    /**
     * Gets the clientCustomerId value for this SoapHeader.
     * 
     * @return clientCustomerId   * Optional header: the customer id of the client of the MCC manager.
     * Applicable only
     *                 if an MCC manager, as identified by authToken, is
     * acting on behalf of their client.
     */
    public java.lang.String getClientCustomerId() {
        return clientCustomerId;
    }


    /**
     * Sets the clientCustomerId value for this SoapHeader.
     * 
     * @param clientCustomerId   * Optional header: the customer id of the client of the MCC manager.
     * Applicable only
     *                 if an MCC manager, as identified by authToken, is
     * acting on behalf of their client.
     */
    public void setClientCustomerId(java.lang.String clientCustomerId) {
        this.clientCustomerId = clientCustomerId;
    }


    /**
     * Gets the developerToken value for this SoapHeader.
     * 
     * @return developerToken   * Developer token to identify that the person making the call
     * has enough
     *                 quota.
     */
    public java.lang.String getDeveloperToken() {
        return developerToken;
    }


    /**
     * Sets the developerToken value for this SoapHeader.
     * 
     * @param developerToken   * Developer token to identify that the person making the call
     * has enough
     *                 quota.
     */
    public void setDeveloperToken(java.lang.String developerToken) {
        this.developerToken = developerToken;
    }


    /**
     * Gets the userAgent value for this SoapHeader.
     * 
     * @return userAgent   * UserAgent is used to track distribution of API client programs
     * and
     *                 application usage. The client is responsible for putting
     * in a meaningful
     *                 value for tracking purposes. To be clear this is not
     * the same as an HTTP
     *                 user agent.
     */
    public java.lang.String getUserAgent() {
        return userAgent;
    }


    /**
     * Sets the userAgent value for this SoapHeader.
     * 
     * @param userAgent   * UserAgent is used to track distribution of API client programs
     * and
     *                 application usage. The client is responsible for putting
     * in a meaningful
     *                 value for tracking purposes. To be clear this is not
     * the same as an HTTP
     *                 user agent.
     */
    public void setUserAgent(java.lang.String userAgent) {
        this.userAgent = userAgent;
    }


    /**
     * Gets the validateOnly value for this SoapHeader.
     * 
     * @return validateOnly   * Used to validate the request without executing it.
     */
    public java.lang.Boolean getValidateOnly() {
        return validateOnly;
    }


    /**
     * Sets the validateOnly value for this SoapHeader.
     * 
     * @param validateOnly   * Used to validate the request without executing it.
     */
    public void setValidateOnly(java.lang.Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }


    /**
     * Gets the partialFailure value for this SoapHeader.
     * 
     * @return partialFailure   * If true, API will try to commit as many error free operations
     * as possible and
     *                 report the other operations' errors.
     *                 
     *                 <p>Ignored for non-mutate calls.
     */
    public java.lang.Boolean getPartialFailure() {
        return partialFailure;
    }


    /**
     * Sets the partialFailure value for this SoapHeader.
     * 
     * @param partialFailure   * If true, API will try to commit as many error free operations
     * as possible and
     *                 report the other operations' errors.
     *                 
     *                 <p>Ignored for non-mutate calls.
     */
    public void setPartialFailure(java.lang.Boolean partialFailure) {
        this.partialFailure = partialFailure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SoapHeader)) return false;
        SoapHeader other = (SoapHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authToken==null && other.getAuthToken()==null) || 
             (this.authToken!=null &&
              this.authToken.equals(other.getAuthToken()))) &&
            ((this.clientCustomerId==null && other.getClientCustomerId()==null) || 
             (this.clientCustomerId!=null &&
              this.clientCustomerId.equals(other.getClientCustomerId()))) &&
            ((this.developerToken==null && other.getDeveloperToken()==null) || 
             (this.developerToken!=null &&
              this.developerToken.equals(other.getDeveloperToken()))) &&
            ((this.userAgent==null && other.getUserAgent()==null) || 
             (this.userAgent!=null &&
              this.userAgent.equals(other.getUserAgent()))) &&
            ((this.validateOnly==null && other.getValidateOnly()==null) || 
             (this.validateOnly!=null &&
              this.validateOnly.equals(other.getValidateOnly()))) &&
            ((this.partialFailure==null && other.getPartialFailure()==null) || 
             (this.partialFailure!=null &&
              this.partialFailure.equals(other.getPartialFailure())));
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
        if (getAuthToken() != null) {
            _hashCode += getAuthToken().hashCode();
        }
        if (getClientCustomerId() != null) {
            _hashCode += getClientCustomerId().hashCode();
        }
        if (getDeveloperToken() != null) {
            _hashCode += getDeveloperToken().hashCode();
        }
        if (getUserAgent() != null) {
            _hashCode += getUserAgent().hashCode();
        }
        if (getValidateOnly() != null) {
            _hashCode += getValidateOnly().hashCode();
        }
        if (getPartialFailure() != null) {
            _hashCode += getPartialFailure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SoapHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "SoapHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authToken");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "authToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "clientCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("developerToken");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "developerToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "userAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "validateOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialFailure");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "partialFailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
