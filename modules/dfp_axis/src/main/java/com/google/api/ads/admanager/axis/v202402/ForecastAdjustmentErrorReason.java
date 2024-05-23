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
 * ForecastAdjustmentErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202402;

public class ForecastAdjustmentErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ForecastAdjustmentErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AD_REQUEST_SOURCE_PLATFORMS_MUST_MATCH_SEGMENT_PLATFORMS = "AD_REQUEST_SOURCE_PLATFORMS_MUST_MATCH_SEGMENT_PLATFORMS";
    public static final java.lang.String _AD_REQUEST_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT_RELATIVE_TO_ADJUSTMENT = "AD_REQUEST_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT_RELATIVE_TO_ADJUSTMENT";
    public static final java.lang.String _ADJUSTED_VALUE_ABOVE_RECOMMENDED_RELATIVE_LIMIT = "ADJUSTED_VALUE_ABOVE_RECOMMENDED_RELATIVE_LIMIT";
    public static final java.lang.String _ADJUSTED_VALUE_TOO_HIGH_RELATIVE_TO_FORECAST = "ADJUSTED_VALUE_TOO_HIGH_RELATIVE_TO_FORECAST";
    public static final java.lang.String _ADJUSTED_VALUE_TOO_LOW = "ADJUSTED_VALUE_TOO_LOW";
    public static final java.lang.String _ADJUSTED_VALUE_TOO_LOW_RELATIVE_TO_FORECAST = "ADJUSTED_VALUE_TOO_LOW_RELATIVE_TO_FORECAST";
    public static final java.lang.String _ADJUSTS_CROSS_SELL_INVENTORY = "ADJUSTS_CROSS_SELL_INVENTORY";
    public static final java.lang.String _DATE_RANGE_OVERLAPS_ANOTHER_ADJUSTMENT = "DATE_RANGE_OVERLAPS_ANOTHER_ADJUSTMENT";
    public static final java.lang.String _END_DATE_AFTER_FURTHEST_AVAILABLE_FORECAST_DATE = "END_DATE_AFTER_FURTHEST_AVAILABLE_FORECAST_DATE";
    public static final java.lang.String _END_DATE_NOT_ON_OR_AFTER_START_DATE = "END_DATE_NOT_ON_OR_AFTER_START_DATE";
    public static final java.lang.String _HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT = "HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT";
    public static final java.lang.String _HISTORICAL_END_DATE_NOT_IN_PAST = "HISTORICAL_END_DATE_NOT_IN_PAST";
    public static final java.lang.String _HISTORICAL_START_DATE_TOO_FAR_BEFORE_ADJUSTMENT_END_DATE = "HISTORICAL_START_DATE_TOO_FAR_BEFORE_ADJUSTMENT_END_DATE";
    public static final java.lang.String _NO_VOLUME_SETTINGS_PROVIDED = "NO_VOLUME_SETTINGS_PROVIDED";
    public static final java.lang.String _NUMBER_OF_VALUES_DOES_NOT_MATCH_DATE_RANGE = "NUMBER_OF_VALUES_DOES_NOT_MATCH_DATE_RANGE";
    public static final java.lang.String _PARENT_SEGMENT_TARGETING_INCOMPATIBLE_WITH_HISTORICAL_BASIS_AD_REQUEST_SOURCE_SETTINGS = "PARENT_SEGMENT_TARGETING_INCOMPATIBLE_WITH_HISTORICAL_BASIS_AD_REQUEST_SOURCE_SETTINGS";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final ForecastAdjustmentErrorReason AD_REQUEST_SOURCE_PLATFORMS_MUST_MATCH_SEGMENT_PLATFORMS = new ForecastAdjustmentErrorReason(_AD_REQUEST_SOURCE_PLATFORMS_MUST_MATCH_SEGMENT_PLATFORMS);
    public static final ForecastAdjustmentErrorReason AD_REQUEST_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT_RELATIVE_TO_ADJUSTMENT = new ForecastAdjustmentErrorReason(_AD_REQUEST_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT_RELATIVE_TO_ADJUSTMENT);
    public static final ForecastAdjustmentErrorReason ADJUSTED_VALUE_ABOVE_RECOMMENDED_RELATIVE_LIMIT = new ForecastAdjustmentErrorReason(_ADJUSTED_VALUE_ABOVE_RECOMMENDED_RELATIVE_LIMIT);
    public static final ForecastAdjustmentErrorReason ADJUSTED_VALUE_TOO_HIGH_RELATIVE_TO_FORECAST = new ForecastAdjustmentErrorReason(_ADJUSTED_VALUE_TOO_HIGH_RELATIVE_TO_FORECAST);
    public static final ForecastAdjustmentErrorReason ADJUSTED_VALUE_TOO_LOW = new ForecastAdjustmentErrorReason(_ADJUSTED_VALUE_TOO_LOW);
    public static final ForecastAdjustmentErrorReason ADJUSTED_VALUE_TOO_LOW_RELATIVE_TO_FORECAST = new ForecastAdjustmentErrorReason(_ADJUSTED_VALUE_TOO_LOW_RELATIVE_TO_FORECAST);
    public static final ForecastAdjustmentErrorReason ADJUSTS_CROSS_SELL_INVENTORY = new ForecastAdjustmentErrorReason(_ADJUSTS_CROSS_SELL_INVENTORY);
    public static final ForecastAdjustmentErrorReason DATE_RANGE_OVERLAPS_ANOTHER_ADJUSTMENT = new ForecastAdjustmentErrorReason(_DATE_RANGE_OVERLAPS_ANOTHER_ADJUSTMENT);
    public static final ForecastAdjustmentErrorReason END_DATE_AFTER_FURTHEST_AVAILABLE_FORECAST_DATE = new ForecastAdjustmentErrorReason(_END_DATE_AFTER_FURTHEST_AVAILABLE_FORECAST_DATE);
    public static final ForecastAdjustmentErrorReason END_DATE_NOT_ON_OR_AFTER_START_DATE = new ForecastAdjustmentErrorReason(_END_DATE_NOT_ON_OR_AFTER_START_DATE);
    public static final ForecastAdjustmentErrorReason HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT = new ForecastAdjustmentErrorReason(_HISTORICAL_BASIS_DATE_RANGE_TOO_SHORT);
    public static final ForecastAdjustmentErrorReason HISTORICAL_END_DATE_NOT_IN_PAST = new ForecastAdjustmentErrorReason(_HISTORICAL_END_DATE_NOT_IN_PAST);
    public static final ForecastAdjustmentErrorReason HISTORICAL_START_DATE_TOO_FAR_BEFORE_ADJUSTMENT_END_DATE = new ForecastAdjustmentErrorReason(_HISTORICAL_START_DATE_TOO_FAR_BEFORE_ADJUSTMENT_END_DATE);
    public static final ForecastAdjustmentErrorReason NO_VOLUME_SETTINGS_PROVIDED = new ForecastAdjustmentErrorReason(_NO_VOLUME_SETTINGS_PROVIDED);
    public static final ForecastAdjustmentErrorReason NUMBER_OF_VALUES_DOES_NOT_MATCH_DATE_RANGE = new ForecastAdjustmentErrorReason(_NUMBER_OF_VALUES_DOES_NOT_MATCH_DATE_RANGE);
    public static final ForecastAdjustmentErrorReason PARENT_SEGMENT_TARGETING_INCOMPATIBLE_WITH_HISTORICAL_BASIS_AD_REQUEST_SOURCE_SETTINGS = new ForecastAdjustmentErrorReason(_PARENT_SEGMENT_TARGETING_INCOMPATIBLE_WITH_HISTORICAL_BASIS_AD_REQUEST_SOURCE_SETTINGS);
    public static final ForecastAdjustmentErrorReason UNKNOWN = new ForecastAdjustmentErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static ForecastAdjustmentErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ForecastAdjustmentErrorReason enumeration = (ForecastAdjustmentErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ForecastAdjustmentErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForecastAdjustmentErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202402", "ForecastAdjustmentError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
