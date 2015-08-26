/**
 * CreativeUploadFileCount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeUploadFileCount  implements java.io.Serializable {
    private int flashFileCount;

    private int imageFileCount;

    private int otherFileCount;

    public CreativeUploadFileCount() {
    }

    public CreativeUploadFileCount(
           int flashFileCount,
           int imageFileCount,
           int otherFileCount) {
           this.flashFileCount = flashFileCount;
           this.imageFileCount = imageFileCount;
           this.otherFileCount = otherFileCount;
    }


    /**
     * Gets the flashFileCount value for this CreativeUploadFileCount.
     * 
     * @return flashFileCount
     */
    public int getFlashFileCount() {
        return flashFileCount;
    }


    /**
     * Sets the flashFileCount value for this CreativeUploadFileCount.
     * 
     * @param flashFileCount
     */
    public void setFlashFileCount(int flashFileCount) {
        this.flashFileCount = flashFileCount;
    }


    /**
     * Gets the imageFileCount value for this CreativeUploadFileCount.
     * 
     * @return imageFileCount
     */
    public int getImageFileCount() {
        return imageFileCount;
    }


    /**
     * Sets the imageFileCount value for this CreativeUploadFileCount.
     * 
     * @param imageFileCount
     */
    public void setImageFileCount(int imageFileCount) {
        this.imageFileCount = imageFileCount;
    }


    /**
     * Gets the otherFileCount value for this CreativeUploadFileCount.
     * 
     * @return otherFileCount
     */
    public int getOtherFileCount() {
        return otherFileCount;
    }


    /**
     * Sets the otherFileCount value for this CreativeUploadFileCount.
     * 
     * @param otherFileCount
     */
    public void setOtherFileCount(int otherFileCount) {
        this.otherFileCount = otherFileCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeUploadFileCount)) return false;
        CreativeUploadFileCount other = (CreativeUploadFileCount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.flashFileCount == other.getFlashFileCount() &&
            this.imageFileCount == other.getImageFileCount() &&
            this.otherFileCount == other.getOtherFileCount();
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
        _hashCode += getFlashFileCount();
        _hashCode += getImageFileCount();
        _hashCode += getOtherFileCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeUploadFileCount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeUploadFileCount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashFileCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashFileCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageFileCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageFileCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherFileCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otherFileCount"));
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
