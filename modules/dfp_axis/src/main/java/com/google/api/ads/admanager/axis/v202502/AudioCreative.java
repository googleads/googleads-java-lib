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
 * AudioCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;


/**
 * A {@code Creative} that contains Ad Manager hosted audio ads and
 * is served via VAST XML. This
 *             creative is read-only.
 */
public class AudioCreative  extends com.google.api.ads.admanager.axis.v202502.BaseAudioCreative  implements java.io.Serializable {
    /* A URL that points to the source media that will be used for
     * transcoding. */
    private java.lang.String audioSourceUrl;

    public AudioCreative() {
    }

    public AudioCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202502.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202502.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202502.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled,
           java.lang.String destinationUrl,
           com.google.api.ads.admanager.axis.v202502.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.admanager.axis.v202502.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           java.lang.String adId,
           com.google.api.ads.admanager.axis.v202502.AdIdType adIdType,
           com.google.api.ads.admanager.axis.v202502.SkippableAdType skippableAdType,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.admanager.axis.v202502.SslScanResult sslScanResult,
           com.google.api.ads.admanager.axis.v202502.SslManualOverride sslManualOverride,
           java.lang.String audioSourceUrl) {
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
            adBadgingEnabled,
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
        this.audioSourceUrl = audioSourceUrl;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adBadgingEnabled", getAdBadgingEnabled())
            .add("adId", getAdId())
            .add("adIdType", getAdIdType())
            .add("advertiserId", getAdvertiserId())
            .add("allowDurationOverride", getAllowDurationOverride())
            .add("appliedLabels", getAppliedLabels())
            .add("audioSourceUrl", getAudioSourceUrl())
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
            .toString();
    }

    /**
     * Gets the audioSourceUrl value for this AudioCreative.
     * 
     * @return audioSourceUrl   * A URL that points to the source media that will be used for
     * transcoding.
     */
    public java.lang.String getAudioSourceUrl() {
        return audioSourceUrl;
    }


    /**
     * Sets the audioSourceUrl value for this AudioCreative.
     * 
     * @param audioSourceUrl   * A URL that points to the source media that will be used for
     * transcoding.
     */
    public void setAudioSourceUrl(java.lang.String audioSourceUrl) {
        this.audioSourceUrl = audioSourceUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudioCreative)) return false;
        AudioCreative other = (AudioCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audioSourceUrl==null && other.getAudioSourceUrl()==null) || 
             (this.audioSourceUrl!=null &&
              this.audioSourceUrl.equals(other.getAudioSourceUrl())));
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
        if (getAudioSourceUrl() != null) {
            _hashCode += getAudioSourceUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudioCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "AudioCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioSourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "audioSourceUrl"));
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
