/**
 * CreativeAssetSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeAssetSearchCriteria  implements java.io.Serializable {
    private long advertiserId;

    private java.lang.String assetFilename;

    private boolean forHTMLCreatives;

    public CreativeAssetSearchCriteria() {
    }

    public CreativeAssetSearchCriteria(
           long advertiserId,
           java.lang.String assetFilename,
           boolean forHTMLCreatives) {
           this.advertiserId = advertiserId;
           this.assetFilename = assetFilename;
           this.forHTMLCreatives = forHTMLCreatives;
    }


    /**
     * Gets the advertiserId value for this CreativeAssetSearchCriteria.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this CreativeAssetSearchCriteria.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the assetFilename value for this CreativeAssetSearchCriteria.
     * 
     * @return assetFilename
     */
    public java.lang.String getAssetFilename() {
        return assetFilename;
    }


    /**
     * Sets the assetFilename value for this CreativeAssetSearchCriteria.
     * 
     * @param assetFilename
     */
    public void setAssetFilename(java.lang.String assetFilename) {
        this.assetFilename = assetFilename;
    }


    /**
     * Gets the forHTMLCreatives value for this CreativeAssetSearchCriteria.
     * 
     * @return forHTMLCreatives
     */
    public boolean isForHTMLCreatives() {
        return forHTMLCreatives;
    }


    /**
     * Sets the forHTMLCreatives value for this CreativeAssetSearchCriteria.
     * 
     * @param forHTMLCreatives
     */
    public void setForHTMLCreatives(boolean forHTMLCreatives) {
        this.forHTMLCreatives = forHTMLCreatives;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeAssetSearchCriteria)) return false;
        CreativeAssetSearchCriteria other = (CreativeAssetSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.advertiserId == other.getAdvertiserId() &&
            ((this.assetFilename==null && other.getAssetFilename()==null) || 
             (this.assetFilename!=null &&
              this.assetFilename.equals(other.getAssetFilename()))) &&
            this.forHTMLCreatives == other.isForHTMLCreatives();
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
        _hashCode += new Long(getAdvertiserId()).hashCode();
        if (getAssetFilename() != null) {
            _hashCode += getAssetFilename().hashCode();
        }
        _hashCode += (isForHTMLCreatives() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeAssetSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeAssetSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetFilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assetFilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forHTMLCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forHTMLCreatives"));
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
