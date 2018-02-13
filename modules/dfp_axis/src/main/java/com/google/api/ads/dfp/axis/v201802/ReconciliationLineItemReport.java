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
 * ReconciliationLineItemReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201802;


/**
 * Contains reconciliation data of a {@link LineItem} and/or {@link
 * ProposalLineItem}.
 */
public class ReconciliationLineItemReport  implements java.io.Serializable {
    /* Uniquely identifies the {@code ReconciliationLineItemReport}.
     * This value is read-only and assigned by Google. */
    private java.lang.Long id;

    /* The ID of the {@link ReconciliationReport} this {@code ReconciliationLineItemReport}
     * belongs to.
     *                 This value is read-only. */
    private java.lang.Long reconciliationReportId;

    /* If this reconciliation data is for a {@link LineItem}, then
     * this contains the ID of the order
     *                 that line item belongs to. Otherwise, this field will
     * have a value of 0.
     *                 This value is read-only. */
    private java.lang.Long orderId;

    /* If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the ID of
     *                 the proposal that proposal line item belongs to. Otherwise,
     * this field will have a value of 0.
     *                 This value is read-only. */
    private java.lang.Long proposalId;

    /* If this reconciliation data is for a {@link LineItem}, then
     * this contains that line item's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only. */
    private java.lang.Long lineItemId;

    /* If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains that proposal line item's ID. Otherwise, this field
     * will have a value of 0.
     *                 This value is read-only. */
    private java.lang.Long proposalLineItemId;

    /* The {@link RateType} of the {@link LineItem} and/or {@link
     * ProposalLineItem}
     *                 this reconciliation data is for.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.RateType rateType;

    /* The {@link Money net rate} of the {@link LineItem} and/or {@link
     * ProposalLineItem}
     *                 this reconciliation data is for.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Money netRate;

    /* If this reconciliation data is for a {@link ProposalLineItem}
     * and the {@link #pricingModel}
     *                 is {@link PricingModel#GROSS}, then this contains
     * the {@link Money gross rate} of
     *                 the proposal line item. Otherwise, the value of this
     * field will be the same as
     *                 the {@link #netRate}.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Money grossRate;

    /* If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains that proposal line item's proposal's pricing model.
     * Otherwise, the value of this field will be {@link PricingModel#NET}.
     * This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.PricingModel pricingModel;

    /* The volume recorded by the DoubleClick for Publishers ad server.
     * The meaning of this value depends on the {@link #rateType}, for example
     * if the {@link #rateType} is {@link RateType#CPC}, it represents clicks;
     * if the {@link #rateType} is {@link RateType#CPM}, it represents impressions;
     * if the {@link #rateType} is {@link RateType#CPD}, it represents line
     * item days.
     *                 This value is read-only. */
    private java.lang.Long dfpVolume;

    /* The volume recorded by the third-party ad server.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is optional and defaults to {@code null}. */
    private java.lang.Long thirdPartyVolume;

    /* A manually entered volume.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is optional and defaults to {@code null}. */
    private java.lang.Long manualVolume;

    /* Specifies which of {@link #dfpVolume}, {@link #thirdPartyVolume},
     * or {@link #manualVolume}
     *                 should be used as the {@link #reconciledVolume}.
     *                 The value is optional. If this reconciliation data
     * is for a {@link ProposalLineItem} then
     *                 this will default to the proposal line item's {@link
     * ProposalLineItem#billingSource}.
     *                 Otherwise, this will default to {@link BillFrom#DFP}. */
    private com.google.api.ads.dfp.axis.v201802.BillFrom reconciliationSource;

    /* The reconciled volume, which is a <i>view</i> of one of the
     * other volume fields depending on
     *                 what the {@link #reconciliationSource} is set to.
     * The different possibilities are as follows:
     *                 <table>
     *                 <tr>
     *                 <th>{@link #reconciliationSource Reconciliation source}</th>
     * <th>Value of this field</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#MANUAL}</td>
     *                 <td>{@link #manualVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#DFP}</td>
     *                 <td>{@link #dfpVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#THIRD_PARTY}</td>
     *                 <td>{@link #thirdPartyVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#DEFAULT}</td>
     *                 <td>Calculated by Google to be either {@link #dfpVolume}
     * or {@link #thirdPartyVolume}.</td>
     *                 </tr>
     *                 </table>
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is read-only. */
    private java.lang.Long reconciledVolume;

    /* If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the cap
     *                 volume, which is calculated based on the proposal
     * line item's billing settings
     *                 (may be {@code null} for certain billing settings).
     * Otherwise, this is {@code null}.
     *                 This value is read-only. */
    private java.lang.Long capVolume;

    /* If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the rollover
     *                 volume from previous cycles, which is calculated based
     * on the proposal line item's billing
     *                 settings (may be {@code null} for certain billing
     * settings). Otherwise, this is {@code null}.
     *                 This value is read-only. */
    private java.lang.Long rolloverVolume;

    /* If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the billable
     *                 volume, which is calculated from the {@link #reconciledVolume}
     * and
     *                 the proposal line item's billing settings
     *                 (may be {@code null} for certain billing settings).
     * Otherwise, the value of this field will be the same as the {@link
     * #reconciledVolume}.
     *                 This value is read-only. */
    private java.lang.Long billableVolume;

    /* The net billable revenue. If this reconciliation data is for
     * a {@link ProposalLineItem},
     *                 this is calculated from the {@link #netRate}, {@link
     * #billableVolume}, and the proposal line
     *                 item's billing settings. This may be {@code null}
     * for certain billing settings.
     *                 Otherwise, this is calculated from the {@link #netRate}
     * and {@link #billableVolume}.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Money netBillableRevenue;

    /* The gross billable revenue. If this reconciliation data is
     * for a {@link ProposalLineItem}
     *                 and the {@link #pricingModel} is {@link PricingModel#GROSS},
     * this is calculated from the
     *                 {@link #grossRate}, {@link #billableVolume}, and the
     * proposal line item's billing settings.
     *                 This may be {@code null} for certain billing settings.
     * Otherwise, the value of this field will
     *                 be the same as the {@link #netBillableRevenue}.
     *                 This value is read-only. */
    private com.google.api.ads.dfp.axis.v201802.Money grossBillableRevenue;

    /* Manual overrides for the Google calculated billable revenue
     * fields. If set, it indicates that
     *                 these values should be used as the final billable
     * revenue instead of the Google calculated
     *                 ones.
     *                 This value is optional and defaults to {@code null}. */
    private com.google.api.ads.dfp.axis.v201802.BillableRevenueOverrides billableRevenueOverrides;

    public ReconciliationLineItemReport() {
    }

    public ReconciliationLineItemReport(
           java.lang.Long id,
           java.lang.Long reconciliationReportId,
           java.lang.Long orderId,
           java.lang.Long proposalId,
           java.lang.Long lineItemId,
           java.lang.Long proposalLineItemId,
           com.google.api.ads.dfp.axis.v201802.RateType rateType,
           com.google.api.ads.dfp.axis.v201802.Money netRate,
           com.google.api.ads.dfp.axis.v201802.Money grossRate,
           com.google.api.ads.dfp.axis.v201802.PricingModel pricingModel,
           java.lang.Long dfpVolume,
           java.lang.Long thirdPartyVolume,
           java.lang.Long manualVolume,
           com.google.api.ads.dfp.axis.v201802.BillFrom reconciliationSource,
           java.lang.Long reconciledVolume,
           java.lang.Long capVolume,
           java.lang.Long rolloverVolume,
           java.lang.Long billableVolume,
           com.google.api.ads.dfp.axis.v201802.Money netBillableRevenue,
           com.google.api.ads.dfp.axis.v201802.Money grossBillableRevenue,
           com.google.api.ads.dfp.axis.v201802.BillableRevenueOverrides billableRevenueOverrides) {
           this.id = id;
           this.reconciliationReportId = reconciliationReportId;
           this.orderId = orderId;
           this.proposalId = proposalId;
           this.lineItemId = lineItemId;
           this.proposalLineItemId = proposalLineItemId;
           this.rateType = rateType;
           this.netRate = netRate;
           this.grossRate = grossRate;
           this.pricingModel = pricingModel;
           this.dfpVolume = dfpVolume;
           this.thirdPartyVolume = thirdPartyVolume;
           this.manualVolume = manualVolume;
           this.reconciliationSource = reconciliationSource;
           this.reconciledVolume = reconciledVolume;
           this.capVolume = capVolume;
           this.rolloverVolume = rolloverVolume;
           this.billableVolume = billableVolume;
           this.netBillableRevenue = netBillableRevenue;
           this.grossBillableRevenue = grossBillableRevenue;
           this.billableRevenueOverrides = billableRevenueOverrides;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("billableRevenueOverrides", getBillableRevenueOverrides())
            .add("billableVolume", getBillableVolume())
            .add("capVolume", getCapVolume())
            .add("dfpVolume", getDfpVolume())
            .add("grossBillableRevenue", getGrossBillableRevenue())
            .add("grossRate", getGrossRate())
            .add("id", getId())
            .add("lineItemId", getLineItemId())
            .add("manualVolume", getManualVolume())
            .add("netBillableRevenue", getNetBillableRevenue())
            .add("netRate", getNetRate())
            .add("orderId", getOrderId())
            .add("pricingModel", getPricingModel())
            .add("proposalId", getProposalId())
            .add("proposalLineItemId", getProposalLineItemId())
            .add("rateType", getRateType())
            .add("reconciledVolume", getReconciledVolume())
            .add("reconciliationReportId", getReconciliationReportId())
            .add("reconciliationSource", getReconciliationSource())
            .add("rolloverVolume", getRolloverVolume())
            .add("thirdPartyVolume", getThirdPartyVolume())
            .toString();
    }

    /**
     * Gets the id value for this ReconciliationLineItemReport.
     * 
     * @return id   * Uniquely identifies the {@code ReconciliationLineItemReport}.
     * This value is read-only and assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ReconciliationLineItemReport.
     * 
     * @param id   * Uniquely identifies the {@code ReconciliationLineItemReport}.
     * This value is read-only and assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the reconciliationReportId value for this ReconciliationLineItemReport.
     * 
     * @return reconciliationReportId   * The ID of the {@link ReconciliationReport} this {@code ReconciliationLineItemReport}
     * belongs to.
     *                 This value is read-only.
     */
    public java.lang.Long getReconciliationReportId() {
        return reconciliationReportId;
    }


    /**
     * Sets the reconciliationReportId value for this ReconciliationLineItemReport.
     * 
     * @param reconciliationReportId   * The ID of the {@link ReconciliationReport} this {@code ReconciliationLineItemReport}
     * belongs to.
     *                 This value is read-only.
     */
    public void setReconciliationReportId(java.lang.Long reconciliationReportId) {
        this.reconciliationReportId = reconciliationReportId;
    }


    /**
     * Gets the orderId value for this ReconciliationLineItemReport.
     * 
     * @return orderId   * If this reconciliation data is for a {@link LineItem}, then
     * this contains the ID of the order
     *                 that line item belongs to. Otherwise, this field will
     * have a value of 0.
     *                 This value is read-only.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ReconciliationLineItemReport.
     * 
     * @param orderId   * If this reconciliation data is for a {@link LineItem}, then
     * this contains the ID of the order
     *                 that line item belongs to. Otherwise, this field will
     * have a value of 0.
     *                 This value is read-only.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the proposalId value for this ReconciliationLineItemReport.
     * 
     * @return proposalId   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the ID of
     *                 the proposal that proposal line item belongs to. Otherwise,
     * this field will have a value of 0.
     *                 This value is read-only.
     */
    public java.lang.Long getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this ReconciliationLineItemReport.
     * 
     * @param proposalId   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the ID of
     *                 the proposal that proposal line item belongs to. Otherwise,
     * this field will have a value of 0.
     *                 This value is read-only.
     */
    public void setProposalId(java.lang.Long proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the lineItemId value for this ReconciliationLineItemReport.
     * 
     * @return lineItemId   * If this reconciliation data is for a {@link LineItem}, then
     * this contains that line item's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this ReconciliationLineItemReport.
     * 
     * @param lineItemId   * If this reconciliation data is for a {@link LineItem}, then
     * this contains that line item's ID.
     *                 Otherwise, this field will have a value of 0.
     *                 This value is read-only.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the proposalLineItemId value for this ReconciliationLineItemReport.
     * 
     * @return proposalLineItemId   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains that proposal line item's ID. Otherwise, this field
     * will have a value of 0.
     *                 This value is read-only.
     */
    public java.lang.Long getProposalLineItemId() {
        return proposalLineItemId;
    }


    /**
     * Sets the proposalLineItemId value for this ReconciliationLineItemReport.
     * 
     * @param proposalLineItemId   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains that proposal line item's ID. Otherwise, this field
     * will have a value of 0.
     *                 This value is read-only.
     */
    public void setProposalLineItemId(java.lang.Long proposalLineItemId) {
        this.proposalLineItemId = proposalLineItemId;
    }


    /**
     * Gets the rateType value for this ReconciliationLineItemReport.
     * 
     * @return rateType   * The {@link RateType} of the {@link LineItem} and/or {@link
     * ProposalLineItem}
     *                 this reconciliation data is for.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ReconciliationLineItemReport.
     * 
     * @param rateType   * The {@link RateType} of the {@link LineItem} and/or {@link
     * ProposalLineItem}
     *                 this reconciliation data is for.
     *                 This value is read-only.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201802.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the netRate value for this ReconciliationLineItemReport.
     * 
     * @return netRate   * The {@link Money net rate} of the {@link LineItem} and/or {@link
     * ProposalLineItem}
     *                 this reconciliation data is for.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getNetRate() {
        return netRate;
    }


    /**
     * Sets the netRate value for this ReconciliationLineItemReport.
     * 
     * @param netRate   * The {@link Money net rate} of the {@link LineItem} and/or {@link
     * ProposalLineItem}
     *                 this reconciliation data is for.
     *                 This value is read-only.
     */
    public void setNetRate(com.google.api.ads.dfp.axis.v201802.Money netRate) {
        this.netRate = netRate;
    }


    /**
     * Gets the grossRate value for this ReconciliationLineItemReport.
     * 
     * @return grossRate   * If this reconciliation data is for a {@link ProposalLineItem}
     * and the {@link #pricingModel}
     *                 is {@link PricingModel#GROSS}, then this contains
     * the {@link Money gross rate} of
     *                 the proposal line item. Otherwise, the value of this
     * field will be the same as
     *                 the {@link #netRate}.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getGrossRate() {
        return grossRate;
    }


    /**
     * Sets the grossRate value for this ReconciliationLineItemReport.
     * 
     * @param grossRate   * If this reconciliation data is for a {@link ProposalLineItem}
     * and the {@link #pricingModel}
     *                 is {@link PricingModel#GROSS}, then this contains
     * the {@link Money gross rate} of
     *                 the proposal line item. Otherwise, the value of this
     * field will be the same as
     *                 the {@link #netRate}.
     *                 This value is read-only.
     */
    public void setGrossRate(com.google.api.ads.dfp.axis.v201802.Money grossRate) {
        this.grossRate = grossRate;
    }


    /**
     * Gets the pricingModel value for this ReconciliationLineItemReport.
     * 
     * @return pricingModel   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains that proposal line item's proposal's pricing model.
     * Otherwise, the value of this field will be {@link PricingModel#NET}.
     * This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.PricingModel getPricingModel() {
        return pricingModel;
    }


    /**
     * Sets the pricingModel value for this ReconciliationLineItemReport.
     * 
     * @param pricingModel   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains that proposal line item's proposal's pricing model.
     * Otherwise, the value of this field will be {@link PricingModel#NET}.
     * This value is read-only.
     */
    public void setPricingModel(com.google.api.ads.dfp.axis.v201802.PricingModel pricingModel) {
        this.pricingModel = pricingModel;
    }


    /**
     * Gets the dfpVolume value for this ReconciliationLineItemReport.
     * 
     * @return dfpVolume   * The volume recorded by the DoubleClick for Publishers ad server.
     * The meaning of this value depends on the {@link #rateType}, for example
     * if the {@link #rateType} is {@link RateType#CPC}, it represents clicks;
     * if the {@link #rateType} is {@link RateType#CPM}, it represents impressions;
     * if the {@link #rateType} is {@link RateType#CPD}, it represents line
     * item days.
     *                 This value is read-only.
     */
    public java.lang.Long getDfpVolume() {
        return dfpVolume;
    }


    /**
     * Sets the dfpVolume value for this ReconciliationLineItemReport.
     * 
     * @param dfpVolume   * The volume recorded by the DoubleClick for Publishers ad server.
     * The meaning of this value depends on the {@link #rateType}, for example
     * if the {@link #rateType} is {@link RateType#CPC}, it represents clicks;
     * if the {@link #rateType} is {@link RateType#CPM}, it represents impressions;
     * if the {@link #rateType} is {@link RateType#CPD}, it represents line
     * item days.
     *                 This value is read-only.
     */
    public void setDfpVolume(java.lang.Long dfpVolume) {
        this.dfpVolume = dfpVolume;
    }


    /**
     * Gets the thirdPartyVolume value for this ReconciliationLineItemReport.
     * 
     * @return thirdPartyVolume   * The volume recorded by the third-party ad server.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is optional and defaults to {@code null}.
     */
    public java.lang.Long getThirdPartyVolume() {
        return thirdPartyVolume;
    }


    /**
     * Sets the thirdPartyVolume value for this ReconciliationLineItemReport.
     * 
     * @param thirdPartyVolume   * The volume recorded by the third-party ad server.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is optional and defaults to {@code null}.
     */
    public void setThirdPartyVolume(java.lang.Long thirdPartyVolume) {
        this.thirdPartyVolume = thirdPartyVolume;
    }


    /**
     * Gets the manualVolume value for this ReconciliationLineItemReport.
     * 
     * @return manualVolume   * A manually entered volume.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is optional and defaults to {@code null}.
     */
    public java.lang.Long getManualVolume() {
        return manualVolume;
    }


    /**
     * Sets the manualVolume value for this ReconciliationLineItemReport.
     * 
     * @param manualVolume   * A manually entered volume.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is optional and defaults to {@code null}.
     */
    public void setManualVolume(java.lang.Long manualVolume) {
        this.manualVolume = manualVolume;
    }


    /**
     * Gets the reconciliationSource value for this ReconciliationLineItemReport.
     * 
     * @return reconciliationSource   * Specifies which of {@link #dfpVolume}, {@link #thirdPartyVolume},
     * or {@link #manualVolume}
     *                 should be used as the {@link #reconciledVolume}.
     *                 The value is optional. If this reconciliation data
     * is for a {@link ProposalLineItem} then
     *                 this will default to the proposal line item's {@link
     * ProposalLineItem#billingSource}.
     *                 Otherwise, this will default to {@link BillFrom#DFP}.
     */
    public com.google.api.ads.dfp.axis.v201802.BillFrom getReconciliationSource() {
        return reconciliationSource;
    }


    /**
     * Sets the reconciliationSource value for this ReconciliationLineItemReport.
     * 
     * @param reconciliationSource   * Specifies which of {@link #dfpVolume}, {@link #thirdPartyVolume},
     * or {@link #manualVolume}
     *                 should be used as the {@link #reconciledVolume}.
     *                 The value is optional. If this reconciliation data
     * is for a {@link ProposalLineItem} then
     *                 this will default to the proposal line item's {@link
     * ProposalLineItem#billingSource}.
     *                 Otherwise, this will default to {@link BillFrom#DFP}.
     */
    public void setReconciliationSource(com.google.api.ads.dfp.axis.v201802.BillFrom reconciliationSource) {
        this.reconciliationSource = reconciliationSource;
    }


    /**
     * Gets the reconciledVolume value for this ReconciliationLineItemReport.
     * 
     * @return reconciledVolume   * The reconciled volume, which is a <i>view</i> of one of the
     * other volume fields depending on
     *                 what the {@link #reconciliationSource} is set to.
     * The different possibilities are as follows:
     *                 <table>
     *                 <tr>
     *                 <th>{@link #reconciliationSource Reconciliation source}</th>
     * <th>Value of this field</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#MANUAL}</td>
     *                 <td>{@link #manualVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#DFP}</td>
     *                 <td>{@link #dfpVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#THIRD_PARTY}</td>
     *                 <td>{@link #thirdPartyVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#DEFAULT}</td>
     *                 <td>Calculated by Google to be either {@link #dfpVolume}
     * or {@link #thirdPartyVolume}.</td>
     *                 </tr>
     *                 </table>
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is read-only.
     */
    public java.lang.Long getReconciledVolume() {
        return reconciledVolume;
    }


    /**
     * Sets the reconciledVolume value for this ReconciliationLineItemReport.
     * 
     * @param reconciledVolume   * The reconciled volume, which is a <i>view</i> of one of the
     * other volume fields depending on
     *                 what the {@link #reconciliationSource} is set to.
     * The different possibilities are as follows:
     *                 <table>
     *                 <tr>
     *                 <th>{@link #reconciliationSource Reconciliation source}</th>
     * <th>Value of this field</th>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#MANUAL}</td>
     *                 <td>{@link #manualVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#DFP}</td>
     *                 <td>{@link #dfpVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#THIRD_PARTY}</td>
     *                 <td>{@link #thirdPartyVolume}</td>
     *                 </tr>
     *                 <tr>
     *                 <td>{@link BillFrom#DEFAULT}</td>
     *                 <td>Calculated by Google to be either {@link #dfpVolume}
     * or {@link #thirdPartyVolume}.</td>
     *                 </tr>
     *                 </table>
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 This value is read-only.
     */
    public void setReconciledVolume(java.lang.Long reconciledVolume) {
        this.reconciledVolume = reconciledVolume;
    }


    /**
     * Gets the capVolume value for this ReconciliationLineItemReport.
     * 
     * @return capVolume   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the cap
     *                 volume, which is calculated based on the proposal
     * line item's billing settings
     *                 (may be {@code null} for certain billing settings).
     * Otherwise, this is {@code null}.
     *                 This value is read-only.
     */
    public java.lang.Long getCapVolume() {
        return capVolume;
    }


    /**
     * Sets the capVolume value for this ReconciliationLineItemReport.
     * 
     * @param capVolume   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the cap
     *                 volume, which is calculated based on the proposal
     * line item's billing settings
     *                 (may be {@code null} for certain billing settings).
     * Otherwise, this is {@code null}.
     *                 This value is read-only.
     */
    public void setCapVolume(java.lang.Long capVolume) {
        this.capVolume = capVolume;
    }


    /**
     * Gets the rolloverVolume value for this ReconciliationLineItemReport.
     * 
     * @return rolloverVolume   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the rollover
     *                 volume from previous cycles, which is calculated based
     * on the proposal line item's billing
     *                 settings (may be {@code null} for certain billing
     * settings). Otherwise, this is {@code null}.
     *                 This value is read-only.
     */
    public java.lang.Long getRolloverVolume() {
        return rolloverVolume;
    }


    /**
     * Sets the rolloverVolume value for this ReconciliationLineItemReport.
     * 
     * @param rolloverVolume   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the rollover
     *                 volume from previous cycles, which is calculated based
     * on the proposal line item's billing
     *                 settings (may be {@code null} for certain billing
     * settings). Otherwise, this is {@code null}.
     *                 This value is read-only.
     */
    public void setRolloverVolume(java.lang.Long rolloverVolume) {
        this.rolloverVolume = rolloverVolume;
    }


    /**
     * Gets the billableVolume value for this ReconciliationLineItemReport.
     * 
     * @return billableVolume   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the billable
     *                 volume, which is calculated from the {@link #reconciledVolume}
     * and
     *                 the proposal line item's billing settings
     *                 (may be {@code null} for certain billing settings).
     * Otherwise, the value of this field will be the same as the {@link
     * #reconciledVolume}.
     *                 This value is read-only.
     */
    public java.lang.Long getBillableVolume() {
        return billableVolume;
    }


    /**
     * Sets the billableVolume value for this ReconciliationLineItemReport.
     * 
     * @param billableVolume   * If this reconciliation data is for a {@link ProposalLineItem},
     * then this contains the billable
     *                 volume, which is calculated from the {@link #reconciledVolume}
     * and
     *                 the proposal line item's billing settings
     *                 (may be {@code null} for certain billing settings).
     * Otherwise, the value of this field will be the same as the {@link
     * #reconciledVolume}.
     *                 This value is read-only.
     */
    public void setBillableVolume(java.lang.Long billableVolume) {
        this.billableVolume = billableVolume;
    }


    /**
     * Gets the netBillableRevenue value for this ReconciliationLineItemReport.
     * 
     * @return netBillableRevenue   * The net billable revenue. If this reconciliation data is for
     * a {@link ProposalLineItem},
     *                 this is calculated from the {@link #netRate}, {@link
     * #billableVolume}, and the proposal line
     *                 item's billing settings. This may be {@code null}
     * for certain billing settings.
     *                 Otherwise, this is calculated from the {@link #netRate}
     * and {@link #billableVolume}.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getNetBillableRevenue() {
        return netBillableRevenue;
    }


    /**
     * Sets the netBillableRevenue value for this ReconciliationLineItemReport.
     * 
     * @param netBillableRevenue   * The net billable revenue. If this reconciliation data is for
     * a {@link ProposalLineItem},
     *                 this is calculated from the {@link #netRate}, {@link
     * #billableVolume}, and the proposal line
     *                 item's billing settings. This may be {@code null}
     * for certain billing settings.
     *                 Otherwise, this is calculated from the {@link #netRate}
     * and {@link #billableVolume}.
     *                 This value is read-only.
     */
    public void setNetBillableRevenue(com.google.api.ads.dfp.axis.v201802.Money netBillableRevenue) {
        this.netBillableRevenue = netBillableRevenue;
    }


    /**
     * Gets the grossBillableRevenue value for this ReconciliationLineItemReport.
     * 
     * @return grossBillableRevenue   * The gross billable revenue. If this reconciliation data is
     * for a {@link ProposalLineItem}
     *                 and the {@link #pricingModel} is {@link PricingModel#GROSS},
     * this is calculated from the
     *                 {@link #grossRate}, {@link #billableVolume}, and the
     * proposal line item's billing settings.
     *                 This may be {@code null} for certain billing settings.
     * Otherwise, the value of this field will
     *                 be the same as the {@link #netBillableRevenue}.
     *                 This value is read-only.
     */
    public com.google.api.ads.dfp.axis.v201802.Money getGrossBillableRevenue() {
        return grossBillableRevenue;
    }


    /**
     * Sets the grossBillableRevenue value for this ReconciliationLineItemReport.
     * 
     * @param grossBillableRevenue   * The gross billable revenue. If this reconciliation data is
     * for a {@link ProposalLineItem}
     *                 and the {@link #pricingModel} is {@link PricingModel#GROSS},
     * this is calculated from the
     *                 {@link #grossRate}, {@link #billableVolume}, and the
     * proposal line item's billing settings.
     *                 This may be {@code null} for certain billing settings.
     * Otherwise, the value of this field will
     *                 be the same as the {@link #netBillableRevenue}.
     *                 This value is read-only.
     */
    public void setGrossBillableRevenue(com.google.api.ads.dfp.axis.v201802.Money grossBillableRevenue) {
        this.grossBillableRevenue = grossBillableRevenue;
    }


    /**
     * Gets the billableRevenueOverrides value for this ReconciliationLineItemReport.
     * 
     * @return billableRevenueOverrides   * Manual overrides for the Google calculated billable revenue
     * fields. If set, it indicates that
     *                 these values should be used as the final billable
     * revenue instead of the Google calculated
     *                 ones.
     *                 This value is optional and defaults to {@code null}.
     */
    public com.google.api.ads.dfp.axis.v201802.BillableRevenueOverrides getBillableRevenueOverrides() {
        return billableRevenueOverrides;
    }


    /**
     * Sets the billableRevenueOverrides value for this ReconciliationLineItemReport.
     * 
     * @param billableRevenueOverrides   * Manual overrides for the Google calculated billable revenue
     * fields. If set, it indicates that
     *                 these values should be used as the final billable
     * revenue instead of the Google calculated
     *                 ones.
     *                 This value is optional and defaults to {@code null}.
     */
    public void setBillableRevenueOverrides(com.google.api.ads.dfp.axis.v201802.BillableRevenueOverrides billableRevenueOverrides) {
        this.billableRevenueOverrides = billableRevenueOverrides;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationLineItemReport)) return false;
        ReconciliationLineItemReport other = (ReconciliationLineItemReport) obj;
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
            ((this.reconciliationReportId==null && other.getReconciliationReportId()==null) || 
             (this.reconciliationReportId!=null &&
              this.reconciliationReportId.equals(other.getReconciliationReportId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.proposalLineItemId==null && other.getProposalLineItemId()==null) || 
             (this.proposalLineItemId!=null &&
              this.proposalLineItemId.equals(other.getProposalLineItemId()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.netRate==null && other.getNetRate()==null) || 
             (this.netRate!=null &&
              this.netRate.equals(other.getNetRate()))) &&
            ((this.grossRate==null && other.getGrossRate()==null) || 
             (this.grossRate!=null &&
              this.grossRate.equals(other.getGrossRate()))) &&
            ((this.pricingModel==null && other.getPricingModel()==null) || 
             (this.pricingModel!=null &&
              this.pricingModel.equals(other.getPricingModel()))) &&
            ((this.dfpVolume==null && other.getDfpVolume()==null) || 
             (this.dfpVolume!=null &&
              this.dfpVolume.equals(other.getDfpVolume()))) &&
            ((this.thirdPartyVolume==null && other.getThirdPartyVolume()==null) || 
             (this.thirdPartyVolume!=null &&
              this.thirdPartyVolume.equals(other.getThirdPartyVolume()))) &&
            ((this.manualVolume==null && other.getManualVolume()==null) || 
             (this.manualVolume!=null &&
              this.manualVolume.equals(other.getManualVolume()))) &&
            ((this.reconciliationSource==null && other.getReconciliationSource()==null) || 
             (this.reconciliationSource!=null &&
              this.reconciliationSource.equals(other.getReconciliationSource()))) &&
            ((this.reconciledVolume==null && other.getReconciledVolume()==null) || 
             (this.reconciledVolume!=null &&
              this.reconciledVolume.equals(other.getReconciledVolume()))) &&
            ((this.capVolume==null && other.getCapVolume()==null) || 
             (this.capVolume!=null &&
              this.capVolume.equals(other.getCapVolume()))) &&
            ((this.rolloverVolume==null && other.getRolloverVolume()==null) || 
             (this.rolloverVolume!=null &&
              this.rolloverVolume.equals(other.getRolloverVolume()))) &&
            ((this.billableVolume==null && other.getBillableVolume()==null) || 
             (this.billableVolume!=null &&
              this.billableVolume.equals(other.getBillableVolume()))) &&
            ((this.netBillableRevenue==null && other.getNetBillableRevenue()==null) || 
             (this.netBillableRevenue!=null &&
              this.netBillableRevenue.equals(other.getNetBillableRevenue()))) &&
            ((this.grossBillableRevenue==null && other.getGrossBillableRevenue()==null) || 
             (this.grossBillableRevenue!=null &&
              this.grossBillableRevenue.equals(other.getGrossBillableRevenue()))) &&
            ((this.billableRevenueOverrides==null && other.getBillableRevenueOverrides()==null) || 
             (this.billableRevenueOverrides!=null &&
              this.billableRevenueOverrides.equals(other.getBillableRevenueOverrides())));
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
        if (getReconciliationReportId() != null) {
            _hashCode += getReconciliationReportId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getProposalLineItemId() != null) {
            _hashCode += getProposalLineItemId().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getNetRate() != null) {
            _hashCode += getNetRate().hashCode();
        }
        if (getGrossRate() != null) {
            _hashCode += getGrossRate().hashCode();
        }
        if (getPricingModel() != null) {
            _hashCode += getPricingModel().hashCode();
        }
        if (getDfpVolume() != null) {
            _hashCode += getDfpVolume().hashCode();
        }
        if (getThirdPartyVolume() != null) {
            _hashCode += getThirdPartyVolume().hashCode();
        }
        if (getManualVolume() != null) {
            _hashCode += getManualVolume().hashCode();
        }
        if (getReconciliationSource() != null) {
            _hashCode += getReconciliationSource().hashCode();
        }
        if (getReconciledVolume() != null) {
            _hashCode += getReconciledVolume().hashCode();
        }
        if (getCapVolume() != null) {
            _hashCode += getCapVolume().hashCode();
        }
        if (getRolloverVolume() != null) {
            _hashCode += getRolloverVolume().hashCode();
        }
        if (getBillableVolume() != null) {
            _hashCode += getBillableVolume().hashCode();
        }
        if (getNetBillableRevenue() != null) {
            _hashCode += getNetBillableRevenue().hashCode();
        }
        if (getGrossBillableRevenue() != null) {
            _hashCode += getGrossBillableRevenue().hashCode();
        }
        if (getBillableRevenueOverrides() != null) {
            _hashCode += getBillableRevenueOverrides().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationLineItemReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "ReconciliationLineItemReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationReportId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reconciliationReportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "orderId"));
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
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalLineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "proposalLineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("pricingModel");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "pricingModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "PricingModel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "dfpVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "thirdPartyVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "manualVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationSource");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reconciliationSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillFrom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "reconciledVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "capVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolloverVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "rolloverVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billableVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netBillableRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "netBillableRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossBillableRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "grossBillableRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableRevenueOverrides");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "billableRevenueOverrides"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201802", "BillableRevenueOverrides"));
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
