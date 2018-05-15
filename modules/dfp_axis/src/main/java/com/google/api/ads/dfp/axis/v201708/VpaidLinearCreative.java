// Copyright 2017 Google Inc. All Rights Reserved.
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
 * VpaidLinearCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201708;


/**
 * A {@code Creative} that displays a DFP-hosted Flash-based ad and
 * is served via VAST XML. It
 *             is displayed in a linear fashion with a video (before,
 * after, interrupting). This creative is
 *             read only.
 *             <p>
 *             This creative type has been deprecated as part of the
 * Flash deprecation.
 */
public class VpaidLinearCreative  extends com.google.api.ads.dfp.axis.v201708.HasDestinationUrlCreative  implements java.io.Serializable {
    /* Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional. */
    private long[] companionCreativeIds;

    /* A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201708.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls;

    /* A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional. */
    private java.lang.String customParameters;

    /* Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional. */
    private java.lang.Integer duration;

    /* An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only. */
    private java.lang.String vastPreviewUrl;

    /* The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google. */
    private com.google.api.ads.dfp.axis.v201708.SslScanResult sslScanResult;

    /* The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}. */
    private com.google.api.ads.dfp.axis.v201708.SslManualOverride sslManualOverride;

    /* The Flash asset. This attribute is required. To view the Flash
     * image, use the
     *                     {@link CreativeAsset#assetUrl}. */
    private com.google.api.ads.dfp.axis.v201708.CreativeAsset flashAsset;

    public VpaidLinearCreative() {
    }

    public VpaidLinearCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201708.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201708.CreativePolicyViolation[] policyViolations,
           com.google.api.ads.dfp.axis.v201708.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201708.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201708.BaseCustomFieldValue[] customFieldValues,
           java.lang.String destinationUrl,
           com.google.api.ads.dfp.axis.v201708.DestinationUrlType destinationUrlType,
           java.lang.Boolean overrideSize,
           long[] companionCreativeIds,
           com.google.api.ads.dfp.axis.v201708.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           java.lang.String customParameters,
           java.lang.Integer duration,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.dfp.axis.v201708.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201708.SslManualOverride sslManualOverride,
           com.google.api.ads.dfp.axis.v201708.CreativeAsset flashAsset) {
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
        this.companionCreativeIds = companionCreativeIds;
        this.trackingUrls = trackingUrls;
        this.customParameters = customParameters;
        this.duration = duration;
        this.vastPreviewUrl = vastPreviewUrl;
        this.sslScanResult = sslScanResult;
        this.sslManualOverride = sslManualOverride;
        this.flashAsset = flashAsset;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("appliedLabels", getAppliedLabels())
            .add("companionCreativeIds", getCompanionCreativeIds())
            .add("customFieldValues", getCustomFieldValues())
            .add("customParameters", getCustomParameters())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("duration", getDuration())
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
            .add("trackingUrls", getTrackingUrls())
            .add("vastPreviewUrl", getVastPreviewUrl())
            .toString();
    }

    /**
     * Gets the overrideSize value for this VpaidLinearCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this VpaidLinearCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the companionCreativeIds value for this VpaidLinearCreative.
     * 
     * @return companionCreativeIds   * The IDs of the companion creatives that are associated with
     * this creative.
     *                     This attribute is optional.
     */
    public long[] getCompanionCreativeIds() {
        return companionCreativeIds;
    }


    /**
     * Sets the companionCreativeIds value for this VpaidLinearCreative.
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
     * Gets the trackingUrls value for this VpaidLinearCreative.
     * 
     * @return trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201708.ConversionEvent_TrackingUrlsMapEntry[] getTrackingUrls() {
        return trackingUrls;
    }


    /**
     * Sets the trackingUrls value for this VpaidLinearCreative.
     * 
     * @param trackingUrls   * A map from {@code ConversionEvent} to a list of URLs that will
     * be pinged
     *                     when the event happens. This attribute is optional.
     */
    public void setTrackingUrls(com.google.api.ads.dfp.axis.v201708.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public com.google.api.ads.dfp.axis.v201708.ConversionEvent_TrackingUrlsMapEntry getTrackingUrls(int i) {
        return this.trackingUrls[i];
    }

    public void setTrackingUrls(int i, com.google.api.ads.dfp.axis.v201708.ConversionEvent_TrackingUrlsMapEntry _value) {
        this.trackingUrls[i] = _value;
    }


    /**
     * Gets the customParameters value for this VpaidLinearCreative.
     * 
     * @return customParameters   * A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional.
     */
    public java.lang.String getCustomParameters() {
        return customParameters;
    }


    /**
     * Sets the customParameters value for this VpaidLinearCreative.
     * 
     * @param customParameters   * A string that is supplied to the VPAID creative's init function.
     * This is written into the VAST XML in the {@code AdParameters} section.
     * This attribute is optional.
     */
    public void setCustomParameters(java.lang.String customParameters) {
        this.customParameters = customParameters;
    }


    /**
     * Gets the duration value for this VpaidLinearCreative.
     * 
     * @return duration   * Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VpaidLinearCreative.
     * 
     * @param duration   * Duration in milliseconds for the vpaid ad given no user interaction.
     * This attribute is optional.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the vastPreviewUrl value for this VpaidLinearCreative.
     * 
     * @return vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public java.lang.String getVastPreviewUrl() {
        return vastPreviewUrl;
    }


    /**
     * Sets the vastPreviewUrl value for this VpaidLinearCreative.
     * 
     * @param vastPreviewUrl   * An ad tag URL that will return a preview of the VAST XML response
     * specific
     *                     to this creative.  This attribute is read-only.
     */
    public void setVastPreviewUrl(java.lang.String vastPreviewUrl) {
        this.vastPreviewUrl = vastPreviewUrl;
    }


    /**
     * Gets the sslScanResult value for this VpaidLinearCreative.
     * 
     * @return sslScanResult   * The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201708.SslScanResult getSslScanResult() {
        return sslScanResult;
    }


    /**
     * Sets the sslScanResult value for this VpaidLinearCreative.
     * 
     * @param sslScanResult   * The SSL compatibility scan result of this creative.
     *                     
     *                     <p>This attribute is read-only and determined
     * by Google.
     */
    public void setSslScanResult(com.google.api.ads.dfp.axis.v201708.SslScanResult sslScanResult) {
        this.sslScanResult = sslScanResult;
    }


    /**
     * Gets the sslManualOverride value for this VpaidLinearCreative.
     * 
     * @return sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public com.google.api.ads.dfp.axis.v201708.SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }


    /**
     * Sets the sslManualOverride value for this VpaidLinearCreative.
     * 
     * @param sslManualOverride   * The manual override for the SSL compatibility of this creative.
     * 
     *                     <p>This attribute is optional and defaults to
     * {@link SslManualOverride#NO_OVERRIDE}.
     */
    public void setSslManualOverride(com.google.api.ads.dfp.axis.v201708.SslManualOverride sslManualOverride) {
        this.sslManualOverride = sslManualOverride;
    }


    /**
     * Gets the flashAsset value for this VpaidLinearCreative.
     * 
     * @return flashAsset   * The Flash asset. This attribute is required. To view the Flash
     * image, use the
     *                     {@link CreativeAsset#assetUrl}.
     */
    public com.google.api.ads.dfp.axis.v201708.CreativeAsset getFlashAsset() {
        return flashAsset;
    }


    /**
     * Sets the flashAsset value for this VpaidLinearCreative.
     * 
     * @param flashAsset   * The Flash asset. This attribute is required. To view the Flash
     * image, use the
     *                     {@link CreativeAsset#assetUrl}.
     */
    public void setFlashAsset(com.google.api.ads.dfp.axis.v201708.CreativeAsset flashAsset) {
        this.flashAsset = flashAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VpaidLinearCreative)) return false;
        VpaidLinearCreative other = (VpaidLinearCreative) obj;
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
            ((this.companionCreativeIds==null && other.getCompanionCreativeIds()==null) || 
             (this.companionCreativeIds!=null &&
              java.util.Arrays.equals(this.companionCreativeIds, other.getCompanionCreativeIds()))) &&
            ((this.trackingUrls==null && other.getTrackingUrls()==null) || 
             (this.trackingUrls!=null &&
              java.util.Arrays.equals(this.trackingUrls, other.getTrackingUrls()))) &&
            ((this.customParameters==null && other.getCustomParameters()==null) || 
             (this.customParameters!=null &&
              this.customParameters.equals(other.getCustomParameters()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.vastPreviewUrl==null && other.getVastPreviewUrl()==null) || 
             (this.vastPreviewUrl!=null &&
              this.vastPreviewUrl.equals(other.getVastPreviewUrl()))) &&
            ((this.sslScanResult==null && other.getSslScanResult()==null) || 
             (this.sslScanResult!=null &&
              this.sslScanResult.equals(other.getSslScanResult()))) &&
            ((this.sslManualOverride==null && other.getSslManualOverride()==null) || 
             (this.sslManualOverride!=null &&
              this.sslManualOverride.equals(other.getSslManualOverride()))) &&
            ((this.flashAsset==null && other.getFlashAsset()==null) || 
             (this.flashAsset!=null &&
              this.flashAsset.equals(other.getFlashAsset())));
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
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getVastPreviewUrl() != null) {
            _hashCode += getVastPreviewUrl().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VpaidLinearCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "VpaidLinearCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionCreativeIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "companionCreativeIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "trackingUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "ConversionEvent_TrackingUrlsMapEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "customParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vastPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "vastPreviewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslScanResult");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "sslScanResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "SslScanResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslManualOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "sslManualOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "SslManualOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "flashAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201708", "CreativeAsset"));
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
