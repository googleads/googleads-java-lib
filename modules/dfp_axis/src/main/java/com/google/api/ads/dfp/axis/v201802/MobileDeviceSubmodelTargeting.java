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
 * MobileDeviceSubmodelTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents mobile devices that are being targeted or excluded by
 * the {@link LineItem}.
 */
public class MobileDeviceSubmodelTargeting  implements java.io.Serializable {
    /* Mobile device submodels that are being targeted by the {@link
     * LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.Technology[] targetedMobileDeviceSubmodels;

    /* Mobile device submodels that are being excluded by the {@link
     * LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.Technology[] excludedMobileDeviceSubmodels;

    public MobileDeviceSubmodelTargeting() {
    }

    public MobileDeviceSubmodelTargeting(
           com.google.api.ads.dfp.axis.v201802.Technology[] targetedMobileDeviceSubmodels,
           com.google.api.ads.dfp.axis.v201802.Technology[] excludedMobileDeviceSubmodels) {
           this.targetedMobileDeviceSubmodels = targetedMobileDeviceSubmodels;
           this.excludedMobileDeviceSubmodels = excludedMobileDeviceSubmodels;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedMobileDeviceSubmodels", getExcludedMobileDeviceSubmodels())
            .add("targetedMobileDeviceSubmodels", getTargetedMobileDeviceSubmodels())
            .toString();
    }

    /**
     * Gets the targetedMobileDeviceSubmodels value for this MobileDeviceSubmodelTargeting.
     * 
     * @return targetedMobileDeviceSubmodels   * Mobile device submodels that are being targeted by the {@link
     * LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.Technology[] getTargetedMobileDeviceSubmodels() {
        return targetedMobileDeviceSubmodels;
    }


    /**
     * Sets the targetedMobileDeviceSubmodels value for this MobileDeviceSubmodelTargeting.
     * 
     * @param targetedMobileDeviceSubmodels   * Mobile device submodels that are being targeted by the {@link
     * LineItem}.
     */
    public void setTargetedMobileDeviceSubmodels(com.google.api.ads.dfp.axis.v201802.Technology[] targetedMobileDeviceSubmodels) {
        this.targetedMobileDeviceSubmodels = targetedMobileDeviceSubmodels;
    }

    public com.google.api.ads.dfp.axis.v201802.Technology getTargetedMobileDeviceSubmodels(int i) {
        return this.targetedMobileDeviceSubmodels[i];
    }

    public void setTargetedMobileDeviceSubmodels(int i, com.google.api.ads.dfp.axis.v201802.Technology _value) {
        this.targetedMobileDeviceSubmodels[i] = _value;
    }


    /**
     * Gets the excludedMobileDeviceSubmodels value for this MobileDeviceSubmodelTargeting.
     * 
     * @return excludedMobileDeviceSubmodels   * Mobile device submodels that are being excluded by the {@link
     * LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.Technology[] getExcludedMobileDeviceSubmodels() {
        return excludedMobileDeviceSubmodels;
    }


    /**
     * Sets the excludedMobileDeviceSubmodels value for this MobileDeviceSubmodelTargeting.
     * 
     * @param excludedMobileDeviceSubmodels   * Mobile device submodels that are being excluded by the {@link
     * LineItem}.
     */
    public void setExcludedMobileDeviceSubmodels(com.google.api.ads.dfp.axis.v201802.Technology[] excludedMobileDeviceSubmodels) {
        this.excludedMobileDeviceSubmodels = excludedMobileDeviceSubmodels;
    }

    public com.google.api.ads.dfp.axis.v201802.Technology getExcludedMobileDeviceSubmodels(int i) {
        return this.excludedMobileDeviceSubmodels[i];
    }

    public void setExcludedMobileDeviceSubmodels(int i, com.google.api.ads.dfp.axis.v201802.Technology _value) {
        this.excludedMobileDeviceSubmodels[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileDeviceSubmodelTargeting)) return false;
        MobileDeviceSubmodelTargeting other = (MobileDeviceSubmodelTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedMobileDeviceSubmodels==null && other.getTargetedMobileDeviceSubmodels()==null) || 
             (this.targetedMobileDeviceSubmodels!=null &&
              java.util.Arrays.equals(this.targetedMobileDeviceSubmodels, other.getTargetedMobileDeviceSubmodels()))) &&
            ((this.excludedMobileDeviceSubmodels==null && other.getExcludedMobileDeviceSubmodels()==null) || 
             (this.excludedMobileDeviceSubmodels!=null &&
              java.util.Arrays.equals(this.excludedMobileDeviceSubmodels, other.getExcludedMobileDeviceSubmodels())));
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
        if (getTargetedMobileDeviceSubmodels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedMobileDeviceSubmodels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedMobileDeviceSubmodels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedMobileDeviceSubmodels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedMobileDeviceSubmodels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedMobileDeviceSubmodels(), i);
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
        new org.apache.axis.description.TypeDesc(MobileDeviceSubmodelTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "MobileDeviceSubmodelTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedMobileDeviceSubmodels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetedMobileDeviceSubmodels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Technology"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedMobileDeviceSubmodels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "excludedMobileDeviceSubmodels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Technology"));
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
