// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemError.Reason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALREADY_STARTED"/&gt;
 *     &lt;enumeration value="UPDATE_RESERVATION_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ALL_ROADBLOCK_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ALL_COMPANION_DELIVERY_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CREATIVE_SET_ROADBLOCK_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="FRACTIONAL_PERCENTAGE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="DISCOUNT_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_CANCELED_LINE_ITEM_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_PENDING_APPROVAL_LINE_ITEM_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_ARCHIVED_LINE_ITEM_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CREATE_OR_UPDATE_LEGACY_DFP_LINE_ITEM_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="COPY_LINE_ITEM_FROM_DIFFERENT_COMPANY_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_SIZE_FOR_PLATFORM"/&gt;
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE_FOR_PLATFORM"/&gt;
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_PLATFORM"/&gt;
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_ENVIRONMENT"/&gt;
 *     &lt;enumeration value="AFMA_BACKFILL_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_ENVIRONMENT_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="COMPANIONS_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="ROADBLOCKS_WITH_NONROADBLOCKS_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CANNOT_UPDATE_TO_OR_FROM_CREATIVE_SET_ROADBLOCK"/&gt;
 *     &lt;enumeration value="UPDATE_FROM_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_TO_BACKFILL_LINE_ITEM_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_BACKFILL_WEB_PROPERTY_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_COMPANION_DELIVERY_OPTION_FOR_ENVIRONMENT_TYPE"/&gt;
 *     &lt;enumeration value="COMPANION_BACKFILL_REQUIRES_VIDEO"/&gt;
 *     &lt;enumeration value="COMPANION_DELIVERY_OPTION_REQUIRE_PREMIUM"/&gt;
 *     &lt;enumeration value="DUPLICATE_MASTER_SIZES"/&gt;
 *     &lt;enumeration value="INVALID_PRIORITY_FOR_LINE_ITEM_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_ENVIRONMENT_TYPE_FOR_PLATFORM"/&gt;
 *     &lt;enumeration value="INVALID_TYPE_FOR_AUTO_EXTENSION"/&gt;
 *     &lt;enumeration value="VIDEO_INVALID_ROADBLOCKING"/&gt;
 *     &lt;enumeration value="BACKFILL_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_BACKFILL_LINK_TYPE"/&gt;
 *     &lt;enumeration value="DIFFERENT_BACKFILL_ACCOUNT"/&gt;
 *     &lt;enumeration value="COMPANION_DELIVERY_OPTIONS_NOT_ALLOWED_WITH_BACKFILL"/&gt;
 *     &lt;enumeration value="INVALID_WEB_PROPERTY_FOR_ADX_BACKFILL"/&gt;
 *     &lt;enumeration value="INVALID_COST_PER_UNIT_FOR_BACKFILL"/&gt;
 *     &lt;enumeration value="INVALID_SIZE_FOR_ENVIRONMENT"/&gt;
 *     &lt;enumeration value="TARGET_PLATOFRM_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_LINE_ITEM_CURRENCY"/&gt;
 *     &lt;enumeration value="LINE_ITEM_CANNOT_HAVE_MULTIPLE_CURRENCIES"/&gt;
 *     &lt;enumeration value="CANNOT_CHANGE_CURRENCY"/&gt;
 *     &lt;enumeration value="INVALID_LINE_ITEM_DATE_TIME"/&gt;
 *     &lt;enumeration value="INVALID_COST_PER_UNIT_FOR_CPA"/&gt;
 *     &lt;enumeration value="UPDATE_CPA_COST_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="UPDATE_VCPM_COST_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="MASTER_COMPANION_LINE_ITEM_CANNOT_HAVE_VCPM_COST_TYPE"/&gt;
 *     &lt;enumeration value="DUPLICATED_UNIT_TYPE"/&gt;
 *     &lt;enumeration value="MULTIPLE_GOAL_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="INVALID_UNIT_TYPE_COMBINATION_FOR_SECONDARY_GOALS"/&gt;
 *     &lt;enumeration value="INVALID_CREATIVE_TARGETING_NAME"/&gt;
 *     &lt;enumeration value="INVALID_CREATIVE_CUSTOM_TARGETING_MATCH_TYPE"/&gt;
 *     &lt;enumeration value="INVALID_CREATIVE_ROTATION_TYPE_WITH_CREATIVE_TARGETING"/&gt;
 *     &lt;enumeration value="CANNOT_OVERBOOK_WITH_CREATIVE_TARGETING"/&gt;
 *     &lt;enumeration value="PLACEHOLDERS_DO_NOT_MATCH_PROPOSAL"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_LINE_ITEM_TYPE_FOR_THIS_API_VERSION"/&gt;
 *     &lt;enumeration value="NATIVE_CREATIVE_TEMPLATE_REQUIRED"/&gt;
 *     &lt;enumeration value="CANNOT_HAVE_CREATIVE_TEMPLATE"/&gt;
 *     &lt;enumeration value="CANNOT_INCLUDE_NATIVE_CREATIVE_TEMPLATE"/&gt;
 *     &lt;enumeration value="CANNOT_INCLUDE_NATIVE_PLACEHOLDER_WITHOUT_TEMPLATE_ID"/&gt;
 *     &lt;enumeration value="NO_SIZE_WITH_DURATION"/&gt;
 *     &lt;enumeration value="INVALID_VIEWABILITY_PROVIDER_COMPANY"/&gt;
 *     &lt;enumeration value="CANNOT_ACCESS_CUSTOM_PACING_CURVE_CLOUD_STORAGE_BUCKET"/&gt;
 *     &lt;enumeration value="CMS_METADATA_LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED"/&gt;
 *     &lt;enumeration value="SKIPPABLE_AD_TYPE_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="CUSTOM_PACING_CURVE_START_TIME_MUST_MATCH_LINE_ITEM_START_TIME"/&gt;
 *     &lt;enumeration value="CUSTOM_PACING_CURVE_START_TIME_PAST_LINE_ITEM_END_TIME"/&gt;
 *     &lt;enumeration value="INVALID_LINE_ITEM_TYPE_FOR_DELIVERY_FORECAST_SOURCE"/&gt;
 *     &lt;enumeration value="INVALID_TOTAL_CUSTOM_PACING_GOAL_AMOUNTS"/&gt;
 *     &lt;enumeration value="COPY_LINE_ITEM_WITH_CUSTOM_PACING_CURVE_FULLY_IN_PAST_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="LAST_CUSTOM_PACING_GOAL_AMOUNT_CANNOT_BE_ZERO"/&gt;
 *     &lt;enumeration value="GRP_PACED_LINE_ITEM_CANNOT_HAVE_ABSOLUTE_CUSTOM_PACING_CURVE_GOALS"/&gt;
 *     &lt;enumeration value="INVALID_MAX_VIDEO_CREATIVE_DURATION"/&gt;
 *     &lt;enumeration value="INVALID_NATIVE_SIZE"/&gt;
 *     &lt;enumeration value="INVALID_TARGETED_REQUEST_PLATFORM_FOR_WEB_PROPERTY_CODE"/&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     *                 Companion delivery to display all creatives is not allowed.
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
     *                 Companion delivery options require Ad Manager 360 networks.
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
     *                 Ad Manager 360 users can change the priority to any value.
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
     *                 CPM for backfill inventory must be 0.
     *               
     * 
     */
    INVALID_COST_PER_UNIT_FOR_BACKFILL,

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
     *                 Used when the company pointed to by the viewabilityProviderCompanyId is not of type
     *                 VIEWABILITY_PROVIDER.
     *               
     * 
     */
    INVALID_VIEWABILITY_PROVIDER_COMPANY,

    /**
     * 
     *                 An error occurred while accessing the custom pacing curve Google Cloud Storage bucket.
     *               
     * 
     */
    CANNOT_ACCESS_CUSTOM_PACING_CURVE_CLOUD_STORAGE_BUCKET,

    /**
     * 
     *                 CMS Metadata targeting is only supported for video line items.
     *               
     * 
     */
    CMS_METADATA_LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 The {@code SkippableAdType} is not allowed.
     *               
     * 
     */
    SKIPPABLE_AD_TYPE_NOT_ALLOWED,

    /**
     * 
     *                 Custom pacing curve start time must match the line item's start time.
     *               
     * 
     */
    CUSTOM_PACING_CURVE_START_TIME_MUST_MATCH_LINE_ITEM_START_TIME,

    /**
     * 
     *                 Custom pacing curve goal start time must be before line item end time.
     *               
     * 
     */
    CUSTOM_PACING_CURVE_START_TIME_PAST_LINE_ITEM_END_TIME,

    /**
     * 
     *                 The line item type is invalid for the specified delivery forecast source.
     *               
     * 
     */
    INVALID_LINE_ITEM_TYPE_FOR_DELIVERY_FORECAST_SOURCE,

    /**
     * 
     *                 The sum of the custom pacing goal amounts is invalid.
     *               
     * 
     */
    INVALID_TOTAL_CUSTOM_PACING_GOAL_AMOUNTS,

    /**
     * 
     *                 Copying line items with custom pacing curves that are totally in the past is not allowed.
     *               
     * 
     */
    COPY_LINE_ITEM_WITH_CUSTOM_PACING_CURVE_FULLY_IN_PAST_NOT_ALLOWED,

    /**
     * 
     *                 The last custom pacing goal cannot be zero.
     *               
     * 
     */
    LAST_CUSTOM_PACING_GOAL_AMOUNT_CANNOT_BE_ZERO,

    /**
     * 
     *                 GRP paced line items cannot have absolute custom pacing curve goals.
     *               
     * 
     */
    GRP_PACED_LINE_ITEM_CANNOT_HAVE_ABSOLUTE_CUSTOM_PACING_CURVE_GOALS,

    /**
     * 
     *                 {@link LineItem line item} has invalid video creative duration.
     *               
     * 
     */
    INVALID_MAX_VIDEO_CREATIVE_DURATION,

    /**
     * 
     *                 Native size types must by 1x1.
     *               
     * 
     */
    INVALID_NATIVE_SIZE,

    /**
     * 
     *                 For AdExchange Line Items, the targeted request platform must match the syndication type of
     *                 the web property code.
     *               
     * 
     */
    INVALID_TARGETED_REQUEST_PLATFORM_FOR_WEB_PROPERTY_CODE,

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
