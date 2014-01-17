/**
 * VideoPositionTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * Represents the options for targetable positions within a video.
 */
public class VideoPositionTarget  implements java.io.Serializable {
    /* The video position to target.  This attribute is required. */
    private com.google.api.ads.dfp.axis.v201302.VideoPosition videoPosition;

    /* The video bumper type to target.  To target a video position
     * or a pod position,
     *                 this value must be null.  To target a bumper position
     * this value must be populated
     *                 and the line item must have a bumper type. */
    private com.google.api.ads.dfp.axis.v201302.VideoBumperType videoBumperType;

    /* The video pod position type to target.  To target a video position
     * or a bumper
     *                 position, this value must be null.  To target a pod
     * position this value must
     *                 be populated.
     *                 Starting in V201306, use {@code videoPositionWithinPod}
     * which allows targeting
     *                 specific pod positions. */
    private com.google.api.ads.dfp.axis.v201302.VideoPodPositionType videoPodPositionType;

    public VideoPositionTarget() {
    }

    public VideoPositionTarget(
           com.google.api.ads.dfp.axis.v201302.VideoPosition videoPosition,
           com.google.api.ads.dfp.axis.v201302.VideoBumperType videoBumperType,
           com.google.api.ads.dfp.axis.v201302.VideoPodPositionType videoPodPositionType) {
           this.videoPosition = videoPosition;
           this.videoBumperType = videoBumperType;
           this.videoPodPositionType = videoPodPositionType;
    }


    /**
     * Gets the videoPosition value for this VideoPositionTarget.
     * 
     * @return videoPosition   * The video position to target.  This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201302.VideoPosition getVideoPosition() {
        return videoPosition;
    }


    /**
     * Sets the videoPosition value for this VideoPositionTarget.
     * 
     * @param videoPosition   * The video position to target.  This attribute is required.
     */
    public void setVideoPosition(com.google.api.ads.dfp.axis.v201302.VideoPosition videoPosition) {
        this.videoPosition = videoPosition;
    }


    /**
     * Gets the videoBumperType value for this VideoPositionTarget.
     * 
     * @return videoBumperType   * The video bumper type to target.  To target a video position
     * or a pod position,
     *                 this value must be null.  To target a bumper position
     * this value must be populated
     *                 and the line item must have a bumper type.
     */
    public com.google.api.ads.dfp.axis.v201302.VideoBumperType getVideoBumperType() {
        return videoBumperType;
    }


    /**
     * Sets the videoBumperType value for this VideoPositionTarget.
     * 
     * @param videoBumperType   * The video bumper type to target.  To target a video position
     * or a pod position,
     *                 this value must be null.  To target a bumper position
     * this value must be populated
     *                 and the line item must have a bumper type.
     */
    public void setVideoBumperType(com.google.api.ads.dfp.axis.v201302.VideoBumperType videoBumperType) {
        this.videoBumperType = videoBumperType;
    }


    /**
     * Gets the videoPodPositionType value for this VideoPositionTarget.
     * 
     * @return videoPodPositionType   * The video pod position type to target.  To target a video position
     * or a bumper
     *                 position, this value must be null.  To target a pod
     * position this value must
     *                 be populated.
     *                 Starting in V201306, use {@code videoPositionWithinPod}
     * which allows targeting
     *                 specific pod positions.
     */
    public com.google.api.ads.dfp.axis.v201302.VideoPodPositionType getVideoPodPositionType() {
        return videoPodPositionType;
    }


    /**
     * Sets the videoPodPositionType value for this VideoPositionTarget.
     * 
     * @param videoPodPositionType   * The video pod position type to target.  To target a video position
     * or a bumper
     *                 position, this value must be null.  To target a pod
     * position this value must
     *                 be populated.
     *                 Starting in V201306, use {@code videoPositionWithinPod}
     * which allows targeting
     *                 specific pod positions.
     */
    public void setVideoPodPositionType(com.google.api.ads.dfp.axis.v201302.VideoPodPositionType videoPodPositionType) {
        this.videoPodPositionType = videoPodPositionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoPositionTarget)) return false;
        VideoPositionTarget other = (VideoPositionTarget) obj;
        if (obj == null) return false;
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
            ((this.videoPodPositionType==null && other.getVideoPodPositionType()==null) || 
             (this.videoPodPositionType!=null &&
              this.videoPodPositionType.equals(other.getVideoPodPositionType())));
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
        if (getVideoPodPositionType() != null) {
            _hashCode += getVideoPodPositionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoPositionTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "VideoPositionTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPosition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "videoPosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "VideoPosition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoBumperType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "videoBumperType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "VideoBumperType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoPodPositionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "videoPodPositionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "VideoPodPositionType"));
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
