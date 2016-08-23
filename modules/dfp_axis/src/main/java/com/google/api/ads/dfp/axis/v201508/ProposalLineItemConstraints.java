// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.dfp.axis.v201508;


/**
 * A {@code PropoalLineItemConstraints} represents all the constraints
 * set for a
 *             {@link ProposalLineItem} and is always readonly. It comes
 * from the {@link Product},
 *             based on which the proposal line item is created.
 */
public class ProposalLineItemConstraints  implements java.io.Serializable {
    /* The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.FrequencyCap[] builtInFrequencyCaps;

    /* Built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.Targeting productBuiltInTargeting;

    /* Specifies what targeting or attributes for the created {@link
     * ProposalLineItem}
     *                 are customizable.
     *                 
     *                 <p>This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201508.CustomizableAttributes customizableAttributes;

    public ProposalLineItemConstraints() {
    }

    public ProposalLineItemConstraints(
           com.google.api.ads.dfp.axis.v201508.FrequencyCap[] builtInFrequencyCaps,
           com.google.api.ads.dfp.axis.v201508.Targeting productBuiltInTargeting,
           com.google.api.ads.dfp.axis.v201508.CustomizableAttributes customizableAttributes) {
           this.builtInFrequencyCaps = builtInFrequencyCaps;
           this.productBuiltInTargeting = productBuiltInTargeting;
           this.customizableAttributes = customizableAttributes;
    }


    /**
     * Gets the builtInFrequencyCaps value for this ProposalLineItemConstraints.
     * 
     * @return builtInFrequencyCaps   * The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.FrequencyCap[] getBuiltInFrequencyCaps() {
        return builtInFrequencyCaps;
    }


    /**
     * Sets the builtInFrequencyCaps value for this ProposalLineItemConstraints.
     * 
     * @param builtInFrequencyCaps   * The built-in frequency caps for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setBuiltInFrequencyCaps(com.google.api.ads.dfp.axis.v201508.FrequencyCap[] builtInFrequencyCaps) {
        this.builtInFrequencyCaps = builtInFrequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201508.FrequencyCap getBuiltInFrequencyCaps(int i) {
        return this.builtInFrequencyCaps[i];
    }

    public void setBuiltInFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201508.FrequencyCap _value) {
        this.builtInFrequencyCaps[i] = _value;
    }


    /**
     * Gets the productBuiltInTargeting value for this ProposalLineItemConstraints.
     * 
     * @return productBuiltInTargeting   * Built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201508.Targeting getProductBuiltInTargeting() {
        return productBuiltInTargeting;
    }


    /**
     * Sets the productBuiltInTargeting value for this ProposalLineItemConstraints.
     * 
     * @param productBuiltInTargeting   * Built-in targeting for the created {@link ProposalLineItem}.
     * 
     *                 <p>This attribute is read-only.
     */
    public void setProductBuiltInTargeting(com.google.api.ads.dfp.axis.v201508.Targeting productBuiltInTargeting) {
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
    public com.google.api.ads.dfp.axis.v201508.CustomizableAttributes getCustomizableAttributes() {
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
    public void setCustomizableAttributes(com.google.api.ads.dfp.axis.v201508.CustomizableAttributes customizableAttributes) {
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "ProposalLineItemConstraints"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtInFrequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "builtInFrequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productBuiltInTargeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "productBuiltInTargeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customizableAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "customizableAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201508", "CustomizableAttributes"));
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
