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
 * <p>Java class for CampaignError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CANNOT_GO_BACK_TO_INCOMPLETE"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_NETWORK"/>
 *     &lt;enumeration value="CANNOT_TARGET_SEARCH_NETWORK"/>
 *     &lt;enumeration value="CANNOT_TARGET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH"/>
 *     &lt;enumeration value="CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN"/>
 *     &lt;enumeration value="CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NETWORK"/>
 *     &lt;enumeration value="CANNOT_TARGET_PARTNER_SEARCH_NETWORK"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CAMPAIGN_DURATION_MUST_CONTAIN_ALL_RUNNABLE_TRIALS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_FOR_TRIAL_CAMPAIGN"/>
 *     &lt;enumeration value="DUPLICATE_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INCOMPATIBLE_CAMPAIGN_FIELD"/>
 *     &lt;enumeration value="INVALID_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INVALID_AD_SERVING_OPTIMIZATION_STATUS"/>
 *     &lt;enumeration value="INVALID_TRACKING_URL"/>
 *     &lt;enumeration value="CANNOT_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACKING_SETTING"/>
 *     &lt;enumeration value="MAX_IMPRESSIONS_NOT_IN_RANGE"/>
 *     &lt;enumeration value="TIME_UNIT_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED"/>
 *     &lt;enumeration value="BUDGET_CANNOT_BE_SHARED"/>
 *     &lt;enumeration value="CAMPAIGN_CANNOT_USE_SHARED_BUDGET"/>
 *     &lt;enumeration value="CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS"/>
 *     &lt;enumeration value="CAMPAIGN_LABEL_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="CAMPAIGN_LABEL_ALREADY_EXISTS"/>
 *     &lt;enumeration value="MISSING_SHOPPING_SETTING"/>
 *     &lt;enumeration value="INVALID_SHOPPING_SALES_COUNTRY"/>
 *     &lt;enumeration value="SHOPPING_MERCHANT_NOT_ALLOWED_FOR_PURCHASES_ON_GOOGLE"/>
 *     &lt;enumeration value="PURCHASES_ON_GOOGLE_NOT_SUPPORTED_FOR_SHOPPING_SALES_COUNTRY"/>
 *     &lt;enumeration value="MISSING_UNIVERSAL_APP_CAMPAIGN_SETTING"/>
 *     &lt;enumeration value="ADVERTISING_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE"/>
 *     &lt;enumeration value="INVALID_ADVERTISING_CHANNEL_SUB_TYPE"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED"/>
 *     &lt;enumeration value="CANNOT_SET_AD_ROTATION_MODE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignError.Reason")
@XmlEnum
public enum CampaignErrorReason {


    /**
     * 
     *                 A complete campaign cannot go back to being incomplete
     *               
     * 
     */
    CANNOT_GO_BACK_TO_INCOMPLETE,

    /**
     * 
     *                 Cannot target content network.
     *               
     * 
     */
    CANNOT_TARGET_CONTENT_NETWORK,

    /**
     * 
     *                 Cannot target search network.
     *               
     * 
     */
    CANNOT_TARGET_SEARCH_NETWORK,

    /**
     * 
     *                 Cannot cover search network without google search network.
     *               
     * 
     */
    CANNOT_TARGET_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH,

    /**
     * 
     *                 Cannot target Google Search network for a CPM campaign.
     *               
     * 
     */
    CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_CAMPAIGN,

    /**
     * 
     *                 Must target at least one network.
     *               
     * 
     */
    CAMPAIGN_MUST_TARGET_AT_LEAST_ONE_NETWORK,

    /**
     * 
     *                 Only some Google partners are allowed to target partner search network.
     *               
     * 
     */
    CANNOT_TARGET_PARTNER_SEARCH_NETWORK,

    /**
     * 
     *                 Cannot target content network only as campaign has criteria-level bidding strategy.
     *               
     * 
     */
    CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BIDDING_STRATEGY,

    /**
     * 
     *                 Cannot modify the start or end date such that the campaign duration would not contain the
     *                 durations of all runnable trials.
     *               
     * 
     */
    CAMPAIGN_DURATION_MUST_CONTAIN_ALL_RUNNABLE_TRIALS,

    /**
     * 
     *                 Cannot modify dates, budget or campaign name of a trial campaign.
     *               
     * 
     */
    CANNOT_MODIFY_FOR_TRIAL_CAMPAIGN,

    /**
     * 
     *                 Trying to modify the name of an active or paused campaign, where the name is already
     *                 assigned to another active or paused campaign.
     *               
     * 
     */
    DUPLICATE_CAMPAIGN_NAME,

    /**
     * 
     *                 Two fields are in conflicting modes.
     *               
     * 
     */
    INCOMPATIBLE_CAMPAIGN_FIELD,

    /**
     * 
     *                 Campaign name cannot be used.
     *               
     * 
     */
    INVALID_CAMPAIGN_NAME,

    /**
     * 
     *                 Given status is invalid.
     *               
     * 
     */
    INVALID_AD_SERVING_OPTIMIZATION_STATUS,

    /**
     * 
     *                 Error in the campaign level tracking url.
     *               
     * 
     */
    INVALID_TRACKING_URL,

    /**
     * 
     *                 Cannot set both tracking url template and tracking setting. An user has to clear legacy
     *                 tracking setting in order to add tracking url template.
     *               
     * 
     */
    CANNOT_SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACKING_SETTING,

    /**
     * 
     *                 The maximum number of impressions for Frequency Cap should be an integer greater than 0.
     *               
     * 
     */
    MAX_IMPRESSIONS_NOT_IN_RANGE,

    /**
     * 
     *                 Only the Day, Week and Month time units are supported.
     *               
     * 
     */
    TIME_UNIT_NOT_SUPPORTED,

    /**
     * 
     *                 Operation not allowed on a campaign whose serving status has ended
     *               
     * 
     */
    INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED,

    /**
     * 
     *                 This budget is exclusively linked to a Campaign that is using @link{Experiment}s
     *                 so it cannot be shared.
     *               
     * 
     */
    BUDGET_CANNOT_BE_SHARED,

    /**
     * 
     *                 Campaigns using @link{Experiment}s cannot use a shared budget.
     *               
     * 
     */
    CAMPAIGN_CANNOT_USE_SHARED_BUDGET,

    /**
     * 
     *                 A different budget cannot be assigned to a campaign when there are running or scheduled
     *                 trials.
     *               
     * 
     */
    CANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRIALS,

    /**
     * 
     *                 No link found between the campaign and the label.
     *               
     * 
     */
    CAMPAIGN_LABEL_DOES_NOT_EXIST,

    /**
     * 
     *                 The label has already been attached to the campaign.
     *               
     * 
     */
    CAMPAIGN_LABEL_ALREADY_EXISTS,

    /**
     * 
     *                 A ShoppingSetting was not found when creating a shopping campaign.
     *               
     * 
     */
    MISSING_SHOPPING_SETTING,

    /**
     * 
     *                 The country in shopping setting is not an allowed country.
     *               
     * 
     */
    INVALID_SHOPPING_SALES_COUNTRY,

    /**
     * 
     *                 Shopping merchant is not enabled for Purchases on Google.
     *               
     * 
     */
    SHOPPING_MERCHANT_NOT_ALLOWED_FOR_PURCHASES_ON_GOOGLE,

    /**
     * 
     *                 Purchases on Google not enabled for the shopping campaign's sales country.
     *               
     * 
     */
    PURCHASES_ON_GOOGLE_NOT_SUPPORTED_FOR_SHOPPING_SALES_COUNTRY,

    /**
     * 
     *                 A Campaign with channel sub type UNIVERSAL_APP_CAMPAIGN must have a
     *                 UniversalAppCampaignSetting specified.
     *               
     * 
     */
    MISSING_UNIVERSAL_APP_CAMPAIGN_SETTING,

    /**
     * 
     *                 The requested channel type is not available according to the customer's account setting.
     *               
     * 
     */
    ADVERTISING_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_TYPE,

    /**
     * 
     *                 The AdvertisingChannelSubType is not a valid subtype of the primary channel type.
     *               
     * 
     */
    INVALID_ADVERTISING_CHANNEL_SUB_TYPE,

    /**
     * 
     *                 At least one conversion must be selected.
     *               
     * 
     */
    AT_LEAST_ONE_CONVERSION_MUST_BE_SELECTED,

    /**
     * 
     *                 Setting ad rotation mode for a campaign is not allowed.
     *                 Ad rotation mode at campaign is deprecated.
     *               
     * 
     */
    CANNOT_SET_AD_ROTATION_MODE,

    /**
     * 
     *                 Default error
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static CampaignErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
