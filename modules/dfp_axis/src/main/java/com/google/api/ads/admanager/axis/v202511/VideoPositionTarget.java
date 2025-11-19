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
 * VideoPositionTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;

public class VideoPositionTarget  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202511.VideoPosition videoPosition;

    private com.google.api.ads.admanager.axis.v202511.VideoBumperType videoBumperType;

    private com.google.api.ads.admanager.axis.v202511.VideoPositionWithinPod videoPositionWithinPod;

    private java.lang.Long adSpotId;

    public VideoPositionTarget() {
    }

    public VideoPositionTarget(
           com.google.api.ads.admanager.axis.v202511.VideoPosition videoPosition,
           com.google.api.ads.admanager.axis.v202511.VideoBumperType videoBumperType,
           com.google.api.ads.admanager.axis.v202511.VideoPositionWithinPod videoPositionWithinPod,
           java.lang.Long adSpotId) {
           this.videoPosition = videoPosition;
           this.videoBumperType = videoBumperType;
           this.videoPositionWithinPod = videoPositionWithinPod;
           this.adSpotId = adSpotId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adSpotId", getAdSpotId())
            .add("videoBumperType", getVideoBumperType())
            .add("videoPosition", getVideoPosition())
            .add("videoPositionWithinPod", getVideoPositionWithinPod())
            .toString();
    }

    /**
     * Gets the videoPosition value for this VideoPositionTarget.
     * 
     * @return videoPosition
     */
    public com.google.api.ads.admanager.axis.v202511.VideoPosition getVideoPosition() {
        return videoPosition;
    }


    /**
     * Sets the videoPosition value for this VideoPositionTarget.
     * 
     * @param videoPosition
     */
    public void setVideoPosition(com.google.api.ads.admanager.axis.v202511.VideoPosition videoPosition) {
        this.videoPosition = videoPosition;
    }


    /**
     * Gets the videoBumperType value for this VideoPositionTarget.
     * 
     * @return videoBumperType
     */
    public com.google.api.ads.admanager.axis.v202511.VideoBumperType getVideoBumperType() {
        return videoBumperType;
    }


    /**
     * Sets the videoBumperType value for this VideoPositionTarget.
     * 
     * @param videoBumperType
     */
    public void setVideoBumperType(com.google.api.ads.admanager.axis.v202511.VideoBumperType videoBumperType) {
        this.videoBumperType = videoBumperType;
    }


    /**
     * Gets the videoPositionWithinPod value for this VideoPositionTarget.
     * 
     * @return videoPositionWithinPod
     */
    public com.google.api.ads.admanager.axis.v202511.VideoPositionWithinPod getVideoPositionWithinPod() {
        return videoPositionWithinPod;
    }


    /**
     * Sets the videoPositionWithinPod value for this VideoPositionTarget.
     * 
     * @param videoPositionWithinPod
     */
    public void setVideoPositionWithinPod(com.google.api.ads.admanager.axis.v202511.VideoPositionWithinPod videoPositionWithinPod) {
        this.videoPositionWithinPod = videoPositionWithinPod;
    }


    /**
     * Gets the adSpotId value for this VideoPositionTarget.
     * 
     * @return adSpotId
     */
    public java.lang.Long getAdSpotId() {
        return adSpotId;
    }


    /**
     * Sets the adSpotId value for this VideoPositionTarget.
     * 
     * @param adSpotId
     */
    public void setAdSpotId(java.lang.Long adSpotId) {
        this.adSpotId = adSpotId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPositionTarget)) return false;
        VideoPositionTarget other = (VideoPositionTarget) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.videoPosition==null && other.getVideoPosition()==null) || 
             (this.videoPosition!=null &&
              this.videoPosition.equals(other.getVideoPosition()))) &&
            ((this.videoBumperType==null && other.getVideoBumperType()==null) || 
             (this.videoBumperType!=null &&
              this.videoBumperType.equals(other.getVideoBumperType()))) &&
            ((this.videoPositionWithinPod==null && other.getVideoPositionWithinPod()==null) || 
             (this.videoPositionWithinPod!=null &&
              this.videoPositionWithinPod.equals(other.getVideoPositionWithinPod()))) &&
            ((this.adSpotId==null && other.getAdSpotId()==null) || 
             (this.adSpotId!=null &&
              this.adSpotId.equals(other.getAdSpotId())));
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
        if (getVideoPosition() != null) {
            _hashCode += getVideoPosition().hashCode();
        }
        if (getVideoBumperType() != null) {
            _hashCode += getVideoBumperType().hashCode();
        }
        if (getVideoPositionWithinPod() != null) {
            _hashCode += getVideoPositionWithinPod().hashCode();
        }
        if (getAdSpotId() != null) {
            _hashCode += getAdSpotId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPositionTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "VideoPositionTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "videoPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "VideoPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoBumperType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "videoBumperType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "VideoBumperType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPositionWithinPod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "videoPositionWithinPod"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "VideoPositionWithinPod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adSpotId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "adSpotId"));
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
