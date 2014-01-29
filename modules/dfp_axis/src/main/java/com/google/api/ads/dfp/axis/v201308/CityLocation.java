/**
 * CityLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


/**
 * Represents a city for geographical targeting.
 *             <p>
 *             Since {@code v201104}, fields of this class are ignored
 * on input. Instead
 *             {@link Location} should be used and the {@link Location#id}
 * field should be
 *             set.
 *             </p>
 */
public class CityLocation  extends com.google.api.ads.dfp.axis.v201308.Location  implements java.io.Serializable {
    /* Case insensitive name of the city. This field is required. */
    private java.lang.String cityName;

    /* ISO 3166-2 region code. This field is required if there are
     * two or more
     *                     cities with the same name in the country. */
    private java.lang.String regionCode;

    /* ISO 3166-1 alpha-2 country code. This field is required. */
    private java.lang.String countryCode;

    public CityLocation() {
    }

    public CityLocation(
           java.lang.Long id,
           java.lang.String locationType,
           java.lang.String cityName,
           java.lang.String regionCode,
           java.lang.String countryCode) {
        super(
            id,
            locationType);
        this.cityName = cityName;
        this.regionCode = regionCode;
        this.countryCode = countryCode;
    }


    /**
     * Gets the cityName value for this CityLocation.
     * 
     * @return cityName   * Case insensitive name of the city. This field is required.
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this CityLocation.
     * 
     * @param cityName   * Case insensitive name of the city. This field is required.
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the regionCode value for this CityLocation.
     * 
     * @return regionCode   * ISO 3166-2 region code. This field is required if there are
     * two or more
     *                     cities with the same name in the country.
     */
    public java.lang.String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this CityLocation.
     * 
     * @param regionCode   * ISO 3166-2 region code. This field is required if there are
     * two or more
     *                     cities with the same name in the country.
     */
    public void setRegionCode(java.lang.String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the countryCode value for this CityLocation.
     * 
     * @return countryCode   * ISO 3166-1 alpha-2 country code. This field is required.
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this CityLocation.
     * 
     * @param countryCode   * ISO 3166-1 alpha-2 country code. This field is required.
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CityLocation)) return false;
        CityLocation other = (CityLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
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
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CityLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CityLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "countryCode"));
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
