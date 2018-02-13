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
 * ProductBaseRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A base rate applied to a {@link Product}.
 */
public class ProductBaseRate  extends com.google.api.ads.dfp.axis.v201802.BaseRate  implements java.io.Serializable {
    /* The ID of the {@link Product} this base rate is applied to.
     * 
     *                     This attribute is required and cannot be changed
     * after creation. */
    private java.lang.Long productId;

    /* The rate value to override the rate on the product template.
     * 
     *                     This attribute is required. If {@code null}, the
     * product is not associated
     *                     with this rate card.
     *                     The currency code is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Money rate;

    public ProductBaseRate() {
    }

    public ProductBaseRate(
           java.lang.Long rateCardId,
           java.lang.Long id,
           java.lang.Long productId,
           com.google.api.ads.dfp.axis.v201802.Money rate) {
        super(
            rateCardId,
            id);
        this.productId = productId;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("id", getId())
            .add("productId", getProductId())
            .add("rate", getRate())
            .add("rateCardId", getRateCardId())
            .toString();
    }

    /**
     * Gets the productId value for this ProductBaseRate.
     * 
     * @return productId   * The ID of the {@link Product} this base rate is applied to.
     * 
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProductBaseRate.
     * 
     * @param productId   * The ID of the {@link Product} this base rate is applied to.
     * 
     *                     This attribute is required and cannot be changed
     * after creation.
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the rate value for this ProductBaseRate.
     * 
     * @return rate   * The rate value to override the rate on the product template.
     * 
     *                     This attribute is required. If {@code null}, the
     * product is not associated
     *                     with this rate card.
     *                     The currency code is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ProductBaseRate.
     * 
     * @param rate   * The rate value to override the rate on the product template.
     * 
     *                     This attribute is required. If {@code null}, the
     * product is not associated
     *                     with this rate card.
     *                     The currency code is read-only.
     */
    public void setRate(com.google.api.ads.dfp.axis.v201802.Money rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductBaseRate)) return false;
        ProductBaseRate other = (ProductBaseRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductBaseRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductBaseRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
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
