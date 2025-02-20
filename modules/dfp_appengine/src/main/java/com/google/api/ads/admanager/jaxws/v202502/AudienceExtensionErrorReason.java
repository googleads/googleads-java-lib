// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudienceExtensionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AudienceExtensionError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREQUENCY_CAPS_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="INVALID_TARGETING"/&gt;
 *     &lt;enumeration value="INVENTORY_UNIT_TARGETING_INVALID"/&gt;
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION"/&gt;
 *     &lt;enumeration value="INVALID_EXTERNAL_ENTITY_ID"/&gt;
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_MAX_BID"/&gt;
 *     &lt;enumeration value="AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UNEXPECTED_AUDIENCE_EXTENSION_ERROR"/&gt;
 *     &lt;enumeration value="MAX_DAILY_BUDGET_AMOUNT_EXCEEDED"/&gt;
 *     &lt;enumeration value="EXTERNAL_CAMPAIGN_ALREADY_EXISTS"/&gt;
 *     &lt;enumeration value="AUDIENCE_EXTENSION_WITHOUT_FEATURE"/&gt;
 *     &lt;enumeration value="AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT"/&gt;
 *     &lt;enumeration value="CANNOT_OVERRIDE_CREATIVE_SIZE_WITH_AUDIENCE_EXTENSION"/&gt;
 *     &lt;enumeration value="CANNOT_OVERRIDE_FIELD_WITH_AUDIENCE_EXTENSION"/&gt;
 *     &lt;enumeration value="ONLY_ONE_CREATIVE_PLACEHOLDER_ALLOWED"/&gt;
 *     &lt;enumeration value="MULTIPLE_AUDIENCE_EXTENSION_LINE_ITEMS_ON_ORDER"/&gt;
 *     &lt;enumeration value="CANNOT_COPY_AUDIENCE_EXTENSION_LINE_ITEMS_AND_CREATIVES_TOGETHER"/&gt;
 *     &lt;enumeration value="FEATURE_DEPRECATED"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AudienceExtensionError.Reason")
@XmlEnum
public enum AudienceExtensionErrorReason {


    /**
     * 
     *                 Frequency caps are not supported by audience extension line items
     *               
     * 
     */
    FREQUENCY_CAPS_NOT_SUPPORTED,

    /**
     * 
     *                 Audience extension line items can only target geography
     *               
     * 
     */
    INVALID_TARGETING,

    /**
     * 
     *                 Audience extension line items can only target audience extension inventory units
     *               
     * 
     */
    INVENTORY_UNIT_TARGETING_INVALID,

    /**
     * 
     *                 Audience extension line items do not support {@link CreativeRotationType#SEQUENTIAL}.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION,

    /**
     * 
     *                 The given ID of the external entity is not valid
     *               
     * 
     */
    INVALID_EXTERNAL_ENTITY_ID,

    /**
     * 
     *                 Audience extension line items only support {@link LineItemType#STANDARD}.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE,

    /**
     * 
     *                 Audience extension max bid is invalid when it is greater then the max budget.
     *               
     * 
     */
    INVALID_MAX_BID,

    /**
     * 
     *                 Bulk update for audience extension line items is not allowed.
     *               
     * 
     */
    AUDIENCE_EXTENSION_BULK_UPDATE_NOT_ALLOWED,

    /**
     * 
     *                 An unexpected error occurred.
     *               
     * 
     */
    UNEXPECTED_AUDIENCE_EXTENSION_ERROR,

    /**
     * 
     *                 The value entered for the maximum daily budget on an audience extension line item exceeds
     *                 the maximum allowed.
     *               
     * 
     */
    MAX_DAILY_BUDGET_AMOUNT_EXCEEDED,

    /**
     * 
     *                 Creating a campaign for a line item that already has an associated campaign is not allowed.
     *               
     * 
     */
    EXTERNAL_CAMPAIGN_ALREADY_EXISTS,

    /**
     * 
     *                 Audience extension was specified on a line item but the feature was not
     *                 enabled.
     *               
     * 
     */
    AUDIENCE_EXTENSION_WITHOUT_FEATURE,

    /**
     * 
     *                 Audience extension was specified on a line item but no audience extension account has
     *                 been linked.
     *               
     * 
     */
    AUDIENCE_EXTENSION_WITHOUT_LINKED_ACCOUNT,

    /**
     * 
     *                 Assocation creative size overrides are not allowed with audience extension.
     *               
     * 
     */
    CANNOT_OVERRIDE_CREATIVE_SIZE_WITH_AUDIENCE_EXTENSION,

    /**
     * 
     *                 Some association overrides are not allowed with audience extension.
     *               
     * 
     */
    CANNOT_OVERRIDE_FIELD_WITH_AUDIENCE_EXTENSION,

    /**
     * 
     *                 Only one creative placeholder is allowed for an audience extension line item.
     *               
     * 
     */
    ONLY_ONE_CREATIVE_PLACEHOLDER_ALLOWED,

    /**
     * 
     *                 Only one audience extension line item can be associated with a given order.
     *               
     * 
     */
    MULTIPLE_AUDIENCE_EXTENSION_LINE_ITEMS_ON_ORDER,

    /**
     * 
     *                 Audience extension line items must be copied separately from their associated creatives.
     *               
     * 
     */
    CANNOT_COPY_AUDIENCE_EXTENSION_LINE_ITEMS_AND_CREATIVES_TOGETHER,

    /**
     * 
     *                 Audience extension is no longer supported and cannot be used.
     *               
     * 
     */
    FEATURE_DEPRECATED,

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

    public static AudienceExtensionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
