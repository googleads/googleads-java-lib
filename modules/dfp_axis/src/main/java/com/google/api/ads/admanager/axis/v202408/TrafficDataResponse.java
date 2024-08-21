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
 * TrafficDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202408;


/**
 * Contains forecasted and historical traffic volume data describing
 * a segment of traffic.
 */
public class TrafficDataResponse  implements java.io.Serializable {
    /* Time series of historical traffic ad opportunity counts.
     *                 
     *                 <p>This may be null if the requested date range did
     * not contain any historical dates, or if no
     *                 historical data are available for the requested traffic
     * segment.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202408.TimeSeries historicalTimeSeries;

    /* Time series of forecasted traffic ad opportunity counts.
     *                 
     *                 <p>This may be null if the requested date range did
     * not contain any future dates, or if no
     *                 forecasted data are available for the requested traffic
     * segment.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202408.TimeSeries forecastedTimeSeries;

    /* Time series of future traffic volumes forecasted to be sold.
     * 
     *                 <p>This may be null if the requested date range did
     * not contain any future dates, or if no
     *                 sell-through data are available for the requested
     * traffic segment.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202408.TimeSeries forecastedAssignedTimeSeries;

    /* The overall date range spanned by the union of all time series
     * in the response.
     *                 
     *                 <p>This is a summary field for convenience. The value
     * will be set such that the start date is
     *                 equal to the earliest start date of all time series
     * included, and the end date is equal to the
     *                 latest end date of all time series included.
     *                 
     *                 <p>If all time series fields are null, this field
     * will also be null.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202408.DateRange overallDateRange;

    public TrafficDataResponse() {
    }

    public TrafficDataResponse(
           com.google.api.ads.admanager.axis.v202408.TimeSeries historicalTimeSeries,
           com.google.api.ads.admanager.axis.v202408.TimeSeries forecastedTimeSeries,
           com.google.api.ads.admanager.axis.v202408.TimeSeries forecastedAssignedTimeSeries,
           com.google.api.ads.admanager.axis.v202408.DateRange overallDateRange) {
           this.historicalTimeSeries = historicalTimeSeries;
           this.forecastedTimeSeries = forecastedTimeSeries;
           this.forecastedAssignedTimeSeries = forecastedAssignedTimeSeries;
           this.overallDateRange = overallDateRange;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("forecastedAssignedTimeSeries", getForecastedAssignedTimeSeries())
            .add("forecastedTimeSeries", getForecastedTimeSeries())
            .add("historicalTimeSeries", getHistoricalTimeSeries())
            .add("overallDateRange", getOverallDateRange())
            .toString();
    }

    /**
     * Gets the historicalTimeSeries value for this TrafficDataResponse.
     * 
     * @return historicalTimeSeries   * Time series of historical traffic ad opportunity counts.
     *                 
     *                 <p>This may be null if the requested date range did
     * not contain any historical dates, or if no
     *                 historical data are available for the requested traffic
     * segment.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202408.TimeSeries getHistoricalTimeSeries() {
        return historicalTimeSeries;
    }


    /**
     * Sets the historicalTimeSeries value for this TrafficDataResponse.
     * 
     * @param historicalTimeSeries   * Time series of historical traffic ad opportunity counts.
     *                 
     *                 <p>This may be null if the requested date range did
     * not contain any historical dates, or if no
     *                 historical data are available for the requested traffic
     * segment.
     *                 This attribute is read-only.
     */
    public void setHistoricalTimeSeries(com.google.api.ads.admanager.axis.v202408.TimeSeries historicalTimeSeries) {
        this.historicalTimeSeries = historicalTimeSeries;
    }


    /**
     * Gets the forecastedTimeSeries value for this TrafficDataResponse.
     * 
     * @return forecastedTimeSeries   * Time series of forecasted traffic ad opportunity counts.
     *                 
     *                 <p>This may be null if the requested date range did
     * not contain any future dates, or if no
     *                 forecasted data are available for the requested traffic
     * segment.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202408.TimeSeries getForecastedTimeSeries() {
        return forecastedTimeSeries;
    }


    /**
     * Sets the forecastedTimeSeries value for this TrafficDataResponse.
     * 
     * @param forecastedTimeSeries   * Time series of forecasted traffic ad opportunity counts.
     *                 
     *                 <p>This may be null if the requested date range did
     * not contain any future dates, or if no
     *                 forecasted data are available for the requested traffic
     * segment.
     *                 This attribute is read-only.
     */
    public void setForecastedTimeSeries(com.google.api.ads.admanager.axis.v202408.TimeSeries forecastedTimeSeries) {
        this.forecastedTimeSeries = forecastedTimeSeries;
    }


    /**
     * Gets the forecastedAssignedTimeSeries value for this TrafficDataResponse.
     * 
     * @return forecastedAssignedTimeSeries   * Time series of future traffic volumes forecasted to be sold.
     * 
     *                 <p>This may be null if the requested date range did
     * not contain any future dates, or if no
     *                 sell-through data are available for the requested
     * traffic segment.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202408.TimeSeries getForecastedAssignedTimeSeries() {
        return forecastedAssignedTimeSeries;
    }


    /**
     * Sets the forecastedAssignedTimeSeries value for this TrafficDataResponse.
     * 
     * @param forecastedAssignedTimeSeries   * Time series of future traffic volumes forecasted to be sold.
     * 
     *                 <p>This may be null if the requested date range did
     * not contain any future dates, or if no
     *                 sell-through data are available for the requested
     * traffic segment.
     *                 This attribute is read-only.
     */
    public void setForecastedAssignedTimeSeries(com.google.api.ads.admanager.axis.v202408.TimeSeries forecastedAssignedTimeSeries) {
        this.forecastedAssignedTimeSeries = forecastedAssignedTimeSeries;
    }


    /**
     * Gets the overallDateRange value for this TrafficDataResponse.
     * 
     * @return overallDateRange   * The overall date range spanned by the union of all time series
     * in the response.
     *                 
     *                 <p>This is a summary field for convenience. The value
     * will be set such that the start date is
     *                 equal to the earliest start date of all time series
     * included, and the end date is equal to the
     *                 latest end date of all time series included.
     *                 
     *                 <p>If all time series fields are null, this field
     * will also be null.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202408.DateRange getOverallDateRange() {
        return overallDateRange;
    }


    /**
     * Sets the overallDateRange value for this TrafficDataResponse.
     * 
     * @param overallDateRange   * The overall date range spanned by the union of all time series
     * in the response.
     *                 
     *                 <p>This is a summary field for convenience. The value
     * will be set such that the start date is
     *                 equal to the earliest start date of all time series
     * included, and the end date is equal to the
     *                 latest end date of all time series included.
     *                 
     *                 <p>If all time series fields are null, this field
     * will also be null.
     *                 This attribute is read-only.
     */
    public void setOverallDateRange(com.google.api.ads.admanager.axis.v202408.DateRange overallDateRange) {
        this.overallDateRange = overallDateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficDataResponse)) return false;
        TrafficDataResponse other = (TrafficDataResponse) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.historicalTimeSeries==null && other.getHistoricalTimeSeries()==null) || 
             (this.historicalTimeSeries!=null &&
              this.historicalTimeSeries.equals(other.getHistoricalTimeSeries()))) &&
            ((this.forecastedTimeSeries==null && other.getForecastedTimeSeries()==null) || 
             (this.forecastedTimeSeries!=null &&
              this.forecastedTimeSeries.equals(other.getForecastedTimeSeries()))) &&
            ((this.forecastedAssignedTimeSeries==null && other.getForecastedAssignedTimeSeries()==null) || 
             (this.forecastedAssignedTimeSeries!=null &&
              this.forecastedAssignedTimeSeries.equals(other.getForecastedAssignedTimeSeries()))) &&
            ((this.overallDateRange==null && other.getOverallDateRange()==null) || 
             (this.overallDateRange!=null &&
              this.overallDateRange.equals(other.getOverallDateRange())));
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
        if (getHistoricalTimeSeries() != null) {
            _hashCode += getHistoricalTimeSeries().hashCode();
        }
        if (getForecastedTimeSeries() != null) {
            _hashCode += getForecastedTimeSeries().hashCode();
        }
        if (getForecastedAssignedTimeSeries() != null) {
            _hashCode += getForecastedAssignedTimeSeries().hashCode();
        }
        if (getOverallDateRange() != null) {
            _hashCode += getOverallDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "TrafficDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalTimeSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "historicalTimeSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "TimeSeries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastedTimeSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "forecastedTimeSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "TimeSeries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastedAssignedTimeSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "forecastedAssignedTimeSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "TimeSeries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallDateRange");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "overallDateRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202408", "DateRange"));
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
