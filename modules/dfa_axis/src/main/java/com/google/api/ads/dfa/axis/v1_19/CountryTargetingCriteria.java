/**
 * CountryTargetingCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CountryTargetingCriteria  implements java.io.Serializable {
    private com.google.api.ads.dfa.axis.v1_19.Country[] countries;

    private boolean exclude;

    public CountryTargetingCriteria() {
    }

    public CountryTargetingCriteria(
           com.google.api.ads.dfa.axis.v1_19.Country[] countries,
           boolean exclude) {
           this.countries = countries;
           this.exclude = exclude;
    }


    /**
     * Gets the countries value for this CountryTargetingCriteria.
     * 
     * @return countries
     */
    public com.google.api.ads.dfa.axis.v1_19.Country[] getCountries() {
        return countries;
    }


    /**
     * Sets the countries value for this CountryTargetingCriteria.
     * 
     * @param countries
     */
    public void setCountries(com.google.api.ads.dfa.axis.v1_19.Country[] countries) {
        this.countries = countries;
    }


    /**
     * Gets the exclude value for this CountryTargetingCriteria.
     * 
     * @return exclude
     */
    public boolean isExclude() {
        return exclude;
    }


    /**
     * Sets the exclude value for this CountryTargetingCriteria.
     * 
     * @param exclude
     */
    public void setExclude(boolean exclude) {
        this.exclude = exclude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountryTargetingCriteria)) return false;
        CountryTargetingCriteria other = (CountryTargetingCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countries==null && other.getCountries()==null) || 
             (this.countries!=null &&
              java.util.Arrays.equals(this.countries, other.getCountries()))) &&
            this.exclude == other.isExclude();
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
        if (getCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isExclude() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountryTargetingCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CountryTargetingCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Country"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
