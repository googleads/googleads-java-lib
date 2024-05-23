// Copyright 2024 Google LLC
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
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;


/**
 * Represents a chronological sequence of daily values.
 */
public class TimeSeries  implements java.io.Serializable {
    /* The date range of the time series. */
    private com.google.api.ads.admanager.axis.v202402.DateRange timeSeriesDateRange;

    /* The daily values constituting the time series.
     *                 
     *                 <p>The number of time series values must equal the
     * number of days spanned by the time series
     *                 date range, inclusive. E.g.: {@code timeSeriesDateRange}
     * of 2001-08-15 to 2001-08-17 should
     *                 contain one value for the 15th, one value for the
     * 16th, and one value for the 17th. */
    private long[] values;

    public TimeSeries() {
    }

    public TimeSeries(
           com.google.api.ads.admanager.axis.v202402.DateRange timeSeriesDateRange,
           long[] values) {
           this.timeSeriesDateRange = timeSeriesDateRange;
           this.values = values;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("timeSeriesDateRange", getTimeSeriesDateRange())
            .add("values", getValues())
            .toString();
    }

    /**
     * Gets the timeSeriesDateRange value for this TimeSeries.
     * 
     * @return timeSeriesDateRange   * The date range of the time series.
     */
    public com.google.api.ads.admanager.axis.v202402.DateRange getTimeSeriesDateRange() {
        return timeSeriesDateRange;
    }


    /**
     * Sets the timeSeriesDateRange value for this TimeSeries.
     * 
     * @param timeSeriesDateRange   * The date range of the time series.
     */
    public void setTimeSeriesDateRange(com.google.api.ads.admanager.axis.v202402.DateRange timeSeriesDateRange) {
        this.timeSeriesDateRange = timeSeriesDateRange;
    }


    /**
     * Gets the values value for this TimeSeries.
     * 
     * @return values   * The daily values constituting the time series.
     *                 
     *                 <p>The number of time series values must equal the
     * number of days spanned by the time series
     *                 date range, inclusive. E.g.: {@code timeSeriesDateRange}
     * of 2001-08-15 to 2001-08-17 should
     *                 contain one value for the 15th, one value for the
     * 16th, and one value for the 17th.
     */
    public long[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this TimeSeries.
     * 
     * @param values   * The daily values constituting the time series.
     *                 
     *                 <p>The number of time series values must equal the
     * number of days spanned by the time series
     *                 date range, inclusive. E.g.: {@code timeSeriesDateRange}
     * of 2001-08-15 to 2001-08-17 should
     *                 contain one value for the 15th, one value for the
     * 16th, and one value for the 17th.
     */
    public void setValues(long[] values) {
        this.values = values;
    }

    public long getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, long _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeSeries)) return false;
        TimeSeries other = (TimeSeries) obj;
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
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(TimeSeries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "TimeSeries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeSeriesDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "timeSeriesDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
