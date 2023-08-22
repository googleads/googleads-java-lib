// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityChildrenLimitReachedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityChildrenLimitReachedError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LINE_ITEM_LIMIT_FOR_ORDER_REACHED"/&gt;
 *     &lt;enumeration value="CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED"/&gt;
 *     &lt;enumeration value="AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED"/&gt;
 *     &lt;enumeration value="TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED"/&gt;
 *     &lt;enumeration value="TARGETING_EXPRESSION_SIZE_LIMIT_REACHED"/&gt;
 *     &lt;enumeration value="CUSTOM_TARGETING_VALUES_FOR_KEY_LIMIT_REACHED"/&gt;
 *     &lt;enumeration value="TARGETING_EXPRESSION_LIMIT_FOR_CREATIVES_ON_LINE_ITEM_REACHED"/&gt;
 *     &lt;enumeration value="ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED"/&gt;
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED"/&gt;
 *     &lt;enumeration value="PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED"/&gt;
 *     &lt;enumeration value="PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED"/&gt;
 *     &lt;enumeration value="PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED"/&gt;
 *     &lt;enumeration value="PREMIUM_LIMIT_FOR_RATE_CARD_REACHED"/&gt;
 *     &lt;enumeration value="AD_UNIT_LIMIT_FOR_AD_EXCLUSION_RULE_TARGETING_REACHED"/&gt;
 *     &lt;enumeration value="NATIVE_STYLE_LIMIT_FOR_NATIVE_AD_FORMAT_REACHED"/&gt;
 *     &lt;enumeration value="TARGETING_EXPRESSION_LIMIT_FOR_PRESENTATION_ASSIGNMENT_REACHED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityChildrenLimitReachedError.Reason")
@XmlEnum
public enum EntityChildrenLimitReachedErrorReason {


    /**
     * 
     *                 The number of line items on the order exceeds the max number of line items allowed per order
     *                 in the network.
     *               
     * 
     */
    LINE_ITEM_LIMIT_FOR_ORDER_REACHED,

    /**
     * 
     *                 The number of creatives associated with the line item exceeds the max number of creatives
     *                 allowed to be associated with a line item in the network.
     *               
     * 
     */
    CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED,

    /**
     * 
     *                 The number of ad units on the placement exceeds the max number of ad units
     *                 allowed per placement in the network.
     *               
     * 
     */
    AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED,

    /**
     * 
     *                 The number of targeting expressions on the line item exceeds the max number of targeting
     *                 expressions allowed per line item in the network.
     *               
     * 
     */
    TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED,

    /**
     * 
     *                 The size of a single targeting expression tree exceeds the max size allowed by the network.
     *               
     * 
     */
    TARGETING_EXPRESSION_SIZE_LIMIT_REACHED,

    /**
     * 
     *                 The number of custom targeting values for the free-form or predefined custom targeting key
     *                 exceeds the max number allowed.
     *               
     * 
     */
    CUSTOM_TARGETING_VALUES_FOR_KEY_LIMIT_REACHED,

    /**
     * 
     *                 The total number of targeting expressions on the creatives for the line item exceeds
     *                 the max number allowed per line item in the network.
     *               
     * 
     */
    TARGETING_EXPRESSION_LIMIT_FOR_CREATIVES_ON_LINE_ITEM_REACHED,

    /**
     * 
     *                 The number of attachments added to the proposal exceeds the max number
     *                 allowed per proposal in the network.
     *               
     * 
     */
    ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED,

    /**
     * 
     *                 The number of proposal line items on the proposal exceeds the max number
     *                 allowed per proposal in the network.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED,

    /**
     * 
     *                 The number of product package items on the product package exceeds the max number
     *                 allowed per product package in the network.
     *               
     * 
     */
    PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED,

    /**
     * 
     *                 The number of product template and product base rates on the rate card (including excluded
     *                 product base rates) exceeds the max number allowed per rate card in the network.
     *               
     * 
     */
    PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED,

    /**
     * 
     *                 The number of product package item base rates on the rate card exceeds the max number
     *                 allowed per rate card in the network.
     *               
     * 
     */
    PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED,

    /**
     * 
     *                 The number of premiums of the rate card exceeds the max number allowed per rate card
     *                 in the network.
     *               
     * 
     */
    PREMIUM_LIMIT_FOR_RATE_CARD_REACHED,

    /**
     * 
     *                 The number of ad units on {@link AdExclusionRule#inventoryTargeting} exceeds the max number
     *                 of ad units allowed per ad exclusion rule inventory targeting in the network.
     *               
     * 
     */
    AD_UNIT_LIMIT_FOR_AD_EXCLUSION_RULE_TARGETING_REACHED,

    /**
     * 
     *                 The number of native styles under the native creative template exceeds the
     *                 max number of native styles allowed per native creative template in the
     *                 network.
     *               
     * 
     */
    NATIVE_STYLE_LIMIT_FOR_NATIVE_AD_FORMAT_REACHED,

    /**
     * 
     *                 The number of targeting expressions on the native style exceeds the max number of targeting
     *                 expressions allowed per native style in the network.
     *               
     * 
     */
    TARGETING_EXPRESSION_LIMIT_FOR_PRESENTATION_ASSIGNMENT_REACHED,

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

    public static EntityChildrenLimitReachedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
