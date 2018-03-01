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
 * Audio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Encapsulates an Audio media identified by a MediaId.
 */
public class Audio  extends com.google.api.ads.adwords.axis.v201802.cm.Media  implements java.io.Serializable {
    /* The duration of the associated audio, in milliseconds.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DurationMillis".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.Long durationMillis;

    /* The streaming URL of the audio.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "StreamingUrl".</span> */
    private java.lang.String streamingUrl;

    /* Indicates whether the audio is ready to play on the web.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ReadyToPlayOnTheWeb".</span> */
    private java.lang.Boolean readyToPlayOnTheWeb;

    public Audio() {
    }

    public Audio(
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
           java.lang.Boolean readyToPlayOnTheWeb) {
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
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creationTime", getCreationTime())
            .add("dimensions", getDimensions())
            .add("durationMillis", getDurationMillis())
            .add("fileSize", getFileSize())
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
            .toString();
    }

    /**
     * Gets the durationMillis value for this Audio.
     * 
     * @return durationMillis   * The duration of the associated audio, in milliseconds.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DurationMillis".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.Long getDurationMillis() {
        return durationMillis;
    }


    /**
     * Sets the durationMillis value for this Audio.
     * 
     * @param durationMillis   * The duration of the associated audio, in milliseconds.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "DurationMillis".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setDurationMillis(java.lang.Long durationMillis) {
        this.durationMillis = durationMillis;
    }


    /**
     * Gets the streamingUrl value for this Audio.
     * 
     * @return streamingUrl   * The streaming URL of the audio.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "StreamingUrl".</span>
     */
    public java.lang.String getStreamingUrl() {
        return streamingUrl;
    }


    /**
     * Sets the streamingUrl value for this Audio.
     * 
     * @param streamingUrl   * The streaming URL of the audio.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "StreamingUrl".</span>
     */
    public void setStreamingUrl(java.lang.String streamingUrl) {
        this.streamingUrl = streamingUrl;
    }


    /**
     * Gets the readyToPlayOnTheWeb value for this Audio.
     * 
     * @return readyToPlayOnTheWeb   * Indicates whether the audio is ready to play on the web.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ReadyToPlayOnTheWeb".</span>
     */
    public java.lang.Boolean getReadyToPlayOnTheWeb() {
        return readyToPlayOnTheWeb;
    }


    /**
     * Sets the readyToPlayOnTheWeb value for this Audio.
     * 
     * @param readyToPlayOnTheWeb   * Indicates whether the audio is ready to play on the web.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "ReadyToPlayOnTheWeb".</span>
     */
    public void setReadyToPlayOnTheWeb(java.lang.Boolean readyToPlayOnTheWeb) {
        this.readyToPlayOnTheWeb = readyToPlayOnTheWeb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Audio)) return false;
        Audio other = (Audio) obj;
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
              this.readyToPlayOnTheWeb.equals(other.getReadyToPlayOnTheWeb())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Audio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Audio"));
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
