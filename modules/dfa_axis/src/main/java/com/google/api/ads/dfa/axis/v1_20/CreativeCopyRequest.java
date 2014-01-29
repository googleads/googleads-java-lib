/**
 * CreativeCopyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_20;

public class CreativeCopyRequest  implements java.io.Serializable {
    private long advertiserId;

    private long campaignId;

    private long copyMode;

    private long creativeId;

    public CreativeCopyRequest() {
    }

    public CreativeCopyRequest(
           long advertiserId,
           long campaignId,
           long copyMode,
           long creativeId) {
           this.advertiserId = advertiserId;
           this.campaignId = campaignId;
           this.copyMode = copyMode;
           this.creativeId = creativeId;
    }


    /**
     * Gets the advertiserId value for this CreativeCopyRequest.
     * 
     * @return advertiserId
     */
    public long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this CreativeCopyRequest.
     * 
     * @param advertiserId
     */
    public void setAdvertiserId(long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the campaignId value for this CreativeCopyRequest.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CreativeCopyRequest.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the copyMode value for this CreativeCopyRequest.
     * 
     * @return copyMode
     */
    public long getCopyMode() {
        return copyMode;
    }


    /**
     * Sets the copyMode value for this CreativeCopyRequest.
     * 
     * @param copyMode
     */
    public void setCopyMode(long copyMode) {
        this.copyMode = copyMode;
    }


    /**
     * Gets the creativeId value for this CreativeCopyRequest.
     * 
     * @return creativeId
     */
    public long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this CreativeCopyRequest.
     * 
     * @param creativeId
     */
    public void setCreativeId(long creativeId) {
        this.creativeId = creativeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreativeCopyRequest)) return false;
        CreativeCopyRequest other = (CreativeCopyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.advertiserId == other.getAdvertiserId() &&
            this.campaignId == other.getCampaignId() &&
            this.copyMode == other.getCopyMode() &&
            this.creativeId == other.getCreativeId();
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
        _hashCode += new Long(getCampaignId()).hashCode();
        _hashCode += new Long(getCopyMode()).hashCode();
        _hashCode += new Long(getCreativeId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreativeCopyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.20", "CreativeCopyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creativeId"));
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
