/**
 * ImageCreativeBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public abstract class ImageCreativeBase  extends com.google.api.ads.dfa.axis.v1_19.CreativeBase  implements java.io.Serializable {
    private java.lang.String alternateText;

    private java.lang.String assetFilename;

    public ImageCreativeBase() {
    }

    public ImageCreativeBase(
           long id,
           java.lang.String name,
           boolean active,
           long advertiserId,
           boolean archived,
           com.google.api.ads.dfa.axis.v1_19.CreativeFieldAssignment[] creativeFieldAssignments,
           long sizeId,
           long typeId,
           int version,
           java.lang.String alternateText,
           java.lang.String assetFilename) {
        super(
            id,
            name,
            active,
            advertiserId,
            archived,
            creativeFieldAssignments,
            sizeId,
            typeId,
            version);
        this.alternateText = alternateText;
        this.assetFilename = assetFilename;
    }


    /**
     * Gets the alternateText value for this ImageCreativeBase.
     * 
     * @return alternateText
     */
    public java.lang.String getAlternateText() {
        return alternateText;
    }


    /**
     * Sets the alternateText value for this ImageCreativeBase.
     * 
     * @param alternateText
     */
    public void setAlternateText(java.lang.String alternateText) {
        this.alternateText = alternateText;
    }


    /**
     * Gets the assetFilename value for this ImageCreativeBase.
     * 
     * @return assetFilename
     */
    public java.lang.String getAssetFilename() {
        return assetFilename;
    }


    /**
     * Sets the assetFilename value for this ImageCreativeBase.
     * 
     * @param assetFilename
     */
    public void setAssetFilename(java.lang.String assetFilename) {
        this.assetFilename = assetFilename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageCreativeBase)) return false;
        ImageCreativeBase other = (ImageCreativeBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alternateText==null && other.getAlternateText()==null) || 
             (this.alternateText!=null &&
              this.alternateText.equals(other.getAlternateText()))) &&
            ((this.assetFilename==null && other.getAssetFilename()==null) || 
             (this.assetFilename!=null &&
              this.assetFilename.equals(other.getAssetFilename())));
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
        if (getAlternateText() != null) {
            _hashCode += getAlternateText().hashCode();
        }
        if (getAssetFilename() != null) {
            _hashCode += getAssetFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageCreativeBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "ImageCreativeBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetFilename"));
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
