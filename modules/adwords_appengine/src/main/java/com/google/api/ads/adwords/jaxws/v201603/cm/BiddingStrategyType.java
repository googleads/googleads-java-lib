// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BiddingStrategyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BiddingStrategyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUDGET_OPTIMIZER"/>
 *     &lt;enumeration value="CONVERSION_OPTIMIZER"/>
 *     &lt;enumeration value="MANUAL_CPC"/>
 *     &lt;enumeration value="MANUAL_CPM"/>
 *     &lt;enumeration value="PAGE_ONE_PROMOTED"/>
 *     &lt;enumeration value="TARGET_SPEND"/>
 *     &lt;enumeration value="ENHANCED_CPC"/>
 *     &lt;enumeration value="TARGET_CPA"/>
 *     &lt;enumeration value="TARGET_ROAS"/>
 *     &lt;enumeration value="TARGET_OUTRANK_SHARE"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BiddingStrategyType")
@XmlEnum
public enum BiddingStrategyType {


    /**
     * 
     *                 Replaced by TARGET_SPEND. Kept only for legacy support.
     *               
     * 
     */
    BUDGET_OPTIMIZER,

    /**
     * 
     *                 Replaced by TARGET_CPA. Kept only for legacy support.
     *               
     * 
     */
    CONVERSION_OPTIMIZER,

    /**
     * 
     *                 Manual click based bidding where user pays per click. See
     *                 {@linkplain ManualCpcBiddingScheme} for more details.
     *               
     * 
     */
    MANUAL_CPC,

    /**
     * 
     *                 Manual impression based bidding where user pays per thousand
     *                 impressions. See {@linkplain ManualCpmBiddingScheme} for more
     *                 details.
     *               
     * 
     */
    MANUAL_CPM,

    /**
     * 
     *                 Page-One Promoted is an automated bid strategy that sets max CPC bids
     *                 to target impressions on page one or page one promoted slots on
     *                 google.com. See {@linkplain PageOnePromotedBiddingScheme} for
     *                 more details.
     *               
     * 
     */
    PAGE_ONE_PROMOTED,

    /**
     * 
     *                 Target Spend (Maximize Clicks) is an automated bid strategy that sets
     *                 your bids to help get as many clicks as possible within your budget.
     *                 See {@linkplain TargetSpendBiddingScheme} for more details.
     *               
     * 
     */
    TARGET_SPEND,

    /**
     * 
     *                 Enhanced CPC is a bidding strategy that raises your bids for clicks
     *                 that seem more likely to lead to a conversion and lowers them for clicks
     *                 where they seem less likely. See {@linkplain EnhancedCpcBiddingScheme}
     *                 for more details.
     *               
     * 
     */
    ENHANCED_CPC,

    /**
     * 
     *                 Target CPA is an automated bid strategy that sets bids to help get
     *                 as many conversions as possible at the target cost-per-acquisition
     *                 (CPA) you set. See {@linkplain TargetCpaBiddingScheme}
     *                 for more details.
     *               
     * 
     */
    TARGET_CPA,

    /**
     * 
     *                 Target ROAS is an automated bidding strategy that helps you maximize
     *                 revenue while averaging a specific target Return On Average Spend (ROAS).
     *                 See {@linkplain TargetRoasBiddingScheme} for more details.
     *               
     * 
     */
    TARGET_ROAS,

    /**
     * 
     *                 Target Outrank Share is an automated bidding strategy that sets bids
     *                 based on the target fraction of auctions where the advertiser should
     *                 outrank a specific competitor. See {@linkplain TargetOutrankShareBiddingScheme}
     *                 for more details.
     *               
     * 
     */
    TARGET_OUTRANK_SHARE,

    /**
     * 
     *                 Special bidding strategy type used to reset the bidding strategy at AdGroup and
     *                 AdGroupCriterion.
     *               
     * 
     */
    NONE,

    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static BiddingStrategyType fromValue(String v) {
        return valueOf(v);
    }

}
