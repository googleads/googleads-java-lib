// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalLineItemProgrammaticError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemProgrammaticError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_PRODUCT_TYPE"/>
 *     &lt;enumeration value="VIDEO_NOT_SUPPORTED"/>
 *     &lt;enumeration value="ROADBLOCKING_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION"/>
 *     &lt;enumeration value="INVALID_PROPOSAL_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_RATE_TYPE"/>
 *     &lt;enumeration value="ZERO_COST_PER_UNIT_NOT_SUPPORTED"/>
 *     &lt;enumeration value="INVALID_PROGRAMMATIC_CREATIVE_SOURCE"/>
 *     &lt;enumeration value="INVALID_MAX_VIDEO_CREATIVE_DURATION"/>
 *     &lt;enumeration value="CANNOT_UPDATE_PROGRAMMATIC_CREATIVE_SOURCE"/>
 *     &lt;enumeration value="INVALID_NUM_UNITS"/>
 *     &lt;enumeration value="MIX_GUARANTEED_AND_PREFERRED_DEAL_NOT_ALLOWED"/>
 *     &lt;enumeration value="MIX_NATIVE_AND_BANNER_SIZE_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_SIZES"/>
 *     &lt;enumeration value="INVALID_SPONSORSHIP_CONTRACTED_UNITS_BOUGHT"/>
 *     &lt;enumeration value="INVALID_PROGRAMMATIC_PRICING_MODEL"/>
 *     &lt;enumeration value="BUYER_DISABLED_FOR_PG_VIOLATING_SLA"/>
 *     &lt;enumeration value="BUYER_NOT_FOUND"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemProgrammaticError.Reason")
@XmlEnum
public enum ProposalLineItemProgrammaticErrorReason {


    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line items} only support
     *                 {@link ProductType#DFP}.
     *               
     * 
     */
    INVALID_PRODUCT_TYPE,

    /**
     * 
     *                 {@link EnvironmentType#VIDEO_PLAYER} is currently not supported.
     *               
     * 
     */
    VIDEO_NOT_SUPPORTED,

    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line items} do not support
     *                 {@link RoadblockingType#CREATIVE_SET}.
     *               
     * 
     */
    ROADBLOCKING_NOT_SUPPORTED,

    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line items} do not support
     *                 {@link CreativeRotationType#SEQUENTIAL}.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION,

    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line items} only support
     *                 {@link LineItemType#STANDARD}.
     *               
     * 
     */
    INVALID_PROPOSAL_LINE_ITEM_TYPE,

    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line items} only support {@link RateType#CPM}.
     *               
     * 
     */
    INVALID_RATE_TYPE,

    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line items} do not support zero for
     *                 {@link ProposalLineItem#netRate}.
     *               
     * 
     */
    ZERO_COST_PER_UNIT_NOT_SUPPORTED,

    /**
     * 
     *                 Only programmatic {@link ProposalLineItem proposal line items} support
     *                 {@link ProgrammaticCreativeSource}.
     *               
     * 
     */
    INVALID_PROGRAMMATIC_CREATIVE_SOURCE,

    /**
     * 
     *                 Programmatic {@link ProposalLineItem proposal line item} has invalid video creative
     *                 duration.
     *               
     * 
     */
    INVALID_MAX_VIDEO_CREATIVE_DURATION,

    /**
     * 
     *                 Cannot update programmatic creative source if the {@link ProposalLineItem proposal line item}
     *                 has been sent to the buyer.
     *               
     * 
     */
    CANNOT_UPDATE_PROGRAMMATIC_CREATIVE_SOURCE,

    /**
     * 
     *                 The {@link Goal#units} value is invalid. For {@link RateType#CPD}
     *                 {@link ProposalLineItem proposal line items}, only 100% is allowed
     *               
     * 
     */
    INVALID_NUM_UNITS,

    /**
     * 
     *                 Cannot mix guaranteed and Preferred Deal proposal line items in a programmatic proposal.
     *               
     * 
     */
    MIX_GUARANTEED_AND_PREFERRED_DEAL_NOT_ALLOWED,

    /**
     * 
     *                 Cannot mix native and banner size in a programmatic proposal line item.
     *               
     * 
     */
    MIX_NATIVE_AND_BANNER_SIZE_NOT_ALLOWED,

    /**
     * 
     *                 Cannot update sizes when a programmatic proposal line item with publisher creative source is
     *                 sent to a buyer.
     *               
     * 
     */
    CANNOT_UPDATE_SIZES,

    /**
     * 
     *                 The {ProposalLineItem#contractedUnitsBought} cannot be {@code null} or zero for programmatic
     *                 {@link RateType#CPD} {@link ProposalLineItem proposal line items}.
     *               
     * 
     */
    INVALID_SPONSORSHIP_CONTRACTED_UNITS_BOUGHT,

    /**
     * 
     *                 Only {@link PricingModel#NET} is supported for programmatic
     *                 {@link ProposalLineItem proposal line items}.
     *               
     * 
     */
    INVALID_PROGRAMMATIC_PRICING_MODEL,

    /**
     * 
     *                 Buyer is currently disabled for guaranteed deals due to violation of
     *                 Programmatic Guaranteed service level agreement.
     *               
     * 
     */
    BUYER_DISABLED_FOR_PG_VIOLATING_SLA,

    /**
     * 
     *                 Buyer not found.
     *               
     * 
     */
    BUYER_NOT_FOUND,

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

    public static ProposalLineItemProgrammaticErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
