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
 * ConstantOperand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A constant operand in a matching function.
 */
public class ConstantOperand  extends com.google.api.ads.adwords.axis.v201802.cm.FunctionArgumentOperand  implements java.io.Serializable {
    /* Type of constant in this operand.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandConstantType type;

    /* Units of constant in this operand. */
    private com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandUnit unit;

    /* Long value of the operand if it is a long type. */
    private java.lang.Long longValue;

    /* Boolean value of the operand if it is a boolean type. */
    private java.lang.Boolean booleanValue;

    /* Double value of the operand if it is a double type. */
    private java.lang.Double doubleValue;

    /* String value of the operand if it is a string type. */
    private java.lang.String stringValue;

    public ConstantOperand() {
    }

    public ConstantOperand(
           java.lang.String functionArgumentOperandType,
           com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandConstantType type,
           com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandUnit unit,
           java.lang.Long longValue,
           java.lang.Boolean booleanValue,
           java.lang.Double doubleValue,
           java.lang.String stringValue) {
        super(
            functionArgumentOperandType);
        this.type = type;
        this.unit = unit;
        this.longValue = longValue;
        this.booleanValue = booleanValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("booleanValue", getBooleanValue())
            .add("doubleValue", getDoubleValue())
            .add("functionArgumentOperandType", getFunctionArgumentOperandType())
            .add("longValue", getLongValue())
            .add("stringValue", getStringValue())
            .add("type", getType())
            .add("unit", getUnit())
            .toString();
    }

    /**
     * Gets the type value for this ConstantOperand.
     * 
     * @return type   * Type of constant in this operand.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandConstantType getType() {
        return type;
    }


    /**
     * Sets the type value for this ConstantOperand.
     * 
     * @param type   * Type of constant in this operand.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null}.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandConstantType type) {
        this.type = type;
    }


    /**
     * Gets the unit value for this ConstantOperand.
     * 
     * @return unit   * Units of constant in this operand.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandUnit getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ConstantOperand.
     * 
     * @param unit   * Units of constant in this operand.
     */
    public void setUnit(com.google.api.ads.adwords.axis.v201802.cm.ConstantOperandUnit unit) {
        this.unit = unit;
    }


    /**
     * Gets the longValue value for this ConstantOperand.
     * 
     * @return longValue   * Long value of the operand if it is a long type.
     */
    public java.lang.Long getLongValue() {
        return longValue;
    }


    /**
     * Sets the longValue value for this ConstantOperand.
     * 
     * @param longValue   * Long value of the operand if it is a long type.
     */
    public void setLongValue(java.lang.Long longValue) {
        this.longValue = longValue;
    }


    /**
     * Gets the booleanValue value for this ConstantOperand.
     * 
     * @return booleanValue   * Boolean value of the operand if it is a boolean type.
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this ConstantOperand.
     * 
     * @param booleanValue   * Boolean value of the operand if it is a boolean type.
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    /**
     * Gets the doubleValue value for this ConstantOperand.
     * 
     * @return doubleValue   * Double value of the operand if it is a double type.
     */
    public java.lang.Double getDoubleValue() {
        return doubleValue;
    }


    /**
     * Sets the doubleValue value for this ConstantOperand.
     * 
     * @param doubleValue   * Double value of the operand if it is a double type.
     */
    public void setDoubleValue(java.lang.Double doubleValue) {
        this.doubleValue = doubleValue;
    }


    /**
     * Gets the stringValue value for this ConstantOperand.
     * 
     * @return stringValue   * String value of the operand if it is a string type.
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this ConstantOperand.
     * 
     * @param stringValue   * String value of the operand if it is a string type.
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConstantOperand)) return false;
        ConstantOperand other = (ConstantOperand) obj;
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
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.longValue==null && other.getLongValue()==null) || 
             (this.longValue!=null &&
              this.longValue.equals(other.getLongValue()))) &&
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue()))) &&
            ((this.doubleValue==null && other.getDoubleValue()==null) || 
             (this.doubleValue!=null &&
              this.doubleValue.equals(other.getDoubleValue()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue())));
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
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getLongValue() != null) {
            _hashCode += getLongValue().hashCode();
        }
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        if (getDoubleValue() != null) {
            _hashCode += getDoubleValue().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConstantOperand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand.ConstantType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ConstantOperand.Unit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "longValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "booleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doubleValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "doubleValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "stringValue"));
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
