/**
 * SiteDirectorySiteImportRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class SiteDirectorySiteImportRequest  implements java.io.Serializable {
    private long siteDirectorySiteId;

    private long subnetworkId;

    public SiteDirectorySiteImportRequest() {
    }

    public SiteDirectorySiteImportRequest(
           long siteDirectorySiteId,
           long subnetworkId) {
           this.siteDirectorySiteId = siteDirectorySiteId;
           this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the siteDirectorySiteId value for this SiteDirectorySiteImportRequest.
     * 
     * @return siteDirectorySiteId
     */
    public long getSiteDirectorySiteId() {
        return siteDirectorySiteId;
    }


    /**
     * Sets the siteDirectorySiteId value for this SiteDirectorySiteImportRequest.
     * 
     * @param siteDirectorySiteId
     */
    public void setSiteDirectorySiteId(long siteDirectorySiteId) {
        this.siteDirectorySiteId = siteDirectorySiteId;
    }


    /**
     * Gets the subnetworkId value for this SiteDirectorySiteImportRequest.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this SiteDirectorySiteImportRequest.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SiteDirectorySiteImportRequest)) return false;
        SiteDirectorySiteImportRequest other = (SiteDirectorySiteImportRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.siteDirectorySiteId == other.getSiteDirectorySiteId() &&
            this.subnetworkId == other.getSubnetworkId();
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
        _hashCode += new Long(getSiteDirectorySiteId()).hashCode();
        _hashCode += new Long(getSubnetworkId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SiteDirectorySiteImportRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "SiteDirectorySiteImportRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteDirectorySiteId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteDirectorySiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subnetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subnetworkId"));
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
