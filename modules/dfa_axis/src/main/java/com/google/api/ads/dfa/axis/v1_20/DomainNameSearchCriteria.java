/**
 * DomainNameSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class DomainNameSearchCriteria  extends com.google.api.ads.dfa.axis.v1_20.PageableSearchCriteriaBase  implements java.io.Serializable {
    private java.lang.String domain;

    public DomainNameSearchCriteria() {
    }

    public DomainNameSearchCriteria(
           long[] ids,
           java.lang.String searchString,
           int pageNumber,
           int pageSize,
           java.lang.String domain) {
        super(
            ids,
            searchString,
            pageNumber,
            pageSize);
        this.domain = domain;
    }


    /**
     * Gets the domain value for this DomainNameSearchCriteria.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this DomainNameSearchCriteria.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainNameSearchCriteria)) return false;
        DomainNameSearchCriteria other = (DomainNameSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain())));
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainNameSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "DomainNameSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
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
