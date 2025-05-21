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
 * BandwidthGroupTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202505;

public class BandwidthGroupTargeting  implements java.io.Serializable {
    private java.lang.Boolean isTargeted;

    private com.google.api.ads.admanager.axis.v202505.Technology[] bandwidthGroups;

    public BandwidthGroupTargeting() {
    }

    public BandwidthGroupTargeting(
           java.lang.Boolean isTargeted,
           com.google.api.ads.admanager.axis.v202505.Technology[] bandwidthGroups) {
           this.isTargeted = isTargeted;
           this.bandwidthGroups = bandwidthGroups;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("bandwidthGroups", getBandwidthGroups())
            .add("isTargeted", getIsTargeted())
            .toString();
    }

    /**
     * Gets the isTargeted value for this BandwidthGroupTargeting.
     * 
     * @return isTargeted
     */
    public java.lang.Boolean getIsTargeted() {
        return isTargeted;
    }


    /**
     * Sets the isTargeted value for this BandwidthGroupTargeting.
     * 
     * @param isTargeted
     */
    public void setIsTargeted(java.lang.Boolean isTargeted) {
        this.isTargeted = isTargeted;
    }


    /**
     * Gets the bandwidthGroups value for this BandwidthGroupTargeting.
     * 
     * @return bandwidthGroups
     */
    public com.google.api.ads.admanager.axis.v202505.Technology[] getBandwidthGroups() {
        return bandwidthGroups;
    }


    /**
     * Sets the bandwidthGroups value for this BandwidthGroupTargeting.
     * 
     * @param bandwidthGroups
     */
    public void setBandwidthGroups(com.google.api.ads.admanager.axis.v202505.Technology[] bandwidthGroups) {
        this.bandwidthGroups = bandwidthGroups;
    }

    public com.google.api.ads.admanager.axis.v202505.Technology getBandwidthGroups(int i) {
        return this.bandwidthGroups[i];
    }

    public void setBandwidthGroups(int i, com.google.api.ads.admanager.axis.v202505.Technology _value) {
        this.bandwidthGroups[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BandwidthGroupTargeting)) return false;
        BandwidthGroupTargeting other = (BandwidthGroupTargeting) obj;
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
            ((this.bandwidthGroups==null && other.getBandwidthGroups()==null) || 
             (this.bandwidthGroups!=null &&
              java.util.Arrays.equals(this.bandwidthGroups, other.getBandwidthGroups())));
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
        if (getBandwidthGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBandwidthGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBandwidthGroups(), i);
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
        new org.apache.axis.description.TypeDesc(BandwidthGroupTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "BandwidthGroupTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTargeted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "isTargeted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "bandwidthGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202505", "Technology"));
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
