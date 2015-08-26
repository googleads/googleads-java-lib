/**
 * PremiumFeature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201408;


/**
 * A {@code PremiumFeature} represents the feature type to be applied
 * as a premium on a
 *             {@link RateCard}.
 */
public abstract class PremiumFeature  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of PremiumFeature.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String premiumFeatureType;

    public PremiumFeature() {
    }

    public PremiumFeature(
           java.lang.String premiumFeatureType) {
           this.premiumFeatureType = premiumFeatureType;
    }


    /**
     * Gets the premiumFeatureType value for this PremiumFeature.
     * 
     * @return premiumFeatureType   * Indicates that this instance is a subtype of PremiumFeature.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getPremiumFeatureType() {
        return premiumFeatureType;
    }


    /**
     * Sets the premiumFeatureType value for this PremiumFeature.
     * 
     * @param premiumFeatureType   * Indicates that this instance is a subtype of PremiumFeature.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setPremiumFeatureType(java.lang.String premiumFeatureType) {
        this.premiumFeatureType = premiumFeatureType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PremiumFeature)) return false;
        PremiumFeature other = (PremiumFeature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.premiumFeatureType==null && other.getPremiumFeatureType()==null) || 
             (this.premiumFeatureType!=null &&
              this.premiumFeatureType.equals(other.getPremiumFeatureType())));
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
        if (getPremiumFeatureType() != null) {
            _hashCode += getPremiumFeatureType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PremiumFeature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "PremiumFeature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiumFeatureType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201408", "PremiumFeature.Type"));
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
