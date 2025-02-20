// Copyright 2025 Google LLC
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
 * DateTimeRangeTargeting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;

public class DateTimeRangeTargeting  implements java.io.Serializable {
    private com.google.api.ads.admanager.axis.v202502.DateTimeRange[] targetedDateTimeRanges;

    public DateTimeRangeTargeting() {
    }

    public DateTimeRangeTargeting(
           com.google.api.ads.admanager.axis.v202502.DateTimeRange[] targetedDateTimeRanges) {
           this.targetedDateTimeRanges = targetedDateTimeRanges;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("targetedDateTimeRanges", getTargetedDateTimeRanges())
            .toString();
    }

    /**
     * Gets the targetedDateTimeRanges value for this DateTimeRangeTargeting.
     * 
     * @return targetedDateTimeRanges
     */
    public com.google.api.ads.admanager.axis.v202502.DateTimeRange[] getTargetedDateTimeRanges() {
        return targetedDateTimeRanges;
    }


    /**
     * Sets the targetedDateTimeRanges value for this DateTimeRangeTargeting.
     * 
     * @param targetedDateTimeRanges
     */
    public void setTargetedDateTimeRanges(com.google.api.ads.admanager.axis.v202502.DateTimeRange[] targetedDateTimeRanges) {
        this.targetedDateTimeRanges = targetedDateTimeRanges;
    }

    public com.google.api.ads.admanager.axis.v202502.DateTimeRange getTargetedDateTimeRanges(int i) {
        return this.targetedDateTimeRanges[i];
    }

    public void setTargetedDateTimeRanges(int i, com.google.api.ads.admanager.axis.v202502.DateTimeRange _value) {
        this.targetedDateTimeRanges[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateTimeRangeTargeting)) return false;
        DateTimeRangeTargeting other = (DateTimeRangeTargeting) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.targetedDateTimeRanges==null && other.getTargetedDateTimeRanges()==null) || 
             (this.targetedDateTimeRanges!=null &&
              java.util.Arrays.equals(this.targetedDateTimeRanges, other.getTargetedDateTimeRanges())));
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
        if (getTargetedDateTimeRanges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetedDateTimeRanges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetedDateTimeRanges(), i);
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
        new org.apache.axis.description.TypeDesc(DateTimeRangeTargeting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTimeRangeTargeting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetedDateTimeRanges");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "targetedDateTimeRanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTimeRange"));
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
