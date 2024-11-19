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

/**
 * LineItemSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202411;


/**
 * The {@code LineItemSummary} represents the base class from which
 * a {@code LineItem} is derived.
 */
public class LineItemSummary  implements java.io.Serializable {
    /* The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This attribute is required. */
    private java.lang.Long orderId;

    /* Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is assigned by Google
     *                 when a line item is created. */
    private java.lang.Long id;

    /* The name of the line item. This attribute is required and has
     * a maximum length of 255
     *                 characters. */
    private java.lang.String name;

    /* An identifier for the {@code LineItem} that is meaningful to
     * the publisher. This attribute is
     *                 optional and has a maximum length of 255 characters. */
    private java.lang.String externalId;

    /* The name of the {@link Order}. This value is read-only. */
    private java.lang.String orderName;

    /* The date and time on which the {@code LineItem} is enabled
     * to begin serving. This attribute is
     *                 required and must be in the future. */
    private com.google.api.ads.admanager.axis.v202411.DateTime startDateTime;

    /* Specifies whether to start serving to the {@code LineItem}
     * right away, in an hour, etc. This
     *                 attribute is optional and defaults to {@link StartDateTimeType#USE_START_DATE_TIME}. */
    private com.google.api.ads.admanager.axis.v202411.StartDateTimeType startDateTimeType;

    /* The date and time on which the {@code LineItem} will stop serving.
     * This attribute is required
     *                 unless {@link LineItem#unlimitedEndDateTime} is set
     * to {@code true}. If specified, it must be
     *                 after the {@link LineItem#startDateTime}. This end
     * date and time does not include auto
     *                 extension days. */
    private com.google.api.ads.admanager.axis.v202411.DateTime endDateTime;

    /* The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum of
     *                 7 days is allowed. This is feature is only available
     * for Ad Manager 360 accounts. */
    private java.lang.Integer autoExtensionDays;

    /* Specifies whether or not the {@code LineItem} has an end time.
     * This attribute is optional and
     *                 defaults to false. It can be be set to {@code true}
     * for only line items of type {@link
     *                 LineItemType#SPONSORSHIP}, {@link LineItemType#NETWORK},
     * {@link LineItemType#PRICE_PRIORITY}
     *                 and {@link LineItemType#HOUSE}. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are associated with the
     *                 {@code LineItem}. This attribute is required. */
    private com.google.api.ads.admanager.axis.v202411.CreativeRotationType creativeRotationType;

    /* The strategy for delivering ads over the course of the line
     * item's duration. This attribute is
     *                 optional and defaults to {@link DeliveryRateType#EVENLY}
     * or {@link
     *                 DeliveryRateType#FRONTLOADED} depending on the network's
     * configuration. */
    private com.google.api.ads.admanager.axis.v202411.DeliveryRateType deliveryRateType;

    /* Strategy for choosing forecasted traffic shapes to pace line
     * items. This field is optional and
     *                 defaults to {@link DeliveryForecastSource#HISTORICAL}. */
    private com.google.api.ads.admanager.axis.v202411.DeliveryForecastSource deliveryForecastSource;

    /* The curve that is used to pace the line item's delivery. This
     * field is required if and only if
     *                 the delivery forecast source is {@link DeliveryForecastSource#CUSTOM_PACING_CURVE}. */
    private com.google.api.ads.admanager.axis.v202411.CustomPacingCurve customPacingCurve;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where multiple creatives must be
     *                 served together on a single web page. This attribute
     * is optional and defaults to {@link
     *                 RoadblockingType#ONE_OR_MORE}. */
    private com.google.api.ads.admanager.axis.v202411.RoadblockingType roadblockingType;

    /* The nature of the line item's creatives' skippability. This
     * attribute is optional, only
     *                 applicable for video line items, and defaults to {@link
     * SkippableAdType#NOT_SKIPPABLE}. */
    private com.google.api.ads.admanager.axis.v202411.SkippableAdType skippableAdType;

    /* The set of frequency capping units for this {@code LineItem}.
     * This attribute is optional. */
    private com.google.api.ads.admanager.axis.v202411.FrequencyCap[] frequencyCaps;

    /* Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     *                 
     *                 <p>The line item type determines the default priority
     * of the line item. More information can be
     *                 found on the <a href="https://support.google.com/admanager/answer/177279">Ad
     * Manager Help
     *                 Center</a>. */
    private com.google.api.ads.admanager.axis.v202411.LineItemType lineItemType;

    /* The priority for the line item. Valid values range from 1 to
     * 16. This field is optional and
     *                 defaults to the default priority of the {@link LineItemType}.
     * 
     *                 <p>The following table shows the default, minimum,
     * and maximum priority values are for each
     *                 line item type:
     *                 
     *                 <table>
     *                 <tr>
     *                 <th colspan="2" scope="col">
     *                 LineItemType - default priority (minimum priority,
     * maximum priority)
     *                 </th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4 (2, 5)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8 (6, 10)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16 (15, 16)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#CLICK_TRACKING}</td>
     *                 <td>16 (1, 16)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#AD_EXCHANGE}</td>
     *                 <td>12 (1, 16)</td>
     *                 </tr>
     *                 <td>{@link LineItemType#ADSENSE}</td>
     *                 <td>12 (1, 16)</td>
     *                 </tr>
     *                 <td>{@link LineItemType#BUMPER}</td>
     *                 <td>16 (15, 16)</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 <p>This field can only be edited by certain networks,
     * otherwise a {@link PermissionError} will
     *                 occur. */
    private java.lang.Integer priority;

    /* The amount of money to spend per impression or click. This
     * attribute is required for creating a
     *                 {@code LineItem}. */
    private com.google.api.ads.admanager.axis.v202411.Money costPerUnit;

    /* An amount to help the adserver rank inventory. {@link LineItem#valueCostPerUnit}
     * artificially
     *                 raises the value of inventory over the {@link LineItem#costPerUnit}
     * but avoids raising the
     *                 actual {@link LineItem#costPerUnit}. This attribute
     * is optional and defaults to a {@link Money}
     *                 object in the local currency with {@link Money#microAmount}
     * 0. */
    private com.google.api.ads.admanager.axis.v202411.Money valueCostPerUnit;

    /* The method used for billing this {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.admanager.axis.v202411.CostType costType;

    /* The type of discount being applied to a {@code LineItem}, either
     * percentage based or absolute.
     *                 This attribute is optional and defaults to {@link
     * LineItemDiscountType#PERCENTAGE}. */
    private com.google.api.ads.admanager.axis.v202411.LineItemDiscountType discountType;

    /* The number here is either a percentage or an absolute value
     * depending on the {@code
     *                 LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is {@link
     *                 LineItemDiscountType#PERCENTAGE}, then only non-fractional
     * values are supported. */
    private java.lang.Double discount;

    /* This attribute is only applicable for certain {@link #lineItemType
     * line item types} and acts as
     *                 an "FYI" or note, which does not impact adserving
     * or other backend systems.
     *                 
     *                 <p>For {@link LineItemType#SPONSORSHIP} line items,
     * this represents the minimum quantity, which
     *                 is a lifetime impression volume goal for reporting
     * purposes only.
     *                 
     *                 <p>For {@link LineItemType#STANDARD} line items, this
     * represent the contracted quantity, which
     *                 is the number of units specified in the contract the
     * advertiser has bought for this {@code
     *                 LineItem}. This field is just a "FYI" for traffickers
     * to manually intervene with the {@code
     *                 LineItem} when needed. This attribute is only available
     * for {@link LineItemType#STANDARD} line
     *                 items if you have this feature enabled on your network. */
    private java.lang.Long contractedUnitsBought;

    /* Details about the creatives that are expected to serve through
     * this {@code LineItem}. This
     *                 attribute is required and replaces the {@code creativeSizes}
     * attribute. */
    private com.google.api.ads.admanager.axis.v202411.CreativePlaceholder[] creativePlaceholders;

    /* This attribute is required and meaningful only if the {@link
     * LineItem#costType} is {@link
     *                 CostType.CPA}. */
    private com.google.api.ads.admanager.axis.v202411.LineItemActivityAssociation[] activityAssociations;

    /* The environment that the {@code LineItem} is targeting. The
     * default value is {@link
     *                 EnvironmentType#BROWSER}. If this value is {@link
     * EnvironmentType#VIDEO_PLAYER}, then this line
     *                 item can only target {@code AdUnits} that have {@code
     * AdUnitSizes} whose {@code
     *                 environmentType} is also {@code VIDEO_PLAYER}. */
    private com.google.api.ads.admanager.axis.v202411.EnvironmentType environmentType;

    /* The set of {@link allowedFormats} that this programmatic line
     * item can have. If the set is
     *                 empty, this line item allows all formats. */
    private com.google.api.ads.admanager.axis.v202411.AllowedFormats[] allowedFormats;

    /* The delivery option for companions. Setting this field is only
     * meaningful if the following
     *                 conditions are met:
     *                 
     *                 <ol>
     *                 <li>The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 <li>One of the following is true (both cannot be true,
     * these are mutually exclusive).
     *                 <ul>
     *                 <li>The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * <li>The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </ul>
     *                 </ol>
     *                 
     *                 <p>This field is optional and defaults to {@link CompanionDeliveryOption#OPTIONAL}
     * if the above
     *                 conditions are met. In all other cases it defaults
     * to {@link CompanionDeliveryOption#UNKNOWN}
     *                 and is not meaningful. */
    private com.google.api.ads.admanager.axis.v202411.CompanionDeliveryOption companionDeliveryOption;

    /* The flag indicates whether overbooking should be allowed when
     * creating or updating reservations
     *                 of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When
     *                 true, operations on this line item will never trigger
     * a {@link ForecastError}, which
     *                 corresponds to an overbook warning in the UI. The
     * default value is false.
     *                 
     *                 <p>Note: this field will not persist on the line item
     * itself, and the value will only affect
     *                 the current request. */
    private java.lang.Boolean allowOverbook;

    /* The flag indicates whether the inventory check should be skipped
     * when creating or updating a
     *                 line item. The default value is false.
     *                 
     *                 <p>Note: this field will not persist on the line item
     * itself, and the value will only affect
     *                 the current request. */
    private java.lang.Boolean skipInventoryCheck;

    /* True to skip checks for warnings from rules applied to line
     * items targeting inventory shared by
     *                 a distributor partner for cross selling when performing
     * an action on this line item. The
     *                 default is false. */
    private java.lang.Boolean skipCrossSellingRuleWarningChecks;

    /* The flag indicates whether inventory should be reserved when
     * creating a line item of types
     *                 {@link LineItemType#SPONSORSHIP} and {@link LineItemType#STANDARD}
     * in an unapproved {@link
     *                 Order}. The default value is false. */
    private java.lang.Boolean reserveAtCreation;

    /* Contains trafficking statistics for the line item. This attribute
     * is readonly and is populated
     *                 by Google. This will be {@code null} in case there
     * are no statistics for a line item yet. */
    private com.google.api.ads.admanager.axis.v202411.Stats stats;

    /* Indicates how well the line item has been performing. This
     * attribute is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery indicator information is not
     *                 available due to one of the following reasons:
     *                 
     *                 <ol>
     *                 <li>The line item is not delivering.
     *                 <li>The line item has an unlimited goal or cap.
     *                 <li>The line item has a percentage based goal or cap.
     * </ol> */
    private com.google.api.ads.admanager.axis.v202411.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for a {@link LineItem} in
     *                 the last 7 days. This attribute is readonly and is
     * populated by Google. This will be {@code
     *                 null} if the delivery data cannot be computed due
     * to one of the following reasons:
     *                 
     *                 <ol>
     *                 <li>The line item is not deliverable.
     *                 <li>The line item has completed delivering more than
     * 7 days ago.
     *                 <li>The line item has an absolute-based goal. {@link
     * LineItem#deliveryIndicator} should be
     *                 used to track its progress in this case. */
    private com.google.api.ads.admanager.axis.v202411.DeliveryData deliveryData;

    /* The amount of money allocated to the {@code LineItem}. This
     * attribute is readonly and is
     *                 populated by Google. The currency code is readonly. */
    private com.google.api.ads.admanager.axis.v202411.Money budget;

    /* The status of the {@code LineItem}. This attribute is readonly. */
    private com.google.api.ads.admanager.axis.v202411.ComputedStatus status;

    /* Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute
     *                 is readonly and is assigned by Google. */
    private com.google.api.ads.admanager.axis.v202411.LineItemSummaryReservationStatus reservationStatus;

    /* The archival status of the {@code LineItem}. This attribute
     * is readonly. */
    private java.lang.Boolean isArchived;

    /* The web property code used for dynamic allocation line items.
     * This web property is only
     *                 required with line item types {@link LineItemType#AD_EXCHANGE}
     * and {@link
     *                 LineItemType#ADSENSE}. */
    private java.lang.String webPropertyCode;

    /* The set of labels applied directly to this line item. */
    private com.google.api.ads.admanager.axis.v202411.AppliedLabel[] appliedLabels;

    /* Contains the set of labels inherited from the order that contains
     * this line item and the
     *                 advertiser that owns the order. If a label has been
     * negated, only the negated label is
     *                 returned. This field is readonly and is assigned by
     * Google. */
    private com.google.api.ads.admanager.axis.v202411.AppliedLabel[] effectiveAppliedLabels;

    /* If a line item has a series of competitive exclusions on it,
     * it could be blocked from serving
     *                 with line items from the same advertiser. Setting
     * this to {@code true} will allow line items
     *                 from the same advertiser to serve regardless of the
     * other competitive exclusion labels being
     *                 applied. */
    private java.lang.Boolean disableSameAdvertiserCompetitiveExclusion;

    /* The application that last modified this line item. This attribute
     * is read only and is assigned
     *                 by Google. */
    private java.lang.String lastModifiedByApp;

    /* Provides any additional notes that may annotate the {@code
     * LineItem}. This attribute is
     *                 optional and has a maximum length of 65,535 characters. */
    private java.lang.String notes;

    /* The {@code CompetitiveConstraintScope} for the competitive
     * exclusion labels assigned to this
     *                 line item. This field is optional, defaults to {@link
     * CompetitiveConstraintScope#POD}, and only
     *                 applies to video line items. */
    private com.google.api.ads.admanager.axis.v202411.CompetitiveConstraintScope competitiveConstraintScope;

    /* The date and time this line item was last modified. */
    private com.google.api.ads.admanager.axis.v202411.DateTime lastModifiedDateTime;

    /* This attribute may be {@code null} for line items created before
     * this feature was introduced. */
    private com.google.api.ads.admanager.axis.v202411.DateTime creationDateTime;

    /* The values of the custom fields associated with this line item. */
    private com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue[] customFieldValues;

    /* Indicates if a {@code LineItem} is missing any {@link Creative
     * creatives} for the {@code
     *                 creativePlaceholders} specified.
     *                 
     *                 <p>{@link Creative Creatives} can be considered missing
     * for several reasons including:
     *                 
     *                 <ul>
     *                 <li>Not enough {@link Creative creatives} of a certain
     * size have been uploaded, as determined
     *                 by {@link CreativePlaceholder#expectedCreativeCount}.
     * For example a {@code LineItem}
     *                 specifies 750x350, 400x200 but only a 750x350 was
     * uploaded. Or {@code LineItem} specifies
     *                 750x350 with an expected count of 2, but only one
     * was uploaded.
     *                 <li>The {@link Creative#appliedLabels} of an associated
     * {@code Creative} do not match the
     *                 {@link CreativePlaceholder#effectiveAppliedLabels}
     * of the {@code LineItem}. For example
     *                 {@code LineItem} specifies 750x350 with a Foo {@code
     * AppliedLabel} but a 750x350 creative
     *                 without a {@code AppliedLabel} was uploaded.
     *                 </ul> */
    private java.lang.Boolean isMissingCreatives;

    /* Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item. This is a
     *                 read-only field. Any changes must be made on the {@link
     * ProposalLineItem}. */
    private com.google.api.ads.admanager.axis.v202411.ProgrammaticCreativeSource programmaticCreativeSource;

    private com.google.api.ads.admanager.axis.v202411.ThirdPartyMeasurementSettings thirdPartyMeasurementSettings;

    /* Designates this line item as intended for YT Kids app. If true,
     * all creatives associated with
     *                 this line item must be reviewed and approved. See
     * the <a
     *                 href="https://support.google.com/yt-partner-sales/answer/10015534">Ad
     * Manager Help Center </a>
     *                 for more information. */
    private java.lang.Boolean youtubeKidsRestricted;

    /* The max duration of a video creative associated with this {@code
     * LineItem} in milliseconds.
     *                 
     *                 <p>This attribute is only meaningful for video line
     * items. For version v202011 and earlier,
     *                 this attribute is optional and defaults to 0. For
     * version v202102 and later, this attribute is
     *                 required for video line items and must be greater
     * than 0. */
    private java.lang.Long videoMaxDuration;

    /* The primary goal that this {@code LineItem} is associated with,
     * which is used in its pacing and
     *                 budgeting. */
    private com.google.api.ads.admanager.axis.v202411.Goal primaryGoal;

    /* The secondary goals that this {@code LineItem} is associated
     * with. It is required and
     *                 meaningful only if the {@link LineItem#costType} is
     * {@link CostType.CPA} or if the {@link
     *                 LineItem#lineItemType} is {@link LineItemType#SPONSORSHIP}
     * and {@link LineItem#costType} is
     *                 {@link CostType.CPM}. */
    private com.google.api.ads.admanager.axis.v202411.Goal[] secondaryGoals;

    /* Contains the information for a line item which has a target
     * GRP demographic. */
    private com.google.api.ads.admanager.axis.v202411.GrpSettings grpSettings;

    /* The deal information associated with this line item, if it
     * is programmatic. */
    private com.google.api.ads.admanager.axis.v202411.LineItemDealInfoDto dealInfo;

    /* Optional IDs of the {@link Company} that provide ad verification
     * for this line item. {@link
     *                 Company.Type#VIEWABILITY_PROVIDER}. */
    private long[] viewabilityProviderCompanyIds;

    /* Child content eligibility designation for this line item.
     *                 
     *                 <p>This field is optional and defaults to {@link ChildContentEligibility#DISALLOWED}. */
    private com.google.api.ads.admanager.axis.v202411.ChildContentEligibility childContentEligibility;

    /* Custom XML to be rendered in a custom VAST response at serving
     * time. */
    private java.lang.String customVastExtension;

    public LineItemSummary() {
    }

    public LineItemSummary(
           java.lang.Long orderId,
           java.lang.Long id,
           java.lang.String name,
           java.lang.String externalId,
           java.lang.String orderName,
           com.google.api.ads.admanager.axis.v202411.DateTime startDateTime,
           com.google.api.ads.admanager.axis.v202411.StartDateTimeType startDateTimeType,
           com.google.api.ads.admanager.axis.v202411.DateTime endDateTime,
           java.lang.Integer autoExtensionDays,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.admanager.axis.v202411.CreativeRotationType creativeRotationType,
           com.google.api.ads.admanager.axis.v202411.DeliveryRateType deliveryRateType,
           com.google.api.ads.admanager.axis.v202411.DeliveryForecastSource deliveryForecastSource,
           com.google.api.ads.admanager.axis.v202411.CustomPacingCurve customPacingCurve,
           com.google.api.ads.admanager.axis.v202411.RoadblockingType roadblockingType,
           com.google.api.ads.admanager.axis.v202411.SkippableAdType skippableAdType,
           com.google.api.ads.admanager.axis.v202411.FrequencyCap[] frequencyCaps,
           com.google.api.ads.admanager.axis.v202411.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.admanager.axis.v202411.Money costPerUnit,
           com.google.api.ads.admanager.axis.v202411.Money valueCostPerUnit,
           com.google.api.ads.admanager.axis.v202411.CostType costType,
           com.google.api.ads.admanager.axis.v202411.LineItemDiscountType discountType,
           java.lang.Double discount,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.admanager.axis.v202411.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.admanager.axis.v202411.LineItemActivityAssociation[] activityAssociations,
           com.google.api.ads.admanager.axis.v202411.EnvironmentType environmentType,
           com.google.api.ads.admanager.axis.v202411.AllowedFormats[] allowedFormats,
           com.google.api.ads.admanager.axis.v202411.CompanionDeliveryOption companionDeliveryOption,
           java.lang.Boolean allowOverbook,
           java.lang.Boolean skipInventoryCheck,
           java.lang.Boolean skipCrossSellingRuleWarningChecks,
           java.lang.Boolean reserveAtCreation,
           com.google.api.ads.admanager.axis.v202411.Stats stats,
           com.google.api.ads.admanager.axis.v202411.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.admanager.axis.v202411.DeliveryData deliveryData,
           com.google.api.ads.admanager.axis.v202411.Money budget,
           com.google.api.ads.admanager.axis.v202411.ComputedStatus status,
           com.google.api.ads.admanager.axis.v202411.LineItemSummaryReservationStatus reservationStatus,
           java.lang.Boolean isArchived,
           java.lang.String webPropertyCode,
           com.google.api.ads.admanager.axis.v202411.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202411.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           java.lang.String lastModifiedByApp,
           java.lang.String notes,
           com.google.api.ads.admanager.axis.v202411.CompetitiveConstraintScope competitiveConstraintScope,
           com.google.api.ads.admanager.axis.v202411.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202411.DateTime creationDateTime,
           com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue[] customFieldValues,
           java.lang.Boolean isMissingCreatives,
           com.google.api.ads.admanager.axis.v202411.ProgrammaticCreativeSource programmaticCreativeSource,
           com.google.api.ads.admanager.axis.v202411.ThirdPartyMeasurementSettings thirdPartyMeasurementSettings,
           java.lang.Boolean youtubeKidsRestricted,
           java.lang.Long videoMaxDuration,
           com.google.api.ads.admanager.axis.v202411.Goal primaryGoal,
           com.google.api.ads.admanager.axis.v202411.Goal[] secondaryGoals,
           com.google.api.ads.admanager.axis.v202411.GrpSettings grpSettings,
           com.google.api.ads.admanager.axis.v202411.LineItemDealInfoDto dealInfo,
           long[] viewabilityProviderCompanyIds,
           com.google.api.ads.admanager.axis.v202411.ChildContentEligibility childContentEligibility,
           java.lang.String customVastExtension) {
           this.orderId = orderId;
           this.id = id;
           this.name = name;
           this.externalId = externalId;
           this.orderName = orderName;
           this.startDateTime = startDateTime;
           this.startDateTimeType = startDateTimeType;
           this.endDateTime = endDateTime;
           this.autoExtensionDays = autoExtensionDays;
           this.unlimitedEndDateTime = unlimitedEndDateTime;
           this.creativeRotationType = creativeRotationType;
           this.deliveryRateType = deliveryRateType;
           this.deliveryForecastSource = deliveryForecastSource;
           this.customPacingCurve = customPacingCurve;
           this.roadblockingType = roadblockingType;
           this.skippableAdType = skippableAdType;
           this.frequencyCaps = frequencyCaps;
           this.lineItemType = lineItemType;
           this.priority = priority;
           this.costPerUnit = costPerUnit;
           this.valueCostPerUnit = valueCostPerUnit;
           this.costType = costType;
           this.discountType = discountType;
           this.discount = discount;
           this.contractedUnitsBought = contractedUnitsBought;
           this.creativePlaceholders = creativePlaceholders;
           this.activityAssociations = activityAssociations;
           this.environmentType = environmentType;
           this.allowedFormats = allowedFormats;
           this.companionDeliveryOption = companionDeliveryOption;
           this.allowOverbook = allowOverbook;
           this.skipInventoryCheck = skipInventoryCheck;
           this.skipCrossSellingRuleWarningChecks = skipCrossSellingRuleWarningChecks;
           this.reserveAtCreation = reserveAtCreation;
           this.stats = stats;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.budget = budget;
           this.status = status;
           this.reservationStatus = reservationStatus;
           this.isArchived = isArchived;
           this.webPropertyCode = webPropertyCode;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
           this.lastModifiedByApp = lastModifiedByApp;
           this.notes = notes;
           this.competitiveConstraintScope = competitiveConstraintScope;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.creationDateTime = creationDateTime;
           this.customFieldValues = customFieldValues;
           this.isMissingCreatives = isMissingCreatives;
           this.programmaticCreativeSource = programmaticCreativeSource;
           this.thirdPartyMeasurementSettings = thirdPartyMeasurementSettings;
           this.youtubeKidsRestricted = youtubeKidsRestricted;
           this.videoMaxDuration = videoMaxDuration;
           this.primaryGoal = primaryGoal;
           this.secondaryGoals = secondaryGoals;
           this.grpSettings = grpSettings;
           this.dealInfo = dealInfo;
           this.viewabilityProviderCompanyIds = viewabilityProviderCompanyIds;
           this.childContentEligibility = childContentEligibility;
           this.customVastExtension = customVastExtension;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("activityAssociations", getActivityAssociations())
            .add("allowOverbook", getAllowOverbook())
            .add("allowedFormats", getAllowedFormats())
            .add("appliedLabels", getAppliedLabels())
            .add("autoExtensionDays", getAutoExtensionDays())
            .add("budget", getBudget())
            .add("childContentEligibility", getChildContentEligibility())
            .add("companionDeliveryOption", getCompanionDeliveryOption())
            .add("competitiveConstraintScope", getCompetitiveConstraintScope())
            .add("contractedUnitsBought", getContractedUnitsBought())
            .add("costPerUnit", getCostPerUnit())
            .add("costType", getCostType())
            .add("creationDateTime", getCreationDateTime())
            .add("creativePlaceholders", getCreativePlaceholders())
            .add("creativeRotationType", getCreativeRotationType())
            .add("customFieldValues", getCustomFieldValues())
            .add("customPacingCurve", getCustomPacingCurve())
            .add("customVastExtension", getCustomVastExtension())
            .add("dealInfo", getDealInfo())
            .add("deliveryData", getDeliveryData())
            .add("deliveryForecastSource", getDeliveryForecastSource())
            .add("deliveryIndicator", getDeliveryIndicator())
            .add("deliveryRateType", getDeliveryRateType())
            .add("disableSameAdvertiserCompetitiveExclusion", getDisableSameAdvertiserCompetitiveExclusion())
            .add("discount", getDiscount())
            .add("discountType", getDiscountType())
            .add("effectiveAppliedLabels", getEffectiveAppliedLabels())
            .add("endDateTime", getEndDateTime())
            .add("environmentType", getEnvironmentType())
            .add("externalId", getExternalId())
            .add("frequencyCaps", getFrequencyCaps())
            .add("grpSettings", getGrpSettings())
            .add("id", getId())
            .add("isArchived", getIsArchived())
            .add("isMissingCreatives", getIsMissingCreatives())
            .add("lastModifiedByApp", getLastModifiedByApp())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lineItemType", getLineItemType())
            .add("name", getName())
            .add("notes", getNotes())
            .add("orderId", getOrderId())
            .add("orderName", getOrderName())
            .add("primaryGoal", getPrimaryGoal())
            .add("priority", getPriority())
            .add("programmaticCreativeSource", getProgrammaticCreativeSource())
            .add("reservationStatus", getReservationStatus())
            .add("reserveAtCreation", getReserveAtCreation())
            .add("roadblockingType", getRoadblockingType())
            .add("secondaryGoals", getSecondaryGoals())
            .add("skipCrossSellingRuleWarningChecks", getSkipCrossSellingRuleWarningChecks())
            .add("skipInventoryCheck", getSkipInventoryCheck())
            .add("skippableAdType", getSkippableAdType())
            .add("startDateTime", getStartDateTime())
            .add("startDateTimeType", getStartDateTimeType())
            .add("stats", getStats())
            .add("status", getStatus())
            .add("thirdPartyMeasurementSettings", getThirdPartyMeasurementSettings())
            .add("unlimitedEndDateTime", getUnlimitedEndDateTime())
            .add("valueCostPerUnit", getValueCostPerUnit())
            .add("videoMaxDuration", getVideoMaxDuration())
            .add("viewabilityProviderCompanyIds", getViewabilityProviderCompanyIds())
            .add("webPropertyCode", getWebPropertyCode())
            .add("youtubeKidsRestricted", getYoutubeKidsRestricted())
            .toString();
    }

    /**
     * Gets the orderId value for this LineItemSummary.
     * 
     * @return orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This attribute is required.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this LineItemSummary.
     * 
     * @param orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This attribute is required.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the id value for this LineItemSummary.
     * 
     * @return id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is assigned by Google
     *                 when a line item is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LineItemSummary.
     * 
     * @param id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is assigned by Google
     *                 when a line item is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LineItemSummary.
     * 
     * @return name   * The name of the line item. This attribute is required and has
     * a maximum length of 255
     *                 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineItemSummary.
     * 
     * @param name   * The name of the line item. This attribute is required and has
     * a maximum length of 255
     *                 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the externalId value for this LineItemSummary.
     * 
     * @return externalId   * An identifier for the {@code LineItem} that is meaningful to
     * the publisher. This attribute is
     *                 optional and has a maximum length of 255 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this LineItemSummary.
     * 
     * @param externalId   * An identifier for the {@code LineItem} that is meaningful to
     * the publisher. This attribute is
     *                 optional and has a maximum length of 255 characters.
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the orderName value for this LineItemSummary.
     * 
     * @return orderName   * The name of the {@link Order}. This value is read-only.
     */
    public java.lang.String getOrderName() {
        return orderName;
    }


    /**
     * Sets the orderName value for this LineItemSummary.
     * 
     * @param orderName   * The name of the {@link Order}. This value is read-only.
     */
    public void setOrderName(java.lang.String orderName) {
        this.orderName = orderName;
    }


    /**
     * Gets the startDateTime value for this LineItemSummary.
     * 
     * @return startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin serving. This attribute is
     *                 required and must be in the future.
     */
    public com.google.api.ads.admanager.axis.v202411.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LineItemSummary.
     * 
     * @param startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin serving. This attribute is
     *                 required and must be in the future.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202411.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startDateTimeType value for this LineItemSummary.
     * 
     * @return startDateTimeType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in an hour, etc. This
     *                 attribute is optional and defaults to {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.admanager.axis.v202411.StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }


    /**
     * Sets the startDateTimeType value for this LineItemSummary.
     * 
     * @param startDateTimeType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in an hour, etc. This
     *                 attribute is optional and defaults to {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public void setStartDateTimeType(com.google.api.ads.admanager.axis.v202411.StartDateTimeType startDateTimeType) {
        this.startDateTimeType = startDateTimeType;
    }


    /**
     * Gets the endDateTime value for this LineItemSummary.
     * 
     * @return endDateTime   * The date and time on which the {@code LineItem} will stop serving.
     * This attribute is required
     *                 unless {@link LineItem#unlimitedEndDateTime} is set
     * to {@code true}. If specified, it must be
     *                 after the {@link LineItem#startDateTime}. This end
     * date and time does not include auto
     *                 extension days.
     */
    public com.google.api.ads.admanager.axis.v202411.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LineItemSummary.
     * 
     * @param endDateTime   * The date and time on which the {@code LineItem} will stop serving.
     * This attribute is required
     *                 unless {@link LineItem#unlimitedEndDateTime} is set
     * to {@code true}. If specified, it must be
     *                 after the {@link LineItem#startDateTime}. This end
     * date and time does not include auto
     *                 extension days.
     */
    public void setEndDateTime(com.google.api.ads.admanager.axis.v202411.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the autoExtensionDays value for this LineItemSummary.
     * 
     * @return autoExtensionDays   * The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum of
     *                 7 days is allowed. This is feature is only available
     * for Ad Manager 360 accounts.
     */
    public java.lang.Integer getAutoExtensionDays() {
        return autoExtensionDays;
    }


    /**
     * Sets the autoExtensionDays value for this LineItemSummary.
     * 
     * @param autoExtensionDays   * The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum of
     *                 7 days is allowed. This is feature is only available
     * for Ad Manager 360 accounts.
     */
    public void setAutoExtensionDays(java.lang.Integer autoExtensionDays) {
        this.autoExtensionDays = autoExtensionDays;
    }


    /**
     * Gets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @return unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This attribute is optional and
     *                 defaults to false. It can be be set to {@code true}
     * for only line items of type {@link
     *                 LineItemType#SPONSORSHIP}, {@link LineItemType#NETWORK},
     * {@link LineItemType#PRICE_PRIORITY}
     *                 and {@link LineItemType#HOUSE}.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @param unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This attribute is optional and
     *                 defaults to false. It can be be set to {@code true}
     * for only line items of type {@link
     *                 LineItemType#SPONSORSHIP}, {@link LineItemType#NETWORK},
     * {@link LineItemType#PRICE_PRIORITY}
     *                 and {@link LineItemType#HOUSE}.
     */
    public void setUnlimitedEndDateTime(java.lang.Boolean unlimitedEndDateTime) {
        this.unlimitedEndDateTime = unlimitedEndDateTime;
    }


    /**
     * Gets the creativeRotationType value for this LineItemSummary.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are associated with the
     *                 {@code LineItem}. This attribute is required.
     */
    public com.google.api.ads.admanager.axis.v202411.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this LineItemSummary.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are associated with the
     *                 {@code LineItem}. This attribute is required.
     */
    public void setCreativeRotationType(com.google.api.ads.admanager.axis.v202411.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the deliveryRateType value for this LineItemSummary.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration. This attribute is
     *                 optional and defaults to {@link DeliveryRateType#EVENLY}
     * or {@link
     *                 DeliveryRateType#FRONTLOADED} depending on the network's
     * configuration.
     */
    public com.google.api.ads.admanager.axis.v202411.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this LineItemSummary.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration. This attribute is
     *                 optional and defaults to {@link DeliveryRateType#EVENLY}
     * or {@link
     *                 DeliveryRateType#FRONTLOADED} depending on the network's
     * configuration.
     */
    public void setDeliveryRateType(com.google.api.ads.admanager.axis.v202411.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the deliveryForecastSource value for this LineItemSummary.
     * 
     * @return deliveryForecastSource   * Strategy for choosing forecasted traffic shapes to pace line
     * items. This field is optional and
     *                 defaults to {@link DeliveryForecastSource#HISTORICAL}.
     */
    public com.google.api.ads.admanager.axis.v202411.DeliveryForecastSource getDeliveryForecastSource() {
        return deliveryForecastSource;
    }


    /**
     * Sets the deliveryForecastSource value for this LineItemSummary.
     * 
     * @param deliveryForecastSource   * Strategy for choosing forecasted traffic shapes to pace line
     * items. This field is optional and
     *                 defaults to {@link DeliveryForecastSource#HISTORICAL}.
     */
    public void setDeliveryForecastSource(com.google.api.ads.admanager.axis.v202411.DeliveryForecastSource deliveryForecastSource) {
        this.deliveryForecastSource = deliveryForecastSource;
    }


    /**
     * Gets the customPacingCurve value for this LineItemSummary.
     * 
     * @return customPacingCurve   * The curve that is used to pace the line item's delivery. This
     * field is required if and only if
     *                 the delivery forecast source is {@link DeliveryForecastSource#CUSTOM_PACING_CURVE}.
     */
    public com.google.api.ads.admanager.axis.v202411.CustomPacingCurve getCustomPacingCurve() {
        return customPacingCurve;
    }


    /**
     * Sets the customPacingCurve value for this LineItemSummary.
     * 
     * @param customPacingCurve   * The curve that is used to pace the line item's delivery. This
     * field is required if and only if
     *                 the delivery forecast source is {@link DeliveryForecastSource#CUSTOM_PACING_CURVE}.
     */
    public void setCustomPacingCurve(com.google.api.ads.admanager.axis.v202411.CustomPacingCurve customPacingCurve) {
        this.customPacingCurve = customPacingCurve;
    }


    /**
     * Gets the roadblockingType value for this LineItemSummary.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where multiple creatives must be
     *                 served together on a single web page. This attribute
     * is optional and defaults to {@link
     *                 RoadblockingType#ONE_OR_MORE}.
     */
    public com.google.api.ads.admanager.axis.v202411.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this LineItemSummary.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where multiple creatives must be
     *                 served together on a single web page. This attribute
     * is optional and defaults to {@link
     *                 RoadblockingType#ONE_OR_MORE}.
     */
    public void setRoadblockingType(com.google.api.ads.admanager.axis.v202411.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the skippableAdType value for this LineItemSummary.
     * 
     * @return skippableAdType   * The nature of the line item's creatives' skippability. This
     * attribute is optional, only
     *                 applicable for video line items, and defaults to {@link
     * SkippableAdType#NOT_SKIPPABLE}.
     */
    public com.google.api.ads.admanager.axis.v202411.SkippableAdType getSkippableAdType() {
        return skippableAdType;
    }


    /**
     * Sets the skippableAdType value for this LineItemSummary.
     * 
     * @param skippableAdType   * The nature of the line item's creatives' skippability. This
     * attribute is optional, only
     *                 applicable for video line items, and defaults to {@link
     * SkippableAdType#NOT_SKIPPABLE}.
     */
    public void setSkippableAdType(com.google.api.ads.admanager.axis.v202411.SkippableAdType skippableAdType) {
        this.skippableAdType = skippableAdType;
    }


    /**
     * Gets the frequencyCaps value for this LineItemSummary.
     * 
     * @return frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This attribute is optional.
     */
    public com.google.api.ads.admanager.axis.v202411.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this LineItemSummary.
     * 
     * @param frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This attribute is optional.
     */
    public void setFrequencyCaps(com.google.api.ads.admanager.axis.v202411.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.admanager.axis.v202411.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.admanager.axis.v202411.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the lineItemType value for this LineItemSummary.
     * 
     * @return lineItemType   * Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     *                 
     *                 <p>The line item type determines the default priority
     * of the line item. More information can be
     *                 found on the <a href="https://support.google.com/admanager/answer/177279">Ad
     * Manager Help
     *                 Center</a>.
     */
    public com.google.api.ads.admanager.axis.v202411.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemSummary.
     * 
     * @param lineItemType   * Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     *                 
     *                 <p>The line item type determines the default priority
     * of the line item. More information can be
     *                 found on the <a href="https://support.google.com/admanager/answer/177279">Ad
     * Manager Help
     *                 Center</a>.
     */
    public void setLineItemType(com.google.api.ads.admanager.axis.v202411.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the priority value for this LineItemSummary.
     * 
     * @return priority   * The priority for the line item. Valid values range from 1 to
     * 16. This field is optional and
     *                 defaults to the default priority of the {@link LineItemType}.
     * 
     *                 <p>The following table shows the default, minimum,
     * and maximum priority values are for each
     *                 line item type:
     *                 
     *                 <table>
     *                 <tr>
     *                 <th colspan="2" scope="col">
     *                 LineItemType - default priority (minimum priority,
     * maximum priority)
     *                 </th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4 (2, 5)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8 (6, 10)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16 (15, 16)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#CLICK_TRACKING}</td>
     *                 <td>16 (1, 16)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#AD_EXCHANGE}</td>
     *                 <td>12 (1, 16)</td>
     *                 </tr>
     *                 <td>{@link LineItemType#ADSENSE}</td>
     *                 <td>12 (1, 16)</td>
     *                 </tr>
     *                 <td>{@link LineItemType#BUMPER}</td>
     *                 <td>16 (15, 16)</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 <p>This field can only be edited by certain networks,
     * otherwise a {@link PermissionError} will
     *                 occur.
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this LineItemSummary.
     * 
     * @param priority   * The priority for the line item. Valid values range from 1 to
     * 16. This field is optional and
     *                 defaults to the default priority of the {@link LineItemType}.
     * 
     *                 <p>The following table shows the default, minimum,
     * and maximum priority values are for each
     *                 line item type:
     *                 
     *                 <table>
     *                 <tr>
     *                 <th colspan="2" scope="col">
     *                 LineItemType - default priority (minimum priority,
     * maximum priority)
     *                 </th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4 (2, 5)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8 (6, 10)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12 (11, 14)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16 (15, 16)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#CLICK_TRACKING}</td>
     *                 <td>16 (1, 16)</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#AD_EXCHANGE}</td>
     *                 <td>12 (1, 16)</td>
     *                 </tr>
     *                 <td>{@link LineItemType#ADSENSE}</td>
     *                 <td>12 (1, 16)</td>
     *                 </tr>
     *                 <td>{@link LineItemType#BUMPER}</td>
     *                 <td>16 (15, 16)</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 <p>This field can only be edited by certain networks,
     * otherwise a {@link PermissionError} will
     *                 occur.
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the costPerUnit value for this LineItemSummary.
     * 
     * @return costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is required for creating a
     *                 {@code LineItem}.
     */
    public com.google.api.ads.admanager.axis.v202411.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this LineItemSummary.
     * 
     * @param costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is required for creating a
     *                 {@code LineItem}.
     */
    public void setCostPerUnit(com.google.api.ads.admanager.axis.v202411.Money costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    /**
     * Gets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @return valueCostPerUnit   * An amount to help the adserver rank inventory. {@link LineItem#valueCostPerUnit}
     * artificially
     *                 raises the value of inventory over the {@link LineItem#costPerUnit}
     * but avoids raising the
     *                 actual {@link LineItem#costPerUnit}. This attribute
     * is optional and defaults to a {@link Money}
     *                 object in the local currency with {@link Money#microAmount}
     * 0.
     */
    public com.google.api.ads.admanager.axis.v202411.Money getValueCostPerUnit() {
        return valueCostPerUnit;
    }


    /**
     * Sets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @param valueCostPerUnit   * An amount to help the adserver rank inventory. {@link LineItem#valueCostPerUnit}
     * artificially
     *                 raises the value of inventory over the {@link LineItem#costPerUnit}
     * but avoids raising the
     *                 actual {@link LineItem#costPerUnit}. This attribute
     * is optional and defaults to a {@link Money}
     *                 object in the local currency with {@link Money#microAmount}
     * 0.
     */
    public void setValueCostPerUnit(com.google.api.ads.admanager.axis.v202411.Money valueCostPerUnit) {
        this.valueCostPerUnit = valueCostPerUnit;
    }


    /**
     * Gets the costType value for this LineItemSummary.
     * 
     * @return costType   * The method used for billing this {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.admanager.axis.v202411.CostType getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this LineItemSummary.
     * 
     * @param costType   * The method used for billing this {@code LineItem}. This attribute
     * is required.
     */
    public void setCostType(com.google.api.ads.admanager.axis.v202411.CostType costType) {
        this.costType = costType;
    }


    /**
     * Gets the discountType value for this LineItemSummary.
     * 
     * @return discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage based or absolute.
     *                 This attribute is optional and defaults to {@link
     * LineItemDiscountType#PERCENTAGE}.
     */
    public com.google.api.ads.admanager.axis.v202411.LineItemDiscountType getDiscountType() {
        return discountType;
    }


    /**
     * Sets the discountType value for this LineItemSummary.
     * 
     * @param discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage based or absolute.
     *                 This attribute is optional and defaults to {@link
     * LineItemDiscountType#PERCENTAGE}.
     */
    public void setDiscountType(com.google.api.ads.admanager.axis.v202411.LineItemDiscountType discountType) {
        this.discountType = discountType;
    }


    /**
     * Gets the discount value for this LineItemSummary.
     * 
     * @return discount   * The number here is either a percentage or an absolute value
     * depending on the {@code
     *                 LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is {@link
     *                 LineItemDiscountType#PERCENTAGE}, then only non-fractional
     * values are supported.
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this LineItemSummary.
     * 
     * @param discount   * The number here is either a percentage or an absolute value
     * depending on the {@code
     *                 LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is {@link
     *                 LineItemDiscountType#PERCENTAGE}, then only non-fractional
     * values are supported.
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the contractedUnitsBought value for this LineItemSummary.
     * 
     * @return contractedUnitsBought   * This attribute is only applicable for certain {@link #lineItemType
     * line item types} and acts as
     *                 an "FYI" or note, which does not impact adserving
     * or other backend systems.
     *                 
     *                 <p>For {@link LineItemType#SPONSORSHIP} line items,
     * this represents the minimum quantity, which
     *                 is a lifetime impression volume goal for reporting
     * purposes only.
     *                 
     *                 <p>For {@link LineItemType#STANDARD} line items, this
     * represent the contracted quantity, which
     *                 is the number of units specified in the contract the
     * advertiser has bought for this {@code
     *                 LineItem}. This field is just a "FYI" for traffickers
     * to manually intervene with the {@code
     *                 LineItem} when needed. This attribute is only available
     * for {@link LineItemType#STANDARD} line
     *                 items if you have this feature enabled on your network.
     */
    public java.lang.Long getContractedUnitsBought() {
        return contractedUnitsBought;
    }


    /**
     * Sets the contractedUnitsBought value for this LineItemSummary.
     * 
     * @param contractedUnitsBought   * This attribute is only applicable for certain {@link #lineItemType
     * line item types} and acts as
     *                 an "FYI" or note, which does not impact adserving
     * or other backend systems.
     *                 
     *                 <p>For {@link LineItemType#SPONSORSHIP} line items,
     * this represents the minimum quantity, which
     *                 is a lifetime impression volume goal for reporting
     * purposes only.
     *                 
     *                 <p>For {@link LineItemType#STANDARD} line items, this
     * represent the contracted quantity, which
     *                 is the number of units specified in the contract the
     * advertiser has bought for this {@code
     *                 LineItem}. This field is just a "FYI" for traffickers
     * to manually intervene with the {@code
     *                 LineItem} when needed. This attribute is only available
     * for {@link LineItemType#STANDARD} line
     *                 items if you have this feature enabled on your network.
     */
    public void setContractedUnitsBought(java.lang.Long contractedUnitsBought) {
        this.contractedUnitsBought = contractedUnitsBought;
    }


    /**
     * Gets the creativePlaceholders value for this LineItemSummary.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve through
     * this {@code LineItem}. This
     *                 attribute is required and replaces the {@code creativeSizes}
     * attribute.
     */
    public com.google.api.ads.admanager.axis.v202411.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this LineItemSummary.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve through
     * this {@code LineItem}. This
     *                 attribute is required and replaces the {@code creativeSizes}
     * attribute.
     */
    public void setCreativePlaceholders(com.google.api.ads.admanager.axis.v202411.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.admanager.axis.v202411.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.admanager.axis.v202411.CreativePlaceholder _value) {
        this.creativePlaceholders[i] = _value;
    }


    /**
     * Gets the activityAssociations value for this LineItemSummary.
     * 
     * @return activityAssociations   * This attribute is required and meaningful only if the {@link
     * LineItem#costType} is {@link
     *                 CostType.CPA}.
     */
    public com.google.api.ads.admanager.axis.v202411.LineItemActivityAssociation[] getActivityAssociations() {
        return activityAssociations;
    }


    /**
     * Sets the activityAssociations value for this LineItemSummary.
     * 
     * @param activityAssociations   * This attribute is required and meaningful only if the {@link
     * LineItem#costType} is {@link
     *                 CostType.CPA}.
     */
    public void setActivityAssociations(com.google.api.ads.admanager.axis.v202411.LineItemActivityAssociation[] activityAssociations) {
        this.activityAssociations = activityAssociations;
    }

    public com.google.api.ads.admanager.axis.v202411.LineItemActivityAssociation getActivityAssociations(int i) {
        return this.activityAssociations[i];
    }

    public void setActivityAssociations(int i, com.google.api.ads.admanager.axis.v202411.LineItemActivityAssociation _value) {
        this.activityAssociations[i] = _value;
    }


    /**
     * Gets the environmentType value for this LineItemSummary.
     * 
     * @return environmentType   * The environment that the {@code LineItem} is targeting. The
     * default value is {@link
     *                 EnvironmentType#BROWSER}. If this value is {@link
     * EnvironmentType#VIDEO_PLAYER}, then this line
     *                 item can only target {@code AdUnits} that have {@code
     * AdUnitSizes} whose {@code
     *                 environmentType} is also {@code VIDEO_PLAYER}.
     */
    public com.google.api.ads.admanager.axis.v202411.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this LineItemSummary.
     * 
     * @param environmentType   * The environment that the {@code LineItem} is targeting. The
     * default value is {@link
     *                 EnvironmentType#BROWSER}. If this value is {@link
     * EnvironmentType#VIDEO_PLAYER}, then this line
     *                 item can only target {@code AdUnits} that have {@code
     * AdUnitSizes} whose {@code
     *                 environmentType} is also {@code VIDEO_PLAYER}.
     */
    public void setEnvironmentType(com.google.api.ads.admanager.axis.v202411.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the allowedFormats value for this LineItemSummary.
     * 
     * @return allowedFormats   * The set of {@link allowedFormats} that this programmatic line
     * item can have. If the set is
     *                 empty, this line item allows all formats.
     */
    public com.google.api.ads.admanager.axis.v202411.AllowedFormats[] getAllowedFormats() {
        return allowedFormats;
    }


    /**
     * Sets the allowedFormats value for this LineItemSummary.
     * 
     * @param allowedFormats   * The set of {@link allowedFormats} that this programmatic line
     * item can have. If the set is
     *                 empty, this line item allows all formats.
     */
    public void setAllowedFormats(com.google.api.ads.admanager.axis.v202411.AllowedFormats[] allowedFormats) {
        this.allowedFormats = allowedFormats;
    }

    public com.google.api.ads.admanager.axis.v202411.AllowedFormats getAllowedFormats(int i) {
        return this.allowedFormats[i];
    }

    public void setAllowedFormats(int i, com.google.api.ads.admanager.axis.v202411.AllowedFormats _value) {
        this.allowedFormats[i] = _value;
    }


    /**
     * Gets the companionDeliveryOption value for this LineItemSummary.
     * 
     * @return companionDeliveryOption   * The delivery option for companions. Setting this field is only
     * meaningful if the following
     *                 conditions are met:
     *                 
     *                 <ol>
     *                 <li>The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 <li>One of the following is true (both cannot be true,
     * these are mutually exclusive).
     *                 <ul>
     *                 <li>The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * <li>The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </ul>
     *                 </ol>
     *                 
     *                 <p>This field is optional and defaults to {@link CompanionDeliveryOption#OPTIONAL}
     * if the above
     *                 conditions are met. In all other cases it defaults
     * to {@link CompanionDeliveryOption#UNKNOWN}
     *                 and is not meaningful.
     */
    public com.google.api.ads.admanager.axis.v202411.CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }


    /**
     * Sets the companionDeliveryOption value for this LineItemSummary.
     * 
     * @param companionDeliveryOption   * The delivery option for companions. Setting this field is only
     * meaningful if the following
     *                 conditions are met:
     *                 
     *                 <ol>
     *                 <li>The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 <li>One of the following is true (both cannot be true,
     * these are mutually exclusive).
     *                 <ul>
     *                 <li>The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * <li>The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </ul>
     *                 </ol>
     *                 
     *                 <p>This field is optional and defaults to {@link CompanionDeliveryOption#OPTIONAL}
     * if the above
     *                 conditions are met. In all other cases it defaults
     * to {@link CompanionDeliveryOption#UNKNOWN}
     *                 and is not meaningful.
     */
    public void setCompanionDeliveryOption(com.google.api.ads.admanager.axis.v202411.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the allowOverbook value for this LineItemSummary.
     * 
     * @return allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or updating reservations
     *                 of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When
     *                 true, operations on this line item will never trigger
     * a {@link ForecastError}, which
     *                 corresponds to an overbook warning in the UI. The
     * default value is false.
     *                 
     *                 <p>Note: this field will not persist on the line item
     * itself, and the value will only affect
     *                 the current request.
     */
    public java.lang.Boolean getAllowOverbook() {
        return allowOverbook;
    }


    /**
     * Sets the allowOverbook value for this LineItemSummary.
     * 
     * @param allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or updating reservations
     *                 of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When
     *                 true, operations on this line item will never trigger
     * a {@link ForecastError}, which
     *                 corresponds to an overbook warning in the UI. The
     * default value is false.
     *                 
     *                 <p>Note: this field will not persist on the line item
     * itself, and the value will only affect
     *                 the current request.
     */
    public void setAllowOverbook(java.lang.Boolean allowOverbook) {
        this.allowOverbook = allowOverbook;
    }


    /**
     * Gets the skipInventoryCheck value for this LineItemSummary.
     * 
     * @return skipInventoryCheck   * The flag indicates whether the inventory check should be skipped
     * when creating or updating a
     *                 line item. The default value is false.
     *                 
     *                 <p>Note: this field will not persist on the line item
     * itself, and the value will only affect
     *                 the current request.
     */
    public java.lang.Boolean getSkipInventoryCheck() {
        return skipInventoryCheck;
    }


    /**
     * Sets the skipInventoryCheck value for this LineItemSummary.
     * 
     * @param skipInventoryCheck   * The flag indicates whether the inventory check should be skipped
     * when creating or updating a
     *                 line item. The default value is false.
     *                 
     *                 <p>Note: this field will not persist on the line item
     * itself, and the value will only affect
     *                 the current request.
     */
    public void setSkipInventoryCheck(java.lang.Boolean skipInventoryCheck) {
        this.skipInventoryCheck = skipInventoryCheck;
    }


    /**
     * Gets the skipCrossSellingRuleWarningChecks value for this LineItemSummary.
     * 
     * @return skipCrossSellingRuleWarningChecks   * True to skip checks for warnings from rules applied to line
     * items targeting inventory shared by
     *                 a distributor partner for cross selling when performing
     * an action on this line item. The
     *                 default is false.
     */
    public java.lang.Boolean getSkipCrossSellingRuleWarningChecks() {
        return skipCrossSellingRuleWarningChecks;
    }


    /**
     * Sets the skipCrossSellingRuleWarningChecks value for this LineItemSummary.
     * 
     * @param skipCrossSellingRuleWarningChecks   * True to skip checks for warnings from rules applied to line
     * items targeting inventory shared by
     *                 a distributor partner for cross selling when performing
     * an action on this line item. The
     *                 default is false.
     */
    public void setSkipCrossSellingRuleWarningChecks(java.lang.Boolean skipCrossSellingRuleWarningChecks) {
        this.skipCrossSellingRuleWarningChecks = skipCrossSellingRuleWarningChecks;
    }


    /**
     * Gets the reserveAtCreation value for this LineItemSummary.
     * 
     * @return reserveAtCreation   * The flag indicates whether inventory should be reserved when
     * creating a line item of types
     *                 {@link LineItemType#SPONSORSHIP} and {@link LineItemType#STANDARD}
     * in an unapproved {@link
     *                 Order}. The default value is false.
     */
    public java.lang.Boolean getReserveAtCreation() {
        return reserveAtCreation;
    }


    /**
     * Sets the reserveAtCreation value for this LineItemSummary.
     * 
     * @param reserveAtCreation   * The flag indicates whether inventory should be reserved when
     * creating a line item of types
     *                 {@link LineItemType#SPONSORSHIP} and {@link LineItemType#STANDARD}
     * in an unapproved {@link
     *                 Order}. The default value is false.
     */
    public void setReserveAtCreation(java.lang.Boolean reserveAtCreation) {
        this.reserveAtCreation = reserveAtCreation;
    }


    /**
     * Gets the stats value for this LineItemSummary.
     * 
     * @return stats   * Contains trafficking statistics for the line item. This attribute
     * is readonly and is populated
     *                 by Google. This will be {@code null} in case there
     * are no statistics for a line item yet.
     */
    public com.google.api.ads.admanager.axis.v202411.Stats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemSummary.
     * 
     * @param stats   * Contains trafficking statistics for the line item. This attribute
     * is readonly and is populated
     *                 by Google. This will be {@code null} in case there
     * are no statistics for a line item yet.
     */
    public void setStats(com.google.api.ads.admanager.axis.v202411.Stats stats) {
        this.stats = stats;
    }


    /**
     * Gets the deliveryIndicator value for this LineItemSummary.
     * 
     * @return deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery indicator information is not
     *                 available due to one of the following reasons:
     *                 
     *                 <ol>
     *                 <li>The line item is not delivering.
     *                 <li>The line item has an unlimited goal or cap.
     *                 <li>The line item has a percentage based goal or cap.
     * </ol>
     */
    public com.google.api.ads.admanager.axis.v202411.DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }


    /**
     * Sets the deliveryIndicator value for this LineItemSummary.
     * 
     * @param deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery indicator information is not
     *                 available due to one of the following reasons:
     *                 
     *                 <ol>
     *                 <li>The line item is not delivering.
     *                 <li>The line item has an unlimited goal or cap.
     *                 <li>The line item has a percentage based goal or cap.
     * </ol>
     */
    public void setDeliveryIndicator(com.google.api.ads.admanager.axis.v202411.DeliveryIndicator deliveryIndicator) {
        this.deliveryIndicator = deliveryIndicator;
    }


    /**
     * Gets the deliveryData value for this LineItemSummary.
     * 
     * @return deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a {@link LineItem} in
     *                 the last 7 days. This attribute is readonly and is
     * populated by Google. This will be {@code
     *                 null} if the delivery data cannot be computed due
     * to one of the following reasons:
     *                 
     *                 <ol>
     *                 <li>The line item is not deliverable.
     *                 <li>The line item has completed delivering more than
     * 7 days ago.
     *                 <li>The line item has an absolute-based goal. {@link
     * LineItem#deliveryIndicator} should be
     *                 used to track its progress in this case.
     */
    public com.google.api.ads.admanager.axis.v202411.DeliveryData getDeliveryData() {
        return deliveryData;
    }


    /**
     * Sets the deliveryData value for this LineItemSummary.
     * 
     * @param deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a {@link LineItem} in
     *                 the last 7 days. This attribute is readonly and is
     * populated by Google. This will be {@code
     *                 null} if the delivery data cannot be computed due
     * to one of the following reasons:
     *                 
     *                 <ol>
     *                 <li>The line item is not deliverable.
     *                 <li>The line item has completed delivering more than
     * 7 days ago.
     *                 <li>The line item has an absolute-based goal. {@link
     * LineItem#deliveryIndicator} should be
     *                 used to track its progress in this case.
     */
    public void setDeliveryData(com.google.api.ads.admanager.axis.v202411.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the budget value for this LineItemSummary.
     * 
     * @return budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is readonly and is
     *                 populated by Google. The currency code is readonly.
     */
    public com.google.api.ads.admanager.axis.v202411.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this LineItemSummary.
     * 
     * @param budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is readonly and is
     *                 populated by Google. The currency code is readonly.
     */
    public void setBudget(com.google.api.ads.admanager.axis.v202411.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the status value for this LineItemSummary.
     * 
     * @return status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public com.google.api.ads.admanager.axis.v202411.ComputedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemSummary.
     * 
     * @param status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202411.ComputedStatus status) {
        this.status = status;
    }


    /**
     * Gets the reservationStatus value for this LineItemSummary.
     * 
     * @return reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute
     *                 is readonly and is assigned by Google.
     */
    public com.google.api.ads.admanager.axis.v202411.LineItemSummaryReservationStatus getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this LineItemSummary.
     * 
     * @param reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute
     *                 is readonly and is assigned by Google.
     */
    public void setReservationStatus(com.google.api.ads.admanager.axis.v202411.LineItemSummaryReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


    /**
     * Gets the isArchived value for this LineItemSummary.
     * 
     * @return isArchived   * The archival status of the {@code LineItem}. This attribute
     * is readonly.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this LineItemSummary.
     * 
     * @param isArchived   * The archival status of the {@code LineItem}. This attribute
     * is readonly.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the webPropertyCode value for this LineItemSummary.
     * 
     * @return webPropertyCode   * The web property code used for dynamic allocation line items.
     * This web property is only
     *                 required with line item types {@link LineItemType#AD_EXCHANGE}
     * and {@link
     *                 LineItemType#ADSENSE}.
     */
    public java.lang.String getWebPropertyCode() {
        return webPropertyCode;
    }


    /**
     * Sets the webPropertyCode value for this LineItemSummary.
     * 
     * @param webPropertyCode   * The web property code used for dynamic allocation line items.
     * This web property is only
     *                 required with line item types {@link LineItemType#AD_EXCHANGE}
     * and {@link
     *                 LineItemType#ADSENSE}.
     */
    public void setWebPropertyCode(java.lang.String webPropertyCode) {
        this.webPropertyCode = webPropertyCode;
    }


    /**
     * Gets the appliedLabels value for this LineItemSummary.
     * 
     * @return appliedLabels   * The set of labels applied directly to this line item.
     */
    public com.google.api.ads.admanager.axis.v202411.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this LineItemSummary.
     * 
     * @param appliedLabels   * The set of labels applied directly to this line item.
     */
    public void setAppliedLabels(com.google.api.ads.admanager.axis.v202411.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202411.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.admanager.axis.v202411.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this LineItemSummary.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels inherited from the order that contains
     * this line item and the
     *                 advertiser that owns the order. If a label has been
     * negated, only the negated label is
     *                 returned. This field is readonly and is assigned by
     * Google.
     */
    public com.google.api.ads.admanager.axis.v202411.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this LineItemSummary.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels inherited from the order that contains
     * this line item and the
     *                 advertiser that owns the order. If a label has been
     * negated, only the negated label is
     *                 returned. This field is readonly and is assigned by
     * Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.admanager.axis.v202411.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202411.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.admanager.axis.v202411.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the disableSameAdvertiserCompetitiveExclusion value for this LineItemSummary.
     * 
     * @return disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be blocked from serving
     *                 with line items from the same advertiser. Setting
     * this to {@code true} will allow line items
     *                 from the same advertiser to serve regardless of the
     * other competitive exclusion labels being
     *                 applied.
     */
    public java.lang.Boolean getDisableSameAdvertiserCompetitiveExclusion() {
        return disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Sets the disableSameAdvertiserCompetitiveExclusion value for this LineItemSummary.
     * 
     * @param disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be blocked from serving
     *                 with line items from the same advertiser. Setting
     * this to {@code true} will allow line items
     *                 from the same advertiser to serve regardless of the
     * other competitive exclusion labels being
     *                 applied.
     */
    public void setDisableSameAdvertiserCompetitiveExclusion(java.lang.Boolean disableSameAdvertiserCompetitiveExclusion) {
        this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Gets the lastModifiedByApp value for this LineItemSummary.
     * 
     * @return lastModifiedByApp   * The application that last modified this line item. This attribute
     * is read only and is assigned
     *                 by Google.
     */
    public java.lang.String getLastModifiedByApp() {
        return lastModifiedByApp;
    }


    /**
     * Sets the lastModifiedByApp value for this LineItemSummary.
     * 
     * @param lastModifiedByApp   * The application that last modified this line item. This attribute
     * is read only and is assigned
     *                 by Google.
     */
    public void setLastModifiedByApp(java.lang.String lastModifiedByApp) {
        this.lastModifiedByApp = lastModifiedByApp;
    }


    /**
     * Gets the notes value for this LineItemSummary.
     * 
     * @return notes   * Provides any additional notes that may annotate the {@code
     * LineItem}. This attribute is
     *                 optional and has a maximum length of 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this LineItemSummary.
     * 
     * @param notes   * Provides any additional notes that may annotate the {@code
     * LineItem}. This attribute is
     *                 optional and has a maximum length of 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the competitiveConstraintScope value for this LineItemSummary.
     * 
     * @return competitiveConstraintScope   * The {@code CompetitiveConstraintScope} for the competitive
     * exclusion labels assigned to this
     *                 line item. This field is optional, defaults to {@link
     * CompetitiveConstraintScope#POD}, and only
     *                 applies to video line items.
     */
    public com.google.api.ads.admanager.axis.v202411.CompetitiveConstraintScope getCompetitiveConstraintScope() {
        return competitiveConstraintScope;
    }


    /**
     * Sets the competitiveConstraintScope value for this LineItemSummary.
     * 
     * @param competitiveConstraintScope   * The {@code CompetitiveConstraintScope} for the competitive
     * exclusion labels assigned to this
     *                 line item. This field is optional, defaults to {@link
     * CompetitiveConstraintScope#POD}, and only
     *                 applies to video line items.
     */
    public void setCompetitiveConstraintScope(com.google.api.ads.admanager.axis.v202411.CompetitiveConstraintScope competitiveConstraintScope) {
        this.competitiveConstraintScope = competitiveConstraintScope;
    }


    /**
     * Gets the lastModifiedDateTime value for this LineItemSummary.
     * 
     * @return lastModifiedDateTime   * The date and time this line item was last modified.
     */
    public com.google.api.ads.admanager.axis.v202411.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this LineItemSummary.
     * 
     * @param lastModifiedDateTime   * The date and time this line item was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.admanager.axis.v202411.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the creationDateTime value for this LineItemSummary.
     * 
     * @return creationDateTime   * This attribute may be {@code null} for line items created before
     * this feature was introduced.
     */
    public com.google.api.ads.admanager.axis.v202411.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this LineItemSummary.
     * 
     * @param creationDateTime   * This attribute may be {@code null} for line items created before
     * this feature was introduced.
     */
    public void setCreationDateTime(com.google.api.ads.admanager.axis.v202411.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the customFieldValues value for this LineItemSummary.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this line item.
     */
    public com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this LineItemSummary.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this line item.
     */
    public void setCustomFieldValues(com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.admanager.axis.v202411.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the isMissingCreatives value for this LineItemSummary.
     * 
     * @return isMissingCreatives   * Indicates if a {@code LineItem} is missing any {@link Creative
     * creatives} for the {@code
     *                 creativePlaceholders} specified.
     *                 
     *                 <p>{@link Creative Creatives} can be considered missing
     * for several reasons including:
     *                 
     *                 <ul>
     *                 <li>Not enough {@link Creative creatives} of a certain
     * size have been uploaded, as determined
     *                 by {@link CreativePlaceholder#expectedCreativeCount}.
     * For example a {@code LineItem}
     *                 specifies 750x350, 400x200 but only a 750x350 was
     * uploaded. Or {@code LineItem} specifies
     *                 750x350 with an expected count of 2, but only one
     * was uploaded.
     *                 <li>The {@link Creative#appliedLabels} of an associated
     * {@code Creative} do not match the
     *                 {@link CreativePlaceholder#effectiveAppliedLabels}
     * of the {@code LineItem}. For example
     *                 {@code LineItem} specifies 750x350 with a Foo {@code
     * AppliedLabel} but a 750x350 creative
     *                 without a {@code AppliedLabel} was uploaded.
     *                 </ul>
     */
    public java.lang.Boolean getIsMissingCreatives() {
        return isMissingCreatives;
    }


    /**
     * Sets the isMissingCreatives value for this LineItemSummary.
     * 
     * @param isMissingCreatives   * Indicates if a {@code LineItem} is missing any {@link Creative
     * creatives} for the {@code
     *                 creativePlaceholders} specified.
     *                 
     *                 <p>{@link Creative Creatives} can be considered missing
     * for several reasons including:
     *                 
     *                 <ul>
     *                 <li>Not enough {@link Creative creatives} of a certain
     * size have been uploaded, as determined
     *                 by {@link CreativePlaceholder#expectedCreativeCount}.
     * For example a {@code LineItem}
     *                 specifies 750x350, 400x200 but only a 750x350 was
     * uploaded. Or {@code LineItem} specifies
     *                 750x350 with an expected count of 2, but only one
     * was uploaded.
     *                 <li>The {@link Creative#appliedLabels} of an associated
     * {@code Creative} do not match the
     *                 {@link CreativePlaceholder#effectiveAppliedLabels}
     * of the {@code LineItem}. For example
     *                 {@code LineItem} specifies 750x350 with a Foo {@code
     * AppliedLabel} but a 750x350 creative
     *                 without a {@code AppliedLabel} was uploaded.
     *                 </ul>
     */
    public void setIsMissingCreatives(java.lang.Boolean isMissingCreatives) {
        this.isMissingCreatives = isMissingCreatives;
    }


    /**
     * Gets the programmaticCreativeSource value for this LineItemSummary.
     * 
     * @return programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item. This is a
     *                 read-only field. Any changes must be made on the {@link
     * ProposalLineItem}.
     */
    public com.google.api.ads.admanager.axis.v202411.ProgrammaticCreativeSource getProgrammaticCreativeSource() {
        return programmaticCreativeSource;
    }


    /**
     * Sets the programmaticCreativeSource value for this LineItemSummary.
     * 
     * @param programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item. This is a
     *                 read-only field. Any changes must be made on the {@link
     * ProposalLineItem}.
     */
    public void setProgrammaticCreativeSource(com.google.api.ads.admanager.axis.v202411.ProgrammaticCreativeSource programmaticCreativeSource) {
        this.programmaticCreativeSource = programmaticCreativeSource;
    }


    /**
     * Gets the thirdPartyMeasurementSettings value for this LineItemSummary.
     * 
     * @return thirdPartyMeasurementSettings
     */
    public com.google.api.ads.admanager.axis.v202411.ThirdPartyMeasurementSettings getThirdPartyMeasurementSettings() {
        return thirdPartyMeasurementSettings;
    }


    /**
     * Sets the thirdPartyMeasurementSettings value for this LineItemSummary.
     * 
     * @param thirdPartyMeasurementSettings
     */
    public void setThirdPartyMeasurementSettings(com.google.api.ads.admanager.axis.v202411.ThirdPartyMeasurementSettings thirdPartyMeasurementSettings) {
        this.thirdPartyMeasurementSettings = thirdPartyMeasurementSettings;
    }


    /**
     * Gets the youtubeKidsRestricted value for this LineItemSummary.
     * 
     * @return youtubeKidsRestricted   * Designates this line item as intended for YT Kids app. If true,
     * all creatives associated with
     *                 this line item must be reviewed and approved. See
     * the <a
     *                 href="https://support.google.com/yt-partner-sales/answer/10015534">Ad
     * Manager Help Center </a>
     *                 for more information.
     */
    public java.lang.Boolean getYoutubeKidsRestricted() {
        return youtubeKidsRestricted;
    }


    /**
     * Sets the youtubeKidsRestricted value for this LineItemSummary.
     * 
     * @param youtubeKidsRestricted   * Designates this line item as intended for YT Kids app. If true,
     * all creatives associated with
     *                 this line item must be reviewed and approved. See
     * the <a
     *                 href="https://support.google.com/yt-partner-sales/answer/10015534">Ad
     * Manager Help Center </a>
     *                 for more information.
     */
    public void setYoutubeKidsRestricted(java.lang.Boolean youtubeKidsRestricted) {
        this.youtubeKidsRestricted = youtubeKidsRestricted;
    }


    /**
     * Gets the videoMaxDuration value for this LineItemSummary.
     * 
     * @return videoMaxDuration   * The max duration of a video creative associated with this {@code
     * LineItem} in milliseconds.
     *                 
     *                 <p>This attribute is only meaningful for video line
     * items. For version v202011 and earlier,
     *                 this attribute is optional and defaults to 0. For
     * version v202102 and later, this attribute is
     *                 required for video line items and must be greater
     * than 0.
     */
    public java.lang.Long getVideoMaxDuration() {
        return videoMaxDuration;
    }


    /**
     * Sets the videoMaxDuration value for this LineItemSummary.
     * 
     * @param videoMaxDuration   * The max duration of a video creative associated with this {@code
     * LineItem} in milliseconds.
     *                 
     *                 <p>This attribute is only meaningful for video line
     * items. For version v202011 and earlier,
     *                 this attribute is optional and defaults to 0. For
     * version v202102 and later, this attribute is
     *                 required for video line items and must be greater
     * than 0.
     */
    public void setVideoMaxDuration(java.lang.Long videoMaxDuration) {
        this.videoMaxDuration = videoMaxDuration;
    }


    /**
     * Gets the primaryGoal value for this LineItemSummary.
     * 
     * @return primaryGoal   * The primary goal that this {@code LineItem} is associated with,
     * which is used in its pacing and
     *                 budgeting.
     */
    public com.google.api.ads.admanager.axis.v202411.Goal getPrimaryGoal() {
        return primaryGoal;
    }


    /**
     * Sets the primaryGoal value for this LineItemSummary.
     * 
     * @param primaryGoal   * The primary goal that this {@code LineItem} is associated with,
     * which is used in its pacing and
     *                 budgeting.
     */
    public void setPrimaryGoal(com.google.api.ads.admanager.axis.v202411.Goal primaryGoal) {
        this.primaryGoal = primaryGoal;
    }


    /**
     * Gets the secondaryGoals value for this LineItemSummary.
     * 
     * @return secondaryGoals   * The secondary goals that this {@code LineItem} is associated
     * with. It is required and
     *                 meaningful only if the {@link LineItem#costType} is
     * {@link CostType.CPA} or if the {@link
     *                 LineItem#lineItemType} is {@link LineItemType#SPONSORSHIP}
     * and {@link LineItem#costType} is
     *                 {@link CostType.CPM}.
     */
    public com.google.api.ads.admanager.axis.v202411.Goal[] getSecondaryGoals() {
        return secondaryGoals;
    }


    /**
     * Sets the secondaryGoals value for this LineItemSummary.
     * 
     * @param secondaryGoals   * The secondary goals that this {@code LineItem} is associated
     * with. It is required and
     *                 meaningful only if the {@link LineItem#costType} is
     * {@link CostType.CPA} or if the {@link
     *                 LineItem#lineItemType} is {@link LineItemType#SPONSORSHIP}
     * and {@link LineItem#costType} is
     *                 {@link CostType.CPM}.
     */
    public void setSecondaryGoals(com.google.api.ads.admanager.axis.v202411.Goal[] secondaryGoals) {
        this.secondaryGoals = secondaryGoals;
    }

    public com.google.api.ads.admanager.axis.v202411.Goal getSecondaryGoals(int i) {
        return this.secondaryGoals[i];
    }

    public void setSecondaryGoals(int i, com.google.api.ads.admanager.axis.v202411.Goal _value) {
        this.secondaryGoals[i] = _value;
    }


    /**
     * Gets the grpSettings value for this LineItemSummary.
     * 
     * @return grpSettings   * Contains the information for a line item which has a target
     * GRP demographic.
     */
    public com.google.api.ads.admanager.axis.v202411.GrpSettings getGrpSettings() {
        return grpSettings;
    }


    /**
     * Sets the grpSettings value for this LineItemSummary.
     * 
     * @param grpSettings   * Contains the information for a line item which has a target
     * GRP demographic.
     */
    public void setGrpSettings(com.google.api.ads.admanager.axis.v202411.GrpSettings grpSettings) {
        this.grpSettings = grpSettings;
    }


    /**
     * Gets the dealInfo value for this LineItemSummary.
     * 
     * @return dealInfo   * The deal information associated with this line item, if it
     * is programmatic.
     */
    public com.google.api.ads.admanager.axis.v202411.LineItemDealInfoDto getDealInfo() {
        return dealInfo;
    }


    /**
     * Sets the dealInfo value for this LineItemSummary.
     * 
     * @param dealInfo   * The deal information associated with this line item, if it
     * is programmatic.
     */
    public void setDealInfo(com.google.api.ads.admanager.axis.v202411.LineItemDealInfoDto dealInfo) {
        this.dealInfo = dealInfo;
    }


    /**
     * Gets the viewabilityProviderCompanyIds value for this LineItemSummary.
     * 
     * @return viewabilityProviderCompanyIds   * Optional IDs of the {@link Company} that provide ad verification
     * for this line item. {@link
     *                 Company.Type#VIEWABILITY_PROVIDER}.
     */
    public long[] getViewabilityProviderCompanyIds() {
        return viewabilityProviderCompanyIds;
    }


    /**
     * Sets the viewabilityProviderCompanyIds value for this LineItemSummary.
     * 
     * @param viewabilityProviderCompanyIds   * Optional IDs of the {@link Company} that provide ad verification
     * for this line item. {@link
     *                 Company.Type#VIEWABILITY_PROVIDER}.
     */
    public void setViewabilityProviderCompanyIds(long[] viewabilityProviderCompanyIds) {
        this.viewabilityProviderCompanyIds = viewabilityProviderCompanyIds;
    }

    public long getViewabilityProviderCompanyIds(int i) {
        return this.viewabilityProviderCompanyIds[i];
    }

    public void setViewabilityProviderCompanyIds(int i, long _value) {
        this.viewabilityProviderCompanyIds[i] = _value;
    }


    /**
     * Gets the childContentEligibility value for this LineItemSummary.
     * 
     * @return childContentEligibility   * Child content eligibility designation for this line item.
     *                 
     *                 <p>This field is optional and defaults to {@link ChildContentEligibility#DISALLOWED}.
     */
    public com.google.api.ads.admanager.axis.v202411.ChildContentEligibility getChildContentEligibility() {
        return childContentEligibility;
    }


    /**
     * Sets the childContentEligibility value for this LineItemSummary.
     * 
     * @param childContentEligibility   * Child content eligibility designation for this line item.
     *                 
     *                 <p>This field is optional and defaults to {@link ChildContentEligibility#DISALLOWED}.
     */
    public void setChildContentEligibility(com.google.api.ads.admanager.axis.v202411.ChildContentEligibility childContentEligibility) {
        this.childContentEligibility = childContentEligibility;
    }


    /**
     * Gets the customVastExtension value for this LineItemSummary.
     * 
     * @return customVastExtension   * Custom XML to be rendered in a custom VAST response at serving
     * time.
     */
    public java.lang.String getCustomVastExtension() {
        return customVastExtension;
    }


    /**
     * Sets the customVastExtension value for this LineItemSummary.
     * 
     * @param customVastExtension   * Custom XML to be rendered in a custom VAST response at serving
     * time.
     */
    public void setCustomVastExtension(java.lang.String customVastExtension) {
        this.customVastExtension = customVastExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemSummary)) return false;
        LineItemSummary other = (LineItemSummary) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.orderName==null && other.getOrderName()==null) || 
             (this.orderName!=null &&
              this.orderName.equals(other.getOrderName()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.startDateTimeType==null && other.getStartDateTimeType()==null) || 
             (this.startDateTimeType!=null &&
              this.startDateTimeType.equals(other.getStartDateTimeType()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.autoExtensionDays==null && other.getAutoExtensionDays()==null) || 
             (this.autoExtensionDays!=null &&
              this.autoExtensionDays.equals(other.getAutoExtensionDays()))) &&
            ((this.unlimitedEndDateTime==null && other.getUnlimitedEndDateTime()==null) || 
             (this.unlimitedEndDateTime!=null &&
              this.unlimitedEndDateTime.equals(other.getUnlimitedEndDateTime()))) &&
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.deliveryForecastSource==null && other.getDeliveryForecastSource()==null) || 
             (this.deliveryForecastSource!=null &&
              this.deliveryForecastSource.equals(other.getDeliveryForecastSource()))) &&
            ((this.customPacingCurve==null && other.getCustomPacingCurve()==null) || 
             (this.customPacingCurve!=null &&
              this.customPacingCurve.equals(other.getCustomPacingCurve()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.skippableAdType==null && other.getSkippableAdType()==null) || 
             (this.skippableAdType!=null &&
              this.skippableAdType.equals(other.getSkippableAdType()))) &&
            ((this.frequencyCaps==null && other.getFrequencyCaps()==null) || 
             (this.frequencyCaps!=null &&
              java.util.Arrays.equals(this.frequencyCaps, other.getFrequencyCaps()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.costPerUnit==null && other.getCostPerUnit()==null) || 
             (this.costPerUnit!=null &&
              this.costPerUnit.equals(other.getCostPerUnit()))) &&
            ((this.valueCostPerUnit==null && other.getValueCostPerUnit()==null) || 
             (this.valueCostPerUnit!=null &&
              this.valueCostPerUnit.equals(other.getValueCostPerUnit()))) &&
            ((this.costType==null && other.getCostType()==null) || 
             (this.costType!=null &&
              this.costType.equals(other.getCostType()))) &&
            ((this.discountType==null && other.getDiscountType()==null) || 
             (this.discountType!=null &&
              this.discountType.equals(other.getDiscountType()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.contractedUnitsBought==null && other.getContractedUnitsBought()==null) || 
             (this.contractedUnitsBought!=null &&
              this.contractedUnitsBought.equals(other.getContractedUnitsBought()))) &&
            ((this.creativePlaceholders==null && other.getCreativePlaceholders()==null) || 
             (this.creativePlaceholders!=null &&
              java.util.Arrays.equals(this.creativePlaceholders, other.getCreativePlaceholders()))) &&
            ((this.activityAssociations==null && other.getActivityAssociations()==null) || 
             (this.activityAssociations!=null &&
              java.util.Arrays.equals(this.activityAssociations, other.getActivityAssociations()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.allowedFormats==null && other.getAllowedFormats()==null) || 
             (this.allowedFormats!=null &&
              java.util.Arrays.equals(this.allowedFormats, other.getAllowedFormats()))) &&
            ((this.companionDeliveryOption==null && other.getCompanionDeliveryOption()==null) || 
             (this.companionDeliveryOption!=null &&
              this.companionDeliveryOption.equals(other.getCompanionDeliveryOption()))) &&
            ((this.allowOverbook==null && other.getAllowOverbook()==null) || 
             (this.allowOverbook!=null &&
              this.allowOverbook.equals(other.getAllowOverbook()))) &&
            ((this.skipInventoryCheck==null && other.getSkipInventoryCheck()==null) || 
             (this.skipInventoryCheck!=null &&
              this.skipInventoryCheck.equals(other.getSkipInventoryCheck()))) &&
            ((this.skipCrossSellingRuleWarningChecks==null && other.getSkipCrossSellingRuleWarningChecks()==null) || 
             (this.skipCrossSellingRuleWarningChecks!=null &&
              this.skipCrossSellingRuleWarningChecks.equals(other.getSkipCrossSellingRuleWarningChecks()))) &&
            ((this.reserveAtCreation==null && other.getReserveAtCreation()==null) || 
             (this.reserveAtCreation!=null &&
              this.reserveAtCreation.equals(other.getReserveAtCreation()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.deliveryIndicator==null && other.getDeliveryIndicator()==null) || 
             (this.deliveryIndicator!=null &&
              this.deliveryIndicator.equals(other.getDeliveryIndicator()))) &&
            ((this.deliveryData==null && other.getDeliveryData()==null) || 
             (this.deliveryData!=null &&
              this.deliveryData.equals(other.getDeliveryData()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.reservationStatus==null && other.getReservationStatus()==null) || 
             (this.reservationStatus!=null &&
              this.reservationStatus.equals(other.getReservationStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.webPropertyCode==null && other.getWebPropertyCode()==null) || 
             (this.webPropertyCode!=null &&
              this.webPropertyCode.equals(other.getWebPropertyCode()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.disableSameAdvertiserCompetitiveExclusion==null && other.getDisableSameAdvertiserCompetitiveExclusion()==null) || 
             (this.disableSameAdvertiserCompetitiveExclusion!=null &&
              this.disableSameAdvertiserCompetitiveExclusion.equals(other.getDisableSameAdvertiserCompetitiveExclusion()))) &&
            ((this.lastModifiedByApp==null && other.getLastModifiedByApp()==null) || 
             (this.lastModifiedByApp!=null &&
              this.lastModifiedByApp.equals(other.getLastModifiedByApp()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.competitiveConstraintScope==null && other.getCompetitiveConstraintScope()==null) || 
             (this.competitiveConstraintScope!=null &&
              this.competitiveConstraintScope.equals(other.getCompetitiveConstraintScope()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.isMissingCreatives==null && other.getIsMissingCreatives()==null) || 
             (this.isMissingCreatives!=null &&
              this.isMissingCreatives.equals(other.getIsMissingCreatives()))) &&
            ((this.programmaticCreativeSource==null && other.getProgrammaticCreativeSource()==null) || 
             (this.programmaticCreativeSource!=null &&
              this.programmaticCreativeSource.equals(other.getProgrammaticCreativeSource()))) &&
            ((this.thirdPartyMeasurementSettings==null && other.getThirdPartyMeasurementSettings()==null) || 
             (this.thirdPartyMeasurementSettings!=null &&
              this.thirdPartyMeasurementSettings.equals(other.getThirdPartyMeasurementSettings()))) &&
            ((this.youtubeKidsRestricted==null && other.getYoutubeKidsRestricted()==null) || 
             (this.youtubeKidsRestricted!=null &&
              this.youtubeKidsRestricted.equals(other.getYoutubeKidsRestricted()))) &&
            ((this.videoMaxDuration==null && other.getVideoMaxDuration()==null) || 
             (this.videoMaxDuration!=null &&
              this.videoMaxDuration.equals(other.getVideoMaxDuration()))) &&
            ((this.primaryGoal==null && other.getPrimaryGoal()==null) || 
             (this.primaryGoal!=null &&
              this.primaryGoal.equals(other.getPrimaryGoal()))) &&
            ((this.secondaryGoals==null && other.getSecondaryGoals()==null) || 
             (this.secondaryGoals!=null &&
              java.util.Arrays.equals(this.secondaryGoals, other.getSecondaryGoals()))) &&
            ((this.grpSettings==null && other.getGrpSettings()==null) || 
             (this.grpSettings!=null &&
              this.grpSettings.equals(other.getGrpSettings()))) &&
            ((this.dealInfo==null && other.getDealInfo()==null) || 
             (this.dealInfo!=null &&
              this.dealInfo.equals(other.getDealInfo()))) &&
            ((this.viewabilityProviderCompanyIds==null && other.getViewabilityProviderCompanyIds()==null) || 
             (this.viewabilityProviderCompanyIds!=null &&
              java.util.Arrays.equals(this.viewabilityProviderCompanyIds, other.getViewabilityProviderCompanyIds()))) &&
            ((this.childContentEligibility==null && other.getChildContentEligibility()==null) || 
             (this.childContentEligibility!=null &&
              this.childContentEligibility.equals(other.getChildContentEligibility()))) &&
            ((this.customVastExtension==null && other.getCustomVastExtension()==null) || 
             (this.customVastExtension!=null &&
              this.customVastExtension.equals(other.getCustomVastExtension())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getOrderName() != null) {
            _hashCode += getOrderName().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getStartDateTimeType() != null) {
            _hashCode += getStartDateTimeType().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getAutoExtensionDays() != null) {
            _hashCode += getAutoExtensionDays().hashCode();
        }
        if (getUnlimitedEndDateTime() != null) {
            _hashCode += getUnlimitedEndDateTime().hashCode();
        }
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getDeliveryForecastSource() != null) {
            _hashCode += getDeliveryForecastSource().hashCode();
        }
        if (getCustomPacingCurve() != null) {
            _hashCode += getCustomPacingCurve().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
        }
        if (getSkippableAdType() != null) {
            _hashCode += getSkippableAdType().hashCode();
        }
        if (getFrequencyCaps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequencyCaps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequencyCaps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getCostPerUnit() != null) {
            _hashCode += getCostPerUnit().hashCode();
        }
        if (getValueCostPerUnit() != null) {
            _hashCode += getValueCostPerUnit().hashCode();
        }
        if (getCostType() != null) {
            _hashCode += getCostType().hashCode();
        }
        if (getDiscountType() != null) {
            _hashCode += getDiscountType().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getContractedUnitsBought() != null) {
            _hashCode += getContractedUnitsBought().hashCode();
        }
        if (getCreativePlaceholders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreativePlaceholders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreativePlaceholders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActivityAssociations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivityAssociations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivityAssociations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnvironmentType() != null) {
            _hashCode += getEnvironmentType().hashCode();
        }
        if (getAllowedFormats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowedFormats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowedFormats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanionDeliveryOption() != null) {
            _hashCode += getCompanionDeliveryOption().hashCode();
        }
        if (getAllowOverbook() != null) {
            _hashCode += getAllowOverbook().hashCode();
        }
        if (getSkipInventoryCheck() != null) {
            _hashCode += getSkipInventoryCheck().hashCode();
        }
        if (getSkipCrossSellingRuleWarningChecks() != null) {
            _hashCode += getSkipCrossSellingRuleWarningChecks().hashCode();
        }
        if (getReserveAtCreation() != null) {
            _hashCode += getReserveAtCreation().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getDeliveryIndicator() != null) {
            _hashCode += getDeliveryIndicator().hashCode();
        }
        if (getDeliveryData() != null) {
            _hashCode += getDeliveryData().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReservationStatus() != null) {
            _hashCode += getReservationStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getWebPropertyCode() != null) {
            _hashCode += getWebPropertyCode().hashCode();
        }
        if (getAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveAppliedLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveAppliedLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveAppliedLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisableSameAdvertiserCompetitiveExclusion() != null) {
            _hashCode += getDisableSameAdvertiserCompetitiveExclusion().hashCode();
        }
        if (getLastModifiedByApp() != null) {
            _hashCode += getLastModifiedByApp().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCompetitiveConstraintScope() != null) {
            _hashCode += getCompetitiveConstraintScope().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getCustomFieldValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsMissingCreatives() != null) {
            _hashCode += getIsMissingCreatives().hashCode();
        }
        if (getProgrammaticCreativeSource() != null) {
            _hashCode += getProgrammaticCreativeSource().hashCode();
        }
        if (getThirdPartyMeasurementSettings() != null) {
            _hashCode += getThirdPartyMeasurementSettings().hashCode();
        }
        if (getYoutubeKidsRestricted() != null) {
            _hashCode += getYoutubeKidsRestricted().hashCode();
        }
        if (getVideoMaxDuration() != null) {
            _hashCode += getVideoMaxDuration().hashCode();
        }
        if (getPrimaryGoal() != null) {
            _hashCode += getPrimaryGoal().hashCode();
        }
        if (getSecondaryGoals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryGoals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryGoals(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrpSettings() != null) {
            _hashCode += getGrpSettings().hashCode();
        }
        if (getDealInfo() != null) {
            _hashCode += getDealInfo().hashCode();
        }
        if (getViewabilityProviderCompanyIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewabilityProviderCompanyIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewabilityProviderCompanyIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChildContentEligibility() != null) {
            _hashCode += getChildContentEligibility().hashCode();
        }
        if (getCustomVastExtension() != null) {
            _hashCode += getCustomVastExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LineItemSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "orderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "startDateTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "StartDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExtensionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "autoExtensionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryForecastSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "deliveryForecastSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DeliveryForecastSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPacingCurve");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "customPacingCurve"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CustomPacingCurve"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skippableAdType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "skippableAdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "SkippableAdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "valueCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "discountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LineItemDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedUnitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "contractedUnitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "activityAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LineItemActivityAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedFormats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "allowedFormats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AllowedFormats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverbook");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "allowOverbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipInventoryCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "skipInventoryCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipCrossSellingRuleWarningChecks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "skipCrossSellingRuleWarningChecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveAtCreation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "reserveAtCreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Stats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "reservationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LineItemSummary.ReservationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPropertyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "webPropertyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSameAdvertiserCompetitiveExclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "disableSameAdvertiserCompetitiveExclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedByApp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "lastModifiedByApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitiveConstraintScope");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "competitiveConstraintScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "CompetitiveConstraintScope"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMissingCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "isMissingCreatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programmaticCreativeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "programmaticCreativeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ProgrammaticCreativeSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyMeasurementSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "thirdPartyMeasurementSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ThirdPartyMeasurementSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youtubeKidsRestricted");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "youtubeKidsRestricted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "videoMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryGoal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "primaryGoal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Goal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryGoals");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "secondaryGoals"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "Goal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "grpSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "GrpSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "dealInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "LineItemDealInfoDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewabilityProviderCompanyIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "viewabilityProviderCompanyIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childContentEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "childContentEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "ChildContentEligibility"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customVastExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202411", "customVastExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
