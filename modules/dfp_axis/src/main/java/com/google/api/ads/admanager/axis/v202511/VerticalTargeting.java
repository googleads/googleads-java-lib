// Copyright 2025 Google LLC
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
 * VerticalTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202511;

public class VerticalTargeting  implements java.io.Serializable {
    private long[] targetedVerticalIds;

    private long[] excludedVerticalIds;

    public VerticalTargeting() {
    }

    public VerticalTargeting(
           long[] targetedVerticalIds,
           long[] excludedVerticalIds) {
           this.targetedVerticalIds = targetedVerticalIds;
           this.excludedVerticalIds = excludedVerticalIds;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedVerticalIds", getExcludedVerticalIds())
            .add("targetedVerticalIds", getTargetedVerticalIds())
            .toString();
    }

    /**
     * Gets the targetedVerticalIds value for this VerticalTargeting.
     * 
     * @return targetedVerticalIds
     */
    public long[] getTargetedVerticalIds() {
        return targetedVerticalIds;
    }


    /**
     * Sets the targetedVerticalIds value for this VerticalTargeting.
     * 
     * @param targetedVerticalIds
     */
    public void setTargetedVerticalIds(long[] targetedVerticalIds) {
        this.targetedVerticalIds = targetedVerticalIds;
    }

    public long getTargetedVerticalIds(int i) {
        return this.targetedVerticalIds[i];
    }

    public void setTargetedVerticalIds(int i, long _value) {
        this.targetedVerticalIds[i] = _value;
    }


    /**
     * Gets the excludedVerticalIds value for this VerticalTargeting.
     * 
     * @return excludedVerticalIds
     */
    public long[] getExcludedVerticalIds() {
        return excludedVerticalIds;
    }


    /**
     * Sets the excludedVerticalIds value for this VerticalTargeting.
     * 
     * @param excludedVerticalIds
     */
    public void setExcludedVerticalIds(long[] excludedVerticalIds) {
        this.excludedVerticalIds = excludedVerticalIds;
    }

    public long getExcludedVerticalIds(int i) {
        return this.excludedVerticalIds[i];
    }

    public void setExcludedVerticalIds(int i, long _value) {
        this.excludedVerticalIds[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerticalTargeting)) return false;
        VerticalTargeting other = (VerticalTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedVerticalIds==null && other.getTargetedVerticalIds()==null) || 
             (this.targetedVerticalIds!=null &&
              java.util.Arrays.equals(this.targetedVerticalIds, other.getTargetedVerticalIds()))) &&
            ((this.excludedVerticalIds==null && other.getExcludedVerticalIds()==null) || 
             (this.excludedVerticalIds!=null &&
              java.util.Arrays.equals(this.excludedVerticalIds, other.getExcludedVerticalIds())));
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
        if (getTargetedVerticalIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedVerticalIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedVerticalIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedVerticalIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedVerticalIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedVerticalIds(), i);
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
        new org.apache.axis.description.TypeDesc(VerticalTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "VerticalTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedVerticalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "targetedVerticalIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedVerticalIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202511", "excludedVerticalIds"));
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
