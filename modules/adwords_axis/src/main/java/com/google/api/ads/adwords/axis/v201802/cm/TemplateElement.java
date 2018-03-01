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
 * TemplateElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents an element in a template. Each template element is composed
 * of a list of fields (actual value data).
 */
public class TemplateElement  implements java.io.Serializable {
    /* Unique name for this element.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String uniqueName;

    /* List of fields to use for this template element.
     *                 These must be the same for all template ads in the
     * same template ad union.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField[] fields;

    public TemplateElement() {
    }

    public TemplateElement(
           java.lang.String uniqueName,
           com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField[] fields) {
           this.uniqueName = uniqueName;
           this.fields = fields;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("fields", getFields())
            .add("uniqueName", getUniqueName())
            .toString();
    }

    /**
     * Gets the uniqueName value for this TemplateElement.
     * 
     * @return uniqueName   * Unique name for this element.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getUniqueName() {
        return uniqueName;
    }


    /**
     * Sets the uniqueName value for this TemplateElement.
     * 
     * @param uniqueName   * Unique name for this element.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setUniqueName(java.lang.String uniqueName) {
        this.uniqueName = uniqueName;
    }


    /**
     * Gets the fields value for this TemplateElement.
     * 
     * @return fields   * List of fields to use for this template element.
     *                 These must be the same for all template ads in the
     * same template ad union.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this TemplateElement.
     * 
     * @param fields   * List of fields to use for this template element.
     *                 These must be the same for all template ads in the
     * same template ad union.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setFields(com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField[] fields) {
        this.fields = fields;
    }

    public com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField getFields(int i) {
        return this.fields[i];
    }

    public void setFields(int i, com.google.api.ads.adwords.axis.v201802.cm.TemplateElementField _value) {
        this.fields[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateElement)) return false;
        TemplateElement other = (TemplateElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueName==null && other.getUniqueName()==null) || 
             (this.uniqueName!=null &&
              this.uniqueName.equals(other.getUniqueName()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields())));
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
        if (getUniqueName() != null) {
            _hashCode += getUniqueName().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
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
        new org.apache.axis.description.TypeDesc(TemplateElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "uniqueName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElementField"));
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
