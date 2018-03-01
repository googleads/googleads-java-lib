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
 * FieldPathElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * A segment of a field path. Each dot in a field path defines a new
 * segment.
 */
public class FieldPathElement  implements java.io.Serializable {
    /* The name of a field in lower camelcase. (e.g. "biddingStrategy") */
    private java.lang.String field;

    /* For list fields, this is a 0-indexed position in the list.
     * Null for non-list fields. */
    private java.lang.Integer index;

    public FieldPathElement() {
    }

    public FieldPathElement(
           java.lang.String field,
           java.lang.Integer index) {
           this.field = field;
           this.index = index;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("field", getField())
            .add("index", getIndex())
            .toString();
    }

    /**
     * Gets the field value for this FieldPathElement.
     * 
     * @return field   * The name of a field in lower camelcase. (e.g. "biddingStrategy")
     */
    public java.lang.String getField() {
        return field;
    }


    /**
     * Sets the field value for this FieldPathElement.
     * 
     * @param field   * The name of a field in lower camelcase. (e.g. "biddingStrategy")
     */
    public void setField(java.lang.String field) {
        this.field = field;
    }


    /**
     * Gets the index value for this FieldPathElement.
     * 
     * @return index   * For list fields, this is a 0-indexed position in the list.
     * Null for non-list fields.
     */
    public java.lang.Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this FieldPathElement.
     * 
     * @param index   * For list fields, this is a 0-indexed position in the list.
     * Null for non-list fields.
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldPathElement)) return false;
        FieldPathElement other = (FieldPathElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.field==null && other.getField()==null) || 
             (this.field!=null &&
              this.field.equals(other.getField()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex())));
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
        if (getField() != null) {
            _hashCode += getField().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FieldPathElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FieldPathElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
