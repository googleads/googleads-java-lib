/**
 * Advertiser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class Advertiser  extends com.google.api.ads.dfa.axis.v1_19.AdvertiserBase  implements java.io.Serializable {
    private long advertiserGroupId;

    private boolean approved;

    private boolean hidden;

    private boolean impressionExchangeEnabled;

    private boolean inventoryAdvertiser;

    private long networkId;

    private long spotId;

    private long subnetworkId;

    public Advertiser() {
    }

    public Advertiser(
           long id,
           java.lang.String name,
           long advertiserGroupId,
           boolean approved,
           boolean hidden,
           boolean impressionExchangeEnabled,
           boolean inventoryAdvertiser,
           long networkId,
           long spotId,
           long subnetworkId) {
        super(
            id,
            name);
        this.advertiserGroupId = advertiserGroupId;
        this.approved = approved;
        this.hidden = hidden;
        this.impressionExchangeEnabled = impressionExchangeEnabled;
        this.inventoryAdvertiser = inventoryAdvertiser;
        this.networkId = networkId;
        this.spotId = spotId;
        this.subnetworkId = subnetworkId;
    }


    /**
     * Gets the advertiserGroupId value for this Advertiser.
     * 
     * @return advertiserGroupId
     */
    public long getAdvertiserGroupId() {
        return advertiserGroupId;
    }


    /**
     * Sets the advertiserGroupId value for this Advertiser.
     * 
     * @param advertiserGroupId
     */
    public void setAdvertiserGroupId(long advertiserGroupId) {
        this.advertiserGroupId = advertiserGroupId;
    }


    /**
     * Gets the approved value for this Advertiser.
     * 
     * @return approved
     */
    public boolean isApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this Advertiser.
     * 
     * @param approved
     */
    public void setApproved(boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the hidden value for this Advertiser.
     * 
     * @return hidden
     */
    public boolean isHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this Advertiser.
     * 
     * @param hidden
     */
    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the impressionExchangeEnabled value for this Advertiser.
     * 
     * @return impressionExchangeEnabled
     */
    public boolean isImpressionExchangeEnabled() {
        return impressionExchangeEnabled;
    }


    /**
     * Sets the impressionExchangeEnabled value for this Advertiser.
     * 
     * @param impressionExchangeEnabled
     */
    public void setImpressionExchangeEnabled(boolean impressionExchangeEnabled) {
        this.impressionExchangeEnabled = impressionExchangeEnabled;
    }


    /**
     * Gets the inventoryAdvertiser value for this Advertiser.
     * 
     * @return inventoryAdvertiser
     */
    public boolean isInventoryAdvertiser() {
        return inventoryAdvertiser;
    }


    /**
     * Sets the inventoryAdvertiser value for this Advertiser.
     * 
     * @param inventoryAdvertiser
     */
    public void setInventoryAdvertiser(boolean inventoryAdvertiser) {
        this.inventoryAdvertiser = inventoryAdvertiser;
    }


    /**
     * Gets the networkId value for this Advertiser.
     * 
     * @return networkId
     */
    public long getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this Advertiser.
     * 
     * @param networkId
     */
    public void setNetworkId(long networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the spotId value for this Advertiser.
     * 
     * @return spotId
     */
    public long getSpotId() {
        return spotId;
    }


    /**
     * Sets the spotId value for this Advertiser.
     * 
     * @param spotId
     */
    public void setSpotId(long spotId) {
        this.spotId = spotId;
    }


    /**
     * Gets the subnetworkId value for this Advertiser.
     * 
     * @return subnetworkId
     */
    public long getSubnetworkId() {
        return subnetworkId;
    }


    /**
     * Sets the subnetworkId value for this Advertiser.
     * 
     * @param subnetworkId
     */
    public void setSubnetworkId(long subnetworkId) {
        this.subnetworkId = subnetworkId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Advertiser)) return false;
        Advertiser other = (Advertiser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.advertiserGroupId == other.getAdvertiserGroupId() &&
            this.approved == other.isApproved() &&
            this.hidden == other.isHidden() &&
            this.impressionExchangeEnabled == other.isImpressionExchangeEnabled() &&
            this.inventoryAdvertiser == other.isInventoryAdvertiser() &&
            this.networkId == other.getNetworkId() &&
            this.spotId == other.getSpotId() &&
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
        int _hashCode = super.hashCode();
        _hashCode += new Long(getAdvertiserGroupId()).hashCode();
        _hashCode += (isApproved() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHidden() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImpressionExchangeEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInventoryAdvertiser() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Long(getNetworkId()).hashCode();
        _hashCode += new Long(getSpotId()).hashCode();
        _hashCode += new Long(getSubnetworkId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Advertiser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "Advertiser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertiserGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impressionExchangeEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "impressionExchangeEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryAdvertiser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inventoryAdvertiser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spotId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spotId"));
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
