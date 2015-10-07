/**
 * DisplayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.o;


/**
 * Base interface for types of display ads.
 */
public class DisplayType  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201509.o.FlashDisplayType flashDisplayType;

    private com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayType htmlDisplayType;

    private com.google.api.ads.adwords.axis.v201509.o.ImageDisplayType imageDisplayType;

    public DisplayType() {
    }

    public DisplayType(
           com.google.api.ads.adwords.axis.v201509.o.FlashDisplayType flashDisplayType,
           com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayType htmlDisplayType,
           com.google.api.ads.adwords.axis.v201509.o.ImageDisplayType imageDisplayType) {
           this.flashDisplayType = flashDisplayType;
           this.htmlDisplayType = htmlDisplayType;
           this.imageDisplayType = imageDisplayType;
    }


    /**
     * Gets the flashDisplayType value for this DisplayType.
     * 
     * @return flashDisplayType
     */
    public com.google.api.ads.adwords.axis.v201509.o.FlashDisplayType getFlashDisplayType() {
        return flashDisplayType;
    }


    /**
     * Sets the flashDisplayType value for this DisplayType.
     * 
     * @param flashDisplayType
     */
    public void setFlashDisplayType(com.google.api.ads.adwords.axis.v201509.o.FlashDisplayType flashDisplayType) {
        this.flashDisplayType = flashDisplayType;
    }


    /**
     * Gets the htmlDisplayType value for this DisplayType.
     * 
     * @return htmlDisplayType
     */
    public com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayType getHtmlDisplayType() {
        return htmlDisplayType;
    }


    /**
     * Sets the htmlDisplayType value for this DisplayType.
     * 
     * @param htmlDisplayType
     */
    public void setHtmlDisplayType(com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayType htmlDisplayType) {
        this.htmlDisplayType = htmlDisplayType;
    }


    /**
     * Gets the imageDisplayType value for this DisplayType.
     * 
     * @return imageDisplayType
     */
    public com.google.api.ads.adwords.axis.v201509.o.ImageDisplayType getImageDisplayType() {
        return imageDisplayType;
    }


    /**
     * Sets the imageDisplayType value for this DisplayType.
     * 
     * @param imageDisplayType
     */
    public void setImageDisplayType(com.google.api.ads.adwords.axis.v201509.o.ImageDisplayType imageDisplayType) {
        this.imageDisplayType = imageDisplayType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisplayType)) return false;
        DisplayType other = (DisplayType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flashDisplayType==null && other.getFlashDisplayType()==null) || 
             (this.flashDisplayType!=null &&
              this.flashDisplayType.equals(other.getFlashDisplayType()))) &&
            ((this.htmlDisplayType==null && other.getHtmlDisplayType()==null) || 
             (this.htmlDisplayType!=null &&
              this.htmlDisplayType.equals(other.getHtmlDisplayType()))) &&
            ((this.imageDisplayType==null && other.getImageDisplayType()==null) || 
             (this.imageDisplayType!=null &&
              this.imageDisplayType.equals(other.getImageDisplayType())));
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
        if (getFlashDisplayType() != null) {
            _hashCode += getFlashDisplayType().hashCode();
        }
        if (getHtmlDisplayType() != null) {
            _hashCode += getHtmlDisplayType().hashCode();
        }
        if (getImageDisplayType() != null) {
            _hashCode += getImageDisplayType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisplayType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "DisplayType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashDisplayType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "FlashDisplayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "FlashDisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlDisplayType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "HtmlDisplayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "HtmlDisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageDisplayType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "ImageDisplayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "ImageDisplayType"));
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
