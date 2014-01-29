/**
 * CitySearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CitySearchCriteria  implements java.io.Serializable {
    private long[] countryIds;

    private long[] regionIds;

    public CitySearchCriteria() {
    }

    public CitySearchCriteria(
           long[] countryIds,
           long[] regionIds) {
           this.countryIds = countryIds;
           this.regionIds = regionIds;
    }


    /**
     * Gets the countryIds value for this CitySearchCriteria.
     * 
     * @return countryIds
     */
    public long[] getCountryIds() {
        return countryIds;
    }


    /**
     * Sets the countryIds value for this CitySearchCriteria.
     * 
     * @param countryIds
     */
    public void setCountryIds(long[] countryIds) {
        this.countryIds = countryIds;
    }


    /**
     * Gets the regionIds value for this CitySearchCriteria.
     * 
     * @return regionIds
     */
    public long[] getRegionIds() {
        return regionIds;
    }


    /**
     * Sets the regionIds value for this CitySearchCriteria.
     * 
     * @param regionIds
     */
    public void setRegionIds(long[] regionIds) {
        this.regionIds = regionIds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CitySearchCriteria)) return false;
        CitySearchCriteria other = (CitySearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countryIds==null && other.getCountryIds()==null) || 
             (this.countryIds!=null &&
              java.util.Arrays.equals(this.countryIds, other.getCountryIds()))) &&
            ((this.regionIds==null && other.getRegionIds()==null) || 
             (this.regionIds!=null &&
              java.util.Arrays.equals(this.regionIds, other.getRegionIds())));
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
        if (getCountryIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CitySearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CitySearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
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
