/**
 * VideoAdKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * A SegmentKey for segmenting by VideoAd.
 */
public class VideoAdKey  implements java.io.Serializable {
    private java.lang.String videoAdName;

    private java.lang.Long videoAdId;

    public VideoAdKey() {
    }

    public VideoAdKey(
           java.lang.String videoAdName,
           java.lang.Long videoAdId) {
           this.videoAdName = videoAdName;
           this.videoAdId = videoAdId;
    }


    /**
     * Gets the videoAdName value for this VideoAdKey.
     * 
     * @return videoAdName
     */
    public java.lang.String getVideoAdName() {
        return videoAdName;
    }


    /**
     * Sets the videoAdName value for this VideoAdKey.
     * 
     * @param videoAdName
     */
    public void setVideoAdName(java.lang.String videoAdName) {
        this.videoAdName = videoAdName;
    }


    /**
     * Gets the videoAdId value for this VideoAdKey.
     * 
     * @return videoAdId
     */
    public java.lang.Long getVideoAdId() {
        return videoAdId;
    }


    /**
     * Sets the videoAdId value for this VideoAdKey.
     * 
     * @param videoAdId
     */
    public void setVideoAdId(java.lang.Long videoAdId) {
        this.videoAdId = videoAdId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoAdKey)) return false;
        VideoAdKey other = (VideoAdKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.videoAdName==null && other.getVideoAdName()==null) || 
             (this.videoAdName!=null &&
              this.videoAdName.equals(other.getVideoAdName()))) &&
            ((this.videoAdId==null && other.getVideoAdId()==null) || 
             (this.videoAdId!=null &&
              this.videoAdId.equals(other.getVideoAdId())));
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
        if (getVideoAdName() != null) {
            _hashCode += getVideoAdName().hashCode();
        }
        if (getVideoAdId() != null) {
            _hashCode += getVideoAdId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoAdKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoAdKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoAdName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "videoAdName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoAdId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "videoAdId"));
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
