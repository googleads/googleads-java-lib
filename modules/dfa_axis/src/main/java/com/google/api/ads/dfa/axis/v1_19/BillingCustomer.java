/**
 * BillingCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class BillingCustomer  implements java.io.Serializable {
    private java.lang.String accessCodeType;

    private boolean active;

    private java.lang.String billingCode;

    private java.util.Calendar expirationDate;

    private boolean publisher;

    public BillingCustomer() {
    }

    public BillingCustomer(
           java.lang.String accessCodeType,
           boolean active,
           java.lang.String billingCode,
           java.util.Calendar expirationDate,
           boolean publisher) {
           this.accessCodeType = accessCodeType;
           this.active = active;
           this.billingCode = billingCode;
           this.expirationDate = expirationDate;
           this.publisher = publisher;
    }


    /**
     * Gets the accessCodeType value for this BillingCustomer.
     * 
     * @return accessCodeType
     */
    public java.lang.String getAccessCodeType() {
        return accessCodeType;
    }


    /**
     * Sets the accessCodeType value for this BillingCustomer.
     * 
     * @param accessCodeType
     */
    public void setAccessCodeType(java.lang.String accessCodeType) {
        this.accessCodeType = accessCodeType;
    }


    /**
     * Gets the active value for this BillingCustomer.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this BillingCustomer.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the billingCode value for this BillingCustomer.
     * 
     * @return billingCode
     */
    public java.lang.String getBillingCode() {
        return billingCode;
    }


    /**
     * Sets the billingCode value for this BillingCustomer.
     * 
     * @param billingCode
     */
    public void setBillingCode(java.lang.String billingCode) {
        this.billingCode = billingCode;
    }


    /**
     * Gets the expirationDate value for this BillingCustomer.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this BillingCustomer.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the publisher value for this BillingCustomer.
     * 
     * @return publisher
     */
    public boolean isPublisher() {
        return publisher;
    }


    /**
     * Sets the publisher value for this BillingCustomer.
     * 
     * @param publisher
     */
    public void setPublisher(boolean publisher) {
        this.publisher = publisher;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingCustomer)) return false;
        BillingCustomer other = (BillingCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessCodeType==null && other.getAccessCodeType()==null) || 
             (this.accessCodeType!=null &&
              this.accessCodeType.equals(other.getAccessCodeType()))) &&
            this.active == other.isActive() &&
            ((this.billingCode==null && other.getBillingCode()==null) || 
             (this.billingCode!=null &&
              this.billingCode.equals(other.getBillingCode()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            this.publisher == other.isPublisher();
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
        if (getAccessCodeType() != null) {
            _hashCode += getAccessCodeType().hashCode();
        }
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBillingCode() != null) {
            _hashCode += getBillingCode().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        _hashCode += (isPublisher() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "BillingCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publisher");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publisher"));
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
