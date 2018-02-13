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
 * InventoryTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A collection of targeted and excluded ad units and placements.
 */
public class InventoryTargeting  implements java.io.Serializable {
    /* A list of targeted {@link AdUnitTargeting}. */
    private com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] targetedAdUnits;

    /* A list of excluded {@link AdUnitTargeting}. */
    private com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] excludedAdUnits;

    /* A list of targeted {@link Placement} ids. */
    private long[] targetedPlacementIds;

    public InventoryTargeting() {
    }

    public InventoryTargeting(
           com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] targetedAdUnits,
           com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] excludedAdUnits,
           long[] targetedPlacementIds) {
           this.targetedAdUnits = targetedAdUnits;
           this.excludedAdUnits = excludedAdUnits;
           this.targetedPlacementIds = targetedPlacementIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedAdUnits", getExcludedAdUnits())
            .add("targetedAdUnits", getTargetedAdUnits())
            .add("targetedPlacementIds", getTargetedPlacementIds())
            .toString();
    }

    /**
     * Gets the targetedAdUnits value for this InventoryTargeting.
     * 
     * @return targetedAdUnits   * A list of targeted {@link AdUnitTargeting}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] getTargetedAdUnits() {
        return targetedAdUnits;
    }


    /**
     * Sets the targetedAdUnits value for this InventoryTargeting.
     * 
     * @param targetedAdUnits   * A list of targeted {@link AdUnitTargeting}.
     */
    public void setTargetedAdUnits(com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] targetedAdUnits) {
        this.targetedAdUnits = targetedAdUnits;
    }

    public com.google.api.ads.dfp.axis.v201802.AdUnitTargeting getTargetedAdUnits(int i) {
        return this.targetedAdUnits[i];
    }

    public void setTargetedAdUnits(int i, com.google.api.ads.dfp.axis.v201802.AdUnitTargeting _value) {
        this.targetedAdUnits[i] = _value;
    }


    /**
     * Gets the excludedAdUnits value for this InventoryTargeting.
     * 
     * @return excludedAdUnits   * A list of excluded {@link AdUnitTargeting}.
     */
    public com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] getExcludedAdUnits() {
        return excludedAdUnits;
    }


    /**
     * Sets the excludedAdUnits value for this InventoryTargeting.
     * 
     * @param excludedAdUnits   * A list of excluded {@link AdUnitTargeting}.
     */
    public void setExcludedAdUnits(com.google.api.ads.dfp.axis.v201802.AdUnitTargeting[] excludedAdUnits) {
        this.excludedAdUnits = excludedAdUnits;
    }

    public com.google.api.ads.dfp.axis.v201802.AdUnitTargeting getExcludedAdUnits(int i) {
        return this.excludedAdUnits[i];
    }

    public void setExcludedAdUnits(int i, com.google.api.ads.dfp.axis.v201802.AdUnitTargeting _value) {
        this.excludedAdUnits[i] = _value;
    }


    /**
     * Gets the targetedPlacementIds value for this InventoryTargeting.
     * 
     * @return targetedPlacementIds   * A list of targeted {@link Placement} ids.
     */
    public long[] getTargetedPlacementIds() {
        return targetedPlacementIds;
    }


    /**
     * Sets the targetedPlacementIds value for this InventoryTargeting.
     * 
     * @param targetedPlacementIds   * A list of targeted {@link Placement} ids.
     */
    public void setTargetedPlacementIds(long[] targetedPlacementIds) {
        this.targetedPlacementIds = targetedPlacementIds;
    }

    public long getTargetedPlacementIds(int i) {
        return this.targetedPlacementIds[i];
    }

    public void setTargetedPlacementIds(int i, long _value) {
        this.targetedPlacementIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryTargeting)) return false;
        InventoryTargeting other = (InventoryTargeting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedAdUnits==null && other.getTargetedAdUnits()==null) || 
             (this.targetedAdUnits!=null &&
              java.util.Arrays.equals(this.targetedAdUnits, other.getTargetedAdUnits()))) &&
            ((this.excludedAdUnits==null && other.getExcludedAdUnits()==null) || 
             (this.excludedAdUnits!=null &&
              java.util.Arrays.equals(this.excludedAdUnits, other.getExcludedAdUnits()))) &&
            ((this.targetedPlacementIds==null && other.getTargetedPlacementIds()==null) || 
             (this.targetedPlacementIds!=null &&
              java.util.Arrays.equals(this.targetedPlacementIds, other.getTargetedPlacementIds())));
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
        if (getTargetedAdUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedAdUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedAdUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedAdUnits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedAdUnits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedAdUnits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetedPlacementIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedPlacementIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedPlacementIds(), i);
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
        new org.apache.axis.description.TypeDesc(InventoryTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "InventoryTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedAdUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetedAdUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdUnitTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedAdUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "excludedAdUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdUnitTargeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedPlacementIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targetedPlacementIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
