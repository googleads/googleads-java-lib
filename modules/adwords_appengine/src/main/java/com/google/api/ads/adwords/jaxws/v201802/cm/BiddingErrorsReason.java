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
 * <p>Java class for BiddingErrors.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingErrors.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BIDDING_STRATEGY_TRANSITION_NOT_ALLOWED"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_OVERRIDES"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_COMPATIBLE_WITH_ADGROUP_CRITERIA_OVERRIDES"/>
 *     &lt;enumeration value="CAMPAIGN_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN"/>
 *     &lt;enumeration value="ADGROUP_BIDDING_STRATEGY_CANNOT_BE_OVERRIDDEN"/>
 *     &lt;enumeration value="CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN"/>
 *     &lt;enumeration value="CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP"/>
 *     &lt;enumeration value="CANNOT_ATTACH_BIDDING_STRATEGY_TO_ADGROUP_CRITERIA"/>
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
 *     &lt;enumeration value="CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_AD_GROUP_LEVEL_POP_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="CANNOT_TARGET_CONTENT_NETWORK_ONLY_WITH_CAMPAIGN_LEVEL_POP_BIDDING_STRATEGY"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED_WITH_AD_SCHEDULE"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_AVAILABLE_FOR_CUSTOMER"/>
 *     &lt;enumeration value="PAY_PER_CONVERSION_NOT_ALLOWED_WITH_TARGET_CPA"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_ALLOWED_FOR_SEARCH_ONLY_CAMPAIGNS"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS"/>
 *     &lt;enumeration value="BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION"/>
 *     &lt;enumeration value="BID_TOO_SMALL"/>
 *     &lt;enumeration value="BID_TOO_BIG"/>
 *     &lt;enumeration value="BID_TOO_MANY_FRACTIONAL_DIGITS"/>
 *     &lt;enumeration value="ENHANCED_CPC_ENABLED_NOT_SUPPORTED_ON_PORTFOLIO_TARGET_SPEND_STRATEGY"/>
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
     *                 Cannot attach bidding strategy to campaign.
     *               
     * 
     */
    CANNOT_ATTACH_BIDDING_STRATEGY_TO_CAMPAIGN,

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
     *                 Campaign can not be created with given bidding strategy. It can be transitioned to the
     *                 strategy, once eligible.
     *               
     * 
     */
    CANNOT_CREATE_CAMPAIGN_WITH_BIDDING_STRATEGY,

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
     *                 The bidding strategy is not supported for use in drafts or experiments.
     *               
     * 
     */
    BIDDING_STRATEGY_NOT_SUPPORTED_IN_DRAFTS_OR_EXPERIMENTS,

    /**
     * 
     *                 Bidding strategy type does not support product type ad group criterion.
     *               
     * 
     */
    BIDDING_STRATEGY_TYPE_DOES_NOT_SUPPORT_PRODUCT_TYPE_ADGROUP_CRITERION,

    /**
     * 
     *                 Bid amount is too small.
     *               
     * 
     */
    BID_TOO_SMALL,

    /**
     * 
     *                 Bid amount is too big.
     *               
     * 
     */
    BID_TOO_BIG,

    /**
     * 
     *                 Bid has too many fractional digit precision.
     *               
     * 
     */
    BID_TOO_MANY_FRACTIONAL_DIGITS,

    /**
     * 
     *                 EnhancedCpcEnabled cannot be set on <em>portfolio</em> Target Spend strategies.
     *               
     * 
     */
    ENHANCED_CPC_ENABLED_NOT_SUPPORTED_ON_PORTFOLIO_TARGET_SPEND_STRATEGY,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BiddingErrorsReason fromValue(String v) {
        return valueOf(v);
    }

}
