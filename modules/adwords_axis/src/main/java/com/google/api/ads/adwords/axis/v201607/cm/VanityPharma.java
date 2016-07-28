/**
 * VanityPharma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.cm;


/**
 * Describes how unbranded pharma ads will be displayed.
 */
public class VanityPharma  implements java.io.Serializable {
    /* The display mode for vanity pharma URLs. */
    private com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaDisplayUrlMode vanityPharmaDisplayUrlMode;

    /* The text that will be displayed in display URL of the text
     * ad when website description
     *                 is the selected display mode for vanity pharma URLs. */
    private com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaText vanityPharmaText;

    public VanityPharma() {
    }

    public VanityPharma(
           com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaDisplayUrlMode vanityPharmaDisplayUrlMode,
           com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaText vanityPharmaText) {
           this.vanityPharmaDisplayUrlMode = vanityPharmaDisplayUrlMode;
           this.vanityPharmaText = vanityPharmaText;
    }


    /**
     * Gets the vanityPharmaDisplayUrlMode value for this VanityPharma.
     * 
     * @return vanityPharmaDisplayUrlMode   * The display mode for vanity pharma URLs.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaDisplayUrlMode getVanityPharmaDisplayUrlMode() {
        return vanityPharmaDisplayUrlMode;
    }


    /**
     * Sets the vanityPharmaDisplayUrlMode value for this VanityPharma.
     * 
     * @param vanityPharmaDisplayUrlMode   * The display mode for vanity pharma URLs.
     */
    public void setVanityPharmaDisplayUrlMode(com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaDisplayUrlMode vanityPharmaDisplayUrlMode) {
        this.vanityPharmaDisplayUrlMode = vanityPharmaDisplayUrlMode;
    }


    /**
     * Gets the vanityPharmaText value for this VanityPharma.
     * 
     * @return vanityPharmaText   * The text that will be displayed in display URL of the text
     * ad when website description
     *                 is the selected display mode for vanity pharma URLs.
     */
    public com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaText getVanityPharmaText() {
        return vanityPharmaText;
    }


    /**
     * Sets the vanityPharmaText value for this VanityPharma.
     * 
     * @param vanityPharmaText   * The text that will be displayed in display URL of the text
     * ad when website description
     *                 is the selected display mode for vanity pharma URLs.
     */
    public void setVanityPharmaText(com.google.api.ads.adwords.axis.v201607.cm.VanityPharmaText vanityPharmaText) {
        this.vanityPharmaText = vanityPharmaText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VanityPharma)) return false;
        VanityPharma other = (VanityPharma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vanityPharmaDisplayUrlMode==null && other.getVanityPharmaDisplayUrlMode()==null) || 
             (this.vanityPharmaDisplayUrlMode!=null &&
              this.vanityPharmaDisplayUrlMode.equals(other.getVanityPharmaDisplayUrlMode()))) &&
            ((this.vanityPharmaText==null && other.getVanityPharmaText()==null) || 
             (this.vanityPharmaText!=null &&
              this.vanityPharmaText.equals(other.getVanityPharmaText())));
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
        if (getVanityPharmaDisplayUrlMode() != null) {
            _hashCode += getVanityPharmaDisplayUrlMode().hashCode();
        }
        if (getVanityPharmaText() != null) {
            _hashCode += getVanityPharmaText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VanityPharma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "VanityPharma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vanityPharmaDisplayUrlMode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "vanityPharmaDisplayUrlMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "VanityPharmaDisplayUrlMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vanityPharmaText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "vanityPharmaText"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201607", "VanityPharmaText"));
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
