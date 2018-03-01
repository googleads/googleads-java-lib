// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * OAuthInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Data used for authorization using OAuth.
 *             For more information about OAuth, see:
 *             {@link "https://developers.google.com/identity/protocols/OAuth2"}
 */
public class OAuthInfo  implements java.io.Serializable {
    /* The HTTP method used to obtain authorization. */
    private java.lang.String httpMethod;

    /* The HTTP request URL used to obtain authorization. */
    private java.lang.String httpRequestUrl;

    /* The HTTP authorization header used to obtain authorization. */
    private java.lang.String httpAuthorizationHeader;

    public OAuthInfo() {
    }

    public OAuthInfo(
           java.lang.String httpMethod,
           java.lang.String httpRequestUrl,
           java.lang.String httpAuthorizationHeader) {
           this.httpMethod = httpMethod;
           this.httpRequestUrl = httpRequestUrl;
           this.httpAuthorizationHeader = httpAuthorizationHeader;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            // Exclude httpAuthorizationHeader since it contains sensitive information
            .add("httpMethod", getHttpMethod())
            .add("httpRequestUrl", getHttpRequestUrl())
            .toString();
    }

    /**
     * Gets the httpMethod value for this OAuthInfo.
     * 
     * @return httpMethod   * The HTTP method used to obtain authorization.
     */
    public java.lang.String getHttpMethod() {
        return httpMethod;
    }


    /**
     * Sets the httpMethod value for this OAuthInfo.
     * 
     * @param httpMethod   * The HTTP method used to obtain authorization.
     */
    public void setHttpMethod(java.lang.String httpMethod) {
        this.httpMethod = httpMethod;
    }


    /**
     * Gets the httpRequestUrl value for this OAuthInfo.
     * 
     * @return httpRequestUrl   * The HTTP request URL used to obtain authorization.
     */
    public java.lang.String getHttpRequestUrl() {
        return httpRequestUrl;
    }


    /**
     * Sets the httpRequestUrl value for this OAuthInfo.
     * 
     * @param httpRequestUrl   * The HTTP request URL used to obtain authorization.
     */
    public void setHttpRequestUrl(java.lang.String httpRequestUrl) {
        this.httpRequestUrl = httpRequestUrl;
    }


    /**
     * Gets the httpAuthorizationHeader value for this OAuthInfo.
     * 
     * @return httpAuthorizationHeader   * The HTTP authorization header used to obtain authorization.
     */
    public java.lang.String getHttpAuthorizationHeader() {
        return httpAuthorizationHeader;
    }


    /**
     * Sets the httpAuthorizationHeader value for this OAuthInfo.
     * 
     * @param httpAuthorizationHeader   * The HTTP authorization header used to obtain authorization.
     */
    public void setHttpAuthorizationHeader(java.lang.String httpAuthorizationHeader) {
        this.httpAuthorizationHeader = httpAuthorizationHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OAuthInfo)) return false;
        OAuthInfo other = (OAuthInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httpMethod==null && other.getHttpMethod()==null) || 
             (this.httpMethod!=null &&
              this.httpMethod.equals(other.getHttpMethod()))) &&
            ((this.httpRequestUrl==null && other.getHttpRequestUrl()==null) || 
             (this.httpRequestUrl!=null &&
              this.httpRequestUrl.equals(other.getHttpRequestUrl()))) &&
            ((this.httpAuthorizationHeader==null && other.getHttpAuthorizationHeader()==null) || 
             (this.httpAuthorizationHeader!=null &&
              this.httpAuthorizationHeader.equals(other.getHttpAuthorizationHeader())));
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
        if (getHttpMethod() != null) {
            _hashCode += getHttpMethod().hashCode();
        }
        if (getHttpRequestUrl() != null) {
            _hashCode += getHttpRequestUrl().hashCode();
        }
        if (getHttpAuthorizationHeader() != null) {
            _hashCode += getHttpAuthorizationHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OAuthInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "OAuthInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "httpMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpRequestUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "httpRequestUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpAuthorizationHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "httpAuthorizationHeader"));
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
