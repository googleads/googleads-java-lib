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
 * LongRangeAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * {@link Attribute} type that contains a {@link Range} of {@link
 * LongValue}
 *             values.
 */
public class LongRangeAttribute  extends com.google.api.ads.adwords.axis.v201802.o.Attribute  implements java.io.Serializable {
    /* {@link Range} of {@link LongValue} values contained by this
     * {@link Attribute}. */
    private com.google.api.ads.adwords.axis.v201802.o.Range value;

    public LongRangeAttribute() {
    }

    public LongRangeAttribute(
           java.lang.String attributeType,
           com.google.api.ads.adwords.axis.v201802.o.Range value) {
        super(
            attributeType);
        this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("attributeType", getAttributeType())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the value value for this LongRangeAttribute.
     * 
     * @return value   * {@link Range} of {@link LongValue} values contained by this
     * {@link Attribute}.
     */
    public com.google.api.ads.adwords.axis.v201802.o.Range getValue() {
        return value;
    }


    /**
     * Sets the value value for this LongRangeAttribute.
     * 
     * @param value   * {@link Range} of {@link LongValue} values contained by this
     * {@link Attribute}.
     */
    public void setValue(com.google.api.ads.adwords.axis.v201802.o.Range value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LongRangeAttribute)) return false;
        LongRangeAttribute other = (LongRangeAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LongRangeAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "LongRangeAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "Range"));
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
