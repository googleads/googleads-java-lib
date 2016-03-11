/**
 * CreativeTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201508;


/**
 * Represents the creative targeting criteria for a {@link LineItem}.
 */
public class CreativeTargeting  implements java.io.Serializable {
    /* The name of this creative targeting. This attribute is required. */
    private java.lang.String name;

    /* The {@link Targeting} criteria of this creative targeting.
     * This attribute is required. */
    private com.google.api.ads.dfp.axis.v201508.Targeting targeting;

    public CreativeTargeting() {
    }

    public CreativeTargeting(
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201508.Targeting targeting) {
           this.name = name;
           this.targeting = targeting;
    }


    /**
     * Gets the name value for this CreativeTargeting.
     * 
     * @return name   * The name of this creative targeting. This attribute is required.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this CreativeTargeting.
     * 
     * @param name   * The name of this creative targeting. This attribute is required.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the targeting value for this CreativeTargeting.
     * 
     * @return targeting   * The {@link Targeting} criteria of this creative targeting.
     * This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201508.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this CreativeTargeting.
     * 
     * @param targeting   * The {@link Targeting} criteria of this creative targeting.
     * This attribute is required.
     */
    public void setTargeting(com.google.api.ads.dfp.axis.v201508.Targeting targeting) {
        this.targeting = targeting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeTargeting)) return false;
        CreativeTargeting other = (CreativeTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "CreativeTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "Targeting"));
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
