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
 * PolicyViolationErrorPart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Points to a substring within an ad field or criterion.
 */
public class PolicyViolationErrorPart  implements java.io.Serializable {
    /* Index of the starting position of the violating text within
     * the line. */
    private java.lang.Integer index;

    /* The length of the violating text. */
    private java.lang.Integer length;

    public PolicyViolationErrorPart() {
    }

    public PolicyViolationErrorPart(
           java.lang.Integer index,
           java.lang.Integer length) {
           this.index = index;
           this.length = length;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("index", getIndex())
            .add("length", getLength())
            .toString();
    }

    /**
     * Gets the index value for this PolicyViolationErrorPart.
     * 
     * @return index   * Index of the starting position of the violating text within
     * the line.
     */
    public java.lang.Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this PolicyViolationErrorPart.
     * 
     * @param index   * Index of the starting position of the violating text within
     * the line.
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }


    /**
     * Gets the length value for this PolicyViolationErrorPart.
     * 
     * @return length   * The length of the violating text.
     */
    public java.lang.Integer getLength() {
        return length;
    }


    /**
     * Sets the length value for this PolicyViolationErrorPart.
     * 
     * @param length   * The length of the violating text.
     */
    public void setLength(java.lang.Integer length) {
        this.length = length;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PolicyViolationErrorPart)) return false;
        PolicyViolationErrorPart other = (PolicyViolationErrorPart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength())));
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
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PolicyViolationErrorPart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "PolicyViolationError.Part"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "length"));
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
