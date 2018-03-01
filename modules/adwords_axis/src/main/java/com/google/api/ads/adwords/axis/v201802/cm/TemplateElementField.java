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
 * TemplateElementField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Represents a field in a template element.
 */
public class TemplateElementField  implements java.io.Serializable {
    /* The name of this field.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.String name;

    /* The type of this field.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.TemplateElementFieldType type;

    /* Text value for text field types. Null if not text field.
     *                 The field is a text field if type is ADDRESS, ENUM,
     * TEXT, URL,
     *                 or VISIBLE_URL. */
    private java.lang.String fieldText;

    /* Media value for non-text field types. Null if a text field.
     * This
     *                 fields must be specified if fieldText is null. */
    private com.google.api.ads.adwords.axis.v201802.cm.Media fieldMedia;

    public TemplateElementField() {
    }

    public TemplateElementField(
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201802.cm.TemplateElementFieldType type,
           java.lang.String fieldText,
           com.google.api.ads.adwords.axis.v201802.cm.Media fieldMedia) {
           this.name = name;
           this.type = type;
           this.fieldText = fieldText;
           this.fieldMedia = fieldMedia;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("fieldMedia", getFieldMedia())
            .add("fieldText", getFieldText())
            .add("name", getName())
            .add("type", getType())
            .toString();
    }

    /**
     * Gets the name value for this TemplateElementField.
     * 
     * @return name   * The name of this field.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TemplateElementField.
     * 
     * @param name   * The name of this field.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this TemplateElementField.
     * 
     * @return type   * The type of this field.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.TemplateElementFieldType getType() {
        return type;
    }


    /**
     * Sets the type value for this TemplateElementField.
     * 
     * @param type   * The type of this field.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setType(com.google.api.ads.adwords.axis.v201802.cm.TemplateElementFieldType type) {
        this.type = type;
    }


    /**
     * Gets the fieldText value for this TemplateElementField.
     * 
     * @return fieldText   * Text value for text field types. Null if not text field.
     *                 The field is a text field if type is ADDRESS, ENUM,
     * TEXT, URL,
     *                 or VISIBLE_URL.
     */
    public java.lang.String getFieldText() {
        return fieldText;
    }


    /**
     * Sets the fieldText value for this TemplateElementField.
     * 
     * @param fieldText   * Text value for text field types. Null if not text field.
     *                 The field is a text field if type is ADDRESS, ENUM,
     * TEXT, URL,
     *                 or VISIBLE_URL.
     */
    public void setFieldText(java.lang.String fieldText) {
        this.fieldText = fieldText;
    }


    /**
     * Gets the fieldMedia value for this TemplateElementField.
     * 
     * @return fieldMedia   * Media value for non-text field types. Null if a text field.
     * This
     *                 fields must be specified if fieldText is null.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Media getFieldMedia() {
        return fieldMedia;
    }


    /**
     * Sets the fieldMedia value for this TemplateElementField.
     * 
     * @param fieldMedia   * Media value for non-text field types. Null if a text field.
     * This
     *                 fields must be specified if fieldText is null.
     */
    public void setFieldMedia(com.google.api.ads.adwords.axis.v201802.cm.Media fieldMedia) {
        this.fieldMedia = fieldMedia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TemplateElementField)) return false;
        TemplateElementField other = (TemplateElementField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.fieldText==null && other.getFieldText()==null) || 
             (this.fieldText!=null &&
              this.fieldText.equals(other.getFieldText()))) &&
            ((this.fieldMedia==null && other.getFieldMedia()==null) || 
             (this.fieldMedia!=null &&
              this.fieldMedia.equals(other.getFieldMedia())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFieldText() != null) {
            _hashCode += getFieldText().hashCode();
        }
        if (getFieldMedia() != null) {
            _hashCode += getFieldMedia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TemplateElementField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElementField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "TemplateElementField.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fieldText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMedia");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "fieldMedia"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Media"));
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
