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
 * Video.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Encapsulates a Video media identified by a MediaId.
 */
public class Video  extends com.google.api.ads.adwords.axis.v201802.cm.Media  implements java.io.Serializable {
    /* The duration of the associated video, in milliseconds. */
    private java.lang.Long durationMillis;

    /* Streaming URL for the video. */
    private java.lang.String streamingUrl;

    /* Indicates whether the video is ready to play on the web. */
    private java.lang.Boolean readyToPlayOnTheWeb;

    /* The Industry Standard Commercial Identifier code for this media,
     * used
     *                     mainly for television commercials. */
    private java.lang.String industryStandardCommercialIdentifier;

    /* The Advertising Digital Identification code for this media,
     * as defined by
     *                     the American Association of Advertising Agencies,
     * used mainly for
     *                     television commercials. */
    private java.lang.String advertisingId;

    /* For YouTube-hosted videos, the YouTube video ID (as seen in
     * YouTube URLs)
     *                     may also be filled in. */
    private java.lang.String youTubeVideoIdString;

    public Video() {
    }

    public Video(
           java.lang.Long mediaId,
           com.google.api.ads.adwords.axis.v201802.cm.MediaMediaType type,
           java.lang.Long referenceId,
           com.google.api.ads.adwords.axis.v201802.cm.Media_Size_DimensionsMapEntry[] dimensions,
           com.google.api.ads.adwords.axis.v201802.cm.Media_Size_StringMapEntry[] urls,
           com.google.api.ads.adwords.axis.v201802.cm.MediaMimeType mimeType,
           java.lang.String sourceUrl,
           java.lang.String name,
           java.lang.Long fileSize,
           java.lang.String creationTime,
           java.lang.String mediaType,
           java.lang.Long durationMillis,
           java.lang.String streamingUrl,
           java.lang.Boolean readyToPlayOnTheWeb,
           java.lang.String industryStandardCommercialIdentifier,
           java.lang.String advertisingId,
           java.lang.String youTubeVideoIdString) {
        super(
            mediaId,
            type,
            referenceId,
            dimensions,
            urls,
            mimeType,
            sourceUrl,
            name,
            fileSize,
            creationTime,
            mediaType);
        this.durationMillis = durationMillis;
        this.streamingUrl = streamingUrl;
        this.readyToPlayOnTheWeb = readyToPlayOnTheWeb;
        this.industryStandardCommercialIdentifier = industryStandardCommercialIdentifier;
        this.advertisingId = advertisingId;
        this.youTubeVideoIdString = youTubeVideoIdString;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertisingId", getAdvertisingId())
            .add("creationTime", getCreationTime())
            .add("dimensions", getDimensions())
            .add("durationMillis", getDurationMillis())
            .add("fileSize", getFileSize())
            .add("industryStandardCommercialIdentifier", getIndustryStandardCommercialIdentifier())
            .add("mediaId", getMediaId())
            .add("mediaType", getMediaType())
            .add("mimeType", getMimeType())
            .add("name", getName())
            .add("readyToPlayOnTheWeb", getReadyToPlayOnTheWeb())
            .add("referenceId", getReferenceId())
            .add("sourceUrl", getSourceUrl())
            .add("streamingUrl", getStreamingUrl())
            .add("type", getType())
            .add("urls", getUrls())
            .add("youTubeVideoIdString", getYouTubeVideoIdString())
            .toString();
    }

    /**
     * Gets the durationMillis value for this Video.
     * 
     * @return durationMillis   * The duration of the associated video, in milliseconds.
     */
    public java.lang.Long getDurationMillis() {
        return durationMillis;
    }


    /**
     * Sets the durationMillis value for this Video.
     * 
     * @param durationMillis   * The duration of the associated video, in milliseconds.
     */
    public void setDurationMillis(java.lang.Long durationMillis) {
        this.durationMillis = durationMillis;
    }


    /**
     * Gets the streamingUrl value for this Video.
     * 
     * @return streamingUrl   * Streaming URL for the video.
     */
    public java.lang.String getStreamingUrl() {
        return streamingUrl;
    }


    /**
     * Sets the streamingUrl value for this Video.
     * 
     * @param streamingUrl   * Streaming URL for the video.
     */
    public void setStreamingUrl(java.lang.String streamingUrl) {
        this.streamingUrl = streamingUrl;
    }


    /**
     * Gets the readyToPlayOnTheWeb value for this Video.
     * 
     * @return readyToPlayOnTheWeb   * Indicates whether the video is ready to play on the web.
     */
    public java.lang.Boolean getReadyToPlayOnTheWeb() {
        return readyToPlayOnTheWeb;
    }


    /**
     * Sets the readyToPlayOnTheWeb value for this Video.
     * 
     * @param readyToPlayOnTheWeb   * Indicates whether the video is ready to play on the web.
     */
    public void setReadyToPlayOnTheWeb(java.lang.Boolean readyToPlayOnTheWeb) {
        this.readyToPlayOnTheWeb = readyToPlayOnTheWeb;
    }


    /**
     * Gets the industryStandardCommercialIdentifier value for this Video.
     * 
     * @return industryStandardCommercialIdentifier   * The Industry Standard Commercial Identifier code for this media,
     * used
     *                     mainly for television commercials.
     */
    public java.lang.String getIndustryStandardCommercialIdentifier() {
        return industryStandardCommercialIdentifier;
    }


    /**
     * Sets the industryStandardCommercialIdentifier value for this Video.
     * 
     * @param industryStandardCommercialIdentifier   * The Industry Standard Commercial Identifier code for this media,
     * used
     *                     mainly for television commercials.
     */
    public void setIndustryStandardCommercialIdentifier(java.lang.String industryStandardCommercialIdentifier) {
        this.industryStandardCommercialIdentifier = industryStandardCommercialIdentifier;
    }


    /**
     * Gets the advertisingId value for this Video.
     * 
     * @return advertisingId   * The Advertising Digital Identification code for this media,
     * as defined by
     *                     the American Association of Advertising Agencies,
     * used mainly for
     *                     television commercials.
     */
    public java.lang.String getAdvertisingId() {
        return advertisingId;
    }


    /**
     * Sets the advertisingId value for this Video.
     * 
     * @param advertisingId   * The Advertising Digital Identification code for this media,
     * as defined by
     *                     the American Association of Advertising Agencies,
     * used mainly for
     *                     television commercials.
     */
    public void setAdvertisingId(java.lang.String advertisingId) {
        this.advertisingId = advertisingId;
    }


    /**
     * Gets the youTubeVideoIdString value for this Video.
     * 
     * @return youTubeVideoIdString   * For YouTube-hosted videos, the YouTube video ID (as seen in
     * YouTube URLs)
     *                     may also be filled in.
     */
    public java.lang.String getYouTubeVideoIdString() {
        return youTubeVideoIdString;
    }


    /**
     * Sets the youTubeVideoIdString value for this Video.
     * 
     * @param youTubeVideoIdString   * For YouTube-hosted videos, the YouTube video ID (as seen in
     * YouTube URLs)
     *                     may also be filled in.
     */
    public void setYouTubeVideoIdString(java.lang.String youTubeVideoIdString) {
        this.youTubeVideoIdString = youTubeVideoIdString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Video)) return false;
        Video other = (Video) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.durationMillis==null && other.getDurationMillis()==null) || 
             (this.durationMillis!=null &&
              this.durationMillis.equals(other.getDurationMillis()))) &&
            ((this.streamingUrl==null && other.getStreamingUrl()==null) || 
             (this.streamingUrl!=null &&
              this.streamingUrl.equals(other.getStreamingUrl()))) &&
            ((this.readyToPlayOnTheWeb==null && other.getReadyToPlayOnTheWeb()==null) || 
             (this.readyToPlayOnTheWeb!=null &&
              this.readyToPlayOnTheWeb.equals(other.getReadyToPlayOnTheWeb()))) &&
            ((this.industryStandardCommercialIdentifier==null && other.getIndustryStandardCommercialIdentifier()==null) || 
             (this.industryStandardCommercialIdentifier!=null &&
              this.industryStandardCommercialIdentifier.equals(other.getIndustryStandardCommercialIdentifier()))) &&
            ((this.advertisingId==null && other.getAdvertisingId()==null) || 
             (this.advertisingId!=null &&
              this.advertisingId.equals(other.getAdvertisingId()))) &&
            ((this.youTubeVideoIdString==null && other.getYouTubeVideoIdString()==null) || 
             (this.youTubeVideoIdString!=null &&
              this.youTubeVideoIdString.equals(other.getYouTubeVideoIdString())));
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
        if (getDurationMillis() != null) {
            _hashCode += getDurationMillis().hashCode();
        }
        if (getStreamingUrl() != null) {
            _hashCode += getStreamingUrl().hashCode();
        }
        if (getReadyToPlayOnTheWeb() != null) {
            _hashCode += getReadyToPlayOnTheWeb().hashCode();
        }
        if (getIndustryStandardCommercialIdentifier() != null) {
            _hashCode += getIndustryStandardCommercialIdentifier().hashCode();
        }
        if (getAdvertisingId() != null) {
            _hashCode += getAdvertisingId().hashCode();
        }
        if (getYouTubeVideoIdString() != null) {
            _hashCode += getYouTubeVideoIdString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Video.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Video"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("durationMillis");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "durationMillis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streamingUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "streamingUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readyToPlayOnTheWeb");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "readyToPlayOnTheWeb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryStandardCommercialIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "industryStandardCommercialIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertisingId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "advertisingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youTubeVideoIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "youTubeVideoIdString"));
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
