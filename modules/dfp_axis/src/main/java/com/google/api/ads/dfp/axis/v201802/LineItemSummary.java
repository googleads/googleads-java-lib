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

/**
 * LineItemSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * The {@code LineItemSummary} represents the base class from which
 * a {@code
 *             LineItem} is derived.
 */
public class LineItemSummary  implements java.io.Serializable {
    /* The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required. */
    private java.lang.Long orderId;

    /* Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created. */
    private java.lang.Long id;

    /* The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 255 characters. */
    private java.lang.String name;

    /* An identifier for the {@code LineItem} that is meaningful to
     * the publisher.
     *                 This attribute is optional and has a maximum length
     * of 255 characters. */
    private java.lang.String externalId;

    /* The name of the {@link Order}. This value is read-only. */
    private java.lang.String orderName;

    /* The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future. */
    private com.google.api.ads.dfp.axis.v201802.DateTime startDateTime;

    /* Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}. */
    private com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType;

    /* The date and time on which the {@code LineItem} will stop serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. This end date and time does not include
     * auto extension days. */
    private com.google.api.ads.dfp.axis.v201802.DateTime endDateTime;

    /* The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum
     *                 of 7 days is allowed. This is a premium feature available
     * for
     *                 {@link LineItemType#STANDARD} line items. */
    private java.lang.Integer autoExtensionDays;

    /* Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}. */
    private java.lang.Boolean unlimitedEndDateTime;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType;

    /* The strategy for delivering ads over the course of the line
     * item's duration. This attribute is
     *                 optional and defaults to {@link DeliveryRateType#EVENLY}
     * or
     *                 {@link DeliveryRateType#FRONTLOADED} depending on
     * the network's configuration. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}. */
    private com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType;

    /* The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps;

    /* Indicates the line item type of a {@code LineItem}. This attribute
     * is required. */
    private com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType;

    /* The priority for the line item. Valid values range from 1 to
     * 16. This
     *                 field is optional and defaults to the default priority
     * of the
     *                 {@link LineItemType}.
     *                 
     *                 <p>The following table shows the default, minimum,
     * and maximum priority
     *                 values are for each line item type:
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
     * otherwise a
     *                 {@link PermissionError} will occur. */
    private java.lang.Integer priority;

    /* The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}. */
    private com.google.api.ads.dfp.axis.v201802.Money costPerUnit;

    /* An amount to help the adserver rank inventory. {@link
     *                 LineItem#valueCostPerUnit} artificially raises the
     * value of
     *                 inventory over the {@link LineItem#costPerUnit} but
     * avoids raising
     *                 the actual {@link LineItem#costPerUnit}. This attribute
     * is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0. */
    private com.google.api.ads.dfp.axis.v201802.Money valueCostPerUnit;

    /* The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201802.CostType costType;

    /* The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}. */
    private com.google.api.ads.dfp.axis.v201802.LineItemDiscountType discountType;

    /* The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported. */
    private java.lang.Double discount;

    /* This attribute is only applicable for certain {@link #lineItemType
     * line item types}
     *                 and acts as an "FYI" or note, which does not impact
     * adserving or other backend systems.
     *                 <p>
     *                 For {@link LineItemType#SPONSORSHIP} line items, this
     * represents the minimum quantity,
     *                 which is a lifetime impression volume goal for reporting
     * purposes only.
     *                 <p>
     *                 For {@link LineItemType#STANDARD} line items, this
     * represent the contracted quantity,
     *                 which is the number of units specified in the contract
     * the advertiser has bought for
     *                 this {@code LineItem}. This field is just a "FYI"
     * for traffickers to manually intervene
     *                 with the {@code LineItem} when needed. This attribute
     * is only available for
     *                 {@link LineItemType#STANDARD} line items if you have
     * this feature enabled on your network. */
    private java.lang.Long contractedUnitsBought;

    /* Details about the creatives that are expected to serve through
     * this
     *                 {@code LineItem}. This attribute is required and replaces
     * the
     *                 {@code creativeSizes} attribute. */
    private com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders;

    /* This attribute is required and meaningful only if the {@link
     * LineItem#costType} is {@link
     *                 CostType.CPA}. */
    private com.google.api.ads.dfp.axis.v201802.LineItemActivityAssociation[] activityAssociations;

    /* The environment that the {@code LineItem} is targeting. The
     * default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is
     *                 {@link EnvironmentType#VIDEO_PLAYER}, then this line
     * item can only target
     *                 {@code AdUnits} that have {@code AdUnitSizes} whose
     * {@code environmentType}
     *                 is also {@code VIDEO_PLAYER}. */
    private com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType;

    /* The delivery option for companions. Setting this field is only
     * meaningful
     *                 if the following conditions are met:
     *                 <ol>
     *                 <li>
     *                 The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 </li>
     *                 <li>
     *                 One of the following is true (both cannot be true,
     * these are mutually
     *                 exclusive).
     *                 <ul>
     *                 <li>
     *                 The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * </li>
     *                 <li>
     *                 The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </li>
     *                 </ul>
     *                 </li>
     *                 </ol>
     *                 <p>
     *                 This field is optional and defaults to
     *                 {@link CompanionDeliveryOption#OPTIONAL} if the above
     * conditions are met.
     *                 In all other cases it defaults to {@link CompanionDeliveryOption#UNKNOWN}
     * and is not meaningful. */
    private com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption;

    /* The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When true, operations on this line
     * item will never trigger a {@link ForecastError}, which corresponds
     * to an
     *                 overbook warning in the UI. The default value is false. */
    private java.lang.Boolean allowOverbook;

    /* The flag indicates whether the inventory check should be skipped
     * when performing an action on
     *                 this line item. The default value is false. */
    private java.lang.Boolean skipInventoryCheck;

    /* True to skip checks for warnings from rules applied to line
     * items targeting inventory shared by
     *                 a distributor partner for cross selling when performing
     * an action on this line item. The
     *                 default is false. */
    private java.lang.Boolean skipCrossSellingRuleWarningChecks;

    /* The flag indicates whether inventory should be reserved when
     * creating a
     *                 line item of types {@link LineItemType#SPONSORSHIP}
     * and
     *                 {@link LineItemType#STANDARD} in an unapproved {@link
     * Order}. The default
     *                 value is false. */
    private java.lang.Boolean reserveAtCreation;

    /* Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet. */
    private com.google.api.ads.dfp.axis.v201802.Stats stats;

    /* Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol> */
    private com.google.api.ads.dfp.axis.v201802.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItem#deliveryIndicator} should be used
     * to track its
     *                 progress in this case.</li> */
    private com.google.api.ads.dfp.axis.v201802.DeliveryData deliveryData;

    /* The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. The currency
     * code is readonly. */
    private com.google.api.ads.dfp.axis.v201802.Money budget;

    /* The status of the {@code LineItem}. This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201802.ComputedStatus status;

    /* Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201802.LineItemSummaryReservationStatus reservationStatus;

    /* The archival status of the {@code LineItem}. This attribute
     * is readonly. */
    private java.lang.Boolean isArchived;

    /* The web property code used for dynamic allocation line items.
     * This web
     *                 property is only required with line item types
     *                 {@link LineItemType#AD_EXCHANGE} and {@link LineItemType#ADSENSE}. */
    private java.lang.String webPropertyCode;

    /* The set of labels applied directly to this line item. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels;

    /* Contains the set of labels inherited from the order that contains
     * this
     *                 line item and the advertiser that owns the order.
     * If a label has been
     *                 negated, only the negated label is returned. This
     * field is readonly
     *                 and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels;

    /* If a line item has a series of competitive exclusions on it,
     * it could be
     *                 blocked from serving with line items from the same
     * advertiser. Setting this
     *                 to {@code true} will allow line items from the same
     * advertiser to serve
     *                 regardless of the other competitive exclusion labels
     * being applied. */
    private java.lang.Boolean disableSameAdvertiserCompetitiveExclusion;

    /* The application that last modified this line item. This attribute
     * is read only
     *                 and is assigned by Google. */
    private java.lang.String lastModifiedByApp;

    /* Provides any additional notes that may annotate the {@code
     * LineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The date and time this line item was last modified. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    /* This attribute may be {@code null} for line items created before
     * this feature was introduced. */
    private com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime;

    /* Whether an AdExchange line item has prioritized preferred deals
     * enabled. This attribute is
     *                 optional and defaults to false. */
    private java.lang.Boolean isPrioritizedPreferredDealsEnabled;

    /* The priority at which an Ad Exchange line item enters the open
     * Ad Exchange auction if the
     *                 preferred deal fails to transact. This attribute is
     * optional. If prioritized preferred deals
     *                 are enabled, it defaults to 12. Otherwise, it is ignored. */
    private java.lang.Integer adExchangeAuctionOpeningPriority;

    /* The values of the custom fields associated with this line item. */
    private com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues;

    /* Flag that specifies whether this {@code LineItem} is a set-top
     * box enabled line item.
     *                 Set-top box line items only support the following
     * creative sizes: 1920x1080 and 640x480.
     *                 
     *                 <p>This attribute is read-only after creation. */
    private java.lang.Boolean isSetTopBoxEnabled;

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

    /* Additional information for set-top box enabled line items.
     * This attribute is optional and only
     *                 meaningful when {@link #isSetTopBoxEnabled} is {@code
     * true}. */
    private com.google.api.ads.dfp.axis.v201802.SetTopBoxInfo setTopBoxDisplayInfo;

    /* Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     *                 This is a read-only field. Any changes must be made
     * on the {@link ProposalLineItem}. */
    private com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource programmaticCreativeSource;

    /* The max duration of a video creative associated with this {@code
     * LineItem} in
     *                 milliseconds. This attribute is optional, defaults
     * to 0, and only meaningful if this is
     *                 a video line item. */
    private java.lang.Long videoMaxDuration;

    /* The primary goal that this {@code LineItem} is associated with,
     * which is used in its pacing and
     *                 budgeting. */
    private com.google.api.ads.dfp.axis.v201802.Goal primaryGoal;

    /* The secondary goals that this {@code LineItem} is associated
     * with. It is required and
     *                 meaningful only if the {@link LineItem#costType} is
     * {@link CostType.CPA} or if the {@link
     *                 LineItem#lineItemType} is {@link LineItemType#SPONSORSHIP}
     * and {@link LineItem#costType} is
     *                 {@link CostType.CPM}. */
    private com.google.api.ads.dfp.axis.v201802.Goal[] secondaryGoals;

    /* Contains the information for a line item which has a target
     * GRP demographic. */
    private com.google.api.ads.dfp.axis.v201802.GrpSettings grpSettings;

    public LineItemSummary() {
    }

    public LineItemSummary(
           java.lang.Long orderId,
           java.lang.Long id,
           java.lang.String name,
           java.lang.String externalId,
           java.lang.String orderName,
           com.google.api.ads.dfp.axis.v201802.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType,
           com.google.api.ads.dfp.axis.v201802.DateTime endDateTime,
           java.lang.Integer autoExtensionDays,
           java.lang.Boolean unlimitedEndDateTime,
           com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType,
           java.lang.Integer priority,
           com.google.api.ads.dfp.axis.v201802.Money costPerUnit,
           com.google.api.ads.dfp.axis.v201802.Money valueCostPerUnit,
           com.google.api.ads.dfp.axis.v201802.CostType costType,
           com.google.api.ads.dfp.axis.v201802.LineItemDiscountType discountType,
           java.lang.Double discount,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201802.LineItemActivityAssociation[] activityAssociations,
           com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType,
           com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption,
           java.lang.Boolean allowOverbook,
           java.lang.Boolean skipInventoryCheck,
           java.lang.Boolean skipCrossSellingRuleWarningChecks,
           java.lang.Boolean reserveAtCreation,
           com.google.api.ads.dfp.axis.v201802.Stats stats,
           com.google.api.ads.dfp.axis.v201802.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.axis.v201802.DeliveryData deliveryData,
           com.google.api.ads.dfp.axis.v201802.Money budget,
           com.google.api.ads.dfp.axis.v201802.ComputedStatus status,
           com.google.api.ads.dfp.axis.v201802.LineItemSummaryReservationStatus reservationStatus,
           java.lang.Boolean isArchived,
           java.lang.String webPropertyCode,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           java.lang.String lastModifiedByApp,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime,
           java.lang.Boolean isPrioritizedPreferredDealsEnabled,
           java.lang.Integer adExchangeAuctionOpeningPriority,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           java.lang.Boolean isSetTopBoxEnabled,
           java.lang.Boolean isMissingCreatives,
           com.google.api.ads.dfp.axis.v201802.SetTopBoxInfo setTopBoxDisplayInfo,
           com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource programmaticCreativeSource,
           java.lang.Long videoMaxDuration,
           com.google.api.ads.dfp.axis.v201802.Goal primaryGoal,
           com.google.api.ads.dfp.axis.v201802.Goal[] secondaryGoals,
           com.google.api.ads.dfp.axis.v201802.GrpSettings grpSettings) {
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
           this.roadblockingType = roadblockingType;
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
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.creationDateTime = creationDateTime;
           this.isPrioritizedPreferredDealsEnabled = isPrioritizedPreferredDealsEnabled;
           this.adExchangeAuctionOpeningPriority = adExchangeAuctionOpeningPriority;
           this.customFieldValues = customFieldValues;
           this.isSetTopBoxEnabled = isSetTopBoxEnabled;
           this.isMissingCreatives = isMissingCreatives;
           this.setTopBoxDisplayInfo = setTopBoxDisplayInfo;
           this.programmaticCreativeSource = programmaticCreativeSource;
           this.videoMaxDuration = videoMaxDuration;
           this.primaryGoal = primaryGoal;
           this.secondaryGoals = secondaryGoals;
           this.grpSettings = grpSettings;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("activityAssociations", getActivityAssociations())
            .add("adExchangeAuctionOpeningPriority", getAdExchangeAuctionOpeningPriority())
            .add("allowOverbook", getAllowOverbook())
            .add("appliedLabels", getAppliedLabels())
            .add("autoExtensionDays", getAutoExtensionDays())
            .add("budget", getBudget())
            .add("companionDeliveryOption", getCompanionDeliveryOption())
            .add("contractedUnitsBought", getContractedUnitsBought())
            .add("costPerUnit", getCostPerUnit())
            .add("costType", getCostType())
            .add("creationDateTime", getCreationDateTime())
            .add("creativePlaceholders", getCreativePlaceholders())
            .add("creativeRotationType", getCreativeRotationType())
            .add("customFieldValues", getCustomFieldValues())
            .add("deliveryData", getDeliveryData())
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
            .add("isPrioritizedPreferredDealsEnabled", getIsPrioritizedPreferredDealsEnabled())
            .add("isSetTopBoxEnabled", getIsSetTopBoxEnabled())
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
            .add("setTopBoxDisplayInfo", getSetTopBoxDisplayInfo())
            .add("skipCrossSellingRuleWarningChecks", getSkipCrossSellingRuleWarningChecks())
            .add("skipInventoryCheck", getSkipInventoryCheck())
            .add("startDateTime", getStartDateTime())
            .add("startDateTimeType", getStartDateTimeType())
            .add("stats", getStats())
            .add("status", getStatus())
            .add("unlimitedEndDateTime", getUnlimitedEndDateTime())
            .add("valueCostPerUnit", getValueCostPerUnit())
            .add("videoMaxDuration", getVideoMaxDuration())
            .add("webPropertyCode", getWebPropertyCode())
            .toString();
    }

    /**
     * Gets the orderId value for this LineItemSummary.
     * 
     * @return orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this LineItemSummary.
     * 
     * @param orderId   * The ID of the {@link Order} to which the {@code LineItem} belongs.
     * This
     *                 attribute is required.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the id value for this LineItemSummary.
     * 
     * @return id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LineItemSummary.
     * 
     * @param id   * Uniquely identifies the {@code LineItem}. This attribute is
     * read-only and is
     *                 assigned by Google when a line item is created.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LineItemSummary.
     * 
     * @return name   * The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LineItemSummary.
     * 
     * @param name   * The name of the line item. This attribute is required and has
     * a maximum
     *                 length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the externalId value for this LineItemSummary.
     * 
     * @return externalId   * An identifier for the {@code LineItem} that is meaningful to
     * the publisher.
     *                 This attribute is optional and has a maximum length
     * of 255 characters.
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this LineItemSummary.
     * 
     * @param externalId   * An identifier for the {@code LineItem} that is meaningful to
     * the publisher.
     *                 This attribute is optional and has a maximum length
     * of 255 characters.
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
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LineItemSummary.
     * 
     * @param startDateTime   * The date and time on which the {@code LineItem} is enabled
     * to begin
     *                 serving. This attribute is required and must be in
     * the future.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201802.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the startDateTimeType value for this LineItemSummary.
     * 
     * @return startDateTimeType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public com.google.api.ads.dfp.axis.v201802.StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }


    /**
     * Sets the startDateTimeType value for this LineItemSummary.
     * 
     * @param startDateTimeType   * Specifies whether to start serving to the {@code LineItem}
     * right away, in
     *                 an hour, etc. This attribute is optional and defaults
     * to
     *                 {@link StartDateTimeType#USE_START_DATE_TIME}.
     */
    public void setStartDateTimeType(com.google.api.ads.dfp.axis.v201802.StartDateTimeType startDateTimeType) {
        this.startDateTimeType = startDateTimeType;
    }


    /**
     * Gets the endDateTime value for this LineItemSummary.
     * 
     * @return endDateTime   * The date and time on which the {@code LineItem} will stop serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. This end date and time does not include
     * auto extension days.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LineItemSummary.
     * 
     * @param endDateTime   * The date and time on which the {@code LineItem} will stop serving.
     * This
     *                 attribute is required unless {@link LineItem#unlimitedEndDateTime}
     * is set
     *                 to {@code true}. If specified, it must be after the
     * {@link LineItem#startDateTime}. This end date and time does not include
     * auto extension days.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201802.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the autoExtensionDays value for this LineItemSummary.
     * 
     * @return autoExtensionDays   * The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum
     *                 of 7 days is allowed. This is a premium feature available
     * for
     *                 {@link LineItemType#STANDARD} line items.
     */
    public java.lang.Integer getAutoExtensionDays() {
        return autoExtensionDays;
    }


    /**
     * Sets the autoExtensionDays value for this LineItemSummary.
     * 
     * @param autoExtensionDays   * The number of days to allow a line item to deliver past its
     * {@link #endDateTime}. A maximum
     *                 of 7 days is allowed. This is a premium feature available
     * for
     *                 {@link LineItemType#STANDARD} line items.
     */
    public void setAutoExtensionDays(java.lang.Integer autoExtensionDays) {
        this.autoExtensionDays = autoExtensionDays;
    }


    /**
     * Gets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @return unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}.
     */
    public java.lang.Boolean getUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }


    /**
     * Sets the unlimitedEndDateTime value for this LineItemSummary.
     * 
     * @param unlimitedEndDateTime   * Specifies whether or not the {@code LineItem} has an end time.
     * This
     *                 attribute is optional and defaults to false. It can
     * be be set to {@code
     *                 true} for only line items of type {@link LineItemType#SPONSORSHIP},
     * {@link LineItemType#NETWORK}, {@link LineItemType#PRICE_PRIORITY}
     * and
     *                 {@link LineItemType#HOUSE}.
     */
    public void setUnlimitedEndDateTime(java.lang.Boolean unlimitedEndDateTime) {
        this.unlimitedEndDateTime = unlimitedEndDateTime;
    }


    /**
     * Gets the creativeRotationType value for this LineItemSummary.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this LineItemSummary.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code LineItem}. This attribute
     * is required.
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
    }


    /**
     * Gets the deliveryRateType value for this LineItemSummary.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration. This attribute is
     *                 optional and defaults to {@link DeliveryRateType#EVENLY}
     * or
     *                 {@link DeliveryRateType#FRONTLOADED} depending on
     * the network's configuration.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this LineItemSummary.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the line
     * item's duration. This attribute is
     *                 optional and defaults to {@link DeliveryRateType#EVENLY}
     * or
     *                 {@link DeliveryRateType#FRONTLOADED} depending on
     * the network's configuration.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the roadblockingType value for this LineItemSummary.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}.
     */
    public com.google.api.ads.dfp.axis.v201802.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this LineItemSummary.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This
     *                 attribute is optional and defaults to {@link RoadblockingType#ONE_OR_MORE}.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the frequencyCaps value for this LineItemSummary.
     * 
     * @return frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this LineItemSummary.
     * 
     * @param frequencyCaps   * The set of frequency capping units for this {@code LineItem}.
     * This
     *                 attribute is optional.
     */
    public void setFrequencyCaps(com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201802.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201802.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the lineItemType value for this LineItemSummary.
     * 
     * @return lineItemType   * Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this LineItemSummary.
     * 
     * @param lineItemType   * Indicates the line item type of a {@code LineItem}. This attribute
     * is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the priority value for this LineItemSummary.
     * 
     * @return priority   * The priority for the line item. Valid values range from 1 to
     * 16. This
     *                 field is optional and defaults to the default priority
     * of the
     *                 {@link LineItemType}.
     *                 
     *                 <p>The following table shows the default, minimum,
     * and maximum priority
     *                 values are for each line item type:
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
     * otherwise a
     *                 {@link PermissionError} will occur.
     */
    public java.lang.Integer getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this LineItemSummary.
     * 
     * @param priority   * The priority for the line item. Valid values range from 1 to
     * 16. This
     *                 field is optional and defaults to the default priority
     * of the
     *                 {@link LineItemType}.
     *                 
     *                 <p>The following table shows the default, minimum,
     * and maximum priority
     *                 values are for each line item type:
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
     * otherwise a
     *                 {@link PermissionError} will occur.
     */
    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }


    /**
     * Gets the costPerUnit value for this LineItemSummary.
     * 
     * @return costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this LineItemSummary.
     * 
     * @param costPerUnit   * The amount of money to spend per impression or click. This
     * attribute is
     *                 required for creating a {@code LineItem}.
     */
    public void setCostPerUnit(com.google.api.ads.dfp.axis.v201802.Money costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    /**
     * Gets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @return valueCostPerUnit   * An amount to help the adserver rank inventory. {@link
     *                 LineItem#valueCostPerUnit} artificially raises the
     * value of
     *                 inventory over the {@link LineItem#costPerUnit} but
     * avoids raising
     *                 the actual {@link LineItem#costPerUnit}. This attribute
     * is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getValueCostPerUnit() {
        return valueCostPerUnit;
    }


    /**
     * Sets the valueCostPerUnit value for this LineItemSummary.
     * 
     * @param valueCostPerUnit   * An amount to help the adserver rank inventory. {@link
     *                 LineItem#valueCostPerUnit} artificially raises the
     * value of
     *                 inventory over the {@link LineItem#costPerUnit} but
     * avoids raising
     *                 the actual {@link LineItem#costPerUnit}. This attribute
     * is optional
     *                 and defaults to a {@link Money} object in the local
     * currency with {@link Money#microAmount} 0.
     */
    public void setValueCostPerUnit(com.google.api.ads.dfp.axis.v201802.Money valueCostPerUnit) {
        this.valueCostPerUnit = valueCostPerUnit;
    }


    /**
     * Gets the costType value for this LineItemSummary.
     * 
     * @return costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public com.google.api.ads.dfp.axis.v201802.CostType getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this LineItemSummary.
     * 
     * @param costType   * The method used for billing this {@code LineItem}. This attribute
     * is
     *                 required.
     */
    public void setCostType(com.google.api.ads.dfp.axis.v201802.CostType costType) {
        this.costType = costType;
    }


    /**
     * Gets the discountType value for this LineItemSummary.
     * 
     * @return discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemDiscountType getDiscountType() {
        return discountType;
    }


    /**
     * Sets the discountType value for this LineItemSummary.
     * 
     * @param discountType   * The type of discount being applied to a {@code LineItem}, either
     * percentage
     *                 based or absolute. This attribute is optional and
     * defaults to
     *                 {@link LineItemDiscountType#PERCENTAGE}.
     */
    public void setDiscountType(com.google.api.ads.dfp.axis.v201802.LineItemDiscountType discountType) {
        this.discountType = discountType;
    }


    /**
     * Gets the discount value for this LineItemSummary.
     * 
     * @return discount   * The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported.
     */
    public java.lang.Double getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this LineItemSummary.
     * 
     * @param discount   * The number here is either a percentage or an absolute value
     * depending on
     *                 the {@code LineItemDiscountType}. If the {@code LineItemDiscountType}
     * is
     *                 {@link LineItemDiscountType#PERCENTAGE}, then only
     * non-fractional values
     *                 are supported.
     */
    public void setDiscount(java.lang.Double discount) {
        this.discount = discount;
    }


    /**
     * Gets the contractedUnitsBought value for this LineItemSummary.
     * 
     * @return contractedUnitsBought   * This attribute is only applicable for certain {@link #lineItemType
     * line item types}
     *                 and acts as an "FYI" or note, which does not impact
     * adserving or other backend systems.
     *                 <p>
     *                 For {@link LineItemType#SPONSORSHIP} line items, this
     * represents the minimum quantity,
     *                 which is a lifetime impression volume goal for reporting
     * purposes only.
     *                 <p>
     *                 For {@link LineItemType#STANDARD} line items, this
     * represent the contracted quantity,
     *                 which is the number of units specified in the contract
     * the advertiser has bought for
     *                 this {@code LineItem}. This field is just a "FYI"
     * for traffickers to manually intervene
     *                 with the {@code LineItem} when needed. This attribute
     * is only available for
     *                 {@link LineItemType#STANDARD} line items if you have
     * this feature enabled on your network.
     */
    public java.lang.Long getContractedUnitsBought() {
        return contractedUnitsBought;
    }


    /**
     * Sets the contractedUnitsBought value for this LineItemSummary.
     * 
     * @param contractedUnitsBought   * This attribute is only applicable for certain {@link #lineItemType
     * line item types}
     *                 and acts as an "FYI" or note, which does not impact
     * adserving or other backend systems.
     *                 <p>
     *                 For {@link LineItemType#SPONSORSHIP} line items, this
     * represents the minimum quantity,
     *                 which is a lifetime impression volume goal for reporting
     * purposes only.
     *                 <p>
     *                 For {@link LineItemType#STANDARD} line items, this
     * represent the contracted quantity,
     *                 which is the number of units specified in the contract
     * the advertiser has bought for
     *                 this {@code LineItem}. This field is just a "FYI"
     * for traffickers to manually intervene
     *                 with the {@code LineItem} when needed. This attribute
     * is only available for
     *                 {@link LineItemType#STANDARD} line items if you have
     * this feature enabled on your network.
     */
    public void setContractedUnitsBought(java.lang.Long contractedUnitsBought) {
        this.contractedUnitsBought = contractedUnitsBought;
    }


    /**
     * Gets the creativePlaceholders value for this LineItemSummary.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve through
     * this
     *                 {@code LineItem}. This attribute is required and replaces
     * the
     *                 {@code creativeSizes} attribute.
     */
    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this LineItemSummary.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve through
     * this
     *                 {@code LineItem}. This attribute is required and replaces
     * the
     *                 {@code creativeSizes} attribute.
     */
    public void setCreativePlaceholders(com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201802.CreativePlaceholder _value) {
        this.creativePlaceholders[i] = _value;
    }


    /**
     * Gets the activityAssociations value for this LineItemSummary.
     * 
     * @return activityAssociations   * This attribute is required and meaningful only if the {@link
     * LineItem#costType} is {@link
     *                 CostType.CPA}.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemActivityAssociation[] getActivityAssociations() {
        return activityAssociations;
    }


    /**
     * Sets the activityAssociations value for this LineItemSummary.
     * 
     * @param activityAssociations   * This attribute is required and meaningful only if the {@link
     * LineItem#costType} is {@link
     *                 CostType.CPA}.
     */
    public void setActivityAssociations(com.google.api.ads.dfp.axis.v201802.LineItemActivityAssociation[] activityAssociations) {
        this.activityAssociations = activityAssociations;
    }

    public com.google.api.ads.dfp.axis.v201802.LineItemActivityAssociation getActivityAssociations(int i) {
        return this.activityAssociations[i];
    }

    public void setActivityAssociations(int i, com.google.api.ads.dfp.axis.v201802.LineItemActivityAssociation _value) {
        this.activityAssociations[i] = _value;
    }


    /**
     * Gets the environmentType value for this LineItemSummary.
     * 
     * @return environmentType   * The environment that the {@code LineItem} is targeting. The
     * default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is
     *                 {@link EnvironmentType#VIDEO_PLAYER}, then this line
     * item can only target
     *                 {@code AdUnits} that have {@code AdUnitSizes} whose
     * {@code environmentType}
     *                 is also {@code VIDEO_PLAYER}.
     */
    public com.google.api.ads.dfp.axis.v201802.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this LineItemSummary.
     * 
     * @param environmentType   * The environment that the {@code LineItem} is targeting. The
     * default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is
     *                 {@link EnvironmentType#VIDEO_PLAYER}, then this line
     * item can only target
     *                 {@code AdUnits} that have {@code AdUnitSizes} whose
     * {@code environmentType}
     *                 is also {@code VIDEO_PLAYER}.
     */
    public void setEnvironmentType(com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the companionDeliveryOption value for this LineItemSummary.
     * 
     * @return companionDeliveryOption   * The delivery option for companions. Setting this field is only
     * meaningful
     *                 if the following conditions are met:
     *                 <ol>
     *                 <li>
     *                 The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 </li>
     *                 <li>
     *                 One of the following is true (both cannot be true,
     * these are mutually
     *                 exclusive).
     *                 <ul>
     *                 <li>
     *                 The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * </li>
     *                 <li>
     *                 The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </li>
     *                 </ul>
     *                 </li>
     *                 </ol>
     *                 <p>
     *                 This field is optional and defaults to
     *                 {@link CompanionDeliveryOption#OPTIONAL} if the above
     * conditions are met.
     *                 In all other cases it defaults to {@link CompanionDeliveryOption#UNKNOWN}
     * and is not meaningful.
     */
    public com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }


    /**
     * Sets the companionDeliveryOption value for this LineItemSummary.
     * 
     * @param companionDeliveryOption   * The delivery option for companions. Setting this field is only
     * meaningful
     *                 if the following conditions are met:
     *                 <ol>
     *                 <li>
     *                 The <b>Guaranteed roadblocks</b> feature is enabled
     * on your network.
     *                 </li>
     *                 <li>
     *                 One of the following is true (both cannot be true,
     * these are mutually
     *                 exclusive).
     *                 <ul>
     *                 <li>
     *                 The {@link #environmentType} is {@link EnvironmentType#VIDEO_PLAYER}.
     * </li>
     *                 <li>
     *                 The {@link #roadblockingType} is {@link RoadblockingType#CREATIVE_SET}.
     * </li>
     *                 </ul>
     *                 </li>
     *                 </ol>
     *                 <p>
     *                 This field is optional and defaults to
     *                 {@link CompanionDeliveryOption#OPTIONAL} if the above
     * conditions are met.
     *                 In all other cases it defaults to {@link CompanionDeliveryOption#UNKNOWN}
     * and is not meaningful.
     */
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the allowOverbook value for this LineItemSummary.
     * 
     * @return allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When true, operations on this line
     * item will never trigger a {@link ForecastError}, which corresponds
     * to an
     *                 overbook warning in the UI. The default value is false.
     */
    public java.lang.Boolean getAllowOverbook() {
        return allowOverbook;
    }


    /**
     * Sets the allowOverbook value for this LineItemSummary.
     * 
     * @param allowOverbook   * The flag indicates whether overbooking should be allowed when
     * creating or
     *                 updating reservations of line item types {@link LineItemType#SPONSORSHIP}
     * and {@link LineItemType#STANDARD}. When true, operations on this line
     * item will never trigger a {@link ForecastError}, which corresponds
     * to an
     *                 overbook warning in the UI. The default value is false.
     */
    public void setAllowOverbook(java.lang.Boolean allowOverbook) {
        this.allowOverbook = allowOverbook;
    }


    /**
     * Gets the skipInventoryCheck value for this LineItemSummary.
     * 
     * @return skipInventoryCheck   * The flag indicates whether the inventory check should be skipped
     * when performing an action on
     *                 this line item. The default value is false.
     */
    public java.lang.Boolean getSkipInventoryCheck() {
        return skipInventoryCheck;
    }


    /**
     * Sets the skipInventoryCheck value for this LineItemSummary.
     * 
     * @param skipInventoryCheck   * The flag indicates whether the inventory check should be skipped
     * when performing an action on
     *                 this line item. The default value is false.
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
     * creating a
     *                 line item of types {@link LineItemType#SPONSORSHIP}
     * and
     *                 {@link LineItemType#STANDARD} in an unapproved {@link
     * Order}. The default
     *                 value is false.
     */
    public java.lang.Boolean getReserveAtCreation() {
        return reserveAtCreation;
    }


    /**
     * Sets the reserveAtCreation value for this LineItemSummary.
     * 
     * @param reserveAtCreation   * The flag indicates whether inventory should be reserved when
     * creating a
     *                 line item of types {@link LineItemType#SPONSORSHIP}
     * and
     *                 {@link LineItemType#STANDARD} in an unapproved {@link
     * Order}. The default
     *                 value is false.
     */
    public void setReserveAtCreation(java.lang.Boolean reserveAtCreation) {
        this.reserveAtCreation = reserveAtCreation;
    }


    /**
     * Gets the stats value for this LineItemSummary.
     * 
     * @return stats   * Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet.
     */
    public com.google.api.ads.dfp.axis.v201802.Stats getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this LineItemSummary.
     * 
     * @param stats   * Contains trafficking statistics for the line item. This attribute
     * is
     *                 readonly and is populated by Google. This will be
     * {@code null} in case
     *                 there are no statistics for a line item yet.
     */
    public void setStats(com.google.api.ads.dfp.axis.v201802.Stats stats) {
        this.stats = stats;
    }


    /**
     * Gets the deliveryIndicator value for this LineItemSummary.
     * 
     * @return deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }


    /**
     * Sets the deliveryIndicator value for this LineItemSummary.
     * 
     * @param deliveryIndicator   * Indicates how well the line item has been performing. This
     * attribute is
     *                 readonly and is populated by Google. This will be
     * {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following
     *                 reasons:
     *                 <ol>
     *                 <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public void setDeliveryIndicator(com.google.api.ads.dfp.axis.v201802.DeliveryIndicator deliveryIndicator) {
        this.deliveryIndicator = deliveryIndicator;
    }


    /**
     * Gets the deliveryData value for this LineItemSummary.
     * 
     * @return deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItem#deliveryIndicator} should be used
     * to track its
     *                 progress in this case.</li>
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryData getDeliveryData() {
        return deliveryData;
    }


    /**
     * Sets the deliveryData value for this LineItemSummary.
     * 
     * @param deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for a
     *                 {@link LineItem} in the last 7 days. This attribute
     * is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot
     *                 be computed due to one of the following reasons:
     *                 <ol>
     *                 <li>
     *                 The line item is not deliverable.</li>
     *                 <li>
     *                 The line item has completed delivering more than 7
     * days ago.</li>
     *                 <li>
     *                 The line item has an absolute-based goal.
     *                 {@link LineItem#deliveryIndicator} should be used
     * to track its
     *                 progress in this case.</li>
     */
    public void setDeliveryData(com.google.api.ads.dfp.axis.v201802.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the budget value for this LineItemSummary.
     * 
     * @return budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. The currency
     * code is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this LineItemSummary.
     * 
     * @param budget   * The amount of money allocated to the {@code LineItem}. This
     * attribute is
     *                 readonly and is populated by Google. The currency
     * code is readonly.
     */
    public void setBudget(com.google.api.ads.dfp.axis.v201802.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the status value for this LineItemSummary.
     * 
     * @return status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201802.ComputedStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LineItemSummary.
     * 
     * @param status   * The status of the {@code LineItem}. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201802.ComputedStatus status) {
        this.status = status;
    }


    /**
     * Gets the reservationStatus value for this LineItemSummary.
     * 
     * @return reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemSummaryReservationStatus getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this LineItemSummary.
     * 
     * @param reservationStatus   * Describes whether or not inventory has been reserved for the
     * {@code LineItem}. This attribute is readonly and is assigned by Google.
     */
    public void setReservationStatus(com.google.api.ads.dfp.axis.v201802.LineItemSummaryReservationStatus reservationStatus) {
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
     * This web
     *                 property is only required with line item types
     *                 {@link LineItemType#AD_EXCHANGE} and {@link LineItemType#ADSENSE}.
     */
    public java.lang.String getWebPropertyCode() {
        return webPropertyCode;
    }


    /**
     * Sets the webPropertyCode value for this LineItemSummary.
     * 
     * @param webPropertyCode   * The web property code used for dynamic allocation line items.
     * This web
     *                 property is only required with line item types
     *                 {@link LineItemType#AD_EXCHANGE} and {@link LineItemType#ADSENSE}.
     */
    public void setWebPropertyCode(java.lang.String webPropertyCode) {
        this.webPropertyCode = webPropertyCode;
    }


    /**
     * Gets the appliedLabels value for this LineItemSummary.
     * 
     * @return appliedLabels   * The set of labels applied directly to this line item.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this LineItemSummary.
     * 
     * @param appliedLabels   * The set of labels applied directly to this line item.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201802.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201802.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this LineItemSummary.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels inherited from the order that contains
     * this
     *                 line item and the advertiser that owns the order.
     * If a label has been
     *                 negated, only the negated label is returned. This
     * field is readonly
     *                 and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this LineItemSummary.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels inherited from the order that contains
     * this
     *                 line item and the advertiser that owns the order.
     * If a label has been
     *                 negated, only the negated label is returned. This
     * field is readonly
     *                 and is assigned by Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201802.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201802.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the disableSameAdvertiserCompetitiveExclusion value for this LineItemSummary.
     * 
     * @return disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be
     *                 blocked from serving with line items from the same
     * advertiser. Setting this
     *                 to {@code true} will allow line items from the same
     * advertiser to serve
     *                 regardless of the other competitive exclusion labels
     * being applied.
     */
    public java.lang.Boolean getDisableSameAdvertiserCompetitiveExclusion() {
        return disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Sets the disableSameAdvertiserCompetitiveExclusion value for this LineItemSummary.
     * 
     * @param disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be
     *                 blocked from serving with line items from the same
     * advertiser. Setting this
     *                 to {@code true} will allow line items from the same
     * advertiser to serve
     *                 regardless of the other competitive exclusion labels
     * being applied.
     */
    public void setDisableSameAdvertiserCompetitiveExclusion(java.lang.Boolean disableSameAdvertiserCompetitiveExclusion) {
        this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Gets the lastModifiedByApp value for this LineItemSummary.
     * 
     * @return lastModifiedByApp   * The application that last modified this line item. This attribute
     * is read only
     *                 and is assigned by Google.
     */
    public java.lang.String getLastModifiedByApp() {
        return lastModifiedByApp;
    }


    /**
     * Sets the lastModifiedByApp value for this LineItemSummary.
     * 
     * @param lastModifiedByApp   * The application that last modified this line item. This attribute
     * is read only
     *                 and is assigned by Google.
     */
    public void setLastModifiedByApp(java.lang.String lastModifiedByApp) {
        this.lastModifiedByApp = lastModifiedByApp;
    }


    /**
     * Gets the notes value for this LineItemSummary.
     * 
     * @return notes   * Provides any additional notes that may annotate the {@code
     * LineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this LineItemSummary.
     * 
     * @param notes   * Provides any additional notes that may annotate the {@code
     * LineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the lastModifiedDateTime value for this LineItemSummary.
     * 
     * @return lastModifiedDateTime   * The date and time this line item was last modified.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this LineItemSummary.
     * 
     * @param lastModifiedDateTime   * The date and time this line item was last modified.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the creationDateTime value for this LineItemSummary.
     * 
     * @return creationDateTime   * This attribute may be {@code null} for line items created before
     * this feature was introduced.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this LineItemSummary.
     * 
     * @param creationDateTime   * This attribute may be {@code null} for line items created before
     * this feature was introduced.
     */
    public void setCreationDateTime(com.google.api.ads.dfp.axis.v201802.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the isPrioritizedPreferredDealsEnabled value for this LineItemSummary.
     * 
     * @return isPrioritizedPreferredDealsEnabled   * Whether an AdExchange line item has prioritized preferred deals
     * enabled. This attribute is
     *                 optional and defaults to false.
     */
    public java.lang.Boolean getIsPrioritizedPreferredDealsEnabled() {
        return isPrioritizedPreferredDealsEnabled;
    }


    /**
     * Sets the isPrioritizedPreferredDealsEnabled value for this LineItemSummary.
     * 
     * @param isPrioritizedPreferredDealsEnabled   * Whether an AdExchange line item has prioritized preferred deals
     * enabled. This attribute is
     *                 optional and defaults to false.
     */
    public void setIsPrioritizedPreferredDealsEnabled(java.lang.Boolean isPrioritizedPreferredDealsEnabled) {
        this.isPrioritizedPreferredDealsEnabled = isPrioritizedPreferredDealsEnabled;
    }


    /**
     * Gets the adExchangeAuctionOpeningPriority value for this LineItemSummary.
     * 
     * @return adExchangeAuctionOpeningPriority   * The priority at which an Ad Exchange line item enters the open
     * Ad Exchange auction if the
     *                 preferred deal fails to transact. This attribute is
     * optional. If prioritized preferred deals
     *                 are enabled, it defaults to 12. Otherwise, it is ignored.
     */
    public java.lang.Integer getAdExchangeAuctionOpeningPriority() {
        return adExchangeAuctionOpeningPriority;
    }


    /**
     * Sets the adExchangeAuctionOpeningPriority value for this LineItemSummary.
     * 
     * @param adExchangeAuctionOpeningPriority   * The priority at which an Ad Exchange line item enters the open
     * Ad Exchange auction if the
     *                 preferred deal fails to transact. This attribute is
     * optional. If prioritized preferred deals
     *                 are enabled, it defaults to 12. Otherwise, it is ignored.
     */
    public void setAdExchangeAuctionOpeningPriority(java.lang.Integer adExchangeAuctionOpeningPriority) {
        this.adExchangeAuctionOpeningPriority = adExchangeAuctionOpeningPriority;
    }


    /**
     * Gets the customFieldValues value for this LineItemSummary.
     * 
     * @return customFieldValues   * The values of the custom fields associated with this line item.
     */
    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this LineItemSummary.
     * 
     * @param customFieldValues   * The values of the custom fields associated with this line item.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the isSetTopBoxEnabled value for this LineItemSummary.
     * 
     * @return isSetTopBoxEnabled   * Flag that specifies whether this {@code LineItem} is a set-top
     * box enabled line item.
     *                 Set-top box line items only support the following
     * creative sizes: 1920x1080 and 640x480.
     *                 
     *                 <p>This attribute is read-only after creation.
     */
    public java.lang.Boolean getIsSetTopBoxEnabled() {
        return isSetTopBoxEnabled;
    }


    /**
     * Sets the isSetTopBoxEnabled value for this LineItemSummary.
     * 
     * @param isSetTopBoxEnabled   * Flag that specifies whether this {@code LineItem} is a set-top
     * box enabled line item.
     *                 Set-top box line items only support the following
     * creative sizes: 1920x1080 and 640x480.
     *                 
     *                 <p>This attribute is read-only after creation.
     */
    public void setIsSetTopBoxEnabled(java.lang.Boolean isSetTopBoxEnabled) {
        this.isSetTopBoxEnabled = isSetTopBoxEnabled;
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
     * Gets the setTopBoxDisplayInfo value for this LineItemSummary.
     * 
     * @return setTopBoxDisplayInfo   * Additional information for set-top box enabled line items.
     * This attribute is optional and only
     *                 meaningful when {@link #isSetTopBoxEnabled} is {@code
     * true}.
     */
    public com.google.api.ads.dfp.axis.v201802.SetTopBoxInfo getSetTopBoxDisplayInfo() {
        return setTopBoxDisplayInfo;
    }


    /**
     * Sets the setTopBoxDisplayInfo value for this LineItemSummary.
     * 
     * @param setTopBoxDisplayInfo   * Additional information for set-top box enabled line items.
     * This attribute is optional and only
     *                 meaningful when {@link #isSetTopBoxEnabled} is {@code
     * true}.
     */
    public void setSetTopBoxDisplayInfo(com.google.api.ads.dfp.axis.v201802.SetTopBoxInfo setTopBoxDisplayInfo) {
        this.setTopBoxDisplayInfo = setTopBoxDisplayInfo;
    }


    /**
     * Gets the programmaticCreativeSource value for this LineItemSummary.
     * 
     * @return programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     *                 This is a read-only field. Any changes must be made
     * on the {@link ProposalLineItem}.
     */
    public com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource getProgrammaticCreativeSource() {
        return programmaticCreativeSource;
    }


    /**
     * Sets the programmaticCreativeSource value for this LineItemSummary.
     * 
     * @param programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     *                 This is a read-only field. Any changes must be made
     * on the {@link ProposalLineItem}.
     */
    public void setProgrammaticCreativeSource(com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource programmaticCreativeSource) {
        this.programmaticCreativeSource = programmaticCreativeSource;
    }


    /**
     * Gets the videoMaxDuration value for this LineItemSummary.
     * 
     * @return videoMaxDuration   * The max duration of a video creative associated with this {@code
     * LineItem} in
     *                 milliseconds. This attribute is optional, defaults
     * to 0, and only meaningful if this is
     *                 a video line item.
     */
    public java.lang.Long getVideoMaxDuration() {
        return videoMaxDuration;
    }


    /**
     * Sets the videoMaxDuration value for this LineItemSummary.
     * 
     * @param videoMaxDuration   * The max duration of a video creative associated with this {@code
     * LineItem} in
     *                 milliseconds. This attribute is optional, defaults
     * to 0, and only meaningful if this is
     *                 a video line item.
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
    public com.google.api.ads.dfp.axis.v201802.Goal getPrimaryGoal() {
        return primaryGoal;
    }


    /**
     * Sets the primaryGoal value for this LineItemSummary.
     * 
     * @param primaryGoal   * The primary goal that this {@code LineItem} is associated with,
     * which is used in its pacing and
     *                 budgeting.
     */
    public void setPrimaryGoal(com.google.api.ads.dfp.axis.v201802.Goal primaryGoal) {
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
    public com.google.api.ads.dfp.axis.v201802.Goal[] getSecondaryGoals() {
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
    public void setSecondaryGoals(com.google.api.ads.dfp.axis.v201802.Goal[] secondaryGoals) {
        this.secondaryGoals = secondaryGoals;
    }

    public com.google.api.ads.dfp.axis.v201802.Goal getSecondaryGoals(int i) {
        return this.secondaryGoals[i];
    }

    public void setSecondaryGoals(int i, com.google.api.ads.dfp.axis.v201802.Goal _value) {
        this.secondaryGoals[i] = _value;
    }


    /**
     * Gets the grpSettings value for this LineItemSummary.
     * 
     * @return grpSettings   * Contains the information for a line item which has a target
     * GRP demographic.
     */
    public com.google.api.ads.dfp.axis.v201802.GrpSettings getGrpSettings() {
        return grpSettings;
    }


    /**
     * Sets the grpSettings value for this LineItemSummary.
     * 
     * @param grpSettings   * Contains the information for a line item which has a target
     * GRP demographic.
     */
    public void setGrpSettings(com.google.api.ads.dfp.axis.v201802.GrpSettings grpSettings) {
        this.grpSettings = grpSettings;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LineItemSummary)) return false;
        LineItemSummary other = (LineItemSummary) obj;
        if (obj == null) return false;
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
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
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
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.isPrioritizedPreferredDealsEnabled==null && other.getIsPrioritizedPreferredDealsEnabled()==null) || 
             (this.isPrioritizedPreferredDealsEnabled!=null &&
              this.isPrioritizedPreferredDealsEnabled.equals(other.getIsPrioritizedPreferredDealsEnabled()))) &&
            ((this.adExchangeAuctionOpeningPriority==null && other.getAdExchangeAuctionOpeningPriority()==null) || 
             (this.adExchangeAuctionOpeningPriority!=null &&
              this.adExchangeAuctionOpeningPriority.equals(other.getAdExchangeAuctionOpeningPriority()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.isSetTopBoxEnabled==null && other.getIsSetTopBoxEnabled()==null) || 
             (this.isSetTopBoxEnabled!=null &&
              this.isSetTopBoxEnabled.equals(other.getIsSetTopBoxEnabled()))) &&
            ((this.isMissingCreatives==null && other.getIsMissingCreatives()==null) || 
             (this.isMissingCreatives!=null &&
              this.isMissingCreatives.equals(other.getIsMissingCreatives()))) &&
            ((this.setTopBoxDisplayInfo==null && other.getSetTopBoxDisplayInfo()==null) || 
             (this.setTopBoxDisplayInfo!=null &&
              this.setTopBoxDisplayInfo.equals(other.getSetTopBoxDisplayInfo()))) &&
            ((this.programmaticCreativeSource==null && other.getProgrammaticCreativeSource()==null) || 
             (this.programmaticCreativeSource!=null &&
              this.programmaticCreativeSource.equals(other.getProgrammaticCreativeSource()))) &&
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
              this.grpSettings.equals(other.getGrpSettings())));
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
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
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
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getIsPrioritizedPreferredDealsEnabled() != null) {
            _hashCode += getIsPrioritizedPreferredDealsEnabled().hashCode();
        }
        if (getAdExchangeAuctionOpeningPriority() != null) {
            _hashCode += getAdExchangeAuctionOpeningPriority().hashCode();
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
        if (getIsSetTopBoxEnabled() != null) {
            _hashCode += getIsSetTopBoxEnabled().hashCode();
        }
        if (getIsMissingCreatives() != null) {
            _hashCode += getIsMissingCreatives().hashCode();
        }
        if (getSetTopBoxDisplayInfo() != null) {
            _hashCode += getSetTopBoxDisplayInfo().hashCode();
        }
        if (getProgrammaticCreativeSource() != null) {
            _hashCode += getProgrammaticCreativeSource().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LineItemSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "orderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "StartDateTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoExtensionDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "autoExtensionDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unlimitedEndDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "unlimitedEndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "valueCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "discountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedUnitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "contractedUnitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityAssociations");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "activityAssociations"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemActivityAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOverbook");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "allowOverbook"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipInventoryCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "skipInventoryCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipCrossSellingRuleWarningChecks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "skipCrossSellingRuleWarningChecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveAtCreation");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reserveAtCreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Stats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reservationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemSummary.ReservationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webPropertyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "webPropertyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSameAdvertiserCompetitiveExclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "disableSameAdvertiserCompetitiveExclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedByApp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedByApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrioritizedPreferredDealsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isPrioritizedPreferredDealsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adExchangeAuctionOpeningPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "adExchangeAuctionOpeningPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSetTopBoxEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isSetTopBoxEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isMissingCreatives");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isMissingCreatives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setTopBoxDisplayInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "setTopBoxDisplayInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "SetTopBoxInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programmaticCreativeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "programmaticCreativeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProgrammaticCreativeSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "videoMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryGoal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "primaryGoal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Goal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryGoals");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "secondaryGoals"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Goal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "grpSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "GrpSettings"));
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
