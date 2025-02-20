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
 * GeoTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public class GeoTargeting  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202502.Location[] targetedLocations;

    private com.google.api.ads.admanager.axis.v202502.Location[] excludedLocations;

    public GeoTargeting() {
    }

    public GeoTargeting(
           com.google.api.ads.admanager.axis.v202502.Location[] targetedLocations,
           com.google.api.ads.admanager.axis.v202502.Location[] excludedLocations) {
           this.targetedLocations = targetedLocations;
           this.excludedLocations = excludedLocations;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("excludedLocations", getExcludedLocations())
            .add("targetedLocations", getTargetedLocations())
            .toString();
    }

    /**
     * Gets the targetedLocations value for this GeoTargeting.
     * 
     * @return targetedLocations
     */
    public com.google.api.ads.admanager.axis.v202502.Location[] getTargetedLocations() {
        return targetedLocations;
    }


    /**
     * Sets the targetedLocations value for this GeoTargeting.
     * 
     * @param targetedLocations
     */
    public void setTargetedLocations(com.google.api.ads.admanager.axis.v202502.Location[] targetedLocations) {
        this.targetedLocations = targetedLocations;
    }

    public com.google.api.ads.admanager.axis.v202502.Location getTargetedLocations(int i) {
        return this.targetedLocations[i];
    }

    public void setTargetedLocations(int i, com.google.api.ads.admanager.axis.v202502.Location _value) {
        this.targetedLocations[i] = _value;
    }


    /**
     * Gets the excludedLocations value for this GeoTargeting.
     * 
     * @return excludedLocations
     */
    public com.google.api.ads.admanager.axis.v202502.Location[] getExcludedLocations() {
        return excludedLocations;
    }


    /**
     * Sets the excludedLocations value for this GeoTargeting.
     * 
     * @param excludedLocations
     */
    public void setExcludedLocations(com.google.api.ads.admanager.axis.v202502.Location[] excludedLocations) {
        this.excludedLocations = excludedLocations;
    }

    public com.google.api.ads.admanager.axis.v202502.Location getExcludedLocations(int i) {
        return this.excludedLocations[i];
    }

    public void setExcludedLocations(int i, com.google.api.ads.admanager.axis.v202502.Location _value) {
        this.excludedLocations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoTargeting)) return false;
        GeoTargeting other = (GeoTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedLocations==null && other.getTargetedLocations()==null) || 
             (this.targetedLocations!=null &&
              java.util.Arrays.equals(this.targetedLocations, other.getTargetedLocations()))) &&
            ((this.excludedLocations==null && other.getExcludedLocations()==null) || 
             (this.excludedLocations!=null &&
              java.util.Arrays.equals(this.excludedLocations, other.getExcludedLocations())));
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
        if (getTargetedLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedLocations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludedLocations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludedLocations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludedLocations(), i);
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
        new org.apache.axis.description.TypeDesc(GeoTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "GeoTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "targetedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "Location"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludedLocations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "excludedLocations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "Location"));
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
