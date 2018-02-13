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
 * FlashRedirectOverlayCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * An overlay {@code Creative} that loads a Flash asset from a specified
 * URL
 *             and is served via VAST 2.0 XML. Overlays cover part of
 * the video content
 *             they are displayed on top of.
 */
public class FlashRedirectOverlayCreative  extends com.google.api.ads.dfp.axis.v201802.BaseFlashRedirectCreative  implements java.io.Serializable {
    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     If the {@link #apiFramework} is {@link ApiFramework#VPAID},
     * the value does not need to be a comma separated key-value list (and
     * can instead be any arbitrary string). This attribute is optional. */
    private java.lang.String customParameters;

    /* The API framework of the asset. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.ApiFramework apiFramework;

    /* Minimum suggested duration in milliseconds. This attribute
     * is optional. */
    private java.lang.Integer duration;

    /* The size of the flash asset. Note that this may differ from
     * {@link #size}
     *                     if the asset is not expected to fill the entire
     * video player. This attribute
     *                     is optional. */
    private com.google.api.ads.dfp.axis.v201802.Size flashAssetSize;

    /* An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only. */
    private java.lang.String vastPreviewUrl;

    public FlashRedirectOverlayCreative() {
    }

    public FlashRedirectOverlayCreative(
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
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           long[] companionCreativeIds,
           com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           java.lang.String customParameters,
           com.google.api.ads.dfp.axis.v201802.ApiFramework apiFramework,
           java.lang.Integer duration,
           com.google.api.ads.dfp.axis.v201802.Size flashAssetSize,
           java.lang.String vastPreviewUrl) {
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
            flashUrl,
            fallbackUrl,
            fallbackPreviewUrl,
            sslScanResult,
            sslManualOverride);
        this.companionCreativeIds = companionCreativeIds;
        this.trackingUrls = trackingUrls;
        this.customParameters = customParameters;
        this.apiFramework = apiFramework;
        this.duration = duration;
        this.flashAssetSize = flashAssetSize;
        this.vastPreviewUrl = vastPreviewUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("apiFramework", getApiFramework())
            .add("appliedLabels", getAppliedLabels())
            .add("companionCreativeIds", getCompanionCreativeIds())
            .add("customFieldValues", getCustomFieldValues())
            .add("customParameters", getCustomParameters())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("duration", getDuration())
            .add("fallbackPreviewUrl", getFallbackPreviewUrl())
            .add("fallbackUrl", getFallbackUrl())
            .add("flashAssetSize", getFlashAssetSize())
            .add("flashUrl", getFlashUrl())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("trackingUrls", getTrackingUrls())
            .add("vastPreviewUrl", getVastPreviewUrl())
            .toString();
    }

    /**
     * Gets the companionCreativeIds value for this FlashRedirectOverlayCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this FlashRedirectOverlayCreative.
     * 
     * @param companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public void setCompanionCreativeIds(long[] companionCreativeIds) {
        this.companionCreativeIds = companionCreativeIds;
    }

    public long getCompanionCreativeIds(int i) {
        return this.companionCreativeIds[i];
    }

    public void setCompanionCreativeIds(int i, long _value) {
        this.companionCreativeIds[i] = _value;
    }


    /**
     * Gets the trackingUrls value for this FlashRedirectOverlayCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this FlashRedirectOverlayCreative.
     * 
     * @param trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public void setTrackingUrls(com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry getTrackingUrls(int i) {
        return this.trackingUrls[i];
    }

    public void setTrackingUrls(int i, com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.trackingUrls[i] = _value;
    }


    /**
     * Gets the customParameters value for this FlashRedirectOverlayCreative.
     * 
     * @return customParameters   * A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     If the {@link #apiFramework} is {@link ApiFramework#VPAID},
     * the value does not need to be a comma separated key-value list (and
     * can instead be any arbitrary string). This attribute is optional.
     */
    public java.lang.String getCustomParameters() {
        return customParameters;
    }


    /**
     * Sets the customParameters value for this FlashRedirectOverlayCreative.
     * 
     * @param customParameters   * A comma separated key=value list of parameters that will be
     * supplied to
     *                     the creative, written into the VAST {@code AdParameters}
     * node.
     *                     If the {@link #apiFramework} is {@link ApiFramework#VPAID},
     * the value does not need to be a comma separated key-value list (and
     * can instead be any arbitrary string). This attribute is optional.
     */
    public void setCustomParameters(java.lang.String customParameters) {
        this.customParameters = customParameters;
    }


    /**
     * Gets the apiFramework value for this FlashRedirectOverlayCreative.
     * 
     * @return apiFramework   * The API framework of the asset. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.ApiFramework getApiFramework() {
        return apiFramework;
    }


    /**
     * Sets the apiFramework value for this FlashRedirectOverlayCreative.
     * 
     * @param apiFramework   * The API framework of the asset. This attribute is optional.
     */
    public void setApiFramework(com.google.api.ads.dfp.axis.v201802.ApiFramework apiFramework) {
        this.apiFramework = apiFramework;
    }


    /**
     * Gets the duration value for this FlashRedirectOverlayCreative.
     * 
     * @return duration   * Minimum suggested duration in milliseconds. This attribute
     * is optional.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this FlashRedirectOverlayCreative.
     * 
     * @param duration   * Minimum suggested duration in milliseconds. This attribute
     * is optional.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the flashAssetSize value for this FlashRedirectOverlayCreative.
     * 
     * @return flashAssetSize   * The size of the flash asset. Note that this may differ from
     * {@link #size}
     *                     if the asset is not expected to fill the entire
     * video player. This attribute
     *                     is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.Size getFlashAssetSize() {
        return flashAssetSize;
    }


    /**
     * Sets the flashAssetSize value for this FlashRedirectOverlayCreative.
     * 
     * @param flashAssetSize   * The size of the flash asset. Note that this may differ from
     * {@link #size}
     *                     if the asset is not expected to fill the entire
     * video player. This attribute
     *                     is optional.
     */
    public void setFlashAssetSize(com.google.api.ads.dfp.axis.v201802.Size flashAssetSize) {
        this.flashAssetSize = flashAssetSize;
    }


    /**
     * Gets the vastPreviewUrl value for this FlashRedirectOverlayCreative.
     * 
     * @return vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public java.lang.String getVastPreviewUrl() {
        return vastPreviewUrl;
    }


    /**
     * Sets the vastPreviewUrl value for this FlashRedirectOverlayCreative.
     * 
     * @param vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public void setVastPreviewUrl(java.lang.String vastPreviewUrl) {
        this.vastPreviewUrl = vastPreviewUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlashRedirectOverlayCreative)) return false;
        FlashRedirectOverlayCreative other = (FlashRedirectOverlayCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds()))) &&
            ((this.trackingUrls==null && other.getTrackingUrls()==null) || 
             (this.trackingUrls!=null &&
              java.util.Arrays.equals(this.trackingUrls, other.getTrackingUrls()))) &&
            ((this.customParameters==null && other.getCustomParameters()==null) || 
             (this.customParameters!=null &&
              this.customParameters.equals(other.getCustomParameters()))) &&
            ((this.apiFramework==null && other.getApiFramework()==null) || 
             (this.apiFramework!=null &&
              this.apiFramework.equals(other.getApiFramework()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.flashAssetSize==null && other.getFlashAssetSize()==null) || 
             (this.flashAssetSize!=null &&
              this.flashAssetSize.equals(other.getFlashAssetSize()))) &&
            ((this.vastPreviewUrl==null && other.getVastPreviewUrl()==null) || 
             (this.vastPreviewUrl!=null &&
              this.vastPreviewUrl.equals(other.getVastPreviewUrl())));
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
        if (getCompanionCreativeIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanionCreativeIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanionCreativeIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomParameters() != null) {
            _hashCode += getCustomParameters().hashCode();
        }
        if (getApiFramework() != null) {
            _hashCode += getApiFramework().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getFlashAssetSize() != null) {
            _hashCode += getFlashAssetSize().hashCode();
        }
        if (getVastPreviewUrl() != null) {
            _hashCode += getVastPreviewUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlashRedirectOverlayCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FlashRedirectOverlayCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "trackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiFramework");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "apiFramework"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ApiFramework"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAssetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "flashAssetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "vastPreviewUrl"));
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
