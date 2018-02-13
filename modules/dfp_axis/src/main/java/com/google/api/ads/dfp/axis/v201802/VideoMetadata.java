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
 * VideoMetadata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Metadata for a video asset.
 */
public class VideoMetadata  implements java.io.Serializable {
    /* The scalable type of the asset. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.ScalableType scalableType;

    /* The duration of the asset in milliseconds. This attribute is
     * required. */
    private java.lang.Integer duration;

    /* The bit rate of the asset in kbps. If the asset can play at
     * a range of bit rates (such
     *                 as an Http Live Streaming video), then set the bit
     * rate to zero and populate the minimum
     *                 and maximum bit rate instead. */
    private java.lang.Integer bitRate;

    /* The minimum bitrate of the video in kbps.  Only set this if
     * the asset can play at a
     *                 range of bit rates. */
    private java.lang.Integer minimumBitRate;

    /* The maximum bitrate of the video in kbps.  Only set this if
     * the asset can play at a
     *                 range of bit rates. */
    private java.lang.Integer maximumBitRate;

    /* The size (width and height) of the asset. This attribute is
     * required. */
    private com.google.api.ads.dfp.axis.v201802.Size size;

    /* The mime type of the asset. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.MimeType mimeType;

    /* The delivery type of the asset. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.VideoDeliveryType deliveryType;

    /* The codecs of the asset. This attribute is optional and defaults
     * to an empty list. */
    private java.lang.String[] codecs;

    public VideoMetadata() {
    }

    public VideoMetadata(
           com.google.api.ads.dfp.axis.v201802.ScalableType scalableType,
           java.lang.Integer duration,
           java.lang.Integer bitRate,
           java.lang.Integer minimumBitRate,
           java.lang.Integer maximumBitRate,
           com.google.api.ads.dfp.axis.v201802.Size size,
           com.google.api.ads.dfp.axis.v201802.MimeType mimeType,
           com.google.api.ads.dfp.axis.v201802.VideoDeliveryType deliveryType,
           java.lang.String[] codecs) {
           this.scalableType = scalableType;
           this.duration = duration;
           this.bitRate = bitRate;
           this.minimumBitRate = minimumBitRate;
           this.maximumBitRate = maximumBitRate;
           this.size = size;
           this.mimeType = mimeType;
           this.deliveryType = deliveryType;
           this.codecs = codecs;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bitRate", getBitRate())
            .add("codecs", getCodecs())
            .add("deliveryType", getDeliveryType())
            .add("duration", getDuration())
            .add("maximumBitRate", getMaximumBitRate())
            .add("mimeType", getMimeType())
            .add("minimumBitRate", getMinimumBitRate())
            .add("scalableType", getScalableType())
            .add("size", getSize())
            .toString();
    }

    /**
     * Gets the scalableType value for this VideoMetadata.
     * 
     * @return scalableType   * The scalable type of the asset. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.ScalableType getScalableType() {
        return scalableType;
    }


    /**
     * Sets the scalableType value for this VideoMetadata.
     * 
     * @param scalableType   * The scalable type of the asset. This attribute is required.
     */
    public void setScalableType(com.google.api.ads.dfp.axis.v201802.ScalableType scalableType) {
        this.scalableType = scalableType;
    }


    /**
     * Gets the duration value for this VideoMetadata.
     * 
     * @return duration   * The duration of the asset in milliseconds. This attribute is
     * required.
     */
    public java.lang.Integer getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this VideoMetadata.
     * 
     * @param duration   * The duration of the asset in milliseconds. This attribute is
     * required.
     */
    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }


    /**
     * Gets the bitRate value for this VideoMetadata.
     * 
     * @return bitRate   * The bit rate of the asset in kbps. If the asset can play at
     * a range of bit rates (such
     *                 as an Http Live Streaming video), then set the bit
     * rate to zero and populate the minimum
     *                 and maximum bit rate instead.
     */
    public java.lang.Integer getBitRate() {
        return bitRate;
    }


    /**
     * Sets the bitRate value for this VideoMetadata.
     * 
     * @param bitRate   * The bit rate of the asset in kbps. If the asset can play at
     * a range of bit rates (such
     *                 as an Http Live Streaming video), then set the bit
     * rate to zero and populate the minimum
     *                 and maximum bit rate instead.
     */
    public void setBitRate(java.lang.Integer bitRate) {
        this.bitRate = bitRate;
    }


    /**
     * Gets the minimumBitRate value for this VideoMetadata.
     * 
     * @return minimumBitRate   * The minimum bitrate of the video in kbps.  Only set this if
     * the asset can play at a
     *                 range of bit rates.
     */
    public java.lang.Integer getMinimumBitRate() {
        return minimumBitRate;
    }


    /**
     * Sets the minimumBitRate value for this VideoMetadata.
     * 
     * @param minimumBitRate   * The minimum bitrate of the video in kbps.  Only set this if
     * the asset can play at a
     *                 range of bit rates.
     */
    public void setMinimumBitRate(java.lang.Integer minimumBitRate) {
        this.minimumBitRate = minimumBitRate;
    }


    /**
     * Gets the maximumBitRate value for this VideoMetadata.
     * 
     * @return maximumBitRate   * The maximum bitrate of the video in kbps.  Only set this if
     * the asset can play at a
     *                 range of bit rates.
     */
    public java.lang.Integer getMaximumBitRate() {
        return maximumBitRate;
    }


    /**
     * Sets the maximumBitRate value for this VideoMetadata.
     * 
     * @param maximumBitRate   * The maximum bitrate of the video in kbps.  Only set this if
     * the asset can play at a
     *                 range of bit rates.
     */
    public void setMaximumBitRate(java.lang.Integer maximumBitRate) {
        this.maximumBitRate = maximumBitRate;
    }


    /**
     * Gets the size value for this VideoMetadata.
     * 
     * @return size   * The size (width and height) of the asset. This attribute is
     * required.
     */
    public com.google.api.ads.dfp.axis.v201802.Size getSize() {
        return size;
    }


    /**
     * Sets the size value for this VideoMetadata.
     * 
     * @param size   * The size (width and height) of the asset. This attribute is
     * required.
     */
    public void setSize(com.google.api.ads.dfp.axis.v201802.Size size) {
        this.size = size;
    }


    /**
     * Gets the mimeType value for this VideoMetadata.
     * 
     * @return mimeType   * The mime type of the asset. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.MimeType getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this VideoMetadata.
     * 
     * @param mimeType   * The mime type of the asset. This attribute is required.
     */
    public void setMimeType(com.google.api.ads.dfp.axis.v201802.MimeType mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the deliveryType value for this VideoMetadata.
     * 
     * @return deliveryType   * The delivery type of the asset. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.VideoDeliveryType getDeliveryType() {
        return deliveryType;
    }


    /**
     * Sets the deliveryType value for this VideoMetadata.
     * 
     * @param deliveryType   * The delivery type of the asset. This attribute is required.
     */
    public void setDeliveryType(com.google.api.ads.dfp.axis.v201802.VideoDeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }


    /**
     * Gets the codecs value for this VideoMetadata.
     * 
     * @return codecs   * The codecs of the asset. This attribute is optional and defaults
     * to an empty list.
     */
    public java.lang.String[] getCodecs() {
        return codecs;
    }


    /**
     * Sets the codecs value for this VideoMetadata.
     * 
     * @param codecs   * The codecs of the asset. This attribute is optional and defaults
     * to an empty list.
     */
    public void setCodecs(java.lang.String[] codecs) {
        this.codecs = codecs;
    }

    public java.lang.String getCodecs(int i) {
        return this.codecs[i];
    }

    public void setCodecs(int i, java.lang.String _value) {
        this.codecs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoMetadata)) return false;
        VideoMetadata other = (VideoMetadata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scalableType==null && other.getScalableType()==null) || 
             (this.scalableType!=null &&
              this.scalableType.equals(other.getScalableType()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.bitRate==null && other.getBitRate()==null) || 
             (this.bitRate!=null &&
              this.bitRate.equals(other.getBitRate()))) &&
            ((this.minimumBitRate==null && other.getMinimumBitRate()==null) || 
             (this.minimumBitRate!=null &&
              this.minimumBitRate.equals(other.getMinimumBitRate()))) &&
            ((this.maximumBitRate==null && other.getMaximumBitRate()==null) || 
             (this.maximumBitRate!=null &&
              this.maximumBitRate.equals(other.getMaximumBitRate()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.deliveryType==null && other.getDeliveryType()==null) || 
             (this.deliveryType!=null &&
              this.deliveryType.equals(other.getDeliveryType()))) &&
            ((this.codecs==null && other.getCodecs()==null) || 
             (this.codecs!=null &&
              java.util.Arrays.equals(this.codecs, other.getCodecs())));
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
        if (getScalableType() != null) {
            _hashCode += getScalableType().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getBitRate() != null) {
            _hashCode += getBitRate().hashCode();
        }
        if (getMinimumBitRate() != null) {
            _hashCode += getMinimumBitRate().hashCode();
        }
        if (getMaximumBitRate() != null) {
            _hashCode += getMaximumBitRate().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getDeliveryType() != null) {
            _hashCode += getDeliveryType().hashCode();
        }
        if (getCodecs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodecs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodecs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoMetadata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoMetadata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalableType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "scalableType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ScalableType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "bitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumBitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "minimumBitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumBitRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "maximumBitRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "VideoDeliveryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codecs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "codecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
