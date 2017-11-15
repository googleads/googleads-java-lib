// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateCardError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateCardError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_CURRENCY_CODE"/>
 *     &lt;enumeration value="INVALID_PRICING_MODEL"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_NOT_APPLICABLE_ON_MARKETPLACE_RATE_CARD"/>
 *     &lt;enumeration value="UNSUPPORTED_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNCHANGEABLE_CURRENCY_CODE"/>
 *     &lt;enumeration value="UNCHANGEABLE_PRICING_MODEL"/>
 *     &lt;enumeration value="MARKETPLACE_RATE_CARD_NOT_UNIQUE"/>
 *     &lt;enumeration value="NOT_ACCEPT_DEALS_SALES_ON_LEGAL_AGREEMENT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateCardError.Reason")
@XmlEnum
public enum RateCardErrorReason {


    /**
     * 
     *                 The currency code is invalid and does not follow ISO 4217.
     *               
     * 
     */
    INVALID_CURRENCY_CODE,

    /**
     * 
     *                 The {@link PricingModel} is invalid.
     *               
     * 
     */
    INVALID_PRICING_MODEL,

    /**
     * 
     *                 Marketplace {@link RateCard} cannot have {@link ProductPackage} association.
     *               
     * 
     */
    PRODUCT_PACKAGE_NOT_APPLICABLE_ON_MARKETPLACE_RATE_CARD,

    /**
     * 
     *                 The currency code is not supported by current network. A supported currency can be either
     *                 {@link Network#currencyCode} or one of {@link Network#secondaryCurrencyCodes}.
     *               
     * 
     */
    UNSUPPORTED_CURRENCY_CODE,

    /**
     * 
     *                 The currency code is unchangeable as long as there is any proposal line item created
     *                 with the rate card.
     *               
     * 
     */
    UNCHANGEABLE_CURRENCY_CODE,

    /**
     * 
     *                 The {@link PricingModel} cannot be changed after {@link ProposalLineItem proposal line
     *                 items} have been created using the {@link RateCard}.
     *               
     * 
     */
    UNCHANGEABLE_PRICING_MODEL,

    /**
     * 
     *                 Only one Marketplace {@link RateCard} per {@link Network} is allowed.
     *               
     * 
     */
    MARKETPLACE_RATE_CARD_NOT_UNIQUE,

    /**
     * 
     *                 Legal agreement must be accepted before activating the Marketplace {@link RateCard}.
     *               
     * 
     */
    NOT_ACCEPT_DEALS_SALES_ON_LEGAL_AGREEMENT,

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

    public static RateCardErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
