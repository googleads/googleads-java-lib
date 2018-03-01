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
 * ProductCustomAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A custom attribute value. As a product can have multiple custom
 * attributes, the user must specify
 *             a dimension type that indicates the index of the attribute
 * by which to subdivide. All cases of
 *             the same subdivision must have the same dimension type
 * (attribute index).
 */
public class ProductCustomAttribute  extends com.google.api.ads.adwords.axis.v201802.cm.ProductDimension  implements java.io.Serializable {
    /* Dimension type of the custom attribute. Indicates the index
     * of the custom attribute.
     *                     <span class="constraint OneOf">The value must
     * be one of {CUSTOM_ATTRIBUTE_0, CUSTOM_ATTRIBUTE_1, CUSTOM_ATTRIBUTE_2,
     * CUSTOM_ATTRIBUTE_3, CUSTOM_ATTRIBUTE_4}.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType type;

    /* <span class="constraint StringLength">This string must not
     * be empty, (trimmed).</span> */
    private java.lang.String value;

    public ProductCustomAttribute() {
    }

    public ProductCustomAttribute(
           java.lang.String productDimensionType,
           com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType type,
           java.lang.String value) {
        super(
            productDimensionType);
        this.type = type;
        this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("productDimensionType", getProductDimensionType())
            .add("type", getType())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the type value for this ProductCustomAttribute.
     * 
     * @return type   * Dimension type of the custom attribute. Indicates the index
     * of the custom attribute.
     *                     <span class="constraint OneOf">The value must
     * be one of {CUSTOM_ATTRIBUTE_0, CUSTOM_ATTRIBUTE_1, CUSTOM_ATTRIBUTE_2,
     * CUSTOM_ATTRIBUTE_3, CUSTOM_ATTRIBUTE_4}.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType getType() {
        return type;
    }


    /**
     * Sets the type value for this ProductCustomAttribute.
     * 
     * @param type   * Dimension type of the custom attribute. Indicates the index
     * of the custom attribute.
     *                     <span class="constraint OneOf">The value must
     * be one of {CUSTOM_ATTRIBUTE_0, CUSTOM_ATTRIBUTE_1, CUSTOM_ATTRIBUTE_2,
     * CUSTOM_ATTRIBUTE_3, CUSTOM_ATTRIBUTE_4}.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.ProductDimensionType type) {
        this.type = type;
    }


    /**
     * Gets the value value for this ProductCustomAttribute.
     * 
     * @return value   * <span class="constraint StringLength">This string must not
     * be empty, (trimmed).</span>
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ProductCustomAttribute.
     * 
     * @param value   * <span class="constraint StringLength">This string must not
     * be empty, (trimmed).</span>
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCustomAttribute)) return false;
        ProductCustomAttribute other = (ProductCustomAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCustomAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductCustomAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductDimensionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "value"));
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
