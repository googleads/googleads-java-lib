// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceSegmentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceSegmentError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED"/>
 *     &lt;enumeration value="ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED"/>
 *     &lt;enumeration value="AUDIENCE_SEGMENT_ID_NOT_FOUND"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_RULE"/>
 *     &lt;enumeration value="AUDIENCE_SEGMENT_RULE_TOO_LONG"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_NAME"/>
 *     &lt;enumeration value="DUPLICATE_AUDIENCE_SEGMENT_NAME"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_DESCRIPTION"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_PAGEVIEWS"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_RECENCY"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE"/>
 *     &lt;enumeration value="INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT"/>
 *     &lt;enumeration value="INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT"/>
 *     &lt;enumeration value="INACTIVE_NESTED_AUDIENCE_SEGMENT"/>
 *     &lt;enumeration value="AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AudienceSegmentError.Reason")
@XmlEnum
public enum AudienceSegmentErrorReason {


    /**
     * 
     *                 First party audience segment is not supported.
     *               
     * 
     */
    FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED,

    /**
     * 
     *                 Only rule-based first-party audience segments can be created.
     *               
     * 
     */
    ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED,

    /**
     * 
     *                 Audience segment for the given id is not found.
     *               
     * 
     */
    AUDIENCE_SEGMENT_ID_NOT_FOUND,

    /**
     * 
     *                 Audience segment rule is invalid.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_RULE,

    /**
     * 
     *                 Audience segment rule contains too many ad units and/or custom criteria.
     *               
     * 
     */
    AUDIENCE_SEGMENT_RULE_TOO_LONG,

    /**
     * 
     *                 Audience segment name is invalid.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_NAME,

    /**
     * 
     *                 Audience segment with this name already exists.
     *               
     * 
     */
    DUPLICATE_AUDIENCE_SEGMENT_NAME,

    /**
     * 
     *                 Audience segment description is invalid.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_DESCRIPTION,

    /**
     * 
     *                 Audience segment pageviews value is invalid. It must be between 1 and 12.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_PAGEVIEWS,

    /**
     * 
     *                 Audience segment recency value is invalid. It must be between 1 and 90 if pageviews > 1.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_RECENCY,

    /**
     * 
     *                 Audience segment membership expiration value is invalid. It must be between 1 and 180.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION,

    /**
     * 
     *                 The given custom key cannot be part of audience segment rule due to unsupported characters.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME,

    /**
     * 
     *                 The given custom value cannot be part of audience segment rule due to unsupported characters.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME,

    /**
     * 
     *                 Broad-match custom value cannot be part of audience segment rule.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE,

    /**
     * 
     *                 Audience segment rule cannot contain itself.
     *               
     * 
     */
    INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT,

    /**
     * 
     *                 Audience segment rule cannot contain a nested third-party segment.
     *               
     * 
     */
    INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT,

    /**
     * 
     *                 Audience segment rule cannot contain a nested inactive segment.
     *               
     * 
     */
    INACTIVE_NESTED_AUDIENCE_SEGMENT,

    /**
     * 
     *                 An error occured when purchasing global licenses.
     *               
     * 
     */
    AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AudienceSegmentErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
