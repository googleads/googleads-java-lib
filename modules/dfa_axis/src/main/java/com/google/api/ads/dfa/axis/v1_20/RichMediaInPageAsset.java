/**
 * RichMediaInPageAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class RichMediaInPageAsset  extends com.google.api.ads.dfa.axis.v1_20.RichMediaFlashAsset  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_20.RichMediaImageAsset alternateImageAsset;

    public RichMediaInPageAsset() {
    }

    public RichMediaInPageAsset(
           java.lang.String fileName,
           int fileSize,
           long id,
           long parentAssetId,
           java.lang.String type,
           java.lang.String creativeFormat,
           int height,
           int width,
           java.lang.String wmode,
           com.google.api.ads.dfa.axis.v1_20.RichMediaImageAsset alternateImageAsset) {
        super(
            fileName,
            fileSize,
            id,
            parentAssetId,
            type,
            creativeFormat,
            height,
            width,
            wmode);
        this.alternateImageAsset = alternateImageAsset;
    }


    /**
     * Gets the alternateImageAsset value for this RichMediaInPageAsset.
     * 
     * @return alternateImageAsset
     */
    public com.google.api.ads.dfa.axis.v1_20.RichMediaImageAsset getAlternateImageAsset() {
        return alternateImageAsset;
    }


    /**
     * Sets the alternateImageAsset value for this RichMediaInPageAsset.
     * 
     * @param alternateImageAsset
     */
    public void setAlternateImageAsset(com.google.api.ads.dfa.axis.v1_20.RichMediaImageAsset alternateImageAsset) {
        this.alternateImageAsset = alternateImageAsset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RichMediaInPageAsset)) return false;
        RichMediaInPageAsset other = (RichMediaInPageAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.alternateImageAsset==null && other.getAlternateImageAsset()==null) || 
             (this.alternateImageAsset!=null &&
              this.alternateImageAsset.equals(other.getAlternateImageAsset())));
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
        if (getAlternateImageAsset() != null) {
            _hashCode += getAlternateImageAsset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaInPageAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaInPageAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateImageAsset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alternateImageAsset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "RichMediaImageAsset"));
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
