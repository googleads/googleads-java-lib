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
 * CustomTargetingPremiumFeature.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A premium feature applied to custom criteria targeting.
 */
public class CustomTargetingPremiumFeature  extends com.google.api.ads.dfp.axis.v201802.PremiumFeature  implements java.io.Serializable {
    /* The ID of the {@link CustomTargetingKey}.
     *                     
     *                     <p>This attribute is required and cannot be changed
     * after creation. */
    private java.lang.Long customTargetingKeyId;

    /* The ID of the {@link CustomTargetingValue}. {@code null} if
     * all custom
     *                     targeting values of the {@link #customTargetingKeyId}
     * should be matched.
     *                     
     *                     <p>This attribute cannot be changed after creation. */
    private java.lang.Long customTargetingValueId;

    public CustomTargetingPremiumFeature() {
    }

    public CustomTargetingPremiumFeature(
           java.lang.Long customTargetingKeyId,
           java.lang.Long customTargetingValueId) {
        this.customTargetingKeyId = customTargetingKeyId;
        this.customTargetingValueId = customTargetingValueId;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("customTargetingKeyId", getCustomTargetingKeyId())
            .add("customTargetingValueId", getCustomTargetingValueId())
            .toString();
    }

    /**
     * Gets the customTargetingKeyId value for this CustomTargetingPremiumFeature.
     * 
     * @return customTargetingKeyId   * The ID of the {@link CustomTargetingKey}.
     *                     
     *                     <p>This attribute is required and cannot be changed
     * after creation.
     */
    public java.lang.Long getCustomTargetingKeyId() {
        return customTargetingKeyId;
    }


    /**
     * Sets the customTargetingKeyId value for this CustomTargetingPremiumFeature.
     * 
     * @param customTargetingKeyId   * The ID of the {@link CustomTargetingKey}.
     *                     
     *                     <p>This attribute is required and cannot be changed
     * after creation.
     */
    public void setCustomTargetingKeyId(java.lang.Long customTargetingKeyId) {
        this.customTargetingKeyId = customTargetingKeyId;
    }


    /**
     * Gets the customTargetingValueId value for this CustomTargetingPremiumFeature.
     * 
     * @return customTargetingValueId   * The ID of the {@link CustomTargetingValue}. {@code null} if
     * all custom
     *                     targeting values of the {@link #customTargetingKeyId}
     * should be matched.
     *                     
     *                     <p>This attribute cannot be changed after creation.
     */
    public java.lang.Long getCustomTargetingValueId() {
        return customTargetingValueId;
    }


    /**
     * Sets the customTargetingValueId value for this CustomTargetingPremiumFeature.
     * 
     * @param customTargetingValueId   * The ID of the {@link CustomTargetingValue}. {@code null} if
     * all custom
     *                     targeting values of the {@link #customTargetingKeyId}
     * should be matched.
     *                     
     *                     <p>This attribute cannot be changed after creation.
     */
    public void setCustomTargetingValueId(java.lang.Long customTargetingValueId) {
        this.customTargetingValueId = customTargetingValueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTargetingPremiumFeature)) return false;
        CustomTargetingPremiumFeature other = (CustomTargetingPremiumFeature) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customTargetingKeyId==null && other.getCustomTargetingKeyId()==null) || 
             (this.customTargetingKeyId!=null &&
              this.customTargetingKeyId.equals(other.getCustomTargetingKeyId()))) &&
            ((this.customTargetingValueId==null && other.getCustomTargetingValueId()==null) || 
             (this.customTargetingValueId!=null &&
              this.customTargetingValueId.equals(other.getCustomTargetingValueId())));
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
        if (getCustomTargetingKeyId() != null) {
            _hashCode += getCustomTargetingKeyId().hashCode();
        }
        if (getCustomTargetingValueId() != null) {
            _hashCode += getCustomTargetingValueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTargetingPremiumFeature.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomTargetingPremiumFeature"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customTargetingKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customTargetingValueId"));
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
