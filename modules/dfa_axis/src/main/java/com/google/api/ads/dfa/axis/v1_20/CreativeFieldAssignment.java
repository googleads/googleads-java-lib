/**
 * CreativeFieldAssignment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeFieldAssignment  implements java.io.Serializable {
    private long creativeFieldId;

    private long creativeFieldValueId;

    public CreativeFieldAssignment() {
    }

    public CreativeFieldAssignment(
           long creativeFieldId,
           long creativeFieldValueId) {
           this.creativeFieldId = creativeFieldId;
           this.creativeFieldValueId = creativeFieldValueId;
    }


    /**
     * Gets the creativeFieldId value for this CreativeFieldAssignment.
     * 
     * @return creativeFieldId
     */
    public long getCreativeFieldId() {
        return creativeFieldId;
    }


    /**
     * Sets the creativeFieldId value for this CreativeFieldAssignment.
     * 
     * @param creativeFieldId
     */
    public void setCreativeFieldId(long creativeFieldId) {
        this.creativeFieldId = creativeFieldId;
    }


    /**
     * Gets the creativeFieldValueId value for this CreativeFieldAssignment.
     * 
     * @return creativeFieldValueId
     */
    public long getCreativeFieldValueId() {
        return creativeFieldValueId;
    }


    /**
     * Sets the creativeFieldValueId value for this CreativeFieldAssignment.
     * 
     * @param creativeFieldValueId
     */
    public void setCreativeFieldValueId(long creativeFieldValueId) {
        this.creativeFieldValueId = creativeFieldValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeFieldAssignment)) return false;
        CreativeFieldAssignment other = (CreativeFieldAssignment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.creativeFieldId == other.getCreativeFieldId() &&
            this.creativeFieldValueId == other.getCreativeFieldValueId();
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
        _hashCode += new Long(getCreativeFieldId()).hashCode();
        _hashCode += new Long(getCreativeFieldValueId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeFieldAssignment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeFieldAssignment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeFieldId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeFieldId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeFieldValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeFieldValueId"));
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
