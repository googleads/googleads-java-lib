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
 * DateTimeRangeTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class DateTimeRangeTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateTimeRangeTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EMPTY_RANGES = "EMPTY_RANGES";
    public static final java.lang.String _NOT_SPONSORSHIP_LINEITEM = "NOT_SPONSORSHIP_LINEITEM";
    public static final java.lang.String _PAST_RANGES_CHANGED = "PAST_RANGES_CHANGED";
    public static final java.lang.String _RANGES_OVERLAP = "RANGES_OVERLAP";
    public static final java.lang.String _RANGES_OUT_OF_LINEITEM_ACTIVE_PERIOD = "RANGES_OUT_OF_LINEITEM_ACTIVE_PERIOD";
    public static final java.lang.String _START_TIME_IS_NOT_START_OF_DAY = "START_TIME_IS_NOT_START_OF_DAY";
    public static final java.lang.String _END_TIME_IS_NOT_END_OF_DAY = "END_TIME_IS_NOT_END_OF_DAY";
    public static final java.lang.String _START_DATE_TIME_IS_IN_PAST = "START_DATE_TIME_IS_IN_PAST";
    public static final java.lang.String _RANGE_END_TIME_BEFORE_START_TIME = "RANGE_END_TIME_BEFORE_START_TIME";
    public static final java.lang.String _END_DATE_TIME_IS_TOO_LATE = "END_DATE_TIME_IS_TOO_LATE";
    public static final java.lang.String _LIMITED_RANGES_IN_UNLIMITED_LINEITEM = "LIMITED_RANGES_IN_UNLIMITED_LINEITEM";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DateTimeRangeTargetingErrorReason EMPTY_RANGES = new DateTimeRangeTargetingErrorReason(_EMPTY_RANGES);
    public static final DateTimeRangeTargetingErrorReason NOT_SPONSORSHIP_LINEITEM = new DateTimeRangeTargetingErrorReason(_NOT_SPONSORSHIP_LINEITEM);
    public static final DateTimeRangeTargetingErrorReason PAST_RANGES_CHANGED = new DateTimeRangeTargetingErrorReason(_PAST_RANGES_CHANGED);
    public static final DateTimeRangeTargetingErrorReason RANGES_OVERLAP = new DateTimeRangeTargetingErrorReason(_RANGES_OVERLAP);
    public static final DateTimeRangeTargetingErrorReason RANGES_OUT_OF_LINEITEM_ACTIVE_PERIOD = new DateTimeRangeTargetingErrorReason(_RANGES_OUT_OF_LINEITEM_ACTIVE_PERIOD);
    public static final DateTimeRangeTargetingErrorReason START_TIME_IS_NOT_START_OF_DAY = new DateTimeRangeTargetingErrorReason(_START_TIME_IS_NOT_START_OF_DAY);
    public static final DateTimeRangeTargetingErrorReason END_TIME_IS_NOT_END_OF_DAY = new DateTimeRangeTargetingErrorReason(_END_TIME_IS_NOT_END_OF_DAY);
    public static final DateTimeRangeTargetingErrorReason START_DATE_TIME_IS_IN_PAST = new DateTimeRangeTargetingErrorReason(_START_DATE_TIME_IS_IN_PAST);
    public static final DateTimeRangeTargetingErrorReason RANGE_END_TIME_BEFORE_START_TIME = new DateTimeRangeTargetingErrorReason(_RANGE_END_TIME_BEFORE_START_TIME);
    public static final DateTimeRangeTargetingErrorReason END_DATE_TIME_IS_TOO_LATE = new DateTimeRangeTargetingErrorReason(_END_DATE_TIME_IS_TOO_LATE);
    public static final DateTimeRangeTargetingErrorReason LIMITED_RANGES_IN_UNLIMITED_LINEITEM = new DateTimeRangeTargetingErrorReason(_LIMITED_RANGES_IN_UNLIMITED_LINEITEM);
    public static final DateTimeRangeTargetingErrorReason UNKNOWN = new DateTimeRangeTargetingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DateTimeRangeTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateTimeRangeTargetingErrorReason enumeration = (DateTimeRangeTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateTimeRangeTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DateTimeRangeTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTimeRangeTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
