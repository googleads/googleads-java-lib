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
 * CustomTargetingErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class CustomTargetingErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CustomTargetingErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _KEY_NOT_FOUND = "KEY_NOT_FOUND";
    public static final java.lang.String _KEY_COUNT_TOO_LARGE = "KEY_COUNT_TOO_LARGE";
    public static final java.lang.String _KEY_NAME_DUPLICATE = "KEY_NAME_DUPLICATE";
    public static final java.lang.String _KEY_NAME_EMPTY = "KEY_NAME_EMPTY";
    public static final java.lang.String _KEY_NAME_INVALID_LENGTH = "KEY_NAME_INVALID_LENGTH";
    public static final java.lang.String _KEY_NAME_INVALID_CHARS = "KEY_NAME_INVALID_CHARS";
    public static final java.lang.String _KEY_NAME_RESERVED = "KEY_NAME_RESERVED";
    public static final java.lang.String _KEY_DISPLAY_NAME_INVALID_LENGTH = "KEY_DISPLAY_NAME_INVALID_LENGTH";
    public static final java.lang.String _VALUE_NOT_FOUND = "VALUE_NOT_FOUND";
    public static final java.lang.String _GET_VALUES_BY_STATEMENT_MUST_CONTAIN_KEY_ID = "GET_VALUES_BY_STATEMENT_MUST_CONTAIN_KEY_ID";
    public static final java.lang.String _VALUE_COUNT_FOR_KEY_TOO_LARGE = "VALUE_COUNT_FOR_KEY_TOO_LARGE";
    public static final java.lang.String _VALUE_NAME_DUPLICATE = "VALUE_NAME_DUPLICATE";
    public static final java.lang.String _VALUE_NAME_EMPTY = "VALUE_NAME_EMPTY";
    public static final java.lang.String _VALUE_NAME_INVALID_LENGTH = "VALUE_NAME_INVALID_LENGTH";
    public static final java.lang.String _VALUE_NAME_INVALID_CHARS = "VALUE_NAME_INVALID_CHARS";
    public static final java.lang.String _VALUE_DISPLAY_NAME_INVALID_LENGTH = "VALUE_DISPLAY_NAME_INVALID_LENGTH";
    public static final java.lang.String _VALUE_MATCH_TYPE_NOT_ALLOWED = "VALUE_MATCH_TYPE_NOT_ALLOWED";
    public static final java.lang.String _VALUE_MATCH_TYPE_NOT_EXACT_FOR_PREDEFINED_KEY = "VALUE_MATCH_TYPE_NOT_EXACT_FOR_PREDEFINED_KEY";
    public static final java.lang.String _SUFFIX_MATCH_TYPE_NOT_ALLOWED = "SUFFIX_MATCH_TYPE_NOT_ALLOWED";
    public static final java.lang.String _CONTAINS_MATCH_TYPE_NOT_ALLOWED = "CONTAINS_MATCH_TYPE_NOT_ALLOWED";
    public static final java.lang.String _KEY_WITH_MISSING_VALUES = "KEY_WITH_MISSING_VALUES";
    public static final java.lang.String _CANNOT_OR_DIFFERENT_KEYS = "CANNOT_OR_DIFFERENT_KEYS";
    public static final java.lang.String _INVALID_TARGETING_EXPRESSION = "INVALID_TARGETING_EXPRESSION";
    public static final java.lang.String _DELETED_KEY_CANNOT_BE_USED_FOR_TARGETING = "DELETED_KEY_CANNOT_BE_USED_FOR_TARGETING";
    public static final java.lang.String _DELETED_VALUE_CANNOT_BE_USED_FOR_TARGETING = "DELETED_VALUE_CANNOT_BE_USED_FOR_TARGETING";
    public static final java.lang.String _VIDEO_BROWSE_BY_KEY_CANNOT_BE_USED_FOR_CUSTOM_TARGETING = "VIDEO_BROWSE_BY_KEY_CANNOT_BE_USED_FOR_CUSTOM_TARGETING";
    public static final java.lang.String _CANNOT_DELETE_CUSTOM_KEY_USED_IN_CONTENT_METADATA_MAPPING = "CANNOT_DELETE_CUSTOM_KEY_USED_IN_CONTENT_METADATA_MAPPING";
    public static final java.lang.String _CANNOT_DELETE_CUSTOM_VALUE_USED_IN_CONTENT_METADATA_MAPPING = "CANNOT_DELETE_CUSTOM_VALUE_USED_IN_CONTENT_METADATA_MAPPING";
    public static final java.lang.String _CANNOT_DELETE_CUSTOM_KEY_USED_IN_PARTNER_ASSIGNMENT_TARGETING = "CANNOT_DELETE_CUSTOM_KEY_USED_IN_PARTNER_ASSIGNMENT_TARGETING";
    public static final java.lang.String _CANNOT_DELETE_CUSTOM_VALUE_USED_IN_PARTNER_ASSIGNMENT_TARGETING = "CANNOT_DELETE_CUSTOM_VALUE_USED_IN_PARTNER_ASSIGNMENT_TARGETING";
    public static final java.lang.String _CANNOT_TARGET_AUDIENCE_SEGMENT = "CANNOT_TARGET_AUDIENCE_SEGMENT";
    public static final java.lang.String _CANNOT_TARGET_INACTIVE_AUDIENCE_SEGMENT = "CANNOT_TARGET_INACTIVE_AUDIENCE_SEGMENT";
    public static final java.lang.String _INVALID_AUDIENCE_SEGMENTS = "INVALID_AUDIENCE_SEGMENTS";
    public static final java.lang.String _ONLY_APPROVED_AUDIENCE_SEGMENTS_CAN_BE_TARGETED = "ONLY_APPROVED_AUDIENCE_SEGMENTS_CAN_BE_TARGETED";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final CustomTargetingErrorReason KEY_NOT_FOUND = new CustomTargetingErrorReason(_KEY_NOT_FOUND);
    public static final CustomTargetingErrorReason KEY_COUNT_TOO_LARGE = new CustomTargetingErrorReason(_KEY_COUNT_TOO_LARGE);
    public static final CustomTargetingErrorReason KEY_NAME_DUPLICATE = new CustomTargetingErrorReason(_KEY_NAME_DUPLICATE);
    public static final CustomTargetingErrorReason KEY_NAME_EMPTY = new CustomTargetingErrorReason(_KEY_NAME_EMPTY);
    public static final CustomTargetingErrorReason KEY_NAME_INVALID_LENGTH = new CustomTargetingErrorReason(_KEY_NAME_INVALID_LENGTH);
    public static final CustomTargetingErrorReason KEY_NAME_INVALID_CHARS = new CustomTargetingErrorReason(_KEY_NAME_INVALID_CHARS);
    public static final CustomTargetingErrorReason KEY_NAME_RESERVED = new CustomTargetingErrorReason(_KEY_NAME_RESERVED);
    public static final CustomTargetingErrorReason KEY_DISPLAY_NAME_INVALID_LENGTH = new CustomTargetingErrorReason(_KEY_DISPLAY_NAME_INVALID_LENGTH);
    public static final CustomTargetingErrorReason VALUE_NOT_FOUND = new CustomTargetingErrorReason(_VALUE_NOT_FOUND);
    public static final CustomTargetingErrorReason GET_VALUES_BY_STATEMENT_MUST_CONTAIN_KEY_ID = new CustomTargetingErrorReason(_GET_VALUES_BY_STATEMENT_MUST_CONTAIN_KEY_ID);
    public static final CustomTargetingErrorReason VALUE_COUNT_FOR_KEY_TOO_LARGE = new CustomTargetingErrorReason(_VALUE_COUNT_FOR_KEY_TOO_LARGE);
    public static final CustomTargetingErrorReason VALUE_NAME_DUPLICATE = new CustomTargetingErrorReason(_VALUE_NAME_DUPLICATE);
    public static final CustomTargetingErrorReason VALUE_NAME_EMPTY = new CustomTargetingErrorReason(_VALUE_NAME_EMPTY);
    public static final CustomTargetingErrorReason VALUE_NAME_INVALID_LENGTH = new CustomTargetingErrorReason(_VALUE_NAME_INVALID_LENGTH);
    public static final CustomTargetingErrorReason VALUE_NAME_INVALID_CHARS = new CustomTargetingErrorReason(_VALUE_NAME_INVALID_CHARS);
    public static final CustomTargetingErrorReason VALUE_DISPLAY_NAME_INVALID_LENGTH = new CustomTargetingErrorReason(_VALUE_DISPLAY_NAME_INVALID_LENGTH);
    public static final CustomTargetingErrorReason VALUE_MATCH_TYPE_NOT_ALLOWED = new CustomTargetingErrorReason(_VALUE_MATCH_TYPE_NOT_ALLOWED);
    public static final CustomTargetingErrorReason VALUE_MATCH_TYPE_NOT_EXACT_FOR_PREDEFINED_KEY = new CustomTargetingErrorReason(_VALUE_MATCH_TYPE_NOT_EXACT_FOR_PREDEFINED_KEY);
    public static final CustomTargetingErrorReason SUFFIX_MATCH_TYPE_NOT_ALLOWED = new CustomTargetingErrorReason(_SUFFIX_MATCH_TYPE_NOT_ALLOWED);
    public static final CustomTargetingErrorReason CONTAINS_MATCH_TYPE_NOT_ALLOWED = new CustomTargetingErrorReason(_CONTAINS_MATCH_TYPE_NOT_ALLOWED);
    public static final CustomTargetingErrorReason KEY_WITH_MISSING_VALUES = new CustomTargetingErrorReason(_KEY_WITH_MISSING_VALUES);
    public static final CustomTargetingErrorReason CANNOT_OR_DIFFERENT_KEYS = new CustomTargetingErrorReason(_CANNOT_OR_DIFFERENT_KEYS);
    public static final CustomTargetingErrorReason INVALID_TARGETING_EXPRESSION = new CustomTargetingErrorReason(_INVALID_TARGETING_EXPRESSION);
    public static final CustomTargetingErrorReason DELETED_KEY_CANNOT_BE_USED_FOR_TARGETING = new CustomTargetingErrorReason(_DELETED_KEY_CANNOT_BE_USED_FOR_TARGETING);
    public static final CustomTargetingErrorReason DELETED_VALUE_CANNOT_BE_USED_FOR_TARGETING = new CustomTargetingErrorReason(_DELETED_VALUE_CANNOT_BE_USED_FOR_TARGETING);
    public static final CustomTargetingErrorReason VIDEO_BROWSE_BY_KEY_CANNOT_BE_USED_FOR_CUSTOM_TARGETING = new CustomTargetingErrorReason(_VIDEO_BROWSE_BY_KEY_CANNOT_BE_USED_FOR_CUSTOM_TARGETING);
    public static final CustomTargetingErrorReason CANNOT_DELETE_CUSTOM_KEY_USED_IN_CONTENT_METADATA_MAPPING = new CustomTargetingErrorReason(_CANNOT_DELETE_CUSTOM_KEY_USED_IN_CONTENT_METADATA_MAPPING);
    public static final CustomTargetingErrorReason CANNOT_DELETE_CUSTOM_VALUE_USED_IN_CONTENT_METADATA_MAPPING = new CustomTargetingErrorReason(_CANNOT_DELETE_CUSTOM_VALUE_USED_IN_CONTENT_METADATA_MAPPING);
    public static final CustomTargetingErrorReason CANNOT_DELETE_CUSTOM_KEY_USED_IN_PARTNER_ASSIGNMENT_TARGETING = new CustomTargetingErrorReason(_CANNOT_DELETE_CUSTOM_KEY_USED_IN_PARTNER_ASSIGNMENT_TARGETING);
    public static final CustomTargetingErrorReason CANNOT_DELETE_CUSTOM_VALUE_USED_IN_PARTNER_ASSIGNMENT_TARGETING = new CustomTargetingErrorReason(_CANNOT_DELETE_CUSTOM_VALUE_USED_IN_PARTNER_ASSIGNMENT_TARGETING);
    public static final CustomTargetingErrorReason CANNOT_TARGET_AUDIENCE_SEGMENT = new CustomTargetingErrorReason(_CANNOT_TARGET_AUDIENCE_SEGMENT);
    public static final CustomTargetingErrorReason CANNOT_TARGET_INACTIVE_AUDIENCE_SEGMENT = new CustomTargetingErrorReason(_CANNOT_TARGET_INACTIVE_AUDIENCE_SEGMENT);
    public static final CustomTargetingErrorReason INVALID_AUDIENCE_SEGMENTS = new CustomTargetingErrorReason(_INVALID_AUDIENCE_SEGMENTS);
    public static final CustomTargetingErrorReason ONLY_APPROVED_AUDIENCE_SEGMENTS_CAN_BE_TARGETED = new CustomTargetingErrorReason(_ONLY_APPROVED_AUDIENCE_SEGMENTS_CAN_BE_TARGETED);
    public static final CustomTargetingErrorReason UNKNOWN = new CustomTargetingErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static CustomTargetingErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CustomTargetingErrorReason enumeration = (CustomTargetingErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CustomTargetingErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CustomTargetingErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CustomTargetingError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
