/**
 * CreativeGroupAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class CreativeGroupAssignment  implements java.io.Serializable {
    private long creativeGroup1Id;

    private long creativeGroup2Id;

    public CreativeGroupAssignment() {
    }

    public CreativeGroupAssignment(
           long creativeGroup1Id,
           long creativeGroup2Id) {
           this.creativeGroup1Id = creativeGroup1Id;
           this.creativeGroup2Id = creativeGroup2Id;
    }


    /**
     * Gets the creativeGroup1Id value for this CreativeGroupAssignment.
     * 
     * @return creativeGroup1Id
     */
    public long getCreativeGroup1Id() {
        return creativeGroup1Id;
    }


    /**
     * Sets the creativeGroup1Id value for this CreativeGroupAssignment.
     * 
     * @param creativeGroup1Id
     */
    public void setCreativeGroup1Id(long creativeGroup1Id) {
        this.creativeGroup1Id = creativeGroup1Id;
    }


    /**
     * Gets the creativeGroup2Id value for this CreativeGroupAssignment.
     * 
     * @return creativeGroup2Id
     */
    public long getCreativeGroup2Id() {
        return creativeGroup2Id;
    }


    /**
     * Sets the creativeGroup2Id value for this CreativeGroupAssignment.
     * 
     * @param creativeGroup2Id
     */
    public void setCreativeGroup2Id(long creativeGroup2Id) {
        this.creativeGroup2Id = creativeGroup2Id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeGroupAssignment)) return false;
        CreativeGroupAssignment other = (CreativeGroupAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.creativeGroup1Id == other.getCreativeGroup1Id() &&
            this.creativeGroup2Id == other.getCreativeGroup2Id();
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
        _hashCode += new Long(getCreativeGroup1Id()).hashCode();
        _hashCode += new Long(getCreativeGroup2Id()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeGroupAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "CreativeGroupAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeGroup1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeGroup1Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeGroup2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeGroup2Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
