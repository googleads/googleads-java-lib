/**
 * RichMediaHtmlAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaHtmlAsset  extends com.google.api.ads.dfa.axis.v1_20.RichMediaAsset  implements java.io.Serializable {
    private java.lang.String creativeFormat;

    private int height;

    private int width;

    public RichMediaHtmlAsset() {
    }

    public RichMediaHtmlAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String creativeFormat,
           int height,
           int width) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type);
        this.creativeFormat = creativeFormat;
        this.height = height;
        this.width = width;
    }


    /**
     * Gets the creativeFormat value for this RichMediaHtmlAsset.
     * 
     * @return creativeFormat
     */
    public java.lang.String getCreativeFormat() {
        return creativeFormat;
    }


    /**
     * Sets the creativeFormat value for this RichMediaHtmlAsset.
     * 
     * @param creativeFormat
     */
    public void setCreativeFormat(java.lang.String creativeFormat) {
        this.creativeFormat = creativeFormat;
    }


    /**
     * Gets the height value for this RichMediaHtmlAsset.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this RichMediaHtmlAsset.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the width value for this RichMediaHtmlAsset.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RichMediaHtmlAsset.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaHtmlAsset)) return false;
        RichMediaHtmlAsset other = (RichMediaHtmlAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.creativeFormat==null && other.getCreativeFormat()==null) || 
             (this.creativeFormat!=null &&
              this.creativeFormat.equals(other.getCreativeFormat()))) &&
            this.height == other.getHeight() &&
            this.width == other.getWidth();
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
        if (getCreativeFormat() != null) {
            _hashCode += getCreativeFormat().hashCode();
        }
        _hashCode += getHeight();
        _hashCode += getWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaHtmlAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaHtmlAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
