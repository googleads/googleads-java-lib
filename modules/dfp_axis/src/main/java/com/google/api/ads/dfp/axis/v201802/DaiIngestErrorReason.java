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
 * DaiIngestErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;

public class DaiIngestErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DaiIngestErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_INGEST_URL = "INVALID_INGEST_URL";
    public static final java.lang.String _INVALID_CLOSED_CAPTION_URL = "INVALID_CLOSED_CAPTION_URL";
    public static final java.lang.String _MISSING_CLOSED_CAPTION_URL = "MISSING_CLOSED_CAPTION_URL";
    public static final java.lang.String _COULD_NOT_FETCH_HLS = "COULD_NOT_FETCH_HLS";
    public static final java.lang.String _COULD_NOT_FETCH_SUBTITLES = "COULD_NOT_FETCH_SUBTITLES";
    public static final java.lang.String _MISSING_SUBTITLE_LANGUAGE = "MISSING_SUBTITLE_LANGUAGE";
    public static final java.lang.String _COULD_NOT_FETCH_MEDIA = "COULD_NOT_FETCH_MEDIA";
    public static final java.lang.String _MALFORMED_MEDIA_BYTES = "MALFORMED_MEDIA_BYTES";
    public static final java.lang.String _CHAPTER_TIME_OUT_OF_BOUNDS = "CHAPTER_TIME_OUT_OF_BOUNDS";
    public static final java.lang.String _INTERNAL_ERROR = "INTERNAL_ERROR";
    public static final java.lang.String _CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS = "CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS";
    public static final java.lang.String _MALFORMED_MEDIA_PLAYLIST = "MALFORMED_MEDIA_PLAYLIST";
    public static final java.lang.String _MALFORMED_SUBTITLES = "MALFORMED_SUBTITLES";
    public static final java.lang.String _PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH = "PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH";
    public static final java.lang.String _COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED = "COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED";
    public static final java.lang.String _COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED = "COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED";
    public static final java.lang.String _COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED = "COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED";
    public static final java.lang.String _PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES = "PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES";
    public static final java.lang.String _PLAYIST_HAS_NO_STARTING_PTS_VALUE = "PLAYIST_HAS_NO_STARTING_PTS_VALUE";
    public static final java.lang.String _PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH = "PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH";
    public static final java.lang.String _SEGMENT_HAS_NO_PTS = "SEGMENT_HAS_NO_PTS";
    public static final java.lang.String _SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED = "SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED";
    public static final java.lang.String _CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE = "CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE";
    public static final java.lang.String _NO_CDN_CONFIGURATION_FOUND = "NO_CDN_CONFIGURATION_FOUND";
    public static final java.lang.String _CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG = "CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG";
    public static final java.lang.String _CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED = "CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED";
    public static final java.lang.String _ADTS_PARSE_ERROR = "ADTS_PARSE_ERROR";
    public static final java.lang.String _AAC_SPLIT_ERROR = "AAC_SPLIT_ERROR";
    public static final java.lang.String _AAC_PARSE_ERROR = "AAC_PARSE_ERROR";
    public static final java.lang.String _TS_PARSE_ERROR = "TS_PARSE_ERROR";
    public static final java.lang.String _TS_SPLIT_ERROR = "TS_SPLIT_ERROR";
    public static final java.lang.String _UNSUPPORTED_CONTAINER_FORMAT = "UNSUPPORTED_CONTAINER_FORMAT";
    public static final java.lang.String _UNSUPPORTED_TS_MEDIA_FORMAT = "UNSUPPORTED_TS_MEDIA_FORMAT";
    public static final java.lang.String _NO_IFRAMES_NEAR_CUE_POINT = "NO_IFRAMES_NEAR_CUE_POINT";
    public static final java.lang.String _AC3_SPLIT_ERROR = "AC3_SPLIT_ERROR";
    public static final java.lang.String _AC3_PARSE_ERROR = "AC3_PARSE_ERROR";
    public static final java.lang.String _EAC3_SPLIT_ERROR = "EAC3_SPLIT_ERROR";
    public static final java.lang.String _INVALID_ENCRYPTION_KEY = "INVALID_ENCRYPTION_KEY";
    public static final java.lang.String _EAC3_PARSE_ERROR = "EAC3_PARSE_ERROR";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final DaiIngestErrorReason INVALID_INGEST_URL = new DaiIngestErrorReason(_INVALID_INGEST_URL);
    public static final DaiIngestErrorReason INVALID_CLOSED_CAPTION_URL = new DaiIngestErrorReason(_INVALID_CLOSED_CAPTION_URL);
    public static final DaiIngestErrorReason MISSING_CLOSED_CAPTION_URL = new DaiIngestErrorReason(_MISSING_CLOSED_CAPTION_URL);
    public static final DaiIngestErrorReason COULD_NOT_FETCH_HLS = new DaiIngestErrorReason(_COULD_NOT_FETCH_HLS);
    public static final DaiIngestErrorReason COULD_NOT_FETCH_SUBTITLES = new DaiIngestErrorReason(_COULD_NOT_FETCH_SUBTITLES);
    public static final DaiIngestErrorReason MISSING_SUBTITLE_LANGUAGE = new DaiIngestErrorReason(_MISSING_SUBTITLE_LANGUAGE);
    public static final DaiIngestErrorReason COULD_NOT_FETCH_MEDIA = new DaiIngestErrorReason(_COULD_NOT_FETCH_MEDIA);
    public static final DaiIngestErrorReason MALFORMED_MEDIA_BYTES = new DaiIngestErrorReason(_MALFORMED_MEDIA_BYTES);
    public static final DaiIngestErrorReason CHAPTER_TIME_OUT_OF_BOUNDS = new DaiIngestErrorReason(_CHAPTER_TIME_OUT_OF_BOUNDS);
    public static final DaiIngestErrorReason INTERNAL_ERROR = new DaiIngestErrorReason(_INTERNAL_ERROR);
    public static final DaiIngestErrorReason CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS = new DaiIngestErrorReason(_CONTENT_HAS_CHAPTER_TIMES_BUT_NO_MIDROLL_SETTINGS);
    public static final DaiIngestErrorReason MALFORMED_MEDIA_PLAYLIST = new DaiIngestErrorReason(_MALFORMED_MEDIA_PLAYLIST);
    public static final DaiIngestErrorReason MALFORMED_SUBTITLES = new DaiIngestErrorReason(_MALFORMED_SUBTITLES);
    public static final DaiIngestErrorReason PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH = new DaiIngestErrorReason(_PLAYLIST_ITEM_URL_DOES_NOT_MATCH_INGEST_COMMON_PATH);
    public static final DaiIngestErrorReason COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED = new DaiIngestErrorReason(_COULD_NOT_UPLOAD_SPLIT_MEDIA_AUTHENTICATION_FAILED);
    public static final DaiIngestErrorReason COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED = new DaiIngestErrorReason(_COULD_NOT_UPLOAD_SPLIT_MEDIA_CONNECTION_FAILED);
    public static final DaiIngestErrorReason COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED = new DaiIngestErrorReason(_COULD_NOT_UPLOAD_SPLIT_MEDIA_WRITE_FAILED);
    public static final DaiIngestErrorReason PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES = new DaiIngestErrorReason(_PLAYLISTS_HAVE_DIFFERENT_NUMBER_OF_DISCONTINUITIES);
    public static final DaiIngestErrorReason PLAYIST_HAS_NO_STARTING_PTS_VALUE = new DaiIngestErrorReason(_PLAYIST_HAS_NO_STARTING_PTS_VALUE);
    public static final DaiIngestErrorReason PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH = new DaiIngestErrorReason(_PLAYLIST_DISCONTINUITY_PTS_VALUES_DIFFER_TOO_MUCH);
    public static final DaiIngestErrorReason SEGMENT_HAS_NO_PTS = new DaiIngestErrorReason(_SEGMENT_HAS_NO_PTS);
    public static final DaiIngestErrorReason SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED = new DaiIngestErrorReason(_SUBTITLE_LANGUAGE_DOES_NOT_MATCH_LANGUAGE_IN_FEED);
    public static final DaiIngestErrorReason CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE = new DaiIngestErrorReason(_CANNOT_DETERMINE_CORRECT_SUBTITLES_FOR_LANGUAGE);
    public static final DaiIngestErrorReason NO_CDN_CONFIGURATION_FOUND = new DaiIngestErrorReason(_NO_CDN_CONFIGURATION_FOUND);
    public static final DaiIngestErrorReason CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG = new DaiIngestErrorReason(_CONTENT_HAS_MIDROLLS_BUT_NO_SPLIT_CONTENT_CONFIG);
    public static final DaiIngestErrorReason CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED = new DaiIngestErrorReason(_CONTENT_HAS_MIDROLLS_BUT_SOURCE_HAS_MIDROLLS_DISABLED);
    public static final DaiIngestErrorReason ADTS_PARSE_ERROR = new DaiIngestErrorReason(_ADTS_PARSE_ERROR);
    public static final DaiIngestErrorReason AAC_SPLIT_ERROR = new DaiIngestErrorReason(_AAC_SPLIT_ERROR);
    public static final DaiIngestErrorReason AAC_PARSE_ERROR = new DaiIngestErrorReason(_AAC_PARSE_ERROR);
    public static final DaiIngestErrorReason TS_PARSE_ERROR = new DaiIngestErrorReason(_TS_PARSE_ERROR);
    public static final DaiIngestErrorReason TS_SPLIT_ERROR = new DaiIngestErrorReason(_TS_SPLIT_ERROR);
    public static final DaiIngestErrorReason UNSUPPORTED_CONTAINER_FORMAT = new DaiIngestErrorReason(_UNSUPPORTED_CONTAINER_FORMAT);
    public static final DaiIngestErrorReason UNSUPPORTED_TS_MEDIA_FORMAT = new DaiIngestErrorReason(_UNSUPPORTED_TS_MEDIA_FORMAT);
    public static final DaiIngestErrorReason NO_IFRAMES_NEAR_CUE_POINT = new DaiIngestErrorReason(_NO_IFRAMES_NEAR_CUE_POINT);
    public static final DaiIngestErrorReason AC3_SPLIT_ERROR = new DaiIngestErrorReason(_AC3_SPLIT_ERROR);
    public static final DaiIngestErrorReason AC3_PARSE_ERROR = new DaiIngestErrorReason(_AC3_PARSE_ERROR);
    public static final DaiIngestErrorReason EAC3_SPLIT_ERROR = new DaiIngestErrorReason(_EAC3_SPLIT_ERROR);
    public static final DaiIngestErrorReason INVALID_ENCRYPTION_KEY = new DaiIngestErrorReason(_INVALID_ENCRYPTION_KEY);
    public static final DaiIngestErrorReason EAC3_PARSE_ERROR = new DaiIngestErrorReason(_EAC3_PARSE_ERROR);
    public static final DaiIngestErrorReason UNKNOWN = new DaiIngestErrorReason(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static DaiIngestErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DaiIngestErrorReason enumeration = (DaiIngestErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DaiIngestErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DaiIngestErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DaiIngestErrorReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
