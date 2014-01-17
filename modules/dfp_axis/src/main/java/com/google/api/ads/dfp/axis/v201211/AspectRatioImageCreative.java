/**
 * AspectRatioImageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201211;


/**
 * A {@code Creative} intended for mobile platforms that displays
 * an image,
 *             whose {@link LineItem#creativePlaceholders size} is defined
 * as an
 *             {@link CreativeSizeType#ASPECT_RATIO aspect ratio}, i.e.
 * {@link Size#isAspectRatio}. It can have multiple images whose dimensions
 * conform to that aspect ratio.
 */
public class AspectRatioImageCreative  extends com.google.api.ads.dfp.axis.v201211.HasDestinationUrlCreative  implements java.io.Serializable {
    /* The images associated with this creative. The ad server will
     * choose one
     *                     based on the capabilities of the device. Each
     * asset should have a size
     *                     which is of the same aspect ratio as the {@link
     * Creative#size}. This
     *                     attribute is required and must have at least one
     * asset. */
    private com.google.api.ads.dfp.axis.v201211.CreativeAsset[] imageAssets;

    /* The text that is served along with the image creative, primarily
     * for
     *                     accessibility. If no suitable image size is available
     * for the device, this
     *                     text replaces the image completely. This field
     * is optional and has a
     *                     maximum length of 500 characters. */
    private java.lang.String fallbackText;

    public AspectRatioImageCreative() {
    }

    public AspectRatioImageCreative(
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
           com.google.api.ads.dfp.axis.v201211.CreativeAsset[] imageAssets,
           java.lang.String fallbackText) {
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
        this.imageAssets = imageAssets;
        this.fallbackText = fallbackText;
    }


    /**
     * Gets the imageAssets value for this AspectRatioImageCreative.
     * 
     * @return imageAssets   * The images associated with this creative. The ad server will
     * choose one
     *                     based on the capabilities of the device. Each
     * asset should have a size
     *                     which is of the same aspect ratio as the {@link
     * Creative#size}. This
     *                     attribute is required and must have at least one
     * asset.
     */
    public com.google.api.ads.dfp.axis.v201211.CreativeAsset[] getImageAssets() {
        return imageAssets;
    }


    /**
     * Sets the imageAssets value for this AspectRatioImageCreative.
     * 
     * @param imageAssets   * The images associated with this creative. The ad server will
     * choose one
     *                     based on the capabilities of the device. Each
     * asset should have a size
     *                     which is of the same aspect ratio as the {@link
     * Creative#size}. This
     *                     attribute is required and must have at least one
     * asset.
     */
    public void setImageAssets(com.google.api.ads.dfp.axis.v201211.CreativeAsset[] imageAssets) {
        this.imageAssets = imageAssets;
    }

    public com.google.api.ads.dfp.axis.v201211.CreativeAsset getImageAssets(int i) {
        return this.imageAssets[i];
    }

    public void setImageAssets(int i, com.google.api.ads.dfp.axis.v201211.CreativeAsset _value) {
        this.imageAssets[i] = _value;
    }


    /**
     * Gets the fallbackText value for this AspectRatioImageCreative.
     * 
     * @return fallbackText   * The text that is served along with the image creative, primarily
     * for
     *                     accessibility. If no suitable image size is available
     * for the device, this
     *                     text replaces the image completely. This field
     * is optional and has a
     *                     maximum length of 500 characters.
     */
    public java.lang.String getFallbackText() {
        return fallbackText;
    }


    /**
     * Sets the fallbackText value for this AspectRatioImageCreative.
     * 
     * @param fallbackText   * The text that is served along with the image creative, primarily
     * for
     *                     accessibility. If no suitable image size is available
     * for the device, this
     *                     text replaces the image completely. This field
     * is optional and has a
     *                     maximum length of 500 characters.
     */
    public void setFallbackText(java.lang.String fallbackText) {
        this.fallbackText = fallbackText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AspectRatioImageCreative)) return false;
        AspectRatioImageCreative other = (AspectRatioImageCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.imageAssets==null && other.getImageAssets()==null) || 
             (this.imageAssets!=null &&
              java.util.Arrays.equals(this.imageAssets, other.getImageAssets()))) &&
            ((this.fallbackText==null && other.getFallbackText()==null) || 
             (this.fallbackText!=null &&
              this.fallbackText.equals(other.getFallbackText())));
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
        if (getImageAssets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageAssets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageAssets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFallbackText() != null) {
            _hashCode += getFallbackText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AspectRatioImageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "AspectRatioImageCreative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageAssets");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "imageAssets"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "CreativeAsset"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fallbackText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "fallbackText"));
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
