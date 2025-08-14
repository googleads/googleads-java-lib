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
 * AdUnitTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;

public class AdUnitTargeting  implements java.io.Serializable {
    private java.lang.String adUnitId;

    private java.lang.Boolean includeDescendants;

    public AdUnitTargeting() {
    }

    public AdUnitTargeting(
           java.lang.String adUnitId,
           java.lang.Boolean includeDescendants) {
           this.adUnitId = adUnitId;
           this.includeDescendants = includeDescendants;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adUnitId", getAdUnitId())
            .add("includeDescendants", getIncludeDescendants())
            .toString();
    }

    /**
     * Gets the adUnitId value for this AdUnitTargeting.
     * 
     * @return adUnitId
     */
    public java.lang.String getAdUnitId() {
        return adUnitId;
    }


    /**
     * Sets the adUnitId value for this AdUnitTargeting.
     * 
     * @param adUnitId
     */
    public void setAdUnitId(java.lang.String adUnitId) {
        this.adUnitId = adUnitId;
    }


    /**
     * Gets the includeDescendants value for this AdUnitTargeting.
     * 
     * @return includeDescendants
     */
    public java.lang.Boolean getIncludeDescendants() {
        return includeDescendants;
    }


    /**
     * Sets the includeDescendants value for this AdUnitTargeting.
     * 
     * @param includeDescendants
     */
    public void setIncludeDescendants(java.lang.Boolean includeDescendants) {
        this.includeDescendants = includeDescendants;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdUnitTargeting)) return false;
        AdUnitTargeting other = (AdUnitTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adUnitId==null && other.getAdUnitId()==null) || 
             (this.adUnitId!=null &&
              this.adUnitId.equals(other.getAdUnitId()))) &&
            ((this.includeDescendants==null && other.getIncludeDescendants()==null) || 
             (this.includeDescendants!=null &&
              this.includeDescendants.equals(other.getIncludeDescendants())));
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
        if (getAdUnitId() != null) {
            _hashCode += getAdUnitId().hashCode();
        }
        if (getIncludeDescendants() != null) {
            _hashCode += getIncludeDescendants().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdUnitTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "AdUnitTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "adUnitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeDescendants");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "includeDescendants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
