/**
 * UserDomainTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


/**
 * Provides line items the ability to target or exclude users visiting
 * their
 *             websites from a list of domains or subdomains.
 */
public class UserDomainTargeting  implements java.io.Serializable {
    /* The domains or subdomains that are being targeted or excluded
     * by the
     *                 {@link LineItem}. This attribute is required and the
     * maximum length of each
     *                 domain is 67 characters. */
    private java.lang.String[] domains;

    /* Indicates whether domains should be targeted or excluded. This
     * attribute is
     *                 optional and defaults to {@code true}. */
    private java.lang.Boolean targeted;

    public UserDomainTargeting() {
    }

    public UserDomainTargeting(
           java.lang.String[] domains,
           java.lang.Boolean targeted) {
           this.domains = domains;
           this.targeted = targeted;
    }


    /**
     * Gets the domains value for this UserDomainTargeting.
     * 
     * @return domains   * The domains or subdomains that are being targeted or excluded
     * by the
     *                 {@link LineItem}. This attribute is required and the
     * maximum length of each
     *                 domain is 67 characters.
     */
    public java.lang.String[] getDomains() {
        return domains;
    }


    /**
     * Sets the domains value for this UserDomainTargeting.
     * 
     * @param domains   * The domains or subdomains that are being targeted or excluded
     * by the
     *                 {@link LineItem}. This attribute is required and the
     * maximum length of each
     *                 domain is 67 characters.
     */
    public void setDomains(java.lang.String[] domains) {
        this.domains = domains;
    }

    public java.lang.String getDomains(int i) {
        return this.domains[i];
    }

    public void setDomains(int i, java.lang.String _value) {
        this.domains[i] = _value;
    }


    /**
     * Gets the targeted value for this UserDomainTargeting.
     * 
     * @return targeted   * Indicates whether domains should be targeted or excluded. This
     * attribute is
     *                 optional and defaults to {@code true}.
     */
    public java.lang.Boolean getTargeted() {
        return targeted;
    }


    /**
     * Sets the targeted value for this UserDomainTargeting.
     * 
     * @param targeted   * Indicates whether domains should be targeted or excluded. This
     * attribute is
     *                 optional and defaults to {@code true}.
     */
    public void setTargeted(java.lang.Boolean targeted) {
        this.targeted = targeted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDomainTargeting)) return false;
        UserDomainTargeting other = (UserDomainTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domains==null && other.getDomains()==null) || 
             (this.domains!=null &&
              java.util.Arrays.equals(this.domains, other.getDomains()))) &&
            ((this.targeted==null && other.getTargeted()==null) || 
             (this.targeted!=null &&
              this.targeted.equals(other.getTargeted())));
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
        if (getDomains() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomains());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomains(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargeted() != null) {
            _hashCode += getTargeted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDomainTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "UserDomainTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domains");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "domains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "targeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
