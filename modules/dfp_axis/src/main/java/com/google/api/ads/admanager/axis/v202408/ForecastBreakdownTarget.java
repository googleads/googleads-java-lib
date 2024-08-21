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
 * ForecastBreakdownTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;


/**
 * Specifies inventory targeted by a breakdown entry.
 */
public class ForecastBreakdownTarget  implements java.io.Serializable {
    /* An optional name for this breakdown target, to be populated
     * in the corresponding {@link
     *                 ForecastBreakdownEntry#name} field. */
    private java.lang.String name;

    /* If specified, the targeting for this breakdown. */
    private com.google.api.ads.admanager.axis.v202408.Targeting targeting;

    /* If specified, restrict the breakdown to only inventory matching
     * this creative. */
    private com.google.api.ads.admanager.axis.v202408.CreativePlaceholder creative;

    public ForecastBreakdownTarget() {
    }

    public ForecastBreakdownTarget(
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202408.Targeting targeting,
           com.google.api.ads.admanager.axis.v202408.CreativePlaceholder creative) {
           this.name = name;
           this.targeting = targeting;
           this.creative = creative;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("creative", getCreative())
            .add("name", getName())
            .add("targeting", getTargeting())
            .toString();
    }

    /**
     * Gets the name value for this ForecastBreakdownTarget.
     * 
     * @return name   * An optional name for this breakdown target, to be populated
     * in the corresponding {@link
     *                 ForecastBreakdownEntry#name} field.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ForecastBreakdownTarget.
     * 
     * @param name   * An optional name for this breakdown target, to be populated
     * in the corresponding {@link
     *                 ForecastBreakdownEntry#name} field.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the targeting value for this ForecastBreakdownTarget.
     * 
     * @return targeting   * If specified, the targeting for this breakdown.
     */
    public com.google.api.ads.admanager.axis.v202408.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this ForecastBreakdownTarget.
     * 
     * @param targeting   * If specified, the targeting for this breakdown.
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202408.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the creative value for this ForecastBreakdownTarget.
     * 
     * @return creative   * If specified, restrict the breakdown to only inventory matching
     * this creative.
     */
    public com.google.api.ads.admanager.axis.v202408.CreativePlaceholder getCreative() {
        return creative;
    }


    /**
     * Sets the creative value for this ForecastBreakdownTarget.
     * 
     * @param creative   * If specified, restrict the breakdown to only inventory matching
     * this creative.
     */
    public void setCreative(com.google.api.ads.admanager.axis.v202408.CreativePlaceholder creative) {
        this.creative = creative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForecastBreakdownTarget)) return false;
        ForecastBreakdownTarget other = (ForecastBreakdownTarget) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.creative==null && other.getCreative()==null) || 
             (this.creative!=null &&
              this.creative.equals(other.getCreative())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
        }
        if (getCreative() != null) {
            _hashCode += getCreative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastBreakdownTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "ForecastBreakdownTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creative");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "creative"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "CreativePlaceholder"));
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
