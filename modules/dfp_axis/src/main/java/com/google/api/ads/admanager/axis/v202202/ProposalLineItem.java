// Copyright 2022 Google LLC
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
 * ProposalLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202202;


/**
 * A {@code ProposalLineItem} is added to a programmatic {@link Proposal}
 * and is similar to a
 *             delivery {@link LineItem}. It contains delivery details
 * including information like impression
 *             goal or quantity, start and end times, and targeting.
 */
public class ProposalLineItem  implements java.io.Serializable {
    /* The unique ID of the {@code ProposalLineItem}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* The unique ID of the {@link Proposal}, to which the {@code
     * ProposalLineItem}
     *                 belongs. This attribute is required for creation and
     * then is readonly.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.Long proposalId;

    /* The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.String name;

    /* The date and time at which the line item associated with the
     * {@code ProposalLineItem} is enabled to begin serving. This attribute
     * is optional
     *                 during creation, but required and must be in the future
     * when it turns into a line item.
     *                 The {@link DateTime#timeZoneID} is required if start
     * date time is not {@code null}.
     *                 This attribute becomes readonly once the {@code ProposalLineItem}
     * has started delivering. */
    private com.google.api.ads.admanager.axis.v202202.DateTime startDateTime;

    /* The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is optional
     * during creation,
     *                 but required and must be after the {@link #startDateTime}.
     * The {@link DateTime#timeZoneID} is
     *                 required if end date time is not {@code null}. */
    private com.google.api.ads.admanager.axis.v202202.DateTime endDateTime;

    /* The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this {@code
     *                 ProposalLineItem}. The number of serving days is calculated
     * in this time zone. So if {@link
     *                 #rateType} is {@link RateType#CPD}, it will affect
     * the cost calculation. The {@link
     *                 #startDateTime} and {@link #endDateTime} will be returned
     * in this time zone. This attribute is
     *                 optional and defaults to the network's time zone.
     *                 This attribute is read-only. */
    private java.lang.String timeZoneId;

    /* Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This attribute is
     *                 optional and has a maximum length of 65,535 characters.
     * This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration. */
    private java.lang.String internalNotes;

    /* The archival status of the {@code ProposalLineItem}.
     *                 This attribute is read-only. */
    private java.lang.Boolean isArchived;

    /* The goal(i.e. contracted quantity, quantity or limit) that
     * this {@code ProposalLineItem} is
     *                 associated with, which is used in its pacing and budgeting.
     * {@link Goal#units} must be greater
     *                 than 0 when the proposal line item turns into a line
     * item, {@link Goal#goalType} and {@link
     *                 Goal#unitType} are readonly.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * goal type can only be {@link GoalType#NONE}.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private com.google.api.ads.admanager.axis.v202202.Goal goal;

    /* The contracted number of impressions or clicks.
     *                 If this is a {@link LineItemType#SPONSORSHIP} {@code
     * ProposalLineItem}, has
     *                 {@link RateType#CPD} as a rate type, and {@link #isProgrammatic}
     * is false,
     *                 then this represents the lifetime minimum impression.
     * If this is a {@link LineItemType#SPONSORSHIP} {@code ProposalLineItem},
     * has
     *                 {@link RateType#CPD} as a rate type, and {@link #isProgrammatic}
     * is true,
     *                 then this represents the daily minimum impression.
     * <p>This attribute is required for percentage-based-goal
     *                 {@link ProposalLineItem proposal line items}.  It
     * does not impact ad-serving and is for
     *                 reporting purposes only. */
    private java.lang.Long contractedUnitsBought;

    /* The strategy for delivering ads over the course of the {@code
     * ProposalLineItem}'s
     *                 duration. This attribute is required.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * value can only be
     *                 {@link DeliveryRateType#FRONTLOADED}. */
    private com.google.api.ads.admanager.axis.v202202.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This attribute
     *                 is optional during creation and defaults to the
     *                 {@link Product#roadblockingType product's roadblocking
     * type},
     *                 or {@link RoadblockingType#ONE_OR_MORE} if not specified
     * by the product. */
    private com.google.api.ads.admanager.axis.v202202.RoadblockingType roadblockingType;

    /* The delivery option for companions. This is only valid if the
     * roadblocking type is
     *                 {@link RoadblockingType#CREATIVE_SET}. The default
     * value for roadblocking creatives is
     *                 {@link CompanionDeliveryOption#OPTIONAL}. The default
     * value in other cases is
     *                 {@link CompanionDeliveryOption#UNKNOWN}. Providing
     * something other than
     *                 {@link CompanionDeliveryOption#UNKNOWN} will cause
     * an error. */
    private com.google.api.ads.admanager.axis.v202202.CompanionDeliveryOption companionDeliveryOption;

    /* The max duration of a video creative associated with this {@code
     * ProposalLineItem}
     *                 in milliseconds. This attribute is optional, defaults
     * to the {@link Product#videoMaxDuration}
     *                 on the {@link Product} it was created with, and only
     * meaningful if this is a
     *                 video proposal line item. */
    private java.lang.Long videoMaxDuration;

    /* The proposal line item's creatives' skippability. This attribute
     * is optional, only applicable
     *                 for video proposal line items, and defaults to {@link
     * SkippableAdType#NOT_SKIPPABLE}. */
    private com.google.api.ads.admanager.axis.v202202.SkippableAdType videoCreativeSkippableAdType;

    /* The set of frequency capping units for this {@code ProposalLineItem}.
     * This
     *                 attribute is optional during creation and defaults
     * to the
     *                 {@link Product#frequencyCaps product's frequency caps}
     * if
     *                 {@link Product#allowFrequencyCapsCustomization} is
     * {@code false}. */
    private com.google.api.ads.admanager.axis.v202202.FrequencyCap[] frequencyCaps;

    /* The unique ID of corresponding {@link LineItem}. This will
     * be {@code null} if the {@link
     *                 Proposal} has not been pushed to Ad Manager.
     *                 This attribute is read-only. */
    private java.lang.Long dfpLineItemId;

    /* The corresponding {@link LineItemType} of the {@code ProposalLineItem}.
     * For a programmatic {@code ProposalLineItem}, the value can only be
     * one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#PREFERRED_DEAL}</li>
     *                 </ul>
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private com.google.api.ads.admanager.axis.v202202.LineItemType lineItemType;

    /* The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the default priority of the
     *                 {@link #lineItemType}. For forecasting, this attribute
     * is optional and has a default value
     *                 assigned by Google. See {@link LineItem#priority}
     * for more information. */
    private java.lang.Integer lineItemPriority;

    /* The method used for billing the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private com.google.api.ads.admanager.axis.v202202.RateType rateType;

    /* Details about the creatives that are expected to serve through
     * the {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the {@link
     *                 Product#creativePlaceholders product's creative placeholders}.
     * <span class="constraint Required">This attribute is required.</span> */
    private com.google.api.ads.admanager.axis.v202202.CreativePlaceholder[] creativePlaceholders;

    /* Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}. */
    private com.google.api.ads.admanager.axis.v202202.Targeting targeting;

    /* The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private com.google.api.ads.admanager.axis.v202202.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional. */
    private com.google.api.ads.admanager.axis.v202202.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.AppliedLabel[] effectiveAppliedLabels;

    /* If a line item has a series of competitive exclusions on it,
     * it could be blocked from serving
     *                 with line items from the same advertiser. Setting
     * this to {@code true} will allow line items
     *                 from the same advertiser to serve regardless of the
     * other competitive exclusion labels being
     *                 applied.
     *                 
     *                 <p>This attribute is optional and defaults to false. */
    private java.lang.Boolean disableSameAdvertiserCompetitiveExclusion;

    /* Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute is read-only. */
    private java.lang.Boolean isSold;

    /* The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It doesn't include agency
     *                 commission.
     *                 
     *                 <p>For example, if {@link Proposal#currencyCode} is
     * 'USD', then $123.4567 could be
     *                 represented as 123456700, but further precision is
     * not supported.
     *                 
     *                 <p>When using sales management, at least one of the
     * four fields
     *                 {@link ProposalLineItem#netRate}, {@link ProposalLineItem#grossRate},
     * {@link ProposalLineItem#netCost} and {@link ProposalLineItem#grossCost}
     * is required.
     *                 
     *                 <p>When not using sales management, at least one of
     * the two fields
     *                 {@link ProposalLineItem#netRate} and {@link ProposalLineItem#netCost}
     * is required. */
    private com.google.api.ads.admanager.axis.v202202.Money netRate;

    /* The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the {@link
     *                 Money#getAmountInMicros} must be multiples of 10000.
     * It doesn't include agency commission.
     *                 
     *                 <p>For example, if {@link Proposal#currencyCode} is
     * 'USD', then $123.45 could be represented as
     *                 123450000, but further precision is not supported.
     * 
     *                 <p>At least one of the two fields {@link ProposalLineItem#netRate}
     * and {@link
     *                 ProposalLineItem#netCost} is required. */
    private com.google.api.ads.admanager.axis.v202202.Money netCost;

    /* Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This will be {@code null} if the delivery indicator
     * information is not available due to one
     *                 of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to Ad Manager.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This will be {@code null} if the
     *                 delivery data cannot be computed due to one of the
     * following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to Ad Manager.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.DeliveryData deliveryData;

    /* The status of the {@link LineItem} generated from this proposal
     * line item.
     *                 This will be {@code null} if the proposal line item
     * has not pushed to Ad Manager.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.ComputedStatus computedStatus;

    /* The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 <p>This attribute is assigned by Google when a {@code
     * ProposalLineItem} is updated.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.DateTime lastModifiedDateTime;

    /* The reservation status of the {@link ProposalLineItem}.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.ReservationStatus reservationStatus;

    /* The last {@link DateTime} when the {@link ProposalLineItem}
     * reserved inventory.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.DateTime lastReservationDateTime;

    /* The environment that the {@code ProposalLineItem} is targeting.
     * The default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is {@link EnvironmentType#VIDEO_PLAYER},
     *                 then this {@code ProposalLineItem} can only target
     * {@link AdUnit ad units} that have
     *                 {@link AdUnitSize sizes} whose {@link AdUnitSize#environmentType}
     * is also
     *                 {@link EnvironmentType#VIDEO_PLAYER}.
     *                 
     *                 <p>This field is read-only and set to {@link Product#environmentType}
     * of the product
     *                 this proposal line item was created from. */
    private com.google.api.ads.admanager.axis.v202202.EnvironmentType environmentType;

    /* The set of {@link AllowedFormats} that this proposal line item
     * can have. If the set is empty,
     *                 this proposal line item allows all formats. */
    private com.google.api.ads.admanager.axis.v202202.AllowedFormats[] allowedFormats;

    /* Whether or not the {@link Proposal} for this {@code ProposalLineItem}
     * is a programmatic deal.
     *                 This attribute is populated from {@link Proposal#isProgrammatic}.
     * This attribute is read-only. */
    private java.lang.Boolean isProgrammatic;

    /* The marketplace info if this proposal line item is programmatic,
     * null otherwise. */
    private com.google.api.ads.admanager.axis.v202202.ProposalLineItemMarketplaceInfo marketplaceInfo;

    /* Additional terms shown to the buyer in Marketplace. */
    private java.lang.String additionalTerms;

    /* Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item. */
    private com.google.api.ads.admanager.axis.v202202.ProgrammaticCreativeSource programmaticCreativeSource;

    /* Contains the information for a proposal line item which has
     * a target GRP demographic. */
    private com.google.api.ads.admanager.axis.v202202.GrpSettings grpSettings;

    /* The estimated minimum impressions that should be delivered
     * for a proposal line item. */
    private java.lang.Long estimatedMinimumImpressions;

    /* Contains third party measurement settings for cross-sell Partners */
    private com.google.api.ads.admanager.axis.v202202.ThirdPartyMeasurementSettings thirdPartyMeasurementSettings;

    /* Makegood info for this proposal line item. Immutable once created.
     * 
     *                 <p>Null if this proposal line item is not a makegood. */
    private com.google.api.ads.admanager.axis.v202202.ProposalLineItemMakegoodInfo makegoodInfo;

    /* Whether this proposal line item has an associated makegood.
     * This attribute is read-only. */
    private java.lang.Boolean hasMakegood;

    /* Whether a new makegood associated with this line item can be
     * created.
     *                 This attribute is read-only. */
    private java.lang.Boolean canCreateMakegood;

    /* The {@link NegotiationRole} that paused the proposal line item,
     * i.e. {@link
     *                 NegotiationRole#seller} or {@link NegotiationRole#buyer},
     * or {@code null} when the proposal is
     *                 not paused.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202202.NegotiationRole pauseRole;

    /* The reason for pausing the {@link ProposalLineItem}, provided
     * by the {@link pauseRole}. It is
     *                 {@code null} when the {@link ProposalLineItem} is
     * not paused.
     *                 This attribute is read-only. */
    private java.lang.String pauseReason;

    public ProposalLineItem() {
    }

    public ProposalLineItem(
           java.lang.Long id,
           java.lang.Long proposalId,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202202.DateTime startDateTime,
           com.google.api.ads.admanager.axis.v202202.DateTime endDateTime,
           java.lang.String timeZoneId,
           java.lang.String internalNotes,
           java.lang.Boolean isArchived,
           com.google.api.ads.admanager.axis.v202202.Goal goal,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.admanager.axis.v202202.DeliveryRateType deliveryRateType,
           com.google.api.ads.admanager.axis.v202202.RoadblockingType roadblockingType,
           com.google.api.ads.admanager.axis.v202202.CompanionDeliveryOption companionDeliveryOption,
           java.lang.Long videoMaxDuration,
           com.google.api.ads.admanager.axis.v202202.SkippableAdType videoCreativeSkippableAdType,
           com.google.api.ads.admanager.axis.v202202.FrequencyCap[] frequencyCaps,
           java.lang.Long dfpLineItemId,
           com.google.api.ads.admanager.axis.v202202.LineItemType lineItemType,
           java.lang.Integer lineItemPriority,
           com.google.api.ads.admanager.axis.v202202.RateType rateType,
           com.google.api.ads.admanager.axis.v202202.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.admanager.axis.v202202.Targeting targeting,
           com.google.api.ads.admanager.axis.v202202.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202202.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202202.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           java.lang.Boolean isSold,
           com.google.api.ads.admanager.axis.v202202.Money netRate,
           com.google.api.ads.admanager.axis.v202202.Money netCost,
           com.google.api.ads.admanager.axis.v202202.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.admanager.axis.v202202.DeliveryData deliveryData,
           com.google.api.ads.admanager.axis.v202202.ComputedStatus computedStatus,
           com.google.api.ads.admanager.axis.v202202.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202202.ReservationStatus reservationStatus,
           com.google.api.ads.admanager.axis.v202202.DateTime lastReservationDateTime,
           com.google.api.ads.admanager.axis.v202202.EnvironmentType environmentType,
           com.google.api.ads.admanager.axis.v202202.AllowedFormats[] allowedFormats,
           java.lang.Boolean isProgrammatic,
           com.google.api.ads.admanager.axis.v202202.ProposalLineItemMarketplaceInfo marketplaceInfo,
           java.lang.String additionalTerms,
           com.google.api.ads.admanager.axis.v202202.ProgrammaticCreativeSource programmaticCreativeSource,
           com.google.api.ads.admanager.axis.v202202.GrpSettings grpSettings,
           java.lang.Long estimatedMinimumImpressions,
           com.google.api.ads.admanager.axis.v202202.ThirdPartyMeasurementSettings thirdPartyMeasurementSettings,
           com.google.api.ads.admanager.axis.v202202.ProposalLineItemMakegoodInfo makegoodInfo,
           java.lang.Boolean hasMakegood,
           java.lang.Boolean canCreateMakegood,
           com.google.api.ads.admanager.axis.v202202.NegotiationRole pauseRole,
           java.lang.String pauseReason) {
           this.id = id;
           this.proposalId = proposalId;
           this.name = name;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.timeZoneId = timeZoneId;
           this.internalNotes = internalNotes;
           this.isArchived = isArchived;
           this.goal = goal;
           this.contractedUnitsBought = contractedUnitsBought;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.companionDeliveryOption = companionDeliveryOption;
           this.videoMaxDuration = videoMaxDuration;
           this.videoCreativeSkippableAdType = videoCreativeSkippableAdType;
           this.frequencyCaps = frequencyCaps;
           this.dfpLineItemId = dfpLineItemId;
           this.lineItemType = lineItemType;
           this.lineItemPriority = lineItemPriority;
           this.rateType = rateType;
           this.creativePlaceholders = creativePlaceholders;
           this.targeting = targeting;
           this.customFieldValues = customFieldValues;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
           this.isSold = isSold;
           this.netRate = netRate;
           this.netCost = netCost;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.computedStatus = computedStatus;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.reservationStatus = reservationStatus;
           this.lastReservationDateTime = lastReservationDateTime;
           this.environmentType = environmentType;
           this.allowedFormats = allowedFormats;
           this.isProgrammatic = isProgrammatic;
           this.marketplaceInfo = marketplaceInfo;
           this.additionalTerms = additionalTerms;
           this.programmaticCreativeSource = programmaticCreativeSource;
           this.grpSettings = grpSettings;
           this.estimatedMinimumImpressions = estimatedMinimumImpressions;
           this.thirdPartyMeasurementSettings = thirdPartyMeasurementSettings;
           this.makegoodInfo = makegoodInfo;
           this.hasMakegood = hasMakegood;
           this.canCreateMakegood = canCreateMakegood;
           this.pauseRole = pauseRole;
           this.pauseReason = pauseReason;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("additionalTerms", getAdditionalTerms())
            .add("allowedFormats", getAllowedFormats())
            .add("appliedLabels", getAppliedLabels())
            .add("canCreateMakegood", getCanCreateMakegood())
            .add("companionDeliveryOption", getCompanionDeliveryOption())
            .add("computedStatus", getComputedStatus())
            .add("contractedUnitsBought", getContractedUnitsBought())
            .add("creativePlaceholders", getCreativePlaceholders())
            .add("customFieldValues", getCustomFieldValues())
            .add("deliveryData", getDeliveryData())
            .add("deliveryIndicator", getDeliveryIndicator())
            .add("deliveryRateType", getDeliveryRateType())
            .add("dfpLineItemId", getDfpLineItemId())
            .add("disableSameAdvertiserCompetitiveExclusion", getDisableSameAdvertiserCompetitiveExclusion())
            .add("effectiveAppliedLabels", getEffectiveAppliedLabels())
            .add("endDateTime", getEndDateTime())
            .add("environmentType", getEnvironmentType())
            .add("estimatedMinimumImpressions", getEstimatedMinimumImpressions())
            .add("frequencyCaps", getFrequencyCaps())
            .add("goal", getGoal())
            .add("grpSettings", getGrpSettings())
            .add("hasMakegood", getHasMakegood())
            .add("id", getId())
            .add("internalNotes", getInternalNotes())
            .add("isArchived", getIsArchived())
            .add("isProgrammatic", getIsProgrammatic())
            .add("isSold", getIsSold())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lastReservationDateTime", getLastReservationDateTime())
            .add("lineItemPriority", getLineItemPriority())
            .add("lineItemType", getLineItemType())
            .add("makegoodInfo", getMakegoodInfo())
            .add("marketplaceInfo", getMarketplaceInfo())
            .add("name", getName())
            .add("netCost", getNetCost())
            .add("netRate", getNetRate())
            .add("pauseReason", getPauseReason())
            .add("pauseRole", getPauseRole())
            .add("programmaticCreativeSource", getProgrammaticCreativeSource())
            .add("proposalId", getProposalId())
            .add("rateType", getRateType())
            .add("reservationStatus", getReservationStatus())
            .add("roadblockingType", getRoadblockingType())
            .add("startDateTime", getStartDateTime())
            // Exclude targeting to avoid overly verbose output
            .add("thirdPartyMeasurementSettings", getThirdPartyMeasurementSettings())
            .add("timeZoneId", getTimeZoneId())
            .add("videoCreativeSkippableAdType", getVideoCreativeSkippableAdType())
            .add("videoMaxDuration", getVideoMaxDuration())
            .toString();
    }

    /**
     * Gets the id value for this ProposalLineItem.
     * 
     * @return id   * The unique ID of the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProposalLineItem.
     * 
     * @param id   * The unique ID of the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the proposalId value for this ProposalLineItem.
     * 
     * @return proposalId   * The unique ID of the {@link Proposal}, to which the {@code
     * ProposalLineItem}
     *                 belongs. This attribute is required for creation and
     * then is readonly.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.Long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this ProposalLineItem.
     * 
     * @param proposalId   * The unique ID of the {@link Proposal}, to which the {@code
     * ProposalLineItem}
     *                 belongs. This attribute is required for creation and
     * then is readonly.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the name value for this ProposalLineItem.
     * 
     * @return name   * The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProposalLineItem.
     * 
     * @param name   * The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDateTime value for this ProposalLineItem.
     * 
     * @return startDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} is enabled to begin serving. This attribute
     * is optional
     *                 during creation, but required and must be in the future
     * when it turns into a line item.
     *                 The {@link DateTime#timeZoneID} is required if start
     * date time is not {@code null}.
     *                 This attribute becomes readonly once the {@code ProposalLineItem}
     * has started delivering.
     */
    public com.google.api.ads.admanager.axis.v202202.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProposalLineItem.
     * 
     * @param startDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} is enabled to begin serving. This attribute
     * is optional
     *                 during creation, but required and must be in the future
     * when it turns into a line item.
     *                 The {@link DateTime#timeZoneID} is required if start
     * date time is not {@code null}.
     *                 This attribute becomes readonly once the {@code ProposalLineItem}
     * has started delivering.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202202.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProposalLineItem.
     * 
     * @return endDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is optional
     * during creation,
     *                 but required and must be after the {@link #startDateTime}.
     * The {@link DateTime#timeZoneID} is
     *                 required if end date time is not {@code null}.
     */
    public com.google.api.ads.admanager.axis.v202202.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProposalLineItem.
     * 
     * @param endDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is optional
     * during creation,
     *                 but required and must be after the {@link #startDateTime}.
     * The {@link DateTime#timeZoneID} is
     *                 required if end date time is not {@code null}.
     */
    public void setEndDateTime(com.google.api.ads.admanager.axis.v202202.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the timeZoneId value for this ProposalLineItem.
     * 
     * @return timeZoneId   * The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this {@code
     *                 ProposalLineItem}. The number of serving days is calculated
     * in this time zone. So if {@link
     *                 #rateType} is {@link RateType#CPD}, it will affect
     * the cost calculation. The {@link
     *                 #startDateTime} and {@link #endDateTime} will be returned
     * in this time zone. This attribute is
     *                 optional and defaults to the network's time zone.
     *                 This attribute is read-only.
     */
    public java.lang.String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this ProposalLineItem.
     * 
     * @param timeZoneId   * The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this {@code
     *                 ProposalLineItem}. The number of serving days is calculated
     * in this time zone. So if {@link
     *                 #rateType} is {@link RateType#CPD}, it will affect
     * the cost calculation. The {@link
     *                 #startDateTime} and {@link #endDateTime} will be returned
     * in this time zone. This attribute is
     *                 optional and defaults to the network's time zone.
     *                 This attribute is read-only.
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the internalNotes value for this ProposalLineItem.
     * 
     * @return internalNotes   * Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This attribute is
     *                 optional and has a maximum length of 65,535 characters.
     * This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration.
     */
    public java.lang.String getInternalNotes() {
        return internalNotes;
    }


    /**
     * Sets the internalNotes value for this ProposalLineItem.
     * 
     * @param internalNotes   * Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This attribute is
     *                 optional and has a maximum length of 65,535 characters.
     * This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration.
     */
    public void setInternalNotes(java.lang.String internalNotes) {
        this.internalNotes = internalNotes;
    }


    /**
     * Gets the isArchived value for this ProposalLineItem.
     * 
     * @return isArchived   * The archival status of the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this ProposalLineItem.
     * 
     * @param isArchived   * The archival status of the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the goal value for this ProposalLineItem.
     * 
     * @return goal   * The goal(i.e. contracted quantity, quantity or limit) that
     * this {@code ProposalLineItem} is
     *                 associated with, which is used in its pacing and budgeting.
     * {@link Goal#units} must be greater
     *                 than 0 when the proposal line item turns into a line
     * item, {@link Goal#goalType} and {@link
     *                 Goal#unitType} are readonly.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * goal type can only be {@link GoalType#NONE}.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public com.google.api.ads.admanager.axis.v202202.Goal getGoal() {
        return goal;
    }


    /**
     * Sets the goal value for this ProposalLineItem.
     * 
     * @param goal   * The goal(i.e. contracted quantity, quantity or limit) that
     * this {@code ProposalLineItem} is
     *                 associated with, which is used in its pacing and budgeting.
     * {@link Goal#units} must be greater
     *                 than 0 when the proposal line item turns into a line
     * item, {@link Goal#goalType} and {@link
     *                 Goal#unitType} are readonly.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * goal type can only be {@link GoalType#NONE}.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setGoal(com.google.api.ads.admanager.axis.v202202.Goal goal) {
        this.goal = goal;
    }


    /**
     * Gets the contractedUnitsBought value for this ProposalLineItem.
     * 
     * @return contractedUnitsBought   * The contracted number of impressions or clicks.
     *                 If this is a {@link LineItemType#SPONSORSHIP} {@code
     * ProposalLineItem}, has
     *                 {@link RateType#CPD} as a rate type, and {@link #isProgrammatic}
     * is false,
     *                 then this represents the lifetime minimum impression.
     * If this is a {@link LineItemType#SPONSORSHIP} {@code ProposalLineItem},
     * has
     *                 {@link RateType#CPD} as a rate type, and {@link #isProgrammatic}
     * is true,
     *                 then this represents the daily minimum impression.
     * <p>This attribute is required for percentage-based-goal
     *                 {@link ProposalLineItem proposal line items}.  It
     * does not impact ad-serving and is for
     *                 reporting purposes only.
     */
    public java.lang.Long getContractedUnitsBought() {
        return contractedUnitsBought;
    }


    /**
     * Sets the contractedUnitsBought value for this ProposalLineItem.
     * 
     * @param contractedUnitsBought   * The contracted number of impressions or clicks.
     *                 If this is a {@link LineItemType#SPONSORSHIP} {@code
     * ProposalLineItem}, has
     *                 {@link RateType#CPD} as a rate type, and {@link #isProgrammatic}
     * is false,
     *                 then this represents the lifetime minimum impression.
     * If this is a {@link LineItemType#SPONSORSHIP} {@code ProposalLineItem},
     * has
     *                 {@link RateType#CPD} as a rate type, and {@link #isProgrammatic}
     * is true,
     *                 then this represents the daily minimum impression.
     * <p>This attribute is required for percentage-based-goal
     *                 {@link ProposalLineItem proposal line items}.  It
     * does not impact ad-serving and is for
     *                 reporting purposes only.
     */
    public void setContractedUnitsBought(java.lang.Long contractedUnitsBought) {
        this.contractedUnitsBought = contractedUnitsBought;
    }


    /**
     * Gets the deliveryRateType value for this ProposalLineItem.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the {@code
     * ProposalLineItem}'s
     *                 duration. This attribute is required.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * value can only be
     *                 {@link DeliveryRateType#FRONTLOADED}.
     */
    public com.google.api.ads.admanager.axis.v202202.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this ProposalLineItem.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the {@code
     * ProposalLineItem}'s
     *                 duration. This attribute is required.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * value can only be
     *                 {@link DeliveryRateType#FRONTLOADED}.
     */
    public void setDeliveryRateType(com.google.api.ads.admanager.axis.v202202.DeliveryRateType deliveryRateType) {
        this.deliveryRateType = deliveryRateType;
    }


    /**
     * Gets the roadblockingType value for this ProposalLineItem.
     * 
     * @return roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This attribute
     *                 is optional during creation and defaults to the
     *                 {@link Product#roadblockingType product's roadblocking
     * type},
     *                 or {@link RoadblockingType#ONE_OR_MORE} if not specified
     * by the product.
     */
    public com.google.api.ads.admanager.axis.v202202.RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }


    /**
     * Sets the roadblockingType value for this ProposalLineItem.
     * 
     * @param roadblockingType   * The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This attribute
     *                 is optional during creation and defaults to the
     *                 {@link Product#roadblockingType product's roadblocking
     * type},
     *                 or {@link RoadblockingType#ONE_OR_MORE} if not specified
     * by the product.
     */
    public void setRoadblockingType(com.google.api.ads.admanager.axis.v202202.RoadblockingType roadblockingType) {
        this.roadblockingType = roadblockingType;
    }


    /**
     * Gets the companionDeliveryOption value for this ProposalLineItem.
     * 
     * @return companionDeliveryOption   * The delivery option for companions. This is only valid if the
     * roadblocking type is
     *                 {@link RoadblockingType#CREATIVE_SET}. The default
     * value for roadblocking creatives is
     *                 {@link CompanionDeliveryOption#OPTIONAL}. The default
     * value in other cases is
     *                 {@link CompanionDeliveryOption#UNKNOWN}. Providing
     * something other than
     *                 {@link CompanionDeliveryOption#UNKNOWN} will cause
     * an error.
     */
    public com.google.api.ads.admanager.axis.v202202.CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }


    /**
     * Sets the companionDeliveryOption value for this ProposalLineItem.
     * 
     * @param companionDeliveryOption   * The delivery option for companions. This is only valid if the
     * roadblocking type is
     *                 {@link RoadblockingType#CREATIVE_SET}. The default
     * value for roadblocking creatives is
     *                 {@link CompanionDeliveryOption#OPTIONAL}. The default
     * value in other cases is
     *                 {@link CompanionDeliveryOption#UNKNOWN}. Providing
     * something other than
     *                 {@link CompanionDeliveryOption#UNKNOWN} will cause
     * an error.
     */
    public void setCompanionDeliveryOption(com.google.api.ads.admanager.axis.v202202.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the videoMaxDuration value for this ProposalLineItem.
     * 
     * @return videoMaxDuration   * The max duration of a video creative associated with this {@code
     * ProposalLineItem}
     *                 in milliseconds. This attribute is optional, defaults
     * to the {@link Product#videoMaxDuration}
     *                 on the {@link Product} it was created with, and only
     * meaningful if this is a
     *                 video proposal line item.
     */
    public java.lang.Long getVideoMaxDuration() {
        return videoMaxDuration;
    }


    /**
     * Sets the videoMaxDuration value for this ProposalLineItem.
     * 
     * @param videoMaxDuration   * The max duration of a video creative associated with this {@code
     * ProposalLineItem}
     *                 in milliseconds. This attribute is optional, defaults
     * to the {@link Product#videoMaxDuration}
     *                 on the {@link Product} it was created with, and only
     * meaningful if this is a
     *                 video proposal line item.
     */
    public void setVideoMaxDuration(java.lang.Long videoMaxDuration) {
        this.videoMaxDuration = videoMaxDuration;
    }


    /**
     * Gets the videoCreativeSkippableAdType value for this ProposalLineItem.
     * 
     * @return videoCreativeSkippableAdType   * The proposal line item's creatives' skippability. This attribute
     * is optional, only applicable
     *                 for video proposal line items, and defaults to {@link
     * SkippableAdType#NOT_SKIPPABLE}.
     */
    public com.google.api.ads.admanager.axis.v202202.SkippableAdType getVideoCreativeSkippableAdType() {
        return videoCreativeSkippableAdType;
    }


    /**
     * Sets the videoCreativeSkippableAdType value for this ProposalLineItem.
     * 
     * @param videoCreativeSkippableAdType   * The proposal line item's creatives' skippability. This attribute
     * is optional, only applicable
     *                 for video proposal line items, and defaults to {@link
     * SkippableAdType#NOT_SKIPPABLE}.
     */
    public void setVideoCreativeSkippableAdType(com.google.api.ads.admanager.axis.v202202.SkippableAdType videoCreativeSkippableAdType) {
        this.videoCreativeSkippableAdType = videoCreativeSkippableAdType;
    }


    /**
     * Gets the frequencyCaps value for this ProposalLineItem.
     * 
     * @return frequencyCaps   * The set of frequency capping units for this {@code ProposalLineItem}.
     * This
     *                 attribute is optional during creation and defaults
     * to the
     *                 {@link Product#frequencyCaps product's frequency caps}
     * if
     *                 {@link Product#allowFrequencyCapsCustomization} is
     * {@code false}.
     */
    public com.google.api.ads.admanager.axis.v202202.FrequencyCap[] getFrequencyCaps() {
        return frequencyCaps;
    }


    /**
     * Sets the frequencyCaps value for this ProposalLineItem.
     * 
     * @param frequencyCaps   * The set of frequency capping units for this {@code ProposalLineItem}.
     * This
     *                 attribute is optional during creation and defaults
     * to the
     *                 {@link Product#frequencyCaps product's frequency caps}
     * if
     *                 {@link Product#allowFrequencyCapsCustomization} is
     * {@code false}.
     */
    public void setFrequencyCaps(com.google.api.ads.admanager.axis.v202202.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.admanager.axis.v202202.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.admanager.axis.v202202.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the dfpLineItemId value for this ProposalLineItem.
     * 
     * @return dfpLineItemId   * The unique ID of corresponding {@link LineItem}. This will
     * be {@code null} if the {@link
     *                 Proposal} has not been pushed to Ad Manager.
     *                 This attribute is read-only.
     */
    public java.lang.Long getDfpLineItemId() {
        return dfpLineItemId;
    }


    /**
     * Sets the dfpLineItemId value for this ProposalLineItem.
     * 
     * @param dfpLineItemId   * The unique ID of corresponding {@link LineItem}. This will
     * be {@code null} if the {@link
     *                 Proposal} has not been pushed to Ad Manager.
     *                 This attribute is read-only.
     */
    public void setDfpLineItemId(java.lang.Long dfpLineItemId) {
        this.dfpLineItemId = dfpLineItemId;
    }


    /**
     * Gets the lineItemType value for this ProposalLineItem.
     * 
     * @return lineItemType   * The corresponding {@link LineItemType} of the {@code ProposalLineItem}.
     * For a programmatic {@code ProposalLineItem}, the value can only be
     * one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#PREFERRED_DEAL}</li>
     *                 </ul>
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public com.google.api.ads.admanager.axis.v202202.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this ProposalLineItem.
     * 
     * @param lineItemType   * The corresponding {@link LineItemType} of the {@code ProposalLineItem}.
     * For a programmatic {@code ProposalLineItem}, the value can only be
     * one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#PREFERRED_DEAL}</li>
     *                 </ul>
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setLineItemType(com.google.api.ads.admanager.axis.v202202.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the lineItemPriority value for this ProposalLineItem.
     * 
     * @return lineItemPriority   * The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the default priority of the
     *                 {@link #lineItemType}. For forecasting, this attribute
     * is optional and has a default value
     *                 assigned by Google. See {@link LineItem#priority}
     * for more information.
     */
    public java.lang.Integer getLineItemPriority() {
        return lineItemPriority;
    }


    /**
     * Sets the lineItemPriority value for this ProposalLineItem.
     * 
     * @param lineItemPriority   * The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the default priority of the
     *                 {@link #lineItemType}. For forecasting, this attribute
     * is optional and has a default value
     *                 assigned by Google. See {@link LineItem#priority}
     * for more information.
     */
    public void setLineItemPriority(java.lang.Integer lineItemPriority) {
        this.lineItemPriority = lineItemPriority;
    }


    /**
     * Gets the rateType value for this ProposalLineItem.
     * 
     * @return rateType   * The method used for billing the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public com.google.api.ads.admanager.axis.v202202.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ProposalLineItem.
     * 
     * @param rateType   * The method used for billing the {@code ProposalLineItem}.
     *                 This attribute is read-only.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setRateType(com.google.api.ads.admanager.axis.v202202.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the creativePlaceholders value for this ProposalLineItem.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve through
     * the {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the {@link
     *                 Product#creativePlaceholders product's creative placeholders}.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public com.google.api.ads.admanager.axis.v202202.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this ProposalLineItem.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve through
     * the {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the {@link
     *                 Product#creativePlaceholders product's creative placeholders}.
     * <span class="constraint Required">This attribute is required.</span>
     */
    public void setCreativePlaceholders(com.google.api.ads.admanager.axis.v202202.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.admanager.axis.v202202.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.admanager.axis.v202202.CreativePlaceholder _value) {
        this.creativePlaceholders[i] = _value;
    }


    /**
     * Gets the targeting value for this ProposalLineItem.
     * 
     * @return targeting   * Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}.
     */
    public com.google.api.ads.admanager.axis.v202202.Targeting getTargeting() {
        return targeting;
    }


    /**
     * Sets the targeting value for this ProposalLineItem.
     * 
     * @param targeting   * Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}.
     */
    public void setTargeting(com.google.api.ads.admanager.axis.v202202.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the customFieldValues value for this ProposalLineItem.
     * 
     * @return customFieldValues   * The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public com.google.api.ads.admanager.axis.v202202.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this ProposalLineItem.
     * 
     * @param customFieldValues   * The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setCustomFieldValues(com.google.api.ads.admanager.axis.v202202.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.admanager.axis.v202202.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.admanager.axis.v202202.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this ProposalLineItem.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public com.google.api.ads.admanager.axis.v202202.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this ProposalLineItem.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public void setAppliedLabels(com.google.api.ads.admanager.axis.v202202.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202202.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.admanager.axis.v202202.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this ProposalLineItem.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this ProposalLineItem.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.admanager.axis.v202202.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202202.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.admanager.axis.v202202.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the disableSameAdvertiserCompetitiveExclusion value for this ProposalLineItem.
     * 
     * @return disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be blocked from serving
     *                 with line items from the same advertiser. Setting
     * this to {@code true} will allow line items
     *                 from the same advertiser to serve regardless of the
     * other competitive exclusion labels being
     *                 applied.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public java.lang.Boolean getDisableSameAdvertiserCompetitiveExclusion() {
        return disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Sets the disableSameAdvertiserCompetitiveExclusion value for this ProposalLineItem.
     * 
     * @param disableSameAdvertiserCompetitiveExclusion   * If a line item has a series of competitive exclusions on it,
     * it could be blocked from serving
     *                 with line items from the same advertiser. Setting
     * this to {@code true} will allow line items
     *                 from the same advertiser to serve regardless of the
     * other competitive exclusion labels being
     *                 applied.
     *                 
     *                 <p>This attribute is optional and defaults to false.
     */
    public void setDisableSameAdvertiserCompetitiveExclusion(java.lang.Boolean disableSameAdvertiserCompetitiveExclusion) {
        this.disableSameAdvertiserCompetitiveExclusion = disableSameAdvertiserCompetitiveExclusion;
    }


    /**
     * Gets the isSold value for this ProposalLineItem.
     * 
     * @return isSold   * Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute is read-only.
     */
    public java.lang.Boolean getIsSold() {
        return isSold;
    }


    /**
     * Sets the isSold value for this ProposalLineItem.
     * 
     * @param isSold   * Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute is read-only.
     */
    public void setIsSold(java.lang.Boolean isSold) {
        this.isSold = isSold;
    }


    /**
     * Gets the netRate value for this ProposalLineItem.
     * 
     * @return netRate   * The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It doesn't include agency
     *                 commission.
     *                 
     *                 <p>For example, if {@link Proposal#currencyCode} is
     * 'USD', then $123.4567 could be
     *                 represented as 123456700, but further precision is
     * not supported.
     *                 
     *                 <p>When using sales management, at least one of the
     * four fields
     *                 {@link ProposalLineItem#netRate}, {@link ProposalLineItem#grossRate},
     * {@link ProposalLineItem#netCost} and {@link ProposalLineItem#grossCost}
     * is required.
     *                 
     *                 <p>When not using sales management, at least one of
     * the two fields
     *                 {@link ProposalLineItem#netRate} and {@link ProposalLineItem#netCost}
     * is required.
     */
    public com.google.api.ads.admanager.axis.v202202.Money getNetRate() {
        return netRate;
    }


    /**
     * Sets the netRate value for this ProposalLineItem.
     * 
     * @param netRate   * The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It doesn't include agency
     *                 commission.
     *                 
     *                 <p>For example, if {@link Proposal#currencyCode} is
     * 'USD', then $123.4567 could be
     *                 represented as 123456700, but further precision is
     * not supported.
     *                 
     *                 <p>When using sales management, at least one of the
     * four fields
     *                 {@link ProposalLineItem#netRate}, {@link ProposalLineItem#grossRate},
     * {@link ProposalLineItem#netCost} and {@link ProposalLineItem#grossCost}
     * is required.
     *                 
     *                 <p>When not using sales management, at least one of
     * the two fields
     *                 {@link ProposalLineItem#netRate} and {@link ProposalLineItem#netCost}
     * is required.
     */
    public void setNetRate(com.google.api.ads.admanager.axis.v202202.Money netRate) {
        this.netRate = netRate;
    }


    /**
     * Gets the netCost value for this ProposalLineItem.
     * 
     * @return netCost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the {@link
     *                 Money#getAmountInMicros} must be multiples of 10000.
     * It doesn't include agency commission.
     *                 
     *                 <p>For example, if {@link Proposal#currencyCode} is
     * 'USD', then $123.45 could be represented as
     *                 123450000, but further precision is not supported.
     * 
     *                 <p>At least one of the two fields {@link ProposalLineItem#netRate}
     * and {@link
     *                 ProposalLineItem#netCost} is required.
     */
    public com.google.api.ads.admanager.axis.v202202.Money getNetCost() {
        return netCost;
    }


    /**
     * Sets the netCost value for this ProposalLineItem.
     * 
     * @param netCost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the {@link
     *                 Money#getAmountInMicros} must be multiples of 10000.
     * It doesn't include agency commission.
     *                 
     *                 <p>For example, if {@link Proposal#currencyCode} is
     * 'USD', then $123.45 could be represented as
     *                 123450000, but further precision is not supported.
     * 
     *                 <p>At least one of the two fields {@link ProposalLineItem#netRate}
     * and {@link
     *                 ProposalLineItem#netCost} is required.
     */
    public void setNetCost(com.google.api.ads.admanager.axis.v202202.Money netCost) {
        this.netCost = netCost;
    }


    /**
     * Gets the deliveryIndicator value for this ProposalLineItem.
     * 
     * @return deliveryIndicator   * Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This will be {@code null} if the delivery indicator
     * information is not available due to one
     *                 of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to Ad Manager.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }


    /**
     * Sets the deliveryIndicator value for this ProposalLineItem.
     * 
     * @param deliveryIndicator   * Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This will be {@code null} if the delivery indicator
     * information is not available due to one
     *                 of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to Ad Manager.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     *                 This attribute is read-only.
     */
    public void setDeliveryIndicator(com.google.api.ads.admanager.axis.v202202.DeliveryIndicator deliveryIndicator) {
        this.deliveryIndicator = deliveryIndicator;
    }


    /**
     * Gets the deliveryData value for this ProposalLineItem.
     * 
     * @return deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This will be {@code null} if the
     *                 delivery data cannot be computed due to one of the
     * following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to Ad Manager.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.DeliveryData getDeliveryData() {
        return deliveryData;
    }


    /**
     * Sets the deliveryData value for this ProposalLineItem.
     * 
     * @param deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This will be {@code null} if the
     *                 delivery data cannot be computed due to one of the
     * following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to Ad Manager.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     *                 This attribute is read-only.
     */
    public void setDeliveryData(com.google.api.ads.admanager.axis.v202202.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the computedStatus value for this ProposalLineItem.
     * 
     * @return computedStatus   * The status of the {@link LineItem} generated from this proposal
     * line item.
     *                 This will be {@code null} if the proposal line item
     * has not pushed to Ad Manager.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.ComputedStatus getComputedStatus() {
        return computedStatus;
    }


    /**
     * Sets the computedStatus value for this ProposalLineItem.
     * 
     * @param computedStatus   * The status of the {@link LineItem} generated from this proposal
     * line item.
     *                 This will be {@code null} if the proposal line item
     * has not pushed to Ad Manager.
     *                 This attribute is read-only.
     */
    public void setComputedStatus(com.google.api.ads.admanager.axis.v202202.ComputedStatus computedStatus) {
        this.computedStatus = computedStatus;
    }


    /**
     * Gets the lastModifiedDateTime value for this ProposalLineItem.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 <p>This attribute is assigned by Google when a {@code
     * ProposalLineItem} is updated.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this ProposalLineItem.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 <p>This attribute is assigned by Google when a {@code
     * ProposalLineItem} is updated.
     *                 This attribute is read-only.
     */
    public void setLastModifiedDateTime(com.google.api.ads.admanager.axis.v202202.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the reservationStatus value for this ProposalLineItem.
     * 
     * @return reservationStatus   * The reservation status of the {@link ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.ReservationStatus getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this ProposalLineItem.
     * 
     * @param reservationStatus   * The reservation status of the {@link ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public void setReservationStatus(com.google.api.ads.admanager.axis.v202202.ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


    /**
     * Gets the lastReservationDateTime value for this ProposalLineItem.
     * 
     * @return lastReservationDateTime   * The last {@link DateTime} when the {@link ProposalLineItem}
     * reserved inventory.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.DateTime getLastReservationDateTime() {
        return lastReservationDateTime;
    }


    /**
     * Sets the lastReservationDateTime value for this ProposalLineItem.
     * 
     * @param lastReservationDateTime   * The last {@link DateTime} when the {@link ProposalLineItem}
     * reserved inventory.
     *                 This attribute is read-only.
     */
    public void setLastReservationDateTime(com.google.api.ads.admanager.axis.v202202.DateTime lastReservationDateTime) {
        this.lastReservationDateTime = lastReservationDateTime;
    }


    /**
     * Gets the environmentType value for this ProposalLineItem.
     * 
     * @return environmentType   * The environment that the {@code ProposalLineItem} is targeting.
     * The default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is {@link EnvironmentType#VIDEO_PLAYER},
     *                 then this {@code ProposalLineItem} can only target
     * {@link AdUnit ad units} that have
     *                 {@link AdUnitSize sizes} whose {@link AdUnitSize#environmentType}
     * is also
     *                 {@link EnvironmentType#VIDEO_PLAYER}.
     *                 
     *                 <p>This field is read-only and set to {@link Product#environmentType}
     * of the product
     *                 this proposal line item was created from.
     */
    public com.google.api.ads.admanager.axis.v202202.EnvironmentType getEnvironmentType() {
        return environmentType;
    }


    /**
     * Sets the environmentType value for this ProposalLineItem.
     * 
     * @param environmentType   * The environment that the {@code ProposalLineItem} is targeting.
     * The default value
     *                 is {@link EnvironmentType#BROWSER}. If this value
     * is {@link EnvironmentType#VIDEO_PLAYER},
     *                 then this {@code ProposalLineItem} can only target
     * {@link AdUnit ad units} that have
     *                 {@link AdUnitSize sizes} whose {@link AdUnitSize#environmentType}
     * is also
     *                 {@link EnvironmentType#VIDEO_PLAYER}.
     *                 
     *                 <p>This field is read-only and set to {@link Product#environmentType}
     * of the product
     *                 this proposal line item was created from.
     */
    public void setEnvironmentType(com.google.api.ads.admanager.axis.v202202.EnvironmentType environmentType) {
        this.environmentType = environmentType;
    }


    /**
     * Gets the allowedFormats value for this ProposalLineItem.
     * 
     * @return allowedFormats   * The set of {@link AllowedFormats} that this proposal line item
     * can have. If the set is empty,
     *                 this proposal line item allows all formats.
     */
    public com.google.api.ads.admanager.axis.v202202.AllowedFormats[] getAllowedFormats() {
        return allowedFormats;
    }


    /**
     * Sets the allowedFormats value for this ProposalLineItem.
     * 
     * @param allowedFormats   * The set of {@link AllowedFormats} that this proposal line item
     * can have. If the set is empty,
     *                 this proposal line item allows all formats.
     */
    public void setAllowedFormats(com.google.api.ads.admanager.axis.v202202.AllowedFormats[] allowedFormats) {
        this.allowedFormats = allowedFormats;
    }

    public com.google.api.ads.admanager.axis.v202202.AllowedFormats getAllowedFormats(int i) {
        return this.allowedFormats[i];
    }

    public void setAllowedFormats(int i, com.google.api.ads.admanager.axis.v202202.AllowedFormats _value) {
        this.allowedFormats[i] = _value;
    }


    /**
     * Gets the isProgrammatic value for this ProposalLineItem.
     * 
     * @return isProgrammatic   * Whether or not the {@link Proposal} for this {@code ProposalLineItem}
     * is a programmatic deal.
     *                 This attribute is populated from {@link Proposal#isProgrammatic}.
     * This attribute is read-only.
     */
    public java.lang.Boolean getIsProgrammatic() {
        return isProgrammatic;
    }


    /**
     * Sets the isProgrammatic value for this ProposalLineItem.
     * 
     * @param isProgrammatic   * Whether or not the {@link Proposal} for this {@code ProposalLineItem}
     * is a programmatic deal.
     *                 This attribute is populated from {@link Proposal#isProgrammatic}.
     * This attribute is read-only.
     */
    public void setIsProgrammatic(java.lang.Boolean isProgrammatic) {
        this.isProgrammatic = isProgrammatic;
    }


    /**
     * Gets the marketplaceInfo value for this ProposalLineItem.
     * 
     * @return marketplaceInfo   * The marketplace info if this proposal line item is programmatic,
     * null otherwise.
     */
    public com.google.api.ads.admanager.axis.v202202.ProposalLineItemMarketplaceInfo getMarketplaceInfo() {
        return marketplaceInfo;
    }


    /**
     * Sets the marketplaceInfo value for this ProposalLineItem.
     * 
     * @param marketplaceInfo   * The marketplace info if this proposal line item is programmatic,
     * null otherwise.
     */
    public void setMarketplaceInfo(com.google.api.ads.admanager.axis.v202202.ProposalLineItemMarketplaceInfo marketplaceInfo) {
        this.marketplaceInfo = marketplaceInfo;
    }


    /**
     * Gets the additionalTerms value for this ProposalLineItem.
     * 
     * @return additionalTerms   * Additional terms shown to the buyer in Marketplace.
     */
    public java.lang.String getAdditionalTerms() {
        return additionalTerms;
    }


    /**
     * Sets the additionalTerms value for this ProposalLineItem.
     * 
     * @param additionalTerms   * Additional terms shown to the buyer in Marketplace.
     */
    public void setAdditionalTerms(java.lang.String additionalTerms) {
        this.additionalTerms = additionalTerms;
    }


    /**
     * Gets the programmaticCreativeSource value for this ProposalLineItem.
     * 
     * @return programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     */
    public com.google.api.ads.admanager.axis.v202202.ProgrammaticCreativeSource getProgrammaticCreativeSource() {
        return programmaticCreativeSource;
    }


    /**
     * Sets the programmaticCreativeSource value for this ProposalLineItem.
     * 
     * @param programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     */
    public void setProgrammaticCreativeSource(com.google.api.ads.admanager.axis.v202202.ProgrammaticCreativeSource programmaticCreativeSource) {
        this.programmaticCreativeSource = programmaticCreativeSource;
    }


    /**
     * Gets the grpSettings value for this ProposalLineItem.
     * 
     * @return grpSettings   * Contains the information for a proposal line item which has
     * a target GRP demographic.
     */
    public com.google.api.ads.admanager.axis.v202202.GrpSettings getGrpSettings() {
        return grpSettings;
    }


    /**
     * Sets the grpSettings value for this ProposalLineItem.
     * 
     * @param grpSettings   * Contains the information for a proposal line item which has
     * a target GRP demographic.
     */
    public void setGrpSettings(com.google.api.ads.admanager.axis.v202202.GrpSettings grpSettings) {
        this.grpSettings = grpSettings;
    }


    /**
     * Gets the estimatedMinimumImpressions value for this ProposalLineItem.
     * 
     * @return estimatedMinimumImpressions   * The estimated minimum impressions that should be delivered
     * for a proposal line item.
     */
    public java.lang.Long getEstimatedMinimumImpressions() {
        return estimatedMinimumImpressions;
    }


    /**
     * Sets the estimatedMinimumImpressions value for this ProposalLineItem.
     * 
     * @param estimatedMinimumImpressions   * The estimated minimum impressions that should be delivered
     * for a proposal line item.
     */
    public void setEstimatedMinimumImpressions(java.lang.Long estimatedMinimumImpressions) {
        this.estimatedMinimumImpressions = estimatedMinimumImpressions;
    }


    /**
     * Gets the thirdPartyMeasurementSettings value for this ProposalLineItem.
     * 
     * @return thirdPartyMeasurementSettings   * Contains third party measurement settings for cross-sell Partners
     */
    public com.google.api.ads.admanager.axis.v202202.ThirdPartyMeasurementSettings getThirdPartyMeasurementSettings() {
        return thirdPartyMeasurementSettings;
    }


    /**
     * Sets the thirdPartyMeasurementSettings value for this ProposalLineItem.
     * 
     * @param thirdPartyMeasurementSettings   * Contains third party measurement settings for cross-sell Partners
     */
    public void setThirdPartyMeasurementSettings(com.google.api.ads.admanager.axis.v202202.ThirdPartyMeasurementSettings thirdPartyMeasurementSettings) {
        this.thirdPartyMeasurementSettings = thirdPartyMeasurementSettings;
    }


    /**
     * Gets the makegoodInfo value for this ProposalLineItem.
     * 
     * @return makegoodInfo   * Makegood info for this proposal line item. Immutable once created.
     * 
     *                 <p>Null if this proposal line item is not a makegood.
     */
    public com.google.api.ads.admanager.axis.v202202.ProposalLineItemMakegoodInfo getMakegoodInfo() {
        return makegoodInfo;
    }


    /**
     * Sets the makegoodInfo value for this ProposalLineItem.
     * 
     * @param makegoodInfo   * Makegood info for this proposal line item. Immutable once created.
     * 
     *                 <p>Null if this proposal line item is not a makegood.
     */
    public void setMakegoodInfo(com.google.api.ads.admanager.axis.v202202.ProposalLineItemMakegoodInfo makegoodInfo) {
        this.makegoodInfo = makegoodInfo;
    }


    /**
     * Gets the hasMakegood value for this ProposalLineItem.
     * 
     * @return hasMakegood   * Whether this proposal line item has an associated makegood.
     * This attribute is read-only.
     */
    public java.lang.Boolean getHasMakegood() {
        return hasMakegood;
    }


    /**
     * Sets the hasMakegood value for this ProposalLineItem.
     * 
     * @param hasMakegood   * Whether this proposal line item has an associated makegood.
     * This attribute is read-only.
     */
    public void setHasMakegood(java.lang.Boolean hasMakegood) {
        this.hasMakegood = hasMakegood;
    }


    /**
     * Gets the canCreateMakegood value for this ProposalLineItem.
     * 
     * @return canCreateMakegood   * Whether a new makegood associated with this line item can be
     * created.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getCanCreateMakegood() {
        return canCreateMakegood;
    }


    /**
     * Sets the canCreateMakegood value for this ProposalLineItem.
     * 
     * @param canCreateMakegood   * Whether a new makegood associated with this line item can be
     * created.
     *                 This attribute is read-only.
     */
    public void setCanCreateMakegood(java.lang.Boolean canCreateMakegood) {
        this.canCreateMakegood = canCreateMakegood;
    }


    /**
     * Gets the pauseRole value for this ProposalLineItem.
     * 
     * @return pauseRole   * The {@link NegotiationRole} that paused the proposal line item,
     * i.e. {@link
     *                 NegotiationRole#seller} or {@link NegotiationRole#buyer},
     * or {@code null} when the proposal is
     *                 not paused.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202202.NegotiationRole getPauseRole() {
        return pauseRole;
    }


    /**
     * Sets the pauseRole value for this ProposalLineItem.
     * 
     * @param pauseRole   * The {@link NegotiationRole} that paused the proposal line item,
     * i.e. {@link
     *                 NegotiationRole#seller} or {@link NegotiationRole#buyer},
     * or {@code null} when the proposal is
     *                 not paused.
     *                 This attribute is read-only.
     */
    public void setPauseRole(com.google.api.ads.admanager.axis.v202202.NegotiationRole pauseRole) {
        this.pauseRole = pauseRole;
    }


    /**
     * Gets the pauseReason value for this ProposalLineItem.
     * 
     * @return pauseReason   * The reason for pausing the {@link ProposalLineItem}, provided
     * by the {@link pauseRole}. It is
     *                 {@code null} when the {@link ProposalLineItem} is
     * not paused.
     *                 This attribute is read-only.
     */
    public java.lang.String getPauseReason() {
        return pauseReason;
    }


    /**
     * Sets the pauseReason value for this ProposalLineItem.
     * 
     * @param pauseReason   * The reason for pausing the {@link ProposalLineItem}, provided
     * by the {@link pauseRole}. It is
     *                 {@code null} when the {@link ProposalLineItem} is
     * not paused.
     *                 This attribute is read-only.
     */
    public void setPauseReason(java.lang.String pauseReason) {
        this.pauseReason = pauseReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProposalLineItem)) return false;
        ProposalLineItem other = (ProposalLineItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId()))) &&
            ((this.internalNotes==null && other.getInternalNotes()==null) || 
             (this.internalNotes!=null &&
              this.internalNotes.equals(other.getInternalNotes()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.goal==null && other.getGoal()==null) || 
             (this.goal!=null &&
              this.goal.equals(other.getGoal()))) &&
            ((this.contractedUnitsBought==null && other.getContractedUnitsBought()==null) || 
             (this.contractedUnitsBought!=null &&
              this.contractedUnitsBought.equals(other.getContractedUnitsBought()))) &&
            ((this.deliveryRateType==null && other.getDeliveryRateType()==null) || 
             (this.deliveryRateType!=null &&
              this.deliveryRateType.equals(other.getDeliveryRateType()))) &&
            ((this.roadblockingType==null && other.getRoadblockingType()==null) || 
             (this.roadblockingType!=null &&
              this.roadblockingType.equals(other.getRoadblockingType()))) &&
            ((this.companionDeliveryOption==null && other.getCompanionDeliveryOption()==null) || 
             (this.companionDeliveryOption!=null &&
              this.companionDeliveryOption.equals(other.getCompanionDeliveryOption()))) &&
            ((this.videoMaxDuration==null && other.getVideoMaxDuration()==null) || 
             (this.videoMaxDuration!=null &&
              this.videoMaxDuration.equals(other.getVideoMaxDuration()))) &&
            ((this.videoCreativeSkippableAdType==null && other.getVideoCreativeSkippableAdType()==null) || 
             (this.videoCreativeSkippableAdType!=null &&
              this.videoCreativeSkippableAdType.equals(other.getVideoCreativeSkippableAdType()))) &&
            ((this.frequencyCaps==null && other.getFrequencyCaps()==null) || 
             (this.frequencyCaps!=null &&
              java.util.Arrays.equals(this.frequencyCaps, other.getFrequencyCaps()))) &&
            ((this.dfpLineItemId==null && other.getDfpLineItemId()==null) || 
             (this.dfpLineItemId!=null &&
              this.dfpLineItemId.equals(other.getDfpLineItemId()))) &&
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.lineItemPriority==null && other.getLineItemPriority()==null) || 
             (this.lineItemPriority!=null &&
              this.lineItemPriority.equals(other.getLineItemPriority()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.creativePlaceholders==null && other.getCreativePlaceholders()==null) || 
             (this.creativePlaceholders!=null &&
              java.util.Arrays.equals(this.creativePlaceholders, other.getCreativePlaceholders()))) &&
            ((this.targeting==null && other.getTargeting()==null) || 
             (this.targeting!=null &&
              this.targeting.equals(other.getTargeting()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.disableSameAdvertiserCompetitiveExclusion==null && other.getDisableSameAdvertiserCompetitiveExclusion()==null) || 
             (this.disableSameAdvertiserCompetitiveExclusion!=null &&
              this.disableSameAdvertiserCompetitiveExclusion.equals(other.getDisableSameAdvertiserCompetitiveExclusion()))) &&
            ((this.isSold==null && other.getIsSold()==null) || 
             (this.isSold!=null &&
              this.isSold.equals(other.getIsSold()))) &&
            ((this.netRate==null && other.getNetRate()==null) || 
             (this.netRate!=null &&
              this.netRate.equals(other.getNetRate()))) &&
            ((this.netCost==null && other.getNetCost()==null) || 
             (this.netCost!=null &&
              this.netCost.equals(other.getNetCost()))) &&
            ((this.deliveryIndicator==null && other.getDeliveryIndicator()==null) || 
             (this.deliveryIndicator!=null &&
              this.deliveryIndicator.equals(other.getDeliveryIndicator()))) &&
            ((this.deliveryData==null && other.getDeliveryData()==null) || 
             (this.deliveryData!=null &&
              this.deliveryData.equals(other.getDeliveryData()))) &&
            ((this.computedStatus==null && other.getComputedStatus()==null) || 
             (this.computedStatus!=null &&
              this.computedStatus.equals(other.getComputedStatus()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.reservationStatus==null && other.getReservationStatus()==null) || 
             (this.reservationStatus!=null &&
              this.reservationStatus.equals(other.getReservationStatus()))) &&
            ((this.lastReservationDateTime==null && other.getLastReservationDateTime()==null) || 
             (this.lastReservationDateTime!=null &&
              this.lastReservationDateTime.equals(other.getLastReservationDateTime()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.allowedFormats==null && other.getAllowedFormats()==null) || 
             (this.allowedFormats!=null &&
              java.util.Arrays.equals(this.allowedFormats, other.getAllowedFormats()))) &&
            ((this.isProgrammatic==null && other.getIsProgrammatic()==null) || 
             (this.isProgrammatic!=null &&
              this.isProgrammatic.equals(other.getIsProgrammatic()))) &&
            ((this.marketplaceInfo==null && other.getMarketplaceInfo()==null) || 
             (this.marketplaceInfo!=null &&
              this.marketplaceInfo.equals(other.getMarketplaceInfo()))) &&
            ((this.additionalTerms==null && other.getAdditionalTerms()==null) || 
             (this.additionalTerms!=null &&
              this.additionalTerms.equals(other.getAdditionalTerms()))) &&
            ((this.programmaticCreativeSource==null && other.getProgrammaticCreativeSource()==null) || 
             (this.programmaticCreativeSource!=null &&
              this.programmaticCreativeSource.equals(other.getProgrammaticCreativeSource()))) &&
            ((this.grpSettings==null && other.getGrpSettings()==null) || 
             (this.grpSettings!=null &&
              this.grpSettings.equals(other.getGrpSettings()))) &&
            ((this.estimatedMinimumImpressions==null && other.getEstimatedMinimumImpressions()==null) || 
             (this.estimatedMinimumImpressions!=null &&
              this.estimatedMinimumImpressions.equals(other.getEstimatedMinimumImpressions()))) &&
            ((this.thirdPartyMeasurementSettings==null && other.getThirdPartyMeasurementSettings()==null) || 
             (this.thirdPartyMeasurementSettings!=null &&
              this.thirdPartyMeasurementSettings.equals(other.getThirdPartyMeasurementSettings()))) &&
            ((this.makegoodInfo==null && other.getMakegoodInfo()==null) || 
             (this.makegoodInfo!=null &&
              this.makegoodInfo.equals(other.getMakegoodInfo()))) &&
            ((this.hasMakegood==null && other.getHasMakegood()==null) || 
             (this.hasMakegood!=null &&
              this.hasMakegood.equals(other.getHasMakegood()))) &&
            ((this.canCreateMakegood==null && other.getCanCreateMakegood()==null) || 
             (this.canCreateMakegood!=null &&
              this.canCreateMakegood.equals(other.getCanCreateMakegood()))) &&
            ((this.pauseRole==null && other.getPauseRole()==null) || 
             (this.pauseRole!=null &&
              this.pauseRole.equals(other.getPauseRole()))) &&
            ((this.pauseReason==null && other.getPauseReason()==null) || 
             (this.pauseReason!=null &&
              this.pauseReason.equals(other.getPauseReason())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        if (getInternalNotes() != null) {
            _hashCode += getInternalNotes().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getGoal() != null) {
            _hashCode += getGoal().hashCode();
        }
        if (getContractedUnitsBought() != null) {
            _hashCode += getContractedUnitsBought().hashCode();
        }
        if (getDeliveryRateType() != null) {
            _hashCode += getDeliveryRateType().hashCode();
        }
        if (getRoadblockingType() != null) {
            _hashCode += getRoadblockingType().hashCode();
        }
        if (getCompanionDeliveryOption() != null) {
            _hashCode += getCompanionDeliveryOption().hashCode();
        }
        if (getVideoMaxDuration() != null) {
            _hashCode += getVideoMaxDuration().hashCode();
        }
        if (getVideoCreativeSkippableAdType() != null) {
            _hashCode += getVideoCreativeSkippableAdType().hashCode();
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
        if (getDfpLineItemId() != null) {
            _hashCode += getDfpLineItemId().hashCode();
        }
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getLineItemPriority() != null) {
            _hashCode += getLineItemPriority().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
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
        if (getTargeting() != null) {
            _hashCode += getTargeting().hashCode();
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
        if (getIsSold() != null) {
            _hashCode += getIsSold().hashCode();
        }
        if (getNetRate() != null) {
            _hashCode += getNetRate().hashCode();
        }
        if (getNetCost() != null) {
            _hashCode += getNetCost().hashCode();
        }
        if (getDeliveryIndicator() != null) {
            _hashCode += getDeliveryIndicator().hashCode();
        }
        if (getDeliveryData() != null) {
            _hashCode += getDeliveryData().hashCode();
        }
        if (getComputedStatus() != null) {
            _hashCode += getComputedStatus().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getReservationStatus() != null) {
            _hashCode += getReservationStatus().hashCode();
        }
        if (getLastReservationDateTime() != null) {
            _hashCode += getLastReservationDateTime().hashCode();
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
        if (getIsProgrammatic() != null) {
            _hashCode += getIsProgrammatic().hashCode();
        }
        if (getMarketplaceInfo() != null) {
            _hashCode += getMarketplaceInfo().hashCode();
        }
        if (getAdditionalTerms() != null) {
            _hashCode += getAdditionalTerms().hashCode();
        }
        if (getProgrammaticCreativeSource() != null) {
            _hashCode += getProgrammaticCreativeSource().hashCode();
        }
        if (getGrpSettings() != null) {
            _hashCode += getGrpSettings().hashCode();
        }
        if (getEstimatedMinimumImpressions() != null) {
            _hashCode += getEstimatedMinimumImpressions().hashCode();
        }
        if (getThirdPartyMeasurementSettings() != null) {
            _hashCode += getThirdPartyMeasurementSettings().hashCode();
        }
        if (getMakegoodInfo() != null) {
            _hashCode += getMakegoodInfo().hashCode();
        }
        if (getHasMakegood() != null) {
            _hashCode += getHasMakegood().hashCode();
        }
        if (getCanCreateMakegood() != null) {
            _hashCode += getCanCreateMakegood().hashCode();
        }
        if (getPauseRole() != null) {
            _hashCode += getPauseRole().hashCode();
        }
        if (getPauseReason() != null) {
            _hashCode += getPauseReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ProposalLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "timeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "internalNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "goal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "Goal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedUnitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "contractedUnitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "videoMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("videoCreativeSkippableAdType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "videoCreativeSkippableAdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "SkippableAdType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "dfpLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "lineItemPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "RateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableSameAdvertiserCompetitiveExclusion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "disableSameAdvertiserCompetitiveExclusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "isSold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "netRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netCost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "netCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "computedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "reservationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ReservationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReservationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "lastReservationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedFormats");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "allowedFormats"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "AllowedFormats"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProgrammatic");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "isProgrammatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "marketplaceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ProposalLineItemMarketplaceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "additionalTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programmaticCreativeSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "programmaticCreativeSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ProgrammaticCreativeSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grpSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "grpSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "GrpSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedMinimumImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "estimatedMinimumImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyMeasurementSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "thirdPartyMeasurementSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ThirdPartyMeasurementSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makegoodInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "makegoodInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "ProposalLineItemMakegoodInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMakegood");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "hasMakegood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCreateMakegood");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "canCreateMakegood"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pauseRole");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "pauseRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "NegotiationRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pauseReason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202202", "pauseReason"));
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
