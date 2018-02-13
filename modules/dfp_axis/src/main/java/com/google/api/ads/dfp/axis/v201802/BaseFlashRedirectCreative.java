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
 * BaseFlashRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * The base type for creatives that load a Flash asset from a specified
 * URL.
 *             If the remote flash asset cannot be served, a fallback
 * image is used at an
 *             alternate URL.
 */
public abstract class BaseFlashRedirectCreative  extends com.google.api.ads.dfp.axis.v201802.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The URL where the Flash asset resides. This attribute is required
     * and has
     *                     a maximum length of 1024 characters. */
    private java.lang.String flashUrl;

    /* The fallback URL to use if the Flash URL cannot be used. This
     * attribute is
     *                     required and has a maximum length of 1024 characters. */
    private java.lang.String fallbackUrl;

    /* The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google. */
    private java.lang.String fallbackPreviewUrl;

    /* The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google. */
    private com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}. */
    private com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride;

    public BaseFlashRedirectCreative() {
    }

    public BaseFlashRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201802.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201802.DestinationUrlType destinationUrlType,
           java.lang.String flashUrl,
           java.lang.String fallbackUrl,
           java.lang.String fallbackPreviewUrl,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyViolations,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            destinationUrl,
            destinationUrlType);
        this.flashUrl = flashUrl;
        this.fallbackUrl = fallbackUrl;
        this.fallbackPreviewUrl = fallbackPreviewUrl;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("fallbackPreviewUrl", getFallbackPreviewUrl())
            .add("fallbackUrl", getFallbackUrl())
            .add("flashUrl", getFlashUrl())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .toString();
    }

    /**
     * Gets the flashUrl value for this BaseFlashRedirectCreative.
     * 
     * @return flashUrl   * The URL where the Flash asset resides. This attribute is required
     * and has
     *                     a maximum length of 1024 characters.
     */
    public java.lang.String getFlashUrl() {
        return flashUrl;
    }


    /**
     * Sets the flashUrl value for this BaseFlashRedirectCreative.
     * 
     * @param flashUrl   * The URL where the Flash asset resides. This attribute is required
     * and has
     *                     a maximum length of 1024 characters.
     */
    public void setFlashUrl(java.lang.String flashUrl) {
        this.flashUrl = flashUrl;
    }


    /**
     * Gets the fallbackUrl value for this BaseFlashRedirectCreative.
     * 
     * @return fallbackUrl   * The fallback URL to use if the Flash URL cannot be used. This
     * attribute is
     *                     required and has a maximum length of 1024 characters.
     */
    public java.lang.String getFallbackUrl() {
        return fallbackUrl;
    }


    /**
     * Sets the fallbackUrl value for this BaseFlashRedirectCreative.
     * 
     * @param fallbackUrl   * The fallback URL to use if the Flash URL cannot be used. This
     * attribute is
     *                     required and has a maximum length of 1024 characters.
     */
    public void setFallbackUrl(java.lang.String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }


    /**
     * Gets the fallbackPreviewUrl value for this BaseFlashRedirectCreative.
     * 
     * @return fallbackPreviewUrl   * The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google.
     */
    public java.lang.String getFallbackPreviewUrl() {
        return fallbackPreviewUrl;
    }


    /**
     * Sets the fallbackPreviewUrl value for this BaseFlashRedirectCreative.
     * 
     * @param fallbackPreviewUrl   * The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google.
     */
    public void setFallbackPreviewUrl(java.lang.String fallbackPreviewUrl) {
        this.fallbackPreviewUrl = fallbackPreviewUrl;
    }


    /**
     * Gets the sslScanResult value for this BaseFlashRedirectCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this BaseFlashRedirectCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public void setSslScanResult(com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this BaseFlashRedirectCreative.
     * 
     * @return sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public com.google.api.ads.dfp.axis.v201802.SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }


    /**
     * Sets the sslManualOverride value for this BaseFlashRedirectCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseFlashRedirectCreative)) return false;
        BaseFlashRedirectCreative other = (BaseFlashRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flashUrl==null && other.getFlashUrl()==null) || 
             (this.flashUrl!=null &&
              this.flashUrl.equals(other.getFlashUrl()))) &&
            ((this.fallbackUrl==null && other.getFallbackUrl()==null) || 
             (this.fallbackUrl!=null &&
              this.fallbackUrl.equals(other.getFallbackUrl()))) &&
            ((this.fallbackPreviewUrl==null && other.getFallbackPreviewUrl()==null) || 
             (this.fallbackPreviewUrl!=null &&
              this.fallbackPreviewUrl.equals(other.getFallbackPreviewUrl()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride())));
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
        if (getFlashUrl() != null) {
            _hashCode += getFlashUrl().hashCode();
        }
        if (getFallbackUrl() != null) {
            _hashCode += getFallbackUrl().hashCode();
        }
        if (getFallbackPreviewUrl() != null) {
            _hashCode += getFallbackPreviewUrl().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseFlashRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseFlashRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "flashUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fallbackUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fallbackPreviewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslScanResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sslScanResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SslScanResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslManualOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "sslManualOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SslManualOverride"));
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
