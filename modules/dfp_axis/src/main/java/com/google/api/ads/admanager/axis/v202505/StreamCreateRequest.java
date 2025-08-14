// Copyright 2025 Google LLC
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
 * StreamCreateRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;


/**
 * Contains debugging information about the request that usually happens
 * once per session from the
 *             video player to retrieve the streaming URL chunks that
 * are constantly updated as the stream
 *             progresses.
 */
public abstract class StreamCreateRequest  implements java.io.Serializable {
    /* The ad request URL. */
    private java.lang.String url;

    /* The user agent (i.e. device) the session is on. */
    private java.lang.String userAgent;

    /* Indicates how ad tracking URLs are pinged. */
    private com.google.api.ads.admanager.axis.v202505.ReportingType reportingType;

    public StreamCreateRequest() {
    }

    public StreamCreateRequest(
           java.lang.String url,
           java.lang.String userAgent,
           com.google.api.ads.admanager.axis.v202505.ReportingType reportingType) {
           this.url = url;
           this.userAgent = userAgent;
           this.reportingType = reportingType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("reportingType", getReportingType())
            .add("url", getUrl())
            .add("userAgent", getUserAgent())
            .toString();
    }

    /**
     * Gets the url value for this StreamCreateRequest.
     * 
     * @return url   * The ad request URL.
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this StreamCreateRequest.
     * 
     * @param url   * The ad request URL.
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the userAgent value for this StreamCreateRequest.
     * 
     * @return userAgent   * The user agent (i.e. device) the session is on.
     */
    public java.lang.String getUserAgent() {
        return userAgent;
    }


    /**
     * Sets the userAgent value for this StreamCreateRequest.
     * 
     * @param userAgent   * The user agent (i.e. device) the session is on.
     */
    public void setUserAgent(java.lang.String userAgent) {
        this.userAgent = userAgent;
    }


    /**
     * Gets the reportingType value for this StreamCreateRequest.
     * 
     * @return reportingType   * Indicates how ad tracking URLs are pinged.
     */
    public com.google.api.ads.admanager.axis.v202505.ReportingType getReportingType() {
        return reportingType;
    }


    /**
     * Sets the reportingType value for this StreamCreateRequest.
     * 
     * @param reportingType   * Indicates how ad tracking URLs are pinged.
     */
    public void setReportingType(com.google.api.ads.admanager.axis.v202505.ReportingType reportingType) {
        this.reportingType = reportingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StreamCreateRequest)) return false;
        StreamCreateRequest other = (StreamCreateRequest) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.userAgent==null && other.getUserAgent()==null) || 
             (this.userAgent!=null &&
              this.userAgent.equals(other.getUserAgent()))) &&
            ((this.reportingType==null && other.getReportingType()==null) || 
             (this.reportingType!=null &&
              this.reportingType.equals(other.getReportingType())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getUserAgent() != null) {
            _hashCode += getUserAgent().hashCode();
        }
        if (getReportingType() != null) {
            _hashCode += getReportingType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StreamCreateRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "StreamCreateRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAgent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "userAgent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "reportingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "ReportingType"));
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
