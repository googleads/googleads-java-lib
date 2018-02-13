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
 * ProposalLineItemConstraints.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code PropoalLineItemConstraints} represents all the constraints
 * set for a {@link
 *             ProposalLineItem} and is always readonly. It comes from
 * the {@link Product}, based on which the
 *             proposal line item is created.
 */
public class ProposalLineItemConstraints  implements java.io.Serializable {
    /* Allows customization of {@link CreativePlaceholder creative
     * placeholders} when creating
     *                 {@link ProposalLineItem proposal line items}.
     *                 
     *                 <p>This attribute is read-only. */
    private java.lang.Boolean allowCreativePlaceholdersCustomization;

    /* The built-in {@link CreativePlaceholder creative placeholders}
     * for the created
     *                 {@link ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] builtInCreativePlaceholders;

    /* The built-in roadblocking type for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.RoadblockingType builtInRoadblockingType;

    /* The built-in delivery rate type for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryRateType builtInDeliveryRateType;

    /* The built-in creative rotation type for the created {@link
     * ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.CreativeRotationType builtInCreativeRotationType;

    /* The built-in companion delivery option for the created {@link
     * ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption builtInCompanionDeliveryOption;

    /* The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.FrequencyCap[] builtInFrequencyCaps;

    /* Built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Targeting productBuiltInTargeting;

    /* Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.CustomizableAttributes customizableAttributes;

    public ProposalLineItemConstraints() {
    }

    public ProposalLineItemConstraints(
           java.lang.Boolean allowCreativePlaceholdersCustomization,
           com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] builtInCreativePlaceholders,
           com.google.api.ads.dfp.axis.v201802.RoadblockingType builtInRoadblockingType,
           com.google.api.ads.dfp.axis.v201802.DeliveryRateType builtInDeliveryRateType,
           com.google.api.ads.dfp.axis.v201802.CreativeRotationType builtInCreativeRotationType,
           com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption builtInCompanionDeliveryOption,
           com.google.api.ads.dfp.axis.v201802.FrequencyCap[] builtInFrequencyCaps,
           com.google.api.ads.dfp.axis.v201802.Targeting productBuiltInTargeting,
           com.google.api.ads.dfp.axis.v201802.CustomizableAttributes customizableAttributes) {
           this.allowCreativePlaceholdersCustomization = allowCreativePlaceholdersCustomization;
           this.builtInCreativePlaceholders = builtInCreativePlaceholders;
           this.builtInRoadblockingType = builtInRoadblockingType;
           this.builtInDeliveryRateType = builtInDeliveryRateType;
           this.builtInCreativeRotationType = builtInCreativeRotationType;
           this.builtInCompanionDeliveryOption = builtInCompanionDeliveryOption;
           this.builtInFrequencyCaps = builtInFrequencyCaps;
           this.productBuiltInTargeting = productBuiltInTargeting;
           this.customizableAttributes = customizableAttributes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowCreativePlaceholdersCustomization", getAllowCreativePlaceholdersCustomization())
            .add("builtInCompanionDeliveryOption", getBuiltInCompanionDeliveryOption())
            .add("builtInCreativePlaceholders", getBuiltInCreativePlaceholders())
            .add("builtInCreativeRotationType", getBuiltInCreativeRotationType())
            .add("builtInDeliveryRateType", getBuiltInDeliveryRateType())
            .add("builtInFrequencyCaps", getBuiltInFrequencyCaps())
            .add("builtInRoadblockingType", getBuiltInRoadblockingType())
            .add("customizableAttributes", getCustomizableAttributes())
            .add("productBuiltInTargeting", getProductBuiltInTargeting())
            .toString();
    }

    /**
     * Gets the allowCreativePlaceholdersCustomization value for this ProposalLineItemConstraints.
     * 
     * @return allowCreativePlaceholdersCustomization   * Allows customization of {@link CreativePlaceholder creative
     * placeholders} when creating
     *                 {@link ProposalLineItem proposal line items}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public java.lang.Boolean getAllowCreativePlaceholdersCustomization() {
        return allowCreativePlaceholdersCustomization;
    }


    /**
     * Sets the allowCreativePlaceholdersCustomization value for this ProposalLineItemConstraints.
     * 
     * @param allowCreativePlaceholdersCustomization   * Allows customization of {@link CreativePlaceholder creative
     * placeholders} when creating
     *                 {@link ProposalLineItem proposal line items}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setAllowCreativePlaceholdersCustomization(java.lang.Boolean allowCreativePlaceholdersCustomization) {
        this.allowCreativePlaceholdersCustomization = allowCreativePlaceholdersCustomization;
    }


    /**
     * Gets the builtInCreativePlaceholders value for this ProposalLineItemConstraints.
     * 
     * @return builtInCreativePlaceholders   * The built-in {@link CreativePlaceholder creative placeholders}
     * for the created
     *                 {@link ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] getBuiltInCreativePlaceholders() {
        return builtInCreativePlaceholders;
    }


    /**
     * Sets the builtInCreativePlaceholders value for this ProposalLineItemConstraints.
     * 
     * @param builtInCreativePlaceholders   * The built-in {@link CreativePlaceholder creative placeholders}
     * for the created
     *                 {@link ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInCreativePlaceholders(com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] builtInCreativePlaceholders) {
        this.builtInCreativePlaceholders = builtInCreativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder getBuiltInCreativePlaceholders(int i) {
        return this.builtInCreativePlaceholders[i];
    }

    public void setBuiltInCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201802.CreativePlaceholder _value) {
        this.builtInCreativePlaceholders[i] = _value;
    }


    /**
     * Gets the builtInRoadblockingType value for this ProposalLineItemConstraints.
     * 
     * @return builtInRoadblockingType   * The built-in roadblocking type for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.RoadblockingType getBuiltInRoadblockingType() {
        return builtInRoadblockingType;
    }


    /**
     * Sets the builtInRoadblockingType value for this ProposalLineItemConstraints.
     * 
     * @param builtInRoadblockingType   * The built-in roadblocking type for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInRoadblockingType(com.google.api.ads.dfp.axis.v201802.RoadblockingType builtInRoadblockingType) {
        this.builtInRoadblockingType = builtInRoadblockingType;
    }


    /**
     * Gets the builtInDeliveryRateType value for this ProposalLineItemConstraints.
     * 
     * @return builtInDeliveryRateType   * The built-in delivery rate type for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryRateType getBuiltInDeliveryRateType() {
        return builtInDeliveryRateType;
    }


    /**
     * Sets the builtInDeliveryRateType value for this ProposalLineItemConstraints.
     * 
     * @param builtInDeliveryRateType   * The built-in delivery rate type for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInDeliveryRateType(com.google.api.ads.dfp.axis.v201802.DeliveryRateType builtInDeliveryRateType) {
        this.builtInDeliveryRateType = builtInDeliveryRateType;
    }


    /**
     * Gets the builtInCreativeRotationType value for this ProposalLineItemConstraints.
     * 
     * @return builtInCreativeRotationType   * The built-in creative rotation type for the created {@link
     * ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeRotationType getBuiltInCreativeRotationType() {
        return builtInCreativeRotationType;
    }


    /**
     * Sets the builtInCreativeRotationType value for this ProposalLineItemConstraints.
     * 
     * @param builtInCreativeRotationType   * The built-in creative rotation type for the created {@link
     * ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInCreativeRotationType(com.google.api.ads.dfp.axis.v201802.CreativeRotationType builtInCreativeRotationType) {
        this.builtInCreativeRotationType = builtInCreativeRotationType;
    }


    /**
     * Gets the builtInCompanionDeliveryOption value for this ProposalLineItemConstraints.
     * 
     * @return builtInCompanionDeliveryOption   * The built-in companion delivery option for the created {@link
     * ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption getBuiltInCompanionDeliveryOption() {
        return builtInCompanionDeliveryOption;
    }


    /**
     * Sets the builtInCompanionDeliveryOption value for this ProposalLineItemConstraints.
     * 
     * @param builtInCompanionDeliveryOption   * The built-in companion delivery option for the created {@link
     * ProposalLineItem}.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption builtInCompanionDeliveryOption) {
        this.builtInCompanionDeliveryOption = builtInCompanionDeliveryOption;
    }


    /**
     * Gets the builtInFrequencyCaps value for this ProposalLineItemConstraints.
     * 
     * @return builtInFrequencyCaps   * The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.FrequencyCap[] getBuiltInFrequencyCaps() {
        return builtInFrequencyCaps;
    }


    /**
     * Sets the builtInFrequencyCaps value for this ProposalLineItemConstraints.
     * 
     * @param builtInFrequencyCaps   * The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInFrequencyCaps(com.google.api.ads.dfp.axis.v201802.FrequencyCap[] builtInFrequencyCaps) {
        this.builtInFrequencyCaps = builtInFrequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201802.FrequencyCap getBuiltInFrequencyCaps(int i) {
        return this.builtInFrequencyCaps[i];
    }

    public void setBuiltInFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201802.FrequencyCap _value) {
        this.builtInFrequencyCaps[i] = _value;
    }


    /**
     * Gets the productBuiltInTargeting value for this ProposalLineItemConstraints.
     * 
     * @return productBuiltInTargeting   * Built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Targeting getProductBuiltInTargeting() {
        return productBuiltInTargeting;
    }


    /**
     * Sets the productBuiltInTargeting value for this ProposalLineItemConstraints.
     * 
     * @param productBuiltInTargeting   * Built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setProductBuiltInTargeting(com.google.api.ads.dfp.axis.v201802.Targeting productBuiltInTargeting) {
        this.productBuiltInTargeting = productBuiltInTargeting;
    }


    /**
     * Gets the customizableAttributes value for this ProposalLineItemConstraints.
     * 
     * @return customizableAttributes   * Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.CustomizableAttributes getCustomizableAttributes() {
        return customizableAttributes;
    }


    /**
     * Sets the customizableAttributes value for this ProposalLineItemConstraints.
     * 
     * @param customizableAttributes   * Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is read-only.
     */
    public void setCustomizableAttributes(com.google.api.ads.dfp.axis.v201802.CustomizableAttributes customizableAttributes) {
        this.customizableAttributes = customizableAttributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItemConstraints)) return false;
        ProposalLineItemConstraints other = (ProposalLineItemConstraints) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowCreativePlaceholdersCustomization==null && other.getAllowCreativePlaceholdersCustomization()==null) || 
             (this.allowCreativePlaceholdersCustomization!=null &&
              this.allowCreativePlaceholdersCustomization.equals(other.getAllowCreativePlaceholdersCustomization()))) &&
            ((this.builtInCreativePlaceholders==null && other.getBuiltInCreativePlaceholders()==null) || 
             (this.builtInCreativePlaceholders!=null &&
              java.util.Arrays.equals(this.builtInCreativePlaceholders, other.getBuiltInCreativePlaceholders()))) &&
            ((this.builtInRoadblockingType==null && other.getBuiltInRoadblockingType()==null) || 
             (this.builtInRoadblockingType!=null &&
              this.builtInRoadblockingType.equals(other.getBuiltInRoadblockingType()))) &&
            ((this.builtInDeliveryRateType==null && other.getBuiltInDeliveryRateType()==null) || 
             (this.builtInDeliveryRateType!=null &&
              this.builtInDeliveryRateType.equals(other.getBuiltInDeliveryRateType()))) &&
            ((this.builtInCreativeRotationType==null && other.getBuiltInCreativeRotationType()==null) || 
             (this.builtInCreativeRotationType!=null &&
              this.builtInCreativeRotationType.equals(other.getBuiltInCreativeRotationType()))) &&
            ((this.builtInCompanionDeliveryOption==null && other.getBuiltInCompanionDeliveryOption()==null) || 
             (this.builtInCompanionDeliveryOption!=null &&
              this.builtInCompanionDeliveryOption.equals(other.getBuiltInCompanionDeliveryOption()))) &&
            ((this.builtInFrequencyCaps==null && other.getBuiltInFrequencyCaps()==null) || 
             (this.builtInFrequencyCaps!=null &&
              java.util.Arrays.equals(this.builtInFrequencyCaps, other.getBuiltInFrequencyCaps()))) &&
            ((this.productBuiltInTargeting==null && other.getProductBuiltInTargeting()==null) || 
             (this.productBuiltInTargeting!=null &&
              this.productBuiltInTargeting.equals(other.getProductBuiltInTargeting()))) &&
            ((this.customizableAttributes==null && other.getCustomizableAttributes()==null) || 
             (this.customizableAttributes!=null &&
              this.customizableAttributes.equals(other.getCustomizableAttributes())));
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
        if (getAllowCreativePlaceholdersCustomization() != null) {
            _hashCode += getAllowCreativePlaceholdersCustomization().hashCode();
        }
        if (getBuiltInCreativePlaceholders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuiltInCreativePlaceholders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuiltInCreativePlaceholders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuiltInRoadblockingType() != null) {
            _hashCode += getBuiltInRoadblockingType().hashCode();
        }
        if (getBuiltInDeliveryRateType() != null) {
            _hashCode += getBuiltInDeliveryRateType().hashCode();
        }
        if (getBuiltInCreativeRotationType() != null) {
            _hashCode += getBuiltInCreativeRotationType().hashCode();
        }
        if (getBuiltInCompanionDeliveryOption() != null) {
            _hashCode += getBuiltInCompanionDeliveryOption().hashCode();
        }
        if (getBuiltInFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuiltInFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuiltInFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductBuiltInTargeting() != null) {
            _hashCode += getProductBuiltInTargeting().hashCode();
        }
        if (getCustomizableAttributes() != null) {
            _hashCode += getCustomizableAttributes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItemConstraints.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItemConstraints"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowCreativePlaceholdersCustomization");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowCreativePlaceholdersCustomization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInCreativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInCreativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInRoadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInRoadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInDeliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInDeliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInCreativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInCreativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInCompanionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInCompanionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInFrequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "builtInFrequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productBuiltInTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productBuiltInTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customizableAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomizableAttributes"));
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
