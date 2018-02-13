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
 * ProductTemplateMarketplaceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Marketplace information for a programmatic {@link ProductTemplate}.
 */
public class ProductTemplateMarketplaceInfo  implements java.io.Serializable {
    /* The {@link AdExchangeEnvironment} of the AdX Web Property this
     * product will serve to.
     *                 
     *                 <p>This field is required. */
    private com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment adExchangeEnvironment;

    /* Additional terms shown to the buyer in Marketplace.
     *                 
     *                 <p>This field is optional. */
    private java.lang.String additionalTerms;

    public ProductTemplateMarketplaceInfo() {
    }

    public ProductTemplateMarketplaceInfo(
           com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment adExchangeEnvironment,
           java.lang.String additionalTerms) {
           this.adExchangeEnvironment = adExchangeEnvironment;
           this.additionalTerms = additionalTerms;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adExchangeEnvironment", getAdExchangeEnvironment())
            .add("additionalTerms", getAdditionalTerms())
            .toString();
    }

    /**
     * Gets the adExchangeEnvironment value for this ProductTemplateMarketplaceInfo.
     * 
     * @return adExchangeEnvironment   * The {@link AdExchangeEnvironment} of the AdX Web Property this
     * product will serve to.
     *                 
     *                 <p>This field is required.
     */
    public com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment getAdExchangeEnvironment() {
        return adExchangeEnvironment;
    }


    /**
     * Sets the adExchangeEnvironment value for this ProductTemplateMarketplaceInfo.
     * 
     * @param adExchangeEnvironment   * The {@link AdExchangeEnvironment} of the AdX Web Property this
     * product will serve to.
     *                 
     *                 <p>This field is required.
     */
    public void setAdExchangeEnvironment(com.google.api.ads.dfp.axis.v201802.AdExchangeEnvironment adExchangeEnvironment) {
        this.adExchangeEnvironment = adExchangeEnvironment;
    }


    /**
     * Gets the additionalTerms value for this ProductTemplateMarketplaceInfo.
     * 
     * @return additionalTerms   * Additional terms shown to the buyer in Marketplace.
     *                 
     *                 <p>This field is optional.
     */
    public java.lang.String getAdditionalTerms() {
        return additionalTerms;
    }


    /**
     * Sets the additionalTerms value for this ProductTemplateMarketplaceInfo.
     * 
     * @param additionalTerms   * Additional terms shown to the buyer in Marketplace.
     *                 
     *                 <p>This field is optional.
     */
    public void setAdditionalTerms(java.lang.String additionalTerms) {
        this.additionalTerms = additionalTerms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTemplateMarketplaceInfo)) return false;
        ProductTemplateMarketplaceInfo other = (ProductTemplateMarketplaceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adExchangeEnvironment==null && other.getAdExchangeEnvironment()==null) || 
             (this.adExchangeEnvironment!=null &&
              this.adExchangeEnvironment.equals(other.getAdExchangeEnvironment()))) &&
            ((this.additionalTerms==null && other.getAdditionalTerms()==null) || 
             (this.additionalTerms!=null &&
              this.additionalTerms.equals(other.getAdditionalTerms())));
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
        if (getAdExchangeEnvironment() != null) {
            _hashCode += getAdExchangeEnvironment().hashCode();
        }
        if (getAdditionalTerms() != null) {
            _hashCode += getAdditionalTerms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductTemplateMarketplaceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProductTemplateMarketplaceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExchangeEnvironment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adExchangeEnvironment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AdExchangeEnvironment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "additionalTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
