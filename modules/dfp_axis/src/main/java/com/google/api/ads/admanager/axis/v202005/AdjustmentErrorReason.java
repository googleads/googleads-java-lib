// Copyright 2020 Google LLC
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
 * AdjustmentErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202005;

public class AdjustmentErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AdjustmentErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _START_DATE_TIME_IS_IN_PAST = "START_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _END_DATE_TIME_NOT_AFTER_START_TIME = "END_DATE_TIME_NOT_AFTER_START_TIME";
    public static final java.lang.String _END_DATE_TIME_TOO_LATE = "END_DATE_TIME_TOO_LATE";
    public static final java.lang.String _HISTORICAL_DATE_RANGE_INVALID = "HISTORICAL_DATE_RANGE_INVALID";
    public static final java.lang.String _HISTORICAL_START_DATE_TIME_IS_TOO_FAR_IN_PAST = "HISTORICAL_START_DATE_TIME_IS_TOO_FAR_IN_PAST";
    public static final java.lang.String _HISTORICAL_START_DATE_TIME_IS_BEFORE_CREATION_OF_INVENTORY_UNIT = "HISTORICAL_START_DATE_TIME_IS_BEFORE_CREATION_OF_INVENTORY_UNIT";
    public static final java.lang.String _HISTORICAL_END_DATE_TIME_IS_NOT_IN_PAST = "HISTORICAL_END_DATE_TIME_IS_NOT_IN_PAST";
    public static final java.lang.String _HISTORICAL_END_DATE_TIME_NOT_AFTER_HISTORICAL_START_TIME = "HISTORICAL_END_DATE_TIME_NOT_AFTER_HISTORICAL_START_TIME";
    public static final java.lang.String _HISTORICAL_DATE_RANGE_LENGTH_DOES_NOT_MATCH_FUTURE_DATE_RANGE_LENGTH = "HISTORICAL_DATE_RANGE_LENGTH_DOES_NOT_MATCH_FUTURE_DATE_RANGE_LENGTH";
    public static final java.lang.String _ADJUSTMENT_ALREADY_EXISTS_FOR_AD_UNIT_IN_DATE_RANGE = "ADJUSTMENT_ALREADY_EXISTS_FOR_AD_UNIT_IN_DATE_RANGE";
    public static final java.lang.String _INVALID_IMPRESSION_VOLUME = "INVALID_IMPRESSION_VOLUME";
    public static final java.lang.String _OVERRIDE_SIZE_SETS_MUST_BE_UNIQUE = "OVERRIDE_SIZE_SETS_MUST_BE_UNIQUE";
    public static final java.lang.String _OVERRIDE_SIZE_SET_SIZES_MUST_HAVE_THE_SAME_ENV_TYPE = "OVERRIDE_SIZE_SET_SIZES_MUST_HAVE_THE_SAME_ENV_TYPE";
    public static final java.lang.String _OVERRIDE_SIZE_SET_SIZES_MUST_MATCH_INVENTORY = "OVERRIDE_SIZE_SET_SIZES_MUST_MATCH_INVENTORY";
    public static final java.lang.String _INVALID_INVENTORY_UNIT_ID = "INVALID_INVENTORY_UNIT_ID";
    public static final java.lang.String _VIOLATES_CONSTRAINTS_OF_OVERLAPPING_ENTRIES = "VIOLATES_CONSTRAINTS_OF_OVERLAPPING_ENTRIES";
    public static final java.lang.String _INVALID_ADJUSTMENT_UPLOAD = "INVALID_ADJUSTMENT_UPLOAD";
    public static final java.lang.String _FUTURE_DATE_RANGE_MUST_BE_IN_WEEK_INCREMENTS = "FUTURE_DATE_RANGE_MUST_BE_IN_WEEK_INCREMENTS";
    public static final java.lang.String _BULK_UPLOAD_ADJUSTMENT_LIMIT_REACHED = "BULK_UPLOAD_ADJUSTMENT_LIMIT_REACHED";
    public static final java.lang.String _WEEKLY_MANUAL_ADJUSTMENTS_NOT_ALLOWED = "WEEKLY_MANUAL_ADJUSTMENTS_NOT_ALLOWED";
    public static final java.lang.String _TARGETING_OR_INVENTORY_UNIT_REQUIRED = "TARGETING_OR_INVENTORY_UNIT_REQUIRED";
    public static final java.lang.String _CANNOT_CHANGE_ADJUSTMENT_TARGET_TYPE = "CANNOT_CHANGE_ADJUSTMENT_TARGET_TYPE";
    public static final java.lang.String _OVERRIDES_NOT_ALLOWED_WITH_TARGETING = "OVERRIDES_NOT_ALLOWED_WITH_TARGETING";
    public static final java.lang.String _INVALID_TARGETING_EXPRESSION = "INVALID_TARGETING_EXPRESSION";
    public static final java.lang.String _ADJUSTMENT_NAME_MUST_BE_UNIQUE = "ADJUSTMENT_NAME_MUST_BE_UNIQUE";
    public static final java.lang.String _END_DATE_TIME_IS_IN_PAST = "END_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _HISTORICAL_TARGETING_REQUIRED = "HISTORICAL_TARGETING_REQUIRED";
    public static final java.lang.String _INVALID_HISTORICAL_TARGETING = "INVALID_HISTORICAL_TARGETING";
    public static final java.lang.String _AD_UNIT_REQUIRED = "AD_UNIT_REQUIRED";
    public static final java.lang.String _TARGETING_REQUIRED = "TARGETING_REQUIRED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AdjustmentErrorReason START_DATE_TIME_IS_IN_PAST = new AdjustmentErrorReason(_START_DATE_TIME_IS_IN_PAST);
    public static final AdjustmentErrorReason END_DATE_TIME_NOT_AFTER_START_TIME = new AdjustmentErrorReason(_END_DATE_TIME_NOT_AFTER_START_TIME);
    public static final AdjustmentErrorReason END_DATE_TIME_TOO_LATE = new AdjustmentErrorReason(_END_DATE_TIME_TOO_LATE);
    public static final AdjustmentErrorReason HISTORICAL_DATE_RANGE_INVALID = new AdjustmentErrorReason(_HISTORICAL_DATE_RANGE_INVALID);
    public static final AdjustmentErrorReason HISTORICAL_START_DATE_TIME_IS_TOO_FAR_IN_PAST = new AdjustmentErrorReason(_HISTORICAL_START_DATE_TIME_IS_TOO_FAR_IN_PAST);
    public static final AdjustmentErrorReason HISTORICAL_START_DATE_TIME_IS_BEFORE_CREATION_OF_INVENTORY_UNIT = new AdjustmentErrorReason(_HISTORICAL_START_DATE_TIME_IS_BEFORE_CREATION_OF_INVENTORY_UNIT);
    public static final AdjustmentErrorReason HISTORICAL_END_DATE_TIME_IS_NOT_IN_PAST = new AdjustmentErrorReason(_HISTORICAL_END_DATE_TIME_IS_NOT_IN_PAST);
    public static final AdjustmentErrorReason HISTORICAL_END_DATE_TIME_NOT_AFTER_HISTORICAL_START_TIME = new AdjustmentErrorReason(_HISTORICAL_END_DATE_TIME_NOT_AFTER_HISTORICAL_START_TIME);
    public static final AdjustmentErrorReason HISTORICAL_DATE_RANGE_LENGTH_DOES_NOT_MATCH_FUTURE_DATE_RANGE_LENGTH = new AdjustmentErrorReason(_HISTORICAL_DATE_RANGE_LENGTH_DOES_NOT_MATCH_FUTURE_DATE_RANGE_LENGTH);
    public static final AdjustmentErrorReason ADJUSTMENT_ALREADY_EXISTS_FOR_AD_UNIT_IN_DATE_RANGE = new AdjustmentErrorReason(_ADJUSTMENT_ALREADY_EXISTS_FOR_AD_UNIT_IN_DATE_RANGE);
    public static final AdjustmentErrorReason INVALID_IMPRESSION_VOLUME = new AdjustmentErrorReason(_INVALID_IMPRESSION_VOLUME);
    public static final AdjustmentErrorReason OVERRIDE_SIZE_SETS_MUST_BE_UNIQUE = new AdjustmentErrorReason(_OVERRIDE_SIZE_SETS_MUST_BE_UNIQUE);
    public static final AdjustmentErrorReason OVERRIDE_SIZE_SET_SIZES_MUST_HAVE_THE_SAME_ENV_TYPE = new AdjustmentErrorReason(_OVERRIDE_SIZE_SET_SIZES_MUST_HAVE_THE_SAME_ENV_TYPE);
    public static final AdjustmentErrorReason OVERRIDE_SIZE_SET_SIZES_MUST_MATCH_INVENTORY = new AdjustmentErrorReason(_OVERRIDE_SIZE_SET_SIZES_MUST_MATCH_INVENTORY);
    public static final AdjustmentErrorReason INVALID_INVENTORY_UNIT_ID = new AdjustmentErrorReason(_INVALID_INVENTORY_UNIT_ID);
    public static final AdjustmentErrorReason VIOLATES_CONSTRAINTS_OF_OVERLAPPING_ENTRIES = new AdjustmentErrorReason(_VIOLATES_CONSTRAINTS_OF_OVERLAPPING_ENTRIES);
    public static final AdjustmentErrorReason INVALID_ADJUSTMENT_UPLOAD = new AdjustmentErrorReason(_INVALID_ADJUSTMENT_UPLOAD);
    public static final AdjustmentErrorReason FUTURE_DATE_RANGE_MUST_BE_IN_WEEK_INCREMENTS = new AdjustmentErrorReason(_FUTURE_DATE_RANGE_MUST_BE_IN_WEEK_INCREMENTS);
    public static final AdjustmentErrorReason BULK_UPLOAD_ADJUSTMENT_LIMIT_REACHED = new AdjustmentErrorReason(_BULK_UPLOAD_ADJUSTMENT_LIMIT_REACHED);
    public static final AdjustmentErrorReason WEEKLY_MANUAL_ADJUSTMENTS_NOT_ALLOWED = new AdjustmentErrorReason(_WEEKLY_MANUAL_ADJUSTMENTS_NOT_ALLOWED);
    public static final AdjustmentErrorReason TARGETING_OR_INVENTORY_UNIT_REQUIRED = new AdjustmentErrorReason(_TARGETING_OR_INVENTORY_UNIT_REQUIRED);
    public static final AdjustmentErrorReason CANNOT_CHANGE_ADJUSTMENT_TARGET_TYPE = new AdjustmentErrorReason(_CANNOT_CHANGE_ADJUSTMENT_TARGET_TYPE);
    public static final AdjustmentErrorReason OVERRIDES_NOT_ALLOWED_WITH_TARGETING = new AdjustmentErrorReason(_OVERRIDES_NOT_ALLOWED_WITH_TARGETING);
    public static final AdjustmentErrorReason INVALID_TARGETING_EXPRESSION = new AdjustmentErrorReason(_INVALID_TARGETING_EXPRESSION);
    public static final AdjustmentErrorReason ADJUSTMENT_NAME_MUST_BE_UNIQUE = new AdjustmentErrorReason(_ADJUSTMENT_NAME_MUST_BE_UNIQUE);
    public static final AdjustmentErrorReason END_DATE_TIME_IS_IN_PAST = new AdjustmentErrorReason(_END_DATE_TIME_IS_IN_PAST);
    public static final AdjustmentErrorReason HISTORICAL_TARGETING_REQUIRED = new AdjustmentErrorReason(_HISTORICAL_TARGETING_REQUIRED);
    public static final AdjustmentErrorReason INVALID_HISTORICAL_TARGETING = new AdjustmentErrorReason(_INVALID_HISTORICAL_TARGETING);
    public static final AdjustmentErrorReason AD_UNIT_REQUIRED = new AdjustmentErrorReason(_AD_UNIT_REQUIRED);
    public static final AdjustmentErrorReason TARGETING_REQUIRED = new AdjustmentErrorReason(_TARGETING_REQUIRED);
    public static final AdjustmentErrorReason UNKNOWN = new AdjustmentErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AdjustmentErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AdjustmentErrorReason enumeration = (AdjustmentErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AdjustmentErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AdjustmentErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202005", "AdjustmentError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
