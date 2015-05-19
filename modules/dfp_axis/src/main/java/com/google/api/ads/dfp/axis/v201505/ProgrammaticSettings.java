/**
 * ProgrammaticSettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201505;


/**
 * Represents the additional settings of a programmatic order.
 */
public class ProgrammaticSettings  implements java.io.Serializable {
    /* The ID of the buyer network that is billed for this order.
     * This field is only required if
     *                 the buyer platform is DBM. */
    private java.lang.Long adxBuyerNetworkId;

    /* The ID of the buyer as known in the buyer platform. This is
     * used for the buyer to determine
     *                 who to bill. For DBM, this will be DBM's partner ID.
     * This field is required. */
    private java.lang.Long buyerId;

    /* The buyer platform. This field is required. */
    private com.google.api.ads.dfp.axis.v201505.BuyerPlatform buyerPlatform;

    /* The billing term. This field is required. */
    private com.google.api.ads.dfp.axis.v201505.BillingTermsType billingTermsType;

    /* The programmatic status. This value is readonly and is assigned
     * by Google. */
    private com.google.api.ads.dfp.axis.v201505.ProgrammaticStatus status;

    public ProgrammaticSettings() {
    }

    public ProgrammaticSettings(
           java.lang.Long adxBuyerNetworkId,
           java.lang.Long buyerId,
           com.google.api.ads.dfp.axis.v201505.BuyerPlatform buyerPlatform,
           com.google.api.ads.dfp.axis.v201505.BillingTermsType billingTermsType,
           com.google.api.ads.dfp.axis.v201505.ProgrammaticStatus status) {
           this.adxBuyerNetworkId = adxBuyerNetworkId;
           this.buyerId = buyerId;
           this.buyerPlatform = buyerPlatform;
           this.billingTermsType = billingTermsType;
           this.status = status;
    }


    /**
     * Gets the adxBuyerNetworkId value for this ProgrammaticSettings.
     * 
     * @return adxBuyerNetworkId   * The ID of the buyer network that is billed for this order.
     * This field is only required if
     *                 the buyer platform is DBM.
     */
    public java.lang.Long getAdxBuyerNetworkId() {
        return adxBuyerNetworkId;
    }


    /**
     * Sets the adxBuyerNetworkId value for this ProgrammaticSettings.
     * 
     * @param adxBuyerNetworkId   * The ID of the buyer network that is billed for this order.
     * This field is only required if
     *                 the buyer platform is DBM.
     */
    public void setAdxBuyerNetworkId(java.lang.Long adxBuyerNetworkId) {
        this.adxBuyerNetworkId = adxBuyerNetworkId;
    }


    /**
     * Gets the buyerId value for this ProgrammaticSettings.
     * 
     * @return buyerId   * The ID of the buyer as known in the buyer platform. This is
     * used for the buyer to determine
     *                 who to bill. For DBM, this will be DBM's partner ID.
     * This field is required.
     */
    public java.lang.Long getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this ProgrammaticSettings.
     * 
     * @param buyerId   * The ID of the buyer as known in the buyer platform. This is
     * used for the buyer to determine
     *                 who to bill. For DBM, this will be DBM's partner ID.
     * This field is required.
     */
    public void setBuyerId(java.lang.Long buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the buyerPlatform value for this ProgrammaticSettings.
     * 
     * @return buyerPlatform   * The buyer platform. This field is required.
     */
    public com.google.api.ads.dfp.axis.v201505.BuyerPlatform getBuyerPlatform() {
        return buyerPlatform;
    }


    /**
     * Sets the buyerPlatform value for this ProgrammaticSettings.
     * 
     * @param buyerPlatform   * The buyer platform. This field is required.
     */
    public void setBuyerPlatform(com.google.api.ads.dfp.axis.v201505.BuyerPlatform buyerPlatform) {
        this.buyerPlatform = buyerPlatform;
    }


    /**
     * Gets the billingTermsType value for this ProgrammaticSettings.
     * 
     * @return billingTermsType   * The billing term. This field is required.
     */
    public com.google.api.ads.dfp.axis.v201505.BillingTermsType getBillingTermsType() {
        return billingTermsType;
    }


    /**
     * Sets the billingTermsType value for this ProgrammaticSettings.
     * 
     * @param billingTermsType   * The billing term. This field is required.
     */
    public void setBillingTermsType(com.google.api.ads.dfp.axis.v201505.BillingTermsType billingTermsType) {
        this.billingTermsType = billingTermsType;
    }


    /**
     * Gets the status value for this ProgrammaticSettings.
     * 
     * @return status   * The programmatic status. This value is readonly and is assigned
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201505.ProgrammaticStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProgrammaticSettings.
     * 
     * @param status   * The programmatic status. This value is readonly and is assigned
     * by Google.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201505.ProgrammaticStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProgrammaticSettings)) return false;
        ProgrammaticSettings other = (ProgrammaticSettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adxBuyerNetworkId==null && other.getAdxBuyerNetworkId()==null) || 
             (this.adxBuyerNetworkId!=null &&
              this.adxBuyerNetworkId.equals(other.getAdxBuyerNetworkId()))) &&
            ((this.buyerId==null && other.getBuyerId()==null) || 
             (this.buyerId!=null &&
              this.buyerId.equals(other.getBuyerId()))) &&
            ((this.buyerPlatform==null && other.getBuyerPlatform()==null) || 
             (this.buyerPlatform!=null &&
              this.buyerPlatform.equals(other.getBuyerPlatform()))) &&
            ((this.billingTermsType==null && other.getBillingTermsType()==null) || 
             (this.billingTermsType!=null &&
              this.billingTermsType.equals(other.getBillingTermsType()))) &&
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
        if (getAdxBuyerNetworkId() != null) {
            _hashCode += getAdxBuyerNetworkId().hashCode();
        }
        if (getBuyerId() != null) {
            _hashCode += getBuyerId().hashCode();
        }
        if (getBuyerPlatform() != null) {
            _hashCode += getBuyerPlatform().hashCode();
        }
        if (getBillingTermsType() != null) {
            _hashCode += getBillingTermsType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProgrammaticSettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "ProgrammaticSettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adxBuyerNetworkId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "adxBuyerNetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "buyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "buyerPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "BuyerPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTermsType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "billingTermsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "BillingTermsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201505", "ProgrammaticStatus"));
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
