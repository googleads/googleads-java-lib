/**
 * RateCardCustomizationGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


/**
 * The group of rate card customiations.
 */
public class RateCardCustomizationGroup  implements java.io.Serializable {
    /* Uniquely identifies the {@code RateCardCustomizationGroup}
     * object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a rate card
     *                 customization group is created. */
    private java.lang.Long id;

    /* The ID of the {@link RateCard} object to which this rate card
     * customization group
     *                 belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private java.lang.Long rateCardId;

    /* The method of deciding which {@link RateCardCustomization}
     * objects from
     *                 this {@code RateCardCustomizationGroup} to apply to
     * a
     *                 {@link ProposalLineItem}.
     *                 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201403.PricingMethod pricingMethod;

    /* The feature type of the customizations in this rate card customization
     * group.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private com.google.api.ads.dfp.axis.v201403.RateCardFeature rateCardFeature;

    public RateCardCustomizationGroup() {
    }

    public RateCardCustomizationGroup(
           java.lang.Long id,
           java.lang.Long rateCardId,
           com.google.api.ads.dfp.axis.v201403.PricingMethod pricingMethod,
           com.google.api.ads.dfp.axis.v201403.RateCardFeature rateCardFeature) {
           this.id = id;
           this.rateCardId = rateCardId;
           this.pricingMethod = pricingMethod;
           this.rateCardFeature = rateCardFeature;
    }


    /**
     * Gets the id value for this RateCardCustomizationGroup.
     * 
     * @return id   * Uniquely identifies the {@code RateCardCustomizationGroup}
     * object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a rate card
     *                 customization group is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this RateCardCustomizationGroup.
     * 
     * @param id   * Uniquely identifies the {@code RateCardCustomizationGroup}
     * object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a rate card
     *                 customization group is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the rateCardId value for this RateCardCustomizationGroup.
     * 
     * @return rateCardId   * The ID of the {@link RateCard} object to which this rate card
     * customization group
     *                 belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public java.lang.Long getRateCardId() {
        return rateCardId;
    }


    /**
     * Sets the rateCardId value for this RateCardCustomizationGroup.
     * 
     * @param rateCardId   * The ID of the {@link RateCard} object to which this rate card
     * customization group
     *                 belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the pricingMethod value for this RateCardCustomizationGroup.
     * 
     * @return pricingMethod   * The method of deciding which {@link RateCardCustomization}
     * objects from
     *                 this {@code RateCardCustomizationGroup} to apply to
     * a
     *                 {@link ProposalLineItem}.
     *                 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201403.PricingMethod getPricingMethod() {
        return pricingMethod;
    }


    /**
     * Sets the pricingMethod value for this RateCardCustomizationGroup.
     * 
     * @param pricingMethod   * The method of deciding which {@link RateCardCustomization}
     * objects from
     *                 this {@code RateCardCustomizationGroup} to apply to
     * a
     *                 {@link ProposalLineItem}.
     *                 
     *                 This attribute is required.
     */
    public void setPricingMethod(com.google.api.ads.dfp.axis.v201403.PricingMethod pricingMethod) {
        this.pricingMethod = pricingMethod;
    }


    /**
     * Gets the rateCardFeature value for this RateCardCustomizationGroup.
     * 
     * @return rateCardFeature   * The feature type of the customizations in this rate card customization
     * group.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public com.google.api.ads.dfp.axis.v201403.RateCardFeature getRateCardFeature() {
        return rateCardFeature;
    }


    /**
     * Sets the rateCardFeature value for this RateCardCustomizationGroup.
     * 
     * @param rateCardFeature   * The feature type of the customizations in this rate card customization
     * group.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setRateCardFeature(com.google.api.ads.dfp.axis.v201403.RateCardFeature rateCardFeature) {
        this.rateCardFeature = rateCardFeature;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateCardCustomizationGroup)) return false;
        RateCardCustomizationGroup other = (RateCardCustomizationGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.rateCardId==null && other.getRateCardId()==null) || 
             (this.rateCardId!=null &&
              this.rateCardId.equals(other.getRateCardId()))) &&
            ((this.pricingMethod==null && other.getPricingMethod()==null) || 
             (this.pricingMethod!=null &&
              this.pricingMethod.equals(other.getPricingMethod()))) &&
            ((this.rateCardFeature==null && other.getRateCardFeature()==null) || 
             (this.rateCardFeature!=null &&
              this.rateCardFeature.equals(other.getRateCardFeature())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getRateCardId() != null) {
            _hashCode += getRateCardId().hashCode();
        }
        if (getPricingMethod() != null) {
            _hashCode += getPricingMethod().hashCode();
        }
        if (getRateCardFeature() != null) {
            _hashCode += getRateCardFeature().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateCardCustomizationGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateCardCustomizationGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "pricingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "PricingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rateCardFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateCardFeature"));
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
