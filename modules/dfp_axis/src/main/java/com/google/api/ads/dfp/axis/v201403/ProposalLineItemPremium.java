/**
 * ProposalLineItemPremium.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


/**
 * Represents the status of a triggered {@link PremiumRateValue} (formerly
 * referred to as a {@code RateCardCustomization}).
 */
public class ProposalLineItemPremium  implements java.io.Serializable {
    /* The unique ID of the {@link RateCardCustomization} which is
     * a premium
     *                 triggered by the {@link ProposalLineItem}. This attribute
     * is required. */
    private java.lang.Long rateCardCustomizationId;

    /* The status of the triggered premium. This attribute is required. */
    private com.google.api.ads.dfp.axis.v201403.ProposalLineItemPremiumStatus status;

    public ProposalLineItemPremium() {
    }

    public ProposalLineItemPremium(
           java.lang.Long rateCardCustomizationId,
           com.google.api.ads.dfp.axis.v201403.ProposalLineItemPremiumStatus status) {
           this.rateCardCustomizationId = rateCardCustomizationId;
           this.status = status;
    }


    /**
     * Gets the rateCardCustomizationId value for this ProposalLineItemPremium.
     * 
     * @return rateCardCustomizationId   * The unique ID of the {@link RateCardCustomization} which is
     * a premium
     *                 triggered by the {@link ProposalLineItem}. This attribute
     * is required.
     */
    public java.lang.Long getRateCardCustomizationId() {
        return rateCardCustomizationId;
    }


    /**
     * Sets the rateCardCustomizationId value for this ProposalLineItemPremium.
     * 
     * @param rateCardCustomizationId   * The unique ID of the {@link RateCardCustomization} which is
     * a premium
     *                 triggered by the {@link ProposalLineItem}. This attribute
     * is required.
     */
    public void setRateCardCustomizationId(java.lang.Long rateCardCustomizationId) {
        this.rateCardCustomizationId = rateCardCustomizationId;
    }


    /**
     * Gets the status value for this ProposalLineItemPremium.
     * 
     * @return status   * The status of the triggered premium. This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201403.ProposalLineItemPremiumStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProposalLineItemPremium.
     * 
     * @param status   * The status of the triggered premium. This attribute is required.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201403.ProposalLineItemPremiumStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemPremium)) return false;
        ProposalLineItemPremium other = (ProposalLineItemPremium) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateCardCustomizationId==null && other.getRateCardCustomizationId()==null) || 
             (this.rateCardCustomizationId!=null &&
              this.rateCardCustomizationId.equals(other.getRateCardCustomizationId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getRateCardCustomizationId() != null) {
            _hashCode += getRateCardCustomizationId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemPremium.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ProposalLineItemPremium"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardCustomizationId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rateCardCustomizationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "ProposalLineItemPremiumStatus"));
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
