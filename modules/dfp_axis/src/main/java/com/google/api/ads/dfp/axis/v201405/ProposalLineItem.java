/**
 * ProposalLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


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
    /* The unique ID of the {@code ProposalLineItem}. This attribute
     * is readonly and is
     *                 assigned by Google. */
    private java.lang.Long id;

    /* The unique ID of the {@link Proposal}, to which the {@code
     * ProposalLineItem}
     *                 belongs. This attribute is required for creation and
     * then is readonly. */
    private java.lang.Long proposalId;

    /* The unique ID of the {@link RateCard}, based on which the {@code
     * ProposalLineItem}
     *                 is priced. The rate card must be associated with a
     * rate belonging to the
     *                 {@link #productId product}. This attribute is required
     * for creation and then is readonly. */
    private java.lang.Long rateCardId;

    /* The unique ID of the {@link Product}, which the {@code ProposalLineItem}
     * is created from. This attribute is required for creation and then
     * is readonly. */
    private java.lang.Long productId;

    /* The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute is required and has
     * a maximum length of 255 characters. */
    private java.lang.String name;

    /* The date and time at which the line item associated with the
     * {@code ProposalLineItem} is enabled to begin serving. This attribute
     * is required
     *                 and must be in the future when it turns into a line
     * item.
     *                 This attribute becomes readonly once the {@code ProposalLineItem}
     * has started delivering. */
    private com.google.api.ads.dfp.axis.v201405.DateTime startDateTime;

    /* The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is required
     * and
     *                 must be after the {@link #startDateTime}. */
    private com.google.api.ads.dfp.axis.v201405.DateTime endDateTime;

    /* Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}. */
    private com.google.api.ads.dfp.axis.v201405.CostAdjustment costAdjustment;

    /* The archival status of the {@code ProposalLineItem}. This attribute
     * is readonly. */
    private java.lang.Boolean isArchived;

    /* The number of impressions or clicks or percentage of available
     * impressions for
     *                 the {@code ProposalLineItem}, it depends on {@link
     * #lineItemType} and
     *                 {@link Product#rateType}. This attribute is required
     * and must be greater than 0
     *                 when the proposal line item turns into a line item. */
    private java.lang.Long unitsBought;

    /* A percentage number to a STANDARD line item with CPM or CPC
     * as the rate
     *                 type, so that the scheduled delivery goal could be
     * relaxed.
     *                 This number is milli-percent based, i.e. 10% would
     * be 10000. */
    private java.lang.Integer unitsBoughtBuffer;

    /* The strategy for delivering ads over the course of the {@code
     * ProposalLineItem}'s
     *                 duration. This attribute is optional and default value
     * is
     *                 {@link DeliveryRateType#EVENLY}. */
    private com.google.api.ads.dfp.axis.v201405.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This attribute
     *                 is optional during creation and defaults to the
     *                 {@link Product#roadblockingType product's roadblocking
     * type},
     *                 or {@link RoadblockingType#ONLY_ONE} if the product
     * does not have one. */
    private com.google.api.ads.dfp.axis.v201405.RoadblockingType roadblockingType;

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
    private com.google.api.ads.dfp.axis.v201405.CompanionDeliveryOption companionDeliveryOption;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code ProposalLineItem}. This
     * attribute is optional and
     *                 default value is {@link CreativeRotationType#OPTIMIZED}. */
    private com.google.api.ads.dfp.axis.v201405.CreativeRotationType creativeRotationType;

    /* The set of frequency capping units for this {@code ProposalLineItem}.
     * This
     *                 attribute is optional during creation and defaults
     * to the
     *                 {@link Product#frequencyCaps product's frequency caps}
     * if
     *                 {@link Product#allowFrequencyCapsCustomization} is
     * {@code false}. */
    private com.google.api.ads.dfp.axis.v201405.FrequencyCap[] frequencyCaps;

    /* The unique ID of corresponding {@link LineItem}. This attribute
     * is readonly.
     *                 This will be {@code null} if the {@link Proposal}
     * has not been pushed to DFP. */
    private java.lang.Long dfpLineItemId;

    /* The corresponding {@link LineItemType} of the {@code ProposalLineItem}.
     * This attribute is required and must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul> */
    private com.google.api.ads.dfp.axis.v201405.LineItemType lineItemType;

    /* The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 The priority is a value between 1 and 16. The following
     * default, minimum and
     *                 maximum priority values is allowed for each line item
     * type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Default
     * Priority</th>
     *                 <th scope="col">Minimum Priority</th> <th scope="col">Maximum
     * priority</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4</td><td>2</td><td>5</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8</td><td>6</td><td>10</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 This attribute is optional during creation and defaults
     * to the
     *                 {@link Product#priority product's priority}, or the
     * default value listed above if
     *                 the product's priority cannot be used. */
    private java.lang.Integer lineItemPriority;

    /* The method used for billing the {@code ProposalLineItem}. This
     * attribute is
     *                 readonly. */
    private com.google.api.ads.dfp.axis.v201405.RateType rateType;

    /* Details about the creatives that are expected to serve through
     * the
     *                 {@code ProposalLineItem}. This attribute is optional
     * during creation and defaults to the
     *                 {@link Product#creativePlaceholders product's creative
     * placeholders}. */
    private com.google.api.ads.dfp.axis.v201405.CreativePlaceholder[] creativePlaceholders;

    /* Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}. */
    private com.google.api.ads.dfp.axis.v201405.Targeting targeting;

    /* The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201405.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google. */
    private com.google.api.ads.dfp.axis.v201405.AppliedLabel[] effectiveAppliedLabels;

    /* The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those tiggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}. */
    private com.google.api.ads.dfp.axis.v201405.ProposalLineItemPremium[] premiums;

    /* Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute
     *                 is readonly. */
    private java.lang.Boolean isSold;

    /* The base rate of the {@code ProposalLineItem} in proposal currency.
     * This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201405.Money baseRate;

    /* The amount of money to spend per impression or click in proposal
     * currency.
     *                 It supports precision of 2 decimal places in terms
     * of the fundamental currency
     *                 unit, so the {@link Money#microAmount} must be multiples
     * of 10000. This attribute is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201405.Money costPerUnit;

    /* The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision
     *                 of 2 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#microAmount} must be multiples of 10000.
     * This attribute is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201405.Money cost;

    /* Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This attribute is readonly and is populated by Google.
     * This will be {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol> */
    private com.google.api.ads.dfp.axis.v201405.DeliveryIndicator deliveryIndicator;

    /* Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This attribute is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot be computed due to
     *                 one of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li> */
    private com.google.api.ads.dfp.axis.v201405.DeliveryData deliveryData;

    /* The status of the {@link LineItem} generated from this proposal
     * line item. This attribute is
     *                 readonly. This will be {@code null} if the proposal
     * line item has not pushed to DFP. */
    private com.google.api.ads.dfp.axis.v201405.ComputedStatus computedStatus;

    /* Overrides the billing cap of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore. */
    private com.google.api.ads.dfp.axis.v201405.BillingCap billingCap;

    /* Overrides the billing schedule of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields
     *                 ({@link #billingSource}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on the {@link #billingSource}. That is,
     * none of the billing fields will inherit from
     *                 their {@link Proposal} object anymore. */
    private com.google.api.ads.dfp.axis.v201405.BillingSchedule billingSchedule;

    /* Overrides the billing source of this {@code ProposalLineItem}.
     * This attribute is optional.
     *                 
     *                 If this field is overridden, then other required billing
     * fields ({@link #billingCap},
     *                 {@link #billingSchedule}, or {@link #billingBase})
     * also need to be overridden
     *                 depending on this field. That is, none of the billing
     * fields will inherit from
     *                 their {@link Proposal} object anymore. */
    private com.google.api.ads.dfp.axis.v201405.BillingSource billingSource;

    /* The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 This attribute is readonly and is assigned by Google
     * when a {@code ProposalLineItem} is
     *                 updated. */
    private com.google.api.ads.dfp.axis.v201405.DateTime lastModifiedDateTime;

    /* Whether to use the corresponding proposal's third party ad
     * server.
     *                 If this field is true, {@code thirdPartyAdServerId}
     * and {@code customThirdPartyAdServerName}
     *                 will be ignored. */
    private java.lang.Boolean useThirdPartyAdServerFromProposal;

    /* A predefined third party ad server, which will be used to fill
     * in reconciliation.
     *                 All predefined third party ad servers can be found
     * in the {@code Third_Party_Company}
     *                 PQL table.
     *                 If actual third party ad server is not in the predefined
     * list, this field is set to 0, and
     *                 actual third party ad server name is set in {@code
     * customThirdPartyAdServerName}. */
    private java.lang.Integer thirdPartyAdServerId;

    /* When actual third party ad server is not in the predefined
     * list, {@code thirdPartyAdServerId}
     *                 is set to 0, and actual third party ad server name
     * is set here.
     *                 When {@code thirdPartyAdServerId} is not 0, this field
     * is ignored. */
    private java.lang.String customThirdPartyAdServerName;

    public ProposalLineItem() {
    }

    public ProposalLineItem(
           java.lang.Long id,
           java.lang.Long proposalId,
           java.lang.Long rateCardId,
           java.lang.Long productId,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201405.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201405.DateTime endDateTime,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201405.CostAdjustment costAdjustment,
           java.lang.Boolean isArchived,
           java.lang.Long unitsBought,
           java.lang.Integer unitsBoughtBuffer,
           com.google.api.ads.dfp.axis.v201405.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201405.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201405.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201405.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201405.FrequencyCap[] frequencyCaps,
           java.lang.Long dfpLineItemId,
           com.google.api.ads.dfp.axis.v201405.LineItemType lineItemType,
           java.lang.Integer lineItemPriority,
           com.google.api.ads.dfp.axis.v201405.RateType rateType,
           com.google.api.ads.dfp.axis.v201405.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201405.Targeting targeting,
           com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201405.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201405.AppliedLabel[] effectiveAppliedLabels,
           com.google.api.ads.dfp.axis.v201405.ProposalLineItemPremium[] premiums,
           java.lang.Boolean isSold,
           com.google.api.ads.dfp.axis.v201405.Money baseRate,
           com.google.api.ads.dfp.axis.v201405.Money costPerUnit,
           com.google.api.ads.dfp.axis.v201405.Money cost,
           com.google.api.ads.dfp.axis.v201405.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.axis.v201405.DeliveryData deliveryData,
           com.google.api.ads.dfp.axis.v201405.ComputedStatus computedStatus,
           com.google.api.ads.dfp.axis.v201405.BillingCap billingCap,
           com.google.api.ads.dfp.axis.v201405.BillingSchedule billingSchedule,
           com.google.api.ads.dfp.axis.v201405.BillingSource billingSource,
           com.google.api.ads.dfp.axis.v201405.DateTime lastModifiedDateTime,
           java.lang.Boolean useThirdPartyAdServerFromProposal,
           java.lang.Integer thirdPartyAdServerId,
           java.lang.String customThirdPartyAdServerName) {
           this.id = id;
           this.proposalId = proposalId;
           this.rateCardId = rateCardId;
           this.productId = productId;
           this.name = name;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.notes = notes;
           this.costAdjustment = costAdjustment;
           this.isArchived = isArchived;
           this.unitsBought = unitsBought;
           this.unitsBoughtBuffer = unitsBoughtBuffer;
           this.deliveryRateType = deliveryRateType;
           this.roadblockingType = roadblockingType;
           this.companionDeliveryOption = companionDeliveryOption;
           this.creativeRotationType = creativeRotationType;
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
           this.premiums = premiums;
           this.isSold = isSold;
           this.baseRate = baseRate;
           this.costPerUnit = costPerUnit;
           this.cost = cost;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.computedStatus = computedStatus;
           this.billingCap = billingCap;
           this.billingSchedule = billingSchedule;
           this.billingSource = billingSource;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.useThirdPartyAdServerFromProposal = useThirdPartyAdServerFromProposal;
           this.thirdPartyAdServerId = thirdPartyAdServerId;
           this.customThirdPartyAdServerName = customThirdPartyAdServerName;
    }


    /**
     * Gets the id value for this ProposalLineItem.
     * 
     * @return id   * The unique ID of the {@code ProposalLineItem}. This attribute
     * is readonly and is
     *                 assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProposalLineItem.
     * 
     * @param id   * The unique ID of the {@code ProposalLineItem}. This attribute
     * is readonly and is
     *                 assigned by Google.
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
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
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
     */
    public void setRateCardId(java.lang.Long rateCardId) {
        this.rateCardId = rateCardId;
    }


    /**
     * Gets the productId value for this ProposalLineItem.
     * 
     * @return productId   * The unique ID of the {@link Product}, which the {@code ProposalLineItem}
     * is created from. This attribute is required for creation and then
     * is readonly.
     */
    public java.lang.Long getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this ProposalLineItem.
     * 
     * @param productId   * The unique ID of the {@link Product}, which the {@code ProposalLineItem}
     * is created from. This attribute is required for creation and then
     * is readonly.
     */
    public void setProductId(java.lang.Long productId) {
        this.productId = productId;
    }


    /**
     * Gets the name value for this ProposalLineItem.
     * 
     * @return name   * The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute is required and has
     * a maximum length of 255 characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProposalLineItem.
     * 
     * @param name   * The name of the {@code ProposalLineItem} which should be unique
     * under the same
     *                 {@link Proposal}. This attribute is required and has
     * a maximum length of 255 characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDateTime value for this ProposalLineItem.
     * 
     * @return startDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} is enabled to begin serving. This attribute
     * is required
     *                 and must be in the future when it turns into a line
     * item.
     *                 This attribute becomes readonly once the {@code ProposalLineItem}
     * has started delivering.
     */
    public com.google.api.ads.dfp.axis.v201405.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this ProposalLineItem.
     * 
     * @param startDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} is enabled to begin serving. This attribute
     * is required
     *                 and must be in the future when it turns into a line
     * item.
     *                 This attribute becomes readonly once the {@code ProposalLineItem}
     * has started delivering.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201405.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this ProposalLineItem.
     * 
     * @return endDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is required
     * and
     *                 must be after the {@link #startDateTime}.
     */
    public com.google.api.ads.dfp.axis.v201405.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this ProposalLineItem.
     * 
     * @param endDateTime   * The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is required
     * and
     *                 must be after the {@link #startDateTime}.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201405.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the notes value for this ProposalLineItem.
     * 
     * @return notes   * Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this ProposalLineItem.
     * 
     * @param notes   * Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the costAdjustment value for this ProposalLineItem.
     * 
     * @return costAdjustment   * The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}.
     */
    public com.google.api.ads.dfp.axis.v201405.CostAdjustment getCostAdjustment() {
        return costAdjustment;
    }


    /**
     * Sets the costAdjustment value for this ProposalLineItem.
     * 
     * @param costAdjustment   * The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}.
     */
    public void setCostAdjustment(com.google.api.ads.dfp.axis.v201405.CostAdjustment costAdjustment) {
        this.costAdjustment = costAdjustment;
    }


    /**
     * Gets the isArchived value for this ProposalLineItem.
     * 
     * @return isArchived   * The archival status of the {@code ProposalLineItem}. This attribute
     * is readonly.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this ProposalLineItem.
     * 
     * @param isArchived   * The archival status of the {@code ProposalLineItem}. This attribute
     * is readonly.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the unitsBought value for this ProposalLineItem.
     * 
     * @return unitsBought   * The number of impressions or clicks or percentage of available
     * impressions for
     *                 the {@code ProposalLineItem}, it depends on {@link
     * #lineItemType} and
     *                 {@link Product#rateType}. This attribute is required
     * and must be greater than 0
     *                 when the proposal line item turns into a line item.
     */
    public java.lang.Long getUnitsBought() {
        return unitsBought;
    }


    /**
     * Sets the unitsBought value for this ProposalLineItem.
     * 
     * @param unitsBought   * The number of impressions or clicks or percentage of available
     * impressions for
     *                 the {@code ProposalLineItem}, it depends on {@link
     * #lineItemType} and
     *                 {@link Product#rateType}. This attribute is required
     * and must be greater than 0
     *                 when the proposal line item turns into a line item.
     */
    public void setUnitsBought(java.lang.Long unitsBought) {
        this.unitsBought = unitsBought;
    }


    /**
     * Gets the unitsBoughtBuffer value for this ProposalLineItem.
     * 
     * @return unitsBoughtBuffer   * A percentage number to a STANDARD line item with CPM or CPC
     * as the rate
     *                 type, so that the scheduled delivery goal could be
     * relaxed.
     *                 This number is milli-percent based, i.e. 10% would
     * be 10000.
     */
    public java.lang.Integer getUnitsBoughtBuffer() {
        return unitsBoughtBuffer;
    }


    /**
     * Sets the unitsBoughtBuffer value for this ProposalLineItem.
     * 
     * @param unitsBoughtBuffer   * A percentage number to a STANDARD line item with CPM or CPC
     * as the rate
     *                 type, so that the scheduled delivery goal could be
     * relaxed.
     *                 This number is milli-percent based, i.e. 10% would
     * be 10000.
     */
    public void setUnitsBoughtBuffer(java.lang.Integer unitsBoughtBuffer) {
        this.unitsBoughtBuffer = unitsBoughtBuffer;
    }


    /**
     * Gets the deliveryRateType value for this ProposalLineItem.
     * 
     * @return deliveryRateType   * The strategy for delivering ads over the course of the {@code
     * ProposalLineItem}'s
     *                 duration. This attribute is optional and default value
     * is
     *                 {@link DeliveryRateType#EVENLY}.
     */
    public com.google.api.ads.dfp.axis.v201405.DeliveryRateType getDeliveryRateType() {
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
     */
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201405.DeliveryRateType deliveryRateType) {
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
     *                 or {@link RoadblockingType#ONLY_ONE} if the product
     * does not have one.
     */
    public com.google.api.ads.dfp.axis.v201405.RoadblockingType getRoadblockingType() {
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
     *                 or {@link RoadblockingType#ONLY_ONE} if the product
     * does not have one.
     */
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201405.RoadblockingType roadblockingType) {
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
    public com.google.api.ads.dfp.axis.v201405.CompanionDeliveryOption getCompanionDeliveryOption() {
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
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201405.CompanionDeliveryOption companionDeliveryOption) {
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
     */
    public com.google.api.ads.dfp.axis.v201405.CreativeRotationType getCreativeRotationType() {
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
     */
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201405.CreativeRotationType creativeRotationType) {
        this.creativeRotationType = creativeRotationType;
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
    public com.google.api.ads.dfp.axis.v201405.FrequencyCap[] getFrequencyCaps() {
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
    public void setFrequencyCaps(com.google.api.ads.dfp.axis.v201405.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201405.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201405.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
    }


    /**
     * Gets the dfpLineItemId value for this ProposalLineItem.
     * 
     * @return dfpLineItemId   * The unique ID of corresponding {@link LineItem}. This attribute
     * is readonly.
     *                 This will be {@code null} if the {@link Proposal}
     * has not been pushed to DFP.
     */
    public java.lang.Long getDfpLineItemId() {
        return dfpLineItemId;
    }


    /**
     * Sets the dfpLineItemId value for this ProposalLineItem.
     * 
     * @param dfpLineItemId   * The unique ID of corresponding {@link LineItem}. This attribute
     * is readonly.
     *                 This will be {@code null} if the {@link Proposal}
     * has not been pushed to DFP.
     */
    public void setDfpLineItemId(java.lang.Long dfpLineItemId) {
        this.dfpLineItemId = dfpLineItemId;
    }


    /**
     * Gets the lineItemType value for this ProposalLineItem.
     * 
     * @return lineItemType   * The corresponding {@link LineItemType} of the {@code ProposalLineItem}.
     * This attribute is required and must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul>
     */
    public com.google.api.ads.dfp.axis.v201405.LineItemType getLineItemType() {
        return lineItemType;
    }


    /**
     * Sets the lineItemType value for this ProposalLineItem.
     * 
     * @param lineItemType   * The corresponding {@link LineItemType} of the {@code ProposalLineItem}.
     * This attribute is required and must be one of:
     *                 <ul>
     *                 <li>{@link LineItemType#SPONSORSHIP}</li>
     *                 <li>{@link LineItemType#STANDARD}</li>
     *                 <li>{@link LineItemType#NETWORK}</li>
     *                 <li>{@link LineItemType#BULK}</li>
     *                 <li>{@link LineItemType#PRICE_PRIORITY}</li>
     *                 <li>{@link LineItemType#HOUSE}</li>
     *                 </ul>
     */
    public void setLineItemType(com.google.api.ads.dfp.axis.v201405.LineItemType lineItemType) {
        this.lineItemType = lineItemType;
    }


    /**
     * Gets the lineItemPriority value for this ProposalLineItem.
     * 
     * @return lineItemPriority   * The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 The priority is a value between 1 and 16. The following
     * default, minimum and
     *                 maximum priority values is allowed for each line item
     * type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Default
     * Priority</th>
     *                 <th scope="col">Minimum Priority</th> <th scope="col">Maximum
     * priority</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4</td><td>2</td><td>5</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8</td><td>6</td><td>10</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 This attribute is optional during creation and defaults
     * to the
     *                 {@link Product#priority product's priority}, or the
     * default value listed above if
     *                 the product's priority cannot be used.
     */
    public java.lang.Integer getLineItemPriority() {
        return lineItemPriority;
    }


    /**
     * Sets the lineItemPriority value for this ProposalLineItem.
     * 
     * @param lineItemPriority   * The priority for the corresponding {@link LineItem} of the
     * {@code ProposalLineItem}.
     *                 The priority is a value between 1 and 16. The following
     * default, minimum and
     *                 maximum priority values is allowed for each line item
     * type:
     *                 <table>
     *                 <tr>
     *                 <th scope="col">LineItemType</th> <th scope="col">Default
     * Priority</th>
     *                 <th scope="col">Minimum Priority</th> <th scope="col">Maximum
     * priority</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#SPONSORSHIP}</td>
     *                 <td>4</td><td>2</td><td>5</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#STANDARD}</td>
     *                 <td>8</td><td>6</td><td>10</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#NETWORK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#BULK}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#PRICE_PRIORITY}</td>
     *                 <td>12</td><td>11</td><td>14</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link LineItemType#HOUSE}</td>
     *                 <td>16</td><td>15</td><td>16</td>
     *                 </tr>
     *                 </table>
     *                 
     *                 This attribute is optional during creation and defaults
     * to the
     *                 {@link Product#priority product's priority}, or the
     * default value listed above if
     *                 the product's priority cannot be used.
     */
    public void setLineItemPriority(java.lang.Integer lineItemPriority) {
        this.lineItemPriority = lineItemPriority;
    }


    /**
     * Gets the rateType value for this ProposalLineItem.
     * 
     * @return rateType   * The method used for billing the {@code ProposalLineItem}. This
     * attribute is
     *                 readonly.
     */
    public com.google.api.ads.dfp.axis.v201405.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ProposalLineItem.
     * 
     * @param rateType   * The method used for billing the {@code ProposalLineItem}. This
     * attribute is
     *                 readonly.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201405.RateType rateType) {
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
     */
    public com.google.api.ads.dfp.axis.v201405.CreativePlaceholder[] getCreativePlaceholders() {
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
     */
    public void setCreativePlaceholders(com.google.api.ads.dfp.axis.v201405.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201405.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201405.CreativePlaceholder _value) {
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
    public com.google.api.ads.dfp.axis.v201405.Targeting getTargeting() {
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
    public void setTargeting(com.google.api.ads.dfp.axis.v201405.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the customFieldValues value for this ProposalLineItem.
     * 
     * @return customFieldValues   * The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this ProposalLineItem.
     * 
     * @param customFieldValues   * The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201405.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this ProposalLineItem.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201405.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this ProposalLineItem.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201405.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201405.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201405.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this ProposalLineItem.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201405.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this ProposalLineItem.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201405.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201405.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201405.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the premiums value for this ProposalLineItem.
     * 
     * @return premiums   * The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those tiggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}.
     */
    public com.google.api.ads.dfp.axis.v201405.ProposalLineItemPremium[] getPremiums() {
        return premiums;
    }


    /**
     * Sets the premiums value for this ProposalLineItem.
     * 
     * @param premiums   * The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those tiggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}.
     */
    public void setPremiums(com.google.api.ads.dfp.axis.v201405.ProposalLineItemPremium[] premiums) {
        this.premiums = premiums;
    }

    public com.google.api.ads.dfp.axis.v201405.ProposalLineItemPremium getPremiums(int i) {
        return this.premiums[i];
    }

    public void setPremiums(int i, com.google.api.ads.dfp.axis.v201405.ProposalLineItemPremium _value) {
        this.premiums[i] = _value;
    }


    /**
     * Gets the isSold value for this ProposalLineItem.
     * 
     * @return isSold   * Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute
     *                 is readonly.
     */
    public java.lang.Boolean getIsSold() {
        return isSold;
    }


    /**
     * Sets the isSold value for this ProposalLineItem.
     * 
     * @param isSold   * Indicates whether this {@code ProposalLineItem} has been sold.
     * This attribute
     *                 is readonly.
     */
    public void setIsSold(java.lang.Boolean isSold) {
        this.isSold = isSold;
    }


    /**
     * Gets the baseRate value for this ProposalLineItem.
     * 
     * @return baseRate   * The base rate of the {@code ProposalLineItem} in proposal currency.
     * This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getBaseRate() {
        return baseRate;
    }


    /**
     * Sets the baseRate value for this ProposalLineItem.
     * 
     * @param baseRate   * The base rate of the {@code ProposalLineItem} in proposal currency.
     * This attribute is readonly.
     */
    public void setBaseRate(com.google.api.ads.dfp.axis.v201405.Money baseRate) {
        this.baseRate = baseRate;
    }


    /**
     * Gets the costPerUnit value for this ProposalLineItem.
     * 
     * @return costPerUnit   * The amount of money to spend per impression or click in proposal
     * currency.
     *                 It supports precision of 2 decimal places in terms
     * of the fundamental currency
     *                 unit, so the {@link Money#microAmount} must be multiples
     * of 10000. This attribute is
     *                 required.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getCostPerUnit() {
        return costPerUnit;
    }


    /**
     * Sets the costPerUnit value for this ProposalLineItem.
     * 
     * @param costPerUnit   * The amount of money to spend per impression or click in proposal
     * currency.
     *                 It supports precision of 2 decimal places in terms
     * of the fundamental currency
     *                 unit, so the {@link Money#microAmount} must be multiples
     * of 10000. This attribute is
     *                 required.
     */
    public void setCostPerUnit(com.google.api.ads.dfp.axis.v201405.Money costPerUnit) {
        this.costPerUnit = costPerUnit;
    }


    /**
     * Gets the cost value for this ProposalLineItem.
     * 
     * @return cost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision
     *                 of 2 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#microAmount} must be multiples of 10000.
     * This attribute is
     *                 required.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProposalLineItem.
     * 
     * @param cost   * The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision
     *                 of 2 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#microAmount} must be multiples of 10000.
     * This attribute is
     *                 required.
     */
    public void setCost(com.google.api.ads.dfp.axis.v201405.Money cost) {
        this.cost = cost;
    }


    /**
     * Gets the deliveryIndicator value for this ProposalLineItem.
     * 
     * @return deliveryIndicator   * Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This attribute is readonly and is populated by Google.
     * This will be {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public com.google.api.ads.dfp.axis.v201405.DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }


    /**
     * Sets the deliveryIndicator value for this ProposalLineItem.
     * 
     * @param deliveryIndicator   * Indicates how well the line item generated from this proposal
     * line item has been performing.
     *                 This attribute is readonly and is populated by Google.
     * This will be {@code null} if the
     *                 delivery indicator information is not available due
     * to one of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not delivering.</li>
     *                 <li>The line item has an unlimited goal or cap.</li>
     * <li>The line item has a percentage based goal or cap.</li>
     *                 </ol>
     */
    public void setDeliveryIndicator(com.google.api.ads.dfp.axis.v201405.DeliveryIndicator deliveryIndicator) {
        this.deliveryIndicator = deliveryIndicator;
    }


    /**
     * Gets the deliveryData value for this ProposalLineItem.
     * 
     * @return deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This attribute is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot be computed due to
     *                 one of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     */
    public com.google.api.ads.dfp.axis.v201405.DeliveryData getDeliveryData() {
        return deliveryData;
    }


    /**
     * Sets the deliveryData value for this ProposalLineItem.
     * 
     * @param deliveryData   * Delivery data provides the number of clicks or impressions
     * delivered for the {@link LineItem}
     *                 generated from this proposal line item in the last
     * 7 days. This attribute is readonly and is
     *                 populated by Google. This will be {@code null} if
     * the delivery data cannot be computed due to
     *                 one of the following reasons:
     *                 <ol>
     *                 <li>The proposal line item has not pushed to DFP.</li>
     * <li>The line item is not deliverable.</li>
     *                 <li>The line item has completed delivering more than
     * 7 days ago.</li>
     *                 <li>The line item has an absolute-based goal. {@link
     * ProposalLineItem#deliveryIndicator} should
     *                 be used to track its progress in this case.</li>
     */
    public void setDeliveryData(com.google.api.ads.dfp.axis.v201405.DeliveryData deliveryData) {
        this.deliveryData = deliveryData;
    }


    /**
     * Gets the computedStatus value for this ProposalLineItem.
     * 
     * @return computedStatus   * The status of the {@link LineItem} generated from this proposal
     * line item. This attribute is
     *                 readonly. This will be {@code null} if the proposal
     * line item has not pushed to DFP.
     */
    public com.google.api.ads.dfp.axis.v201405.ComputedStatus getComputedStatus() {
        return computedStatus;
    }


    /**
     * Sets the computedStatus value for this ProposalLineItem.
     * 
     * @param computedStatus   * The status of the {@link LineItem} generated from this proposal
     * line item. This attribute is
     *                 readonly. This will be {@code null} if the proposal
     * line item has not pushed to DFP.
     */
    public void setComputedStatus(com.google.api.ads.dfp.axis.v201405.ComputedStatus computedStatus) {
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
     */
    public com.google.api.ads.dfp.axis.v201405.BillingCap getBillingCap() {
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
     */
    public void setBillingCap(com.google.api.ads.dfp.axis.v201405.BillingCap billingCap) {
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
     */
    public com.google.api.ads.dfp.axis.v201405.BillingSchedule getBillingSchedule() {
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
     */
    public void setBillingSchedule(com.google.api.ads.dfp.axis.v201405.BillingSchedule billingSchedule) {
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
     */
    public com.google.api.ads.dfp.axis.v201405.BillingSource getBillingSource() {
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
     */
    public void setBillingSource(com.google.api.ads.dfp.axis.v201405.BillingSource billingSource) {
        this.billingSource = billingSource;
    }


    /**
     * Gets the lastModifiedDateTime value for this ProposalLineItem.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 This attribute is readonly and is assigned by Google
     * when a {@code ProposalLineItem} is
     *                 updated.
     */
    public com.google.api.ads.dfp.axis.v201405.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this ProposalLineItem.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code ProposalLineItem} was last modified.
     * 
     *                 This attribute is readonly and is assigned by Google
     * when a {@code ProposalLineItem} is
     *                 updated.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201405.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the useThirdPartyAdServerFromProposal value for this ProposalLineItem.
     * 
     * @return useThirdPartyAdServerFromProposal   * Whether to use the corresponding proposal's third party ad
     * server.
     *                 If this field is true, {@code thirdPartyAdServerId}
     * and {@code customThirdPartyAdServerName}
     *                 will be ignored.
     */
    public java.lang.Boolean getUseThirdPartyAdServerFromProposal() {
        return useThirdPartyAdServerFromProposal;
    }


    /**
     * Sets the useThirdPartyAdServerFromProposal value for this ProposalLineItem.
     * 
     * @param useThirdPartyAdServerFromProposal   * Whether to use the corresponding proposal's third party ad
     * server.
     *                 If this field is true, {@code thirdPartyAdServerId}
     * and {@code customThirdPartyAdServerName}
     *                 will be ignored.
     */
    public void setUseThirdPartyAdServerFromProposal(java.lang.Boolean useThirdPartyAdServerFromProposal) {
        this.useThirdPartyAdServerFromProposal = useThirdPartyAdServerFromProposal;
    }


    /**
     * Gets the thirdPartyAdServerId value for this ProposalLineItem.
     * 
     * @return thirdPartyAdServerId   * A predefined third party ad server, which will be used to fill
     * in reconciliation.
     *                 All predefined third party ad servers can be found
     * in the {@code Third_Party_Company}
     *                 PQL table.
     *                 If actual third party ad server is not in the predefined
     * list, this field is set to 0, and
     *                 actual third party ad server name is set in {@code
     * customThirdPartyAdServerName}.
     */
    public java.lang.Integer getThirdPartyAdServerId() {
        return thirdPartyAdServerId;
    }


    /**
     * Sets the thirdPartyAdServerId value for this ProposalLineItem.
     * 
     * @param thirdPartyAdServerId   * A predefined third party ad server, which will be used to fill
     * in reconciliation.
     *                 All predefined third party ad servers can be found
     * in the {@code Third_Party_Company}
     *                 PQL table.
     *                 If actual third party ad server is not in the predefined
     * list, this field is set to 0, and
     *                 actual third party ad server name is set in {@code
     * customThirdPartyAdServerName}.
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
     * is set here.
     *                 When {@code thirdPartyAdServerId} is not 0, this field
     * is ignored.
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
     * is set here.
     *                 When {@code thirdPartyAdServerId} is not 0, this field
     * is ignored.
     */
    public void setCustomThirdPartyAdServerName(java.lang.String customThirdPartyAdServerName) {
        this.customThirdPartyAdServerName = customThirdPartyAdServerName;
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
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.costAdjustment==null && other.getCostAdjustment()==null) || 
             (this.costAdjustment!=null &&
              this.costAdjustment.equals(other.getCostAdjustment()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.unitsBought==null && other.getUnitsBought()==null) || 
             (this.unitsBought!=null &&
              this.unitsBought.equals(other.getUnitsBought()))) &&
            ((this.unitsBoughtBuffer==null && other.getUnitsBoughtBuffer()==null) || 
             (this.unitsBoughtBuffer!=null &&
              this.unitsBoughtBuffer.equals(other.getUnitsBoughtBuffer()))) &&
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
            ((this.premiums==null && other.getPremiums()==null) || 
             (this.premiums!=null &&
              java.util.Arrays.equals(this.premiums, other.getPremiums()))) &&
            ((this.isSold==null && other.getIsSold()==null) || 
             (this.isSold!=null &&
              this.isSold.equals(other.getIsSold()))) &&
            ((this.baseRate==null && other.getBaseRate()==null) || 
             (this.baseRate!=null &&
              this.baseRate.equals(other.getBaseRate()))) &&
            ((this.costPerUnit==null && other.getCostPerUnit()==null) || 
             (this.costPerUnit!=null &&
              this.costPerUnit.equals(other.getCostPerUnit()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
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
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.useThirdPartyAdServerFromProposal==null && other.getUseThirdPartyAdServerFromProposal()==null) || 
             (this.useThirdPartyAdServerFromProposal!=null &&
              this.useThirdPartyAdServerFromProposal.equals(other.getUseThirdPartyAdServerFromProposal()))) &&
            ((this.thirdPartyAdServerId==null && other.getThirdPartyAdServerId()==null) || 
             (this.thirdPartyAdServerId!=null &&
              this.thirdPartyAdServerId.equals(other.getThirdPartyAdServerId()))) &&
            ((this.customThirdPartyAdServerName==null && other.getCustomThirdPartyAdServerName()==null) || 
             (this.customThirdPartyAdServerName!=null &&
              this.customThirdPartyAdServerName.equals(other.getCustomThirdPartyAdServerName())));
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
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCostAdjustment() != null) {
            _hashCode += getCostAdjustment().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getUnitsBought() != null) {
            _hashCode += getUnitsBought().hashCode();
        }
        if (getUnitsBoughtBuffer() != null) {
            _hashCode += getUnitsBoughtBuffer().hashCode();
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
        if (getCostPerUnit() != null) {
            _hashCode += getCostPerUnit().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
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
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ProposalLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "costAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CostAdjustment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "unitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBoughtBuffer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "unitsBoughtBuffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "dfpLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lineItemPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "rateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "RateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiums");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "premiums"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ProposalLineItemPremium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "isSold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "baseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "computedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "billingCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "BillingCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "BillingSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "billingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "BillingSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useThirdPartyAdServerFromProposal");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "useThirdPartyAdServerFromProposal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAdServerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "thirdPartyAdServerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customThirdPartyAdServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "customThirdPartyAdServerName"));
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
