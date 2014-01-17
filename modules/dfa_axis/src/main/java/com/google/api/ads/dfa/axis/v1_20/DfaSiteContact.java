/**
 * DfaSiteContact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class DfaSiteContact  extends com.google.api.ads.dfa.axis.v1_20.DfaSiteContactBase  implements java.io.Serializable {
    private long dfaSiteContactTypeId;

    private long dfaSiteId;

    private java.lang.String firstName;

    private java.lang.String lastName;

    public DfaSiteContact() {
    }

    public DfaSiteContact(
           long id,
           java.lang.String name,
           long dfaSiteContactTypeId,
           long dfaSiteId,
           java.lang.String firstName,
           java.lang.String lastName) {
        super(
            id,
            name);
        this.dfaSiteContactTypeId = dfaSiteContactTypeId;
        this.dfaSiteId = dfaSiteId;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    /**
     * Gets the dfaSiteContactTypeId value for this DfaSiteContact.
     * 
     * @return dfaSiteContactTypeId
     */
    public long getDfaSiteContactTypeId() {
        return dfaSiteContactTypeId;
    }


    /**
     * Sets the dfaSiteContactTypeId value for this DfaSiteContact.
     * 
     * @param dfaSiteContactTypeId
     */
    public void setDfaSiteContactTypeId(long dfaSiteContactTypeId) {
        this.dfaSiteContactTypeId = dfaSiteContactTypeId;
    }


    /**
     * Gets the dfaSiteId value for this DfaSiteContact.
     * 
     * @return dfaSiteId
     */
    public long getDfaSiteId() {
        return dfaSiteId;
    }


    /**
     * Sets the dfaSiteId value for this DfaSiteContact.
     * 
     * @param dfaSiteId
     */
    public void setDfaSiteId(long dfaSiteId) {
        this.dfaSiteId = dfaSiteId;
    }


    /**
     * Gets the firstName value for this DfaSiteContact.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this DfaSiteContact.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this DfaSiteContact.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this DfaSiteContact.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DfaSiteContact)) return false;
        DfaSiteContact other = (DfaSiteContact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.dfaSiteContactTypeId == other.getDfaSiteContactTypeId() &&
            this.dfaSiteId == other.getDfaSiteId() &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName())));
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
        _hashCode += new Long(getDfaSiteContactTypeId()).hashCode();
        _hashCode += new Long(getDfaSiteId()).hashCode();
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DfaSiteContact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DfaSiteContact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfaSiteContactTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfaSiteContactTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfaSiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dfaSiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
