// Copyright 2018 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * PremiumRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A premium rate holding a set of {@link PremiumRateValue} objects
 * with the same {@link
 *             PremiumFeature}.
 */
public class PremiumRate  implements java.io.Serializable {
    /* Uniquely identifies the {@code PremiumRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a premium rate
     *                 is created. */
    private java.lang.Long id;

    /* The ID of the {@link RateCard} object to which this premium
     * rate belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private java.lang.Long rateCardId;

    /* The method of deciding which {@link PremiumRateValue} objects
     * from this
     *                 {@code PremiumRate} to apply to a {@link ProposalLineItem}.
     * 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.PricingMethod pricingMethod;

    /* The feature type of this premium rate.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private com.google.api.ads.dfp.axis.v201802.PremiumFeature premiumFeature;

    /* The premiums rate values in this rate. */
    private com.google.api.ads.dfp.axis.v201802.PremiumRateValue[] premiumRateValues;

    public PremiumRate() {
    }

    public PremiumRate(
           java.lang.Long id,
           java.lang.Long rateCardId,
           com.google.api.ads.dfp.axis.v201802.PricingMethod pricingMethod,
           com.google.api.ads.dfp.axis.v201802.PremiumFeature premiumFeature,
           com.google.api.ads.dfp.axis.v201802.PremiumRateValue[] premiumRateValues) {
           this.id = id;
           this.rateCardId = rateCardId;
           this.pricingMethod = pricingMethod;
           this.premiumFeature = premiumFeature;
           this.premiumRateValues = premiumRateValues;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("premiumFeature", getPremiumFeature())
            .add("premiumRateValues", getPremiumRateValues())
            .add("pricingMethod", getPricingMethod())
            .add("rateCardId", getRateCardId())
            .toString();
    }

    /**
     * Gets the id value for this PremiumRate.
     * 
     * @return id   * Uniquely identifies the {@code PremiumRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a premium rate
     *                 is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this PremiumRate.
     * 
     * @param id   * Uniquely identifies the {@code PremiumRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a premium rate
     *                 is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the rateCardId value for this PremiumRate.
     * 
     * @return rateCardId   * The ID of the {@link RateCard} object to which this premium
     * rate belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public java.lang.Long getRateCardId() {
        return rateCardId;
    }


    /**
     * Sets the rateCardId value for this PremiumRate.
     * 
     * @param rateCardId   * The ID of the {@link RateCard} object to which this premium
     * rate belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the pricingMethod value for this PremiumRate.
     * 
     * @return pricingMethod   * The method of deciding which {@link PremiumRateValue} objects
     * from this
     *                 {@code PremiumRate} to apply to a {@link ProposalLineItem}.
     * 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.PricingMethod getPricingMethod() {
        return pricingMethod;
    }


    /**
     * Sets the pricingMethod value for this PremiumRate.
     * 
     * @param pricingMethod   * The method of deciding which {@link PremiumRateValue} objects
     * from this
     *                 {@code PremiumRate} to apply to a {@link ProposalLineItem}.
     * 
     *                 This attribute is required.
     */
    public void setPricingMethod(com.google.api.ads.dfp.axis.v201802.PricingMethod pricingMethod) {
        this.pricingMethod = pricingMethod;
    }


    /**
     * Gets the premiumFeature value for this PremiumRate.
     * 
     * @return premiumFeature   * The feature type of this premium rate.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumFeature getPremiumFeature() {
        return premiumFeature;
    }


    /**
     * Sets the premiumFeature value for this PremiumRate.
     * 
     * @param premiumFeature   * The feature type of this premium rate.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setPremiumFeature(com.google.api.ads.dfp.axis.v201802.PremiumFeature premiumFeature) {
        this.premiumFeature = premiumFeature;
    }


    /**
     * Gets the premiumRateValues value for this PremiumRate.
     * 
     * @return premiumRateValues   * The premiums rate values in this rate.
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumRateValue[] getPremiumRateValues() {
        return premiumRateValues;
    }


    /**
     * Sets the premiumRateValues value for this PremiumRate.
     * 
     * @param premiumRateValues   * The premiums rate values in this rate.
     */
    public void setPremiumRateValues(com.google.api.ads.dfp.axis.v201802.PremiumRateValue[] premiumRateValues) {
        this.premiumRateValues = premiumRateValues;
    }

    public com.google.api.ads.dfp.axis.v201802.PremiumRateValue getPremiumRateValues(int i) {
        return this.premiumRateValues[i];
    }

    public void setPremiumRateValues(int i, com.google.api.ads.dfp.axis.v201802.PremiumRateValue _value) {
        this.premiumRateValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PremiumRate)) return false;
        PremiumRate other = (PremiumRate) obj;
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
            ((this.premiumFeature==null && other.getPremiumFeature()==null) || 
             (this.premiumFeature!=null &&
              this.premiumFeature.equals(other.getPremiumFeature()))) &&
            ((this.premiumRateValues==null && other.getPremiumRateValues()==null) || 
             (this.premiumRateValues!=null &&
              java.util.Arrays.equals(this.premiumRateValues, other.getPremiumRateValues())));
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
        if (getPremiumFeature() != null) {
            _hashCode += getPremiumFeature().hashCode();
        }
        if (getPremiumRateValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPremiumRateValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPremiumRateValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PremiumRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PremiumRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "pricingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PricingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiumFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "premiumFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PremiumFeature"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiumRateValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "premiumRateValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PremiumRateValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
