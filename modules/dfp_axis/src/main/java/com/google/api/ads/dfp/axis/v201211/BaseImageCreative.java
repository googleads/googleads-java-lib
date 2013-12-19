/**
 * BaseImageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * The base type for creatives that display an image.
 */
public abstract class BaseImageCreative  extends com.google.api.ads.dfp.axis.v201211.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The name of the image asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute. */
    private java.lang.String imageName;

    /* The content of the image asset as a byte array. This attribute
     * is required.
     *                     The {@code imageByteArray} will be {@code null}
     * when the {@code
     *                     ImageCreative} is retrieved. To view the image,
     * use the {@code previewUrl}.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute. */
    private byte[] imageByteArray;

    /* Allows the creative size to differ from the actual image asset
     * size. This
     *                     attribute is optional. */
    private java.lang.Boolean overrideSize;

    /* The image asset size. Note that this may differ from {@code
     * size} if users
     *                     set {@code overrideSize} to true. This attribute
     * read-only and is populated
     *                     by Google.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute. */
    private com.google.api.ads.dfp.axis.v201211.Size assetSize;

    /* The URL where the actual asset resides. This attribute is read-only
     * and
     *                     has a maximum length of 1024 characters.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute. */
    private java.lang.String imageUrl;

    public BaseImageCreative() {
    }

    public BaseImageCreative(
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
           java.lang.String imageName,
           byte[] imageByteArray,
           java.lang.Boolean overrideSize,
           com.google.api.ads.dfp.axis.v201211.Size assetSize,
           java.lang.String imageUrl) {
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
        this.imageName = imageName;
        this.imageByteArray = imageByteArray;
        this.overrideSize = overrideSize;
        this.assetSize = assetSize;
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the imageName value for this BaseImageCreative.
     * 
     * @return imageName   * The name of the image asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public java.lang.String getImageName() {
        return imageName;
    }


    /**
     * Sets the imageName value for this BaseImageCreative.
     * 
     * @param imageName   * The name of the image asset. This attribute is required and
     * has a maximum
     *                     length of 248 characters.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public void setImageName(java.lang.String imageName) {
        this.imageName = imageName;
    }


    /**
     * Gets the imageByteArray value for this BaseImageCreative.
     * 
     * @return imageByteArray   * The content of the image asset as a byte array. This attribute
     * is required.
     *                     The {@code imageByteArray} will be {@code null}
     * when the {@code
     *                     ImageCreative} is retrieved. To view the image,
     * use the {@code previewUrl}.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public byte[] getImageByteArray() {
        return imageByteArray;
    }


    /**
     * Sets the imageByteArray value for this BaseImageCreative.
     * 
     * @param imageByteArray   * The content of the image asset as a byte array. This attribute
     * is required.
     *                     The {@code imageByteArray} will be {@code null}
     * when the {@code
     *                     ImageCreative} is retrieved. To view the image,
     * use the {@code previewUrl}.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public void setImageByteArray(byte[] imageByteArray) {
        this.imageByteArray = imageByteArray;
    }


    /**
     * Gets the overrideSize value for this BaseImageCreative.
     * 
     * @return overrideSize   * Allows the creative size to differ from the actual image asset
     * size. This
     *                     attribute is optional.
     */
    public java.lang.Boolean getOverrideSize() {
        return overrideSize;
    }


    /**
     * Sets the overrideSize value for this BaseImageCreative.
     * 
     * @param overrideSize   * Allows the creative size to differ from the actual image asset
     * size. This
     *                     attribute is optional.
     */
    public void setOverrideSize(java.lang.Boolean overrideSize) {
        this.overrideSize = overrideSize;
    }


    /**
     * Gets the assetSize value for this BaseImageCreative.
     * 
     * @return assetSize   * The image asset size. Note that this may differ from {@code
     * size} if users
     *                     set {@code overrideSize} to true. This attribute
     * read-only and is populated
     *                     by Google.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public com.google.api.ads.dfp.axis.v201211.Size getAssetSize() {
        return assetSize;
    }


    /**
     * Sets the assetSize value for this BaseImageCreative.
     * 
     * @param assetSize   * The image asset size. Note that this may differ from {@code
     * size} if users
     *                     set {@code overrideSize} to true. This attribute
     * read-only and is populated
     *                     by Google.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public void setAssetSize(com.google.api.ads.dfp.axis.v201211.Size assetSize) {
        this.assetSize = assetSize;
    }


    /**
     * Gets the imageUrl value for this BaseImageCreative.
     * 
     * @return imageUrl   * The URL where the actual asset resides. This attribute is read-only
     * and
     *                     has a maximum length of 1024 characters.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this BaseImageCreative.
     * 
     * @param imageUrl   * The URL where the actual asset resides. This attribute is read-only
     * and
     *                     has a maximum length of 1024 characters.
     *                     
     *                     This attribute has been encapsulated into, and
     * deprecated in favour of, the
     *                     {@code primaryImageAsset} attribute.
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseImageCreative)) return false;
        BaseImageCreative other = (BaseImageCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.imageName==null && other.getImageName()==null) || 
             (this.imageName!=null &&
              this.imageName.equals(other.getImageName()))) &&
            ((this.imageByteArray==null && other.getImageByteArray()==null) || 
             (this.imageByteArray!=null &&
              java.util.Arrays.equals(this.imageByteArray, other.getImageByteArray()))) &&
            ((this.overrideSize==null && other.getOverrideSize()==null) || 
             (this.overrideSize!=null &&
              this.overrideSize.equals(other.getOverrideSize()))) &&
            ((this.assetSize==null && other.getAssetSize()==null) || 
             (this.assetSize!=null &&
              this.assetSize.equals(other.getAssetSize()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl())));
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
        if (getImageName() != null) {
            _hashCode += getImageName().hashCode();
        }
        if (getImageByteArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageByteArray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageByteArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverrideSize() != null) {
            _hashCode += getOverrideSize().hashCode();
        }
        if (getAssetSize() != null) {
            _hashCode += getAssetSize().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseImageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "BaseImageCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "imageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageByteArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "imageByteArray"));
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
        elemField.setFieldName("assetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "assetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "Size"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "imageUrl"));
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
