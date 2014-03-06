/**
 * RichMediaFlashAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaFlashAsset  extends com.google.api.ads.dfa.axis.v1_20.RichMediaAsset  implements java.io.Serializable {
    private java.lang.String creativeFormat;

    private int height;

    private int width;

    private java.lang.String wmode;

    public RichMediaFlashAsset() {
    }

    public RichMediaFlashAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String creativeFormat,
           int height,
           int width,
           java.lang.String wmode) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type);
        this.creativeFormat = creativeFormat;
        this.height = height;
        this.width = width;
        this.wmode = wmode;
    }


    /**
     * Gets the creativeFormat value for this RichMediaFlashAsset.
     * 
     * @return creativeFormat
     */
    public java.lang.String getCreativeFormat() {
        return creativeFormat;
    }


    /**
     * Sets the creativeFormat value for this RichMediaFlashAsset.
     * 
     * @param creativeFormat
     */
    public void setCreativeFormat(java.lang.String creativeFormat) {
        this.creativeFormat = creativeFormat;
    }


    /**
     * Gets the height value for this RichMediaFlashAsset.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this RichMediaFlashAsset.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the width value for this RichMediaFlashAsset.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RichMediaFlashAsset.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the wmode value for this RichMediaFlashAsset.
     * 
     * @return wmode
     */
    public java.lang.String getWmode() {
        return wmode;
    }


    /**
     * Sets the wmode value for this RichMediaFlashAsset.
     * 
     * @param wmode
     */
    public void setWmode(java.lang.String wmode) {
        this.wmode = wmode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaFlashAsset)) return false;
        RichMediaFlashAsset other = (RichMediaFlashAsset) obj;
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
            this.width == other.getWidth() &&
            ((this.wmode==null && other.getWmode()==null) || 
             (this.wmode!=null &&
              this.wmode.equals(other.getWmode())));
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
        if (getWmode() != null) {
            _hashCode += getWmode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaFlashAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaFlashAsset"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wmode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
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
