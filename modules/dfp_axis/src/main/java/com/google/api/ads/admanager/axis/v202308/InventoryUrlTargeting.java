// Copyright 2023 Google LLC
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
 * InventoryUrlTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202308;

public class InventoryUrlTargeting  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202308.InventoryUrl[] targetedUrls;

    private com.google.api.ads.admanager.axis.v202308.InventoryUrl[] excludedUrls;

    public InventoryUrlTargeting() {
    }

    public InventoryUrlTargeting(
           com.google.api.ads.admanager.axis.v202308.InventoryUrl[] targetedUrls,
           com.google.api.ads.admanager.axis.v202308.InventoryUrl[] excludedUrls) {
           this.targetedUrls = targetedUrls;
           this.excludedUrls = excludedUrls;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedUrls", getExcludedUrls())
            .add("targetedUrls", getTargetedUrls())
            .toString();
    }

    /**
     * Gets the targetedUrls value for this InventoryUrlTargeting.
     * 
     * @return targetedUrls
     */
    public com.google.api.ads.admanager.axis.v202308.InventoryUrl[] getTargetedUrls() {
        return targetedUrls;
    }


    /**
     * Sets the targetedUrls value for this InventoryUrlTargeting.
     * 
     * @param targetedUrls
     */
    public void setTargetedUrls(com.google.api.ads.admanager.axis.v202308.InventoryUrl[] targetedUrls) {
        this.targetedUrls = targetedUrls;
    }

    public com.google.api.ads.admanager.axis.v202308.InventoryUrl getTargetedUrls(int i) {
        return this.targetedUrls[i];
    }

    public void setTargetedUrls(int i, com.google.api.ads.admanager.axis.v202308.InventoryUrl _value) {
        this.targetedUrls[i] = _value;
    }


    /**
     * Gets the excludedUrls value for this InventoryUrlTargeting.
     * 
     * @return excludedUrls
     */
    public com.google.api.ads.admanager.axis.v202308.InventoryUrl[] getExcludedUrls() {
        return excludedUrls;
    }


    /**
     * Sets the excludedUrls value for this InventoryUrlTargeting.
     * 
     * @param excludedUrls
     */
    public void setExcludedUrls(com.google.api.ads.admanager.axis.v202308.InventoryUrl[] excludedUrls) {
        this.excludedUrls = excludedUrls;
    }

    public com.google.api.ads.admanager.axis.v202308.InventoryUrl getExcludedUrls(int i) {
        return this.excludedUrls[i];
    }

    public void setExcludedUrls(int i, com.google.api.ads.admanager.axis.v202308.InventoryUrl _value) {
        this.excludedUrls[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryUrlTargeting)) return false;
        InventoryUrlTargeting other = (InventoryUrlTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedUrls==null && other.getTargetedUrls()==null) || 
             (this.targetedUrls!=null &&
              java.util.Arrays.equals(this.targetedUrls, other.getTargetedUrls()))) &&
            ((this.excludedUrls==null && other.getExcludedUrls()==null) || 
             (this.excludedUrls!=null &&
              java.util.Arrays.equals(this.excludedUrls, other.getExcludedUrls())));
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
        if (getTargetedUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedUrls(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryUrlTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "InventoryUrlTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "targetedUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "InventoryUrl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "excludedUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202308", "InventoryUrl"));
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
