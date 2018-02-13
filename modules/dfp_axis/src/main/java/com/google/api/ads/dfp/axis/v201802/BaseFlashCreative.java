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
 * BaseFlashCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A base type for creatives that display a Flash-based ad. If the
 * Flash ad
 *             cannot load, a fallback image is displayed instead.
 */
public abstract class BaseFlashCreative  extends com.google.api.ads.dfp.axis.v201802.HasDestinationUrlCreative  implements java.io.Serializable {
    /* Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* Specifies whether the Flash asset is required to have a click
     * tag embedded
     *                     in it or not. This attribute is optional. */
    private java.lang.Boolean clickTagRequired;

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

    /* The flash asset. This attribute is required. To view the Flash
     * image, use the
     *                     {@link CreativeAsset#assetUrl}. */
    private com.google.api.ads.dfp.axis.v201802.CreativeAsset flashAsset;

    /* The image asset to fall back on if the flash creative cannot
     * be loaded. To view
     *                     the fallback image, use the {@link CreativeAsset#assetUrl}. */
    private com.google.api.ads.dfp.axis.v201802.CreativeAsset fallbackImageAsset;

    public BaseFlashCreative() {
    }

    public BaseFlashCreative(
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
           java.lang.Boolean overrideSize,
           java.lang.Boolean clickTagRequired,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           com.google.api.ads.dfp.axis.v201802.CreativeAsset flashAsset,
           com.google.api.ads.dfp.axis.v201802.CreativeAsset fallbackImageAsset) {
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
        this.overrideSize = overrideSize;
        this.clickTagRequired = clickTagRequired;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.flashAsset = flashAsset;
        this.fallbackImageAsset = fallbackImageAsset;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("clickTagRequired", getClickTagRequired())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("fallbackImageAsset", getFallbackImageAsset())
            .add("flashAsset", getFlashAsset())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("overrideSize", getOverrideSize())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .toString();
    }

    /**
     * Gets the overrideSize value for this BaseFlashCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this BaseFlashCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the clickTagRequired value for this BaseFlashCreative.
     * 
     * @return clickTagRequired   * Specifies whether the Flash asset is required to have a click
     * tag embedded
     *                     in it or not. This attribute is optional.
     */
    public java.lang.Boolean getClickTagRequired() {
        return clickTagRequired;
    }


    /**
     * Sets the clickTagRequired value for this BaseFlashCreative.
     * 
     * @param clickTagRequired   * Specifies whether the Flash asset is required to have a click
     * tag embedded
     *                     in it or not. This attribute is optional.
     */
    public void setClickTagRequired(java.lang.Boolean clickTagRequired) {
        this.clickTagRequired = clickTagRequired;
    }


    /**
     * Gets the sslScanResult value for this BaseFlashCreative.
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
     * Sets the sslScanResult value for this BaseFlashCreative.
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
     * Gets the sslManualOverride value for this BaseFlashCreative.
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
     * Sets the sslManualOverride value for this BaseFlashCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }


    /**
     * Gets the flashAsset value for this BaseFlashCreative.
     * 
     * @return flashAsset   * The flash asset. This attribute is required. To view the Flash
     * image, use the
     *                     {@link CreativeAsset#assetUrl}.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeAsset getFlashAsset() {
        return flashAsset;
    }


    /**
     * Sets the flashAsset value for this BaseFlashCreative.
     * 
     * @param flashAsset   * The flash asset. This attribute is required. To view the Flash
     * image, use the
     *                     {@link CreativeAsset#assetUrl}.
     */
    public void setFlashAsset(com.google.api.ads.dfp.axis.v201802.CreativeAsset flashAsset) {
        this.flashAsset = flashAsset;
    }


    /**
     * Gets the fallbackImageAsset value for this BaseFlashCreative.
     * 
     * @return fallbackImageAsset   * The image asset to fall back on if the flash creative cannot
     * be loaded. To view
     *                     the fallback image, use the {@link CreativeAsset#assetUrl}.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeAsset getFallbackImageAsset() {
        return fallbackImageAsset;
    }


    /**
     * Sets the fallbackImageAsset value for this BaseFlashCreative.
     * 
     * @param fallbackImageAsset   * The image asset to fall back on if the flash creative cannot
     * be loaded. To view
     *                     the fallback image, use the {@link CreativeAsset#assetUrl}.
     */
    public void setFallbackImageAsset(com.google.api.ads.dfp.axis.v201802.CreativeAsset fallbackImageAsset) {
        this.fallbackImageAsset = fallbackImageAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseFlashCreative)) return false;
        BaseFlashCreative other = (BaseFlashCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.clickTagRequired==null && other.getClickTagRequired()==null) || 
             (this.clickTagRequired!=null &&
              this.clickTagRequired.equals(other.getClickTagRequired()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.flashAsset==null && other.getFlashAsset()==null) || 
             (this.flashAsset!=null &&
              this.flashAsset.equals(other.getFlashAsset()))) &&
            ((this.fallbackImageAsset==null && other.getFallbackImageAsset()==null) || 
             (this.fallbackImageAsset!=null &&
              this.fallbackImageAsset.equals(other.getFallbackImageAsset())));
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
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getClickTagRequired() != null) {
            _hashCode += getClickTagRequired().hashCode();
        }
        if (getSslScanResult() != null) {
            _hashCode += getSslScanResult().hashCode();
        }
        if (getSslManualOverride() != null) {
            _hashCode += getSslManualOverride().hashCode();
        }
        if (getFlashAsset() != null) {
            _hashCode += getFlashAsset().hashCode();
        }
        if (getFallbackImageAsset() != null) {
            _hashCode += getFallbackImageAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseFlashCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseFlashCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickTagRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "clickTagRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "flashAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackImageAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "fallbackImageAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeAsset"));
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
