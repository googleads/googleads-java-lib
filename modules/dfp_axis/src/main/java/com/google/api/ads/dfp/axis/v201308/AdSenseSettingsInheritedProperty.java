/**
 * AdSenseSettingsInheritedProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


/**
 * The property of the AdUnit that specifies how and from where the
 * AdSenseSettings are inherited.
 */
public class AdSenseSettingsInheritedProperty  implements java.io.Serializable {
    /* The AdSenseSettings from which the property is inherited. */
    private com.google.api.ads.dfp.axis.v201308.AdSenseSettings value;

    public AdSenseSettingsInheritedProperty() {
    }

    public AdSenseSettingsInheritedProperty(
           com.google.api.ads.dfp.axis.v201308.AdSenseSettings value) {
           this.value = value;
    }


    /**
     * Gets the value value for this AdSenseSettingsInheritedProperty.
     * 
     * @return value   * The AdSenseSettings from which the property is inherited.
     */
    public com.google.api.ads.dfp.axis.v201308.AdSenseSettings getValue() {
        return value;
    }


    /**
     * Sets the value value for this AdSenseSettingsInheritedProperty.
     * 
     * @param value   * The AdSenseSettings from which the property is inherited.
     */
    public void setValue(com.google.api.ads.dfp.axis.v201308.AdSenseSettings value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSenseSettingsInheritedProperty)) return false;
        AdSenseSettingsInheritedProperty other = (AdSenseSettingsInheritedProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdSenseSettingsInheritedProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "AdSenseSettingsInheritedProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "AdSenseSettings"));
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
