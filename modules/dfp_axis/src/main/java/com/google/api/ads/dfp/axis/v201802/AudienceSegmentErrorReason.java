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
 * AudienceSegmentErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class AudienceSegmentErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AudienceSegmentErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED = "FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED";
    public static final java.lang.String _ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED = "ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED";
    public static final java.lang.String _AUDIENCE_SEGMENT_ID_NOT_FOUND = "AUDIENCE_SEGMENT_ID_NOT_FOUND";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_RULE = "INVALID_AUDIENCE_SEGMENT_RULE";
    public static final java.lang.String _AUDIENCE_SEGMENT_RULE_TOO_LONG = "AUDIENCE_SEGMENT_RULE_TOO_LONG";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_NAME = "INVALID_AUDIENCE_SEGMENT_NAME";
    public static final java.lang.String _DUPLICATE_AUDIENCE_SEGMENT_NAME = "DUPLICATE_AUDIENCE_SEGMENT_NAME";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_DESCRIPTION = "INVALID_AUDIENCE_SEGMENT_DESCRIPTION";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_PAGEVIEWS = "INVALID_AUDIENCE_SEGMENT_PAGEVIEWS";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_RECENCY = "INVALID_AUDIENCE_SEGMENT_RECENCY";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION = "INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME = "INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME = "INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE = "INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE";
    public static final java.lang.String _INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT = "INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT";
    public static final java.lang.String _INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT = "INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT";
    public static final java.lang.String _INACTIVE_NESTED_AUDIENCE_SEGMENT = "INACTIVE_NESTED_AUDIENCE_SEGMENT";
    public static final java.lang.String _AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR = "AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final AudienceSegmentErrorReason FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED = new AudienceSegmentErrorReason(_FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED);
    public static final AudienceSegmentErrorReason ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED = new AudienceSegmentErrorReason(_ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED);
    public static final AudienceSegmentErrorReason AUDIENCE_SEGMENT_ID_NOT_FOUND = new AudienceSegmentErrorReason(_AUDIENCE_SEGMENT_ID_NOT_FOUND);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_RULE = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_RULE);
    public static final AudienceSegmentErrorReason AUDIENCE_SEGMENT_RULE_TOO_LONG = new AudienceSegmentErrorReason(_AUDIENCE_SEGMENT_RULE_TOO_LONG);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_NAME = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_NAME);
    public static final AudienceSegmentErrorReason DUPLICATE_AUDIENCE_SEGMENT_NAME = new AudienceSegmentErrorReason(_DUPLICATE_AUDIENCE_SEGMENT_NAME);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_DESCRIPTION = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_DESCRIPTION);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_PAGEVIEWS = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_PAGEVIEWS);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_RECENCY = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_RECENCY);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME);
    public static final AudienceSegmentErrorReason INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE = new AudienceSegmentErrorReason(_INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE);
    public static final AudienceSegmentErrorReason INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT = new AudienceSegmentErrorReason(_INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT);
    public static final AudienceSegmentErrorReason INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT = new AudienceSegmentErrorReason(_INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT);
    public static final AudienceSegmentErrorReason INACTIVE_NESTED_AUDIENCE_SEGMENT = new AudienceSegmentErrorReason(_INACTIVE_NESTED_AUDIENCE_SEGMENT);
    public static final AudienceSegmentErrorReason AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR = new AudienceSegmentErrorReason(_AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR);
    public static final AudienceSegmentErrorReason UNKNOWN = new AudienceSegmentErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static AudienceSegmentErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AudienceSegmentErrorReason enumeration = (AudienceSegmentErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AudienceSegmentErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AudienceSegmentErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AudienceSegmentError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
