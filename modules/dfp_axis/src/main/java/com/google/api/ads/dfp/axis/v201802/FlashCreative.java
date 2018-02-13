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
 * FlashCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that displays a Flash-based ad. If the Flash
 * ad cannot
 *             load, a fallback image is displayed instead.
 */
public class FlashCreative  extends com.google.api.ads.dfp.axis.v201802.BaseFlashCreative  implements java.io.Serializable {
    /* A Swiffy asset that can be used as a fallback for this flash
     * creative.
     *                     This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201802.SwiffyFallbackAsset swiffyAsset;

    /* Enables Swiffy fallback asset creation and serving.
     *                     
     *                     <p>If {@code true} during creation or update,
     * the flash asset will be converted to
     *                     a {@link #swiffyAsset Swiffy asset}. If successful,
     * the Swiffy asset will be used
     *                     for ad serving, which may lead to additional latency.
     * 
     *                     <p>To remove the swiffy asset, set this attribute
     * to {@code false} and
     *                     update the {@link #flashByteArray flash asset}.
     * 
     *                     <p>This attribute is optional and defaults to
     * false. */
    private java.lang.Boolean createSwiffyAsset;

    /* A locked orientation for this creative to be displayed in. */
    private com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation;

    /* Enables the creative to be served with click tag overlay.
     *                     
     *                     <p>This attribute is optional and defaults to
     * false. */
    private java.lang.Boolean clickTagOverlayEnabled;

    public FlashCreative() {
    }

    public FlashCreative(
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
           com.google.api.ads.dfp.axis.v201802.CreativeAsset fallbackImageAsset,
           com.google.api.ads.dfp.axis.v201802.SwiffyFallbackAsset swiffyAsset,
           java.lang.Boolean createSwiffyAsset,
           com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation,
           java.lang.Boolean clickTagOverlayEnabled) {
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
            destinationUrlType,
            overrideSize,
            clickTagRequired,
            sslScanResult,
            sslManualOverride,
            flashAsset,
            fallbackImageAsset);
        this.swiffyAsset = swiffyAsset;
        this.createSwiffyAsset = createSwiffyAsset;
        this.lockedOrientation = lockedOrientation;
        this.clickTagOverlayEnabled = clickTagOverlayEnabled;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("clickTagOverlayEnabled", getClickTagOverlayEnabled())
            .add("clickTagRequired", getClickTagRequired())
            .add("createSwiffyAsset", getCreateSwiffyAsset())
            .add("customFieldValues", getCustomFieldValues())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("fallbackImageAsset", getFallbackImageAsset())
            .add("flashAsset", getFlashAsset())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lockedOrientation", getLockedOrientation())
            .add("name", getName())
            .add("overrideSize", getOverrideSize())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("swiffyAsset", getSwiffyAsset())
            .toString();
    }

    /**
     * Gets the swiffyAsset value for this FlashCreative.
     * 
     * @return swiffyAsset   * A Swiffy asset that can be used as a fallback for this flash
     * creative.
     *                     This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.SwiffyFallbackAsset getSwiffyAsset() {
        return swiffyAsset;
    }


    /**
     * Sets the swiffyAsset value for this FlashCreative.
     * 
     * @param swiffyAsset   * A Swiffy asset that can be used as a fallback for this flash
     * creative.
     *                     This attribute is readonly.
     */
    public void setSwiffyAsset(com.google.api.ads.dfp.axis.v201802.SwiffyFallbackAsset swiffyAsset) {
        this.swiffyAsset = swiffyAsset;
    }


    /**
     * Gets the createSwiffyAsset value for this FlashCreative.
     * 
     * @return createSwiffyAsset   * Enables Swiffy fallback asset creation and serving.
     *                     
     *                     <p>If {@code true} during creation or update,
     * the flash asset will be converted to
     *                     a {@link #swiffyAsset Swiffy asset}. If successful,
     * the Swiffy asset will be used
     *                     for ad serving, which may lead to additional latency.
     * 
     *                     <p>To remove the swiffy asset, set this attribute
     * to {@code false} and
     *                     update the {@link #flashByteArray flash asset}.
     * 
     *                     <p>This attribute is optional and defaults to
     * false.
     */
    public java.lang.Boolean getCreateSwiffyAsset() {
        return createSwiffyAsset;
    }


    /**
     * Sets the createSwiffyAsset value for this FlashCreative.
     * 
     * @param createSwiffyAsset   * Enables Swiffy fallback asset creation and serving.
     *                     
     *                     <p>If {@code true} during creation or update,
     * the flash asset will be converted to
     *                     a {@link #swiffyAsset Swiffy asset}. If successful,
     * the Swiffy asset will be used
     *                     for ad serving, which may lead to additional latency.
     * 
     *                     <p>To remove the swiffy asset, set this attribute
     * to {@code false} and
     *                     update the {@link #flashByteArray flash asset}.
     * 
     *                     <p>This attribute is optional and defaults to
     * false.
     */
    public void setCreateSwiffyAsset(java.lang.Boolean createSwiffyAsset) {
        this.createSwiffyAsset = createSwiffyAsset;
    }


    /**
     * Gets the lockedOrientation value for this FlashCreative.
     * 
     * @return lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public com.google.api.ads.dfp.axis.v201802.LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }


    /**
     * Sets the lockedOrientation value for this FlashCreative.
     * 
     * @param lockedOrientation   * A locked orientation for this creative to be displayed in.
     */
    public void setLockedOrientation(com.google.api.ads.dfp.axis.v201802.LockedOrientation lockedOrientation) {
        this.lockedOrientation = lockedOrientation;
    }


    /**
     * Gets the clickTagOverlayEnabled value for this FlashCreative.
     * 
     * @return clickTagOverlayEnabled   * Enables the creative to be served with click tag overlay.
     *                     
     *                     <p>This attribute is optional and defaults to
     * false.
     */
    public java.lang.Boolean getClickTagOverlayEnabled() {
        return clickTagOverlayEnabled;
    }


    /**
     * Sets the clickTagOverlayEnabled value for this FlashCreative.
     * 
     * @param clickTagOverlayEnabled   * Enables the creative to be served with click tag overlay.
     *                     
     *                     <p>This attribute is optional and defaults to
     * false.
     */
    public void setClickTagOverlayEnabled(java.lang.Boolean clickTagOverlayEnabled) {
        this.clickTagOverlayEnabled = clickTagOverlayEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlashCreative)) return false;
        FlashCreative other = (FlashCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.swiffyAsset==null && other.getSwiffyAsset()==null) || 
             (this.swiffyAsset!=null &&
              this.swiffyAsset.equals(other.getSwiffyAsset()))) &&
            ((this.createSwiffyAsset==null && other.getCreateSwiffyAsset()==null) || 
             (this.createSwiffyAsset!=null &&
              this.createSwiffyAsset.equals(other.getCreateSwiffyAsset()))) &&
            ((this.lockedOrientation==null && other.getLockedOrientation()==null) || 
             (this.lockedOrientation!=null &&
              this.lockedOrientation.equals(other.getLockedOrientation()))) &&
            ((this.clickTagOverlayEnabled==null && other.getClickTagOverlayEnabled()==null) || 
             (this.clickTagOverlayEnabled!=null &&
              this.clickTagOverlayEnabled.equals(other.getClickTagOverlayEnabled())));
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
        if (getSwiffyAsset() != null) {
            _hashCode += getSwiffyAsset().hashCode();
        }
        if (getCreateSwiffyAsset() != null) {
            _hashCode += getCreateSwiffyAsset().hashCode();
        }
        if (getLockedOrientation() != null) {
            _hashCode += getLockedOrientation().hashCode();
        }
        if (getClickTagOverlayEnabled() != null) {
            _hashCode += getClickTagOverlayEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlashCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FlashCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swiffyAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "swiffyAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SwiffyFallbackAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createSwiffyAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "createSwiffyAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockedOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lockedOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LockedOrientation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickTagOverlayEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "clickTagOverlayEnabled"));
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
