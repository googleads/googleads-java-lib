
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingTransitionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingTransitionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BID_TO_POSITION_ENABLED"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE"/>
 *     &lt;enumeration value="BUDGET_OPTIMIZER_IS_ENABLED"/>
 *     &lt;enumeration value="CONVERSION_OPTIMIZER_IS_ENABLED"/>
 *     &lt;enumeration value="CONVERSION_TRACKING_NOT_ENABLED"/>
 *     &lt;enumeration value="CONVERSION_TRACKING_NOT_AVAILABLE_FOR_ACCOUNT_TYPE"/>
 *     &lt;enumeration value="USE_POSITION_PREFERENCE_IN_MANUALCPC_INSTEAD_TO_DISABLE_POSITION_PREFERENCE"/>
 *     &lt;enumeration value="INVALID_BID"/>
 *     &lt;enumeration value="CANNOT_SET_EXPLICIT_BID"/>
 *     &lt;enumeration value="EXPLICIT_BID_REQUIRED_FOR_TRANSITION"/>
 *     &lt;enumeration value="EXPLICIT_BID_TYPE_DOES_NOT_MATCH_CAMPAIGN_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="MISSING_REQUIRED_BID"/>
 *     &lt;enumeration value="INVALID_STATUS"/>
 *     &lt;enumeration value="IS_CPM_CAMPAIGN"/>
 *     &lt;enumeration value="IS_PERCENT_CPA_CAMPAIGN"/>
 *     &lt;enumeration value="NOT_THE_PREVIOUS_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="NOT_ENOUGH_CONVERSION_DATA"/>
 *     &lt;enumeration value="NOT_ENOUGH_CONVERSIONS"/>
 *     &lt;enumeration value="OPTED_IN_SEARCH"/>
 *     &lt;enumeration value="PROXY_BIDDING_ON"/>
 *     &lt;enumeration value="SITE_REMNANT_RESERVATION_ALLOWED"/>
 *     &lt;enumeration value="TRANSITION_TO_ITSELF"/>
 *     &lt;enumeration value="UNKNOWN_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="UNSUPPORTED_TRANSITION"/>
 *     &lt;enumeration value="VCG_ENABLED"/>
 *     &lt;enumeration value="BIDDING_TRANSITION_FAILED"/>
 *     &lt;enumeration value="ACCELERATED_DELIVERY_NOT_SUPPORTED_FOR_BUDGET_OPTIMIZER"/>
 *     &lt;enumeration value="HAS_ACTIVE_EXPERIMENT"/>
 *     &lt;enumeration value="INCOMPATIBLE_WITH_CAMPAIGN_SETTING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingTransitionError.Reason")
@XmlEnum
public enum BiddingTransitionErrorReason {


    /**
     * 
     *                 Transition is not allowed since Bid to position is enabled.
     *               
     * 
     */
    BID_TO_POSITION_ENABLED,

    /**
     * 
     *                 Bidding strategy is not available for the account type.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE,

    /**
     * 
     *                 Transition is not allowed for a budget optimizer campaign.
     *               
     * 
     */
    BUDGET_OPTIMIZER_IS_ENABLED,

    /**
     * 
     *                 Transition is not allowed for a conversion optimizer campaign.
     *               
     * 
     */
    CONVERSION_OPTIMIZER_IS_ENABLED,

    /**
     * 
     *                 Conversion tracking is not enabled for the campaign that has
     *                 VBB transition.
     *               
     * 
     */
    CONVERSION_TRACKING_NOT_ENABLED,

    /**
     * 
     *                 Conversion tracking is not available for the account type.
     *               
     * 
     */
    CONVERSION_TRACKING_NOT_AVAILABLE_FOR_ACCOUNT_TYPE,

    /**
     * 
     *                 Disable position preference by turning it off for the campaign.
     *               
     * 
     */
    USE_POSITION_PREFERENCE_IN_MANUALCPC_INSTEAD_TO_DISABLE_POSITION_PREFERENCE,

    /**
     * 
     *                 Explicit bid is invalid for the transition.
     *               
     * 
     */
    INVALID_BID,

    /**
     * 
     *                 Cannot set an explicit bid for adgroups with transition,
     *                 e.g., ManualCPC from BudgetOptimizer only takes proxy bids.
     *               
     * 
     */
    CANNOT_SET_EXPLICIT_BID,

    /**
     * 
     *                 Explicit bid is required for bidding transition,
     *                 e.g., ManualCPC <-> ManualCPM.
     *               
     * 
     */
    EXPLICIT_BID_REQUIRED_FOR_TRANSITION,

    /**
     * 
     *                 Explicit bid specified for the bidding transition should match the
     *                 bidding strategy of the transitioning campaign.
     *               
     * 
     */
    EXPLICIT_BID_TYPE_DOES_NOT_MATCH_CAMPAIGN_BIDDING_STRATEGY,

    /**
     * 
     *                 The required bid for transition is missing.
     *               
     * 
     */
    MISSING_REQUIRED_BID,

    /**
     * 
     *                 Campaign has an invalid status.
     *               
     * 
     */
    INVALID_STATUS,

    /**
     * 
     *                 Transition is not allowed for CPM campaigns.
     *               
     * 
     */
    IS_CPM_CAMPAIGN,

    /**
     * 
     *                 Transition is not allowed for percent CPA campaigns.
     *               
     * 
     */
    IS_PERCENT_CPA_CAMPAIGN,

    /**
     * 
     *                 For budget optimizer, the only transition allowed is a switch to the
     *                 previous strategy.
     *               
     * 
     */
    NOT_THE_PREVIOUS_BIDDING_STRATEGY,

    /**
     * 
     *                 Not enough required data for conversion, or not enough data
     *                 in the last 3 days suggesting that the campaign is not stable enough to
     *                 enter into the conversion optimizer.
     *               
     * 
     */
    NOT_ENOUGH_CONVERSION_DATA,

    /**
     * 
     *                 Not enough conversions tracked for VBB transition.
     *               
     * 
     */
    NOT_ENOUGH_CONVERSIONS,

    /**
     * 
     *                 Campaign is on the search network--so can't switch to CPM.
     *               
     * 
     */
    OPTED_IN_SEARCH,

    /**
     * 
     *                 Proxy bidding is on.
     *               
     * 
     */
    PROXY_BIDDING_ON,

    /**
     * 
     *                 Can not switch to manual CPC if campaign allows site remnant
     *                 reservation bid type.
     *               
     * 
     */
    SITE_REMNANT_RESERVATION_ALLOWED,

    /**
     * 
     *                 Transition to self is not allowed.
     *               
     * 
     */
    TRANSITION_TO_ITSELF,

    /**
     * 
     *                 Unknown bidding strategy.
     *               
     * 
     */
    UNKNOWN_BIDDING_STRATEGY,

    /**
     * 
     *                 Transition is not supported.
     *               
     * 
     */
    UNSUPPORTED_TRANSITION,

    /**
     * 
     *                 Transition not allowed since VCG is enabled.
     *               
     * 
     */
    VCG_ENABLED,

    /**
     * 
     *                 Bidding transition failed. This is the default bidding transition error when no
     *                 other errors match.
     *               
     * 
     */
    BIDDING_TRANSITION_FAILED,

    /**
     * 
     *                 Accelerated delivery method is not supported for budget optimizer.
     *               
     * 
     */
    ACCELERATED_DELIVERY_NOT_SUPPORTED_FOR_BUDGET_OPTIMIZER,

    /**
     * 
     *                 Bidding transition is prohibited for campaigns that have an active experiment.
     *               
     * 
     */
    HAS_ACTIVE_EXPERIMENT,

    /**
     * 
     *                 Target bidding strategy is incompatible with a campaign setting.
     *               
     * 
     */
    INCOMPATIBLE_WITH_CAMPAIGN_SETTING;

    public String value() {
        return name();
    }

    public static BiddingTransitionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
