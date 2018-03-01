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
 * LongComparisonOperation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Object representing integer comparison operations. This is usually
 * used within
 *             a particular {@link SearchParameter} to specify the valid
 * values requested for the specific
 *             {@link Attribute}.
 */
public class LongComparisonOperation  implements java.io.Serializable {
    /* The minimum value of elements returned by this operation (inclusive). */
    private java.lang.Long minimum;

    /* The maximum value of elements returned by this operation (inclusive). */
    private java.lang.Long maximum;

    public LongComparisonOperation() {
    }

    public LongComparisonOperation(
           java.lang.Long minimum,
           java.lang.Long maximum) {
           this.minimum = minimum;
           this.maximum = maximum;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("maximum", getMaximum())
            .add("minimum", getMinimum())
            .toString();
    }

    /**
     * Gets the minimum value for this LongComparisonOperation.
     * 
     * @return minimum   * The minimum value of elements returned by this operation (inclusive).
     */
    public java.lang.Long getMinimum() {
        return minimum;
    }


    /**
     * Sets the minimum value for this LongComparisonOperation.
     * 
     * @param minimum   * The minimum value of elements returned by this operation (inclusive).
     */
    public void setMinimum(java.lang.Long minimum) {
        this.minimum = minimum;
    }


    /**
     * Gets the maximum value for this LongComparisonOperation.
     * 
     * @return maximum   * The maximum value of elements returned by this operation (inclusive).
     */
    public java.lang.Long getMaximum() {
        return maximum;
    }


    /**
     * Sets the maximum value for this LongComparisonOperation.
     * 
     * @param maximum   * The maximum value of elements returned by this operation (inclusive).
     */
    public void setMaximum(java.lang.Long maximum) {
        this.maximum = maximum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LongComparisonOperation)) return false;
        LongComparisonOperation other = (LongComparisonOperation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minimum==null && other.getMinimum()==null) || 
             (this.minimum!=null &&
              this.minimum.equals(other.getMinimum()))) &&
            ((this.maximum==null && other.getMaximum()==null) || 
             (this.maximum!=null &&
              this.maximum.equals(other.getMaximum())));
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
        if (getMinimum() != null) {
            _hashCode += getMinimum().hashCode();
        }
        if (getMaximum() != null) {
            _hashCode += getMaximum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LongComparisonOperation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "LongComparisonOperation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "minimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "maximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
