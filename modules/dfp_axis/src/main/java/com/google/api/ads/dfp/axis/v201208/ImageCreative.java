/**
 * ImageCreative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201208;


/**
 * A {@code Creative} that displays an image.
 */
public class ImageCreative  extends com.google.api.ads.dfp.axis.v201208.BaseImageCreative  implements java.io.Serializable {
    public ImageCreative() {
    }

    public ImageCreative(
           java.lang.Long advertiserId,
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201208.Size size,
           java.lang.String previewUrl,
           com.google.api.ads.dfp.axis.v201208.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201208.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201208.BaseCustomFieldValue[] customFieldValues,
           java.lang.String creativeType,
           java.lang.String destinationUrl,
           java.lang.String imageName,
           byte[] imageByteArray,
           java.lang.Boolean overrideSize,
           com.google.api.ads.dfp.axis.v201208.Size assetSize,
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
            destinationUrl,
            imageName,
            imageByteArray,
            overrideSize,
            assetSize,
            imageUrl);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageCreative)) return false;
        ImageCreative other = (ImageCreative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageCreative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201208", "ImageCreative"));
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
