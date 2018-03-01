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
 * ProductBiddingCategoryData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * The taxonomy of ProductBiddingCategory dimension values.
 *             
 *             <p>Clients use this to convert between human-readable
 * category names / display strings and
 *             ProductBiddingCategory instances.
 */
public class ProductBiddingCategoryData  extends com.google.api.ads.adwords.axis.v201802.cm.ConstantData  implements java.io.Serializable {
    /* The dimension value that corresponds to this category. */
    private com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory dimensionValue;

    /* The dimension value that corresponds to parent category. */
    private com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory parentDimensionValue;

    /* The country of the taxonomy. It applies to all categories from
     * the taxonomy.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Country".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String country;

    /* The status of the taxonomy. It applies to all categories from
     * the taxonomy.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BiddingCategoryStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ShoppingBiddingDimensionStatus status;

    /* A map of displayValues by their language code. The language
     * code is a 2-letter string
     *                     conforming with ISO 639-1 standard. */
    private com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] displayValue;

    public ProductBiddingCategoryData() {
    }

    public ProductBiddingCategoryData(
           java.lang.String constantDataType,
           com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory dimensionValue,
           com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory parentDimensionValue,
           java.lang.String country,
           com.google.api.ads.adwords.axis.v201802.cm.ShoppingBiddingDimensionStatus status,
           com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] displayValue) {
        super(
            constantDataType);
        this.dimensionValue = dimensionValue;
        this.parentDimensionValue = parentDimensionValue;
        this.country = country;
        this.status = status;
        this.displayValue = displayValue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("constantDataType", getConstantDataType())
            .add("country", getCountry())
            .add("dimensionValue", getDimensionValue())
            .add("displayValue", getDisplayValue())
            .add("parentDimensionValue", getParentDimensionValue())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the dimensionValue value for this ProductBiddingCategoryData.
     * 
     * @return dimensionValue   * The dimension value that corresponds to this category.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory getDimensionValue() {
        return dimensionValue;
    }


    /**
     * Sets the dimensionValue value for this ProductBiddingCategoryData.
     * 
     * @param dimensionValue   * The dimension value that corresponds to this category.
     */
    public void setDimensionValue(com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory dimensionValue) {
        this.dimensionValue = dimensionValue;
    }


    /**
     * Gets the parentDimensionValue value for this ProductBiddingCategoryData.
     * 
     * @return parentDimensionValue   * The dimension value that corresponds to parent category.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory getParentDimensionValue() {
        return parentDimensionValue;
    }


    /**
     * Sets the parentDimensionValue value for this ProductBiddingCategoryData.
     * 
     * @param parentDimensionValue   * The dimension value that corresponds to parent category.
     */
    public void setParentDimensionValue(com.google.api.ads.adwords.axis.v201802.cm.ProductBiddingCategory parentDimensionValue) {
        this.parentDimensionValue = parentDimensionValue;
    }


    /**
     * Gets the country value for this ProductBiddingCategoryData.
     * 
     * @return country   * The country of the taxonomy. It applies to all categories from
     * the taxonomy.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Country".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ProductBiddingCategoryData.
     * 
     * @param country   * The country of the taxonomy. It applies to all categories from
     * the taxonomy.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "Country".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the status value for this ProductBiddingCategoryData.
     * 
     * @return status   * The status of the taxonomy. It applies to all categories from
     * the taxonomy.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BiddingCategoryStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ShoppingBiddingDimensionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProductBiddingCategoryData.
     * 
     * @param status   * The status of the taxonomy. It applies to all categories from
     * the taxonomy.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "BiddingCategoryStatus".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setStatus(com.google.api.ads.adwords.axis.v201802.cm.ShoppingBiddingDimensionStatus status) {
        this.status = status;
    }


    /**
     * Gets the displayValue value for this ProductBiddingCategoryData.
     * 
     * @return displayValue   * A map of displayValues by their language code. The language
     * code is a 2-letter string
     *                     conforming with ISO 639-1 standard.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] getDisplayValue() {
        return displayValue;
    }


    /**
     * Sets the displayValue value for this ProductBiddingCategoryData.
     * 
     * @param displayValue   * A map of displayValues by their language code. The language
     * code is a 2-letter string
     *                     conforming with ISO 639-1 standard.
     */
    public void setDisplayValue(com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry[] displayValue) {
        this.displayValue = displayValue;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry getDisplayValue(int i) {
        return this.displayValue[i];
    }

    public void setDisplayValue(int i, com.google.api.ads.adwords.axis.v201802.cm.String_StringMapEntry _value) {
        this.displayValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductBiddingCategoryData)) return false;
        ProductBiddingCategoryData other = (ProductBiddingCategoryData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dimensionValue==null && other.getDimensionValue()==null) || 
             (this.dimensionValue!=null &&
              this.dimensionValue.equals(other.getDimensionValue()))) &&
            ((this.parentDimensionValue==null && other.getParentDimensionValue()==null) || 
             (this.parentDimensionValue!=null &&
              this.parentDimensionValue.equals(other.getParentDimensionValue()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.displayValue==null && other.getDisplayValue()==null) || 
             (this.displayValue!=null &&
              java.util.Arrays.equals(this.displayValue, other.getDisplayValue())));
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
        if (getDimensionValue() != null) {
            _hashCode += getDimensionValue().hashCode();
        }
        if (getParentDimensionValue() != null) {
            _hashCode += getParentDimensionValue().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDisplayValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayValue(), i);
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
        new org.apache.axis.description.TypeDesc(ProductBiddingCategoryData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductBiddingCategoryData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "dimensionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductBiddingCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentDimensionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "parentDimensionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductBiddingCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ShoppingBiddingDimensionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "displayValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "String_StringMapEntry"));
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
