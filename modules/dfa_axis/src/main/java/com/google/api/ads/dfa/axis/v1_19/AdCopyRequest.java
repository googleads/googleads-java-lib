/**
 * AdCopyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfa.axis.v1_19;

public class AdCopyRequest  implements java.io.Serializable {
    private long adId;

    private long campaignId;

    private boolean copyCreativeAssociation;

    private boolean copyPlacementAssignment;

    public AdCopyRequest() {
    }

    public AdCopyRequest(
           long adId,
           long campaignId,
           boolean copyCreativeAssociation,
           boolean copyPlacementAssignment) {
           this.adId = adId;
           this.campaignId = campaignId;
           this.copyCreativeAssociation = copyCreativeAssociation;
           this.copyPlacementAssignment = copyPlacementAssignment;
    }


    /**
     * Gets the adId value for this AdCopyRequest.
     * 
     * @return adId
     */
    public long getAdId() {
        return adId;
    }


    /**
     * Sets the adId value for this AdCopyRequest.
     * 
     * @param adId
     */
    public void setAdId(long adId) {
        this.adId = adId;
    }


    /**
     * Gets the campaignId value for this AdCopyRequest.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this AdCopyRequest.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the copyCreativeAssociation value for this AdCopyRequest.
     * 
     * @return copyCreativeAssociation
     */
    public boolean isCopyCreativeAssociation() {
        return copyCreativeAssociation;
    }


    /**
     * Sets the copyCreativeAssociation value for this AdCopyRequest.
     * 
     * @param copyCreativeAssociation
     */
    public void setCopyCreativeAssociation(boolean copyCreativeAssociation) {
        this.copyCreativeAssociation = copyCreativeAssociation;
    }


    /**
     * Gets the copyPlacementAssignment value for this AdCopyRequest.
     * 
     * @return copyPlacementAssignment
     */
    public boolean isCopyPlacementAssignment() {
        return copyPlacementAssignment;
    }


    /**
     * Sets the copyPlacementAssignment value for this AdCopyRequest.
     * 
     * @param copyPlacementAssignment
     */
    public void setCopyPlacementAssignment(boolean copyPlacementAssignment) {
        this.copyPlacementAssignment = copyPlacementAssignment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdCopyRequest)) return false;
        AdCopyRequest other = (AdCopyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.adId == other.getAdId() &&
            this.campaignId == other.getCampaignId() &&
            this.copyCreativeAssociation == other.isCopyCreativeAssociation() &&
            this.copyPlacementAssignment == other.isCopyPlacementAssignment();
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
        _hashCode += new Long(getAdId()).hashCode();
        _hashCode += new Long(getCampaignId()).hashCode();
        _hashCode += (isCopyCreativeAssociation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCopyPlacementAssignment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdCopyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.doubleclick.net/dfa-api/v1.19", "AdCopyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adId"));
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
        elemField.setFieldName("copyCreativeAssociation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyCreativeAssociation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyPlacementAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyPlacementAssignment"));
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
