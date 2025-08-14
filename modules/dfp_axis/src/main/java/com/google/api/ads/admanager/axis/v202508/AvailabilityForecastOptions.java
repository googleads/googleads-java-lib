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
 * AvailabilityForecastOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202508;


/**
 * Forecasting options for line item availability forecasts.
 */
public class AvailabilityForecastOptions  implements java.io.Serializable {
    /* When specified, forecast result for the availability line item
     * will also include breakdowns by
     *                 its targeting in {@link AvailabilityForecast#targetingCriteriaBreakdowns}. */
    private java.lang.Boolean includeTargetingCriteriaBreakdown;

    /* When specified, the forecast result for the availability line
     * item will also include contending
     *                 line items in {@link AvailabilityForecast#contendingLineItems}. */
    private java.lang.Boolean includeContendingLineItems;

    private com.google.api.ads.admanager.axis.v202508.ForecastBreakdownOptions breakdown;

    public AvailabilityForecastOptions() {
    }

    public AvailabilityForecastOptions(
           java.lang.Boolean includeTargetingCriteriaBreakdown,
           java.lang.Boolean includeContendingLineItems,
           com.google.api.ads.admanager.axis.v202508.ForecastBreakdownOptions breakdown) {
           this.includeTargetingCriteriaBreakdown = includeTargetingCriteriaBreakdown;
           this.includeContendingLineItems = includeContendingLineItems;
           this.breakdown = breakdown;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("breakdown", getBreakdown())
            .add("includeContendingLineItems", getIncludeContendingLineItems())
            .add("includeTargetingCriteriaBreakdown", getIncludeTargetingCriteriaBreakdown())
            .toString();
    }

    /**
     * Gets the includeTargetingCriteriaBreakdown value for this AvailabilityForecastOptions.
     * 
     * @return includeTargetingCriteriaBreakdown   * When specified, forecast result for the availability line item
     * will also include breakdowns by
     *                 its targeting in {@link AvailabilityForecast#targetingCriteriaBreakdowns}.
     */
    public java.lang.Boolean getIncludeTargetingCriteriaBreakdown() {
        return includeTargetingCriteriaBreakdown;
    }


    /**
     * Sets the includeTargetingCriteriaBreakdown value for this AvailabilityForecastOptions.
     * 
     * @param includeTargetingCriteriaBreakdown   * When specified, forecast result for the availability line item
     * will also include breakdowns by
     *                 its targeting in {@link AvailabilityForecast#targetingCriteriaBreakdowns}.
     */
    public void setIncludeTargetingCriteriaBreakdown(java.lang.Boolean includeTargetingCriteriaBreakdown) {
        this.includeTargetingCriteriaBreakdown = includeTargetingCriteriaBreakdown;
    }


    /**
     * Gets the includeContendingLineItems value for this AvailabilityForecastOptions.
     * 
     * @return includeContendingLineItems   * When specified, the forecast result for the availability line
     * item will also include contending
     *                 line items in {@link AvailabilityForecast#contendingLineItems}.
     */
    public java.lang.Boolean getIncludeContendingLineItems() {
        return includeContendingLineItems;
    }


    /**
     * Sets the includeContendingLineItems value for this AvailabilityForecastOptions.
     * 
     * @param includeContendingLineItems   * When specified, the forecast result for the availability line
     * item will also include contending
     *                 line items in {@link AvailabilityForecast#contendingLineItems}.
     */
    public void setIncludeContendingLineItems(java.lang.Boolean includeContendingLineItems) {
        this.includeContendingLineItems = includeContendingLineItems;
    }


    /**
     * Gets the breakdown value for this AvailabilityForecastOptions.
     * 
     * @return breakdown
     */
    public com.google.api.ads.admanager.axis.v202508.ForecastBreakdownOptions getBreakdown() {
        return breakdown;
    }


    /**
     * Sets the breakdown value for this AvailabilityForecastOptions.
     * 
     * @param breakdown
     */
    public void setBreakdown(com.google.api.ads.admanager.axis.v202508.ForecastBreakdownOptions breakdown) {
        this.breakdown = breakdown;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityForecastOptions)) return false;
        AvailabilityForecastOptions other = (AvailabilityForecastOptions) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeTargetingCriteriaBreakdown==null && other.getIncludeTargetingCriteriaBreakdown()==null) || 
             (this.includeTargetingCriteriaBreakdown!=null &&
              this.includeTargetingCriteriaBreakdown.equals(other.getIncludeTargetingCriteriaBreakdown()))) &&
            ((this.includeContendingLineItems==null && other.getIncludeContendingLineItems()==null) || 
             (this.includeContendingLineItems!=null &&
              this.includeContendingLineItems.equals(other.getIncludeContendingLineItems()))) &&
            ((this.breakdown==null && other.getBreakdown()==null) || 
             (this.breakdown!=null &&
              this.breakdown.equals(other.getBreakdown())));
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
        if (getIncludeTargetingCriteriaBreakdown() != null) {
            _hashCode += getIncludeTargetingCriteriaBreakdown().hashCode();
        }
        if (getIncludeContendingLineItems() != null) {
            _hashCode += getIncludeContendingLineItems().hashCode();
        }
        if (getBreakdown() != null) {
            _hashCode += getBreakdown().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityForecastOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "AvailabilityForecastOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTargetingCriteriaBreakdown");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "includeTargetingCriteriaBreakdown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeContendingLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "includeContendingLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakdown");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "breakdown"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202508", "ForecastBreakdownOptions"));
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
