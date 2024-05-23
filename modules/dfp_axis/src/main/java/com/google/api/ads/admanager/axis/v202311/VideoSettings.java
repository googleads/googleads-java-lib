// Copyright 2023 Google LLC
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
 * VideoSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202311;


/**
 * Information about the video settings of an encoding profile.
 */
public class VideoSettings  implements java.io.Serializable {
    /* The RFC6381 codec string of the audio. */
    private java.lang.String codec;

    /* The bitrate of the video, in bits per second. This value must
     * be between 32kbps and 250 Mbps. */
    private java.lang.Long bitrate;

    /* The frames per second of the video. This value will be truncated
     * to three decimal places. */
    private java.lang.Double framesPerSecond;

    /* The resolution of the video, in pixels. */
    private com.google.api.ads.admanager.axis.v202311.Size resolution;

    public VideoSettings() {
    }

    public VideoSettings(
           java.lang.String codec,
           java.lang.Long bitrate,
           java.lang.Double framesPerSecond,
           com.google.api.ads.admanager.axis.v202311.Size resolution) {
           this.codec = codec;
           this.bitrate = bitrate;
           this.framesPerSecond = framesPerSecond;
           this.resolution = resolution;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bitrate", getBitrate())
            .add("codec", getCodec())
            .add("framesPerSecond", getFramesPerSecond())
            .add("resolution", getResolution())
            .toString();
    }

    /**
     * Gets the codec value for this VideoSettings.
     * 
     * @return codec   * The RFC6381 codec string of the audio.
     */
    public java.lang.String getCodec() {
        return codec;
    }


    /**
     * Sets the codec value for this VideoSettings.
     * 
     * @param codec   * The RFC6381 codec string of the audio.
     */
    public void setCodec(java.lang.String codec) {
        this.codec = codec;
    }


    /**
     * Gets the bitrate value for this VideoSettings.
     * 
     * @return bitrate   * The bitrate of the video, in bits per second. This value must
     * be between 32kbps and 250 Mbps.
     */
    public java.lang.Long getBitrate() {
        return bitrate;
    }


    /**
     * Sets the bitrate value for this VideoSettings.
     * 
     * @param bitrate   * The bitrate of the video, in bits per second. This value must
     * be between 32kbps and 250 Mbps.
     */
    public void setBitrate(java.lang.Long bitrate) {
        this.bitrate = bitrate;
    }


    /**
     * Gets the framesPerSecond value for this VideoSettings.
     * 
     * @return framesPerSecond   * The frames per second of the video. This value will be truncated
     * to three decimal places.
     */
    public java.lang.Double getFramesPerSecond() {
        return framesPerSecond;
    }


    /**
     * Sets the framesPerSecond value for this VideoSettings.
     * 
     * @param framesPerSecond   * The frames per second of the video. This value will be truncated
     * to three decimal places.
     */
    public void setFramesPerSecond(java.lang.Double framesPerSecond) {
        this.framesPerSecond = framesPerSecond;
    }


    /**
     * Gets the resolution value for this VideoSettings.
     * 
     * @return resolution   * The resolution of the video, in pixels.
     */
    public com.google.api.ads.admanager.axis.v202311.Size getResolution() {
        return resolution;
    }


    /**
     * Sets the resolution value for this VideoSettings.
     * 
     * @param resolution   * The resolution of the video, in pixels.
     */
    public void setResolution(com.google.api.ads.admanager.axis.v202311.Size resolution) {
        this.resolution = resolution;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoSettings)) return false;
        VideoSettings other = (VideoSettings) obj;
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
            ((this.framesPerSecond==null && other.getFramesPerSecond()==null) || 
             (this.framesPerSecond!=null &&
              this.framesPerSecond.equals(other.getFramesPerSecond()))) &&
            ((this.resolution==null && other.getResolution()==null) || 
             (this.resolution!=null &&
              this.resolution.equals(other.getResolution())));
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
        if (getFramesPerSecond() != null) {
            _hashCode += getFramesPerSecond().hashCode();
        }
        if (getResolution() != null) {
            _hashCode += getResolution().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "VideoSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codec");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "codec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitrate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "bitrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("framesPerSecond");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "framesPerSecond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolution");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "resolution"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202311", "Size"));
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
