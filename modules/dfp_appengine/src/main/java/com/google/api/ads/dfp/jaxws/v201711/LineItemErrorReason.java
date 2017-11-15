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
 * <p>Java class for LineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALREADY_STARTED"/>
 *     &lt;enumeration value="UPDATE_RESERVATION_NOT_ALLOWED"/>
 *     &lt;enumeration value="ALL_ROADBLOCK_NOT_ALLOWED"/>
 *     &lt;enumeration value="CREATIVE_SET_ROADBLOCK_NOT_ALLOWED"/>
 *     &lt;enumeration value="FRACTIONAL_PERCENTAGE_NOT_ALLOWED"/>
 *     &lt;enumeration value="DISCOUNT_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED"/>
 *     &lt;enumeration value="CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_ENVIRONMENT"/>
 *     &lt;enumeration value="AFMA_BACKFILL_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="COMPANIONS_NOT_ALLOWED"/>
 *     &lt;enumeration value="ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED"/>
 *     &lt;enumeration value="CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK"/>
 *     &lt;enumeration value="UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="COMPANION_BACKFILL_REQUIRES_VIDEO"/>
 *     &lt;enumeration value="COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM"/>
 *     &lt;enumeration value="DUPLICATE_MASTER_SIZES"/>
 *     &lt;enumeration value="INVALID_PRIORITY_FOR_LINE_ITEM_TYPE"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/>
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_AUTO_EXTENSION"/>
 *     &lt;enumeration value="VIDEO_INVALID_ROADBLOCKING"/>
 *     &lt;enumeration value="BACKFILL_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_BACKFILL_LINK_TYPE"/>
 *     &lt;enumeration value="DIFFERENT_BACKFILL_ACCOUNT"/>
 *     &lt;enumeration value="COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL"/>
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL"/>
 *     &lt;enumeration value="INVALID_SIZE_FOR_ENVIRONMENT"/>
 *     &lt;enumeration value="TARGET_PLATOFRM_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_CURRENCY"/>
 *     &lt;enumeration value="LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES"/>
 *     &lt;enumeration value="CANNOT_CHANGE_CURRENCY"/>
 *     &lt;enumeration value="INVALID_FOR_OFFLINE"/>
 *     &lt;enumeration value="INVALID_LINE_ITEM_DATE_TIME"/>
 *     &lt;enumeration value="INVALID_COST_PER_UNIT_FOR_CPA"/>
 *     &lt;enumeration value="UPDATE_CPA_COST_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="UPDATE_VCPM_COST_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="MASTER_COMPANION_LINE_ITEM_CANNOT_HAVE_VCPM_COST_TYPE"/>
 *     &lt;enumeration value="DUPLICATED_UNIT_TYPE"/>
 *     &lt;enumeration value="MULTIPLE_GOAL_TYPE_NOT_ALLOWED"/>
 *     &lt;enumeration value="INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS"/>
 *     &lt;enumeration value="INVALID_CREATIVE_TARGETING_NAME"/>
 *     &lt;enumeration value="INVALID_CREATIVE_CUSTOM_TARGETING_MATCH_TYPE"/>
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION_TYPE_WITH_CREATIVE_TARGETING"/>
 *     &lt;enumeration value="CANNOT_OVERBOOK_WITH_CREATIVE_TARGETING"/>
 *     &lt;enumeration value="PLACEHOLDERS_DO_NOT_MATCH_PROPOSAL"/>
 *     &lt;enumeration value="UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION"/>
 *     &lt;enumeration value="NATIVE_CREATIVE_TEMPLATE_REQUIRED"/>
 *     &lt;enumeration value="CANNOT_HAVE_CREATIVE_TEMPLATE"/>
 *     &lt;enumeration value="CANNOT_INCLUDE_NATIVE_CREATIVE_TEMPLATE"/>
 *     &lt;enumeration value="CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID"/>
 *     &lt;enumeration value="NO_SIZE_WITH_DURATION"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemError.Reason")
@XmlEnum
public enum LineItemErrorReason {


    /**
     * 
     *                 Some changes may not be allowed because a line item has already started.
     *               
     * 
     */
    ALREADY_STARTED,

    /**
     * 
     *                 Update reservation is not allowed because a line item has
     *                 already started, users must pause the line item first.
     *               
     * 
     */
    UPDATE_RESERVATION_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all creatives is not allowed.
     *               
     * 
     */
    ALL_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Roadblocking to display all master and companion creative set is not allowed.
     *               
     * 
     */
    CREATIVE_SET_ROADBLOCK_NOT_ALLOWED,

    /**
     * 
     *                 Fractional percentage is not allowed.
     *               
     * 
     */
    FRACTIONAL_PERCENTAGE_NOT_ALLOWED,

    /**
     * 
     *                 For certain LineItem configurations discounts are not allowed.
     *               
     * 
     */
    DISCOUNT_NOT_ALLOWED,

    /**
     * 
     *                 Updating a canceled line item is not allowed.
     *               
     * 
     */
    UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Updating a pending approval line item is not allowed.
     *               
     * 
     */
    UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Updating an archived line item is not allowed.
     *               
     * 
     */
    UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED,

    /**
     * 
     *                 Create or update legacy dfp line item type is not allowed.
     *               
     * 
     */
    CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Copying line item from different company (advertiser)
     *                 to the same order is not allowed.
     *               
     * 
     */
    COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED,

    /**
     * 
     *                 The size is invalid for the specified platform.
     *               
     * 
     */
    INVALID_SIZE_FOR_PLATFORM,

    /**
     * 
     *                 The line item type is invalid for the specified platform.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE_FOR_PLATFORM,

    /**
     * 
     *                 The web property cannot be served on the specified platform.
     *               
     * 
     */
    INVALID_WEB_PROPERTY_FOR_PLATFORM,

    /**
     * 
     *                 The web property cannot be served on the specified environment.
     *               
     * 
     */
    INVALID_WEB_PROPERTY_FOR_ENVIRONMENT,

    /**
     * 
     *                 AFMA backfill not supported.
     *               
     * 
     */
    AFMA_BACKFILL_NOT_ALLOWED,

    /**
     * 
     *                 Environment type cannot change once saved.
     *               
     * 
     */
    UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The placeholders are invalid because they contain companions,
     *                 but the line item does not support companions.
     *               
     * 
     */
    COMPANIONS_NOT_ALLOWED,

    /**
     * 
     *                 The placeholders are invalid because some of them are roadblocks,
     *                 and some are not.  Either all roadblock placeholders must contain
     *                 companions, or no placeholders may contain companions.  This does
     *                 not apply to video creative sets.
     *               
     * 
     */
    ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED,

    /**
     * 
     *                 A line item cannot be updated from having
     *                 {@link RoadblockingType#CREATIVE_SET} to having a different
     *                 RoadblockingType, or vice versa.
     *               
     * 
     */
    CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK,

    /**
     * 
     *                 Can not change from a backfill line item type once creatives have been
     *                 assigned.
     *               
     * 
     */
    UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Can not change to a backfill line item type once creatives have been
     *                 assigned.
     *               
     * 
     */
    UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Can not change to backfill web property once creatives have been
     *                 assigned.
     *               
     * 
     */
    UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED,

    /**
     * 
     *                 The companion delivery option is not valid for your environment type.
     *               
     * 
     */
    INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE,

    /**
     * 
     *                 Companion backfill is enabled but environment type not video.
     *               
     * 
     */
    COMPANION_BACKFILL_REQUIRES_VIDEO,

    /**
     * 
     *                 Companion delivery options require premium networks.
     *               
     * 
     */
    COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM,

    /**
     * 
     *                 The master size of placeholders have duplicates.
     *               
     * 
     */
    DUPLICATE_MASTER_SIZES,

    /**
     * 
     *                 The line item priority is invalid if for dynamic allocation line items
     *                 it is different than the default for free publishers.  When allowed,
     *                 Premium publishers can change the priority to any value.
     *               
     * 
     */
    INVALID_PRIORITY_FOR_LINE_ITEM_TYPE,

    /**
     * 
     *                 The environment type is not valid.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE,

    /**
     * 
     *                 The environment type is not valid for the target platform.
     *               
     * 
     */
    INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM,

    /**
     * 
     *                 Only {@link LineItemType#STANDARD} line items can be auto extended.
     *               
     * 
     */
    INVALID_TYPE_FOR_AUTO_EXTENSION,

    /**
     * 
     *                 Video line items cannot change the roadblocking type.
     *               
     * 
     */
    VIDEO_INVALID_ROADBLOCKING,

    /**
     * 
     *                 The backfill feature is not enabled according to your features.
     *               
     * 
     */
    BACKFILL_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 The web property is invalid. A line item must have an appropriate web property selected.
     *               
     * 
     */
    INVALID_BACKFILL_LINK_TYPE,

    /**
     * 
     *                 All line items in a programmatic order must have web property codes from the same account.
     *               
     * 
     */
    DIFFERENT_BACKFILL_ACCOUNT,

    /**
     * 
     *                 Companion delivery options are not allowed with dynamic allocation line
     *                 items.
     *               
     * 
     */
    COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL,

    /**
     * 
     *                 Dynamic allocation using the AdExchange should always use an AFC web
     *                 property.
     *               
     * 
     */
    INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL,

    /**
     * 
     *                 Aspect ratio sizes cannot be used with video line items.
     *               
     * 
     */
    INVALID_SIZE_FOR_ENVIRONMENT,

    /**
     * 
     *                 The specified target platform is not allowed.
     *               
     * 
     */
    TARGET_PLATOFRM_NOT_ALLOWED,

    /**
     * 
     *                 Currency on a line item must be one of the specified network currencies.
     *               
     * 
     */
    INVALID_LINE_ITEM_CURRENCY,

    /**
     * 
     *                 All money fields on a line item must specify the same currency.
     *               
     * 
     */
    LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES,

    /**
     * 
     *                 Once a line item has moved into a a delivering state the currency cannot be changed.
     *               
     * 
     */
    CANNOT_CHANGE_CURRENCY,

    /**
     * 
     *                 The line item settings are invalid for an offline lineitem.
     *               
     * 
     */
    INVALID_FOR_OFFLINE,

    /**
     * 
     *                 A DateTime associated with the line item is not valid.
     *               
     * 
     */
    INVALID_LINE_ITEM_DATE_TIME,

    /**
     * 
     *                 CPA {@link LineItem line items} must specify a zero cost for the
     *                 {@link LineItem#costPerUnit}.
     *               
     * 
     */
    INVALID_COST_PER_UNIT_FOR_CPA,

    /**
     * 
     *                 Once a {@link LineItem} is activated its {@link LineItem#costPerUnit} cannot be updated
     *                 to/from CPA.
     *               
     * 
     */
    UPDATE_CPA_COST_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Once a {@link LineItem} is activated its {@link LineItem#costPerUnit} cannot be updated
     *                 to/from Viewable CPM.
     *               
     * 
     */
    UPDATE_VCPM_COST_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 A {@link LineItem} with master/companion creative placeholders cannot have Viewable CPM
     *                 as its {@link LineItem#costPerUnit}.
     *               
     * 
     */
    MASTER_COMPANION_LINE_ITEM_CANNOT_HAVE_VCPM_COST_TYPE,

    /**
     * 
     *                 There cannot be goals with duplicated unit type among the secondary goals for a
     *                 {@link LineItem line items}.
     *               
     * 
     */
    DUPLICATED_UNIT_TYPE,

    /**
     * 
     *                 The secondary goals of a {@link LineItem line items} must have the same goal type.
     *               
     * 
     */
    MULTIPLE_GOAL_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 For a CPA {@link LineItem line item}, the possible combinations for secondary goals must
     *                 be either click-through conversion only, click-through conversion with view-through
     *                 conversion or total conversion only. For a Viewable CPM {@link LineItem line item} or a
     *                 CPM based Sponsorship {@link LineItem line item}, its secondary goal has to be
     *                 impression-based.
     *               
     * 
     */
    INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS,

    /**
     * 
     *                 One or more of the targeting names specified by a creative placeholder or line item
     *                 creative association were not found on the line item.
     *               
     * 
     */
    INVALID_CREATIVE_TARGETING_NAME,

    /**
     * 
     *                 Creative targeting expressions on the line item can only have custom criteria targeting
     *                 with {@link CustomTargetingValue.MatchType#EXACT}.
     *               
     * 
     */
    INVALID_CREATIVE_CUSTOM_TARGETING_MATCH_TYPE,

    /**
     * 
     *                 Line item with creative targeting expressions cannot have creative rotation type set to
     *                 {@link CreativeRotationType#SEQUENTIAL}.
     *               
     * 
     */
    INVALID_CREATIVE_ROTATION_TYPE_WITH_CREATIVE_TARGETING,

    /**
     * 
     *                 Line items cannot overbook inventory when applying creative-level targeting if the
     *                 originating proposal line item did not overbook inventory. Remove creative-level targeting
     *                 and try again.
     *               
     * 
     */
    CANNOT_OVERBOOK_WITH_CREATIVE_TARGETING,

    /**
     * 
     *                 For a managed line item, inventory sizes must match sizes that are set on the originating
     *                 proposal line item. In the case that a size is broken out by creative-level targeting,
     *                 the sum of the creative counts for each size must equal the expected creative count that
     *                 is set for that size on the originating proposal line item.
     *               
     * 
     */
    PLACEHOLDERS_DO_NOT_MATCH_PROPOSAL,

    /**
     * 
     *                 The line item type is not supported for this API version.
     *               
     * 
     */
    UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION,

    /**
     * 
     *                 Placeholders can only have native creative templates.
     *               
     * 
     */
    NATIVE_CREATIVE_TEMPLATE_REQUIRED,

    /**
     * 
     *                 Non-native placeholders cannot have creative templates.
     *               
     * 
     */
    CANNOT_HAVE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 Cannot include native creative templates in the placeholders for Ad Exchange line items.
     *               
     * 
     */
    CANNOT_INCLUDE_NATIVE_CREATIVE_TEMPLATE,

    /**
     * 
     *                 Cannot include native placeholders without native creative templates for direct-sold line
     *                 items.
     *               
     * 
     */
    CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID,

    /**
     * 
     *                 For forecasting only, error when line item has duration, but no creative sizes specified.
     *               
     * 
     */
    NO_SIZE_WITH_DURATION,

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

    public static LineItemErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
