// Copyright 2022 Google LLC
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
 * SamErrorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202211;

public class SamErrorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SamErrorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _AD_REQUEST_ERROR = "AD_REQUEST_ERROR";
    public static final java.lang.String _VAST_PARSE_ERROR = "VAST_PARSE_ERROR";
    public static final java.lang.String _UNSUPPORTED_AD_SYSTEM = "UNSUPPORTED_AD_SYSTEM";
    public static final java.lang.String _CANNOT_FIND_UNIQUE_TRANSCODE_ID = "CANNOT_FIND_UNIQUE_TRANSCODE_ID";
    public static final java.lang.String _CANNOT_FIND_MEDIA_FILE_PATH = "CANNOT_FIND_MEDIA_FILE_PATH";
    public static final java.lang.String _MISSING_INLINE_ELEMENTS = "MISSING_INLINE_ELEMENTS";
    public static final java.lang.String _MAX_WRAPPER_DEPTH_REACHED = "MAX_WRAPPER_DEPTH_REACHED";
    public static final java.lang.String _INVALID_AD_SEQUENCE_NUMBER = "INVALID_AD_SEQUENCE_NUMBER";
    public static final java.lang.String _FAILED_PING = "FAILED_PING";
    public static final java.lang.String _AD_TAG_PARSE_ERROR = "AD_TAG_PARSE_ERROR";
    public static final java.lang.String _VMAP_PARSE_ERROR = "VMAP_PARSE_ERROR";
    public static final java.lang.String _INVALID_VMAP_RESPONSE = "INVALID_VMAP_RESPONSE";
    public static final java.lang.String _NO_AD_BREAKS_IN_VMAP = "NO_AD_BREAKS_IN_VMAP";
    public static final java.lang.String _CUSTOM_AD_SOURCE_IN_VMAP = "CUSTOM_AD_SOURCE_IN_VMAP";
    public static final java.lang.String _AD_BREAK_TYPE_NOT_SUPPORTED = "AD_BREAK_TYPE_NOT_SUPPORTED";
    public static final java.lang.String _NEITHER_AD_SOURCE_NOR_TRACKING = "NEITHER_AD_SOURCE_NOR_TRACKING";
    public static final java.lang.String _UNKNOWN_ERROR = "UNKNOWN_ERROR";
    public static final java.lang.String _AD_POD_DROPPED_TO_MANY_AD_PODS = "AD_POD_DROPPED_TO_MANY_AD_PODS";
    public static final java.lang.String _AD_POD_DROPPED_EMPTY_ADS = "AD_POD_DROPPED_EMPTY_ADS";
    public static final java.lang.String _AD_BREAK_WITHOUT_AD_POD = "AD_BREAK_WITHOUT_AD_POD";
    public static final java.lang.String _TRANSCODING_IN_PROGRESS = "TRANSCODING_IN_PROGRESS";
    public static final java.lang.String _UNSUPPORTED_VAST_VERSION = "UNSUPPORTED_VAST_VERSION";
    public static final java.lang.String _AD_POD_DROPPED_BUMPER_ERROR = "AD_POD_DROPPED_BUMPER_ERROR";
    public static final java.lang.String _NO_VALID_MEDIAFILES_FOUND = "NO_VALID_MEDIAFILES_FOUND";
    public static final java.lang.String _EXCEEDS_MAX_FILLER = "EXCEEDS_MAX_FILLER";
    public static final java.lang.String _SKIPPABLE_AD_NOT_SUPPORTED = "SKIPPABLE_AD_NOT_SUPPORTED";
    public static final java.lang.String _AD_REQUEST_TIMEOUT = "AD_REQUEST_TIMEOUT";
    public static final java.lang.String _AD_POD_DROPPED_UNSUPPORTED_TYPE = "AD_POD_DROPPED_UNSUPPORTED_TYPE";
    public static final java.lang.String _DUPLICATE_AD_TAG = "DUPLICATE_AD_TAG";
    public static final java.lang.String _FOLLOW_REDIRECTS_IS_FALSE = "FOLLOW_REDIRECTS_IS_FALSE";
    public static final java.lang.String _AD_POD_DROPPED_INCOMPATIBLE_TIMEOFFSET = "AD_POD_DROPPED_INCOMPATIBLE_TIMEOFFSET";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SamErrorType INTERNAL_ERROR = new SamErrorType(_INTERNAL_ERROR);
    public static final SamErrorType AD_REQUEST_ERROR = new SamErrorType(_AD_REQUEST_ERROR);
    public static final SamErrorType VAST_PARSE_ERROR = new SamErrorType(_VAST_PARSE_ERROR);
    public static final SamErrorType UNSUPPORTED_AD_SYSTEM = new SamErrorType(_UNSUPPORTED_AD_SYSTEM);
    public static final SamErrorType CANNOT_FIND_UNIQUE_TRANSCODE_ID = new SamErrorType(_CANNOT_FIND_UNIQUE_TRANSCODE_ID);
    public static final SamErrorType CANNOT_FIND_MEDIA_FILE_PATH = new SamErrorType(_CANNOT_FIND_MEDIA_FILE_PATH);
    public static final SamErrorType MISSING_INLINE_ELEMENTS = new SamErrorType(_MISSING_INLINE_ELEMENTS);
    public static final SamErrorType MAX_WRAPPER_DEPTH_REACHED = new SamErrorType(_MAX_WRAPPER_DEPTH_REACHED);
    public static final SamErrorType INVALID_AD_SEQUENCE_NUMBER = new SamErrorType(_INVALID_AD_SEQUENCE_NUMBER);
    public static final SamErrorType FAILED_PING = new SamErrorType(_FAILED_PING);
    public static final SamErrorType AD_TAG_PARSE_ERROR = new SamErrorType(_AD_TAG_PARSE_ERROR);
    public static final SamErrorType VMAP_PARSE_ERROR = new SamErrorType(_VMAP_PARSE_ERROR);
    public static final SamErrorType INVALID_VMAP_RESPONSE = new SamErrorType(_INVALID_VMAP_RESPONSE);
    public static final SamErrorType NO_AD_BREAKS_IN_VMAP = new SamErrorType(_NO_AD_BREAKS_IN_VMAP);
    public static final SamErrorType CUSTOM_AD_SOURCE_IN_VMAP = new SamErrorType(_CUSTOM_AD_SOURCE_IN_VMAP);
    public static final SamErrorType AD_BREAK_TYPE_NOT_SUPPORTED = new SamErrorType(_AD_BREAK_TYPE_NOT_SUPPORTED);
    public static final SamErrorType NEITHER_AD_SOURCE_NOR_TRACKING = new SamErrorType(_NEITHER_AD_SOURCE_NOR_TRACKING);
    public static final SamErrorType UNKNOWN_ERROR = new SamErrorType(_UNKNOWN_ERROR);
    public static final SamErrorType AD_POD_DROPPED_TO_MANY_AD_PODS = new SamErrorType(_AD_POD_DROPPED_TO_MANY_AD_PODS);
    public static final SamErrorType AD_POD_DROPPED_EMPTY_ADS = new SamErrorType(_AD_POD_DROPPED_EMPTY_ADS);
    public static final SamErrorType AD_BREAK_WITHOUT_AD_POD = new SamErrorType(_AD_BREAK_WITHOUT_AD_POD);
    public static final SamErrorType TRANSCODING_IN_PROGRESS = new SamErrorType(_TRANSCODING_IN_PROGRESS);
    public static final SamErrorType UNSUPPORTED_VAST_VERSION = new SamErrorType(_UNSUPPORTED_VAST_VERSION);
    public static final SamErrorType AD_POD_DROPPED_BUMPER_ERROR = new SamErrorType(_AD_POD_DROPPED_BUMPER_ERROR);
    public static final SamErrorType NO_VALID_MEDIAFILES_FOUND = new SamErrorType(_NO_VALID_MEDIAFILES_FOUND);
    public static final SamErrorType EXCEEDS_MAX_FILLER = new SamErrorType(_EXCEEDS_MAX_FILLER);
    public static final SamErrorType SKIPPABLE_AD_NOT_SUPPORTED = new SamErrorType(_SKIPPABLE_AD_NOT_SUPPORTED);
    public static final SamErrorType AD_REQUEST_TIMEOUT = new SamErrorType(_AD_REQUEST_TIMEOUT);
    public static final SamErrorType AD_POD_DROPPED_UNSUPPORTED_TYPE = new SamErrorType(_AD_POD_DROPPED_UNSUPPORTED_TYPE);
    public static final SamErrorType DUPLICATE_AD_TAG = new SamErrorType(_DUPLICATE_AD_TAG);
    public static final SamErrorType FOLLOW_REDIRECTS_IS_FALSE = new SamErrorType(_FOLLOW_REDIRECTS_IS_FALSE);
    public static final SamErrorType AD_POD_DROPPED_INCOMPATIBLE_TIMEOFFSET = new SamErrorType(_AD_POD_DROPPED_INCOMPATIBLE_TIMEOFFSET);
    public static final SamErrorType UNKNOWN = new SamErrorType(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SamErrorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SamErrorType enumeration = (SamErrorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SamErrorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SamErrorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202211", "SamErrorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
