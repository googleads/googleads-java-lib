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
 * AudioRedirectCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;


/**
 * A {@code Creative} that contains externally hosted audio ads and
 * is served via VAST XML.
 */
public class AudioRedirectCreative  extends com.google.api.ads.admanager.axis.v202411.BaseAudioCreative  implements java.io.Serializable {
    /* The audio creative assets. */
    private com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset[] audioAssets;

    /* The high quality mezzanine audio asset. */
    private com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset mezzanineFile;

    public AudioRedirectCreative() {
    }

    public AudioRedirectCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202411.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.admanager.axis.v202411.CreativePolicyViolation[] policyLabels,
           com.google.api.ads.admanager.axis.v202411.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202411.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202411.ThirdPartyDataDeclaration thirdPartyDataDeclaration,
           java.lang.Boolean adBadgingEnabled,
           java.lang.String destinationUrl,
           com.google.api.ads.admanager.axis.v202411.DestinationUrlType destinationUrlType,
           java.lang.Integer duration,
           java.lang.Boolean allowDurationOverride,
           com.google.api.ads.admanager.axis.v202411.ConversionEvent_TrackingUrlsMapEntry[] trackingUrls,
           long[] companionCreativeIds,
           java.lang.String customParameters,
           java.lang.String adId,
           com.google.api.ads.admanager.axis.v202411.AdIdType adIdType,
           com.google.api.ads.admanager.axis.v202411.SkippableAdType skippableAdType,
           java.lang.String vastPreviewUrl,
           com.google.api.ads.admanager.axis.v202411.SslScanResult sslScanResult,
           com.google.api.ads.admanager.axis.v202411.SslManualOverride sslManualOverride,
           com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset[] audioAssets,
           com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset mezzanineFile) {
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
        this.audioAssets = audioAssets;
        this.mezzanineFile = mezzanineFile;
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
            .add("audioAssets", getAudioAssets())
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
     * Gets the audioAssets value for this AudioRedirectCreative.
     * 
     * @return audioAssets   * The audio creative assets.
     */
    public com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset[] getAudioAssets() {
        return audioAssets;
    }


    /**
     * Sets the audioAssets value for this AudioRedirectCreative.
     * 
     * @param audioAssets   * The audio creative assets.
     */
    public void setAudioAssets(com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset[] audioAssets) {
        this.audioAssets = audioAssets;
    }

    public com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset getAudioAssets(int i) {
        return this.audioAssets[i];
    }

    public void setAudioAssets(int i, com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset _value) {
        this.audioAssets[i] = _value;
    }


    /**
     * Gets the mezzanineFile value for this AudioRedirectCreative.
     * 
     * @return mezzanineFile   * The high quality mezzanine audio asset.
     */
    public com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset getMezzanineFile() {
        return mezzanineFile;
    }


    /**
     * Sets the mezzanineFile value for this AudioRedirectCreative.
     * 
     * @param mezzanineFile   * The high quality mezzanine audio asset.
     */
    public void setMezzanineFile(com.google.api.ads.admanager.axis.v202411.VideoRedirectAsset mezzanineFile) {
        this.mezzanineFile = mezzanineFile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudioRedirectCreative)) return false;
        AudioRedirectCreative other = (AudioRedirectCreative) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audioAssets==null && other.getAudioAssets()==null) || 
             (this.audioAssets!=null &&
              java.util.Arrays.equals(this.audioAssets, other.getAudioAssets()))) &&
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
        if (getAudioAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudioAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudioAssets(), i);
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
        new org.apache.axis.description.TypeDesc(AudioRedirectCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AudioRedirectCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audioAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "audioAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "VideoRedirectAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mezzanineFile");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "mezzanineFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "VideoRedirectAsset"));
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
