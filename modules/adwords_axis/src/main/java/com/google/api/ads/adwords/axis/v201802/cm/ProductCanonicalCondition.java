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
 * ProductCanonicalCondition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A canonical condition. Only supported by campaigns of
 *             {@link AdvertisingChannelType#SHOPPING}.
 */
public class ProductCanonicalCondition  extends com.google.api.ads.adwords.axis.v201802.cm.ProductDimension  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalConditionCondition condition;

    public ProductCanonicalCondition() {
    }

    public ProductCanonicalCondition(
           java.lang.String productDimensionType,
           com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalConditionCondition condition) {
        super(
            productDimensionType);
        this.condition = condition;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("condition", getCondition())
            .add("productDimensionType", getProductDimensionType())
            .toString();
    }

    /**
     * Gets the condition value for this ProductCanonicalCondition.
     * 
     * @return condition
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalConditionCondition getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this ProductCanonicalCondition.
     * 
     * @param condition
     */
    public void setCondition(com.google.api.ads.adwords.axis.v201802.cm.ProductCanonicalConditionCondition condition) {
        this.condition = condition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCanonicalCondition)) return false;
        ProductCanonicalCondition other = (ProductCanonicalCondition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition())));
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
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCanonicalCondition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductCanonicalCondition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ProductCanonicalCondition.Condition"));
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
