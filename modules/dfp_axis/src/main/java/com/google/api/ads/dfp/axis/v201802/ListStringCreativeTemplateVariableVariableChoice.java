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
 * ListStringCreativeTemplateVariableVariableChoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Stores variable choices that users can select from
 */
public class ListStringCreativeTemplateVariableVariableChoice  implements java.io.Serializable {
    /* Label that users can select from. This is displayed to users
     * when creating a
     *                 {@link TemplateCreative}. This attribute is intended
     * to be more descriptive than
     *                 {@link #value}. This attribute is required and has
     * a maximum length of 255 characters. */
    private java.lang.String label;

    /* Value that users can select from. When creating a {@link TemplateCreative},
     * the value in
     *                 {@link StringCreativeTemplateVariableValue} should
     * match this value, if you intend to
     *                 select this value. This attribute is required and
     * has a maximum length of 255
     *                 characters. */
    private java.lang.String value;

    public ListStringCreativeTemplateVariableVariableChoice() {
    }

    public ListStringCreativeTemplateVariableVariableChoice(
           java.lang.String label,
           java.lang.String value) {
           this.label = label;
           this.value = value;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("label", getLabel())
            .add("value", getValue())
            .toString();
    }

    /**
     * Gets the label value for this ListStringCreativeTemplateVariableVariableChoice.
     * 
     * @return label   * Label that users can select from. This is displayed to users
     * when creating a
     *                 {@link TemplateCreative}. This attribute is intended
     * to be more descriptive than
     *                 {@link #value}. This attribute is required and has
     * a maximum length of 255 characters.
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this ListStringCreativeTemplateVariableVariableChoice.
     * 
     * @param label   * Label that users can select from. This is displayed to users
     * when creating a
     *                 {@link TemplateCreative}. This attribute is intended
     * to be more descriptive than
     *                 {@link #value}. This attribute is required and has
     * a maximum length of 255 characters.
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the value value for this ListStringCreativeTemplateVariableVariableChoice.
     * 
     * @return value   * Value that users can select from. When creating a {@link TemplateCreative},
     * the value in
     *                 {@link StringCreativeTemplateVariableValue} should
     * match this value, if you intend to
     *                 select this value. This attribute is required and
     * has a maximum length of 255
     *                 characters.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ListStringCreativeTemplateVariableVariableChoice.
     * 
     * @param value   * Value that users can select from. When creating a {@link TemplateCreative},
     * the value in
     *                 {@link StringCreativeTemplateVariableValue} should
     * match this value, if you intend to
     *                 select this value. This attribute is required and
     * has a maximum length of 255
     *                 characters.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListStringCreativeTemplateVariableVariableChoice)) return false;
        ListStringCreativeTemplateVariableVariableChoice other = (ListStringCreativeTemplateVariableVariableChoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
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
        int _hashCode = 1;
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListStringCreativeTemplateVariableVariableChoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ListStringCreativeTemplateVariable.VariableChoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "value"));
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
