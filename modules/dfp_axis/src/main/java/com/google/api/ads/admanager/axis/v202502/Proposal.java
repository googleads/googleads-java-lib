// Copyright 2025 Google LLC
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
 * Proposal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Mar 20, 2024 (11:59:10 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.admanager.axis.v202502;


/**
 * A {@code Proposal} represents an agreement between an interactive
 * advertising seller and a buyer
 *             that specifies the details of an advertising campaign.
 */
public class Proposal  implements java.io.Serializable {
    /* The unique ID of the {@code Proposal}.
     *                 This attribute is read-only. */
    private java.lang.Long id;

    /* Flag that specifies whether this {@code Proposal} is for programmatic
     * deals. This value is
     *                 default to {@code false}. */
    private java.lang.Boolean isProgrammatic;

    /* The unique ID of corresponding {@link Order}. This will be
     * {@code null} if the {@code Proposal}
     *                 has not been pushed to Ad Manager.
     *                 This attribute is read-only. */
    private java.lang.Long dfpOrderId;

    /* The name of the {@code Proposal}. This value has a maximum
     * length of 255 characters. This value
     *                 is copied to {@link Order#name} when the proposal
     * turns into an order. This attribute can be
     *                 configured as editable after the proposal has been
     * submitted. Please check with your network
     *                 administrator for editable fields configuration.
     *                 <span class="constraint Required">This attribute is
     * required.</span> */
    private java.lang.String name;

    /* The date and time at which the order and line items associated
     * with the {@code Proposal} are
     *                 eligible to begin serving. This attribute is derived
     * from the proposal line item of the
     *                 proposal which has the earliest {@link ProposalLineItem#startDateTime}.
     * This attribute will be
     *                 null, if this proposal has no related line items,
     * or none of its line items have a start time.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202502.DateTime startDateTime;

    /* The date and time at which the order and line items associated
     * with the {@code Proposal} stop
     *                 being served. This attribute is derived from the proposal
     * line item of the proposal which has
     *                 the latest {@link ProposalLineItem#endDateTime}. This
     * attribute will be null, if this proposal
     *                 has no related line items, or none of its line items
     * have an end time.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202502.DateTime endDateTime;

    /* The status of the {@code Proposal}.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202502.ProposalStatus status;

    /* The archival status of the {@code Proposal}.
     *                 This attribute is read-only. */
    private java.lang.Boolean isArchived;

    /* The advertiser, to which this {@code Proposal} belongs, and
     * a set of {@link Contact} objects
     *                 associated with the advertiser. The {@link ProposalCompanyAssociation#type}
     * of this attribute
     *                 should be {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is required when
     *                 the proposal turns into an order, and its {@link ProposalCompanyAssociation#companyId}
     * will be
     *                 copied to {@link Order#advertiserId}. This attribute
     * becomes readonly once the {@code Proposal}
     *                 has been pushed. */
    private com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation advertiser;

    /* List of agencies and the set of {@link Contact} objects associated
     * with each agency. This
     *                 attribute is optional. A {@code Proposal} only has
     * at most one {@link Company} with {@link
     *                 ProposalCompanyAssociationType#PRIMARY_AGENCY} type,
     * but a {@link Company} can appear more than
     *                 once with different {@link ProposalCompanyAssociationType}
     * values. If primary agency exists,
     *                 its {@link ProposalCompanyAssociation#companyId} will
     * be copied to {@link Order#agencyId} when
     *                 the proposal turns into an order. */
    private com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation[] agencies;

    /* Provides any additional notes that may annotate the {@code
     * Proposal}. This attribute is
     *                 optional and has a maximum length of 65,535 characters.
     * This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration. */
    private java.lang.String internalNotes;

    /* The primary salesperson who brokered the transaction with the
     * {@link #advertiser}. This
     *                 attribute is required when the proposal turns into
     * an order. This attribute can be configured
     *                 as editable after the proposal has been submitted.
     * Please check with your network administrator
     *                 for editable fields configuration. */
    private com.google.api.ads.admanager.axis.v202502.SalespersonSplit primarySalesperson;

    /* List of unique IDs of {@link User} objects who are the sales
     * planners of the {@code Proposal}.
     *                 This attribute is optional. A proposal could have
     * 8 sales planners at most. This attribute can
     *                 be configured as editable after the proposal has been
     * submitted. Please check with your network
     *                 administrator for editable fields configuration. */
    private long[] salesPlannerIds;

    /* The unique ID of the {@link User} who is primary trafficker
     * and is responsible for trafficking
     *                 the {@code Proposal}. This attribute is required when
     * the proposal turns into an order, and
     *                 will be copied to {@link Order#primaryTraffickerId}
     * . This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration. */
    private java.lang.Long primaryTraffickerId;

    /* {@link User users} who are the seller's contacts. */
    private long[] sellerContactIds;

    /* The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional. This
     *                 attribute can be configured as editable after the
     * proposal has been submitted. Please check
     *                 with your network administrator for editable fields
     * configuration. */
    private long[] appliedTeamIds;

    /* The values of the custom fields associated with the {@code
     * Proposal}. This attribute is
     *                 optional. This attribute can be configured as editable
     * after the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration. */
    private com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues;

    /* The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional. */
    private com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels;

    /* Contains the set of labels applied directly to the proposal
     * as well as those inherited ones. If
     *                 a label has been negated, only the negated label is
     * returned.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202502.AppliedLabel[] effectiveAppliedLabels;

    /* The currency code of this {@code Proposal}. This attribute
     * is optional and defaults to
     *                 network's currency code. */
    private java.lang.String currencyCode;

    /* Indicates whether the proposal has been sold, i.e., corresponds
     * to whether the status of an
     *                 {@link Order} is {@link OrderStatus#APPROVED} or {@link
     * OrderStatus#PAUSED}.
     *                 This attribute is read-only. */
    private java.lang.Boolean isSold;

    /* The date and time this {@code Proposal} was last modified.
     *                 This attribute is read-only. */
    private com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime;

    /* The marketplace info of this proposal if it has a corresponding
     * order in Marketplace. */
    private com.google.api.ads.admanager.axis.v202502.ProposalMarketplaceInfo marketplaceInfo;

    /* The buyer RFP associated with this {@code Proposal}, which
     * is optional. This field will be null
     *                 if the proposal is not initiated from RFP. */
    private com.google.api.ads.admanager.axis.v202502.BuyerRfp buyerRfp;

    /* Whether a {@link Proposal} contains a {@link BuyerRfp} field.
     * If this field is true, it
     *                 indicates that the {@link Proposal} in question orignated
     * from a buyer. */
    private java.lang.Boolean hasBuyerRfp;

    /* Whether pausing is consented for the {@code Proposal}. This
     * field is optional and defaults to
     *                 true. If false, it indicates that the buyer and the
     * seller agree that the proposal should not
     *                 be paused. */
    private java.lang.Boolean deliveryPausingEnabled;

    public Proposal() {
    }

    public Proposal(
           java.lang.Long id,
           java.lang.Boolean isProgrammatic,
           java.lang.Long dfpOrderId,
           java.lang.String name,
           com.google.api.ads.admanager.axis.v202502.DateTime startDateTime,
           com.google.api.ads.admanager.axis.v202502.DateTime endDateTime,
           com.google.api.ads.admanager.axis.v202502.ProposalStatus status,
           java.lang.Boolean isArchived,
           com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation advertiser,
           com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation[] agencies,
           java.lang.String internalNotes,
           com.google.api.ads.admanager.axis.v202502.SalespersonSplit primarySalesperson,
           long[] salesPlannerIds,
           java.lang.Long primaryTraffickerId,
           long[] sellerContactIds,
           long[] appliedTeamIds,
           com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues,
           com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels,
           com.google.api.ads.admanager.axis.v202502.AppliedLabel[] effectiveAppliedLabels,
           java.lang.String currencyCode,
           java.lang.Boolean isSold,
           com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime,
           com.google.api.ads.admanager.axis.v202502.ProposalMarketplaceInfo marketplaceInfo,
           com.google.api.ads.admanager.axis.v202502.BuyerRfp buyerRfp,
           java.lang.Boolean hasBuyerRfp,
           java.lang.Boolean deliveryPausingEnabled) {
           this.id = id;
           this.isProgrammatic = isProgrammatic;
           this.dfpOrderId = dfpOrderId;
           this.name = name;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.status = status;
           this.isArchived = isArchived;
           this.advertiser = advertiser;
           this.agencies = agencies;
           this.internalNotes = internalNotes;
           this.primarySalesperson = primarySalesperson;
           this.salesPlannerIds = salesPlannerIds;
           this.primaryTraffickerId = primaryTraffickerId;
           this.sellerContactIds = sellerContactIds;
           this.appliedTeamIds = appliedTeamIds;
           this.customFieldValues = customFieldValues;
           this.appliedLabels = appliedLabels;
           this.effectiveAppliedLabels = effectiveAppliedLabels;
           this.currencyCode = currencyCode;
           this.isSold = isSold;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.marketplaceInfo = marketplaceInfo;
           this.buyerRfp = buyerRfp;
           this.hasBuyerRfp = hasBuyerRfp;
           this.deliveryPausingEnabled = deliveryPausingEnabled;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("advertiser", getAdvertiser())
            .add("agencies", getAgencies())
            .add("appliedLabels", getAppliedLabels())
            .add("appliedTeamIds", getAppliedTeamIds())
            .add("buyerRfp", getBuyerRfp())
            .add("currencyCode", getCurrencyCode())
            .add("customFieldValues", getCustomFieldValues())
            .add("deliveryPausingEnabled", getDeliveryPausingEnabled())
            .add("dfpOrderId", getDfpOrderId())
            .add("effectiveAppliedLabels", getEffectiveAppliedLabels())
            .add("endDateTime", getEndDateTime())
            .add("hasBuyerRfp", getHasBuyerRfp())
            .add("id", getId())
            .add("internalNotes", getInternalNotes())
            .add("isArchived", getIsArchived())
            .add("isProgrammatic", getIsProgrammatic())
            .add("isSold", getIsSold())
            .add("lastModifiedDateTime", getLastModifiedDateTime())
            .add("marketplaceInfo", getMarketplaceInfo())
            .add("name", getName())
            .add("primarySalesperson", getPrimarySalesperson())
            .add("primaryTraffickerId", getPrimaryTraffickerId())
            .add("salesPlannerIds", getSalesPlannerIds())
            .add("sellerContactIds", getSellerContactIds())
            .add("startDateTime", getStartDateTime())
            .add("status", getStatus())
            .toString();
    }

    /**
     * Gets the id value for this Proposal.
     * 
     * @return id   * The unique ID of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this Proposal.
     * 
     * @param id   * The unique ID of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isProgrammatic value for this Proposal.
     * 
     * @return isProgrammatic   * Flag that specifies whether this {@code Proposal} is for programmatic
     * deals. This value is
     *                 default to {@code false}.
     */
    public java.lang.Boolean getIsProgrammatic() {
        return isProgrammatic;
    }


    /**
     * Sets the isProgrammatic value for this Proposal.
     * 
     * @param isProgrammatic   * Flag that specifies whether this {@code Proposal} is for programmatic
     * deals. This value is
     *                 default to {@code false}.
     */
    public void setIsProgrammatic(java.lang.Boolean isProgrammatic) {
        this.isProgrammatic = isProgrammatic;
    }


    /**
     * Gets the dfpOrderId value for this Proposal.
     * 
     * @return dfpOrderId   * The unique ID of corresponding {@link Order}. This will be
     * {@code null} if the {@code Proposal}
     *                 has not been pushed to Ad Manager.
     *                 This attribute is read-only.
     */
    public java.lang.Long getDfpOrderId() {
        return dfpOrderId;
    }


    /**
     * Sets the dfpOrderId value for this Proposal.
     * 
     * @param dfpOrderId   * The unique ID of corresponding {@link Order}. This will be
     * {@code null} if the {@code Proposal}
     *                 has not been pushed to Ad Manager.
     *                 This attribute is read-only.
     */
    public void setDfpOrderId(java.lang.Long dfpOrderId) {
        this.dfpOrderId = dfpOrderId;
    }


    /**
     * Gets the name value for this Proposal.
     * 
     * @return name   * The name of the {@code Proposal}. This value has a maximum
     * length of 255 characters. This value
     *                 is copied to {@link Order#name} when the proposal
     * turns into an order. This attribute can be
     *                 configured as editable after the proposal has been
     * submitted. Please check with your network
     *                 administrator for editable fields configuration.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Proposal.
     * 
     * @param name   * The name of the {@code Proposal}. This value has a maximum
     * length of 255 characters. This value
     *                 is copied to {@link Order#name} when the proposal
     * turns into an order. This attribute can be
     *                 configured as editable after the proposal has been
     * submitted. Please check with your network
     *                 administrator for editable fields configuration.
     *                 <span class="constraint Required">This attribute is
     * required.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the startDateTime value for this Proposal.
     * 
     * @return startDateTime   * The date and time at which the order and line items associated
     * with the {@code Proposal} are
     *                 eligible to begin serving. This attribute is derived
     * from the proposal line item of the
     *                 proposal which has the earliest {@link ProposalLineItem#startDateTime}.
     * This attribute will be
     *                 null, if this proposal has no related line items,
     * or none of its line items have a start time.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this Proposal.
     * 
     * @param startDateTime   * The date and time at which the order and line items associated
     * with the {@code Proposal} are
     *                 eligible to begin serving. This attribute is derived
     * from the proposal line item of the
     *                 proposal which has the earliest {@link ProposalLineItem#startDateTime}.
     * This attribute will be
     *                 null, if this proposal has no related line items,
     * or none of its line items have a start time.
     *                 This attribute is read-only.
     */
    public void setStartDateTime(com.google.api.ads.admanager.axis.v202502.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this Proposal.
     * 
     * @return endDateTime   * The date and time at which the order and line items associated
     * with the {@code Proposal} stop
     *                 being served. This attribute is derived from the proposal
     * line item of the proposal which has
     *                 the latest {@link ProposalLineItem#endDateTime}. This
     * attribute will be null, if this proposal
     *                 has no related line items, or none of its line items
     * have an end time.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this Proposal.
     * 
     * @param endDateTime   * The date and time at which the order and line items associated
     * with the {@code Proposal} stop
     *                 being served. This attribute is derived from the proposal
     * line item of the proposal which has
     *                 the latest {@link ProposalLineItem#endDateTime}. This
     * attribute will be null, if this proposal
     *                 has no related line items, or none of its line items
     * have an end time.
     *                 This attribute is read-only.
     */
    public void setEndDateTime(com.google.api.ads.admanager.axis.v202502.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the status value for this Proposal.
     * 
     * @return status   * The status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.ProposalStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Proposal.
     * 
     * @param status   * The status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public void setStatus(com.google.api.ads.admanager.axis.v202502.ProposalStatus status) {
        this.status = status;
    }


    /**
     * Gets the isArchived value for this Proposal.
     * 
     * @return isArchived   * The archival status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsArchived() {
        return isArchived;
    }


    /**
     * Sets the isArchived value for this Proposal.
     * 
     * @param isArchived   * The archival status of the {@code Proposal}.
     *                 This attribute is read-only.
     */
    public void setIsArchived(java.lang.Boolean isArchived) {
        this.isArchived = isArchived;
    }


    /**
     * Gets the advertiser value for this Proposal.
     * 
     * @return advertiser   * The advertiser, to which this {@code Proposal} belongs, and
     * a set of {@link Contact} objects
     *                 associated with the advertiser. The {@link ProposalCompanyAssociation#type}
     * of this attribute
     *                 should be {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is required when
     *                 the proposal turns into an order, and its {@link ProposalCompanyAssociation#companyId}
     * will be
     *                 copied to {@link Order#advertiserId}. This attribute
     * becomes readonly once the {@code Proposal}
     *                 has been pushed.
     */
    public com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation getAdvertiser() {
        return advertiser;
    }


    /**
     * Sets the advertiser value for this Proposal.
     * 
     * @param advertiser   * The advertiser, to which this {@code Proposal} belongs, and
     * a set of {@link Contact} objects
     *                 associated with the advertiser. The {@link ProposalCompanyAssociation#type}
     * of this attribute
     *                 should be {@link ProposalCompanyAssociationType#ADVERTISER}.
     * This attribute is required when
     *                 the proposal turns into an order, and its {@link ProposalCompanyAssociation#companyId}
     * will be
     *                 copied to {@link Order#advertiserId}. This attribute
     * becomes readonly once the {@code Proposal}
     *                 has been pushed.
     */
    public void setAdvertiser(com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation advertiser) {
        this.advertiser = advertiser;
    }


    /**
     * Gets the agencies value for this Proposal.
     * 
     * @return agencies   * List of agencies and the set of {@link Contact} objects associated
     * with each agency. This
     *                 attribute is optional. A {@code Proposal} only has
     * at most one {@link Company} with {@link
     *                 ProposalCompanyAssociationType#PRIMARY_AGENCY} type,
     * but a {@link Company} can appear more than
     *                 once with different {@link ProposalCompanyAssociationType}
     * values. If primary agency exists,
     *                 its {@link ProposalCompanyAssociation#companyId} will
     * be copied to {@link Order#agencyId} when
     *                 the proposal turns into an order.
     */
    public com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation[] getAgencies() {
        return agencies;
    }


    /**
     * Sets the agencies value for this Proposal.
     * 
     * @param agencies   * List of agencies and the set of {@link Contact} objects associated
     * with each agency. This
     *                 attribute is optional. A {@code Proposal} only has
     * at most one {@link Company} with {@link
     *                 ProposalCompanyAssociationType#PRIMARY_AGENCY} type,
     * but a {@link Company} can appear more than
     *                 once with different {@link ProposalCompanyAssociationType}
     * values. If primary agency exists,
     *                 its {@link ProposalCompanyAssociation#companyId} will
     * be copied to {@link Order#agencyId} when
     *                 the proposal turns into an order.
     */
    public void setAgencies(com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation[] agencies) {
        this.agencies = agencies;
    }

    public com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation getAgencies(int i) {
        return this.agencies[i];
    }

    public void setAgencies(int i, com.google.api.ads.admanager.axis.v202502.ProposalCompanyAssociation _value) {
        this.agencies[i] = _value;
    }


    /**
     * Gets the internalNotes value for this Proposal.
     * 
     * @return internalNotes   * Provides any additional notes that may annotate the {@code
     * Proposal}. This attribute is
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
     * Sets the internalNotes value for this Proposal.
     * 
     * @param internalNotes   * Provides any additional notes that may annotate the {@code
     * Proposal}. This attribute is
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
     * Gets the primarySalesperson value for this Proposal.
     * 
     * @return primarySalesperson   * The primary salesperson who brokered the transaction with the
     * {@link #advertiser}. This
     *                 attribute is required when the proposal turns into
     * an order. This attribute can be configured
     *                 as editable after the proposal has been submitted.
     * Please check with your network administrator
     *                 for editable fields configuration.
     */
    public com.google.api.ads.admanager.axis.v202502.SalespersonSplit getPrimarySalesperson() {
        return primarySalesperson;
    }


    /**
     * Sets the primarySalesperson value for this Proposal.
     * 
     * @param primarySalesperson   * The primary salesperson who brokered the transaction with the
     * {@link #advertiser}. This
     *                 attribute is required when the proposal turns into
     * an order. This attribute can be configured
     *                 as editable after the proposal has been submitted.
     * Please check with your network administrator
     *                 for editable fields configuration.
     */
    public void setPrimarySalesperson(com.google.api.ads.admanager.axis.v202502.SalespersonSplit primarySalesperson) {
        this.primarySalesperson = primarySalesperson;
    }


    /**
     * Gets the salesPlannerIds value for this Proposal.
     * 
     * @return salesPlannerIds   * List of unique IDs of {@link User} objects who are the sales
     * planners of the {@code Proposal}.
     *                 This attribute is optional. A proposal could have
     * 8 sales planners at most. This attribute can
     *                 be configured as editable after the proposal has been
     * submitted. Please check with your network
     *                 administrator for editable fields configuration.
     */
    public long[] getSalesPlannerIds() {
        return salesPlannerIds;
    }


    /**
     * Sets the salesPlannerIds value for this Proposal.
     * 
     * @param salesPlannerIds   * List of unique IDs of {@link User} objects who are the sales
     * planners of the {@code Proposal}.
     *                 This attribute is optional. A proposal could have
     * 8 sales planners at most. This attribute can
     *                 be configured as editable after the proposal has been
     * submitted. Please check with your network
     *                 administrator for editable fields configuration.
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
     * and is responsible for trafficking
     *                 the {@code Proposal}. This attribute is required when
     * the proposal turns into an order, and
     *                 will be copied to {@link Order#primaryTraffickerId}
     * . This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration.
     */
    public java.lang.Long getPrimaryTraffickerId() {
        return primaryTraffickerId;
    }


    /**
     * Sets the primaryTraffickerId value for this Proposal.
     * 
     * @param primaryTraffickerId   * The unique ID of the {@link User} who is primary trafficker
     * and is responsible for trafficking
     *                 the {@code Proposal}. This attribute is required when
     * the proposal turns into an order, and
     *                 will be copied to {@link Order#primaryTraffickerId}
     * . This attribute can be configured as
     *                 editable after the proposal has been submitted. Please
     * check with your network administrator
     *                 for editable fields configuration.
     */
    public void setPrimaryTraffickerId(java.lang.Long primaryTraffickerId) {
        this.primaryTraffickerId = primaryTraffickerId;
    }


    /**
     * Gets the sellerContactIds value for this Proposal.
     * 
     * @return sellerContactIds   * {@link User users} who are the seller's contacts.
     */
    public long[] getSellerContactIds() {
        return sellerContactIds;
    }


    /**
     * Sets the sellerContactIds value for this Proposal.
     * 
     * @param sellerContactIds   * {@link User users} who are the seller's contacts.
     */
    public void setSellerContactIds(long[] sellerContactIds) {
        this.sellerContactIds = sellerContactIds;
    }

    public long getSellerContactIds(int i) {
        return this.sellerContactIds[i];
    }

    public void setSellerContactIds(int i, long _value) {
        this.sellerContactIds[i] = _value;
    }


    /**
     * Gets the appliedTeamIds value for this Proposal.
     * 
     * @return appliedTeamIds   * The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional. This
     *                 attribute can be configured as editable after the
     * proposal has been submitted. Please check
     *                 with your network administrator for editable fields
     * configuration.
     */
    public long[] getAppliedTeamIds() {
        return appliedTeamIds;
    }


    /**
     * Sets the appliedTeamIds value for this Proposal.
     * 
     * @param appliedTeamIds   * The IDs of all teams that the {@code Proposal} is on directly.
     * This attribute is optional. This
     *                 attribute can be configured as editable after the
     * proposal has been submitted. Please check
     *                 with your network administrator for editable fields
     * configuration.
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
     * Proposal}. This attribute is
     *                 optional. This attribute can be configured as editable
     * after the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] getCustomFieldValues() {
        return customFieldValues;
    }


    /**
     * Sets the customFieldValues value for this Proposal.
     * 
     * @param customFieldValues   * The values of the custom fields associated with the {@code
     * Proposal}. This attribute is
     *                 optional. This attribute can be configured as editable
     * after the proposal has been submitted.
     *                 Please check with your network administrator for editable
     * fields configuration.
     */
    public void setCustomFieldValues(com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue[] customFieldValues) {
        this.customFieldValues = customFieldValues;
    }

    public com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue getCustomFieldValues(int i) {
        return this.customFieldValues[i];
    }

    public void setCustomFieldValues(int i, com.google.api.ads.admanager.axis.v202502.BaseCustomFieldValue _value) {
        this.customFieldValues[i] = _value;
    }


    /**
     * Gets the appliedLabels value for this Proposal.
     * 
     * @return appliedLabels   * The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional.
     */
    public com.google.api.ads.admanager.axis.v202502.AppliedLabel[] getAppliedLabels() {
        return appliedLabels;
    }


    /**
     * Sets the appliedLabels value for this Proposal.
     * 
     * @param appliedLabels   * The set of labels applied directly to the {@code Proposal}.
     * This attribute is optional.
     */
    public void setAppliedLabels(com.google.api.ads.admanager.axis.v202502.AppliedLabel[] appliedLabels) {
        this.appliedLabels = appliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202502.AppliedLabel getAppliedLabels(int i) {
        return this.appliedLabels[i];
    }

    public void setAppliedLabels(int i, com.google.api.ads.admanager.axis.v202502.AppliedLabel _value) {
        this.appliedLabels[i] = _value;
    }


    /**
     * Gets the effectiveAppliedLabels value for this Proposal.
     * 
     * @return effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those inherited ones. If
     *                 a label has been negated, only the negated label is
     * returned.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.AppliedLabel[] getEffectiveAppliedLabels() {
        return effectiveAppliedLabels;
    }


    /**
     * Sets the effectiveAppliedLabels value for this Proposal.
     * 
     * @param effectiveAppliedLabels   * Contains the set of labels applied directly to the proposal
     * as well as those inherited ones. If
     *                 a label has been negated, only the negated label is
     * returned.
     *                 This attribute is read-only.
     */
    public void setEffectiveAppliedLabels(com.google.api.ads.admanager.axis.v202502.AppliedLabel[] effectiveAppliedLabels) {
        this.effectiveAppliedLabels = effectiveAppliedLabels;
    }

    public com.google.api.ads.admanager.axis.v202502.AppliedLabel getEffectiveAppliedLabels(int i) {
        return this.effectiveAppliedLabels[i];
    }

    public void setEffectiveAppliedLabels(int i, com.google.api.ads.admanager.axis.v202502.AppliedLabel _value) {
        this.effectiveAppliedLabels[i] = _value;
    }


    /**
     * Gets the currencyCode value for this Proposal.
     * 
     * @return currencyCode   * The currency code of this {@code Proposal}. This attribute
     * is optional and defaults to
     *                 network's currency code.
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Proposal.
     * 
     * @param currencyCode   * The currency code of this {@code Proposal}. This attribute
     * is optional and defaults to
     *                 network's currency code.
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the isSold value for this Proposal.
     * 
     * @return isSold   * Indicates whether the proposal has been sold, i.e., corresponds
     * to whether the status of an
     *                 {@link Order} is {@link OrderStatus#APPROVED} or {@link
     * OrderStatus#PAUSED}.
     *                 This attribute is read-only.
     */
    public java.lang.Boolean getIsSold() {
        return isSold;
    }


    /**
     * Sets the isSold value for this Proposal.
     * 
     * @param isSold   * Indicates whether the proposal has been sold, i.e., corresponds
     * to whether the status of an
     *                 {@link Order} is {@link OrderStatus#APPROVED} or {@link
     * OrderStatus#PAUSED}.
     *                 This attribute is read-only.
     */
    public void setIsSold(java.lang.Boolean isSold) {
        this.isSold = isSold;
    }


    /**
     * Gets the lastModifiedDateTime value for this Proposal.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code Proposal} was last modified.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.admanager.axis.v202502.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this Proposal.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code Proposal} was last modified.
     *                 This attribute is read-only.
     */
    public void setLastModifiedDateTime(com.google.api.ads.admanager.axis.v202502.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the marketplaceInfo value for this Proposal.
     * 
     * @return marketplaceInfo   * The marketplace info of this proposal if it has a corresponding
     * order in Marketplace.
     */
    public com.google.api.ads.admanager.axis.v202502.ProposalMarketplaceInfo getMarketplaceInfo() {
        return marketplaceInfo;
    }


    /**
     * Sets the marketplaceInfo value for this Proposal.
     * 
     * @param marketplaceInfo   * The marketplace info of this proposal if it has a corresponding
     * order in Marketplace.
     */
    public void setMarketplaceInfo(com.google.api.ads.admanager.axis.v202502.ProposalMarketplaceInfo marketplaceInfo) {
        this.marketplaceInfo = marketplaceInfo;
    }


    /**
     * Gets the buyerRfp value for this Proposal.
     * 
     * @return buyerRfp   * The buyer RFP associated with this {@code Proposal}, which
     * is optional. This field will be null
     *                 if the proposal is not initiated from RFP.
     */
    public com.google.api.ads.admanager.axis.v202502.BuyerRfp getBuyerRfp() {
        return buyerRfp;
    }


    /**
     * Sets the buyerRfp value for this Proposal.
     * 
     * @param buyerRfp   * The buyer RFP associated with this {@code Proposal}, which
     * is optional. This field will be null
     *                 if the proposal is not initiated from RFP.
     */
    public void setBuyerRfp(com.google.api.ads.admanager.axis.v202502.BuyerRfp buyerRfp) {
        this.buyerRfp = buyerRfp;
    }


    /**
     * Gets the hasBuyerRfp value for this Proposal.
     * 
     * @return hasBuyerRfp   * Whether a {@link Proposal} contains a {@link BuyerRfp} field.
     * If this field is true, it
     *                 indicates that the {@link Proposal} in question orignated
     * from a buyer.
     */
    public java.lang.Boolean getHasBuyerRfp() {
        return hasBuyerRfp;
    }


    /**
     * Sets the hasBuyerRfp value for this Proposal.
     * 
     * @param hasBuyerRfp   * Whether a {@link Proposal} contains a {@link BuyerRfp} field.
     * If this field is true, it
     *                 indicates that the {@link Proposal} in question orignated
     * from a buyer.
     */
    public void setHasBuyerRfp(java.lang.Boolean hasBuyerRfp) {
        this.hasBuyerRfp = hasBuyerRfp;
    }


    /**
     * Gets the deliveryPausingEnabled value for this Proposal.
     * 
     * @return deliveryPausingEnabled   * Whether pausing is consented for the {@code Proposal}. This
     * field is optional and defaults to
     *                 true. If false, it indicates that the buyer and the
     * seller agree that the proposal should not
     *                 be paused.
     */
    public java.lang.Boolean getDeliveryPausingEnabled() {
        return deliveryPausingEnabled;
    }


    /**
     * Sets the deliveryPausingEnabled value for this Proposal.
     * 
     * @param deliveryPausingEnabled   * Whether pausing is consented for the {@code Proposal}. This
     * field is optional and defaults to
     *                 true. If false, it indicates that the buyer and the
     * seller agree that the proposal should not
     *                 be paused.
     */
    public void setDeliveryPausingEnabled(java.lang.Boolean deliveryPausingEnabled) {
        this.deliveryPausingEnabled = deliveryPausingEnabled;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proposal)) return false;
        Proposal other = (Proposal) obj;
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
            ((this.isProgrammatic==null && other.getIsProgrammatic()==null) || 
             (this.isProgrammatic!=null &&
              this.isProgrammatic.equals(other.getIsProgrammatic()))) &&
            ((this.dfpOrderId==null && other.getDfpOrderId()==null) || 
             (this.dfpOrderId!=null &&
              this.dfpOrderId.equals(other.getDfpOrderId()))) &&
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
            ((this.internalNotes==null && other.getInternalNotes()==null) || 
             (this.internalNotes!=null &&
              this.internalNotes.equals(other.getInternalNotes()))) &&
            ((this.primarySalesperson==null && other.getPrimarySalesperson()==null) || 
             (this.primarySalesperson!=null &&
              this.primarySalesperson.equals(other.getPrimarySalesperson()))) &&
            ((this.salesPlannerIds==null && other.getSalesPlannerIds()==null) || 
             (this.salesPlannerIds!=null &&
              java.util.Arrays.equals(this.salesPlannerIds, other.getSalesPlannerIds()))) &&
            ((this.primaryTraffickerId==null && other.getPrimaryTraffickerId()==null) || 
             (this.primaryTraffickerId!=null &&
              this.primaryTraffickerId.equals(other.getPrimaryTraffickerId()))) &&
            ((this.sellerContactIds==null && other.getSellerContactIds()==null) || 
             (this.sellerContactIds!=null &&
              java.util.Arrays.equals(this.sellerContactIds, other.getSellerContactIds()))) &&
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
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.isSold==null && other.getIsSold()==null) || 
             (this.isSold!=null &&
              this.isSold.equals(other.getIsSold()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.marketplaceInfo==null && other.getMarketplaceInfo()==null) || 
             (this.marketplaceInfo!=null &&
              this.marketplaceInfo.equals(other.getMarketplaceInfo()))) &&
            ((this.buyerRfp==null && other.getBuyerRfp()==null) || 
             (this.buyerRfp!=null &&
              this.buyerRfp.equals(other.getBuyerRfp()))) &&
            ((this.hasBuyerRfp==null && other.getHasBuyerRfp()==null) || 
             (this.hasBuyerRfp!=null &&
              this.hasBuyerRfp.equals(other.getHasBuyerRfp()))) &&
            ((this.deliveryPausingEnabled==null && other.getDeliveryPausingEnabled()==null) || 
             (this.deliveryPausingEnabled!=null &&
              this.deliveryPausingEnabled.equals(other.getDeliveryPausingEnabled())));
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
        if (getIsProgrammatic() != null) {
            _hashCode += getIsProgrammatic().hashCode();
        }
        if (getDfpOrderId() != null) {
            _hashCode += getDfpOrderId().hashCode();
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
        if (getInternalNotes() != null) {
            _hashCode += getInternalNotes().hashCode();
        }
        if (getPrimarySalesperson() != null) {
            _hashCode += getPrimarySalesperson().hashCode();
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
        if (getSellerContactIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellerContactIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellerContactIds(), i);
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getIsSold() != null) {
            _hashCode += getIsSold().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getMarketplaceInfo() != null) {
            _hashCode += getMarketplaceInfo().hashCode();
        }
        if (getBuyerRfp() != null) {
            _hashCode += getBuyerRfp().hashCode();
        }
        if (getHasBuyerRfp() != null) {
            _hashCode += getHasBuyerRfp().hashCode();
        }
        if (getDeliveryPausingEnabled() != null) {
            _hashCode += getDeliveryPausingEnabled().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proposal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "Proposal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProgrammatic");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isProgrammatic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "dfpOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "ProposalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isArchived");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isArchived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiser");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "advertiser"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "ProposalCompanyAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agencies");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "agencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "ProposalCompanyAssociation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "internalNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primarySalesperson");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "primarySalesperson"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "SalespersonSplit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesPlannerIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "salesPlannerIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryTraffickerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "primaryTraffickerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerContactIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "sellerContactIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedTeamIds");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "appliedTeamIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "customFieldValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "BaseCustomFieldValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "appliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveAppliedLabels");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "effectiveAppliedLabels"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "AppliedLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSold");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "isSold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "marketplaceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "ProposalMarketplaceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerRfp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "buyerRfp"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "BuyerRfp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasBuyerRfp");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "hasBuyerRfp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryPausingEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v202502", "deliveryPausingEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
