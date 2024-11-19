// Copyright 2024 Google LLC
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
 * InventorySizeTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;

public class InventorySizeTargeting  implements java.io.Serializable {
    private java.lang.Boolean isTargeted;

    private com.google.api.ads.admanager.axis.v202411.TargetedSize[] targetedSizes;

    public InventorySizeTargeting() {
    }

    public InventorySizeTargeting(
           java.lang.Boolean isTargeted,
           com.google.api.ads.admanager.axis.v202411.TargetedSize[] targetedSizes) {
           this.isTargeted = isTargeted;
           this.targetedSizes = targetedSizes;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("isTargeted", getIsTargeted())
            .add("targetedSizes", getTargetedSizes())
            .toString();
    }

    /**
     * Gets the isTargeted value for this InventorySizeTargeting.
     * 
     * @return isTargeted
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this InventorySizeTargeting.
     * 
     * @param isTargeted
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }


    /**
     * Gets the targetedSizes value for this InventorySizeTargeting.
     * 
     * @return targetedSizes
     */
    public com.google.api.ads.admanager.axis.v202411.TargetedSize[] getTargetedSizes() {
        return targetedSizes;
    }


    /**
     * Sets the targetedSizes value for this InventorySizeTargeting.
     * 
     * @param targetedSizes
     */
    public void setTargetedSizes(com.google.api.ads.admanager.axis.v202411.TargetedSize[] targetedSizes) {
        this.targetedSizes = targetedSizes;
    }

    public com.google.api.ads.admanager.axis.v202411.TargetedSize getTargetedSizes(int i) {
        return this.targetedSizes[i];
    }

    public void setTargetedSizes(int i, com.google.api.ads.admanager.axis.v202411.TargetedSize _value) {
        this.targetedSizes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventorySizeTargeting)) return false;
        InventorySizeTargeting other = (InventorySizeTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isTargeted==null && other.getIsTargeted()==null) || 
             (this.isTargeted!=null &&
              this.isTargeted.equals(other.getIsTargeted()))) &&
            ((this.targetedSizes==null && other.getTargetedSizes()==null) || 
             (this.targetedSizes!=null &&
              java.util.Arrays.equals(this.targetedSizes, other.getTargetedSizes())));
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
        if (getIsTargeted() != null) {
            _hashCode += getIsTargeted().hashCode();
        }
        if (getTargetedSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedSizes(), i);
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
        new org.apache.axis.description.TypeDesc(InventorySizeTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "InventorySizeTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "isTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "targetedSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "TargetedSize"));
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
