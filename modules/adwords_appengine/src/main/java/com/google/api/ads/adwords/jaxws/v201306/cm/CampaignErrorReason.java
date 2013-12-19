
package com.google.api.ads.adwords.jaxws.v201306.cm;

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
 *     &lt;enumeration value="AFTER_MAXIMUM_ALLOWABLE_DATE"/>
 *     &lt;enumeration value="CANNOT_GO_BACK_TO_INCOMPLETE"/>
 *     &lt;enumeration value="CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED"/>
 *     &lt;enumeration value="CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE"/>
 *     &lt;enumeration value="CANNOT_SET_DATE_TO_PAST"/>
 *     &lt;enumeration value="CANNOT_SET_POSITION_PREFERENCE_IF_NOT_SEARCH_TARGETED"/>
 *     &lt;enumeration value="CURRENCY_NOT_VALID_FOR_ACCOUNT"/>
 *     &lt;enumeration value="DUPLICATE_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INCOMPATIBLE_CAMPAIGN_FIELD"/>
 *     &lt;enumeration value="INVALID_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INVALID_AD_SERVING_OPTIMIZATION_STATUS"/>
 *     &lt;enumeration value="INVALID_TRACKING_URL"/>
 *     &lt;enumeration value="KEYWORD_QUOTA_EXCEEDED"/>
 *     &lt;enumeration value="MAX_IMPRESSIONS_NOT_IN_RANGE"/>
 *     &lt;enumeration value="START_DATE_AFTER_END_DATE"/>
 *     &lt;enumeration value="TIME_UNIT_NOT_SUPPORTED"/>
 *     &lt;enumeration value="USE_BIDDING_TRANSITION_FIELD_INSTEAD_TO_SWITCH_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_CHANGE_CAMPAIGN_TYPE"/>
 *     &lt;enumeration value="INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED"/>
 *     &lt;enumeration value="CANNOT_CHANGE_TV_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_ADD_CAMPAIGN_WITH_CONVERSION_OPTIMIZER_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="BUDGET_CANNOT_BE_SHARED"/>
 *     &lt;enumeration value="CANNOT_SET_BUDGET"/>
 *     &lt;enumeration value="CAMPAIGN_CANNOT_USE_SHARED_BUDGET"/>
 *     &lt;enumeration value="MUST_SPECIFY_KEYWORD_MATCH_SETTINGS"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED_WITH_BID_MODIFIER"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE"/>
 *     &lt;enumeration value="CANNOT_UNSET_ENHANCED_CAMPAIGN"/>
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
     *                 A date was used that is past the system "last" date.
     *               
     * 
     */
    AFTER_MAXIMUM_ALLOWABLE_DATE,

    /**
     * 
     *                 A complete campaign cannot go back to being incomplete
     *               
     * 
     */
    CANNOT_GO_BACK_TO_INCOMPLETE,

    /**
     * 
     *                 Trying to change start date on a campaign that has started.
     *               
     * 
     */
    CANNOT_MODIFY_START_DATE_IF_ALREADY_STARTED,

    /**
     * 
     *                 Trying to modify an end date before an active experiment end date.
     *               
     * 
     */
    CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE,

    /**
     * 
     *                 Trying to modify a date into the past.
     *               
     * 
     */
    CANNOT_SET_DATE_TO_PAST,

    /**
     * 
     *                 The campaign is not search targeted to enable position preference
     *               
     * 
     */
    CANNOT_SET_POSITION_PREFERENCE_IF_NOT_SEARCH_TARGETED,

    /**
     * 
     *                 A currency was specified other than the account currency.
     *               
     * 
     */
    CURRENCY_NOT_VALID_FOR_ACCOUNT,

    /**
     * 
     *                 Trying to modify name of campaign to one already assigned to another campaign.
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
     *                 Customer keyword quota has been exceeded.
     *               
     * 
     */
    KEYWORD_QUOTA_EXCEEDED,

    /**
     * 
     *                 The maximum number of impressions for Frequency Cap should be an integer greater than 0.
     *               
     * 
     */
    MAX_IMPRESSIONS_NOT_IN_RANGE,

    /**
     * 
     *                 The campaign start date was after the campaign end date.
     *               
     * 
     */
    START_DATE_AFTER_END_DATE,

    /**
     * 
     *                 Only the Day, Week and Month time units are supported.
     *               
     * 
     */
    TIME_UNIT_NOT_SUPPORTED,

    /**
     * 
     *                 Bidding strategy field was set to a value other than the current bidding
     *                 strategy of the campaign
     *               
     * 
     */
    USE_BIDDING_TRANSITION_FIELD_INSTEAD_TO_SWITCH_BIDDING_STRATEGY,

    /**
     * 
     *                 Changing campaignType is not allowed
     *               
     * 
     */
    CANNOT_CHANGE_CAMPAIGN_TYPE,

    /**
     * 
     *                 Operation not allowed on a campaign whose serving status has ended
     *               
     * 
     */
    INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED,

    /**
     * 
     *                 Modifying TV Campaigns is not allowed
     *               
     * 
     */
    CANNOT_CHANGE_TV_CAMPAIGN,

    /**
     * 
     *                 Cannot add a campaign with conversion optimizer turned on
     *               
     * 
     */
    CANNOT_ADD_CAMPAIGN_WITH_CONVERSION_OPTIMIZER_BIDDING_STRATEGY,

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
     *                 Campaigns with percent cpa bidding strategy do not have budgets
     *               
     * 
     */
    CANNOT_SET_BUDGET,

    /**
     * 
     *                 Campaigns using @link{Experiment}s cannot use a shared budget.
     *               
     * 
     */
    CAMPAIGN_CANNOT_USE_SHARED_BUDGET,

    /**
     * 
     *                 All new campaigns must specify KeywordMatchSetting
     *               
     * 
     */
    MUST_SPECIFY_KEYWORD_MATCH_SETTINGS,

    /**
     * 
     *                 The strategy is not supported when there are campaign criteria with bid modifiers.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_WITH_BID_MODIFIER,

    /**
     * 
     *                 Budget Optimizer bidding strategy is not supported for AdSchedule targets.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE,

    /**
     * 
     *                 Enhanced campaign cannot be unset.
     *               
     * 
     */
    CANNOT_UNSET_ENHANCED_CAMPAIGN,

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
