/**
 * MetroLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201302;


/**
 * Represents a metropolitan area for geographical targeting. Currently,
 * metropolitan areas only within the United States can be targeted.
 *             <p>
 *             Since {@code v201104}, fields of this class are ignored
 * on input. Instead
 *             {@link Location} should be used and the {@link Location#id}
 * field should be
 *             set.
 *             </p>
 */
public class MetroLocation  extends com.google.api.ads.dfp.axis.v201302.Location  implements java.io.Serializable {
    /* The 3 digit metro code, not to be confused with the metro name.
     * This field
     *                     is required. */
    private java.lang.String metroCode;

    /* ISO 3166-1 alpha-2 country code. */
    private java.lang.String countryCode;

    public MetroLocation() {
    }

    public MetroLocation(
           java.lang.Long id,
           java.lang.String locationType,
           java.lang.String metroCode,
           java.lang.String countryCode) {
        super(
            id,
            locationType);
        this.metroCode = metroCode;
        this.countryCode = countryCode;
    }


    /**
     * Gets the metroCode value for this MetroLocation.
     * 
     * @return metroCode   * The 3 digit metro code, not to be confused with the metro name.
     * This field
     *                     is required.
     */
    public java.lang.String getMetroCode() {
        return metroCode;
    }


    /**
     * Sets the metroCode value for this MetroLocation.
     * 
     * @param metroCode   * The 3 digit metro code, not to be confused with the metro name.
     * This field
     *                     is required.
     */
    public void setMetroCode(java.lang.String metroCode) {
        this.metroCode = metroCode;
    }


    /**
     * Gets the countryCode value for this MetroLocation.
     * 
     * @return countryCode   * ISO 3166-1 alpha-2 country code.
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this MetroLocation.
     * 
     * @param countryCode   * ISO 3166-1 alpha-2 country code.
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetroLocation)) return false;
        MetroLocation other = (MetroLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.metroCode==null && other.getMetroCode()==null) || 
             (this.metroCode!=null &&
              this.metroCode.equals(other.getMetroCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMetroCode() != null) {
            _hashCode += getMetroCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetroLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "MetroLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metroCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "metroCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201302", "countryCode"));
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
