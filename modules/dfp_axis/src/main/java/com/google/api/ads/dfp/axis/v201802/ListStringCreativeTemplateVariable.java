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
 * ListStringCreativeTemplateVariable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a list variable defined in a creative template. This
 * is similar to
 *             {@link StringCreativeTemplateVariable}, except that there
 * are possible choices to
 *             choose from.
 *             
 *             <p>Use {@link StringCreativeTemplateVariableValue} to
 * specify the value
 *             for this variable when creating a {@link TemplateCreative}
 * from a {@link CreativeTemplate}.
 */
public class ListStringCreativeTemplateVariable  extends com.google.api.ads.dfp.axis.v201802.StringCreativeTemplateVariable  implements java.io.Serializable {
    /* The values within the list users need to select from. */
    private com.google.api.ads.dfp.axis.v201802.ListStringCreativeTemplateVariableVariableChoice[] choices;

    /* {@code true} if a user can specifiy an 'other' value.
     *                     For example, if a variable called backgroundColor
     * is defined as a list
     *                     with values: red, green, blue, this boolean can
     * be set to allow a user
     *                     to enter a value not on the list such as purple. */
    private java.lang.Boolean allowOtherChoice;

    public ListStringCreativeTemplateVariable() {
    }

    public ListStringCreativeTemplateVariable(
           java.lang.String label,
           java.lang.String uniqueName,
           java.lang.String description,
           java.lang.Boolean isRequired,
           java.lang.String defaultValue,
           com.google.api.ads.dfp.axis.v201802.ListStringCreativeTemplateVariableVariableChoice[] choices,
           java.lang.Boolean allowOtherChoice) {
        super(
            label,
            uniqueName,
            description,
            isRequired,
            defaultValue);
        this.choices = choices;
        this.allowOtherChoice = allowOtherChoice;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("allowOtherChoice", getAllowOtherChoice())
            .add("choices", getChoices())
            .add("defaultValue", getDefaultValue())
            .add("description", getDescription())
            .add("isRequired", getIsRequired())
            .add("label", getLabel())
            .add("uniqueName", getUniqueName())
            .toString();
    }

    /**
     * Gets the choices value for this ListStringCreativeTemplateVariable.
     * 
     * @return choices   * The values within the list users need to select from.
     */
    public com.google.api.ads.dfp.axis.v201802.ListStringCreativeTemplateVariableVariableChoice[] getChoices() {
        return choices;
    }


    /**
     * Sets the choices value for this ListStringCreativeTemplateVariable.
     * 
     * @param choices   * The values within the list users need to select from.
     */
    public void setChoices(com.google.api.ads.dfp.axis.v201802.ListStringCreativeTemplateVariableVariableChoice[] choices) {
        this.choices = choices;
    }

    public com.google.api.ads.dfp.axis.v201802.ListStringCreativeTemplateVariableVariableChoice getChoices(int i) {
        return this.choices[i];
    }

    public void setChoices(int i, com.google.api.ads.dfp.axis.v201802.ListStringCreativeTemplateVariableVariableChoice _value) {
        this.choices[i] = _value;
    }


    /**
     * Gets the allowOtherChoice value for this ListStringCreativeTemplateVariable.
     * 
     * @return allowOtherChoice   * {@code true} if a user can specifiy an 'other' value.
     *                     For example, if a variable called backgroundColor
     * is defined as a list
     *                     with values: red, green, blue, this boolean can
     * be set to allow a user
     *                     to enter a value not on the list such as purple.
     */
    public java.lang.Boolean getAllowOtherChoice() {
        return allowOtherChoice;
    }


    /**
     * Sets the allowOtherChoice value for this ListStringCreativeTemplateVariable.
     * 
     * @param allowOtherChoice   * {@code true} if a user can specifiy an 'other' value.
     *                     For example, if a variable called backgroundColor
     * is defined as a list
     *                     with values: red, green, blue, this boolean can
     * be set to allow a user
     *                     to enter a value not on the list such as purple.
     */
    public void setAllowOtherChoice(java.lang.Boolean allowOtherChoice) {
        this.allowOtherChoice = allowOtherChoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListStringCreativeTemplateVariable)) return false;
        ListStringCreativeTemplateVariable other = (ListStringCreativeTemplateVariable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.choices==null && other.getChoices()==null) || 
             (this.choices!=null &&
              java.util.Arrays.equals(this.choices, other.getChoices()))) &&
            ((this.allowOtherChoice==null && other.getAllowOtherChoice()==null) || 
             (this.allowOtherChoice!=null &&
              this.allowOtherChoice.equals(other.getAllowOtherChoice())));
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
        if (getChoices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChoices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChoices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowOtherChoice() != null) {
            _hashCode += getAllowOtherChoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListStringCreativeTemplateVariable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ListStringCreativeTemplateVariable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("choices");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "choices"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ListStringCreativeTemplateVariable.VariableChoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOtherChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowOtherChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
