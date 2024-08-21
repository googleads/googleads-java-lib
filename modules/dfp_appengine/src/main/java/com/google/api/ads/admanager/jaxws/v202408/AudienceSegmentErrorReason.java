// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceSegmentError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceSegmentError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIRST_PARTY_AUDIENCE_SEGMENT_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="ONLY_RULE_BASED_FIRST_PARTY_AUDIENCE_SEGMENTS_CAN_BE_CREATED"/&gt;
 *     &lt;enumeration value="AUDIENCE_SEGMENT_ID_NOT_FOUND"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_RULE"/&gt;
 *     &lt;enumeration value="AUDIENCE_SEGMENT_RULE_TOO_LONG"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_NAME"/&gt;
 *     &lt;enumeration value="DUPLICATE_AUDIENCE_SEGMENT_NAME"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_DESCRIPTION"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_PAGEVIEWS"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_RECENCY"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_MEMBERSHIP_EXPIRATION"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_CUSTOM_KEY_NAME"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_NAME"/&gt;
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENT_CUSTOM_VALUE_MATCH_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_NESTED_FIRST_PARTY_AUDIENCE_SEGMENT"/&gt;
 *     &lt;enumeration value="SHARED_SELLING_PARTNER_ROOT_CANNOT_BE_INCLUDED"/&gt;
 *     &lt;enumeration value="INVALID_NESTED_THIRD_PARTY_AUDIENCE_SEGMENT"/&gt;
 *     &lt;enumeration value="INACTIVE_NESTED_AUDIENCE_SEGMENT"/&gt;
 *     &lt;enumeration value="AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR"/&gt;
 *     &lt;enumeration value="SEGMENT_VIOLATED_POLICY"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     *                 Audience segment rule cannot contain shared selling inventory unit.
     *               
     * 
     */
    SHARED_SELLING_PARTNER_ROOT_CANNOT_BE_INCLUDED,

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
     *                 An error occurred when purchasing global licenses.
     *               
     * 
     */
    AUDIENCE_SEGMENT_GLOBAL_LICENSE_ERROR,

    /**
     * 
     *                 Segment cannot be activated as it violates Google's Platform Policy.
     *               
     * 
     */
    SEGMENT_VIOLATED_POLICY,

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
