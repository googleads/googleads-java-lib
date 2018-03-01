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
 * PriceTableRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents one row in a price extension.
 */
public class PriceTableRow  implements java.io.Serializable {
    /* Header text of this row. Required.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String header;

    /* Description text of this row. Required.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive, (trimmed).</span> */
    private java.lang.String description;

    /* A list of possible final URLs after all cross domain redirects.
     * Required. */
    private com.google.api.ads.adwords.axis.v201802.cm.UrlList finalUrls;

    /* A list of possible final mobile URLs after all cross domain
     * redirects. */
    private com.google.api.ads.adwords.axis.v201802.cm.UrlList finalMobileUrls;

    /* Price value of this row. Required. */
    private com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency price;

    /* Price unit for this row. */
    private com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceUnit priceUnit;

    public PriceTableRow() {
    }

    public PriceTableRow(
           java.lang.String header,
           java.lang.String description,
           com.google.api.ads.adwords.axis.v201802.cm.UrlList finalUrls,
           com.google.api.ads.adwords.axis.v201802.cm.UrlList finalMobileUrls,
           com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency price,
           com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceUnit priceUnit) {
           this.header = header;
           this.description = description;
           this.finalUrls = finalUrls;
           this.finalMobileUrls = finalMobileUrls;
           this.price = price;
           this.priceUnit = priceUnit;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("description", getDescription())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrls", getFinalUrls())
            .add("header", getHeader())
            .add("price", getPrice())
            .add("priceUnit", getPriceUnit())
            .toString();
    }

    /**
     * Gets the header value for this PriceTableRow.
     * 
     * @return header   * Header text of this row. Required.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getHeader() {
        return header;
    }


    /**
     * Sets the header value for this PriceTableRow.
     * 
     * @param header   * Header text of this row. Required.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }


    /**
     * Gets the description value for this PriceTableRow.
     * 
     * @return description   * Description text of this row. Required.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PriceTableRow.
     * 
     * @param description   * Description text of this row. Required.
     *                 <span class="constraint StringLength">The length of
     * this string should be between 1 and 25, inclusive, (trimmed).</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the finalUrls value for this PriceTableRow.
     * 
     * @return finalUrls   * A list of possible final URLs after all cross domain redirects.
     * Required.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UrlList getFinalUrls() {
        return finalUrls;
    }


    /**
     * Sets the finalUrls value for this PriceTableRow.
     * 
     * @param finalUrls   * A list of possible final URLs after all cross domain redirects.
     * Required.
     */
    public void setFinalUrls(com.google.api.ads.adwords.axis.v201802.cm.UrlList finalUrls) {
        this.finalUrls = finalUrls;
    }


    /**
     * Gets the finalMobileUrls value for this PriceTableRow.
     * 
     * @return finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.UrlList getFinalMobileUrls() {
        return finalMobileUrls;
    }


    /**
     * Sets the finalMobileUrls value for this PriceTableRow.
     * 
     * @param finalMobileUrls   * A list of possible final mobile URLs after all cross domain
     * redirects.
     */
    public void setFinalMobileUrls(com.google.api.ads.adwords.axis.v201802.cm.UrlList finalMobileUrls) {
        this.finalMobileUrls = finalMobileUrls;
    }


    /**
     * Gets the price value for this PriceTableRow.
     * 
     * @return price   * Price value of this row. Required.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PriceTableRow.
     * 
     * @param price   * Price value of this row. Required.
     */
    public void setPrice(com.google.api.ads.adwords.axis.v201802.cm.MoneyWithCurrency price) {
        this.price = price;
    }


    /**
     * Gets the priceUnit value for this PriceTableRow.
     * 
     * @return priceUnit   * Price unit for this row.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceUnit getPriceUnit() {
        return priceUnit;
    }


    /**
     * Sets the priceUnit value for this PriceTableRow.
     * 
     * @param priceUnit   * Price unit for this row.
     */
    public void setPriceUnit(com.google.api.ads.adwords.axis.v201802.cm.PriceExtensionPriceUnit priceUnit) {
        this.priceUnit = priceUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceTableRow)) return false;
        PriceTableRow other = (PriceTableRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.finalUrls==null && other.getFinalUrls()==null) || 
             (this.finalUrls!=null &&
              this.finalUrls.equals(other.getFinalUrls()))) &&
            ((this.finalMobileUrls==null && other.getFinalMobileUrls()==null) || 
             (this.finalMobileUrls!=null &&
              this.finalMobileUrls.equals(other.getFinalMobileUrls()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceUnit==null && other.getPriceUnit()==null) || 
             (this.priceUnit!=null &&
              this.priceUnit.equals(other.getPriceUnit())));
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
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFinalUrls() != null) {
            _hashCode += getFinalUrls().hashCode();
        }
        if (getFinalMobileUrls() != null) {
            _hashCode += getFinalMobileUrls().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceUnit() != null) {
            _hashCode += getPriceUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceTableRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceTableRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "finalUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalMobileUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "finalMobileUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "UrlList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "MoneyWithCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "priceUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PriceExtensionPriceUnit"));
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
