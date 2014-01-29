/**
 * WidgetImageUploadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class WidgetImageUploadResponse  implements java.io.Serializable {
    private double imageSize;

    private java.lang.String relativeImageUrl;

    private java.lang.String staticDataUrl;

    public WidgetImageUploadResponse() {
    }

    public WidgetImageUploadResponse(
           double imageSize,
           java.lang.String relativeImageUrl,
           java.lang.String staticDataUrl) {
           this.imageSize = imageSize;
           this.relativeImageUrl = relativeImageUrl;
           this.staticDataUrl = staticDataUrl;
    }


    /**
     * Gets the imageSize value for this WidgetImageUploadResponse.
     * 
     * @return imageSize
     */
    public double getImageSize() {
        return imageSize;
    }


    /**
     * Sets the imageSize value for this WidgetImageUploadResponse.
     * 
     * @param imageSize
     */
    public void setImageSize(double imageSize) {
        this.imageSize = imageSize;
    }


    /**
     * Gets the relativeImageUrl value for this WidgetImageUploadResponse.
     * 
     * @return relativeImageUrl
     */
    public java.lang.String getRelativeImageUrl() {
        return relativeImageUrl;
    }


    /**
     * Sets the relativeImageUrl value for this WidgetImageUploadResponse.
     * 
     * @param relativeImageUrl
     */
    public void setRelativeImageUrl(java.lang.String relativeImageUrl) {
        this.relativeImageUrl = relativeImageUrl;
    }


    /**
     * Gets the staticDataUrl value for this WidgetImageUploadResponse.
     * 
     * @return staticDataUrl
     */
    public java.lang.String getStaticDataUrl() {
        return staticDataUrl;
    }


    /**
     * Sets the staticDataUrl value for this WidgetImageUploadResponse.
     * 
     * @param staticDataUrl
     */
    public void setStaticDataUrl(java.lang.String staticDataUrl) {
        this.staticDataUrl = staticDataUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WidgetImageUploadResponse)) return false;
        WidgetImageUploadResponse other = (WidgetImageUploadResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.imageSize == other.getImageSize() &&
            ((this.relativeImageUrl==null && other.getRelativeImageUrl()==null) || 
             (this.relativeImageUrl!=null &&
              this.relativeImageUrl.equals(other.getRelativeImageUrl()))) &&
            ((this.staticDataUrl==null && other.getStaticDataUrl()==null) || 
             (this.staticDataUrl!=null &&
              this.staticDataUrl.equals(other.getStaticDataUrl())));
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
        _hashCode += new Double(getImageSize()).hashCode();
        if (getRelativeImageUrl() != null) {
            _hashCode += getRelativeImageUrl().hashCode();
        }
        if (getStaticDataUrl() != null) {
            _hashCode += getStaticDataUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WidgetImageUploadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "WidgetImageUploadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relativeImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staticDataUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staticDataUrl"));
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
