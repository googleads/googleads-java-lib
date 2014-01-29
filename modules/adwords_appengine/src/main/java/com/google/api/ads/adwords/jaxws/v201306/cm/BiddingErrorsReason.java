
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingErrors.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingErrors.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDDING_STRATEGY_AVAILABLE_FOR_ENHANCED_CAMPAIGN_ONLY"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_OVERRIDE_NOT_ALLOWED"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES"/>
 *     &lt;enumeration value="CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN"/>
 *     &lt;enumeration value="ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN"/>
 *     &lt;enumeration value="CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP"/>
 *     &lt;enumeration value="CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA"/>
 *     &lt;enumeration value="PERCENT_CPA_NOT_AVAILABLE_FOR_CUSTOMER"/>
 *     &lt;enumeration value="INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE"/>
 *     &lt;enumeration value="BIDS_NOT_ALLLOWED"/>
 *     &lt;enumeration value="DUPLICATE_BIDS"/>
 *     &lt;enumeration value="INVALID_BIDDING_SCHEME"/>
 *     &lt;enumeration value="INVALID_BIDDING_STRATEGY_TYPE"/>
 *     &lt;enumeration value="MISSING_BIDDING_STRATEGY_TYPE"/>
 *     &lt;enumeration value="NULL_BID"/>
 *     &lt;enumeration value="INVALID_BID"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE"/>
 *     &lt;enumeration value="CONVERSION_TRACKING_NOT_ENABLED"/>
 *     &lt;enumeration value="NOT_ENOUGH_CONVERSIONS"/>
 *     &lt;enumeration value="NOT_ENOUGH_CONVERSION_DATA"/>
 *     &lt;enumeration value="CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER"/>
 *     &lt;enumeration value="CANNOT_ATTACH_POP_BIDDING_STRATEGY_FOR_CONTENT_NETWORK_ONLY_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED_FOR_CAMPAIGNS_WITH_EXPERIMENTS"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingErrors.Reason")
@XmlEnum
public enum BiddingErrorsReason {


    /**
     * 
     *                 Bidding strategy is available for enhanced campaign only.
     *               
     * 
     */
    BIDDING_STRATEGY_AVAILABLE_FOR_ENHANCED_CAMPAIGN_ONLY,

    /**
     * 
     *                 Bidding strategy cannot override ad group or campaign bidding strategy.
     *               
     * 
     */
    BIDDING_STRATEGY_OVERRIDE_NOT_ALLOWED,

    /**
     * 
     *                 Cannot transition to new bidding strategy.
     *               
     * 
     */
    BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED,

    /**
     * 
     *                 Bidding strategy cannot be overridden by current ad group bidding strategy.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES,

    /**
     * 
     *                 Bidding strategy cannot be overridden by current criteria bidding strategy.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES,

    /**
     * 
     *                 Cannot override campaign bidding strategy.
     *               
     * 
     */
    CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN,

    /**
     * 
     *                 Cannot override ad group bidding strategy.
     *               
     * 
     */
    ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN,

    /**
     * 
     *                 Cannot attach bidding strategy to ad group.
     *               
     * 
     */
    CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP,

    /**
     * 
     *                 Cannot attach bidding strategy to criteria.
     *               
     * 
     */
    CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA,

    /**
     * 
     *                 Percent Cpa not available for customer. Only whitelisted customers can use it.
     *               
     * 
     */
    PERCENT_CPA_NOT_AVAILABLE_FOR_CUSTOMER,

    /**
     * 
     *                 Bidding strategy is not supported or cannot be used as anonymous.
     *               
     * 
     */
    INVALID_ANONYMOUS_BIDDING_STRATEGY_TYPE,

    /**
     * 
     *                 No bids may be set. The bid list must be null or empty.
     *               
     * 
     */
    BIDS_NOT_ALLLOWED,

    /**
     * 
     *                 The bid list contains two or more bids of the same type.
     *               
     * 
     */
    DUPLICATE_BIDS,

    /**
     * 
     *                 The bidding scheme does not match the bidding strategy type.
     *               
     * 
     */
    INVALID_BIDDING_SCHEME,

    /**
     * 
     *                 The type does not match the named strategy's type.
     *               
     * 
     */
    INVALID_BIDDING_STRATEGY_TYPE,

    /**
     * 
     *                 The bidding strategy type is missing.
     *               
     * 
     */
    MISSING_BIDDING_STRATEGY_TYPE,

    /**
     * 
     *                 The bid list contains a null entry.
     *               
     * 
     */
    NULL_BID,

    /**
     * 
     *                 The bid is invalid.
     *               
     * 
     */
    INVALID_BID,

    /**
     * 
     *                 Bidding strategy is not available for the account type.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_AVAILABLE_FOR_ACCOUNT_TYPE,

    /**
     * 
     *                 Conversion tracking is not enabled for the campaign for VBB transition.
     *               
     * 
     */
    CONVERSION_TRACKING_NOT_ENABLED,

    /**
     * 
     *                 Not enough conversions tracked for VBB transitions.
     *               
     * 
     */
    NOT_ENOUGH_CONVERSIONS,

    /**
     * 
     *                 Not enough right kind of data required for conversion or not enough data in last 3 days
     *                 suggesting the campaign is not stable enough to enter into conversion optimizer.
     *               
     * 
     */
    NOT_ENOUGH_CONVERSION_DATA,

    /**
     * 
     *                 Campaign can not be created with Conversion Optimizer bidding strategy. It can be
     *                 transitioned to conversion optimizer, once eligible.
     *               
     * 
     */
    CANNOT_CREATE_CAMPAIGN_WITH_CONVERSION_OPTIMIZER,

    /**
     * 
     *                 Content only campaigns are prohibited from using the Page One Promoted bidding strategy.
     *               
     * 
     */
    CANNOT_ATTACH_POP_BIDDING_STRATEGY_FOR_CONTENT_NETWORK_ONLY_CAMPAIGN,

    /**
     * 
     *                 Cannot target content network only as ad group uses Page One Promoted bidding strategy.
     *               
     * 
     */
    CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY,

    /**
     * 
     *                 Cannot target content network only as campaign uses Page One Promoted bidding strategy.
     *               
     * 
     */
    CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY,

    /**
     * 
     *                 Budget Optimizer and Target Spend bidding strategies are not supported for campaigns with
     *                 AdSchedule targeting.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE,

    /**
     * 
     *                 Pay per conversion is not available to all the customer, only few whitelisted customers
     *                 can use this.
     *               
     * 
     */
    PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER,

    /**
     * 
     *                 Pay per conversion is not allowed with Target CPA.
     *               
     * 
     */
    PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA,

    /**
     * 
     *                 Cannot set bidding strategy to Manual CPM for search network only campaigns.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS,

    /**
     * 
     *                 The campaign has active experiments so bidding transition is prohibited.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_FOR_CAMPAIGNS_WITH_EXPERIMENTS,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BiddingErrorsReason fromValue(String v) {
        return valueOf(v);
    }

}
