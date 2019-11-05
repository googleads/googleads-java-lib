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
 * TrafficForecastAdjustmentSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v201911;


/**
 * Represents a unique segment of a traffic forecast adjustment. Each
 * {@link
 *             TrafficForecastAdjustmentSegment} targets a range of dates
 * in the future to which the adjustment
 *             applies.
 */
public class TrafficForecastAdjustmentSegment  implements java.io.Serializable {
    /* The basis type of the adjustment. */
    private com.google.api.ads.admanager.axis.v201911.BasisType basisType;

    /* The traffic volume of the adjustment. This field should be
     * set if {@code basisType} is {@link
     *                 BasisType.ABSOLUTE} and null if {@link BasisType.HISTORICAL}. */
    private com.google.api.ads.admanager.axis.v201911.TimeSeries adjustmentTimeSeries;

    /* The content of the adjustment which references historical data.
     * This field should be set if
     *                 {@code basisType} is {@link BasisType.HISTORICAL}
     * and null if {@link BasisType.ABSOLUTE}. */
    private com.google.api.ads.admanager.axis.v201911.HistoricalAdjustment historicalAdjustment;

    public TrafficForecastAdjustmentSegment() {
    }

    public TrafficForecastAdjustmentSegment(
           com.google.api.ads.admanager.axis.v201911.BasisType basisType,
           com.google.api.ads.admanager.axis.v201911.TimeSeries adjustmentTimeSeries,
           com.google.api.ads.admanager.axis.v201911.HistoricalAdjustment historicalAdjustment) {
           this.basisType = basisType;
           this.adjustmentTimeSeries = adjustmentTimeSeries;
           this.historicalAdjustment = historicalAdjustment;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("adjustmentTimeSeries", getAdjustmentTimeSeries())
            .add("basisType", getBasisType())
            .add("historicalAdjustment", getHistoricalAdjustment())
            .toString();
    }

    /**
     * Gets the basisType value for this TrafficForecastAdjustmentSegment.
     * 
     * @return basisType   * The basis type of the adjustment.
     */
    public com.google.api.ads.admanager.axis.v201911.BasisType getBasisType() {
        return basisType;
    }


    /**
     * Sets the basisType value for this TrafficForecastAdjustmentSegment.
     * 
     * @param basisType   * The basis type of the adjustment.
     */
    public void setBasisType(com.google.api.ads.admanager.axis.v201911.BasisType basisType) {
        this.basisType = basisType;
    }


    /**
     * Gets the adjustmentTimeSeries value for this TrafficForecastAdjustmentSegment.
     * 
     * @return adjustmentTimeSeries   * The traffic volume of the adjustment. This field should be
     * set if {@code basisType} is {@link
     *                 BasisType.ABSOLUTE} and null if {@link BasisType.HISTORICAL}.
     */
    public com.google.api.ads.admanager.axis.v201911.TimeSeries getAdjustmentTimeSeries() {
        return adjustmentTimeSeries;
    }


    /**
     * Sets the adjustmentTimeSeries value for this TrafficForecastAdjustmentSegment.
     * 
     * @param adjustmentTimeSeries   * The traffic volume of the adjustment. This field should be
     * set if {@code basisType} is {@link
     *                 BasisType.ABSOLUTE} and null if {@link BasisType.HISTORICAL}.
     */
    public void setAdjustmentTimeSeries(com.google.api.ads.admanager.axis.v201911.TimeSeries adjustmentTimeSeries) {
        this.adjustmentTimeSeries = adjustmentTimeSeries;
    }


    /**
     * Gets the historicalAdjustment value for this TrafficForecastAdjustmentSegment.
     * 
     * @return historicalAdjustment   * The content of the adjustment which references historical data.
     * This field should be set if
     *                 {@code basisType} is {@link BasisType.HISTORICAL}
     * and null if {@link BasisType.ABSOLUTE}.
     */
    public com.google.api.ads.admanager.axis.v201911.HistoricalAdjustment getHistoricalAdjustment() {
        return historicalAdjustment;
    }


    /**
     * Sets the historicalAdjustment value for this TrafficForecastAdjustmentSegment.
     * 
     * @param historicalAdjustment   * The content of the adjustment which references historical data.
     * This field should be set if
     *                 {@code basisType} is {@link BasisType.HISTORICAL}
     * and null if {@link BasisType.ABSOLUTE}.
     */
    public void setHistoricalAdjustment(com.google.api.ads.admanager.axis.v201911.HistoricalAdjustment historicalAdjustment) {
        this.historicalAdjustment = historicalAdjustment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrafficForecastAdjustmentSegment)) return false;
        TrafficForecastAdjustmentSegment other = (TrafficForecastAdjustmentSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basisType==null && other.getBasisType()==null) || 
             (this.basisType!=null &&
              this.basisType.equals(other.getBasisType()))) &&
            ((this.adjustmentTimeSeries==null && other.getAdjustmentTimeSeries()==null) || 
             (this.adjustmentTimeSeries!=null &&
              this.adjustmentTimeSeries.equals(other.getAdjustmentTimeSeries()))) &&
            ((this.historicalAdjustment==null && other.getHistoricalAdjustment()==null) || 
             (this.historicalAdjustment!=null &&
              this.historicalAdjustment.equals(other.getHistoricalAdjustment())));
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
        if (getBasisType() != null) {
            _hashCode += getBasisType().hashCode();
        }
        if (getAdjustmentTimeSeries() != null) {
            _hashCode += getAdjustmentTimeSeries().hashCode();
        }
        if (getHistoricalAdjustment() != null) {
            _hashCode += getHistoricalAdjustment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TrafficForecastAdjustmentSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "TrafficForecastAdjustmentSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basisType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "basisType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "BasisType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentTimeSeries");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "adjustmentTimeSeries"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "TimeSeries"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicalAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "historicalAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201911", "HistoricalAdjustment"));
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
