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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettingError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettingError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DUPLICATE_SETTING_TYPE"/>
 *     &lt;enumeration value="SETTING_TYPE_IS_NOT_AVAILABLE"/>
 *     &lt;enumeration value="SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN"/>
 *     &lt;enumeration value="TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP"/>
 *     &lt;enumeration value="TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL"/>
 *     &lt;enumeration value="TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP"/>
 *     &lt;enumeration value="DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT"/>
 *     &lt;enumeration value="DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME"/>
 *     &lt;enumeration value="DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME"/>
 *     &lt;enumeration value="DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE"/>
 *     &lt;enumeration value="TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN"/>
 *     &lt;enumeration value="UNIVERSAL_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIPTION"/>
 *     &lt;enumeration value="UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTION_LINE_WIDTH_TOO_LONG"/>
 *     &lt;enumeration value="UNIVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODIFIED"/>
 *     &lt;enumeration value="TOO_MANY_YOUTUBE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN"/>
 *     &lt;enumeration value="TOO_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN"/>
 *     &lt;enumeration value="MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP_CAMPAIGN"/>
 *     &lt;enumeration value="TOO_MANY_EXCLAMATION_MARKS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SettingError.Reason")
@XmlEnum
public enum SettingErrorReason {


    /**
     * 
     *                 The campaign already has a setting of the type that is being added.
     *               
     * 
     */
    DUPLICATE_SETTING_TYPE,

    /**
     * 
     *                 The campaign setting is not available for this AdWords account.
     *               
     * 
     */
    SETTING_TYPE_IS_NOT_AVAILABLE,

    /**
     * 
     *                 The setting is not compatible with the campaign.
     *               
     * 
     */
    SETTING_TYPE_IS_NOT_COMPATIBLE_WITH_CAMPAIGN,

    /**
     * 
     *                 The supplied TargetingSetting contains an invalid CriterionTypeGroup. See
     *                 {@link CriterionTypeGroup} documentation for CriterionTypeGroups allowed in Campaign or
     *                 AdGroup TargetingSettings.
     *               
     * 
     */
    TARGETING_SETTING_CONTAINS_INVALID_CRITERION_TYPE_GROUP,

    /**
     * 
     *                 Starting with AdWords API v201802, TargetingSetting must not explicitly set any of the
     *                 Demographic CriterionTypeGroups (AGE_RANGE, GENDER, PARENT, INCOME_RANGE) to false (it's
     *                 okay to not set them at all, in which case the system will set them to true automatically).
     *               
     * 
     */
    TARGETING_SETTING_DEMOGRAPHIC_CRITERION_TYPE_GROUPS_MUST_BE_SET_TO_TARGET_ALL,

    /**
     * 
     *                 Starting with AdWords API v201802,TargetingSetting cannot change any of the Demographic
     *                 CriterionTypeGroups (AGE_RANGE, GENDER, PARENT, INCOME_RANGE) from true to false.
     *               
     * 
     */
    TARGETING_SETTING_CANNOT_CHANGE_TARGET_ALL_TO_FALSE_FOR_DEMOGRAPHIC_CRITERION_TYPE_GROUP,

    /**
     * 
     *                 At least one feed id should be present.
     *               
     * 
     */
    DYNAMIC_SEARCH_ADS_SETTING_AT_LEAST_ONE_FEED_ID_MUST_BE_PRESENT,

    /**
     * 
     *                 The supplied DynamicSearchAdsSetting contains an invalid domain name.
     *               
     * 
     */
    DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_DOMAIN_NAME,

    /**
     * 
     *                 The supplied DynamicSearchAdsSetting contains a subdomain name.
     *               
     * 
     */
    DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_SUBDOMAIN_NAME,

    /**
     * 
     *                 The supplied DynamicSearchAdsSetting contains an invalid language code.
     *               
     * 
     */
    DYNAMIC_SEARCH_ADS_SETTING_CONTAINS_INVALID_LANGUAGE_CODE,

    /**
     * 
     *                 TargetingSettings in search campaigns should not have CriterionTypeGroup.PLACEMENT
     *                 set to targetAll.
     *               
     * 
     */
    TARGET_ALL_IS_NOT_ALLOWED_FOR_PLACEMENT_IN_SEARCH_CAMPAIGN,

    /**
     * 
     *                 Duplicate description in universal app setting description field.
     *               
     * 
     */
    UNIVERSAL_APP_CAMPAIGN_SETTING_DUPLICATE_DESCRIPTION,

    /**
     * 
     *                 Description line width is too long in universal app setting description field.
     *               
     * 
     */
    UNIVERSAL_APP_CAMPAIGN_SETTING_DESCRIPTION_LINE_WIDTH_TOO_LONG,

    /**
     * 
     *                 Universal app setting appId field cannot be modified for COMPLETE campaigns.
     *               
     * 
     */
    UNIVERSAL_APP_CAMPAIGN_SETTING_APP_ID_CANNOT_BE_MODIFIED,

    /**
     * 
     *                 YoutubeVideoMediaIds in universal app setting cannot exceed size limit.
     *               
     * 
     */
    TOO_MANY_YOUTUBE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN,

    /**
     * 
     *                 ImageMediaIds in universal app setting cannot exceed size limit.
     *               
     * 
     */
    TOO_MANY_IMAGE_MEDIA_IDS_IN_UNIVERSAL_APP_CAMPAIGN,

    /**
     * 
     *                 Media is incompatible for universal app campaign.
     *               
     * 
     */
    MEDIA_INCOMPATIBLE_FOR_UNIVERSAL_APP_CAMPAIGN,

    /**
     * 
     *                 Too many exclamation marks in universal app campaign ad text ideas.
     *               
     * 
     */
    TOO_MANY_EXCLAMATION_MARKS,

    /**
     * 
     *                 Unspecified campaign setting error.
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static SettingErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
