/**
 * Proposal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201306;


/**
 * A {@code Proposal} represents an agreement between an interactive
 * advertising seller and a buyer that specifies the details of an
 *             advertising campaign.
 */
public class Proposal  implements java.io.Serializable {
    /* The unique ID of the {@code Proposal}. This attribute is readonly
     * and is
     *                 assigned by Google. */
    private java.lang.Long id;

    /* The name of the {@code Proposal}. This value is required to
     * create a
     *                 proposal and has a maximum length of 255 characters.
     * This attribute is
     *                 copied to {@link Order#name} when the proposal turns
     * into an order. */
    private java.lang.String name;

    /* The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} are eligible to begin serving.
     * This attribute is readonly and
     *                 is derived from the proposal line item of the proposal
     * which has the earliest
     *                 {@link ProposalLineItem#startDateTime}. This attribute
     * will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have a start time. */
    private com.google.api.ads.dfp.axis.v201306.DateTime startDateTime;

    /* The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} stop being served. This attribute
     * is readonly and
     *                 is derived from the proposal line item of the proposal
     * which has the
     *                 latest {@link ProposalLineItem#endDateTime}. This
     * attribute will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have an end time. */
    private com.google.api.ads.dfp.axis.v201306.DateTime endDateTime;

    /* The status of the {@code Proposal}. This attribute is readonly. */
    private com.google.api.ads.dfp.axis.v201306.ProposalStatus status;

    /* The archival status of the {@code Proposal}. This attribute
     * is readonly. */
    private java.lang.Boolean isArchived;

    /* The advertiser, to which this {@code Proposal} belongs, and
     * a set of
     *                 {@link Contact} objects associated with the advertiser.
     * The
     *                 {@link ProposalCompanyAssociation#type} of this attribute
     * should be
     *                 {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is
     *                 required when the proposal turns into an order, and
     * its
     *                 {@link ProposalCompanyAssociation#companyId} will
     * be copied to
     *                 {@link Order#advertiserId}.
     *                 This attribute becomes readonly once the {@code Proposal}
     * has been pushed. */
    private com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation advertiser;

    /* List of agencies and the set of {@link Contact} objects associated
     * with each agency.
     *                 This attribute is optional. A {@code Proposal} only
     * has at most one
     *                 {@link Company} with {@link ProposalCompanyAssociationType#PRIMARY_AGENCY}
     * type,
     *                 but a {@link Company} can appear more than once with
     * different
     *                 {@link ProposalCompanyAssociationType} values. If
     * primary
     *                 agency exists, its {@link ProposalCompanyAssociation#companyId}
     * will be copied to
     *                 {@link Order#agencyId} when the proposal turns into
     * an order. */
    private com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation[] agencies;

    /* The probability to close this {@code Proposal}. This percentage
     * value is in
     *                 terms of millipercent, and should be multiples of
     * 10000 with the range from 0 to
     *                 100000. This attribute is 0 by default and will be
     * used to calculate the revenue
     *                 in reporting. */
    private java.lang.Integer probabilityToClose;

    /* The billing cap of this {@code Proposal}. This attribute is
     * optional and
     *                 default value is {@link BillingCap#CAPPED_CUMULATIVE}.
     * Either this attribute
     *                 or {@link #billingSchedule} will be used, according
     * to the {@link #billingSource}. */
    private com.google.api.ads.dfp.axis.v201306.BillingCap billingCap;

    /* The billing schedule of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSchedule#PRORATED}.
     * Either this attribute
     *                 or {@link #billingCap} will be used, according to
     * the {@link #billingSource}. */
    private com.google.api.ads.dfp.axis.v201306.BillingSchedule billingSchedule;

    /* The billing source of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSource#THIRD_PARTY_VOLUME}.
     * If the value is
     *                 {@link BillingSource#CONTRACTED}, the {@link #billingSchedule}
     * will be used for
     *                 billing, otherwise the {@link billingCap} will be
     * used. */
    private com.google.api.ads.dfp.axis.v201306.BillingSource billingSource;

    /* User defined purchase order number for the {@code Proposal}.
     * This attribute is
     *                 optional and has a maximum length of 63 characters.
     * It is copied to
     *                 {@link Order#poNumber} when the proposal turns into
     * an order. */
    private java.lang.String poNumber;

    /* Provides any additional notes that may annotate the {@code
     * Proposal}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters. */
    private java.lang.String notes;

    /* The total budget allocated for all the proposal line items
     * belonging to the
     *                 {@code Proposal}. It supports precision of 2 decimal
     * places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly. */
    private com.google.api.ads.dfp.axis.v201306.Money budget;

    /* The primary salesperson who brokered the transaction with the
     * {@link #advertiser}.
     *                 This attribute is required when the proposal turns
     * into an order. */
    private com.google.api.ads.dfp.axis.v201306.SalespersonSplit primarySalesperson;

    /* List of secondary salespeople who are responsible for the sales
     * of
     *                 the {@code Proposal} besides primary salesperson.
     *                 This attribute is optional. A proposal could have
     * 8 secondary salespeople at most,
     *                 but must also have a {@link #primarySalesperson} if
     * any secondary salesperson exists. */
    private com.google.api.ads.dfp.axis.v201306.SalespersonSplit[] secondarySalespeople;

    /* List of unique IDs of {@link User} objects who are the sales
     * planners of
     *                 the {@code Proposal}. This attribute is optional.
     * A proposal could have
     *                 8 sales planners at most. */
    private long[] salesPlannerIds;

    /* The unique ID of the {@link User} who is primary trafficker
     * and is responsible for
     *                 trafficking the {@code Proposal}. This attribute is
     * required when the proposal
     *                 turns into an order, and will be copied to {@link
     * Order#primaryTraffickerId} . */
    private java.lang.Long primaryTraffickerId;

    /* List of unique IDs of {@link User} objects who are responsible
     * for trafficking
     *                 the {@code Proposal} besides the primary trafficker.
     * This attribute is optional.
     *                 A proposal could have 8 secondary traffickers at most,
     * but must also have a primary
     *                 trafficker if any secondary trafficker exists. */
    private long[] secondaryTraffickerIds;

    /* The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional. */
    private long[] appliedTeamIds;

    /* The values of the custom fields associated with the {@code
     * Proposal}.
     *                 This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional. */
    private com.google.api.ads.dfp.axis.v201306.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google. */
    private com.google.api.ads.dfp.axis.v201306.AppliedLabel[] effectiveAppliedLabels;

    /* The discount applied to the {@code Proposal} according to the
     * {@link #advertiser}.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0. */
    private java.lang.Long advertiserDiscount;

    /* The proposal discount, which will be applied to all
     *                 {@link ProposalLineItem} objects in the {@code Proposal}.
     * The percentage value is in terms of millipercent, and must be multiples
     * of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0. */
    private java.lang.Long proposalDiscount;

    /* The additional adjustment, which is an absolute value applied
     * on final cost of
     *                 the {@code Proposal}. It could either be a positive
     * number (surcharge) or
     *                 negative one (discount). It supports precision of
     * 2 decimal places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly. */
    private com.google.api.ads.dfp.axis.v201306.Money additionalAdjustment;

    /* The exchange rate from the {@link #currencyCode} to the
     *                 {@link Network#currencyCode network's currency}. The
     * value is stored as the exchange rate times
     *                 10,000,000,000 truncated to a long. This attribute
     * is readonly and is assigned by Google when
     *                 first created or updated with {@link #refreshExchangeRate}
     * set to {@code true}. This attribute
     *                 is ignored if the feature is not enabled. */
    private java.lang.Long exchangeRate;

    /* Set this field to {@code true} to update the {@link #exchangeRate}
     * to the latest exchange rate
     *                 when updating the proposal. This attribute is optional
     * and defaults to {@code false}. This
     *                 attribute is ignored if the feature is not enabled. */
    private java.lang.Boolean refreshExchangeRate;

    /* The commission for the primary agency of the {@code Proposal}.
     * The percentage value is in terms of millipercent, and must be multiples
     * of 100
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0. */
    private java.lang.Long agencyCommission;

    /* The value added tax (VAT) applied on final cost of the {@code
     * Proposal}.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 100
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0. */
    private java.lang.Long valueAddedTax;

    /* List of IDs for the {@link WorkflowAction workflow actions}
     * that current active user can
     *                 approve or reject. This attribute is readonly and
     * is assigned by Google. */
    private long[] approvalWorkflowActionIds;

    /* The approval status of the {@code Proposal} for the active
     * user or {@code null} if the active
     *                 user has no action needed. This attribute is readonly
     * and is assigned by Google. */
    private com.google.api.ads.dfp.axis.v201306.ProposalApprovalStatus approvalStatus;

    public Proposal() {
    }

    public Proposal(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.dfp.axis.v201306.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201306.DateTime endDateTime,
           com.google.api.ads.dfp.axis.v201306.ProposalStatus status,
           java.lang.Boolean isArchived,
           com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation advertiser,
           com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation[] agencies,
           java.lang.Integer probabilityToClose,
           com.google.api.ads.dfp.axis.v201306.BillingCap billingCap,
           com.google.api.ads.dfp.axis.v201306.BillingSchedule billingSchedule,
           com.google.api.ads.dfp.axis.v201306.BillingSource billingSource,
           java.lang.String poNumber,
           java.lang.String notes,
           com.google.api.ads.dfp.axis.v201306.Money budget,
           com.google.api.ads.dfp.axis.v201306.SalespersonSplit primarySalesperson,
           com.google.api.ads.dfp.axis.v201306.SalespersonSplit[] secondarySalespeople,
           long[] salesPlannerIds,
           java.lang.Long primaryTraffickerId,
           long[] secondaryTraffickerIds,
           long[] appliedTeamIds,
           com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.dfp.axis.v201306.AppliedLabel[] appliedLabels,
           com.google.api.ads.dfp.axis.v201306.AppliedLabel[] effectiveAppliedLabels,
           java.lang.Long advertiserDiscount,
           java.lang.Long proposalDiscount,
           com.google.api.ads.dfp.axis.v201306.Money additionalAdjustment,
           java.lang.Long exchangeRate,
           java.lang.Boolean refreshExchangeRate,
           java.lang.Long agencyCommission,
           java.lang.Long valueAddedTax,
           long[] approvalWorkflowActionIds,
           com.google.api.ads.dfp.axis.v201306.ProposalApprovalStatus approvalStatus) {
           this.id = id;
           this.name = name;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.status = status;
           this.isArchived = isArchived;
           this.advertiser = advertiser;
           this.agencies = agencies;
           this.probabilityToClose = probabilityToClose;
           this.billingCap = billingCap;
           this.billingSchedule = billingSchedule;
           this.billingSource = billingSource;
           this.poNumber = poNumber;
           this.notes = notes;
           this.budget = budget;
           this.primarySalesperson = primarySalesperson;
           this.secondarySalespeople = secondarySalespeople;
           this.salesPlannerIds = salesPlannerIds;
           this.primaryTraffickerId = primaryTraffickerId;
           this.secondaryTraffickerIds = secondaryTraffickerIds;
           this.appliedTeamIds = appliedTeamIds;
           this.customFieldValues = customFieldValues;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.advertiserDiscount = advertiserDiscount;
           this.proposalDiscount = proposalDiscount;
           this.additionalAdjustment = additionalAdjustment;
           this.exchangeRate = exchangeRate;
           this.refreshExchangeRate = refreshExchangeRate;
           this.agencyCommission = agencyCommission;
           this.valueAddedTax = valueAddedTax;
           this.approvalWorkflowActionIds = approvalWorkflowActionIds;
           this.approvalStatus = approvalStatus;
    }


    /**
     * Gets the id value for this Proposal.
     * 
     * @return id   * The unique ID of the {@code Proposal}. This attribute is readonly
     * and is
     *                 assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Proposal.
     * 
     * @param id   * The unique ID of the {@code Proposal}. This attribute is readonly
     * and is
     *                 assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Proposal.
     * 
     * @return name   * The name of the {@code Proposal}. This value is required to
     * create a
     *                 proposal and has a maximum length of 255 characters.
     * This attribute is
     *                 copied to {@link Order#name} when the proposal turns
     * into an order.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Proposal.
     * 
     * @param name   * The name of the {@code Proposal}. This value is required to
     * create a
     *                 proposal and has a maximum length of 255 characters.
     * This attribute is
     *                 copied to {@link Order#name} when the proposal turns
     * into an order.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDateTime value for this Proposal.
     * 
     * @return startDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} are eligible to begin serving.
     * This attribute is readonly and
     *                 is derived from the proposal line item of the proposal
     * which has the earliest
     *                 {@link ProposalLineItem#startDateTime}. This attribute
     * will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have a start time.
     */
    public com.google.api.ads.dfp.axis.v201306.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Proposal.
     * 
     * @param startDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} are eligible to begin serving.
     * This attribute is readonly and
     *                 is derived from the proposal line item of the proposal
     * which has the earliest
     *                 {@link ProposalLineItem#startDateTime}. This attribute
     * will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have a start time.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201306.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Proposal.
     * 
     * @return endDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} stop being served. This attribute
     * is readonly and
     *                 is derived from the proposal line item of the proposal
     * which has the
     *                 latest {@link ProposalLineItem#endDateTime}. This
     * attribute will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have an end time.
     */
    public com.google.api.ads.dfp.axis.v201306.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Proposal.
     * 
     * @param endDateTime   * The date and time at which the order and line items associated
     * with
     *                 the {@code Proposal} stop being served. This attribute
     * is readonly and
     *                 is derived from the proposal line item of the proposal
     * which has the
     *                 latest {@link ProposalLineItem#endDateTime}. This
     * attribute will be null,
     *                 if this proposal has no related line items, or none
     * of its line items have an end time.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201306.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the status value for this Proposal.
     * 
     * @return status   * The status of the {@code Proposal}. This attribute is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.ProposalStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Proposal.
     * 
     * @param status   * The status of the {@code Proposal}. This attribute is readonly.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201306.ProposalStatus status) {
        this.status = status;
    }


    /**
     * Gets the isArchived value for this Proposal.
     * 
     * @return isArchived   * The archival status of the {@code Proposal}. This attribute
     * is readonly.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Proposal.
     * 
     * @param isArchived   * The archival status of the {@code Proposal}. This attribute
     * is readonly.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the advertiser value for this Proposal.
     * 
     * @return advertiser   * The advertiser, to which this {@code Proposal} belongs, and
     * a set of
     *                 {@link Contact} objects associated with the advertiser.
     * The
     *                 {@link ProposalCompanyAssociation#type} of this attribute
     * should be
     *                 {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is
     *                 required when the proposal turns into an order, and
     * its
     *                 {@link ProposalCompanyAssociation#companyId} will
     * be copied to
     *                 {@link Order#advertiserId}.
     *                 This attribute becomes readonly once the {@code Proposal}
     * has been pushed.
     */
    public com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation getAdvertiser() {
        return advertiser;
    }


    /**
     * Sets the advertiser value for this Proposal.
     * 
     * @param advertiser   * The advertiser, to which this {@code Proposal} belongs, and
     * a set of
     *                 {@link Contact} objects associated with the advertiser.
     * The
     *                 {@link ProposalCompanyAssociation#type} of this attribute
     * should be
     *                 {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is
     *                 required when the proposal turns into an order, and
     * its
     *                 {@link ProposalCompanyAssociation#companyId} will
     * be copied to
     *                 {@link Order#advertiserId}.
     *                 This attribute becomes readonly once the {@code Proposal}
     * has been pushed.
     */
    public void setAdvertiser(com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation advertiser) {
        this.advertiser = advertiser;
    }


    /**
     * Gets the agencies value for this Proposal.
     * 
     * @return agencies   * List of agencies and the set of {@link Contact} objects associated
     * with each agency.
     *                 This attribute is optional. A {@code Proposal} only
     * has at most one
     *                 {@link Company} with {@link ProposalCompanyAssociationType#PRIMARY_AGENCY}
     * type,
     *                 but a {@link Company} can appear more than once with
     * different
     *                 {@link ProposalCompanyAssociationType} values. If
     * primary
     *                 agency exists, its {@link ProposalCompanyAssociation#companyId}
     * will be copied to
     *                 {@link Order#agencyId} when the proposal turns into
     * an order.
     */
    public com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation[] getAgencies() {
        return agencies;
    }


    /**
     * Sets the agencies value for this Proposal.
     * 
     * @param agencies   * List of agencies and the set of {@link Contact} objects associated
     * with each agency.
     *                 This attribute is optional. A {@code Proposal} only
     * has at most one
     *                 {@link Company} with {@link ProposalCompanyAssociationType#PRIMARY_AGENCY}
     * type,
     *                 but a {@link Company} can appear more than once with
     * different
     *                 {@link ProposalCompanyAssociationType} values. If
     * primary
     *                 agency exists, its {@link ProposalCompanyAssociation#companyId}
     * will be copied to
     *                 {@link Order#agencyId} when the proposal turns into
     * an order.
     */
    public void setAgencies(com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation[] agencies) {
        this.agencies = agencies;
    }

    public com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation getAgencies(int i) {
        return this.agencies[i];
    }

    public void setAgencies(int i, com.google.api.ads.dfp.axis.v201306.ProposalCompanyAssociation _value) {
        this.agencies[i] = _value;
    }


    /**
     * Gets the probabilityToClose value for this Proposal.
     * 
     * @return probabilityToClose   * The probability to close this {@code Proposal}. This percentage
     * value is in
     *                 terms of millipercent, and should be multiples of
     * 10000 with the range from 0 to
     *                 100000. This attribute is 0 by default and will be
     * used to calculate the revenue
     *                 in reporting.
     */
    public java.lang.Integer getProbabilityToClose() {
        return probabilityToClose;
    }


    /**
     * Sets the probabilityToClose value for this Proposal.
     * 
     * @param probabilityToClose   * The probability to close this {@code Proposal}. This percentage
     * value is in
     *                 terms of millipercent, and should be multiples of
     * 10000 with the range from 0 to
     *                 100000. This attribute is 0 by default and will be
     * used to calculate the revenue
     *                 in reporting.
     */
    public void setProbabilityToClose(java.lang.Integer probabilityToClose) {
        this.probabilityToClose = probabilityToClose;
    }


    /**
     * Gets the billingCap value for this Proposal.
     * 
     * @return billingCap   * The billing cap of this {@code Proposal}. This attribute is
     * optional and
     *                 default value is {@link BillingCap#CAPPED_CUMULATIVE}.
     * Either this attribute
     *                 or {@link #billingSchedule} will be used, according
     * to the {@link #billingSource}.
     */
    public com.google.api.ads.dfp.axis.v201306.BillingCap getBillingCap() {
        return billingCap;
    }


    /**
     * Sets the billingCap value for this Proposal.
     * 
     * @param billingCap   * The billing cap of this {@code Proposal}. This attribute is
     * optional and
     *                 default value is {@link BillingCap#CAPPED_CUMULATIVE}.
     * Either this attribute
     *                 or {@link #billingSchedule} will be used, according
     * to the {@link #billingSource}.
     */
    public void setBillingCap(com.google.api.ads.dfp.axis.v201306.BillingCap billingCap) {
        this.billingCap = billingCap;
    }


    /**
     * Gets the billingSchedule value for this Proposal.
     * 
     * @return billingSchedule   * The billing schedule of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSchedule#PRORATED}.
     * Either this attribute
     *                 or {@link #billingCap} will be used, according to
     * the {@link #billingSource}.
     */
    public com.google.api.ads.dfp.axis.v201306.BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this Proposal.
     * 
     * @param billingSchedule   * The billing schedule of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSchedule#PRORATED}.
     * Either this attribute
     *                 or {@link #billingCap} will be used, according to
     * the {@link #billingSource}.
     */
    public void setBillingSchedule(com.google.api.ads.dfp.axis.v201306.BillingSchedule billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the billingSource value for this Proposal.
     * 
     * @return billingSource   * The billing source of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSource#THIRD_PARTY_VOLUME}.
     * If the value is
     *                 {@link BillingSource#CONTRACTED}, the {@link #billingSchedule}
     * will be used for
     *                 billing, otherwise the {@link billingCap} will be
     * used.
     */
    public com.google.api.ads.dfp.axis.v201306.BillingSource getBillingSource() {
        return billingSource;
    }


    /**
     * Sets the billingSource value for this Proposal.
     * 
     * @param billingSource   * The billing source of this {@code Proposal}. This attribute
     * is optional and
     *                 default value is {@link BillingSource#THIRD_PARTY_VOLUME}.
     * If the value is
     *                 {@link BillingSource#CONTRACTED}, the {@link #billingSchedule}
     * will be used for
     *                 billing, otherwise the {@link billingCap} will be
     * used.
     */
    public void setBillingSource(com.google.api.ads.dfp.axis.v201306.BillingSource billingSource) {
        this.billingSource = billingSource;
    }


    /**
     * Gets the poNumber value for this Proposal.
     * 
     * @return poNumber   * User defined purchase order number for the {@code Proposal}.
     * This attribute is
     *                 optional and has a maximum length of 63 characters.
     * It is copied to
     *                 {@link Order#poNumber} when the proposal turns into
     * an order.
     */
    public java.lang.String getPoNumber() {
        return poNumber;
    }


    /**
     * Sets the poNumber value for this Proposal.
     * 
     * @param poNumber   * User defined purchase order number for the {@code Proposal}.
     * This attribute is
     *                 optional and has a maximum length of 63 characters.
     * It is copied to
     *                 {@link Order#poNumber} when the proposal turns into
     * an order.
     */
    public void setPoNumber(java.lang.String poNumber) {
        this.poNumber = poNumber;
    }


    /**
     * Gets the notes value for this Proposal.
     * 
     * @return notes   * Provides any additional notes that may annotate the {@code
     * Proposal}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Proposal.
     * 
     * @param notes   * Provides any additional notes that may annotate the {@code
     * Proposal}. This
     *                 attribute is optional and has a maximum length of
     * 65,535 characters.
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the budget value for this Proposal.
     * 
     * @return budget   * The total budget allocated for all the proposal line items
     * belonging to the
     *                 {@code Proposal}. It supports precision of 2 decimal
     * places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.Money getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this Proposal.
     * 
     * @param budget   * The total budget allocated for all the proposal line items
     * belonging to the
     *                 {@code Proposal}. It supports precision of 2 decimal
     * places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     */
    public void setBudget(com.google.api.ads.dfp.axis.v201306.Money budget) {
        this.budget = budget;
    }


    /**
     * Gets the primarySalesperson value for this Proposal.
     * 
     * @return primarySalesperson   * The primary salesperson who brokered the transaction with the
     * {@link #advertiser}.
     *                 This attribute is required when the proposal turns
     * into an order.
     */
    public com.google.api.ads.dfp.axis.v201306.SalespersonSplit getPrimarySalesperson() {
        return primarySalesperson;
    }


    /**
     * Sets the primarySalesperson value for this Proposal.
     * 
     * @param primarySalesperson   * The primary salesperson who brokered the transaction with the
     * {@link #advertiser}.
     *                 This attribute is required when the proposal turns
     * into an order.
     */
    public void setPrimarySalesperson(com.google.api.ads.dfp.axis.v201306.SalespersonSplit primarySalesperson) {
        this.primarySalesperson = primarySalesperson;
    }


    /**
     * Gets the secondarySalespeople value for this Proposal.
     * 
     * @return secondarySalespeople   * List of secondary salespeople who are responsible for the sales
     * of
     *                 the {@code Proposal} besides primary salesperson.
     *                 This attribute is optional. A proposal could have
     * 8 secondary salespeople at most,
     *                 but must also have a {@link #primarySalesperson} if
     * any secondary salesperson exists.
     */
    public com.google.api.ads.dfp.axis.v201306.SalespersonSplit[] getSecondarySalespeople() {
        return secondarySalespeople;
    }


    /**
     * Sets the secondarySalespeople value for this Proposal.
     * 
     * @param secondarySalespeople   * List of secondary salespeople who are responsible for the sales
     * of
     *                 the {@code Proposal} besides primary salesperson.
     *                 This attribute is optional. A proposal could have
     * 8 secondary salespeople at most,
     *                 but must also have a {@link #primarySalesperson} if
     * any secondary salesperson exists.
     */
    public void setSecondarySalespeople(com.google.api.ads.dfp.axis.v201306.SalespersonSplit[] secondarySalespeople) {
        this.secondarySalespeople = secondarySalespeople;
    }

    public com.google.api.ads.dfp.axis.v201306.SalespersonSplit getSecondarySalespeople(int i) {
        return this.secondarySalespeople[i];
    }

    public void setSecondarySalespeople(int i, com.google.api.ads.dfp.axis.v201306.SalespersonSplit _value) {
        this.secondarySalespeople[i] = _value;
    }


    /**
     * Gets the salesPlannerIds value for this Proposal.
     * 
     * @return salesPlannerIds   * List of unique IDs of {@link User} objects who are the sales
     * planners of
     *                 the {@code Proposal}. This attribute is optional.
     * A proposal could have
     *                 8 sales planners at most.
     */
    public long[] getSalesPlannerIds() {
        return salesPlannerIds;
    }


    /**
     * Sets the salesPlannerIds value for this Proposal.
     * 
     * @param salesPlannerIds   * List of unique IDs of {@link User} objects who are the sales
     * planners of
     *                 the {@code Proposal}. This attribute is optional.
     * A proposal could have
     *                 8 sales planners at most.
     */
    public void setSalesPlannerIds(long[] salesPlannerIds) {
        this.salesPlannerIds = salesPlannerIds;
    }

    public long getSalesPlannerIds(int i) {
        return this.salesPlannerIds[i];
    }

    public void setSalesPlannerIds(int i, long _value) {
        this.salesPlannerIds[i] = _value;
    }


    /**
     * Gets the primaryTraffickerId value for this Proposal.
     * 
     * @return primaryTraffickerId   * The unique ID of the {@link User} who is primary trafficker
     * and is responsible for
     *                 trafficking the {@code Proposal}. This attribute is
     * required when the proposal
     *                 turns into an order, and will be copied to {@link
     * Order#primaryTraffickerId} .
     */
    public java.lang.Long getPrimaryTraffickerId() {
        return primaryTraffickerId;
    }


    /**
     * Sets the primaryTraffickerId value for this Proposal.
     * 
     * @param primaryTraffickerId   * The unique ID of the {@link User} who is primary trafficker
     * and is responsible for
     *                 trafficking the {@code Proposal}. This attribute is
     * required when the proposal
     *                 turns into an order, and will be copied to {@link
     * Order#primaryTraffickerId} .
     */
    public void setPrimaryTraffickerId(java.lang.Long primaryTraffickerId) {
        this.primaryTraffickerId = primaryTraffickerId;
    }


    /**
     * Gets the secondaryTraffickerIds value for this Proposal.
     * 
     * @return secondaryTraffickerIds   * List of unique IDs of {@link User} objects who are responsible
     * for trafficking
     *                 the {@code Proposal} besides the primary trafficker.
     * This attribute is optional.
     *                 A proposal could have 8 secondary traffickers at most,
     * but must also have a primary
     *                 trafficker if any secondary trafficker exists.
     */
    public long[] getSecondaryTraffickerIds() {
        return secondaryTraffickerIds;
    }


    /**
     * Sets the secondaryTraffickerIds value for this Proposal.
     * 
     * @param secondaryTraffickerIds   * List of unique IDs of {@link User} objects who are responsible
     * for trafficking
     *                 the {@code Proposal} besides the primary trafficker.
     * This attribute is optional.
     *                 A proposal could have 8 secondary traffickers at most,
     * but must also have a primary
     *                 trafficker if any secondary trafficker exists.
     */
    public void setSecondaryTraffickerIds(long[] secondaryTraffickerIds) {
        this.secondaryTraffickerIds = secondaryTraffickerIds;
    }

    public long getSecondaryTraffickerIds(int i) {
        return this.secondaryTraffickerIds[i];
    }

    public void setSecondaryTraffickerIds(int i, long _value) {
        this.secondaryTraffickerIds[i] = _value;
    }


    /**
     * Gets the appliedTeamIds value for this Proposal.
     * 
     * @return appliedTeamIds   * The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional.
     */
    public long[] getAppliedTeamIds() {
        return appliedTeamIds;
    }


    /**
     * Sets the appliedTeamIds value for this Proposal.
     * 
     * @param appliedTeamIds   * The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional.
     */
    public void setAppliedTeamIds(long[] appliedTeamIds) {
        this.appliedTeamIds = appliedTeamIds;
    }

    public long getAppliedTeamIds(int i) {
        return this.appliedTeamIds[i];
    }

    public void setAppliedTeamIds(int i, long _value) {
        this.appliedTeamIds[i] = _value;
    }


    /**
     * Gets the customFieldValues value for this Proposal.
     * 
     * @return customFieldValues   * The values of the custom fields associated with the {@code
     * Proposal}.
     *                 This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this Proposal.
     * 
     * @param customFieldValues   * The values of the custom fields associated with the {@code
     * Proposal}.
     *                 This attribute is optional.
     */
    public void setCustomFieldValues(com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.dfp.axis.v201306.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this Proposal.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional.
     */
    public com.google.api.ads.dfp.axis.v201306.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this Proposal.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional.
     */
    public void setAppliedLabels(com.google.api.ads.dfp.axis.v201306.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201306.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.dfp.axis.v201306.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this Proposal.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google.
     */
    public com.google.api.ads.dfp.axis.v201306.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this Proposal.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those
     *                 inherited ones. If a label has been negated, only
     * the negated label
     *                 is returned. This field is readonly and is assigned
     * by Google.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.dfp.axis.v201306.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.dfp.axis.v201306.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.dfp.axis.v201306.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the advertiserDiscount value for this Proposal.
     * 
     * @return advertiserDiscount   * The discount applied to the {@code Proposal} according to the
     * {@link #advertiser}.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public java.lang.Long getAdvertiserDiscount() {
        return advertiserDiscount;
    }


    /**
     * Sets the advertiserDiscount value for this Proposal.
     * 
     * @param advertiserDiscount   * The discount applied to the {@code Proposal} according to the
     * {@link #advertiser}.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public void setAdvertiserDiscount(java.lang.Long advertiserDiscount) {
        this.advertiserDiscount = advertiserDiscount;
    }


    /**
     * Gets the proposalDiscount value for this Proposal.
     * 
     * @return proposalDiscount   * The proposal discount, which will be applied to all
     *                 {@link ProposalLineItem} objects in the {@code Proposal}.
     * The percentage value is in terms of millipercent, and must be multiples
     * of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public java.lang.Long getProposalDiscount() {
        return proposalDiscount;
    }


    /**
     * Sets the proposalDiscount value for this Proposal.
     * 
     * @param proposalDiscount   * The proposal discount, which will be applied to all
     *                 {@link ProposalLineItem} objects in the {@code Proposal}.
     * The percentage value is in terms of millipercent, and must be multiples
     * of 1000
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public void setProposalDiscount(java.lang.Long proposalDiscount) {
        this.proposalDiscount = proposalDiscount;
    }


    /**
     * Gets the additionalAdjustment value for this Proposal.
     * 
     * @return additionalAdjustment   * The additional adjustment, which is an absolute value applied
     * on final cost of
     *                 the {@code Proposal}. It could either be a positive
     * number (surcharge) or
     *                 negative one (discount). It supports precision of
     * 2 decimal places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     */
    public com.google.api.ads.dfp.axis.v201306.Money getAdditionalAdjustment() {
        return additionalAdjustment;
    }


    /**
     * Sets the additionalAdjustment value for this Proposal.
     * 
     * @param additionalAdjustment   * The additional adjustment, which is an absolute value applied
     * on final cost of
     *                 the {@code Proposal}. It could either be a positive
     * number (surcharge) or
     *                 negative one (discount). It supports precision of
     * 2 decimal places in terms of
     *                 the fundamental currency unit, so the {@link Money#microAmount}
     * must be
     *                 multiples of 10000. This attribute is optional and
     * default value is 0.
     *                 The {@link Money#currencyCode} is readonly.
     */
    public void setAdditionalAdjustment(com.google.api.ads.dfp.axis.v201306.Money additionalAdjustment) {
        this.additionalAdjustment = additionalAdjustment;
    }


    /**
     * Gets the exchangeRate value for this Proposal.
     * 
     * @return exchangeRate   * The exchange rate from the {@link #currencyCode} to the
     *                 {@link Network#currencyCode network's currency}. The
     * value is stored as the exchange rate times
     *                 10,000,000,000 truncated to a long. This attribute
     * is readonly and is assigned by Google when
     *                 first created or updated with {@link #refreshExchangeRate}
     * set to {@code true}. This attribute
     *                 is ignored if the feature is not enabled.
     */
    public java.lang.Long getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this Proposal.
     * 
     * @param exchangeRate   * The exchange rate from the {@link #currencyCode} to the
     *                 {@link Network#currencyCode network's currency}. The
     * value is stored as the exchange rate times
     *                 10,000,000,000 truncated to a long. This attribute
     * is readonly and is assigned by Google when
     *                 first created or updated with {@link #refreshExchangeRate}
     * set to {@code true}. This attribute
     *                 is ignored if the feature is not enabled.
     */
    public void setExchangeRate(java.lang.Long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the refreshExchangeRate value for this Proposal.
     * 
     * @return refreshExchangeRate   * Set this field to {@code true} to update the {@link #exchangeRate}
     * to the latest exchange rate
     *                 when updating the proposal. This attribute is optional
     * and defaults to {@code false}. This
     *                 attribute is ignored if the feature is not enabled.
     */
    public java.lang.Boolean getRefreshExchangeRate() {
        return refreshExchangeRate;
    }


    /**
     * Sets the refreshExchangeRate value for this Proposal.
     * 
     * @param refreshExchangeRate   * Set this field to {@code true} to update the {@link #exchangeRate}
     * to the latest exchange rate
     *                 when updating the proposal. This attribute is optional
     * and defaults to {@code false}. This
     *                 attribute is ignored if the feature is not enabled.
     */
    public void setRefreshExchangeRate(java.lang.Boolean refreshExchangeRate) {
        this.refreshExchangeRate = refreshExchangeRate;
    }


    /**
     * Gets the agencyCommission value for this Proposal.
     * 
     * @return agencyCommission   * The commission for the primary agency of the {@code Proposal}.
     * The percentage value is in terms of millipercent, and must be multiples
     * of 100
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public java.lang.Long getAgencyCommission() {
        return agencyCommission;
    }


    /**
     * Sets the agencyCommission value for this Proposal.
     * 
     * @param agencyCommission   * The commission for the primary agency of the {@code Proposal}.
     * The percentage value is in terms of millipercent, and must be multiples
     * of 100
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public void setAgencyCommission(java.lang.Long agencyCommission) {
        this.agencyCommission = agencyCommission;
    }


    /**
     * Gets the valueAddedTax value for this Proposal.
     * 
     * @return valueAddedTax   * The value added tax (VAT) applied on final cost of the {@code
     * Proposal}.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 100
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public java.lang.Long getValueAddedTax() {
        return valueAddedTax;
    }


    /**
     * Sets the valueAddedTax value for this Proposal.
     * 
     * @param valueAddedTax   * The value added tax (VAT) applied on final cost of the {@code
     * Proposal}.
     *                 The percentage value is in terms of millipercent,
     * and must be multiples of 100
     *                 with the range from 0 to 100000. This attribute is
     * optional and default value is 0.
     */
    public void setValueAddedTax(java.lang.Long valueAddedTax) {
        this.valueAddedTax = valueAddedTax;
    }


    /**
     * Gets the approvalWorkflowActionIds value for this Proposal.
     * 
     * @return approvalWorkflowActionIds   * List of IDs for the {@link WorkflowAction workflow actions}
     * that current active user can
     *                 approve or reject. This attribute is readonly and
     * is assigned by Google.
     */
    public long[] getApprovalWorkflowActionIds() {
        return approvalWorkflowActionIds;
    }


    /**
     * Sets the approvalWorkflowActionIds value for this Proposal.
     * 
     * @param approvalWorkflowActionIds   * List of IDs for the {@link WorkflowAction workflow actions}
     * that current active user can
     *                 approve or reject. This attribute is readonly and
     * is assigned by Google.
     */
    public void setApprovalWorkflowActionIds(long[] approvalWorkflowActionIds) {
        this.approvalWorkflowActionIds = approvalWorkflowActionIds;
    }

    public long getApprovalWorkflowActionIds(int i) {
        return this.approvalWorkflowActionIds[i];
    }

    public void setApprovalWorkflowActionIds(int i, long _value) {
        this.approvalWorkflowActionIds[i] = _value;
    }


    /**
     * Gets the approvalStatus value for this Proposal.
     * 
     * @return approvalStatus   * The approval status of the {@code Proposal} for the active
     * user or {@code null} if the active
     *                 user has no action needed. This attribute is readonly
     * and is assigned by Google.
     */
    public com.google.api.ads.dfp.axis.v201306.ProposalApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }


    /**
     * Sets the approvalStatus value for this Proposal.
     * 
     * @param approvalStatus   * The approval status of the {@code Proposal} for the active
     * user or {@code null} if the active
     *                 user has no action needed. This attribute is readonly
     * and is assigned by Google.
     */
    public void setApprovalStatus(com.google.api.ads.dfp.axis.v201306.ProposalApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proposal)) return false;
        Proposal other = (Proposal) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isArchived==null && other.getIsArchived()==null) || 
             (this.isArchived!=null &&
              this.isArchived.equals(other.getIsArchived()))) &&
            ((this.advertiser==null && other.getAdvertiser()==null) || 
             (this.advertiser!=null &&
              this.advertiser.equals(other.getAdvertiser()))) &&
            ((this.agencies==null && other.getAgencies()==null) || 
             (this.agencies!=null &&
              java.util.Arrays.equals(this.agencies, other.getAgencies()))) &&
            ((this.probabilityToClose==null && other.getProbabilityToClose()==null) || 
             (this.probabilityToClose!=null &&
              this.probabilityToClose.equals(other.getProbabilityToClose()))) &&
            ((this.billingCap==null && other.getBillingCap()==null) || 
             (this.billingCap!=null &&
              this.billingCap.equals(other.getBillingCap()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.billingSource==null && other.getBillingSource()==null) || 
             (this.billingSource!=null &&
              this.billingSource.equals(other.getBillingSource()))) &&
            ((this.poNumber==null && other.getPoNumber()==null) || 
             (this.poNumber!=null &&
              this.poNumber.equals(other.getPoNumber()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.primarySalesperson==null && other.getPrimarySalesperson()==null) || 
             (this.primarySalesperson!=null &&
              this.primarySalesperson.equals(other.getPrimarySalesperson()))) &&
            ((this.secondarySalespeople==null && other.getSecondarySalespeople()==null) || 
             (this.secondarySalespeople!=null &&
              java.util.Arrays.equals(this.secondarySalespeople, other.getSecondarySalespeople()))) &&
            ((this.salesPlannerIds==null && other.getSalesPlannerIds()==null) || 
             (this.salesPlannerIds!=null &&
              java.util.Arrays.equals(this.salesPlannerIds, other.getSalesPlannerIds()))) &&
            ((this.primaryTraffickerId==null && other.getPrimaryTraffickerId()==null) || 
             (this.primaryTraffickerId!=null &&
              this.primaryTraffickerId.equals(other.getPrimaryTraffickerId()))) &&
            ((this.secondaryTraffickerIds==null && other.getSecondaryTraffickerIds()==null) || 
             (this.secondaryTraffickerIds!=null &&
              java.util.Arrays.equals(this.secondaryTraffickerIds, other.getSecondaryTraffickerIds()))) &&
            ((this.appliedTeamIds==null && other.getAppliedTeamIds()==null) || 
             (this.appliedTeamIds!=null &&
              java.util.Arrays.equals(this.appliedTeamIds, other.getAppliedTeamIds()))) &&
            ((this.customFieldValues==null && other.getCustomFieldValues()==null) || 
             (this.customFieldValues!=null &&
              java.util.Arrays.equals(this.customFieldValues, other.getCustomFieldValues()))) &&
            ((this.appliedLabels==null && other.getAppliedLabels()==null) || 
             (this.appliedLabels!=null &&
              java.util.Arrays.equals(this.appliedLabels, other.getAppliedLabels()))) &&
            ((this.effectiveAppliedLabels==null && other.getEffectiveAppliedLabels()==null) || 
             (this.effectiveAppliedLabels!=null &&
              java.util.Arrays.equals(this.effectiveAppliedLabels, other.getEffectiveAppliedLabels()))) &&
            ((this.advertiserDiscount==null && other.getAdvertiserDiscount()==null) || 
             (this.advertiserDiscount!=null &&
              this.advertiserDiscount.equals(other.getAdvertiserDiscount()))) &&
            ((this.proposalDiscount==null && other.getProposalDiscount()==null) || 
             (this.proposalDiscount!=null &&
              this.proposalDiscount.equals(other.getProposalDiscount()))) &&
            ((this.additionalAdjustment==null && other.getAdditionalAdjustment()==null) || 
             (this.additionalAdjustment!=null &&
              this.additionalAdjustment.equals(other.getAdditionalAdjustment()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.refreshExchangeRate==null && other.getRefreshExchangeRate()==null) || 
             (this.refreshExchangeRate!=null &&
              this.refreshExchangeRate.equals(other.getRefreshExchangeRate()))) &&
            ((this.agencyCommission==null && other.getAgencyCommission()==null) || 
             (this.agencyCommission!=null &&
              this.agencyCommission.equals(other.getAgencyCommission()))) &&
            ((this.valueAddedTax==null && other.getValueAddedTax()==null) || 
             (this.valueAddedTax!=null &&
              this.valueAddedTax.equals(other.getValueAddedTax()))) &&
            ((this.approvalWorkflowActionIds==null && other.getApprovalWorkflowActionIds()==null) || 
             (this.approvalWorkflowActionIds!=null &&
              java.util.Arrays.equals(this.approvalWorkflowActionIds, other.getApprovalWorkflowActionIds()))) &&
            ((this.approvalStatus==null && other.getApprovalStatus()==null) || 
             (this.approvalStatus!=null &&
              this.approvalStatus.equals(other.getApprovalStatus())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsArchived() != null) {
            _hashCode += getIsArchived().hashCode();
        }
        if (getAdvertiser() != null) {
            _hashCode += getAdvertiser().hashCode();
        }
        if (getAgencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgencies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProbabilityToClose() != null) {
            _hashCode += getProbabilityToClose().hashCode();
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
        if (getPoNumber() != null) {
            _hashCode += getPoNumber().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getPrimarySalesperson() != null) {
            _hashCode += getPrimarySalesperson().hashCode();
        }
        if (getSecondarySalespeople() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondarySalespeople());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondarySalespeople(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesPlannerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesPlannerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesPlannerIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryTraffickerId() != null) {
            _hashCode += getPrimaryTraffickerId().hashCode();
        }
        if (getSecondaryTraffickerIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondaryTraffickerIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondaryTraffickerIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedTeamIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedTeamIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedTeamIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getAdvertiserDiscount() != null) {
            _hashCode += getAdvertiserDiscount().hashCode();
        }
        if (getProposalDiscount() != null) {
            _hashCode += getProposalDiscount().hashCode();
        }
        if (getAdditionalAdjustment() != null) {
            _hashCode += getAdditionalAdjustment().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getRefreshExchangeRate() != null) {
            _hashCode += getRefreshExchangeRate().hashCode();
        }
        if (getAgencyCommission() != null) {
            _hashCode += getAgencyCommission().hashCode();
        }
        if (getValueAddedTax() != null) {
            _hashCode += getValueAddedTax().hashCode();
        }
        if (getApprovalWorkflowActionIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalWorkflowActionIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalWorkflowActionIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprovalStatus() != null) {
            _hashCode += getApprovalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proposal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Proposal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "advertiser"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalCompanyAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "agencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalCompanyAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probabilityToClose");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "probabilityToClose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCap");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "billingCap"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingCap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingSchedule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "billingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BillingSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "poNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "budget"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySalesperson");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "primarySalesperson"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "SalespersonSplit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarySalespeople");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "secondarySalespeople"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "SalespersonSplit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesPlannerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "salesPlannerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryTraffickerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "primaryTraffickerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryTraffickerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "secondaryTraffickerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "appliedTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "advertiserDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "proposalDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "additionalAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshExchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "refreshExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencyCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "agencyCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueAddedTax");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "valueAddedTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalWorkflowActionIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "approvalWorkflowActionIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "approvalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201306", "ProposalApprovalStatus"));
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
