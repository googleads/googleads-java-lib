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
 * PremiumRateValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A premium of a {@link RateCard} which could be applied to the line
 * item and charges extra.
 */
public class PremiumRateValue  implements java.io.Serializable {
    /* The ID of the {@link PremiumRate} object to which this premium
     * rate value
     *                 belongs.
     *                 
     *                 This attribute is readonly. */
    private java.lang.Long premiumRateId;

    /* The feature type of this premium rate value.
     *                 
     *                 <p>This attribute is required and cannot be changed
     * after creation. */
    private com.google.api.ads.dfp.axis.v201802.PremiumFeature premiumFeature;

    /* The rate type this premium rate value would be applied to.
     *                 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.RateType rateType;

    /* Whether the premium rate value is a percentage or absolute
     * value to the
     *                 product rate.
     *                 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.PremiumAdjustmentType adjustmentType;

    /* If {@link #adjustmentType} is
     *                 {@link PremiumAdjustmentType#ABSOLUTE_VALUE}, this
     * value is
     *                 in micros. If {@link #adjustmentType} is
     *                 {@link PremiumAdjustmentType#PERCENTAGE}, this value
     * is in
     *                 millipercent.
     *                 
     *                 This attribute is required. */
    private java.lang.Long adjustmentSize;

    public PremiumRateValue() {
    }

    public PremiumRateValue(
           java.lang.Long premiumRateId,
           com.google.api.ads.dfp.axis.v201802.PremiumFeature premiumFeature,
           com.google.api.ads.dfp.axis.v201802.RateType rateType,
           com.google.api.ads.dfp.axis.v201802.PremiumAdjustmentType adjustmentType,
           java.lang.Long adjustmentSize) {
           this.premiumRateId = premiumRateId;
           this.premiumFeature = premiumFeature;
           this.rateType = rateType;
           this.adjustmentType = adjustmentType;
           this.adjustmentSize = adjustmentSize;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adjustmentSize", getAdjustmentSize())
            .add("adjustmentType", getAdjustmentType())
            .add("premiumFeature", getPremiumFeature())
            .add("premiumRateId", getPremiumRateId())
            .add("rateType", getRateType())
            .toString();
    }

    /**
     * Gets the premiumRateId value for this PremiumRateValue.
     * 
     * @return premiumRateId   * The ID of the {@link PremiumRate} object to which this premium
     * rate value
     *                 belongs.
     *                 
     *                 This attribute is readonly.
     */
    public java.lang.Long getPremiumRateId() {
        return premiumRateId;
    }


    /**
     * Sets the premiumRateId value for this PremiumRateValue.
     * 
     * @param premiumRateId   * The ID of the {@link PremiumRate} object to which this premium
     * rate value
     *                 belongs.
     *                 
     *                 This attribute is readonly.
     */
    public void setPremiumRateId(java.lang.Long premiumRateId) {
        this.premiumRateId = premiumRateId;
    }


    /**
     * Gets the premiumFeature value for this PremiumRateValue.
     * 
     * @return premiumFeature   * The feature type of this premium rate value.
     *                 
     *                 <p>This attribute is required and cannot be changed
     * after creation.
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumFeature getPremiumFeature() {
        return premiumFeature;
    }


    /**
     * Sets the premiumFeature value for this PremiumRateValue.
     * 
     * @param premiumFeature   * The feature type of this premium rate value.
     *                 
     *                 <p>This attribute is required and cannot be changed
     * after creation.
     */
    public void setPremiumFeature(com.google.api.ads.dfp.axis.v201802.PremiumFeature premiumFeature) {
        this.premiumFeature = premiumFeature;
    }


    /**
     * Gets the rateType value for this PremiumRateValue.
     * 
     * @return rateType   * The rate type this premium rate value would be applied to.
     *                 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this PremiumRateValue.
     * 
     * @param rateType   * The rate type this premium rate value would be applied to.
     *                 
     *                 This attribute is required.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201802.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the adjustmentType value for this PremiumRateValue.
     * 
     * @return adjustmentType   * Whether the premium rate value is a percentage or absolute
     * value to the
     *                 product rate.
     *                 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.PremiumAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this PremiumRateValue.
     * 
     * @param adjustmentType   * Whether the premium rate value is a percentage or absolute
     * value to the
     *                 product rate.
     *                 
     *                 This attribute is required.
     */
    public void setAdjustmentType(com.google.api.ads.dfp.axis.v201802.PremiumAdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the adjustmentSize value for this PremiumRateValue.
     * 
     * @return adjustmentSize   * If {@link #adjustmentType} is
     *                 {@link PremiumAdjustmentType#ABSOLUTE_VALUE}, this
     * value is
     *                 in micros. If {@link #adjustmentType} is
     *                 {@link PremiumAdjustmentType#PERCENTAGE}, this value
     * is in
     *                 millipercent.
     *                 
     *                 This attribute is required.
     */
    public java.lang.Long getAdjustmentSize() {
        return adjustmentSize;
    }


    /**
     * Sets the adjustmentSize value for this PremiumRateValue.
     * 
     * @param adjustmentSize   * If {@link #adjustmentType} is
     *                 {@link PremiumAdjustmentType#ABSOLUTE_VALUE}, this
     * value is
     *                 in micros. If {@link #adjustmentType} is
     *                 {@link PremiumAdjustmentType#PERCENTAGE}, this value
     * is in
     *                 millipercent.
     *                 
     *                 This attribute is required.
     */
    public void setAdjustmentSize(java.lang.Long adjustmentSize) {
        this.adjustmentSize = adjustmentSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PremiumRateValue)) return false;
        PremiumRateValue other = (PremiumRateValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.premiumRateId==null && other.getPremiumRateId()==null) || 
             (this.premiumRateId!=null &&
              this.premiumRateId.equals(other.getPremiumRateId()))) &&
            ((this.premiumFeature==null && other.getPremiumFeature()==null) || 
             (this.premiumFeature!=null &&
              this.premiumFeature.equals(other.getPremiumFeature()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.adjustmentSize==null && other.getAdjustmentSize()==null) || 
             (this.adjustmentSize!=null &&
              this.adjustmentSize.equals(other.getAdjustmentSize())));
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
        if (getPremiumRateId() != null) {
            _hashCode += getPremiumRateId().hashCode();
        }
        if (getPremiumFeature() != null) {
            _hashCode += getPremiumFeature().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getAdjustmentSize() != null) {
            _hashCode += getAdjustmentSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PremiumRateValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PremiumRateValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiumRateId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "premiumRateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PremiumAdjustmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adjustmentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
