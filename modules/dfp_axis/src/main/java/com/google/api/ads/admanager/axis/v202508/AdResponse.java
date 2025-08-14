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
 * AdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;


/**
 * Contains debugging information from an ad response, which is the
 * response to an ad request that
 *             contains the creatives that should be served into the
 * ad break.
 *             
 *             <p>The response can either be a VAST Inline, which contains
 * an actual creative from an ad server,
 *             a VAST Redirect, which contains a redirect URL that should
 * be pinged via another VAST ad request,
 *             or a VMAP response.
 */
public class AdResponse  implements java.io.Serializable {
    /* The ad tag URL. */
    private java.lang.String requestUrl;

    /* Whether the request associated with this ad response is VMAP. */
    private java.lang.Boolean isVmapRequest;

    /* The contents of the response body. */
    private java.lang.String responseBody;

    /* The subsequent ad responses that were triggered due to a VAST
     * redirect in this ad response. */
    private com.google.api.ads.admanager.axis.v202508.AdResponse[] redirectResponses;

    /* Information about any generic error that occurred. */
    private com.google.api.ads.admanager.axis.v202508.SamError samError;

    /* Information about any errors that occurred while parsing the
     * ad response. */
    private com.google.api.ads.admanager.axis.v202508.SamError[] adErrors;

    public AdResponse() {
    }

    public AdResponse(
           java.lang.String requestUrl,
           java.lang.Boolean isVmapRequest,
           java.lang.String responseBody,
           com.google.api.ads.admanager.axis.v202508.AdResponse[] redirectResponses,
           com.google.api.ads.admanager.axis.v202508.SamError samError,
           com.google.api.ads.admanager.axis.v202508.SamError[] adErrors) {
           this.requestUrl = requestUrl;
           this.isVmapRequest = isVmapRequest;
           this.responseBody = responseBody;
           this.redirectResponses = redirectResponses;
           this.samError = samError;
           this.adErrors = adErrors;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adErrors", getAdErrors())
            .add("isVmapRequest", getIsVmapRequest())
            .add("redirectResponses", getRedirectResponses())
            .add("requestUrl", getRequestUrl())
            .add("responseBody", getResponseBody())
            .add("samError", getSamError())
            .toString();
    }

    /**
     * Gets the requestUrl value for this AdResponse.
     * 
     * @return requestUrl   * The ad tag URL.
     */
    public java.lang.String getRequestUrl() {
        return requestUrl;
    }


    /**
     * Sets the requestUrl value for this AdResponse.
     * 
     * @param requestUrl   * The ad tag URL.
     */
    public void setRequestUrl(java.lang.String requestUrl) {
        this.requestUrl = requestUrl;
    }


    /**
     * Gets the isVmapRequest value for this AdResponse.
     * 
     * @return isVmapRequest   * Whether the request associated with this ad response is VMAP.
     */
    public java.lang.Boolean getIsVmapRequest() {
        return isVmapRequest;
    }


    /**
     * Sets the isVmapRequest value for this AdResponse.
     * 
     * @param isVmapRequest   * Whether the request associated with this ad response is VMAP.
     */
    public void setIsVmapRequest(java.lang.Boolean isVmapRequest) {
        this.isVmapRequest = isVmapRequest;
    }


    /**
     * Gets the responseBody value for this AdResponse.
     * 
     * @return responseBody   * The contents of the response body.
     */
    public java.lang.String getResponseBody() {
        return responseBody;
    }


    /**
     * Sets the responseBody value for this AdResponse.
     * 
     * @param responseBody   * The contents of the response body.
     */
    public void setResponseBody(java.lang.String responseBody) {
        this.responseBody = responseBody;
    }


    /**
     * Gets the redirectResponses value for this AdResponse.
     * 
     * @return redirectResponses   * The subsequent ad responses that were triggered due to a VAST
     * redirect in this ad response.
     */
    public com.google.api.ads.admanager.axis.v202508.AdResponse[] getRedirectResponses() {
        return redirectResponses;
    }


    /**
     * Sets the redirectResponses value for this AdResponse.
     * 
     * @param redirectResponses   * The subsequent ad responses that were triggered due to a VAST
     * redirect in this ad response.
     */
    public void setRedirectResponses(com.google.api.ads.admanager.axis.v202508.AdResponse[] redirectResponses) {
        this.redirectResponses = redirectResponses;
    }

    public com.google.api.ads.admanager.axis.v202508.AdResponse getRedirectResponses(int i) {
        return this.redirectResponses[i];
    }

    public void setRedirectResponses(int i, com.google.api.ads.admanager.axis.v202508.AdResponse _value) {
        this.redirectResponses[i] = _value;
    }


    /**
     * Gets the samError value for this AdResponse.
     * 
     * @return samError   * Information about any generic error that occurred.
     */
    public com.google.api.ads.admanager.axis.v202508.SamError getSamError() {
        return samError;
    }


    /**
     * Sets the samError value for this AdResponse.
     * 
     * @param samError   * Information about any generic error that occurred.
     */
    public void setSamError(com.google.api.ads.admanager.axis.v202508.SamError samError) {
        this.samError = samError;
    }


    /**
     * Gets the adErrors value for this AdResponse.
     * 
     * @return adErrors   * Information about any errors that occurred while parsing the
     * ad response.
     */
    public com.google.api.ads.admanager.axis.v202508.SamError[] getAdErrors() {
        return adErrors;
    }


    /**
     * Sets the adErrors value for this AdResponse.
     * 
     * @param adErrors   * Information about any errors that occurred while parsing the
     * ad response.
     */
    public void setAdErrors(com.google.api.ads.admanager.axis.v202508.SamError[] adErrors) {
        this.adErrors = adErrors;
    }

    public com.google.api.ads.admanager.axis.v202508.SamError getAdErrors(int i) {
        return this.adErrors[i];
    }

    public void setAdErrors(int i, com.google.api.ads.admanager.axis.v202508.SamError _value) {
        this.adErrors[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdResponse)) return false;
        AdResponse other = (AdResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestUrl==null && other.getRequestUrl()==null) || 
             (this.requestUrl!=null &&
              this.requestUrl.equals(other.getRequestUrl()))) &&
            ((this.isVmapRequest==null && other.getIsVmapRequest()==null) || 
             (this.isVmapRequest!=null &&
              this.isVmapRequest.equals(other.getIsVmapRequest()))) &&
            ((this.responseBody==null && other.getResponseBody()==null) || 
             (this.responseBody!=null &&
              this.responseBody.equals(other.getResponseBody()))) &&
            ((this.redirectResponses==null && other.getRedirectResponses()==null) || 
             (this.redirectResponses!=null &&
              java.util.Arrays.equals(this.redirectResponses, other.getRedirectResponses()))) &&
            ((this.samError==null && other.getSamError()==null) || 
             (this.samError!=null &&
              this.samError.equals(other.getSamError()))) &&
            ((this.adErrors==null && other.getAdErrors()==null) || 
             (this.adErrors!=null &&
              java.util.Arrays.equals(this.adErrors, other.getAdErrors())));
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
        if (getRequestUrl() != null) {
            _hashCode += getRequestUrl().hashCode();
        }
        if (getIsVmapRequest() != null) {
            _hashCode += getIsVmapRequest().hashCode();
        }
        if (getResponseBody() != null) {
            _hashCode += getResponseBody().hashCode();
        }
        if (getRedirectResponses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRedirectResponses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRedirectResponses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamError() != null) {
            _hashCode += getSamError().hashCode();
        }
        if (getAdErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "AdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "requestUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVmapRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "isVmapRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseBody");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "responseBody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectResponses");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "redirectResponses"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "AdResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samError");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "samError"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "SamError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adErrors");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "adErrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "SamError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
