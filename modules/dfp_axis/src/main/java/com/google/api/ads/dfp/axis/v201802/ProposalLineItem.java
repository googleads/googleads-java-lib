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
 * ProposalLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * A {@code ProposalLineItem} is an instance of sales {@link Product}.
 * It belongs to
 *             a {@link Proposal} and is created according to a {@link
 * Product} and
 *             {@link RateCard}. When the proposal is turned into an
 * {@link Order}, this object is
 *             turned into a {@link LineItem}.
 */
public class ProposalLineItem  implements java.io.Serializable {
    /* The unique ID of the {@code ProposalLineItem}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* The unique ID of the {@link Proposal}, to which the {@code
     * ProposalLineItem}
     *                 belongs. This attribute is required for creation and
     * then is readonly.
     *                 This attribute is required. */
    private java.lang.Long proposalId;

    /* The unique ID of the {@link Package}, to which the {@code ProposalLineItem}
     * belongs.
     *                 This attribute is assigned by Google when creating
     * the {@code ProposalLineItem} by performing
     *                 the package action {@link CreateProposalLineItemsFromPackages}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private java.lang.Long packageId;

    /* The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem}
     *                 is priced. The rate card must be associated with a
     * rate belonging to the
     *                 {@link #productId product}. This attribute is required
     * for creation and then is readonly.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint Required">This attribute is required when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span> */
    private java.lang.Long rateCardId;

    /* The unique ID of the {@link Product}, which the {@code ProposalLineItem}
     * is created from. This attribute is readonly after creation.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>not
     * using programmatic, using sales management.</li></ul></span> */
    private java.lang.Long productId;

    /* The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute has a maximum length
     * of 255 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 This attribute is required. */
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
    private com.google.api.ads.dfp.axis.v201802.DateTime startDateTime;

    /* The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is optional
     * during creation,
     *                 but required and must be after the {@link #startDateTime}.
     * The {@link DateTime#timeZoneID} is
     *                 required if end date time is not {@code null}. */
    private com.google.api.ads.dfp.axis.v201802.DateTime endDateTime;

    /* The time zone ID in tz database format (e.g. "America/Los_Angeles")
     * for this {@code
     *                 ProposalLineItem}. The number of serving days is calculated
     * in this time zone. So if {@link
     *                 #rateType} is {@link RateType#CPD}, it will affect
     * the cost calculation. The {@link
     *                 #startDateTime} and {@link #endDateTime} will be returned
     * in this time zone. This attribute is
     *                 optional and defaults to the network's time zone.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private java.lang.String timeZoneId;

    /* Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private java.lang.String internalNotes;

    /* The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.CostAdjustment costAdjustment;

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
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.Goal goal;

    /* A percentage number to a STANDARD line item with CPM or CPC
     * as the rate
     *                 type, so that the scheduled delivery goal could be
     * relaxed.
     *                 This number is milli-percent based, i.e. 10% would
     * be 10000.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private java.lang.Integer contractedQuantityBuffer;

    /* The scheduled number of impressions or clicks of a STANDARD
     * line item with CPM or CPC as the
     *                 rate type, so that the scheduled delivery goal could
     * be relaxed. This attribute is calculated
     *                 from {@link Goal#units} and {@link #contractedQuantityBuffer}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private java.lang.Long scheduledQuantity;

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
     *                 duration. This attribute is optional and default value
     * is
     *                 {@link DeliveryRateType#EVENLY}.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * value can only be
     *                 {@link DeliveryRateType#FRONTLOADED}. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This attribute
     *                 is optional during creation and defaults to the
     *                 {@link Product#roadblockingType product's roadblocking
     * type},
     *                 or {@link RoadblockingType#ONE_OR_MORE} if not specified
     * by the product. */
    private com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType;

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
    private com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code ProposalLineItem}. This
     * attribute is optional and
     *                 default value is {@link CreativeRotationType#OPTIMIZED}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType;

    /* The max duration of a video creative associated with this {@code
     * ProposalLineItem}
     *                 in milliseconds. This attribute is optional, defaults
     * to the {@link Product#videoMaxDuration}
     *                 on the {@link Product} it was created with, and only
     * meaningful if this is a
     *                 video proposal line item. */
    private java.lang.Long videoMaxDuration;

    /* The set of frequency capping units for this {@code ProposalLineItem}.
     * This
     *                 attribute is optional during creation and defaults
     * to the
     *                 {@link Product#frequencyCaps product's frequency caps}
     * if
     *                 {@link Product#allowFrequencyCapsCustomization} is
     * {@code false}. */
    private com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps;

    /* The unique ID of corresponding {@link LineItem}. This will
     * be {@code null} if the {@link
     *                 Proposal} has not been pushed to DFP.
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
     *                 This attribute is required. */
    private com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType;

    /* The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the
     *                 {@link Product#priority product's priority}, or a
     * default value assigned by Google.
     *                 See {@link LineItem#priority} for more information. */
    private java.lang.Integer lineItemPriority;

    /* The method used for billing the {@code ProposalLineItem}.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint Required">This attribute is required when:<ul><li>using
     * programmatic guaranteed, not using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.RateType rateType;

    /* Details about the creatives that are expected to serve through
     * the
     *                 {@code ProposalLineItem}. This attribute is optional
     * during creation and defaults to the
     *                 {@link Product#creativePlaceholders product's creative
     * placeholders}.
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders;

    /* Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}. */
    private com.google.api.ads.dfp.axis.v201802.Targeting targeting;

    /* The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels;

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

    /* All the product constraints set for this {@code ProposalLineItem}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.ProposalLineItemConstraints productConstraints;

    /* The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those triggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.ProposalLineItemPremium[] premiums;

    /* Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute is read-only. */
    private java.lang.Boolean isSold;

    /* The base rate of the {@code ProposalLineItem} in proposal currency.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.Money baseRate;

    /* The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It doesn't include agency
     *                 commission.
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
    private com.google.api.ads.dfp.axis.v201802.Money netRate;

    /* The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It includes agency commission.
     *                 
     *                 <p>At least one of the four fields {@link ProposalLineItem#netRate},
     * {@link ProposalLineItem#grossRate}, {@link ProposalLineItem#netCost}
     * and
     *                 {@link ProposalLineItem#grossCost} is required.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.Money grossRate;

    /* The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 10000. It doesn't include agency
     *                 commission.
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
    private com.google.api.ads.dfp.axis.v201802.Money netCost;

    /* The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 10000. It includes agency commission.
     *                 
     *                 <p>At least one of the four fields {@link ProposalLineItem#netRate},
     * {@link ProposalLineItem#grossRate}, {@link ProposalLineItem#netCost}
     * and
     *                 {@link ProposalLineItem#grossCost} is required.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.Money grossCost;

    /* Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This will be {@code null} if the delivery indicator
     * information is not available due to one
     *                 of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This will be {@code null} if the
     *                 delivery data cannot be computed due to one of the
     * following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DeliveryData deliveryData;

    /* The status of the {@link LineItem} generated from this proposal
     * line item.
     *                 This will be {@code null} if the proposal line item
     * has not pushed to DFP.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.ComputedStatus computedStatus;

    /* Overrides the billing cap of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.BillingCap billingCap;

    /* Overrides the billing schedule of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.BillingSchedule billingSchedule;

    /* Overrides the billing source of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields ({@link #billingCap},
     *                 {@link #billingSchedule}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on this field. That is, none of the billing
     * fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.BillingSource billingSource;

    /* Overrides the billing base of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 <p>If this field is overridden, then other required
     * billing fields ({@link #billingCap}, {@link
     *                 #billingSchedule}, or {@link #billingSource}) also
     * need to be overridden depending on the
     *                 {@link #billingSource}. That is, none of the billing
     * fields will inherit from their {@link
     *                 Proposal} object anymore. This attribute can be configured
     * as editable after the proposal has
     *                 been submitted. Please check with your network administrator
     * for editable fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.BillingBase billingBase;

    /* The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 <p>This attribute is assigned by Google when a {@code
     * ProposalLineItem} is updated.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime;

    /* The reservation status of the {@link ProposalLineItem}.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.ReservationStatus reservationStatus;

    /* The last {@link DateTime} when the {@link ProposalLineItem}
     * reserved inventory.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201802.DateTime lastReservationDateTime;

    /* Whether to use the corresponding proposal's third party ad
     * server. If this field is true,
     *                 {@code thirdPartyAdServerId} and {@code customThirdPartyAdServerName}
     * will be ignored.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span> */
    private java.lang.Boolean useThirdPartyAdServerFromProposal;

    /* A predefined third party ad server, which will be used to fill
     * in reconciliation. All
     *                 predefined third party ad servers can be found in
     * the {@code Third_Party_Company} PQL table. If
     *                 actual third party ad server is not in the predefined
     * list, this field is set to 0, and actual
     *                 third party ad server name is set in {@code customThirdPartyAdServerName}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span> */
    private java.lang.Integer thirdPartyAdServerId;

    /* When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here. When {@code
     *                 thirdPartyAdServerId} is not 0, this field is ignored.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span> */
    private java.lang.String customThirdPartyAdServerName;

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
     *                 <p>This field can only be changed if the {@link #linkStatus}
     * is {@link LinkStatus#UNLINKED}.
     *                 Otherwise its value is read-only and set to {@link
     * Product#environmentType} of the product
     *                 this proposal line item was created from. */
    private com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType;

    /* Whether or not the {@link Proposal} for this {@code ProposalLineItem}
     * is a programmatic deal.
     *                 This attribute is populated from {@link Proposal#isProgrammatic}.
     * This attribute is read-only. */
    private java.lang.Boolean isProgrammatic;

    /* The status of the link between this {@code ProposalLineItem}
     * and its {link Product}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint ReadOnly">This attribute is read-only when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.LinkStatus linkStatus;

    /* The marketplace info if this proposal line item is programmatic,
     * null otherwise.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>using
     * programmatic guaranteed, not using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.ProposalLineItemMarketplaceInfo marketplaceInfo;

    /* {@link RateCard} pricing model for the {@link ProposalLineItem}.
     * When the pricing model is
     *                 {@link PricingModel#NET} refer to the {@link netCost}
     * and {@link netRate} fields. When the
     *                 pricing model is {@link PricingModel#GROSS} refer
     * to the {@link grossCost} and
     *                 {@link grossRate} fields.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint ReadOnly">This attribute is read-only when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.PricingModel rateCardPricingModel;

    /* Additional terms shown to the buyer in Marketplace.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private java.lang.String additionalTerms;

    /* Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span> */
    private com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource programmaticCreativeSource;

    /* The estimated minimum impressions that should be delivered
     * for a proposal line item.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using preferred deals, not using sales
     * management.</li></ul></span> */
    private java.lang.Long estimatedMinimumImpressions;

    public ProposalLineItem() {
    }

    public ProposalLineItem(
           java.lang.Long id,
           java.lang.Long proposalId,
           java.lang.Long packageId,
           java.lang.Long rateCardId,
           java.lang.Long productId,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201802.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201802.DateTime endDateTime,
           java.lang.String timeZoneId,
           java.lang.String internalNotes,
           com.google.api.ads.dfp.axis.v201802.CostAdjustment costAdjustment,
           java.lang.Boolean isArchived,
           com.google.api.ads.dfp.axis.v201802.Goal goal,
           java.lang.Integer contractedQuantityBuffer,
           java.lang.Long scheduledQuantity,
           java.lang.Long contractedUnitsBought,
           com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType,
           java.lang.Long videoMaxDuration,
           com.google.api.ads.dfp.axis.v201802.FrequencyCap[] frequencyCaps,
           java.lang.Long dfpLineItemId,
           com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType,
           java.lang.Integer lineItemPriority,
           com.google.api.ads.dfp.axis.v201802.RateType rateType,
           com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201802.Targeting targeting,
           com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201802.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Boolean disableSameAdvertiserCompetitiveExclusion,
           com.google.api.ads.dfp.axis.v201802.ProposalLineItemConstraints productConstraints,
           com.google.api.ads.dfp.axis.v201802.ProposalLineItemPremium[] premiums,
           java.lang.Boolean isSold,
           com.google.api.ads.dfp.axis.v201802.Money baseRate,
           com.google.api.ads.dfp.axis.v201802.Money netRate,
           com.google.api.ads.dfp.axis.v201802.Money grossRate,
           com.google.api.ads.dfp.axis.v201802.Money netCost,
           com.google.api.ads.dfp.axis.v201802.Money grossCost,
           com.google.api.ads.dfp.axis.v201802.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.axis.v201802.DeliveryData deliveryData,
           com.google.api.ads.dfp.axis.v201802.ComputedStatus computedStatus,
           com.google.api.ads.dfp.axis.v201802.BillingCap billingCap,
           com.google.api.ads.dfp.axis.v201802.BillingSchedule billingSchedule,
           com.google.api.ads.dfp.axis.v201802.BillingSource billingSource,
           com.google.api.ads.dfp.axis.v201802.BillingBase billingBase,
           com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201802.ReservationStatus reservationStatus,
           com.google.api.ads.dfp.axis.v201802.DateTime lastReservationDateTime,
           java.lang.Boolean useThirdPartyAdServerFromProposal,
           java.lang.Integer thirdPartyAdServerId,
           java.lang.String customThirdPartyAdServerName,
           com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType,
           java.lang.Boolean isProgrammatic,
           com.google.api.ads.dfp.axis.v201802.LinkStatus linkStatus,
           com.google.api.ads.dfp.axis.v201802.ProposalLineItemMarketplaceInfo marketplaceInfo,
           com.google.api.ads.dfp.axis.v201802.PricingModel rateCardPricingModel,
           java.lang.String additionalTerms,
           com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource programmaticCreativeSource,
           java.lang.Long estimatedMinimumImpressions) {
           this.id = id;
           this.proposalId = proposalId;
           this.packageId = packageId;
           this.rateCardId = rateCardId;
           this.productId = productId;
           this.name = name;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.timeZoneId = timeZoneId;
           this.internalNotes = internalNotes;
           this.costAdjustment = costAdjustment;
           this.isArchived = isArchived;
           this.goal = goal;
           this.contractedQuantityBuffer = contractedQuantityBuffer;
           this.scheduledQuantity = scheduledQuantity;
           this.contractedUnitsBought = contractedUnitsBought;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.companionDeliveryOption = companionDeliveryOption;
           this.creativeRotationType = creativeRotationType;
           this.videoMaxDuration = videoMaxDuration;
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
           this.productConstraints = productConstraints;
           this.premiums = premiums;
           this.isSold = isSold;
           this.baseRate = baseRate;
           this.netRate = netRate;
           this.grossRate = grossRate;
           this.netCost = netCost;
           this.grossCost = grossCost;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.computedStatus = computedStatus;
           this.billingCap = billingCap;
           this.billingSchedule = billingSchedule;
           this.billingSource = billingSource;
           this.billingBase = billingBase;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.reservationStatus = reservationStatus;
           this.lastReservationDateTime = lastReservationDateTime;
           this.useThirdPartyAdServerFromProposal = useThirdPartyAdServerFromProposal;
           this.thirdPartyAdServerId = thirdPartyAdServerId;
           this.customThirdPartyAdServerName = customThirdPartyAdServerName;
           this.environmentType = environmentType;
           this.isProgrammatic = isProgrammatic;
           this.linkStatus = linkStatus;
           this.marketplaceInfo = marketplaceInfo;
           this.rateCardPricingModel = rateCardPricingModel;
           this.additionalTerms = additionalTerms;
           this.programmaticCreativeSource = programmaticCreativeSource;
           this.estimatedMinimumImpressions = estimatedMinimumImpressions;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("additionalTerms", getAdditionalTerms())
            .add("appliedLabels", getAppliedLabels())
            .add("baseRate", getBaseRate())
            .add("billingBase", getBillingBase())
            .add("billingCap", getBillingCap())
            .add("billingSchedule", getBillingSchedule())
            .add("billingSource", getBillingSource())
            .add("companionDeliveryOption", getCompanionDeliveryOption())
            .add("computedStatus", getComputedStatus())
            .add("contractedQuantityBuffer", getContractedQuantityBuffer())
            .add("contractedUnitsBought", getContractedUnitsBought())
            .add("costAdjustment", getCostAdjustment())
            .add("creativePlaceholders", getCreativePlaceholders())
            .add("creativeRotationType", getCreativeRotationType())
            .add("customFieldValues", getCustomFieldValues())
            .add("customThirdPartyAdServerName", getCustomThirdPartyAdServerName())
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
            .add("grossCost", getGrossCost())
            .add("grossRate", getGrossRate())
            .add("id", getId())
            .add("internalNotes", getInternalNotes())
            .add("isArchived", getIsArchived())
            .add("isProgrammatic", getIsProgrammatic())
            .add("isSold", getIsSold())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("lastReservationDateTime", getLastReservationDateTime())
            .add("lineItemPriority", getLineItemPriority())
            .add("lineItemType", getLineItemType())
            .add("linkStatus", getLinkStatus())
            .add("marketplaceInfo", getMarketplaceInfo())
            .add("name", getName())
            .add("netCost", getNetCost())
            .add("netRate", getNetRate())
            .add("packageId", getPackageId())
            .add("premiums", getPremiums())
            .add("productConstraints", getProductConstraints())
            .add("productId", getProductId())
            .add("programmaticCreativeSource", getProgrammaticCreativeSource())
            .add("proposalId", getProposalId())
            .add("rateCardId", getRateCardId())
            .add("rateCardPricingModel", getRateCardPricingModel())
            .add("rateType", getRateType())
            .add("reservationStatus", getReservationStatus())
            .add("roadblockingType", getRoadblockingType())
            .add("scheduledQuantity", getScheduledQuantity())
            .add("startDateTime", getStartDateTime())
            // Exclude targeting to avoid overly verbose output
            .add("thirdPartyAdServerId", getThirdPartyAdServerId())
            .add("timeZoneId", getTimeZoneId())
            .add("useThirdPartyAdServerFromProposal", getUseThirdPartyAdServerFromProposal())
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
     *                 This attribute is required.
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
     *                 This attribute is required.
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the packageId value for this ProposalLineItem.
     * 
     * @return packageId   * The unique ID of the {@link Package}, to which the {@code ProposalLineItem}
     * belongs.
     *                 This attribute is assigned by Google when creating
     * the {@code ProposalLineItem} by performing
     *                 the package action {@link CreateProposalLineItemsFromPackages}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Long getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this ProposalLineItem.
     * 
     * @param packageId   * The unique ID of the {@link Package}, to which the {@code ProposalLineItem}
     * belongs.
     *                 This attribute is assigned by Google when creating
     * the {@code ProposalLineItem} by performing
     *                 the package action {@link CreateProposalLineItemsFromPackages}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setPackageId(java.lang.Long packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the rateCardId value for this ProposalLineItem.
     * 
     * @return rateCardId   * The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem}
     *                 is priced. The rate card must be associated with a
     * rate belonging to the
     *                 {@link #productId product}. This attribute is required
     * for creation and then is readonly.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint Required">This attribute is required when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Long getRateCardId() {
        return rateCardId;
    }


    /**
     * Sets the rateCardId value for this ProposalLineItem.
     * 
     * @param rateCardId   * The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem}
     *                 is priced. The rate card must be associated with a
     * rate belonging to the
     *                 {@link #productId product}. This attribute is required
     * for creation and then is readonly.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint Required">This attribute is required when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the productId value for this ProposalLineItem.
     * 
     * @return productId   * The unique ID of the {@link Product}, which the {@code ProposalLineItem}
     * is created from. This attribute is readonly after creation.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProposalLineItem.
     * 
     * @param productId   * The unique ID of the {@link Product}, which the {@code ProposalLineItem}
     * is created from. This attribute is readonly after creation.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
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
     *                 This attribute is required.
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
     *                 This attribute is required.
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
    public com.google.api.ads.dfp.axis.v201802.DateTime getStartDateTime() {
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
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201802.DateTime startDateTime) {
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
    public com.google.api.ads.dfp.axis.v201802.DateTime getEndDateTime() {
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
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201802.DateTime endDateTime) {
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
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
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
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the internalNotes value for this ProposalLineItem.
     * 
     * @return internalNotes   * Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public java.lang.String getInternalNotes() {
        return internalNotes;
    }


    /**
     * Sets the internalNotes value for this ProposalLineItem.
     * 
     * @param internalNotes   * Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setInternalNotes(java.lang.String internalNotes) {
        this.internalNotes = internalNotes;
    }


    /**
     * Gets the costAdjustment value for this ProposalLineItem.
     * 
     * @return costAdjustment   * The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.CostAdjustment getCostAdjustment() {
        return costAdjustment;
    }


    /**
     * Sets the costAdjustment value for this ProposalLineItem.
     * 
     * @param costAdjustment   * The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li></ul></span>
     */
    public void setCostAdjustment(com.google.api.ads.dfp.axis.v201802.CostAdjustment costAdjustment) {
        this.costAdjustment = costAdjustment;
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
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.Goal getGoal() {
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
     *                 This attribute is required.
     */
    public void setGoal(com.google.api.ads.dfp.axis.v201802.Goal goal) {
        this.goal = goal;
    }


    /**
     * Gets the contractedQuantityBuffer value for this ProposalLineItem.
     * 
     * @return contractedQuantityBuffer   * A percentage number to a STANDARD line item with CPM or CPC
     * as the rate
     *                 type, so that the scheduled delivery goal could be
     * relaxed.
     *                 This number is milli-percent based, i.e. 10% would
     * be 10000.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Integer getContractedQuantityBuffer() {
        return contractedQuantityBuffer;
    }


    /**
     * Sets the contractedQuantityBuffer value for this ProposalLineItem.
     * 
     * @param contractedQuantityBuffer   * A percentage number to a STANDARD line item with CPM or CPC
     * as the rate
     *                 type, so that the scheduled delivery goal could be
     * relaxed.
     *                 This number is milli-percent based, i.e. 10% would
     * be 10000.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setContractedQuantityBuffer(java.lang.Integer contractedQuantityBuffer) {
        this.contractedQuantityBuffer = contractedQuantityBuffer;
    }


    /**
     * Gets the scheduledQuantity value for this ProposalLineItem.
     * 
     * @return scheduledQuantity   * The scheduled number of impressions or clicks of a STANDARD
     * line item with CPM or CPC as the
     *                 rate type, so that the scheduled delivery goal could
     * be relaxed. This attribute is calculated
     *                 from {@link Goal#units} and {@link #contractedQuantityBuffer}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Long getScheduledQuantity() {
        return scheduledQuantity;
    }


    /**
     * Sets the scheduledQuantity value for this ProposalLineItem.
     * 
     * @param scheduledQuantity   * The scheduled number of impressions or clicks of a STANDARD
     * line item with CPM or CPC as the
     *                 rate type, so that the scheduled delivery goal could
     * be relaxed. This attribute is calculated
     *                 from {@link Goal#units} and {@link #contractedQuantityBuffer}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setScheduledQuantity(java.lang.Long scheduledQuantity) {
        this.scheduledQuantity = scheduledQuantity;
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
     *                 duration. This attribute is optional and default value
     * is
     *                 {@link DeliveryRateType#EVENLY}.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * value can only be
     *                 {@link DeliveryRateType#FRONTLOADED}.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }


    /**
     * Sets the deliveryRateType value for this ProposalLineItem.
     * 
     * @param deliveryRateType   * The strategy for delivering ads over the course of the {@code
     * ProposalLineItem}'s
     *                 duration. This attribute is optional and default value
     * is
     *                 {@link DeliveryRateType#EVENLY}.
     *                 For a Preferred deal {@code ProposalLineItem}, the
     * value can only be
     *                 {@link DeliveryRateType#FRONTLOADED}.
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201802.DeliveryRateType deliveryRateType) {
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
    public com.google.api.ads.dfp.axis.v201802.RoadblockingType getRoadblockingType() {
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
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201802.RoadblockingType roadblockingType) {
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
    public com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption getCompanionDeliveryOption() {
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
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201802.CompanionDeliveryOption companionDeliveryOption) {
        this.companionDeliveryOption = companionDeliveryOption;
    }


    /**
     * Gets the creativeRotationType value for this ProposalLineItem.
     * 
     * @return creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code ProposalLineItem}. This
     * attribute is optional and
     *                 default value is {@link CreativeRotationType#OPTIMIZED}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }


    /**
     * Sets the creativeRotationType value for this ProposalLineItem.
     * 
     * @param creativeRotationType   * The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code ProposalLineItem}. This
     * attribute is optional and
     *                 default value is {@link CreativeRotationType#OPTIMIZED}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201802.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
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
    public com.google.api.ads.dfp.axis.v201802.FrequencyCap[] getFrequencyCaps() {
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
     * Gets the dfpLineItemId value for this ProposalLineItem.
     * 
     * @return dfpLineItemId   * The unique ID of corresponding {@link LineItem}. This will
     * be {@code null} if the {@link
     *                 Proposal} has not been pushed to DFP.
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
     *                 Proposal} has not been pushed to DFP.
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
     *                 This attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201802.LineItemType getLineItemType() {
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
     *                 This attribute is required.
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201802.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the lineItemPriority value for this ProposalLineItem.
     * 
     * @return lineItemPriority   * The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 This attribute is optional during creation and defaults
     * to the
     *                 {@link Product#priority product's priority}, or a
     * default value assigned by Google.
     *                 See {@link LineItem#priority} for more information.
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
     * to the
     *                 {@link Product#priority product's priority}, or a
     * default value assigned by Google.
     *                 See {@link LineItem#priority} for more information.
     */
    public void setLineItemPriority(java.lang.Integer lineItemPriority) {
        this.lineItemPriority = lineItemPriority;
    }


    /**
     * Gets the rateType value for this ProposalLineItem.
     * 
     * @return rateType   * The method used for billing the {@code ProposalLineItem}.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint Required">This attribute is required when:<ul><li>using
     * programmatic guaranteed, not using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ProposalLineItem.
     * 
     * @param rateType   * The method used for billing the {@code ProposalLineItem}.
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint Required">This attribute is required when:<ul><li>using
     * programmatic guaranteed, not using sales management.</li></ul></span>
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201802.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the creativePlaceholders value for this ProposalLineItem.
     * 
     * @return creativePlaceholders   * Details about the creatives that are expected to serve through
     * the
     *                 {@code ProposalLineItem}. This attribute is optional
     * during creation and defaults to the
     *                 {@link Product#creativePlaceholders product's creative
     * placeholders}.
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.CreativePlaceholder[] getCreativePlaceholders() {
        return creativePlaceholders;
    }


    /**
     * Sets the creativePlaceholders value for this ProposalLineItem.
     * 
     * @param creativePlaceholders   * Details about the creatives that are expected to serve through
     * the
     *                 {@code ProposalLineItem}. This attribute is optional
     * during creation and defaults to the
     *                 {@link Product#creativePlaceholders product's creative
     * placeholders}.
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
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
     * Gets the targeting value for this ProposalLineItem.
     * 
     * @return targeting   * Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}.
     */
    public com.google.api.ads.dfp.axis.v201802.Targeting getTargeting() {
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
    public void setTargeting(com.google.api.ads.dfp.axis.v201802.Targeting targeting) {
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
    public com.google.api.ads.dfp.axis.v201802.BaseCustomFieldValue[] getCustomFieldValues() {
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
     * Gets the appliedLabels value for this ProposalLineItem.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this ProposalLineItem.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
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
     * Gets the effectiveAppliedLabels value for this ProposalLineItem.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.AppliedLabel[] getEffectiveAppliedLabels() {
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
     * Gets the productConstraints value for this ProposalLineItem.
     * 
     * @return productConstraints   * All the product constraints set for this {@code ProposalLineItem}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalLineItemConstraints getProductConstraints() {
        return productConstraints;
    }


    /**
     * Sets the productConstraints value for this ProposalLineItem.
     * 
     * @param productConstraints   * All the product constraints set for this {@code ProposalLineItem}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setProductConstraints(com.google.api.ads.dfp.axis.v201802.ProposalLineItemConstraints productConstraints) {
        this.productConstraints = productConstraints;
    }


    /**
     * Gets the premiums value for this ProposalLineItem.
     * 
     * @return premiums   * The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those triggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalLineItemPremium[] getPremiums() {
        return premiums;
    }


    /**
     * Sets the premiums value for this ProposalLineItem.
     * 
     * @param premiums   * The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those triggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public void setPremiums(com.google.api.ads.dfp.axis.v201802.ProposalLineItemPremium[] premiums) {
        this.premiums = premiums;
    }

    public com.google.api.ads.dfp.axis.v201802.ProposalLineItemPremium getPremiums(int i) {
        return this.premiums[i];
    }

    public void setPremiums(int i, com.google.api.ads.dfp.axis.v201802.ProposalLineItemPremium _value) {
        this.premiums[i] = _value;
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
     * Gets the baseRate value for this ProposalLineItem.
     * 
     * @return baseRate   * The base rate of the {@code ProposalLineItem} in proposal currency.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.Money getBaseRate() {
        return baseRate;
    }


    /**
     * Sets the baseRate value for this ProposalLineItem.
     * 
     * @param baseRate   * The base rate of the {@code ProposalLineItem} in proposal currency.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     *                 <span class="constraint ReadOnly">This attribute is
     * read-only when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setBaseRate(com.google.api.ads.dfp.axis.v201802.Money baseRate) {
        this.baseRate = baseRate;
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
    public com.google.api.ads.dfp.axis.v201802.Money getNetRate() {
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
    public void setNetRate(com.google.api.ads.dfp.axis.v201802.Money netRate) {
        this.netRate = netRate;
    }


    /**
     * Gets the grossRate value for this ProposalLineItem.
     * 
     * @return grossRate   * The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It includes agency commission.
     *                 
     *                 <p>At least one of the four fields {@link ProposalLineItem#netRate},
     * {@link ProposalLineItem#grossRate}, {@link ProposalLineItem#netCost}
     * and
     *                 {@link ProposalLineItem#grossCost} is required.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.Money getGrossRate() {
        return grossRate;
    }


    /**
     * Sets the grossRate value for this ProposalLineItem.
     * 
     * @param grossRate   * The amount of money to spend per impression or click in proposal
     * currency. It supports
     *                 precision of 4 decimal places in terms of the fundamental
     * currency unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 100. It includes agency commission.
     *                 
     *                 <p>At least one of the four fields {@link ProposalLineItem#netRate},
     * {@link ProposalLineItem#grossRate}, {@link ProposalLineItem#netCost}
     * and
     *                 {@link ProposalLineItem#grossCost} is required.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setGrossRate(com.google.api.ads.dfp.axis.v201802.Money grossRate) {
        this.grossRate = grossRate;
    }


    /**
     * Gets the netCost value for this ProposalLineItem.
     * 
     * @return netCost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 10000. It doesn't include agency
     *                 commission.
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
    public com.google.api.ads.dfp.axis.v201802.Money getNetCost() {
        return netCost;
    }


    /**
     * Sets the netCost value for this ProposalLineItem.
     * 
     * @param netCost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 10000. It doesn't include agency
     *                 commission.
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
    public void setNetCost(com.google.api.ads.dfp.axis.v201802.Money netCost) {
        this.netCost = netCost;
    }


    /**
     * Gets the grossCost value for this ProposalLineItem.
     * 
     * @return grossCost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 10000. It includes agency commission.
     *                 
     *                 <p>At least one of the four fields {@link ProposalLineItem#netRate},
     * {@link ProposalLineItem#grossRate}, {@link ProposalLineItem#netCost}
     * and
     *                 {@link ProposalLineItem#grossCost} is required.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.Money getGrossCost() {
        return grossCost;
    }


    /**
     * Sets the grossCost value for this ProposalLineItem.
     * 
     * @param grossCost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision of 2
     *                 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#getAmountInMicros} must be multiples
     * of 10000. It includes agency commission.
     *                 
     *                 <p>At least one of the four fields {@link ProposalLineItem#netRate},
     * {@link ProposalLineItem#grossRate}, {@link ProposalLineItem#netCost}
     * and
     *                 {@link ProposalLineItem#grossCost} is required.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setGrossCost(com.google.api.ads.dfp.axis.v201802.Money grossCost) {
        this.grossCost = grossCost;
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
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryIndicator getDeliveryIndicator() {
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
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     *                 This attribute is read-only.
     */
    public void setDeliveryIndicator(com.google.api.ads.dfp.axis.v201802.DeliveryIndicator deliveryIndicator) {
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
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.DeliveryData getDeliveryData() {
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
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     *                 This attribute is read-only.
     */
    public void setDeliveryData(com.google.api.ads.dfp.axis.v201802.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the computedStatus value for this ProposalLineItem.
     * 
     * @return computedStatus   * The status of the {@link LineItem} generated from this proposal
     * line item.
     *                 This will be {@code null} if the proposal line item
     * has not pushed to DFP.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.ComputedStatus getComputedStatus() {
        return computedStatus;
    }


    /**
     * Sets the computedStatus value for this ProposalLineItem.
     * 
     * @param computedStatus   * The status of the {@link LineItem} generated from this proposal
     * line item.
     *                 This will be {@code null} if the proposal line item
     * has not pushed to DFP.
     *                 This attribute is read-only.
     */
    public void setComputedStatus(com.google.api.ads.dfp.axis.v201802.ComputedStatus computedStatus) {
        this.computedStatus = computedStatus;
    }


    /**
     * Gets the billingCap value for this ProposalLineItem.
     * 
     * @return billingCap   * Overrides the billing cap of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.BillingCap getBillingCap() {
        return billingCap;
    }


    /**
     * Sets the billingCap value for this ProposalLineItem.
     * 
     * @param billingCap   * Overrides the billing cap of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setBillingCap(com.google.api.ads.dfp.axis.v201802.BillingCap billingCap) {
        this.billingCap = billingCap;
    }


    /**
     * Gets the billingSchedule value for this ProposalLineItem.
     * 
     * @return billingSchedule   * Overrides the billing schedule of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this ProposalLineItem.
     * 
     * @param billingSchedule   * Overrides the billing schedule of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setBillingSchedule(com.google.api.ads.dfp.axis.v201802.BillingSchedule billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the billingSource value for this ProposalLineItem.
     * 
     * @return billingSource   * Overrides the billing source of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields ({@link #billingCap},
     *                 {@link #billingSchedule}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on this field. That is, none of the billing
     * fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.BillingSource getBillingSource() {
        return billingSource;
    }


    /**
     * Sets the billingSource value for this ProposalLineItem.
     * 
     * @param billingSource   * Overrides the billing source of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields ({@link #billingCap},
     *                 {@link #billingSchedule}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on this field. That is, none of the billing
     * fields will inherit from
     *                 their {@link Proposal} object anymore.
     *                 This attribute can be configured as editable after
     * the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setBillingSource(com.google.api.ads.dfp.axis.v201802.BillingSource billingSource) {
        this.billingSource = billingSource;
    }


    /**
     * Gets the billingBase value for this ProposalLineItem.
     * 
     * @return billingBase   * Overrides the billing base of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 <p>If this field is overridden, then other required
     * billing fields ({@link #billingCap}, {@link
     *                 #billingSchedule}, or {@link #billingSource}) also
     * need to be overridden depending on the
     *                 {@link #billingSource}. That is, none of the billing
     * fields will inherit from their {@link
     *                 Proposal} object anymore. This attribute can be configured
     * as editable after the proposal has
     *                 been submitted. Please check with your network administrator
     * for editable fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.BillingBase getBillingBase() {
        return billingBase;
    }


    /**
     * Sets the billingBase value for this ProposalLineItem.
     * 
     * @param billingBase   * Overrides the billing base of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 <p>If this field is overridden, then other required
     * billing fields ({@link #billingCap}, {@link
     *                 #billingSchedule}, or {@link #billingSource}) also
     * need to be overridden depending on the
     *                 {@link #billingSource}. That is, none of the billing
     * fields will inherit from their {@link
     *                 Proposal} object anymore. This attribute can be configured
     * as editable after the proposal has
     *                 been submitted. Please check with your network administrator
     * for editable fields configuration.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setBillingBase(com.google.api.ads.dfp.axis.v201802.BillingBase billingBase) {
        this.billingBase = billingBase;
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
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastModifiedDateTime() {
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
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the reservationStatus value for this ProposalLineItem.
     * 
     * @return reservationStatus   * The reservation status of the {@link ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.ReservationStatus getReservationStatus() {
        return reservationStatus;
    }


    /**
     * Sets the reservationStatus value for this ProposalLineItem.
     * 
     * @param reservationStatus   * The reservation status of the {@link ProposalLineItem}.
     *                 This attribute is read-only.
     */
    public void setReservationStatus(com.google.api.ads.dfp.axis.v201802.ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }


    /**
     * Gets the lastReservationDateTime value for this ProposalLineItem.
     * 
     * @return lastReservationDateTime   * The last {@link DateTime} when the {@link ProposalLineItem}
     * reserved inventory.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.DateTime getLastReservationDateTime() {
        return lastReservationDateTime;
    }


    /**
     * Sets the lastReservationDateTime value for this ProposalLineItem.
     * 
     * @param lastReservationDateTime   * The last {@link DateTime} when the {@link ProposalLineItem}
     * reserved inventory.
     *                 This attribute is read-only.
     */
    public void setLastReservationDateTime(com.google.api.ads.dfp.axis.v201802.DateTime lastReservationDateTime) {
        this.lastReservationDateTime = lastReservationDateTime;
    }


    /**
     * Gets the useThirdPartyAdServerFromProposal value for this ProposalLineItem.
     * 
     * @return useThirdPartyAdServerFromProposal   * Whether to use the corresponding proposal's third party ad
     * server. If this field is true,
     *                 {@code thirdPartyAdServerId} and {@code customThirdPartyAdServerName}
     * will be ignored.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Boolean getUseThirdPartyAdServerFromProposal() {
        return useThirdPartyAdServerFromProposal;
    }


    /**
     * Sets the useThirdPartyAdServerFromProposal value for this ProposalLineItem.
     * 
     * @param useThirdPartyAdServerFromProposal   * Whether to use the corresponding proposal's third party ad
     * server. If this field is true,
     *                 {@code thirdPartyAdServerId} and {@code customThirdPartyAdServerName}
     * will be ignored.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>not using programmatic, using sales management.</li></ul></span>
     */
    public void setUseThirdPartyAdServerFromProposal(java.lang.Boolean useThirdPartyAdServerFromProposal) {
        this.useThirdPartyAdServerFromProposal = useThirdPartyAdServerFromProposal;
    }


    /**
     * Gets the thirdPartyAdServerId value for this ProposalLineItem.
     * 
     * @return thirdPartyAdServerId   * A predefined third party ad server, which will be used to fill
     * in reconciliation. All
     *                 predefined third party ad servers can be found in
     * the {@code Third_Party_Company} PQL table. If
     *                 actual third party ad server is not in the predefined
     * list, this field is set to 0, and actual
     *                 third party ad server name is set in {@code customThirdPartyAdServerName}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.Integer getThirdPartyAdServerId() {
        return thirdPartyAdServerId;
    }


    /**
     * Sets the thirdPartyAdServerId value for this ProposalLineItem.
     * 
     * @param thirdPartyAdServerId   * A predefined third party ad server, which will be used to fill
     * in reconciliation. All
     *                 predefined third party ad servers can be found in
     * the {@code Third_Party_Company} PQL table. If
     *                 actual third party ad server is not in the predefined
     * list, this field is set to 0, and actual
     *                 third party ad server name is set in {@code customThirdPartyAdServerName}.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public void setThirdPartyAdServerId(java.lang.Integer thirdPartyAdServerId) {
        this.thirdPartyAdServerId = thirdPartyAdServerId;
    }


    /**
     * Gets the customThirdPartyAdServerName value for this ProposalLineItem.
     * 
     * @return customThirdPartyAdServerName   * When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here. When {@code
     *                 thirdPartyAdServerId} is not 0, this field is ignored.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public java.lang.String getCustomThirdPartyAdServerName() {
        return customThirdPartyAdServerName;
    }


    /**
     * Sets the customThirdPartyAdServerName value for this ProposalLineItem.
     * 
     * @param customThirdPartyAdServerName   * When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here. When {@code
     *                 thirdPartyAdServerId} is not 0, this field is ignored.
     * <span class="constraint Applicable">This attribute is applicable when:<ul><li>not
     * using programmatic, using sales management.</li></ul></span>
     */
    public void setCustomThirdPartyAdServerName(java.lang.String customThirdPartyAdServerName) {
        this.customThirdPartyAdServerName = customThirdPartyAdServerName;
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
     *                 <p>This field can only be changed if the {@link #linkStatus}
     * is {@link LinkStatus#UNLINKED}.
     *                 Otherwise its value is read-only and set to {@link
     * Product#environmentType} of the product
     *                 this proposal line item was created from.
     */
    public com.google.api.ads.dfp.axis.v201802.EnvironmentType getEnvironmentType() {
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
     *                 <p>This field can only be changed if the {@link #linkStatus}
     * is {@link LinkStatus#UNLINKED}.
     *                 Otherwise its value is read-only and set to {@link
     * Product#environmentType} of the product
     *                 this proposal line item was created from.
     */
    public void setEnvironmentType(com.google.api.ads.dfp.axis.v201802.EnvironmentType environmentType) {
        this.environmentType = environmentType;
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
     * Gets the linkStatus value for this ProposalLineItem.
     * 
     * @return linkStatus   * The status of the link between this {@code ProposalLineItem}
     * and its {link Product}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint ReadOnly">This attribute is read-only when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.LinkStatus getLinkStatus() {
        return linkStatus;
    }


    /**
     * Sets the linkStatus value for this ProposalLineItem.
     * 
     * @param linkStatus   * The status of the link between this {@code ProposalLineItem}
     * and its {link Product}.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint ReadOnly">This attribute is read-only when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public void setLinkStatus(com.google.api.ads.dfp.axis.v201802.LinkStatus linkStatus) {
        this.linkStatus = linkStatus;
    }


    /**
     * Gets the marketplaceInfo value for this ProposalLineItem.
     * 
     * @return marketplaceInfo   * The marketplace info if this proposal line item is programmatic,
     * null otherwise.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>using
     * programmatic guaranteed, not using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.ProposalLineItemMarketplaceInfo getMarketplaceInfo() {
        return marketplaceInfo;
    }


    /**
     * Sets the marketplaceInfo value for this ProposalLineItem.
     * 
     * @param marketplaceInfo   * The marketplace info if this proposal line item is programmatic,
     * null otherwise.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     *                 <span class="constraint Required">This attribute is
     * required when:<ul><li>using programmatic guaranteed, using sales management.</li><li>using
     * programmatic guaranteed, not using sales management.</li></ul></span>
     */
    public void setMarketplaceInfo(com.google.api.ads.dfp.axis.v201802.ProposalLineItemMarketplaceInfo marketplaceInfo) {
        this.marketplaceInfo = marketplaceInfo;
    }


    /**
     * Gets the rateCardPricingModel value for this ProposalLineItem.
     * 
     * @return rateCardPricingModel   * {@link RateCard} pricing model for the {@link ProposalLineItem}.
     * When the pricing model is
     *                 {@link PricingModel#NET} refer to the {@link netCost}
     * and {@link netRate} fields. When the
     *                 pricing model is {@link PricingModel#GROSS} refer
     * to the {@link grossCost} and
     *                 {@link grossRate} fields.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint ReadOnly">This attribute is read-only when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.PricingModel getRateCardPricingModel() {
        return rateCardPricingModel;
    }


    /**
     * Sets the rateCardPricingModel value for this ProposalLineItem.
     * 
     * @param rateCardPricingModel   * {@link RateCard} pricing model for the {@link ProposalLineItem}.
     * When the pricing model is
     *                 {@link PricingModel#NET} refer to the {@link netCost}
     * and {@link netRate} fields. When the
     *                 pricing model is {@link PricingModel#GROSS} refer
     * to the {@link grossCost} and
     *                 {@link grossRate} fields.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>not using programmatic, using sales management.</li></ul></span>
     * <span class="constraint ReadOnly">This attribute is read-only when:<ul><li>using
     * programmatic guaranteed, using sales management.</li><li>not using
     * programmatic, using sales management.</li></ul></span>
     */
    public void setRateCardPricingModel(com.google.api.ads.dfp.axis.v201802.PricingModel rateCardPricingModel) {
        this.rateCardPricingModel = rateCardPricingModel;
    }


    /**
     * Gets the additionalTerms value for this ProposalLineItem.
     * 
     * @return additionalTerms   * Additional terms shown to the buyer in Marketplace.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public java.lang.String getAdditionalTerms() {
        return additionalTerms;
    }


    /**
     * Sets the additionalTerms value for this ProposalLineItem.
     * 
     * @param additionalTerms   * Additional terms shown to the buyer in Marketplace.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public void setAdditionalTerms(java.lang.String additionalTerms) {
        this.additionalTerms = additionalTerms;
    }


    /**
     * Gets the programmaticCreativeSource value for this ProposalLineItem.
     * 
     * @return programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource getProgrammaticCreativeSource() {
        return programmaticCreativeSource;
    }


    /**
     * Sets the programmaticCreativeSource value for this ProposalLineItem.
     * 
     * @param programmaticCreativeSource   * Indicates the {@link ProgrammaticCreativeSource} of the programmatic
     * line item.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using programmatic guaranteed, using sales
     * management.</li><li>using programmatic guaranteed, not using sales
     * management.</li></ul></span>
     */
    public void setProgrammaticCreativeSource(com.google.api.ads.dfp.axis.v201802.ProgrammaticCreativeSource programmaticCreativeSource) {
        this.programmaticCreativeSource = programmaticCreativeSource;
    }


    /**
     * Gets the estimatedMinimumImpressions value for this ProposalLineItem.
     * 
     * @return estimatedMinimumImpressions   * The estimated minimum impressions that should be delivered
     * for a proposal line item.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using preferred deals, not using sales
     * management.</li></ul></span>
     */
    public java.lang.Long getEstimatedMinimumImpressions() {
        return estimatedMinimumImpressions;
    }


    /**
     * Sets the estimatedMinimumImpressions value for this ProposalLineItem.
     * 
     * @param estimatedMinimumImpressions   * The estimated minimum impressions that should be delivered
     * for a proposal line item.
     *                 <span class="constraint Applicable">This attribute
     * is applicable when:<ul><li>using preferred deals, not using sales
     * management.</li></ul></span>
     */
    public void setEstimatedMinimumImpressions(java.lang.Long estimatedMinimumImpressions) {
        this.estimatedMinimumImpressions = estimatedMinimumImpressions;
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
            ((this.packageId==null && other.getPackageId()==null) || 
             (this.packageId!=null &&
              this.packageId.equals(other.getPackageId()))) &&
            ((this.rateCardId==null && other.getRateCardId()==null) || 
             (this.rateCardId!=null &&
              this.rateCardId.equals(other.getRateCardId()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
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
            ((this.costAdjustment==null && other.getCostAdjustment()==null) || 
             (this.costAdjustment!=null &&
              this.costAdjustment.equals(other.getCostAdjustment()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.goal==null && other.getGoal()==null) || 
             (this.goal!=null &&
              this.goal.equals(other.getGoal()))) &&
            ((this.contractedQuantityBuffer==null && other.getContractedQuantityBuffer()==null) || 
             (this.contractedQuantityBuffer!=null &&
              this.contractedQuantityBuffer.equals(other.getContractedQuantityBuffer()))) &&
            ((this.scheduledQuantity==null && other.getScheduledQuantity()==null) || 
             (this.scheduledQuantity!=null &&
              this.scheduledQuantity.equals(other.getScheduledQuantity()))) &&
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
            ((this.creativeRotationType==null && other.getCreativeRotationType()==null) || 
             (this.creativeRotationType!=null &&
              this.creativeRotationType.equals(other.getCreativeRotationType()))) &&
            ((this.videoMaxDuration==null && other.getVideoMaxDuration()==null) || 
             (this.videoMaxDuration!=null &&
              this.videoMaxDuration.equals(other.getVideoMaxDuration()))) &&
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
            ((this.productConstraints==null && other.getProductConstraints()==null) || 
             (this.productConstraints!=null &&
              this.productConstraints.equals(other.getProductConstraints()))) &&
            ((this.premiums==null && other.getPremiums()==null) || 
             (this.premiums!=null &&
              java.util.Arrays.equals(this.premiums, other.getPremiums()))) &&
            ((this.isSold==null && other.getIsSold()==null) || 
             (this.isSold!=null &&
              this.isSold.equals(other.getIsSold()))) &&
            ((this.baseRate==null && other.getBaseRate()==null) || 
             (this.baseRate!=null &&
              this.baseRate.equals(other.getBaseRate()))) &&
            ((this.netRate==null && other.getNetRate()==null) || 
             (this.netRate!=null &&
              this.netRate.equals(other.getNetRate()))) &&
            ((this.grossRate==null && other.getGrossRate()==null) || 
             (this.grossRate!=null &&
              this.grossRate.equals(other.getGrossRate()))) &&
            ((this.netCost==null && other.getNetCost()==null) || 
             (this.netCost!=null &&
              this.netCost.equals(other.getNetCost()))) &&
            ((this.grossCost==null && other.getGrossCost()==null) || 
             (this.grossCost!=null &&
              this.grossCost.equals(other.getGrossCost()))) &&
            ((this.deliveryIndicator==null && other.getDeliveryIndicator()==null) || 
             (this.deliveryIndicator!=null &&
              this.deliveryIndicator.equals(other.getDeliveryIndicator()))) &&
            ((this.deliveryData==null && other.getDeliveryData()==null) || 
             (this.deliveryData!=null &&
              this.deliveryData.equals(other.getDeliveryData()))) &&
            ((this.computedStatus==null && other.getComputedStatus()==null) || 
             (this.computedStatus!=null &&
              this.computedStatus.equals(other.getComputedStatus()))) &&
            ((this.billingCap==null && other.getBillingCap()==null) || 
             (this.billingCap!=null &&
              this.billingCap.equals(other.getBillingCap()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.billingSource==null && other.getBillingSource()==null) || 
             (this.billingSource!=null &&
              this.billingSource.equals(other.getBillingSource()))) &&
            ((this.billingBase==null && other.getBillingBase()==null) || 
             (this.billingBase!=null &&
              this.billingBase.equals(other.getBillingBase()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.reservationStatus==null && other.getReservationStatus()==null) || 
             (this.reservationStatus!=null &&
              this.reservationStatus.equals(other.getReservationStatus()))) &&
            ((this.lastReservationDateTime==null && other.getLastReservationDateTime()==null) || 
             (this.lastReservationDateTime!=null &&
              this.lastReservationDateTime.equals(other.getLastReservationDateTime()))) &&
            ((this.useThirdPartyAdServerFromProposal==null && other.getUseThirdPartyAdServerFromProposal()==null) || 
             (this.useThirdPartyAdServerFromProposal!=null &&
              this.useThirdPartyAdServerFromProposal.equals(other.getUseThirdPartyAdServerFromProposal()))) &&
            ((this.thirdPartyAdServerId==null && other.getThirdPartyAdServerId()==null) || 
             (this.thirdPartyAdServerId!=null &&
              this.thirdPartyAdServerId.equals(other.getThirdPartyAdServerId()))) &&
            ((this.customThirdPartyAdServerName==null && other.getCustomThirdPartyAdServerName()==null) || 
             (this.customThirdPartyAdServerName!=null &&
              this.customThirdPartyAdServerName.equals(other.getCustomThirdPartyAdServerName()))) &&
            ((this.environmentType==null && other.getEnvironmentType()==null) || 
             (this.environmentType!=null &&
              this.environmentType.equals(other.getEnvironmentType()))) &&
            ((this.isProgrammatic==null && other.getIsProgrammatic()==null) || 
             (this.isProgrammatic!=null &&
              this.isProgrammatic.equals(other.getIsProgrammatic()))) &&
            ((this.linkStatus==null && other.getLinkStatus()==null) || 
             (this.linkStatus!=null &&
              this.linkStatus.equals(other.getLinkStatus()))) &&
            ((this.marketplaceInfo==null && other.getMarketplaceInfo()==null) || 
             (this.marketplaceInfo!=null &&
              this.marketplaceInfo.equals(other.getMarketplaceInfo()))) &&
            ((this.rateCardPricingModel==null && other.getRateCardPricingModel()==null) || 
             (this.rateCardPricingModel!=null &&
              this.rateCardPricingModel.equals(other.getRateCardPricingModel()))) &&
            ((this.additionalTerms==null && other.getAdditionalTerms()==null) || 
             (this.additionalTerms!=null &&
              this.additionalTerms.equals(other.getAdditionalTerms()))) &&
            ((this.programmaticCreativeSource==null && other.getProgrammaticCreativeSource()==null) || 
             (this.programmaticCreativeSource!=null &&
              this.programmaticCreativeSource.equals(other.getProgrammaticCreativeSource()))) &&
            ((this.estimatedMinimumImpressions==null && other.getEstimatedMinimumImpressions()==null) || 
             (this.estimatedMinimumImpressions!=null &&
              this.estimatedMinimumImpressions.equals(other.getEstimatedMinimumImpressions())));
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
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        if (getRateCardId() != null) {
            _hashCode += getRateCardId().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
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
        if (getCostAdjustment() != null) {
            _hashCode += getCostAdjustment().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getGoal() != null) {
            _hashCode += getGoal().hashCode();
        }
        if (getContractedQuantityBuffer() != null) {
            _hashCode += getContractedQuantityBuffer().hashCode();
        }
        if (getScheduledQuantity() != null) {
            _hashCode += getScheduledQuantity().hashCode();
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
        if (getCreativeRotationType() != null) {
            _hashCode += getCreativeRotationType().hashCode();
        }
        if (getVideoMaxDuration() != null) {
            _hashCode += getVideoMaxDuration().hashCode();
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
        if (getProductConstraints() != null) {
            _hashCode += getProductConstraints().hashCode();
        }
        if (getPremiums() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPremiums());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPremiums(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSold() != null) {
            _hashCode += getIsSold().hashCode();
        }
        if (getBaseRate() != null) {
            _hashCode += getBaseRate().hashCode();
        }
        if (getNetRate() != null) {
            _hashCode += getNetRate().hashCode();
        }
        if (getGrossRate() != null) {
            _hashCode += getGrossRate().hashCode();
        }
        if (getNetCost() != null) {
            _hashCode += getNetCost().hashCode();
        }
        if (getGrossCost() != null) {
            _hashCode += getGrossCost().hashCode();
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
        if (getBillingCap() != null) {
            _hashCode += getBillingCap().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getBillingSource() != null) {
            _hashCode += getBillingSource().hashCode();
        }
        if (getBillingBase() != null) {
            _hashCode += getBillingBase().hashCode();
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
        if (getUseThirdPartyAdServerFromProposal() != null) {
            _hashCode += getUseThirdPartyAdServerFromProposal().hashCode();
        }
        if (getThirdPartyAdServerId() != null) {
            _hashCode += getThirdPartyAdServerId().hashCode();
        }
        if (getCustomThirdPartyAdServerName() != null) {
            _hashCode += getCustomThirdPartyAdServerName().hashCode();
        }
        if (getEnvironmentType() != null) {
            _hashCode += getEnvironmentType().hashCode();
        }
        if (getIsProgrammatic() != null) {
            _hashCode += getIsProgrammatic().hashCode();
        }
        if (getLinkStatus() != null) {
            _hashCode += getLinkStatus().hashCode();
        }
        if (getMarketplaceInfo() != null) {
            _hashCode += getMarketplaceInfo().hashCode();
        }
        if (getRateCardPricingModel() != null) {
            _hashCode += getRateCardPricingModel().hashCode();
        }
        if (getAdditionalTerms() != null) {
            _hashCode += getAdditionalTerms().hashCode();
        }
        if (getProgrammaticCreativeSource() != null) {
            _hashCode += getProgrammaticCreativeSource().hashCode();
        }
        if (getEstimatedMinimumImpressions() != null) {
            _hashCode += getEstimatedMinimumImpressions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "packageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productId"));
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
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
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
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "timeZoneId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "internalNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "costAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CostAdjustment"));
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
        elemField.setFieldName("goal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "goal"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Goal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedQuantityBuffer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "contractedQuantityBuffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "scheduledQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "CompanionDeliveryOption"));
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
        elemField.setFieldName("videoMaxDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "videoMaxDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("dfpLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "dfpLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "RateType"));
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
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Targeting"));
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
        elemField.setFieldName("productConstraints");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "productConstraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItemConstraints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiums");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "premiums"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItemPremium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isSold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "baseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "netRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "grossRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netCost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "netCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossCost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "grossCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
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
        elemField.setFieldName("computedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "computedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingBase");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billingBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillingBase"));
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
        elemField.setFieldName("reservationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reservationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReservationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReservationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lastReservationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useThirdPartyAdServerFromProposal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "useThirdPartyAdServerFromProposal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAdServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "thirdPartyAdServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customThirdPartyAdServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "customThirdPartyAdServerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "environmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "EnvironmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProgrammatic");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "isProgrammatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "linkStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "LinkStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "marketplaceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ProposalLineItemMarketplaceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardPricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rateCardPricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PricingModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalTerms");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "additionalTerms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("estimatedMinimumImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "estimatedMinimumImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
