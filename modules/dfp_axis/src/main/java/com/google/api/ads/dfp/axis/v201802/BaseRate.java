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
 * BaseRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A base rate that applies to a product template, product or product
 * package item belonging to rate
 *             card.
 */
public abstract class BaseRate  implements java.io.Serializable {
    /* The ID of the {@link RateCard} object to which this base rate
     * belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation. */
    private java.lang.Long rateCardId;

    /* Uniquely identifies the {@code BaseRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a base rate is
     *                 created. */
    private java.lang.Long id;

    public BaseRate() {
    }

    public BaseRate(
           java.lang.Long rateCardId,
           java.lang.Long id) {
           this.rateCardId = rateCardId;
           this.id = id;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("rateCardId", getRateCardId())
            .toString();
    }

    /**
     * Gets the rateCardId value for this BaseRate.
     * 
     * @return rateCardId   * The ID of the {@link RateCard} object to which this base rate
     * belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public java.lang.Long getRateCardId() {
        return rateCardId;
    }


    /**
     * Sets the rateCardId value for this BaseRate.
     * 
     * @param rateCardId   * The ID of the {@link RateCard} object to which this base rate
     * belongs.
     *                 
     *                 This attribute is required and cannot be changed after
     * creation.
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the id value for this BaseRate.
     * 
     * @return id   * Uniquely identifies the {@code BaseRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a base rate is
     *                 created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BaseRate.
     * 
     * @param id   * Uniquely identifies the {@code BaseRate} object.
     *                 
     *                 This attribute is read-only and is assigned by Google
     * when a base rate is
     *                 created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseRate)) return false;
        BaseRate other = (BaseRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rateCardId==null && other.getRateCardId()==null) || 
             (this.rateCardId!=null &&
              this.rateCardId.equals(other.getRateCardId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getRateCardId() != null) {
            _hashCode += getRateCardId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
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
