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
 * AudioSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;


/**
 * Information about the audio settings of an encoding profile.
 */
public class AudioSettings  implements java.io.Serializable {
    /* The RFC6381 codec string of the audio. */
    private java.lang.String codec;

    /* The bitrate of the audio, in bits per second. Required. This
     * value must be between 8kbps and
     *                 250 Mbps. */
    private java.lang.Long bitrate;

    /* The number of audio channels, including low frequency channels.
     * This value has a maximum of 8. */
    private java.lang.Long channels;

    /* The audio sample rate in hertz. Must be between 44kHz and 100kHz. */
    private java.lang.Long sampleRateHertz;

    public AudioSettings() {
    }

    public AudioSettings(
           java.lang.String codec,
           java.lang.Long bitrate,
           java.lang.Long channels,
           java.lang.Long sampleRateHertz) {
           this.codec = codec;
           this.bitrate = bitrate;
           this.channels = channels;
           this.sampleRateHertz = sampleRateHertz;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bitrate", getBitrate())
            .add("channels", getChannels())
            .add("codec", getCodec())
            .add("sampleRateHertz", getSampleRateHertz())
            .toString();
    }

    /**
     * Gets the codec value for this AudioSettings.
     * 
     * @return codec   * The RFC6381 codec string of the audio.
     */
    public java.lang.String getCodec() {
        return codec;
    }


    /**
     * Sets the codec value for this AudioSettings.
     * 
     * @param codec   * The RFC6381 codec string of the audio.
     */
    public void setCodec(java.lang.String codec) {
        this.codec = codec;
    }


    /**
     * Gets the bitrate value for this AudioSettings.
     * 
     * @return bitrate   * The bitrate of the audio, in bits per second. Required. This
     * value must be between 8kbps and
     *                 250 Mbps.
     */
    public java.lang.Long getBitrate() {
        return bitrate;
    }


    /**
     * Sets the bitrate value for this AudioSettings.
     * 
     * @param bitrate   * The bitrate of the audio, in bits per second. Required. This
     * value must be between 8kbps and
     *                 250 Mbps.
     */
    public void setBitrate(java.lang.Long bitrate) {
        this.bitrate = bitrate;
    }


    /**
     * Gets the channels value for this AudioSettings.
     * 
     * @return channels   * The number of audio channels, including low frequency channels.
     * This value has a maximum of 8.
     */
    public java.lang.Long getChannels() {
        return channels;
    }


    /**
     * Sets the channels value for this AudioSettings.
     * 
     * @param channels   * The number of audio channels, including low frequency channels.
     * This value has a maximum of 8.
     */
    public void setChannels(java.lang.Long channels) {
        this.channels = channels;
    }


    /**
     * Gets the sampleRateHertz value for this AudioSettings.
     * 
     * @return sampleRateHertz   * The audio sample rate in hertz. Must be between 44kHz and 100kHz.
     */
    public java.lang.Long getSampleRateHertz() {
        return sampleRateHertz;
    }


    /**
     * Sets the sampleRateHertz value for this AudioSettings.
     * 
     * @param sampleRateHertz   * The audio sample rate in hertz. Must be between 44kHz and 100kHz.
     */
    public void setSampleRateHertz(java.lang.Long sampleRateHertz) {
        this.sampleRateHertz = sampleRateHertz;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudioSettings)) return false;
        AudioSettings other = (AudioSettings) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codec==null && other.getCodec()==null) || 
             (this.codec!=null &&
              this.codec.equals(other.getCodec()))) &&
            ((this.bitrate==null && other.getBitrate()==null) || 
             (this.bitrate!=null &&
              this.bitrate.equals(other.getBitrate()))) &&
            ((this.channels==null && other.getChannels()==null) || 
             (this.channels!=null &&
              this.channels.equals(other.getChannels()))) &&
            ((this.sampleRateHertz==null && other.getSampleRateHertz()==null) || 
             (this.sampleRateHertz!=null &&
              this.sampleRateHertz.equals(other.getSampleRateHertz())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodec() != null) {
            _hashCode += getCodec().hashCode();
        }
        if (getBitrate() != null) {
            _hashCode += getBitrate().hashCode();
        }
        if (getChannels() != null) {
            _hashCode += getChannels().hashCode();
        }
        if (getSampleRateHertz() != null) {
            _hashCode += getSampleRateHertz().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudioSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "AudioSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "codec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitrate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "bitrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "channels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleRateHertz");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "sampleRateHertz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
