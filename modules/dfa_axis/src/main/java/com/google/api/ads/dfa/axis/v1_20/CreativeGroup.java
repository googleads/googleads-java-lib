/**
 * CreativeGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeGroup  extends com.google.api.ads.dfa.axis.v1_20.CreativeGroupBase  implements java.io.Serializable {
    private long advertiserId;

    private int groupNumber;

    public CreativeGroup() {
    }

    public CreativeGroup(
           long id,
           java.lang.String name,
           long advertiserId,
           int groupNumber) {
        super(
            id,
            name);
        this.advertiserId = advertiserId;
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the advertiserId value for this CreativeGroup.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this CreativeGroup.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the groupNumber value for this CreativeGroup.
     * 
     * @return groupNumber
     */
    public int getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this CreativeGroup.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeGroup)) return false;
        CreativeGroup other = (CreativeGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.advertiserId == other.getAdvertiserId() &&
            this.groupNumber == other.getGroupNumber();
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
        _hashCode += new Long(getAdvertiserId()).hashCode();
        _hashCode += getGroupNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
