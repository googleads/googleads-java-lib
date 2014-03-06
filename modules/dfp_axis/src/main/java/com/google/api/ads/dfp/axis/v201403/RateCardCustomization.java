/**
 * RateCardCustomization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201403;


/**
 * A customization of a {@link RateCard} which could be applied to
 * the line item
 *             and charges extra premiums.
 */
public class RateCardCustomization  implements java.io.Serializable {
    /* The ID of the {@link RateCardCustomizationGroup} object to
     * which this rate
     *                 card customization belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private java.lang.Long rateCardCustomizationGroupId;

    /* Uniquely identifies the {@code RateCardCustomization} object.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a rate card
     *                 customization is created. */
    private java.lang.Long id;

    /* The status of the {@code RateCardCustomization}. This attribute
     * is
     *                 read-only and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201403.RateCardCustomizationStatus status;

    /* The rate card feature this rate card customization is applied
     * to.
     *                 
     *                 This attribute cannot be changed after creation. */
    private com.google.api.ads.dfp.axis.v201403.RateCardFeature rateCardFeature;

    /* Whether the adjustment is a percentage or absolute value.
     *                 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201403.RateCardCustomizationAdjustmentType adjustmentType;

    /* If {@link #adjustmentType} is
     *                 {@link RateCardCustomizationAdjustmentType#ABSOLUTE_VALUE},
     * this value is
     *                 in micros. If {@link #adjustmentType} is
     *                 {@link RateCardCustomizationAdjustmentType#PERCENTAGE},
     * this value is in
     *                 millipercent.
     *                 
     *                 This attribute is required. */
    private java.lang.Long adjustmentSize;

    /* The rate type this customization would be applied to.
     *                 
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201403.RateType rateType;

    public RateCardCustomization() {
    }

    public RateCardCustomization(
           java.lang.Long rateCardCustomizationGroupId,
           java.lang.Long id,
           com.google.api.ads.dfp.axis.v201403.RateCardCustomizationStatus status,
           com.google.api.ads.dfp.axis.v201403.RateCardFeature rateCardFeature,
           com.google.api.ads.dfp.axis.v201403.RateCardCustomizationAdjustmentType adjustmentType,
           java.lang.Long adjustmentSize,
           com.google.api.ads.dfp.axis.v201403.RateType rateType) {
           this.rateCardCustomizationGroupId = rateCardCustomizationGroupId;
           this.id = id;
           this.status = status;
           this.rateCardFeature = rateCardFeature;
           this.adjustmentType = adjustmentType;
           this.adjustmentSize = adjustmentSize;
           this.rateType = rateType;
    }


    /**
     * Gets the rateCardCustomizationGroupId value for this RateCardCustomization.
     * 
     * @return rateCardCustomizationGroupId   * The ID of the {@link RateCardCustomizationGroup} object to
     * which this rate
     *                 card customization belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public java.lang.Long getRateCardCustomizationGroupId() {
        return rateCardCustomizationGroupId;
    }


    /**
     * Sets the rateCardCustomizationGroupId value for this RateCardCustomization.
     * 
     * @param rateCardCustomizationGroupId   * The ID of the {@link RateCardCustomizationGroup} object to
     * which this rate
     *                 card customization belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setRateCardCustomizationGroupId(java.lang.Long rateCardCustomizationGroupId) {
        this.rateCardCustomizationGroupId = rateCardCustomizationGroupId;
    }


    /**
     * Gets the id value for this RateCardCustomization.
     * 
     * @return id   * Uniquely identifies the {@code RateCardCustomization} object.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a rate card
     *                 customization is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this RateCardCustomization.
     * 
     * @param id   * Uniquely identifies the {@code RateCardCustomization} object.
     * 
     *                 This attribute is read-only and is assigned by Google
     * when a rate card
     *                 customization is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the status value for this RateCardCustomization.
     * 
     * @return status   * The status of the {@code RateCardCustomization}. This attribute
     * is
     *                 read-only and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201403.RateCardCustomizationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RateCardCustomization.
     * 
     * @param status   * The status of the {@code RateCardCustomization}. This attribute
     * is
     *                 read-only and is assigned by Google.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201403.RateCardCustomizationStatus status) {
        this.status = status;
    }


    /**
     * Gets the rateCardFeature value for this RateCardCustomization.
     * 
     * @return rateCardFeature   * The rate card feature this rate card customization is applied
     * to.
     *                 
     *                 This attribute cannot be changed after creation.
     */
    public com.google.api.ads.dfp.axis.v201403.RateCardFeature getRateCardFeature() {
        return rateCardFeature;
    }


    /**
     * Sets the rateCardFeature value for this RateCardCustomization.
     * 
     * @param rateCardFeature   * The rate card feature this rate card customization is applied
     * to.
     *                 
     *                 This attribute cannot be changed after creation.
     */
    public void setRateCardFeature(com.google.api.ads.dfp.axis.v201403.RateCardFeature rateCardFeature) {
        this.rateCardFeature = rateCardFeature;
    }


    /**
     * Gets the adjustmentType value for this RateCardCustomization.
     * 
     * @return adjustmentType   * Whether the adjustment is a percentage or absolute value.
     *                 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201403.RateCardCustomizationAdjustmentType getAdjustmentType() {
        return adjustmentType;
    }


    /**
     * Sets the adjustmentType value for this RateCardCustomization.
     * 
     * @param adjustmentType   * Whether the adjustment is a percentage or absolute value.
     *                 
     *                 This attribute is required.
     */
    public void setAdjustmentType(com.google.api.ads.dfp.axis.v201403.RateCardCustomizationAdjustmentType adjustmentType) {
        this.adjustmentType = adjustmentType;
    }


    /**
     * Gets the adjustmentSize value for this RateCardCustomization.
     * 
     * @return adjustmentSize   * If {@link #adjustmentType} is
     *                 {@link RateCardCustomizationAdjustmentType#ABSOLUTE_VALUE},
     * this value is
     *                 in micros. If {@link #adjustmentType} is
     *                 {@link RateCardCustomizationAdjustmentType#PERCENTAGE},
     * this value is in
     *                 millipercent.
     *                 
     *                 This attribute is required.
     */
    public java.lang.Long getAdjustmentSize() {
        return adjustmentSize;
    }


    /**
     * Sets the adjustmentSize value for this RateCardCustomization.
     * 
     * @param adjustmentSize   * If {@link #adjustmentType} is
     *                 {@link RateCardCustomizationAdjustmentType#ABSOLUTE_VALUE},
     * this value is
     *                 in micros. If {@link #adjustmentType} is
     *                 {@link RateCardCustomizationAdjustmentType#PERCENTAGE},
     * this value is in
     *                 millipercent.
     *                 
     *                 This attribute is required.
     */
    public void setAdjustmentSize(java.lang.Long adjustmentSize) {
        this.adjustmentSize = adjustmentSize;
    }


    /**
     * Gets the rateType value for this RateCardCustomization.
     * 
     * @return rateType   * The rate type this customization would be applied to.
     *                 
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201403.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this RateCardCustomization.
     * 
     * @param rateType   * The rate type this customization would be applied to.
     *                 
     *                 This attribute is required.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201403.RateType rateType) {
        this.rateType = rateType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateCardCustomization)) return false;
        RateCardCustomization other = (RateCardCustomization) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateCardCustomizationGroupId==null && other.getRateCardCustomizationGroupId()==null) || 
             (this.rateCardCustomizationGroupId!=null &&
              this.rateCardCustomizationGroupId.equals(other.getRateCardCustomizationGroupId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.rateCardFeature==null && other.getRateCardFeature()==null) || 
             (this.rateCardFeature!=null &&
              this.rateCardFeature.equals(other.getRateCardFeature()))) &&
            ((this.adjustmentType==null && other.getAdjustmentType()==null) || 
             (this.adjustmentType!=null &&
              this.adjustmentType.equals(other.getAdjustmentType()))) &&
            ((this.adjustmentSize==null && other.getAdjustmentSize()==null) || 
             (this.adjustmentSize!=null &&
              this.adjustmentSize.equals(other.getAdjustmentSize()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType())));
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
        if (getRateCardCustomizationGroupId() != null) {
            _hashCode += getRateCardCustomizationGroupId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getRateCardFeature() != null) {
            _hashCode += getRateCardFeature().hashCode();
        }
        if (getAdjustmentType() != null) {
            _hashCode += getAdjustmentType().hashCode();
        }
        if (getAdjustmentSize() != null) {
            _hashCode += getAdjustmentSize().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateCardCustomization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateCardCustomization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardCustomizationGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rateCardCustomizationGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateCardCustomizationStatus"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "adjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateCardCustomizationAdjustmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "adjustmentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201403", "RateType"));
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
