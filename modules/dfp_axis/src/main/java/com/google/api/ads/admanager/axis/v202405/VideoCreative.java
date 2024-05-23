// Copyright 2024 Google LLC
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
 * VideoCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202405;


/**
 * A {@code Creative} that contains Ad Manager hosted video ads and
 * is served via VAST XML.
 */
public class VideoCreative  extends com.google.api.ads.admanager.axis.v202405.BaseVideoCreative  implements java.io.Serializable {
    /* A URL that points to the source media that will be used for
     * transcoding. */
    private java.lang.String videoSourceUrl;

    public VideoCreative() {
    }

    public VideoCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202405.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202405.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202405.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202405.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202405.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202405.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.String destinationUrl,
           com.google.api.ads.admanager.axis.v202405.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.admanager.axis.v202405.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           java.lang.String adId,
           com.google.api.ads.admanager.axis.v202405.AdIdType adIdType,
           com.google.api.ads.admanager.axis.v202405.SkippableAdType skippableAdType,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.admanager.axis.v202405.SslScanResult sslScanResult,
           com.google.api.ads.admanager.axis.v202405.SslManualOverride sslManualOverride,
           java.lang.String videoSourceUrl) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            policyLabels,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            thirdPartyDataDeclaration,
            destinationUrl,
            destinationUrlType,
            duration,
            allowDurationOverride,
            trackingUrls,
            companionCreativeIds,
            customParameters,
            adId,
            adIdType,
            skippableAdType,
            vastPreviewUrl,
            sslScanResult,
            sslManualOverride);
        this.videoSourceUrl = videoSourceUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adId", getAdId())
            .add("adIdType", getAdIdType())
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
            .add("name", getName())
            .add("policyLabels", getPolicyLabels())
            .add("previewUrl", getPreviewUrl())
            .add("size", getSize())
            .add("skippableAdType", getSkippableAdType())
            .add("sslManualOverride", getSslManualOverride())
            .add("sslScanResult", getSslScanResult())
            .add("thirdPartyDataDeclaration", getThirdPartyDataDeclaration())
            .add("trackingUrls", getTrackingUrls())
            .add("vastPreviewUrl", getVastPreviewUrl())
            .add("videoSourceUrl", getVideoSourceUrl())
            .toString();
    }

    /**
     * Gets the videoSourceUrl value for this VideoCreative.
     * 
     * @return videoSourceUrl   * A URL that points to the source media that will be used for
     * transcoding.
     */
    public java.lang.String getVideoSourceUrl() {
        return videoSourceUrl;
    }


    /**
     * Sets the videoSourceUrl value for this VideoCreative.
     * 
     * @param videoSourceUrl   * A URL that points to the source media that will be used for
     * transcoding.
     */
    public void setVideoSourceUrl(java.lang.String videoSourceUrl) {
        this.videoSourceUrl = videoSourceUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoCreative)) return false;
        VideoCreative other = (VideoCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.videoSourceUrl==null && other.getVideoSourceUrl()==null) || 
             (this.videoSourceUrl!=null &&
              this.videoSourceUrl.equals(other.getVideoSourceUrl())));
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
        if (getVideoSourceUrl() != null) {
            _hashCode += getVideoSourceUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202405", "VideoCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoSourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202405", "videoSourceUrl"));
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
