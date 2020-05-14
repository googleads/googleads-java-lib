// Copyright 2019 Google LLC
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
 * TimeSeries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201908;


/**
 * Represents a chronological sequence of daily values.
 */
public class TimeSeries  implements java.io.Serializable {
    /* The date range of the time series. */
    private com.google.api.ads.admanager.axis.v201908.DateRange timeSeriesDateRange;

    /* The traffic volume values for the {@code timeSeriesDateRange}.
     * 
     *                 <p>The list will contain a single value if {@code
     * valuePeriodType} is {@link
     *                 PeriodType.CUSTOM}, and will contain a value for each
     * day in {@code timeSeriesDateRange} if
     *                 {@code valuePeriodType} is {@link PeriodType.DAILY}.
     * The order of the values in this list
     *                 should be sorted by its chronological order. */
    private long[] timeSeriesValues;

    /* The period of each time series value (e.g. daily or custom). */
    private com.google.api.ads.admanager.axis.v201908.PeriodType valuePeriodType;

    public TimeSeries() {
    }

    public TimeSeries(
           com.google.api.ads.admanager.axis.v201908.DateRange timeSeriesDateRange,
           long[] timeSeriesValues,
           com.google.api.ads.admanager.axis.v201908.PeriodType valuePeriodType) {
           this.timeSeriesDateRange = timeSeriesDateRange;
           this.timeSeriesValues = timeSeriesValues;
           this.valuePeriodType = valuePeriodType;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("timeSeriesDateRange", getTimeSeriesDateRange())
            .add("timeSeriesValues", getTimeSeriesValues())
            .add("valuePeriodType", getValuePeriodType())
            .toString();
    }

    /**
     * Gets the timeSeriesDateRange value for this TimeSeries.
     * 
     * @return timeSeriesDateRange   * The date range of the time series.
     */
    public com.google.api.ads.admanager.axis.v201908.DateRange getTimeSeriesDateRange() {
        return timeSeriesDateRange;
    }


    /**
     * Sets the timeSeriesDateRange value for this TimeSeries.
     * 
     * @param timeSeriesDateRange   * The date range of the time series.
     */
    public void setTimeSeriesDateRange(com.google.api.ads.admanager.axis.v201908.DateRange timeSeriesDateRange) {
        this.timeSeriesDateRange = timeSeriesDateRange;
    }


    /**
     * Gets the timeSeriesValues value for this TimeSeries.
     * 
     * @return timeSeriesValues   * The traffic volume values for the {@code timeSeriesDateRange}.
     * 
     *                 <p>The list will contain a single value if {@code
     * valuePeriodType} is {@link
     *                 PeriodType.CUSTOM}, and will contain a value for each
     * day in {@code timeSeriesDateRange} if
     *                 {@code valuePeriodType} is {@link PeriodType.DAILY}.
     * The order of the values in this list
     *                 should be sorted by its chronological order.
     */
    public long[] getTimeSeriesValues() {
        return timeSeriesValues;
    }


    /**
     * Sets the timeSeriesValues value for this TimeSeries.
     * 
     * @param timeSeriesValues   * The traffic volume values for the {@code timeSeriesDateRange}.
     * 
     *                 <p>The list will contain a single value if {@code
     * valuePeriodType} is {@link
     *                 PeriodType.CUSTOM}, and will contain a value for each
     * day in {@code timeSeriesDateRange} if
     *                 {@code valuePeriodType} is {@link PeriodType.DAILY}.
     * The order of the values in this list
     *                 should be sorted by its chronological order.
     */
    public void setTimeSeriesValues(long[] timeSeriesValues) {
        this.timeSeriesValues = timeSeriesValues;
    }

    public long getTimeSeriesValues(int i) {
        return this.timeSeriesValues[i];
    }

    public void setTimeSeriesValues(int i, long _value) {
        this.timeSeriesValues[i] = _value;
    }


    /**
     * Gets the valuePeriodType value for this TimeSeries.
     * 
     * @return valuePeriodType   * The period of each time series value (e.g. daily or custom).
     */
    public com.google.api.ads.admanager.axis.v201908.PeriodType getValuePeriodType() {
        return valuePeriodType;
    }


    /**
     * Sets the valuePeriodType value for this TimeSeries.
     * 
     * @param valuePeriodType   * The period of each time series value (e.g. daily or custom).
     */
    public void setValuePeriodType(com.google.api.ads.admanager.axis.v201908.PeriodType valuePeriodType) {
        this.valuePeriodType = valuePeriodType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeSeries)) return false;
        TimeSeries other = (TimeSeries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeSeriesDateRange==null && other.getTimeSeriesDateRange()==null) || 
             (this.timeSeriesDateRange!=null &&
              this.timeSeriesDateRange.equals(other.getTimeSeriesDateRange()))) &&
            ((this.timeSeriesValues==null && other.getTimeSeriesValues()==null) || 
             (this.timeSeriesValues!=null &&
              java.util.Arrays.equals(this.timeSeriesValues, other.getTimeSeriesValues()))) &&
            ((this.valuePeriodType==null && other.getValuePeriodType()==null) || 
             (this.valuePeriodType!=null &&
              this.valuePeriodType.equals(other.getValuePeriodType())));
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
        if (getTimeSeriesDateRange() != null) {
            _hashCode += getTimeSeriesDateRange().hashCode();
        }
        if (getTimeSeriesValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeSeriesValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeSeriesValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValuePeriodType() != null) {
            _hashCode += getValuePeriodType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeSeries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201908", "TimeSeries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSeriesDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201908", "timeSeriesDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201908", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSeriesValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201908", "timeSeriesValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePeriodType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201908", "valuePeriodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201908", "PeriodType"));
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
