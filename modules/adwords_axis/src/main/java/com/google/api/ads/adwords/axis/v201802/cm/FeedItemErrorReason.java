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
 * FeedItemErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;

public class FeedItemErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedItemErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CAMPAIGN_TARGETING_MISMATCH = "CAMPAIGN_TARGETING_MISMATCH";
    public static final java.lang.String _CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING = "CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING";
    public static final java.lang.String _CANNOT_OPERATE_ON_REMOVED_FEED_ITEM = "CANNOT_OPERATE_ON_REMOVED_FEED_ITEM";
    public static final java.lang.String _DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE = "DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE";
    public static final java.lang.String _KEY_ATTRIBUTES_NOT_FOUND = "KEY_ATTRIBUTES_NOT_FOUND";
    public static final java.lang.String _INVALID_DEVICE_PREFERENCE = "INVALID_DEVICE_PREFERENCE";
    public static final java.lang.String _INVALID_SCHEDULE_END = "INVALID_SCHEDULE_END";
    public static final java.lang.String _INVALID_URL = "INVALID_URL";
    public static final java.lang.String _MISSING_KEY_ATTRIBUTES = "MISSING_KEY_ATTRIBUTES";
    public static final java.lang.String _KEY_ATTRIBUTES_NOT_UNIQUE = "KEY_ATTRIBUTES_NOT_UNIQUE";
    public static final java.lang.String _CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE = "CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE";
    public static final java.lang.String _OVERLAPPING_SCHEDULES = "OVERLAPPING_SCHEDULES";
    public static final java.lang.String _SCHEDULE_END_NOT_AFTER_START = "SCHEDULE_END_NOT_AFTER_START";
    public static final java.lang.String _TOO_MANY_SCHEDULES_PER_DAY = "TOO_MANY_SCHEDULES_PER_DAY";
    public static final java.lang.String _SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE = "SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final FeedItemErrorReason CAMPAIGN_TARGETING_MISMATCH = new FeedItemErrorReason(_CAMPAIGN_TARGETING_MISMATCH);
    public static final FeedItemErrorReason CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING = new FeedItemErrorReason(_CANNOT_CONVERT_ATTRIBUTE_VALUE_FROM_STRING);
    public static final FeedItemErrorReason CANNOT_OPERATE_ON_REMOVED_FEED_ITEM = new FeedItemErrorReason(_CANNOT_OPERATE_ON_REMOVED_FEED_ITEM);
    public static final FeedItemErrorReason DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE = new FeedItemErrorReason(_DATE_TIME_MUST_BE_IN_ACCOUNT_TIME_ZONE);
    public static final FeedItemErrorReason KEY_ATTRIBUTES_NOT_FOUND = new FeedItemErrorReason(_KEY_ATTRIBUTES_NOT_FOUND);
    public static final FeedItemErrorReason INVALID_DEVICE_PREFERENCE = new FeedItemErrorReason(_INVALID_DEVICE_PREFERENCE);
    public static final FeedItemErrorReason INVALID_SCHEDULE_END = new FeedItemErrorReason(_INVALID_SCHEDULE_END);
    public static final FeedItemErrorReason INVALID_URL = new FeedItemErrorReason(_INVALID_URL);
    public static final FeedItemErrorReason MISSING_KEY_ATTRIBUTES = new FeedItemErrorReason(_MISSING_KEY_ATTRIBUTES);
    public static final FeedItemErrorReason KEY_ATTRIBUTES_NOT_UNIQUE = new FeedItemErrorReason(_KEY_ATTRIBUTES_NOT_UNIQUE);
    public static final FeedItemErrorReason CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE = new FeedItemErrorReason(_CANNOT_MODIFY_KEY_ATTRIBUTE_VALUE);
    public static final FeedItemErrorReason OVERLAPPING_SCHEDULES = new FeedItemErrorReason(_OVERLAPPING_SCHEDULES);
    public static final FeedItemErrorReason SCHEDULE_END_NOT_AFTER_START = new FeedItemErrorReason(_SCHEDULE_END_NOT_AFTER_START);
    public static final FeedItemErrorReason TOO_MANY_SCHEDULES_PER_DAY = new FeedItemErrorReason(_TOO_MANY_SCHEDULES_PER_DAY);
    public static final FeedItemErrorReason SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE = new FeedItemErrorReason(_SIZE_TOO_LARGE_FOR_MULTI_VALUE_ATTRIBUTE);
    public static final FeedItemErrorReason UNKNOWN = new FeedItemErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static FeedItemErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeedItemErrorReason enumeration = (FeedItemErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedItemErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedItemErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "FeedItemError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
