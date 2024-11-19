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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpSettingsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpSettingsError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INVALID_AGE_RANGE"/&gt;
 *     &lt;enumeration value="UNDER_18_MIN_AGE_REQUIRES_ALL_AGES"/&gt;
 *     &lt;enumeration value="LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="NIELSEN_DAR_REQUIRES_INSTREAM_VIDEO"/&gt;
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE"/&gt;
 *     &lt;enumeration value="INVALID_MIN_AGE"/&gt;
 *     &lt;enumeration value="INVALID_MAX_AGE"/&gt;
 *     &lt;enumeration value="CANNOT_DISABLE_GRP_AFTER_ENABLING"/&gt;
 *     &lt;enumeration value="CANNOT_CHANGE_GRP_PROVIDERS"/&gt;
 *     &lt;enumeration value="CANNOT_CHANGE_GRP_SETTINGS"/&gt;
 *     &lt;enumeration value="GRP_AUDIENCE_GOAL_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="DEMOG_GOAL_EXPECTED"/&gt;
 *     &lt;enumeration value="CANNOT_SET_GRP_AUDIENCE_GOAL"/&gt;
 *     &lt;enumeration value="CANNOT_REMOVE_GRP_AUDIENCE_GOAL"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_GEO_TARGETING"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_GRP_SETTING"/&gt;
 *     &lt;enumeration value="SHOULD_SET_IN_TARGET_GOAL_THROUGH_GRP_SETTINGS"/&gt;
 *     &lt;enumeration value="SHOULD_SET_IN_TARGET_GOAL_THROUGH_PRIMARY_GOAL"/&gt;
 *     &lt;enumeration value="NIELSEN_REGISTRATION_FAILED"/&gt;
 *     &lt;enumeration value="LEGACY_NIELSEN_CAMPAIGN_REGISTRATION_ATTEMPT"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GrpSettingsError.Reason")
@XmlEnum
public enum GrpSettingsErrorReason {


    /**
     * 
     *                 Age range for GRP audience is not valid. Please see the
     *                 <a href="https://support.google.com/admanager/answer/6135438">Ad Manager Help Center</a>
     *                 for more information.
     *               
     * 
     */
    INVALID_AGE_RANGE,

    /**
     * 
     *                 Age range for GRP audience is not allowed to include ages under 18 unless designating all
     *                 ages in target(2-65+).
     *               
     * 
     */
    UNDER_18_MIN_AGE_REQUIRES_ALL_AGES,

    /**
     * 
     *                 GRP settings are only supported for video line items.
     *               
     * 
     */
    LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 For deals with Nielsen DAR enabled, there must be an instream video environment.
     *               
     * 
     */
    NIELSEN_DAR_REQUIRES_INSTREAM_VIDEO,

    /**
     * 
     *                 GRP settings are not supported for the given line item type.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 GRP audience gender cannot be specified for the selected age range.
     *               
     * 
     */
    CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE,

    /**
     * 
     *                 Minimum age for GRP audience is not valid.
     *               
     * 
     */
    INVALID_MIN_AGE,

    /**
     * 
     *                 Maximum age for GRP audience is not valid.
     *               
     * 
     */
    INVALID_MAX_AGE,

    /**
     * 
     *                 GRP settings cannot be disabled.
     *               
     * 
     */
    CANNOT_DISABLE_GRP_AFTER_ENABLING,

    /**
     * 
     *                 GRP provider cannot be updated.
     *               
     * 
     */
    CANNOT_CHANGE_GRP_PROVIDERS,

    /**
     * 
     *                 GRP settings cannot be updated once the line item has started serving.
     *               
     * 
     */
    CANNOT_CHANGE_GRP_SETTINGS,

    /**
     * 
     *                 Impression goal based on GRP audience is not supported.
     *               
     * 
     */
    GRP_AUDIENCE_GOAL_NOT_SUPPORTED,

    /**
     * 
     *                 Impression goal based on GRP audience expected.
     *               
     * 
     */
    DEMOG_GOAL_EXPECTED,

    /**
     * 
     *                 Impression goal based on GRP audience cannot be set once the line item has started serving.
     *               
     * 
     */
    CANNOT_SET_GRP_AUDIENCE_GOAL,

    /**
     * 
     *                 Impression goal based on GRP audience cannot be removed once the line item has started
     *                 serving.
     *               
     * 
     */
    CANNOT_REMOVE_GRP_AUDIENCE_GOAL,

    /**
     * 
     *                 Unsupported geographic location targeted for line item with GRP audience goal.
     *               
     * 
     */
    UNSUPPORTED_GEO_TARGETING,

    /**
     * 
     *                 GRP Settings specified are unsupported.
     *               
     * 
     */
    UNSUPPORTED_GRP_SETTING,

    /**
     * 
     *                 In-target line items should be set through the grpSettings target impression goal.
     *               
     * 
     */
    SHOULD_SET_IN_TARGET_GOAL_THROUGH_GRP_SETTINGS,

    /**
     * 
     *                 In-target line items should be set through the primaryReservationUnit's in-target Impressions
     *                 unit type.
     *               
     * 
     */
    SHOULD_SET_IN_TARGET_GOAL_THROUGH_PRIMARY_GOAL,

    /**
     * 
     *                 Attempt to register with Nielsen failed.
     *               
     * 
     */
    NIELSEN_REGISTRATION_FAILED,

    /**
     * 
     *                 Attempted to register a placement on a legacy Nielsen campaign.
     *               
     * 
     */
    LEGACY_NIELSEN_CAMPAIGN_REGISTRATION_ATTEMPT,

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

    public static GrpSettingsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
