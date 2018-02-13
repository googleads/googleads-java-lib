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
 * FrequencyCap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Represents a limit on the number of times a single viewer can be
 * exposed to
 *             the same {@link LineItem} in a specified time period.
 */
public class FrequencyCap  implements java.io.Serializable {
    /* The maximum number of impressions than can be served to a user
     * within a
     *                 specified time period. */
    private java.lang.Integer maxImpressions;

    /* The number of {@code FrequencyCap#timeUnit} to represent the
     * total time
     *                 period. */
    private java.lang.Integer numTimeUnits;

    /* The unit of time for specifying the time period. */
    private com.google.api.ads.dfp.axis.v201802.TimeUnit timeUnit;

    public FrequencyCap() {
    }

    public FrequencyCap(
           java.lang.Integer maxImpressions,
           java.lang.Integer numTimeUnits,
           com.google.api.ads.dfp.axis.v201802.TimeUnit timeUnit) {
           this.maxImpressions = maxImpressions;
           this.numTimeUnits = numTimeUnits;
           this.timeUnit = timeUnit;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("maxImpressions", getMaxImpressions())
            .add("numTimeUnits", getNumTimeUnits())
            .add("timeUnit", getTimeUnit())
            .toString();
    }

    /**
     * Gets the maxImpressions value for this FrequencyCap.
     * 
     * @return maxImpressions   * The maximum number of impressions than can be served to a user
     * within a
     *                 specified time period.
     */
    public java.lang.Integer getMaxImpressions() {
        return maxImpressions;
    }


    /**
     * Sets the maxImpressions value for this FrequencyCap.
     * 
     * @param maxImpressions   * The maximum number of impressions than can be served to a user
     * within a
     *                 specified time period.
     */
    public void setMaxImpressions(java.lang.Integer maxImpressions) {
        this.maxImpressions = maxImpressions;
    }


    /**
     * Gets the numTimeUnits value for this FrequencyCap.
     * 
     * @return numTimeUnits   * The number of {@code FrequencyCap#timeUnit} to represent the
     * total time
     *                 period.
     */
    public java.lang.Integer getNumTimeUnits() {
        return numTimeUnits;
    }


    /**
     * Sets the numTimeUnits value for this FrequencyCap.
     * 
     * @param numTimeUnits   * The number of {@code FrequencyCap#timeUnit} to represent the
     * total time
     *                 period.
     */
    public void setNumTimeUnits(java.lang.Integer numTimeUnits) {
        this.numTimeUnits = numTimeUnits;
    }


    /**
     * Gets the timeUnit value for this FrequencyCap.
     * 
     * @return timeUnit   * The unit of time for specifying the time period.
     */
    public com.google.api.ads.dfp.axis.v201802.TimeUnit getTimeUnit() {
        return timeUnit;
    }


    /**
     * Sets the timeUnit value for this FrequencyCap.
     * 
     * @param timeUnit   * The unit of time for specifying the time period.
     */
    public void setTimeUnit(com.google.api.ads.dfp.axis.v201802.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FrequencyCap)) return false;
        FrequencyCap other = (FrequencyCap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxImpressions==null && other.getMaxImpressions()==null) || 
             (this.maxImpressions!=null &&
              this.maxImpressions.equals(other.getMaxImpressions()))) &&
            ((this.numTimeUnits==null && other.getNumTimeUnits()==null) || 
             (this.numTimeUnits!=null &&
              this.numTimeUnits.equals(other.getNumTimeUnits()))) &&
            ((this.timeUnit==null && other.getTimeUnit()==null) || 
             (this.timeUnit!=null &&
              this.timeUnit.equals(other.getTimeUnit())));
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
        if (getMaxImpressions() != null) {
            _hashCode += getMaxImpressions().hashCode();
        }
        if (getNumTimeUnits() != null) {
            _hashCode += getNumTimeUnits().hashCode();
        }
        if (getTimeUnit() != null) {
            _hashCode += getTimeUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FrequencyCap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FrequencyCap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "maxImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTimeUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "numTimeUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "timeUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "TimeUnit"));
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
