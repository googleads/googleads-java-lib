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
 * Range.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.o;


/**
 * Represents a range of values that has either an upper or a lower
 * bound.
 */
public class Range  implements java.io.Serializable {
    private com.google.api.ads.adwords.axis.v201802.cm.ComparableValue min;

    private com.google.api.ads.adwords.axis.v201802.cm.ComparableValue max;

    public Range() {
    }

    public Range(
           com.google.api.ads.adwords.axis.v201802.cm.ComparableValue min,
           com.google.api.ads.adwords.axis.v201802.cm.ComparableValue max) {
           this.min = min;
           this.max = max;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("max", getMax())
            .add("min", getMin())
            .toString();
    }

    /**
     * Gets the min value for this Range.
     * 
     * @return min
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ComparableValue getMin() {
        return min;
    }


    /**
     * Sets the min value for this Range.
     * 
     * @param min
     */
    public void setMin(com.google.api.ads.adwords.axis.v201802.cm.ComparableValue min) {
        this.min = min;
    }


    /**
     * Gets the max value for this Range.
     * 
     * @return max
     */
    public com.google.api.ads.adwords.axis.v201802.cm.ComparableValue getMax() {
        return max;
    }


    /**
     * Sets the max value for this Range.
     * 
     * @param max
     */
    public void setMax(com.google.api.ads.adwords.axis.v201802.cm.ComparableValue max) {
        this.max = max;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Range)) return false;
        Range other = (Range) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax())));
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
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Range.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "Range"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ComparableValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/o/v201802", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ComparableValue"));
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
