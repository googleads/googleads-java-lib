/**
 * Sitelink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Class to represent a single sitelink
 */
public class Sitelink  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 35, inclusive.</span> */
    private java.lang.String displayText;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 2076, inclusive.</span> */
    private java.lang.String destinationUrl;

    public Sitelink() {
    }

    public Sitelink(
           java.lang.String displayText,
           java.lang.String destinationUrl) {
           this.displayText = displayText;
           this.destinationUrl = destinationUrl;
    }


    /**
     * Gets the displayText value for this Sitelink.
     * 
     * @return displayText   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 35, inclusive.</span>
     */
    public java.lang.String getDisplayText() {
        return displayText;
    }


    /**
     * Sets the displayText value for this Sitelink.
     * 
     * @param displayText   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 35, inclusive.</span>
     */
    public void setDisplayText(java.lang.String displayText) {
        this.displayText = displayText;
    }


    /**
     * Gets the destinationUrl value for this Sitelink.
     * 
     * @return destinationUrl   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 2076, inclusive.</span>
     */
    public java.lang.String getDestinationUrl() {
        return destinationUrl;
    }


    /**
     * Sets the destinationUrl value for this Sitelink.
     * 
     * @param destinationUrl   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 2076, inclusive.</span>
     */
    public void setDestinationUrl(java.lang.String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sitelink)) return false;
        Sitelink other = (Sitelink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.displayText==null && other.getDisplayText()==null) || 
             (this.displayText!=null &&
              this.displayText.equals(other.getDisplayText()))) &&
            ((this.destinationUrl==null && other.getDestinationUrl()==null) || 
             (this.destinationUrl!=null &&
              this.destinationUrl.equals(other.getDestinationUrl())));
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
        if (getDisplayText() != null) {
            _hashCode += getDisplayText().hashCode();
        }
        if (getDestinationUrl() != null) {
            _hashCode += getDestinationUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sitelink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "Sitelink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "displayText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "destinationUrl"));
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
