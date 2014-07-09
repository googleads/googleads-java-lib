
package com.google.api.ads.adwords.jaxws.v201406.cm;

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
 *     &lt;enumeration value="CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE"/>
 *     &lt;enumeration value="DUPLICATE_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INCOMPATIBLE_CAMPAIGN_FIELD"/>
 *     &lt;enumeration value="INVALID_CAMPAIGN_NAME"/>
 *     &lt;enumeration value="INVALID_AD_SERVING_OPTIMIZATION_STATUS"/>
 *     &lt;enumeration value="INVALID_TRACKING_URL"/>
 *     &lt;enumeration value="MAX_IMPRESSIONS_NOT_IN_RANGE"/>
 *     &lt;enumeration value="TIME_UNIT_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_OPERATION_IF_SERVING_STATUS_HAS_ENDED"/>
 *     &lt;enumeration value="BUDGET_CANNOT_BE_SHARED"/>
 *     &lt;enumeration value="CANNOT_SET_BUDGET"/>
 *     &lt;enumeration value="CAMPAIGN_CANNOT_USE_SHARED_BUDGET"/>
 *     &lt;enumeration value="CAMPAIGN_LABEL_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="CAMPAIGN_LABEL_ALREADY_EXISTS"/>
 *     &lt;enumeration value="MUST_SPECIFY_KEYWORD_MATCH_SETTINGS"/>
 *     &lt;enumeration value="MISSING_SHOPPING_SETTING"/>
 *     &lt;enumeration value="INVALID_SHOPPING_SALES_COUNTRY"/>
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
     *                 Trying to modify an end date before an active experiment end date.
     *               
     * 
     */
    CANNOT_SET_END_DATE_BEFORE_EXPERIMENT_END_DATE,

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
     *                 All new campaigns must specify KeywordMatchSetting
     *               
     * 
     */
    MUST_SPECIFY_KEYWORD_MATCH_SETTINGS,

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
