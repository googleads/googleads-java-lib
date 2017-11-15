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
 * <p>Java class for CustomTargetingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomTargetingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEY_NOT_FOUND"/>
 *     &lt;enumeration value="KEY_COUNT_TOO_LARGE"/>
 *     &lt;enumeration value="KEY_NAME_DUPLICATE"/>
 *     &lt;enumeration value="KEY_NAME_EMPTY"/>
 *     &lt;enumeration value="KEY_NAME_INVALID_LENGTH"/>
 *     &lt;enumeration value="KEY_NAME_INVALID_CHARS"/>
 *     &lt;enumeration value="KEY_NAME_RESERVED"/>
 *     &lt;enumeration value="KEY_DISPLAY_NAME_INVALID_LENGTH"/>
 *     &lt;enumeration value="VALUE_NOT_FOUND"/>
 *     &lt;enumeration value="GET_VALUES_BY_STATEMENT_MUST_CONTAIN_KEY_ID"/>
 *     &lt;enumeration value="VALUE_COUNT_FOR_KEY_TOO_LARGE"/>
 *     &lt;enumeration value="VALUE_NAME_DUPLICATE"/>
 *     &lt;enumeration value="VALUE_NAME_EMPTY"/>
 *     &lt;enumeration value="VALUE_NAME_INVALID_LENGTH"/>
 *     &lt;enumeration value="VALUE_NAME_INVALID_CHARS"/>
 *     &lt;enumeration value="VALUE_DISPLAY_NAME_INVALID_LENGTH"/>
 *     &lt;enumeration value="VALUE_MATCH_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="VALUE_MATCH_TYPE_NOT_EXACT_FOR_PREDEFINED_KEY"/>
 *     &lt;enumeration value="SUFFIX_MATCH_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="CONTAINS_MATCH_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="KEY_WITH_MISSING_VALUES"/>
 *     &lt;enumeration value="CANNOT_OR_DIFFERENT_KEYS"/>
 *     &lt;enumeration value="INVALID_TARGETING_EXPRESSION"/>
 *     &lt;enumeration value="DELETED_KEY_CANNOT_BE_USED_FOR_TARGETING"/>
 *     &lt;enumeration value="DELETED_VALUE_CANNOT_BE_USED_FOR_TARGETING"/>
 *     &lt;enumeration value="VIDEO_BROWSE_BY_KEY_CANNOT_BE_USED_FOR_CUSTOM_TARGETING"/>
 *     &lt;enumeration value="CANNOT_DELETE_CUSTOM_KEY_USED_IN_CONTENT_METADATA_MAPPING"/>
 *     &lt;enumeration value="CANNOT_DELETE_CUSTOM_VALUE_USED_IN_CONTENT_METADATA_MAPPING"/>
 *     &lt;enumeration value="CANNOT_DELETE_CUSTOM_KEY_USED_IN_PARTNER_ASSIGNMENT_TARGETING"/>
 *     &lt;enumeration value="CANNOT_DELETE_CUSTOM_VALUE_USED_IN_PARTNER_ASSIGNMENT_TARGETING"/>
 *     &lt;enumeration value="CANNOT_TARGET_AUDIENCE_SEGMENT"/>
 *     &lt;enumeration value="CANNOT_TARGET_INACTIVE_AUDIENCE_SEGMENT"/>
 *     &lt;enumeration value="INVALID_AUDIENCE_SEGMENTS"/>
 *     &lt;enumeration value="ONLY_APPROVED_AUDIENCE_SEGMENTS_CAN_BE_TARGETED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomTargetingError.Reason")
@XmlEnum
public enum CustomTargetingErrorReason {


    /**
     * 
     *                 Requested {@link CustomTargetingKey} is not found.
     *               
     * 
     */
    KEY_NOT_FOUND,

    /**
     * 
     *                 Number of {@link CustomTargetingKey} objects created exceeds the limit
     *                 allowed for the network.
     *               
     * 
     */
    KEY_COUNT_TOO_LARGE,

    /**
     * 
     *                 {@link CustomTargetingKey} with the same {@link CustomTargetingKey#name}
     *                 already exists.
     *               
     * 
     */
    KEY_NAME_DUPLICATE,

    /**
     * 
     *                 {@link CustomTargetingKey#name} is empty.
     *               
     * 
     */
    KEY_NAME_EMPTY,

    /**
     * 
     *                 {@link CustomTargetingKey#name} is too long.
     *               
     * 
     */
    KEY_NAME_INVALID_LENGTH,

    /**
     * 
     *                 {@link CustomTargetingKey#name} contains unsupported or reserved
     *                 characters.
     *               
     * 
     */
    KEY_NAME_INVALID_CHARS,

    /**
     * 
     *                 {@link CustomTargetingKey#name} matches one of the reserved custom
     *                 targeting key names.
     *               
     * 
     */
    KEY_NAME_RESERVED,

    /**
     * 
     *                 {@link CustomTargetingKey#displayName} is too long.
     *               
     * 
     */
    KEY_DISPLAY_NAME_INVALID_LENGTH,

    /**
     * 
     *                 Requested {@link CustomTargetingValue} is not found.
     *               
     * 
     */
    VALUE_NOT_FOUND,

    /**
     * 
     *                 The {@code WHERE} clause in the {@link Statement#query} must always
     *                 contain {@link CustomTargetingValue#customTargetingKeyId} as one of its
     *                 columns in a way that it is AND'ed with the rest of the query.
     *               
     * 
     */
    GET_VALUES_BY_STATEMENT_MUST_CONTAIN_KEY_ID,

    /**
     * 
     *                 The number of {@link CustomTargetingValue} objects associated with a
     *                 {@link CustomTargetingKey} exceeds the network limit. This is only
     *                 applicable for keys of type {@code CustomTargetingKey.Type#PREDEFINED}.
     *               
     * 
     */
    VALUE_COUNT_FOR_KEY_TOO_LARGE,

    /**
     * 
     *                 {@link CustomTargetingValue} with the same
     *                 {@link CustomTargetingValue#name} already exists.
     *               
     * 
     */
    VALUE_NAME_DUPLICATE,

    /**
     * 
     *                 {@link CustomTargetingValue#name} is empty.
     *               
     * 
     */
    VALUE_NAME_EMPTY,

    /**
     * 
     *                 {@link CustomTargetingValue#name} is too long.
     *               
     * 
     */
    VALUE_NAME_INVALID_LENGTH,

    /**
     * 
     *                 {@link CustomTargetingValue#name} contains unsupported or reserved
     *                 characters.
     *               
     * 
     */
    VALUE_NAME_INVALID_CHARS,

    /**
     * 
     *                 {@link CustomTargetingValue#displayName} is too long.
     *               
     * 
     */
    VALUE_DISPLAY_NAME_INVALID_LENGTH,

    /**
     * 
     *                 Only DFP Premium networks can have {@link CustomTargetingValue#matchType}
     *                 other than {@link CustomTargetingValue.MatchType#EXACT}.
     *               
     * 
     */
    VALUE_MATCH_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 You can only create {@link CustomTargetingValue} objects with match type
     *                 {@link CustomTargetingValue.MatchType#EXACT} when associating
     *                 with {@link CustomTargetingKey} objects of type
     *                 {@link CustomTargetingKey.Type#PREDEFINED}
     *               
     * 
     */
    VALUE_MATCH_TYPE_NOT_EXACT_FOR_PREDEFINED_KEY,

    /**
     * 
     *                 {@link CustomTargetingValue} object cannot have match type of
     *                 {@link CustomTargetingValue.MatchType#SUFFIX} when adding a
     *                 {@link CustomTargetingValue} to a line item.
     *               
     * 
     */
    SUFFIX_MATCH_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 {@link CustomTargetingValue} object cannot have match type of
     *                 {@link CustomTargetingValue.MatchType#CONTAINS} when adding a
     *                 {@link CustomTargetingValue} to targeting expression of a line item.
     *               
     * 
     */
    CONTAINS_MATCH_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The {@link CustomTargetingKey} does not have any
     *                 {@link CustomTargetingValue} associated with it.
     *               
     * 
     */
    KEY_WITH_MISSING_VALUES,

    /**
     * 
     *                 {@link CustomCriteriaSet.LogicalOperator#OR} operation cannot be applied
     *                 to values with different keys.
     *               
     * 
     */
    CANNOT_OR_DIFFERENT_KEYS,

    /**
     * 
     *                 Targeting expression is invalid. This can happen if the sequence of
     *                 operators is wrong, or a node contains invalid number of children.
     *               
     * 
     */
    INVALID_TARGETING_EXPRESSION,

    /**
     * 
     *                 The key has been deleted. {@link CustomCriteria} cannot have deleted
     *                 keys.
     *               
     * 
     */
    DELETED_KEY_CANNOT_BE_USED_FOR_TARGETING,

    /**
     * 
     *                 The value has been deleted. {@link CustomCriteria} cannot have deleted
     *                 values.
     *               
     * 
     */
    DELETED_VALUE_CANNOT_BE_USED_FOR_TARGETING,

    /**
     * 
     *                 The key is set as the video browse-by key, which cannot be used for
     *                 custom targeting.
     *               
     * 
     */
    VIDEO_BROWSE_BY_KEY_CANNOT_BE_USED_FOR_CUSTOM_TARGETING,

    /**
     * 
     *                 Only active custom-criteria keys are supported in content metadata mapping.
     *               
     * 
     */
    CANNOT_DELETE_CUSTOM_KEY_USED_IN_CONTENT_METADATA_MAPPING,

    /**
     * 
     *                 Only active custom-criteria values are supported in content metadata mapping.
     *               
     * 
     */
    CANNOT_DELETE_CUSTOM_VALUE_USED_IN_CONTENT_METADATA_MAPPING,

    /**
     * 
     *                 Cannot delete a custom criteria key that is targeted by an active partner assignment.
     *               
     * 
     */
    CANNOT_DELETE_CUSTOM_KEY_USED_IN_PARTNER_ASSIGNMENT_TARGETING,

    /**
     * 
     *                 Cannot delete a custom criteria value that is targeted by an active partner assignment.
     *               
     * 
     */
    CANNOT_DELETE_CUSTOM_VALUE_USED_IN_PARTNER_ASSIGNMENT_TARGETING,

    /**
     * 
     *                 {@link AudienceSegment} object cannot be targeted.
     *               
     * 
     */
    CANNOT_TARGET_AUDIENCE_SEGMENT,

    /**
     * 
     *                 Inactive {@link AudienceSegment} object cannot be targeted.
     *               
     * 
     */
    CANNOT_TARGET_INACTIVE_AUDIENCE_SEGMENT,

    /**
     * 
     *                 Targeted {@link AudienceSegment} object is not valid.
     *               
     * 
     */
    INVALID_AUDIENCE_SEGMENTS,

    /**
     * 
     *                 Targeted {@link AudienceSegment} objects have not been approved.
     *               
     * 
     */
    ONLY_APPROVED_AUDIENCE_SEGMENTS_CAN_BE_TARGETED,

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

    public static CustomTargetingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
