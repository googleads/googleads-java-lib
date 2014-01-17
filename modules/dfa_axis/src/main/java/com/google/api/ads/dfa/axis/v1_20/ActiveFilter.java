/**
 * ActiveFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class ActiveFilter  implements java.io.Serializable {
    private boolean activeOnly;

    private boolean inactiveOnly;

    public ActiveFilter() {
    }

    public ActiveFilter(
           boolean activeOnly,
           boolean inactiveOnly) {
           this.activeOnly = activeOnly;
           this.inactiveOnly = inactiveOnly;
    }


    /**
     * Gets the activeOnly value for this ActiveFilter.
     * 
     * @return activeOnly
     */
    public boolean isActiveOnly() {
        return activeOnly;
    }


    /**
     * Sets the activeOnly value for this ActiveFilter.
     * 
     * @param activeOnly
     */
    public void setActiveOnly(boolean activeOnly) {
        this.activeOnly = activeOnly;
    }


    /**
     * Gets the inactiveOnly value for this ActiveFilter.
     * 
     * @return inactiveOnly
     */
    public boolean isInactiveOnly() {
        return inactiveOnly;
    }


    /**
     * Sets the inactiveOnly value for this ActiveFilter.
     * 
     * @param inactiveOnly
     */
    public void setInactiveOnly(boolean inactiveOnly) {
        this.inactiveOnly = inactiveOnly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ActiveFilter)) return false;
        ActiveFilter other = (ActiveFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.activeOnly == other.isActiveOnly() &&
            this.inactiveOnly == other.isInactiveOnly();
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
        _hashCode += (isActiveOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInactiveOnly() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ActiveFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "ActiveFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactiveOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inactiveOnly"));
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
