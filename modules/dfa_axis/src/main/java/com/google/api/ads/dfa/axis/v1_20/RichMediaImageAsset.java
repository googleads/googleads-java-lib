/**
 * RichMediaImageAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaImageAsset  extends com.google.api.ads.dfa.axis.v1_20.RichMediaAsset  implements java.io.Serializable {
    private java.lang.String altText;

    private boolean backupImage;

    private com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent exitEvent;

    private int height;

    private int width;

    public RichMediaImageAsset() {
    }

    public RichMediaImageAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String altText,
           boolean backupImage,
           com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent exitEvent,
           int height,
           int width) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type);
        this.altText = altText;
        this.backupImage = backupImage;
        this.exitEvent = exitEvent;
        this.height = height;
        this.width = width;
    }


    /**
     * Gets the altText value for this RichMediaImageAsset.
     * 
     * @return altText
     */
    public java.lang.String getAltText() {
        return altText;
    }


    /**
     * Sets the altText value for this RichMediaImageAsset.
     * 
     * @param altText
     */
    public void setAltText(java.lang.String altText) {
        this.altText = altText;
    }


    /**
     * Gets the backupImage value for this RichMediaImageAsset.
     * 
     * @return backupImage
     */
    public boolean isBackupImage() {
        return backupImage;
    }


    /**
     * Sets the backupImage value for this RichMediaImageAsset.
     * 
     * @param backupImage
     */
    public void setBackupImage(boolean backupImage) {
        this.backupImage = backupImage;
    }


    /**
     * Gets the exitEvent value for this RichMediaImageAsset.
     * 
     * @return exitEvent
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent getExitEvent() {
        return exitEvent;
    }


    /**
     * Sets the exitEvent value for this RichMediaImageAsset.
     * 
     * @param exitEvent
     */
    public void setExitEvent(com.google.api.ads.dfa.axis.v1_20.RichMediaExitEvent exitEvent) {
        this.exitEvent = exitEvent;
    }


    /**
     * Gets the height value for this RichMediaImageAsset.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this RichMediaImageAsset.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the width value for this RichMediaImageAsset.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this RichMediaImageAsset.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaImageAsset)) return false;
        RichMediaImageAsset other = (RichMediaImageAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.altText==null && other.getAltText()==null) || 
             (this.altText!=null &&
              this.altText.equals(other.getAltText()))) &&
            this.backupImage == other.isBackupImage() &&
            ((this.exitEvent==null && other.getExitEvent()==null) || 
             (this.exitEvent!=null &&
              this.exitEvent.equals(other.getExitEvent()))) &&
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
        if (getAltText() != null) {
            _hashCode += getAltText().hashCode();
        }
        _hashCode += (isBackupImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExitEvent() != null) {
            _hashCode += getExitEvent().hashCode();
        }
        _hashCode += getHeight();
        _hashCode += getWidth();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaImageAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaImageAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupImage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitEvent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exitEvent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaExitEvent"));
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
