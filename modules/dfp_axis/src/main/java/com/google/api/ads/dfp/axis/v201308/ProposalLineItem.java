/**
 * ProposalLineItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


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
    private com.google.api.ads.dfp.axis.v201308.DateTime startDateTime;

    /* The date and time at which the line item associated with the
     * {@code ProposalLineItem} stops beening served. This attribute is required
     * and
     *                 must be after the {@link #startDateTime}. */
    private com.google.api.ads.dfp.axis.v201308.DateTime endDateTime;

    /* Provides any additional notes that may annotate the {@code
     * ProposalLineItem}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}. */
    private com.google.api.ads.dfp.axis.v201308.CostAdjustment costAdjustment;

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
    private com.google.api.ads.dfp.axis.v201308.DeliveryRateType deliveryRateType;

    /* The strategy for serving roadblocked creatives, i.e. instances
     * where
     *                 multiple creatives must be served together on a single
     * web page. This attribute
     *                 is optional during creation and defaults to the
     *                 {@link Product#roadblockingType product's roadblocking
     * type},
     *                 or {@link RoadblockingType#ONLY_ONE} if the product
     * does not have one. */
    private com.google.api.ads.dfp.axis.v201308.RoadblockingType roadblockingType;

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
    private com.google.api.ads.dfp.axis.v201308.CompanionDeliveryOption companionDeliveryOption;

    /* The strategy used for displaying multiple {@link Creative}
     * objects that are
     *                 associated with the {@code ProposalLineItem}. This
     * attribute is optional and
     *                 default value is {@link CreativeRotationType#OPTIMIZED}. */
    private com.google.api.ads.dfp.axis.v201308.CreativeRotationType creativeRotationType;

    /* The set of frequency capping units for this {@code ProposalLineItem}.
     * This
     *                 attribute is optional during creation and defaults
     * to the
     *                 {@link Product#frequencyCaps product's frequency caps}
     * if
     *                 {@link Product#allowFrequencyCapsCustomization} is
     * {@code false}. */
    private com.google.api.ads.dfp.axis.v201308.FrequencyCap[] frequencyCaps;

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
    private com.google.api.ads.dfp.axis.v201308.LineItemType lineItemType;

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
    private com.google.api.ads.dfp.axis.v201308.CostType costType;

    /* Details about the creatives that are expected to serve through
     * the
     *                 {@code ProposalLineItem}. This attribute is optional
     * during creation and defaults to the
     *                 {@link Product#creativePlaceholders product's creative
     * placeholders}. */
    private com.google.api.ads.dfp.axis.v201308.CreativePlaceholder[] creativePlaceholders;

    /* Contains the targeting criteria for the {@code ProposalLineItem}.
     * This attribute is
     *                 optional during creation and defaults to the {@link
     * Product#targeting product's targeting}. */
    private com.google.api.ads.dfp.axis.v201308.Targeting targeting;

    /* The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201308.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google. */
    private com.google.api.ads.dfp.axis.v201308.AppliedLabel[] effectiveAppliedLabels;

    /* The premiums triggered by this {@code ProposalLineItem} and
     * their statuses.
     *                 For those tiggered premiums whose statues are not
     * specified, the default status
     *                 is {@link ProposalLineItemPremiumStatus#INCLUDED}. */
    private com.google.api.ads.dfp.axis.v201308.ProposalLineItemPremium[] premiums;

    /* The base rate of the {@code ProposalLineItem} in proposal currency.
     * This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201308.Money baseRate;

    /* The amount of money to spend per impression or click in proposal
     * currency.
     *                 It supports precision of 2 decimal places in terms
     * of the fundamental currency
     *                 unit, so the {@link Money#microAmount} must be multiples
     * of 10000. This attribute is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201308.Money costPerUnit;

    /* The cost of the {@code ProposalLineItem} in proposal currency.
     * It supports precision
     *                 of 2 decimal places in terms of the fundamental currency
     * unit, so the
     *                 {@link Money#microAmount} must be multiples of 10000.
     * This attribute is
     *                 required. */
    private com.google.api.ads.dfp.axis.v201308.Money cost;

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
    private com.google.api.ads.dfp.axis.v201308.DeliveryIndicator deliveryIndicator;

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
    private com.google.api.ads.dfp.axis.v201308.DeliveryData deliveryData;

    /* The status of the {@link LineItem} generated from this proposal
     * line item. This attribute is
     *                 readonly. This will be {@code null} if the proposal
     * line item has not pushed to DFP. */
    private com.google.api.ads.dfp.axis.v201308.ComputedStatus computedStatus;

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
    private com.google.api.ads.dfp.axis.v201308.BillingCap billingCap;

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
    private com.google.api.ads.dfp.axis.v201308.BillingSchedule billingSchedule;

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
    private com.google.api.ads.dfp.axis.v201308.BillingSource billingSource;

    public ProposalLineItem() {
    }

    public ProposalLineItem(
           java.lang.Long id,
           java.lang.Long proposalId,
           java.lang.Long rateCardId,
           java.lang.Long productId,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201308.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201308.DateTime endDateTime,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201308.CostAdjustment costAdjustment,
           java.lang.Boolean isArchived,
           java.lang.Long unitsBought,
           java.lang.Integer unitsBoughtBuffer,
           com.google.api.ads.dfp.axis.v201308.DeliveryRateType deliveryRateType,
           com.google.api.ads.dfp.axis.v201308.RoadblockingType roadblockingType,
           com.google.api.ads.dfp.axis.v201308.CompanionDeliveryOption companionDeliveryOption,
           com.google.api.ads.dfp.axis.v201308.CreativeRotationType creativeRotationType,
           com.google.api.ads.dfp.axis.v201308.FrequencyCap[] frequencyCaps,
           com.google.api.ads.dfp.axis.v201308.LineItemType lineItemType,
           java.lang.Integer lineItemPriority,
           com.google.api.ads.dfp.axis.v201308.CostType costType,
           com.google.api.ads.dfp.axis.v201308.CreativePlaceholder[] creativePlaceholders,
           com.google.api.ads.dfp.axis.v201308.Targeting targeting,
           com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201308.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201308.AppliedLabel[] effectiveAppliedLabels,
           com.google.api.ads.dfp.axis.v201308.ProposalLineItemPremium[] premiums,
           com.google.api.ads.dfp.axis.v201308.Money baseRate,
           com.google.api.ads.dfp.axis.v201308.Money costPerUnit,
           com.google.api.ads.dfp.axis.v201308.Money cost,
           com.google.api.ads.dfp.axis.v201308.DeliveryIndicator deliveryIndicator,
           com.google.api.ads.dfp.axis.v201308.DeliveryData deliveryData,
           com.google.api.ads.dfp.axis.v201308.ComputedStatus computedStatus,
           com.google.api.ads.dfp.axis.v201308.BillingCap billingCap,
           com.google.api.ads.dfp.axis.v201308.BillingSchedule billingSchedule,
           com.google.api.ads.dfp.axis.v201308.BillingSource billingSource) {
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
           this.lineItemType = lineItemType;
           this.lineItemPriority = lineItemPriority;
           this.costType = costType;
           this.creativePlaceholders = creativePlaceholders;
           this.targeting = targeting;
           this.customFieldValues = customFieldValues;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.premiums = premiums;
           this.baseRate = baseRate;
           this.costPerUnit = costPerUnit;
           this.cost = cost;
           this.deliveryIndicator = deliveryIndicator;
           this.deliveryData = deliveryData;
           this.computedStatus = computedStatus;
           this.billingCap = billingCap;
           this.billingSchedule = billingSchedule;
           this.billingSource = billingSource;
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
    public com.google.api.ads.dfp.axis.v201308.DateTime getStartDateTime() {
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
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201308.DateTime startDateTime) {
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
    public com.google.api.ads.dfp.axis.v201308.DateTime getEndDateTime() {
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
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201308.DateTime endDateTime) {
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
    public com.google.api.ads.dfp.axis.v201308.CostAdjustment getCostAdjustment() {
        return costAdjustment;
    }


    /**
     * Sets the costAdjustment value for this ProposalLineItem.
     * 
     * @param costAdjustment   * The cost adjustment applied to the {@code ProposalLineItem}.
     * This attribute is
     *                 optional and default value is {@link CostAdjustment#NONE}.
     */
    public void setCostAdjustment(com.google.api.ads.dfp.axis.v201308.CostAdjustment costAdjustment) {
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
    public com.google.api.ads.dfp.axis.v201308.DeliveryRateType getDeliveryRateType() {
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
    public void setDeliveryRateType(com.google.api.ads.dfp.axis.v201308.DeliveryRateType deliveryRateType) {
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
    public com.google.api.ads.dfp.axis.v201308.RoadblockingType getRoadblockingType() {
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
    public void setRoadblockingType(com.google.api.ads.dfp.axis.v201308.RoadblockingType roadblockingType) {
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
    public com.google.api.ads.dfp.axis.v201308.CompanionDeliveryOption getCompanionDeliveryOption() {
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
    public void setCompanionDeliveryOption(com.google.api.ads.dfp.axis.v201308.CompanionDeliveryOption companionDeliveryOption) {
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
    public com.google.api.ads.dfp.axis.v201308.CreativeRotationType getCreativeRotationType() {
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
    public void setCreativeRotationType(com.google.api.ads.dfp.axis.v201308.CreativeRotationType creativeRotationType) {
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
    public com.google.api.ads.dfp.axis.v201308.FrequencyCap[] getFrequencyCaps() {
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
    public void setFrequencyCaps(com.google.api.ads.dfp.axis.v201308.FrequencyCap[] frequencyCaps) {
        this.frequencyCaps = frequencyCaps;
    }

    public com.google.api.ads.dfp.axis.v201308.FrequencyCap getFrequencyCaps(int i) {
        return this.frequencyCaps[i];
    }

    public void setFrequencyCaps(int i, com.google.api.ads.dfp.axis.v201308.FrequencyCap _value) {
        this.frequencyCaps[i] = _value;
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
    public com.google.api.ads.dfp.axis.v201308.LineItemType getLineItemType() {
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
    public void setLineItemType(com.google.api.ads.dfp.axis.v201308.LineItemType lineItemType) {
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
     * Gets the costType value for this ProposalLineItem.
     * 
     * @return costType   * The method used for billing the {@code ProposalLineItem}. This
     * attribute is
     *                 readonly.
     */
    public com.google.api.ads.dfp.axis.v201308.CostType getCostType() {
        return costType;
    }


    /**
     * Sets the costType value for this ProposalLineItem.
     * 
     * @param costType   * The method used for billing the {@code ProposalLineItem}. This
     * attribute is
     *                 readonly.
     */
    public void setCostType(com.google.api.ads.dfp.axis.v201308.CostType costType) {
        this.costType = costType;
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
    public com.google.api.ads.dfp.axis.v201308.CreativePlaceholder[] getCreativePlaceholders() {
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
    public void setCreativePlaceholders(com.google.api.ads.dfp.axis.v201308.CreativePlaceholder[] creativePlaceholders) {
        this.creativePlaceholders = creativePlaceholders;
    }

    public com.google.api.ads.dfp.axis.v201308.CreativePlaceholder getCreativePlaceholders(int i) {
        return this.creativePlaceholders[i];
    }

    public void setCreativePlaceholders(int i, com.google.api.ads.dfp.axis.v201308.CreativePlaceholder _value) {
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
    public com.google.api.ads.dfp.axis.v201308.Targeting getTargeting() {
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
    public void setTargeting(com.google.api.ads.dfp.axis.v201308.Targeting targeting) {
        this.targeting = targeting;
    }


    /**
     * Gets the customFieldValues value for this ProposalLineItem.
     * 
     * @return customFieldValues   * The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this ProposalLineItem.
     * 
     * @param customFieldValues   * The values of the custom fields associated with the {@code
     * ProposalLineItem}.
     *                 This attribute is optional.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201308.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this ProposalLineItem.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201308.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this ProposalLineItem.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code ProposalLineItem}.
     * This attribute is optional.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201308.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201308.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201308.AppliedLabel _value) {
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
    public com.google.api.ads.dfp.axis.v201308.AppliedLabel[] getEffectiveAppliedLabels() {
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
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201308.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201308.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201308.AppliedLabel _value) {
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
    public com.google.api.ads.dfp.axis.v201308.ProposalLineItemPremium[] getPremiums() {
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
    public void setPremiums(com.google.api.ads.dfp.axis.v201308.ProposalLineItemPremium[] premiums) {
        this.premiums = premiums;
    }

    public com.google.api.ads.dfp.axis.v201308.ProposalLineItemPremium getPremiums(int i) {
        return this.premiums[i];
    }

    public void setPremiums(int i, com.google.api.ads.dfp.axis.v201308.ProposalLineItemPremium _value) {
        this.premiums[i] = _value;
    }


    /**
     * Gets the baseRate value for this ProposalLineItem.
     * 
     * @return baseRate   * The base rate of the {@code ProposalLineItem} in proposal currency.
     * This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201308.Money getBaseRate() {
        return baseRate;
    }


    /**
     * Sets the baseRate value for this ProposalLineItem.
     * 
     * @param baseRate   * The base rate of the {@code ProposalLineItem} in proposal currency.
     * This attribute is readonly.
     */
    public void setBaseRate(com.google.api.ads.dfp.axis.v201308.Money baseRate) {
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
    public com.google.api.ads.dfp.axis.v201308.Money getCostPerUnit() {
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
    public void setCostPerUnit(com.google.api.ads.dfp.axis.v201308.Money costPerUnit) {
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
    public com.google.api.ads.dfp.axis.v201308.Money getCost() {
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
    public void setCost(com.google.api.ads.dfp.axis.v201308.Money cost) {
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
    public com.google.api.ads.dfp.axis.v201308.DeliveryIndicator getDeliveryIndicator() {
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
    public void setDeliveryIndicator(com.google.api.ads.dfp.axis.v201308.DeliveryIndicator deliveryIndicator) {
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
    public com.google.api.ads.dfp.axis.v201308.DeliveryData getDeliveryData() {
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
    public void setDeliveryData(com.google.api.ads.dfp.axis.v201308.DeliveryData deliveryData) {
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
    public com.google.api.ads.dfp.axis.v201308.ComputedStatus getComputedStatus() {
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
    public void setComputedStatus(com.google.api.ads.dfp.axis.v201308.ComputedStatus computedStatus) {
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
    public com.google.api.ads.dfp.axis.v201308.BillingCap getBillingCap() {
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
    public void setBillingCap(com.google.api.ads.dfp.axis.v201308.BillingCap billingCap) {
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
    public com.google.api.ads.dfp.axis.v201308.BillingSchedule getBillingSchedule() {
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
    public void setBillingSchedule(com.google.api.ads.dfp.axis.v201308.BillingSchedule billingSchedule) {
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
    public com.google.api.ads.dfp.axis.v201308.BillingSource getBillingSource() {
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
    public void setBillingSource(com.google.api.ads.dfp.axis.v201308.BillingSource billingSource) {
        this.billingSource = billingSource;
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
            ((this.lineItemType==null && other.getLineItemType()==null) || 
             (this.lineItemType!=null &&
              this.lineItemType.equals(other.getLineItemType()))) &&
            ((this.lineItemPriority==null && other.getLineItemPriority()==null) || 
             (this.lineItemPriority!=null &&
              this.lineItemPriority.equals(other.getLineItemPriority()))) &&
            ((this.costType==null && other.getCostType()==null) || 
             (this.costType!=null &&
              this.costType.equals(other.getCostType()))) &&
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
              this.billingSource.equals(other.getBillingSource())));
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
        if (getLineItemType() != null) {
            _hashCode += getLineItemType().hashCode();
        }
        if (getLineItemPriority() != null) {
            _hashCode += getLineItemPriority().hashCode();
        }
        if (getCostType() != null) {
            _hashCode += getCostType().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProposalLineItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ProposalLineItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "proposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "rateCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "costAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CostAdjustment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "unitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsBoughtBuffer");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "unitsBoughtBuffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "deliveryRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DeliveryRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roadblockingType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "roadblockingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "RoadblockingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companionDeliveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "companionDeliveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CompanionDeliveryOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeRotationType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "creativeRotationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CreativeRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequencyCaps");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "frequencyCaps"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "FrequencyCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "LineItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "costType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativePlaceholders");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "creativePlaceholders"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CreativePlaceholder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targeting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "targeting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Targeting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premiums");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "premiums"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ProposalLineItemPremium"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "baseRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "costPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "deliveryIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DeliveryIndicator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryData");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "deliveryData"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "DeliveryData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "computedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ComputedStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "billingCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BillingCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BillingSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "billingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BillingSource"));
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
