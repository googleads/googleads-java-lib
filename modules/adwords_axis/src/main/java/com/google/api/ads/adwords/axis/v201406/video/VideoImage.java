/**
 * VideoImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201406.video;


/**
 * Represents an image within a VideoAd.
 */
public class VideoImage  implements java.io.Serializable {
    /* The Type identifier for this image, either one of the YouTube
     * thumbnails
     *                 or a custom media thumbnail.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoImageType type;

    /* An image Type for ad formats that don't support custom media
     * thumbnails.
     *                 This must be one of the YouTube image types (i.e.
     * cannot be MEDIA). */
    private com.google.api.ads.adwords.axis.v201406.video.VideoImageType secondaryType;

    /* If this is a custom MEDIA image, the id of that image media. */
    private java.lang.Long mediaId;

    /* The url where this image can be previewed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private java.lang.String url;

    /* The MimeType of this image.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span> */
    private com.google.api.ads.adwords.axis.v201406.video.VideoImageMimeType mimeType;

    public VideoImage() {
    }

    public VideoImage(
           com.google.api.ads.adwords.axis.v201406.video.VideoImageType type,
           com.google.api.ads.adwords.axis.v201406.video.VideoImageType secondaryType,
           java.lang.Long mediaId,
           java.lang.String url,
           com.google.api.ads.adwords.axis.v201406.video.VideoImageMimeType mimeType) {
           this.type = type;
           this.secondaryType = secondaryType;
           this.mediaId = mediaId;
           this.url = url;
           this.mimeType = mimeType;
    }


    /**
     * Gets the type value for this VideoImage.
     * 
     * @return type   * The Type identifier for this image, either one of the YouTube
     * thumbnails
     *                 or a custom media thumbnail.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoImageType getType() {
        return type;
    }


    /**
     * Sets the type value for this VideoImage.
     * 
     * @param type   * The Type identifier for this image, either one of the YouTube
     * thumbnails
     *                 or a custom media thumbnail.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201406.video.VideoImageType type) {
        this.type = type;
    }


    /**
     * Gets the secondaryType value for this VideoImage.
     * 
     * @return secondaryType   * An image Type for ad formats that don't support custom media
     * thumbnails.
     *                 This must be one of the YouTube image types (i.e.
     * cannot be MEDIA).
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoImageType getSecondaryType() {
        return secondaryType;
    }


    /**
     * Sets the secondaryType value for this VideoImage.
     * 
     * @param secondaryType   * An image Type for ad formats that don't support custom media
     * thumbnails.
     *                 This must be one of the YouTube image types (i.e.
     * cannot be MEDIA).
     */
    public void setSecondaryType(com.google.api.ads.adwords.axis.v201406.video.VideoImageType secondaryType) {
        this.secondaryType = secondaryType;
    }


    /**
     * Gets the mediaId value for this VideoImage.
     * 
     * @return mediaId   * If this is a custom MEDIA image, the id of that image media.
     */
    public java.lang.Long getMediaId() {
        return mediaId;
    }


    /**
     * Sets the mediaId value for this VideoImage.
     * 
     * @param mediaId   * If this is a custom MEDIA image, the id of that image media.
     */
    public void setMediaId(java.lang.Long mediaId) {
        this.mediaId = mediaId;
    }


    /**
     * Gets the url value for this VideoImage.
     * 
     * @return url   * The url where this image can be previewed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this VideoImage.
     * 
     * @param url   * The url where this image can be previewed.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the mimeType value for this VideoImage.
     * 
     * @return mimeType   * The MimeType of this image.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public com.google.api.ads.adwords.axis.v201406.video.VideoImageMimeType getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this VideoImage.
     * 
     * @param mimeType   * The MimeType of this image.
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API.</span>
     */
    public void setMimeType(com.google.api.ads.adwords.axis.v201406.video.VideoImageMimeType mimeType) {
        this.mimeType = mimeType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VideoImage)) return false;
        VideoImage other = (VideoImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.secondaryType==null && other.getSecondaryType()==null) || 
             (this.secondaryType!=null &&
              this.secondaryType.equals(other.getSecondaryType()))) &&
            ((this.mediaId==null && other.getMediaId()==null) || 
             (this.mediaId!=null &&
              this.mediaId.equals(other.getMediaId()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSecondaryType() != null) {
            _hashCode += getSecondaryType().hashCode();
        }
        if (getMediaId() != null) {
            _hashCode += getMediaId().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VideoImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoImage.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "secondaryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoImage.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "mediaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/video/v201406", "VideoImage.MimeType"));
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
