/**
 * CreativeWrapperHtmlSnippet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * The {@code CreativeWrapperHtmlSnippet} contains the HTML snippet
 * that is
 *             delivered as the header or footer.
 */
public class CreativeWrapperHtmlSnippet  implements java.io.Serializable {
    /* The HTML snippet. */
    private java.lang.String htmlSnippet;

    public CreativeWrapperHtmlSnippet() {
    }

    public CreativeWrapperHtmlSnippet(
           java.lang.String htmlSnippet) {
           this.htmlSnippet = htmlSnippet;
    }


    /**
     * Gets the htmlSnippet value for this CreativeWrapperHtmlSnippet.
     * 
     * @return htmlSnippet   * The HTML snippet.
     */
    public java.lang.String getHtmlSnippet() {
        return htmlSnippet;
    }


    /**
     * Sets the htmlSnippet value for this CreativeWrapperHtmlSnippet.
     * 
     * @param htmlSnippet   * The HTML snippet.
     */
    public void setHtmlSnippet(java.lang.String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeWrapperHtmlSnippet)) return false;
        CreativeWrapperHtmlSnippet other = (CreativeWrapperHtmlSnippet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.htmlSnippet==null && other.getHtmlSnippet()==null) || 
             (this.htmlSnippet!=null &&
              this.htmlSnippet.equals(other.getHtmlSnippet())));
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
        if (getHtmlSnippet() != null) {
            _hashCode += getHtmlSnippet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeWrapperHtmlSnippet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CreativeWrapperHtmlSnippet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlSnippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "htmlSnippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
