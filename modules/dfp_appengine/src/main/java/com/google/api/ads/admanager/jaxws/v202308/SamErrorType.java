// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamErrorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamErrorType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTERNAL_ERROR"/&gt;
 *     &lt;enumeration value="AD_REQUEST_ERROR"/&gt;
 *     &lt;enumeration value="VAST_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_AD_SYSTEM"/&gt;
 *     &lt;enumeration value="CANNOT_FIND_UNIQUE_TRANSCODE_ID"/&gt;
 *     &lt;enumeration value="CANNOT_FIND_MEDIA_FILE_PATH"/&gt;
 *     &lt;enumeration value="MISSING_INLINE_ELEMENTS"/&gt;
 *     &lt;enumeration value="MAX_WRAPPER_DEPTH_REACHED"/&gt;
 *     &lt;enumeration value="INVALID_AD_SEQUENCE_NUMBER"/&gt;
 *     &lt;enumeration value="FAILED_PING"/&gt;
 *     &lt;enumeration value="AD_TAG_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="VMAP_PARSE_ERROR"/&gt;
 *     &lt;enumeration value="INVALID_VMAP_RESPONSE"/&gt;
 *     &lt;enumeration value="NO_AD_BREAKS_IN_VMAP"/&gt;
 *     &lt;enumeration value="CUSTOM_AD_SOURCE_IN_VMAP"/&gt;
 *     &lt;enumeration value="AD_BREAK_TYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="NEITHER_AD_SOURCE_NOR_TRACKING"/&gt;
 *     &lt;enumeration value="UNKNOWN_ERROR"/&gt;
 *     &lt;enumeration value="AD_POD_DROPPED_TO_MANY_AD_PODS"/&gt;
 *     &lt;enumeration value="AD_POD_DROPPED_EMPTY_ADS"/&gt;
 *     &lt;enumeration value="AD_BREAK_WITHOUT_AD_POD"/&gt;
 *     &lt;enumeration value="TRANSCODING_IN_PROGRESS"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_VAST_VERSION"/&gt;
 *     &lt;enumeration value="AD_POD_DROPPED_BUMPER_ERROR"/&gt;
 *     &lt;enumeration value="NO_VALID_MEDIAFILES_FOUND"/&gt;
 *     &lt;enumeration value="EXCEEDS_MAX_FILLER"/&gt;
 *     &lt;enumeration value="SKIPPABLE_AD_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="AD_REQUEST_TIMEOUT"/&gt;
 *     &lt;enumeration value="AD_POD_DROPPED_UNSUPPORTED_TYPE"/&gt;
 *     &lt;enumeration value="DUPLICATE_AD_TAG"/&gt;
 *     &lt;enumeration value="FOLLOW_REDIRECTS_IS_FALSE"/&gt;
 *     &lt;enumeration value="AD_POD_DROPPED_INCOMPATIBLE_TIMEOFFSET"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
    AD_REQUEST_TIMEOUT,
    AD_POD_DROPPED_UNSUPPORTED_TYPE,
    DUPLICATE_AD_TAG,
    FOLLOW_REDIRECTS_IS_FALSE,
    AD_POD_DROPPED_INCOMPATIBLE_TIMEOFFSET,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SamErrorType fromValue(String v) {
        return valueOf(v);
    }

}
