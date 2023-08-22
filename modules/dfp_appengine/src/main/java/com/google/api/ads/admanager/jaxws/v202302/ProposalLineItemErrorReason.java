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


package com.google.api.ads.admanager.jaxws.v202302;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProposalLineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProposalLineItemError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_SAME_RATE_CARD"/&gt;
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_NOT_AFTER_START_TIME"/&gt;
 *     &lt;enumeration value="START_DATE_TIME_TOO_LATE_IN_MONTH"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_TOO_LATE"/&gt;
 *     &lt;enumeration value="START_DATE_TIME_IS_IN_PAST"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_IS_IN_PAST"/&gt;
 *     &lt;enumeration value="FRONTLOADED_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ALL_ROADBLOCK_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ALL_COMPANION_DELIVERY_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CREATIVE_SET_ROADBLOCK_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ALREADY_STARTED"/&gt;
 *     &lt;enumeration value="CONFLICT_WITH_PRODUCT"/&gt;
 *     &lt;enumeration value="VIOLATE_BUILT_IN_TARGETING_COMPATIBILITY_RESTRICTION"/&gt;
 *     &lt;enumeration value="VIOLATE_BUILT_IN_TARGETING_LOCKED_RESTRICTION"/&gt;
 *     &lt;enumeration value="MOBILE_TECH_CRITERIA_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_TARGETING_TYPE"/&gt;
 *     &lt;enumeration value="WRONG_COST"/&gt;
 *     &lt;enumeration value="NO_WEB_PROPERTY_FOR_TARGETED_REQUEST_PLATFORM"/&gt;
 *     &lt;enumeration value="CALCULATED_COST_TOO_HIGH"/&gt;
 *     &lt;enumeration value="INVALID_PRIORITY_FOR_LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK"/&gt;
 *     &lt;enumeration value="SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_RESERVATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE"/&gt;
 *     &lt;enumeration value="INCONSISTENT_ROADBLOCK_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_CONTRACTED_QUANTITY_BUFFER"/&gt;
 *     &lt;enumeration value="INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="UPDATE_COST_ADJUSTMENT_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_RATE_CARD_CURRENCY_CODE"/&gt;
 *     &lt;enumeration value="END_DATE_TIME_IS_BEFORE_LAST_PAUSED_TIME"/&gt;
 *     &lt;enumeration value="VIDEO_INVALID_ROADBLOCKING"/&gt;
 *     &lt;enumeration value="UPDATE_TIME_ZONE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_TIME_ZONE_FOR_RATE_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_TIME_ZONE_FOR_DEALS"/&gt;
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/&gt;
 *     &lt;enumeration value="SIZE_REQUIRED"/&gt;
 *     &lt;enumeration value="COMPANION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="MISSING_COMPANION"/&gt;
 *     &lt;enumeration value="DUPLICATED_MASTER_SIZE"/&gt;
 *     &lt;enumeration value="INVALID_EXPECTED_CREATIVE_COUNT"/&gt;
 *     &lt;enumeration value="CANNOT_HAVE_CREATIVE_TEMPLATE"/&gt;
 *     &lt;enumeration value="NATIVE_CREATIVE_TEMPLATE_REQUIRED"/&gt;
 *     &lt;enumeration value="CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID"/&gt;
 *     &lt;enumeration value="INVALID_CLICK_TRACKING_LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_TARGETING_FOR_CLICK_TRACKING"/&gt;
 *     &lt;enumeration value="INVALID_CONTRACTED_UNITS_BOUGHT"/&gt;
 *     &lt;enumeration value="PLACEHOLDER_CANNOT_CONTAIN_LABELS"/&gt;
 *     &lt;enumeration value="INVALID_LABEL_TYPE_IN_PLACEHOLDER"/&gt;
 *     &lt;enumeration value="PLACEHOLDER_CANNOT_CONTAIN_NEGATED_LABELS"/&gt;
 *     &lt;enumeration value="CONTRACTED_UNITS_LESS_THAN_DELIVERED"/&gt;
 *     &lt;enumeration value="DISPLAY_ENVIRONMENT_MUST_HAVE_EXCLUDED_MOBILE_APPS_TARGETING"/&gt;
 *     &lt;enumeration value="MOBILE_ENVIRONMENT_MUST_HAVE_INCLUDED_MOBILE_APPS_TARGETING"/&gt;
 *     &lt;enumeration value="SKIPPABLE_AD_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CROSS_SELL_TARGETING_UNSUPPORTED"/&gt;
 *     &lt;enumeration value="CANNOT_SET_VIDEO_DURATION_ON_NON_VIDEO_DEAL"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProposalLineItemError.Reason")
@XmlEnum
public enum ProposalLineItemErrorReason {


    /**
     * 
     *                 The proposal line item's rate card is not the same as other proposal line items
     *                 in the proposal.
     *               
     * 
     */
    NOT_SAME_RATE_CARD,

    /**
     * 
     *                 The proposal line item's type is not yet supported by Sales Manager.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The proposal line item's end date time is not after its start date time.
     *               
     * 
     */
    END_DATE_TIME_NOT_AFTER_START_TIME,

    /**
     * 
     *                 The proposal line item's start date time is too late in the month.
     *               
     * 
     */
    START_DATE_TIME_TOO_LATE_IN_MONTH,

    /**
     * 
     *                 The proposal line item's end date time is after 1/1/2037.
     *               
     * 
     */
    END_DATE_TIME_TOO_LATE,

    /**
     * 
     *                 The proposal line item's start date time is in past.
     *               
     * 
     */
    START_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 The proposal line item's end date time is in past.
     *               
     * 
     */
    END_DATE_TIME_IS_IN_PAST,

    /**
     * 
     *                 Frontloaded delivery rate type is not allowed.
     *               
     * 
     */
    FRONTLOADED_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all creatives is not allowed.
     *               
     * 
     */
    ALL_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Display all companions is not allowed.
     *               
     * 
     */
    ALL_COMPANION_DELIVERY_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all master and companion creative set is not allowed.
     *               
     * 
     */
    CREATIVE_SET_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Some changes may not be allowed because the related line item has already started.
     *               
     * 
     */
    ALREADY_STARTED,

    /**
     * 
     *                 The setting is conflict with product's restriction.
     *               
     * 
     */
    CONFLICT_WITH_PRODUCT,

    /**
     * 
     *                 The proposal line item's setting violates the product's built-in targeting
     *                 compatibility restriction.
     *               
     * 
     */
    VIOLATE_BUILT_IN_TARGETING_COMPATIBILITY_RESTRICTION,

    /**
     * 
     *                 The proposal line item's setting violates the product's built-in targeting
     *                 locked restriction.
     *               
     * 
     */
    VIOLATE_BUILT_IN_TARGETING_LOCKED_RESTRICTION,

    /**
     * 
     *                 Cannot target mobile-only targeting criteria.
     *               
     * 
     */
    MOBILE_TECH_CRITERIA_NOT_SUPPORTED,

    /**
     * 
     *                 The targeting criteria type is unsupported.
     *               
     * 
     */
    UNSUPPORTED_TARGETING_TYPE,

    /**
     * 
     *                 The contracted cost does not match with what calculated from final rate and units bought.
     *               
     * 
     */
    WRONG_COST,

    /**
     * 
     *                 The proposal line item targets an inventory type for which the network does not have a
     *                 corresponding web property.
     *               
     * 
     */
    NO_WEB_PROPERTY_FOR_TARGETED_REQUEST_PLATFORM,

    /**
     * 
     *                 The cost calculated from cost per unit and units is too high.
     *               
     * 
     */
    CALCULATED_COST_TOO_HIGH,

    /**
     * 
     *                 The line item priority is invalid if it's different than the default.
     *               
     * 
     */
    INVALID_PRIORITY_FOR_LINE_ITEM_TYPE,

    /**
     * 
     *                 Propsoal line item cannot update when it is archived.
     *               
     * 
     */
    UPDATE_PROPOSAL_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 A proposal line item cannot be updated from having
     *                 {@link RoadblockingType#CREATIVE_SET} to having a different
     *                 RoadblockingType, or vice versa.
     *               
     * 
     */
    CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK,

    /**
     * 
     *                 Serving creatives exactly in sequential order is not allowed.
     *               
     * 
     */
    SEQUENTIAL_CREATIVE_ROTATION_NOT_ALLOWED,

    /**
     * 
     *                 Proposal line item cannot update its reservation detail once start delivering.
     *               
     * 
     */
    UPDATE_RESERVATION_NOT_ALLOWED,

    /**
     * 
     *                 The companion delivery option is not valid for the roadblocking type.
     *               
     * 
     */
    INVALID_COMPANION_DELIVERY_OPTION_FOR_ROADBLOCKING_TYPE,

    /**
     * 
     *                 Roadblocking type is inconsistent with creative placeholders. If the roadblocking
     *                 type is creative set, creative placeholders should contain companions,
     *                 and vice versa.
     *               
     * 
     */
    INCONSISTENT_ROADBLOCK_TYPE,

    /**
     * 
     *                 ContractedQuantityBuffer is only applicable to standard line item with
     *                 {@link RateType#CPC}/{@link RateType#CPM}/{@link RateType#VCPM} type.
     *               
     * 
     */
    INVALID_CONTRACTED_QUANTITY_BUFFER,

    /**
     * 
     *                 One or more values on the proposal line item are not valid for a
     *                 {@link LineItemType#CLICK_TRACKING} line item type.
     *               
     * 
     */
    INVALID_VALUES_FOR_CLICK_TRACKING_LINE_ITEM_TYPE,

    /**
     * 
     *                 Proposal line item cannot update its cost adjustment after first approval.
     *               
     * 
     */
    UPDATE_COST_ADJUSTMENT_NOT_ALLOWED,

    /**
     * 
     *                 The currency code of the proposal line item's rate card is not supported by
     *                 the current network. All supported currencies can be found in the union of
     *                 {@link Network#currencyCode} and {@link Network#secondaryCurrencyCodes}.
     *               
     * 
     */
    UNSUPPORTED_RATE_CARD_CURRENCY_CODE,

    /**
     * 
     *                 The corresponding line item is paused, but the proposal line item's end date time is before
     *                 the last paused time.
     *               
     * 
     */
    END_DATE_TIME_IS_BEFORE_LAST_PAUSED_TIME,

    /**
     * 
     *                 Video line items cannot have roadblocking options.
     *               
     * 
     */
    VIDEO_INVALID_ROADBLOCKING,

    /**
     * 
     *                 Time zone cannot be updated once the proposal line item has been sold.
     *               
     * 
     */
    UPDATE_TIME_ZONE_NOT_ALLOWED,

    /**
     * 
     *                 Time zone must be network time zone if the proposal line item is {@link RateType#VCPM}.
     *               
     * 
     */
    INVALID_TIME_ZONE_FOR_RATE_TYPE,

    /**
     * 
     *                 Only the {@link Network#timeZone} is allowed for programmatic {@link Proposal proposals}.
     *               
     * 
     */
    INVALID_TIME_ZONE_FOR_DEALS,

    /**
     * 
     *                 The {@link ProposalLineItem#environmentType} is invalid.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE,

    /**
     * 
     *                 At least one size must be specified.
     *               
     * 
     */
    SIZE_REQUIRED,

    /**
     * 
     *                 A placeholder contains companions but the roadblocking type is not
     *                 {@link RoadblockingType#CREATIVE_SET} or the {@link ProductType product type} is offline.
     *               
     * 
     */
    COMPANION_NOT_ALLOWED,

    /**
     * 
     *                 A placeholder does not contain companions but the roadblocking type is
     *                 {@link RoadblockingType#CREATIVE_SET}.
     *               
     * 
     */
    MISSING_COMPANION,

    /**
     * 
     *                 A placeholder's master size is the same as another placeholder's master size.
     *               
     * 
     */
    DUPLICATED_MASTER_SIZE,

    /**
     * 
     *                 Only creative placeholders with standard {@link CreativePlaceholder#size sizes} can set
     *                 an expected creative count.
     *               
     * 
     */
    INVALID_EXPECTED_CREATIVE_COUNT,

    /**
     * 
     *                 Non-native placeholders cannot have creative templates.
     *               
     * 
     */
    CANNOT_HAVE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 Placeholders can only have native creative templates.
     *               
     * 
     */
    NATIVE_CREATIVE_TEMPLATE_REQUIRED,

    /**
     * 
     *                 Cannot include native placeholders without native creative templates.
     *               
     * 
     */
    CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID,

    /**
     * 
     *                 One or more values are not valid for a {@link LineItemType#CLICK_TRACKING} line item type.
     *               
     * 
     */
    INVALID_CLICK_TRACKING_LINE_ITEM_TYPE,

    /**
     * 
     *                 The targeting is not valid for a {@link LineItemType#CLICK_TRACKING} line item type.
     *               
     * 
     */
    INVALID_TARGETING_FOR_CLICK_TRACKING,

    /**
     * 
     *                 The contractedUnitsBought of the proposal line item is invalid.
     *               
     * 
     */
    INVALID_CONTRACTED_UNITS_BOUGHT,

    /**
     * 
     *                 Only creative placeholders with standard {@link CreativePlaceholder#size sizes} can contain
     *                 labels.
     *               
     * 
     */
    PLACEHOLDER_CANNOT_CONTAIN_LABELS,

    /**
     * 
     *                 One or more labels on a creative placeholder is invalid.
     *               
     * 
     */
    INVALID_LABEL_TYPE_IN_PLACEHOLDER,

    /**
     * 
     *                 A placeholder cannot contain a negated label.
     *               
     * 
     */
    PLACEHOLDER_CANNOT_CONTAIN_NEGATED_LABELS,

    /**
     * 
     *                 Contracted impressions of programmatic proposal line item must be greater than already
     *                 delivered impressions.
     *               
     * 
     */
    CONTRACTED_UNITS_LESS_THAN_DELIVERED,

    /**
     * 
     *                 If AdExchangeEnvironment is DISPLAY, the proposal line item must have mobile apps as excluded
     *                 device capability targeting.
     *               
     * 
     */
    DISPLAY_ENVIRONMENT_MUST_HAVE_EXCLUDED_MOBILE_APPS_TARGETING,

    /**
     * 
     *                 If AdExchangeEnvironment is MOBILE, the proposal line item must have mobile apps as included
     *                 device capability targeting.
     *               
     * 
     */
    MOBILE_ENVIRONMENT_MUST_HAVE_INCLUDED_MOBILE_APPS_TARGETING,

    /**
     * 
     *                 The {@code SkippableAdType} is not allowed.
     *               
     * 
     */
    SKIPPABLE_AD_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Cross sell targeting is unsupported for this proposal line item.
     *               
     * 
     */
    CROSS_SELL_TARGETING_UNSUPPORTED,

    /**
     * 
     *                 Can't set a video duration for non video deals.
     *               
     * 
     */
    CANNOT_SET_VIDEO_DURATION_ON_NON_VIDEO_DEAL,

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

    public static ProposalLineItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
