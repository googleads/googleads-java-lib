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
 * VideoRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code Creative} that contains externally hosted video ads and
 * is served via VAST XML.
 */
public class VideoRedirectCreative  extends com.google.api.ads.dfp.axis.v201802.BaseVideoCreative  implements java.io.Serializable {
    /* The video creative assets. */
    private com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset[] videoAssets;

    /* The high quality mezzanine video asset. */
    private com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset mezzanineFile;

    public VideoRedirectCreative() {
    }

    public VideoRedirectCreative(
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
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.dfp.axis.v201802.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           com.google.api.ads.dfp.axis.v201802.SkippableAdType skippableAdType,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.dfp.axis.v201802.SslScanResult sslScanResult,
           com.google.api.ads.dfp.axis.v201802.SslManualOverride sslManualOverride,
           com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset[] videoAssets,
           com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset mezzanineFile) {
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
            duration,
            allowDurationOverride,
            trackingUrls,
            companionCreativeIds,
            customParameters,
            skippableAdType,
            vastPreviewUrl,
            sslScanResult,
            sslManualOverride);
        this.videoAssets = videoAssets;
        this.mezzanineFile = mezzanineFile;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiserId", getAdvertiserId())
            .add("allowDurationOverride", getAllowDurationOverride())
            .add("appliedLabels", getAppliedLabels())
            .add("companionCreativeIds", getCompanionCreativeIds())
            .add("customFieldValues", getCustomFieldValues())
            .add("customParameters", getCustomParameters())
            .add("destinationUrl", getDestinationUrl())
            .add("destinationUrlType", getDestinationUrlType())
            .add("duration", getDuration())
            .add("id", getId())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("mezzanineFile", getMezzanineFile())
            .add("name", getName())
            .add("policyViolations", getPolicyViolations())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("skippableAdType", getSkippableAdType())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("trackingUrls", getTrackingUrls())
            .add("vastPreviewUrl", getVastPreviewUrl())
            .add("videoAssets", getVideoAssets())
            .toString();
    }

    /**
     * Gets the videoAssets value for this VideoRedirectCreative.
     * 
     * @return videoAssets   * The video creative assets.
     */
    public com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset[] getVideoAssets() {
        return videoAssets;
    }


    /**
     * Sets the videoAssets value for this VideoRedirectCreative.
     * 
     * @param videoAssets   * The video creative assets.
     */
    public void setVideoAssets(com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset[] videoAssets) {
        this.videoAssets = videoAssets;
    }

    public com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset getVideoAssets(int i) {
        return this.videoAssets[i];
    }

    public void setVideoAssets(int i, com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset _value) {
        this.videoAssets[i] = _value;
    }


    /**
     * Gets the mezzanineFile value for this VideoRedirectCreative.
     * 
     * @return mezzanineFile   * The high quality mezzanine video asset.
     */
    public com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset getMezzanineFile() {
        return mezzanineFile;
    }


    /**
     * Sets the mezzanineFile value for this VideoRedirectCreative.
     * 
     * @param mezzanineFile   * The high quality mezzanine video asset.
     */
    public void setMezzanineFile(com.google.api.ads.dfp.axis.v201802.VideoRedirectAsset mezzanineFile) {
        this.mezzanineFile = mezzanineFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoRedirectCreative)) return false;
        VideoRedirectCreative other = (VideoRedirectCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.videoAssets==null && other.getVideoAssets()==null) || 
             (this.videoAssets!=null &&
              java.util.Arrays.equals(this.videoAssets, other.getVideoAssets()))) &&
            ((this.mezzanineFile==null && other.getMezzanineFile()==null) || 
             (this.mezzanineFile!=null &&
              this.mezzanineFile.equals(other.getMezzanineFile())));
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
        if (getVideoAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVideoAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVideoAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMezzanineFile() != null) {
            _hashCode += getMezzanineFile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "videoAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoRedirectAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mezzanineFile");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mezzanineFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoRedirectAsset"));
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
