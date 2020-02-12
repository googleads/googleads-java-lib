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


package com.google.api.ads.admanager.jaxws.v202002;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamErrorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERNAL_ERROR"/>
 *     &lt;enumeration value="AD_REQUEST_ERROR"/>
 *     &lt;enumeration value="VAST_PARSE_ERROR"/>
 *     &lt;enumeration value="UNSUPPORTED_AD_SYSTEM"/>
 *     &lt;enumeration value="CANNOT_FIND_UNIQUE_TRANSCODE_ID"/>
 *     &lt;enumeration value="CANNOT_FIND_MEDIA_FILE_PATH"/>
 *     &lt;enumeration value="MISSING_INLINE_ELEMENTS"/>
 *     &lt;enumeration value="MAX_WRAPPER_DEPTH_REACHED"/>
 *     &lt;enumeration value="INVALID_AD_SEQUENCE_NUMBER"/>
 *     &lt;enumeration value="FAILED_PING"/>
 *     &lt;enumeration value="AD_TAG_PARSE_ERROR"/>
 *     &lt;enumeration value="VMAP_PARSE_ERROR"/>
 *     &lt;enumeration value="INVALID_VMAP_RESPONSE"/>
 *     &lt;enumeration value="NO_AD_BREAKS_IN_VMAP"/>
 *     &lt;enumeration value="CUSTOM_AD_SOURCE_IN_VMAP"/>
 *     &lt;enumeration value="AD_BREAK_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="NEITHER_AD_SOURCE_NOR_TRACKING"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="AD_POD_DROPPED_TO_MANY_AD_PODS"/>
 *     &lt;enumeration value="AD_POD_DROPPED_EMPTY_ADS"/>
 *     &lt;enumeration value="AD_BREAK_WITHOUT_AD_POD"/>
 *     &lt;enumeration value="TRANSCODING_IN_PROGRESS"/>
 *     &lt;enumeration value="UNSUPPORTED_VAST_VERSION"/>
 *     &lt;enumeration value="AD_POD_DROPPED_BUMPER_ERROR"/>
 *     &lt;enumeration value="NO_VALID_MEDIAFILES_FOUND"/>
 *     &lt;enumeration value="EXCEEDS_MAX_FILLER"/>
 *     &lt;enumeration value="SKIPPABLE_AD_NOT_SUPPORTED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamErrorType")
@XmlEnum
public enum SamErrorType {

    INTERNAL_ERROR,
    AD_REQUEST_ERROR,
    VAST_PARSE_ERROR,
    UNSUPPORTED_AD_SYSTEM,
    CANNOT_FIND_UNIQUE_TRANSCODE_ID,
    CANNOT_FIND_MEDIA_FILE_PATH,
    MISSING_INLINE_ELEMENTS,
    MAX_WRAPPER_DEPTH_REACHED,
    INVALID_AD_SEQUENCE_NUMBER,
    FAILED_PING,
    AD_TAG_PARSE_ERROR,
    VMAP_PARSE_ERROR,
    INVALID_VMAP_RESPONSE,
    NO_AD_BREAKS_IN_VMAP,
    CUSTOM_AD_SOURCE_IN_VMAP,
    AD_BREAK_TYPE_NOT_SUPPORTED,
    NEITHER_AD_SOURCE_NOR_TRACKING,
    UNKNOWN_ERROR,
    AD_POD_DROPPED_TO_MANY_AD_PODS,
    AD_POD_DROPPED_EMPTY_ADS,
    AD_BREAK_WITHOUT_AD_POD,
    TRANSCODING_IN_PROGRESS,
    UNSUPPORTED_VAST_VERSION,
    AD_POD_DROPPED_BUMPER_ERROR,
    NO_VALID_MEDIAFILES_FOUND,
    EXCEEDS_MAX_FILLER,
    SKIPPABLE_AD_NOT_SUPPORTED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SamErrorType fromValue(String v) {
        return valueOf(v);
    }

}
