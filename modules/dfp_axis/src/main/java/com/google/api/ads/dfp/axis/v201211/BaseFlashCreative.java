/**
 * BaseFlashCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * A base type for creatives that display a Flash-based ad. If the
 * Flash ad
 *             cannot load, a fallback image is displayed instead.
 */
public abstract class BaseFlashCreative  extends com.google.api.ads.dfp.axis.v201211.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The name of the Flash asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters. */
    private java.lang.String flashName;

    /* The contents of the Flash asset as a byte array. This attribute
     * is
     *                     required. The {@code flashByteArray} will be {@code
     * null} when the {@code
     *                     FlashCreative} is retrieved. To view the Flash
     * image, use the {@code
     *                     previewUrl}. */
    private byte[] flashByteArray;

    /* The name of the image asset to fallback on if the Flash creative
     * cannot be
     *                     loaded. */
    private java.lang.String fallbackImageName;

    /* The contents of the fallback image asset as a byte array. This
     * attribute is
     *                     required. The {@code fallbackImageByteArray} will
     * be {@code null} when a
     *                     {@code FlashCreative} is retrieved. To view the
     * fallback image, use the
     *                     {@code fallbackPreviewUrl}. */
    private byte[] fallbackImageByteArray;

    /* Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* Specifies whether the Flash asset is required to have a click
     * tag embedded
     *                     in it or not. This attribute is optional. */
    private java.lang.Boolean clickTagRequired;

    /* The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google. */
    private java.lang.String fallbackPreviewUrl;

    /* The Flash asset size. Note that this may differ from {@code
     * size} if
     *                     {@code overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google. */
    private com.google.api.ads.dfp.axis.v201211.Size flashAssetSize;

    /* Fallback image asset size. Note that this may differ from {@code
     * size} if
     *                     {@code overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google. */
    private com.google.api.ads.dfp.axis.v201211.Size fallbackAssetSize;

    public BaseFlashCreative() {
    }

    public BaseFlashCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201211.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201211.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201211.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201211.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String flashName,
           byte[] flashByteArray,
           java.lang.String fallbackImageName,
           byte[] fallbackImageByteArray,
           java.lang.Boolean overrideSize,
           java.lang.Boolean clickTagRequired,
           java.lang.String fallbackPreviewUrl,
           com.google.api.ads.dfp.axis.v201211.Size flashAssetSize,
           com.google.api.ads.dfp.axis.v201211.Size fallbackAssetSize) {
        super(
            advertiserId,
            id,
            name,
            size,
            previewUrl,
            appliedLabels,
            lastModifiedDateTime,
            customFieldValues,
            creativeType,
            destinationUrl);
        this.flashName = flashName;
        this.flashByteArray = flashByteArray;
        this.fallbackImageName = fallbackImageName;
        this.fallbackImageByteArray = fallbackImageByteArray;
        this.overrideSize = overrideSize;
        this.clickTagRequired = clickTagRequired;
        this.fallbackPreviewUrl = fallbackPreviewUrl;
        this.flashAssetSize = flashAssetSize;
        this.fallbackAssetSize = fallbackAssetSize;
    }


    /**
     * Gets the flashName value for this BaseFlashCreative.
     * 
     * @return flashName   * The name of the Flash asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     */
    public java.lang.String getFlashName() {
        return flashName;
    }


    /**
     * Sets the flashName value for this BaseFlashCreative.
     * 
     * @param flashName   * The name of the Flash asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     */
    public void setFlashName(java.lang.String flashName) {
        this.flashName = flashName;
    }


    /**
     * Gets the flashByteArray value for this BaseFlashCreative.
     * 
     * @return flashByteArray   * The contents of the Flash asset as a byte array. This attribute
     * is
     *                     required. The {@code flashByteArray} will be {@code
     * null} when the {@code
     *                     FlashCreative} is retrieved. To view the Flash
     * image, use the {@code
     *                     previewUrl}.
     */
    public byte[] getFlashByteArray() {
        return flashByteArray;
    }


    /**
     * Sets the flashByteArray value for this BaseFlashCreative.
     * 
     * @param flashByteArray   * The contents of the Flash asset as a byte array. This attribute
     * is
     *                     required. The {@code flashByteArray} will be {@code
     * null} when the {@code
     *                     FlashCreative} is retrieved. To view the Flash
     * image, use the {@code
     *                     previewUrl}.
     */
    public void setFlashByteArray(byte[] flashByteArray) {
        this.flashByteArray = flashByteArray;
    }


    /**
     * Gets the fallbackImageName value for this BaseFlashCreative.
     * 
     * @return fallbackImageName   * The name of the image asset to fallback on if the Flash creative
     * cannot be
     *                     loaded.
     */
    public java.lang.String getFallbackImageName() {
        return fallbackImageName;
    }


    /**
     * Sets the fallbackImageName value for this BaseFlashCreative.
     * 
     * @param fallbackImageName   * The name of the image asset to fallback on if the Flash creative
     * cannot be
     *                     loaded.
     */
    public void setFallbackImageName(java.lang.String fallbackImageName) {
        this.fallbackImageName = fallbackImageName;
    }


    /**
     * Gets the fallbackImageByteArray value for this BaseFlashCreative.
     * 
     * @return fallbackImageByteArray   * The contents of the fallback image asset as a byte array. This
     * attribute is
     *                     required. The {@code fallbackImageByteArray} will
     * be {@code null} when a
     *                     {@code FlashCreative} is retrieved. To view the
     * fallback image, use the
     *                     {@code fallbackPreviewUrl}.
     */
    public byte[] getFallbackImageByteArray() {
        return fallbackImageByteArray;
    }


    /**
     * Sets the fallbackImageByteArray value for this BaseFlashCreative.
     * 
     * @param fallbackImageByteArray   * The contents of the fallback image asset as a byte array. This
     * attribute is
     *                     required. The {@code fallbackImageByteArray} will
     * be {@code null} when a
     *                     {@code FlashCreative} is retrieved. To view the
     * fallback image, use the
     *                     {@code fallbackPreviewUrl}.
     */
    public void setFallbackImageByteArray(byte[] fallbackImageByteArray) {
        this.fallbackImageByteArray = fallbackImageByteArray;
    }


    /**
     * Gets the overrideSize value for this BaseFlashCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this BaseFlashCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual Flash asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the clickTagRequired value for this BaseFlashCreative.
     * 
     * @return clickTagRequired   * Specifies whether the Flash asset is required to have a click
     * tag embedded
     *                     in it or not. This attribute is optional.
     */
    public java.lang.Boolean getClickTagRequired() {
        return clickTagRequired;
    }


    /**
     * Sets the clickTagRequired value for this BaseFlashCreative.
     * 
     * @param clickTagRequired   * Specifies whether the Flash asset is required to have a click
     * tag embedded
     *                     in it or not. This attribute is optional.
     */
    public void setClickTagRequired(java.lang.Boolean clickTagRequired) {
        this.clickTagRequired = clickTagRequired;
    }


    /**
     * Gets the fallbackPreviewUrl value for this BaseFlashCreative.
     * 
     * @return fallbackPreviewUrl   * The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google.
     */
    public java.lang.String getFallbackPreviewUrl() {
        return fallbackPreviewUrl;
    }


    /**
     * Sets the fallbackPreviewUrl value for this BaseFlashCreative.
     * 
     * @param fallbackPreviewUrl   * The URL of the fallback image for preview. This attribute is
     * read-only and
     *                     is populated by Google.
     */
    public void setFallbackPreviewUrl(java.lang.String fallbackPreviewUrl) {
        this.fallbackPreviewUrl = fallbackPreviewUrl;
    }


    /**
     * Gets the flashAssetSize value for this BaseFlashCreative.
     * 
     * @return flashAssetSize   * The Flash asset size. Note that this may differ from {@code
     * size} if
     *                     {@code overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google.
     */
    public com.google.api.ads.dfp.axis.v201211.Size getFlashAssetSize() {
        return flashAssetSize;
    }


    /**
     * Sets the flashAssetSize value for this BaseFlashCreative.
     * 
     * @param flashAssetSize   * The Flash asset size. Note that this may differ from {@code
     * size} if
     *                     {@code overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google.
     */
    public void setFlashAssetSize(com.google.api.ads.dfp.axis.v201211.Size flashAssetSize) {
        this.flashAssetSize = flashAssetSize;
    }


    /**
     * Gets the fallbackAssetSize value for this BaseFlashCreative.
     * 
     * @return fallbackAssetSize   * Fallback image asset size. Note that this may differ from {@code
     * size} if
     *                     {@code overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google.
     */
    public com.google.api.ads.dfp.axis.v201211.Size getFallbackAssetSize() {
        return fallbackAssetSize;
    }


    /**
     * Sets the fallbackAssetSize value for this BaseFlashCreative.
     * 
     * @param fallbackAssetSize   * Fallback image asset size. Note that this may differ from {@code
     * size} if
     *                     {@code overrideSize} is set to true. This attribute
     * is read-only and is
     *                     populated by Google.
     */
    public void setFallbackAssetSize(com.google.api.ads.dfp.axis.v201211.Size fallbackAssetSize) {
        this.fallbackAssetSize = fallbackAssetSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseFlashCreative)) return false;
        BaseFlashCreative other = (BaseFlashCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.flashName==null && other.getFlashName()==null) || 
             (this.flashName!=null &&
              this.flashName.equals(other.getFlashName()))) &&
            ((this.flashByteArray==null && other.getFlashByteArray()==null) || 
             (this.flashByteArray!=null &&
              java.util.Arrays.equals(this.flashByteArray, other.getFlashByteArray()))) &&
            ((this.fallbackImageName==null && other.getFallbackImageName()==null) || 
             (this.fallbackImageName!=null &&
              this.fallbackImageName.equals(other.getFallbackImageName()))) &&
            ((this.fallbackImageByteArray==null && other.getFallbackImageByteArray()==null) || 
             (this.fallbackImageByteArray!=null &&
              java.util.Arrays.equals(this.fallbackImageByteArray, other.getFallbackImageByteArray()))) &&
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.clickTagRequired==null && other.getClickTagRequired()==null) || 
             (this.clickTagRequired!=null &&
              this.clickTagRequired.equals(other.getClickTagRequired()))) &&
            ((this.fallbackPreviewUrl==null && other.getFallbackPreviewUrl()==null) || 
             (this.fallbackPreviewUrl!=null &&
              this.fallbackPreviewUrl.equals(other.getFallbackPreviewUrl()))) &&
            ((this.flashAssetSize==null && other.getFlashAssetSize()==null) || 
             (this.flashAssetSize!=null &&
              this.flashAssetSize.equals(other.getFlashAssetSize()))) &&
            ((this.fallbackAssetSize==null && other.getFallbackAssetSize()==null) || 
             (this.fallbackAssetSize!=null &&
              this.fallbackAssetSize.equals(other.getFallbackAssetSize())));
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
        if (getFlashName() != null) {
            _hashCode += getFlashName().hashCode();
        }
        if (getFlashByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlashByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlashByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFallbackImageName() != null) {
            _hashCode += getFallbackImageName().hashCode();
        }
        if (getFallbackImageByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFallbackImageByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFallbackImageByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getClickTagRequired() != null) {
            _hashCode += getClickTagRequired().hashCode();
        }
        if (getFallbackPreviewUrl() != null) {
            _hashCode += getFallbackPreviewUrl().hashCode();
        }
        if (getFlashAssetSize() != null) {
            _hashCode += getFlashAssetSize().hashCode();
        }
        if (getFallbackAssetSize() != null) {
            _hashCode += getFallbackAssetSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseFlashCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "BaseFlashCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "flashName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "flashByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackImageName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "fallbackImageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackImageByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "fallbackImageByteArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "overrideSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clickTagRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "clickTagRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackPreviewUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "fallbackPreviewUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashAssetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "flashAssetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackAssetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "fallbackAssetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Size"));
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
