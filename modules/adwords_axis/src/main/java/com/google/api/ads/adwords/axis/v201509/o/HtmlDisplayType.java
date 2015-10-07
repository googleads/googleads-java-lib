/**
 * HtmlDisplayType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.o;


/**
 * HTML-specific options for display ads are contained within
 *             this class.
 */
public class HtmlDisplayType  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayTypeHtmlOption htmlOption;

    public HtmlDisplayType() {
    }

    public HtmlDisplayType(
           com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayTypeHtmlOption htmlOption) {
           this.htmlOption = htmlOption;
    }


    /**
     * Gets the htmlOption value for this HtmlDisplayType.
     * 
     * @return htmlOption
     */
    public com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayTypeHtmlOption getHtmlOption() {
        return htmlOption;
    }


    /**
     * Sets the htmlOption value for this HtmlDisplayType.
     * 
     * @param htmlOption
     */
    public void setHtmlOption(com.google.api.ads.adwords.axis.v201509.o.HtmlDisplayTypeHtmlOption htmlOption) {
        this.htmlOption = htmlOption;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HtmlDisplayType)) return false;
        HtmlDisplayType other = (HtmlDisplayType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.htmlOption==null && other.getHtmlOption()==null) || 
             (this.htmlOption!=null &&
              this.htmlOption.equals(other.getHtmlOption())));
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
        if (getHtmlOption() != null) {
            _hashCode += getHtmlOption().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HtmlDisplayType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "HtmlDisplayType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "htmlOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201509", "HtmlDisplayType.HtmlOption"));
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
