/**
 * LocationOverrideInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.cm;


/**
 * Represents override info for ad level LocationExtension overrides.
 */
public class LocationOverrideInfo  implements java.io.Serializable {
    /* Radius in the given units to target around the location indicated
     * by the
     *                 location extension.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer radius;

    /* Units for the radius
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201402.cm.LocationOverrideInfoRadiusUnits radiusUnits;

    public LocationOverrideInfo() {
    }

    public LocationOverrideInfo(
           java.lang.Integer radius,
           com.google.api.ads.adwords.axis.v201402.cm.LocationOverrideInfoRadiusUnits radiusUnits) {
           this.radius = radius;
           this.radiusUnits = radiusUnits;
    }


    /**
     * Gets the radius value for this LocationOverrideInfo.
     * 
     * @return radius   * Radius in the given units to target around the location indicated
     * by the
     *                 location extension.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getRadius() {
        return radius;
    }


    /**
     * Sets the radius value for this LocationOverrideInfo.
     * 
     * @param radius   * Radius in the given units to target around the location indicated
     * by the
     *                 location extension.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setRadius(java.lang.Integer radius) {
        this.radius = radius;
    }


    /**
     * Gets the radiusUnits value for this LocationOverrideInfo.
     * 
     * @return radiusUnits   * Units for the radius
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201402.cm.LocationOverrideInfoRadiusUnits getRadiusUnits() {
        return radiusUnits;
    }


    /**
     * Sets the radiusUnits value for this LocationOverrideInfo.
     * 
     * @param radiusUnits   * Units for the radius
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setRadiusUnits(com.google.api.ads.adwords.axis.v201402.cm.LocationOverrideInfoRadiusUnits radiusUnits) {
        this.radiusUnits = radiusUnits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationOverrideInfo)) return false;
        LocationOverrideInfo other = (LocationOverrideInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.radius==null && other.getRadius()==null) || 
             (this.radius!=null &&
              this.radius.equals(other.getRadius()))) &&
            ((this.radiusUnits==null && other.getRadiusUnits()==null) || 
             (this.radiusUnits!=null &&
              this.radiusUnits.equals(other.getRadiusUnits())));
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
        if (getRadius() != null) {
            _hashCode += getRadius().hashCode();
        }
        if (getRadiusUnits() != null) {
            _hashCode += getRadiusUnits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationOverrideInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "LocationOverrideInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radius");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "radius"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "radiusUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201402", "LocationOverrideInfo.RadiusUnits"));
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
