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
 * DateRuleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.rm;


/**
 * An atomic rule fragment composing of date operation.
 */
public class DateRuleItem  implements java.io.Serializable {
    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.DateKey key;

    /* <span class="constraint Required">This field is required and
     * should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.rm.DateRuleItemDateOperator op;

    /* The right hand side of date rule item. The date's format should
     * be YYYYMMDD. */
    private java.lang.String value;

    /* The relative date value of the right hand side. The {@code
     * value} field will
     *                 override this field when both are present. */
    private com.google.api.ads.adwords.axis.v201802.rm.RelativeDate relativeValue;

    public DateRuleItem() {
    }

    public DateRuleItem(
           com.google.api.ads.adwords.axis.v201802.rm.DateKey key,
           com.google.api.ads.adwords.axis.v201802.rm.DateRuleItemDateOperator op,
           java.lang.String value,
           com.google.api.ads.adwords.axis.v201802.rm.RelativeDate relativeValue) {
           this.key = key;
           this.op = op;
           this.value = value;
           this.relativeValue = relativeValue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("key", getKey())
            .add("op", getOp())
            .add("relativeValue", getRelativeValue())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the key value for this DateRuleItem.
     * 
     * @return key   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.DateKey getKey() {
        return key;
    }


    /**
     * Sets the key value for this DateRuleItem.
     * 
     * @param key   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setKey(com.google.api.ads.adwords.axis.v201802.rm.DateKey key) {
        this.key = key;
    }


    /**
     * Gets the op value for this DateRuleItem.
     * 
     * @return op   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.rm.DateRuleItemDateOperator getOp() {
        return op;
    }


    /**
     * Sets the op value for this DateRuleItem.
     * 
     * @param op   * <span class="constraint Required">This field is required and
     * should not be {@code null}.</span>
     */
    public void setOp(com.google.api.ads.adwords.axis.v201802.rm.DateRuleItemDateOperator op) {
        this.op = op;
    }


    /**
     * Gets the value value for this DateRuleItem.
     * 
     * @return value   * The right hand side of date rule item. The date's format should
     * be YYYYMMDD.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this DateRuleItem.
     * 
     * @param value   * The right hand side of date rule item. The date's format should
     * be YYYYMMDD.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the relativeValue value for this DateRuleItem.
     * 
     * @return relativeValue   * The relative date value of the right hand side. The {@code
     * value} field will
     *                 override this field when both are present.
     */
    public com.google.api.ads.adwords.axis.v201802.rm.RelativeDate getRelativeValue() {
        return relativeValue;
    }


    /**
     * Sets the relativeValue value for this DateRuleItem.
     * 
     * @param relativeValue   * The relative date value of the right hand side. The {@code
     * value} field will
     *                 override this field when both are present.
     */
    public void setRelativeValue(com.google.api.ads.adwords.axis.v201802.rm.RelativeDate relativeValue) {
        this.relativeValue = relativeValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateRuleItem)) return false;
        DateRuleItem other = (DateRuleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.op==null && other.getOp()==null) || 
             (this.op!=null &&
              this.op.equals(other.getOp()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.relativeValue==null && other.getRelativeValue()==null) || 
             (this.relativeValue!=null &&
              this.relativeValue.equals(other.getRelativeValue())));
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getOp() != null) {
            _hashCode += getOp().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getRelativeValue() != null) {
            _hashCode += getRelativeValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateRuleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "DateRuleItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "DateKey"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("op");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "op"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "DateRuleItem.DateOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "relativeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201802", "RelativeDate"));
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
