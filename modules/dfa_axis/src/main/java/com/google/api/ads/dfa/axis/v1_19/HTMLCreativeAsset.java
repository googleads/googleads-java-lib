/**
 * HTMLCreativeAsset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class HTMLCreativeAsset  implements java.io.Serializable {
    private java.lang.String assetFilename;

    public HTMLCreativeAsset() {
    }

    public HTMLCreativeAsset(
           java.lang.String assetFilename) {
           this.assetFilename = assetFilename;
    }


    /**
     * Gets the assetFilename value for this HTMLCreativeAsset.
     * 
     * @return assetFilename
     */
    public java.lang.String getAssetFilename() {
        return assetFilename;
    }


    /**
     * Sets the assetFilename value for this HTMLCreativeAsset.
     * 
     * @param assetFilename
     */
    public void setAssetFilename(java.lang.String assetFilename) {
        this.assetFilename = assetFilename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HTMLCreativeAsset)) return false;
        HTMLCreativeAsset other = (HTMLCreativeAsset) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
        int _hashCode = 1;
        if (getAssetFilename() != null) {
            _hashCode += getAssetFilename().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HTMLCreativeAsset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "HTMLCreativeAsset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
