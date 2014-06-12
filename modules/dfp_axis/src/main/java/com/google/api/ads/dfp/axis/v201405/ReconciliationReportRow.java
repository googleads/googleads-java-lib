/**
 * ReconciliationReportRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201405;


/**
 * A {@code ReconciliationReportRow} represents each row in the reconciliation
 * report.
 *             Each row is identified by its {@link #reconciliationReportId},
 * {@link #lineItemId},
 *             {@link #creativeId}, and {@link #proposalLineItemId}.
 */
public class ReconciliationReportRow  implements java.io.Serializable {
    /* The ID of the {@link ReconciliationReport}.
     *                 This attribute is read-only. */
    private java.lang.Long reconciliationReportId;

    /* The ID of the {@link LineItem}.
     *                 This attribute is read-only. */
    private java.lang.Long lineItemId;

    /* The ID of the {@link Creative}.
     *                 This attribute is read-only. */
    private java.lang.Long creativeId;

    /* The ID of the {@link Order}.
     *                 This attribute is read-only. */
    private java.lang.Long orderId;

    /* The ID of the {@link Company}.
     *                 This attribute is read-only. */
    private java.lang.Long advertiserId;

    /* Defines which source of volume to bill from.
     *                 This attribute is optional and defaults to {@link
     * BillFrom#DEFAULT}. */
    private com.google.api.ads.dfp.axis.v201405.BillFrom billFrom;

    /* {@link RateType} of the line item and proposal line item this
     * row represents.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201405.RateType rateType;

    /* The {@link LineItem#costPerUnit} of the line item this row
     * represents.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money lineItemCostPerUnit;

    /* The {@link LineItem#contractedUnitsBought} of the line item
     * this row represents.
     *                 {@code null} if it is unlimited.
     *                 This attribute is read-only. */
    private java.lang.Long lineItemContractedUnitsBought;

    /* The volume recorded by the DoubleClick for Publishers server.
     * The meaning of this value depends on the {@link #rateType}, for example
     * if the {@link #rateType} is {@link RateType#CPC}, it represents clicks;
     * if the {@link #rateType} is {@link RateType#CPM}, it represents impressions;
     * if the {@link #rateType} is {@link RateType#CPD}, it represents line
     * item days.
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#DFP},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is read-only. */
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
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is optional. */
    private java.lang.Long thirdPartyVolume;

    /* The volume manually entered.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is optional. */
    private java.lang.Long manualVolume;

    /* The volume depending upon the {@link #billFrom} value.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 
     *                 This attribute is read-only. */
    private java.lang.Long reconciledVolume;

    /* The revenue calculated based on the {@link #contractedGoal}
     * and {@link #costPerUnit}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money contractedRevenue;

    /* The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #dfpClicks}, {@link #dfpImpressions} and {@link
     * #dfpLineItemDays}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money dfpRevenue;

    /* The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #thirdPartyClicks}, {@link #thirdPartyImpressions}
     * and {@link #thirdPartyLineItemDays}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money thirdPartyRevenue;

    /* The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #manualClicks}, {@link #manualImpressions}
     * and {@link #manualLineItemDays}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money manualRevenue;

    /* The revenue calculated based on the {@link #billFrom}, {@link
     * #contractedRevenue},
     *                 {@link #dfpRevenue}, {@link #thirdPartyRevenue} and
     * {@link #manualRevenue}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201405.Money reconciledRevenue;

    /* The comments for this row.
     *                 This attribute is optional. */
    private java.lang.String comments;

    public ReconciliationReportRow() {
    }

    public ReconciliationReportRow(
           java.lang.Long reconciliationReportId,
           java.lang.Long lineItemId,
           java.lang.Long creativeId,
           java.lang.Long orderId,
           java.lang.Long advertiserId,
           com.google.api.ads.dfp.axis.v201405.BillFrom billFrom,
           com.google.api.ads.dfp.axis.v201405.RateType rateType,
           com.google.api.ads.dfp.axis.v201405.Money lineItemCostPerUnit,
           java.lang.Long lineItemContractedUnitsBought,
           java.lang.Long dfpVolume,
           java.lang.Long thirdPartyVolume,
           java.lang.Long manualVolume,
           java.lang.Long reconciledVolume,
           com.google.api.ads.dfp.axis.v201405.Money contractedRevenue,
           com.google.api.ads.dfp.axis.v201405.Money dfpRevenue,
           com.google.api.ads.dfp.axis.v201405.Money thirdPartyRevenue,
           com.google.api.ads.dfp.axis.v201405.Money manualRevenue,
           com.google.api.ads.dfp.axis.v201405.Money reconciledRevenue,
           java.lang.String comments) {
           this.reconciliationReportId = reconciliationReportId;
           this.lineItemId = lineItemId;
           this.creativeId = creativeId;
           this.orderId = orderId;
           this.advertiserId = advertiserId;
           this.billFrom = billFrom;
           this.rateType = rateType;
           this.lineItemCostPerUnit = lineItemCostPerUnit;
           this.lineItemContractedUnitsBought = lineItemContractedUnitsBought;
           this.dfpVolume = dfpVolume;
           this.thirdPartyVolume = thirdPartyVolume;
           this.manualVolume = manualVolume;
           this.reconciledVolume = reconciledVolume;
           this.contractedRevenue = contractedRevenue;
           this.dfpRevenue = dfpRevenue;
           this.thirdPartyRevenue = thirdPartyRevenue;
           this.manualRevenue = manualRevenue;
           this.reconciledRevenue = reconciledRevenue;
           this.comments = comments;
    }


    /**
     * Gets the reconciliationReportId value for this ReconciliationReportRow.
     * 
     * @return reconciliationReportId   * The ID of the {@link ReconciliationReport}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getReconciliationReportId() {
        return reconciliationReportId;
    }


    /**
     * Sets the reconciliationReportId value for this ReconciliationReportRow.
     * 
     * @param reconciliationReportId   * The ID of the {@link ReconciliationReport}.
     *                 This attribute is read-only.
     */
    public void setReconciliationReportId(java.lang.Long reconciliationReportId) {
        this.reconciliationReportId = reconciliationReportId;
    }


    /**
     * Gets the lineItemId value for this ReconciliationReportRow.
     * 
     * @return lineItemId   * The ID of the {@link LineItem}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getLineItemId() {
        return lineItemId;
    }


    /**
     * Sets the lineItemId value for this ReconciliationReportRow.
     * 
     * @param lineItemId   * The ID of the {@link LineItem}.
     *                 This attribute is read-only.
     */
    public void setLineItemId(java.lang.Long lineItemId) {
        this.lineItemId = lineItemId;
    }


    /**
     * Gets the creativeId value for this ReconciliationReportRow.
     * 
     * @return creativeId   * The ID of the {@link Creative}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getCreativeId() {
        return creativeId;
    }


    /**
     * Sets the creativeId value for this ReconciliationReportRow.
     * 
     * @param creativeId   * The ID of the {@link Creative}.
     *                 This attribute is read-only.
     */
    public void setCreativeId(java.lang.Long creativeId) {
        this.creativeId = creativeId;
    }


    /**
     * Gets the orderId value for this ReconciliationReportRow.
     * 
     * @return orderId   * The ID of the {@link Order}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this ReconciliationReportRow.
     * 
     * @param orderId   * The ID of the {@link Order}.
     *                 This attribute is read-only.
     */
    public void setOrderId(java.lang.Long orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the advertiserId value for this ReconciliationReportRow.
     * 
     * @return advertiserId   * The ID of the {@link Company}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getAdvertiserId() {
        return advertiserId;
    }


    /**
     * Sets the advertiserId value for this ReconciliationReportRow.
     * 
     * @param advertiserId   * The ID of the {@link Company}.
     *                 This attribute is read-only.
     */
    public void setAdvertiserId(java.lang.Long advertiserId) {
        this.advertiserId = advertiserId;
    }


    /**
     * Gets the billFrom value for this ReconciliationReportRow.
     * 
     * @return billFrom   * Defines which source of volume to bill from.
     *                 This attribute is optional and defaults to {@link
     * BillFrom#DEFAULT}.
     */
    public com.google.api.ads.dfp.axis.v201405.BillFrom getBillFrom() {
        return billFrom;
    }


    /**
     * Sets the billFrom value for this ReconciliationReportRow.
     * 
     * @param billFrom   * Defines which source of volume to bill from.
     *                 This attribute is optional and defaults to {@link
     * BillFrom#DEFAULT}.
     */
    public void setBillFrom(com.google.api.ads.dfp.axis.v201405.BillFrom billFrom) {
        this.billFrom = billFrom;
    }


    /**
     * Gets the rateType value for this ReconciliationReportRow.
     * 
     * @return rateType   * {@link RateType} of the line item and proposal line item this
     * row represents.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.RateType getRateType() {
        return rateType;
    }


    /**
     * Sets the rateType value for this ReconciliationReportRow.
     * 
     * @param rateType   * {@link RateType} of the line item and proposal line item this
     * row represents.
     *                 This attribute is read-only.
     */
    public void setRateType(com.google.api.ads.dfp.axis.v201405.RateType rateType) {
        this.rateType = rateType;
    }


    /**
     * Gets the lineItemCostPerUnit value for this ReconciliationReportRow.
     * 
     * @return lineItemCostPerUnit   * The {@link LineItem#costPerUnit} of the line item this row
     * represents.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getLineItemCostPerUnit() {
        return lineItemCostPerUnit;
    }


    /**
     * Sets the lineItemCostPerUnit value for this ReconciliationReportRow.
     * 
     * @param lineItemCostPerUnit   * The {@link LineItem#costPerUnit} of the line item this row
     * represents.
     *                 This attribute is read-only.
     */
    public void setLineItemCostPerUnit(com.google.api.ads.dfp.axis.v201405.Money lineItemCostPerUnit) {
        this.lineItemCostPerUnit = lineItemCostPerUnit;
    }


    /**
     * Gets the lineItemContractedUnitsBought value for this ReconciliationReportRow.
     * 
     * @return lineItemContractedUnitsBought   * The {@link LineItem#contractedUnitsBought} of the line item
     * this row represents.
     *                 {@code null} if it is unlimited.
     *                 This attribute is read-only.
     */
    public java.lang.Long getLineItemContractedUnitsBought() {
        return lineItemContractedUnitsBought;
    }


    /**
     * Sets the lineItemContractedUnitsBought value for this ReconciliationReportRow.
     * 
     * @param lineItemContractedUnitsBought   * The {@link LineItem#contractedUnitsBought} of the line item
     * this row represents.
     *                 {@code null} if it is unlimited.
     *                 This attribute is read-only.
     */
    public void setLineItemContractedUnitsBought(java.lang.Long lineItemContractedUnitsBought) {
        this.lineItemContractedUnitsBought = lineItemContractedUnitsBought;
    }


    /**
     * Gets the dfpVolume value for this ReconciliationReportRow.
     * 
     * @return dfpVolume   * The volume recorded by the DoubleClick for Publishers server.
     * The meaning of this value depends on the {@link #rateType}, for example
     * if the {@link #rateType} is {@link RateType#CPC}, it represents clicks;
     * if the {@link #rateType} is {@link RateType#CPM}, it represents impressions;
     * if the {@link #rateType} is {@link RateType#CPD}, it represents line
     * item days.
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#DFP},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is read-only.
     */
    public java.lang.Long getDfpVolume() {
        return dfpVolume;
    }


    /**
     * Sets the dfpVolume value for this ReconciliationReportRow.
     * 
     * @param dfpVolume   * The volume recorded by the DoubleClick for Publishers server.
     * The meaning of this value depends on the {@link #rateType}, for example
     * if the {@link #rateType} is {@link RateType#CPC}, it represents clicks;
     * if the {@link #rateType} is {@link RateType#CPM}, it represents impressions;
     * if the {@link #rateType} is {@link RateType#CPD}, it represents line
     * item days.
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#DFP},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is read-only.
     */
    public void setDfpVolume(java.lang.Long dfpVolume) {
        this.dfpVolume = dfpVolume;
    }


    /**
     * Gets the thirdPartyVolume value for this ReconciliationReportRow.
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
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is optional.
     */
    public java.lang.Long getThirdPartyVolume() {
        return thirdPartyVolume;
    }


    /**
     * Sets the thirdPartyVolume value for this ReconciliationReportRow.
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
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is optional.
     */
    public void setThirdPartyVolume(java.lang.Long thirdPartyVolume) {
        this.thirdPartyVolume = thirdPartyVolume;
    }


    /**
     * Gets the manualVolume value for this ReconciliationReportRow.
     * 
     * @return manualVolume   * The volume manually entered.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is optional.
     */
    public java.lang.Long getManualVolume() {
        return manualVolume;
    }


    /**
     * Sets the manualVolume value for this ReconciliationReportRow.
     * 
     * @param manualVolume   * The volume manually entered.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL},
     * this attribute will be set to
     *                 {@link #reconciledVolume} and used to calculate the
     * {@link #reconciledRevenue}.
     *                 
     *                 This attribute is optional.
     */
    public void setManualVolume(java.lang.Long manualVolume) {
        this.manualVolume = manualVolume;
    }


    /**
     * Gets the reconciledVolume value for this ReconciliationReportRow.
     * 
     * @return reconciledVolume   * The volume depending upon the {@link #billFrom} value.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 
     *                 This attribute is read-only.
     */
    public java.lang.Long getReconciledVolume() {
        return reconciledVolume;
    }


    /**
     * Sets the reconciledVolume value for this ReconciliationReportRow.
     * 
     * @param reconciledVolume   * The volume depending upon the {@link #billFrom} value.
     *                 The meaning of this value depends on the {@link #rateType},
     * for example
     *                 if the {@link #rateType} is {@link RateType#CPC},
     * it represents clicks;
     *                 if the {@link #rateType} is {@link RateType#CPM},
     * it represents impressions;
     *                 if the {@link #rateType} is {@link RateType#CPD},
     * it represents line item days.
     *                 
     *                 This attribute is read-only.
     */
    public void setReconciledVolume(java.lang.Long reconciledVolume) {
        this.reconciledVolume = reconciledVolume;
    }


    /**
     * Gets the contractedRevenue value for this ReconciliationReportRow.
     * 
     * @return contractedRevenue   * The revenue calculated based on the {@link #contractedGoal}
     * and {@link #costPerUnit}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getContractedRevenue() {
        return contractedRevenue;
    }


    /**
     * Sets the contractedRevenue value for this ReconciliationReportRow.
     * 
     * @param contractedRevenue   * The revenue calculated based on the {@link #contractedGoal}
     * and {@link #costPerUnit}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public void setContractedRevenue(com.google.api.ads.dfp.axis.v201405.Money contractedRevenue) {
        this.contractedRevenue = contractedRevenue;
    }


    /**
     * Gets the dfpRevenue value for this ReconciliationReportRow.
     * 
     * @return dfpRevenue   * The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #dfpClicks}, {@link #dfpImpressions} and {@link
     * #dfpLineItemDays}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getDfpRevenue() {
        return dfpRevenue;
    }


    /**
     * Sets the dfpRevenue value for this ReconciliationReportRow.
     * 
     * @param dfpRevenue   * The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #dfpClicks}, {@link #dfpImpressions} and {@link
     * #dfpLineItemDays}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public void setDfpRevenue(com.google.api.ads.dfp.axis.v201405.Money dfpRevenue) {
        this.dfpRevenue = dfpRevenue;
    }


    /**
     * Gets the thirdPartyRevenue value for this ReconciliationReportRow.
     * 
     * @return thirdPartyRevenue   * The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #thirdPartyClicks}, {@link #thirdPartyImpressions}
     * and {@link #thirdPartyLineItemDays}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getThirdPartyRevenue() {
        return thirdPartyRevenue;
    }


    /**
     * Sets the thirdPartyRevenue value for this ReconciliationReportRow.
     * 
     * @param thirdPartyRevenue   * The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #thirdPartyClicks}, {@link #thirdPartyImpressions}
     * and {@link #thirdPartyLineItemDays}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public void setThirdPartyRevenue(com.google.api.ads.dfp.axis.v201405.Money thirdPartyRevenue) {
        this.thirdPartyRevenue = thirdPartyRevenue;
    }


    /**
     * Gets the manualRevenue value for this ReconciliationReportRow.
     * 
     * @return manualRevenue   * The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #manualClicks}, {@link #manualImpressions}
     * and {@link #manualLineItemDays}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getManualRevenue() {
        return manualRevenue;
    }


    /**
     * Sets the manualRevenue value for this ReconciliationReportRow.
     * 
     * @param manualRevenue   * The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #manualClicks}, {@link #manualImpressions}
     * and {@link #manualLineItemDays}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public void setManualRevenue(com.google.api.ads.dfp.axis.v201405.Money manualRevenue) {
        this.manualRevenue = manualRevenue;
    }


    /**
     * Gets the reconciledRevenue value for this ReconciliationReportRow.
     * 
     * @return reconciledRevenue   * The revenue calculated based on the {@link #billFrom}, {@link
     * #contractedRevenue},
     *                 {@link #dfpRevenue}, {@link #thirdPartyRevenue} and
     * {@link #manualRevenue}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public com.google.api.ads.dfp.axis.v201405.Money getReconciledRevenue() {
        return reconciledRevenue;
    }


    /**
     * Sets the reconciledRevenue value for this ReconciliationReportRow.
     * 
     * @param reconciledRevenue   * The revenue calculated based on the {@link #billFrom}, {@link
     * #contractedRevenue},
     *                 {@link #dfpRevenue}, {@link #thirdPartyRevenue} and
     * {@link #manualRevenue}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public void setReconciledRevenue(com.google.api.ads.dfp.axis.v201405.Money reconciledRevenue) {
        this.reconciledRevenue = reconciledRevenue;
    }


    /**
     * Gets the comments value for this ReconciliationReportRow.
     * 
     * @return comments   * The comments for this row.
     *                 This attribute is optional.
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this ReconciliationReportRow.
     * 
     * @param comments   * The comments for this row.
     *                 This attribute is optional.
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReconciliationReportRow)) return false;
        ReconciliationReportRow other = (ReconciliationReportRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reconciliationReportId==null && other.getReconciliationReportId()==null) || 
             (this.reconciliationReportId!=null &&
              this.reconciliationReportId.equals(other.getReconciliationReportId()))) &&
            ((this.lineItemId==null && other.getLineItemId()==null) || 
             (this.lineItemId!=null &&
              this.lineItemId.equals(other.getLineItemId()))) &&
            ((this.creativeId==null && other.getCreativeId()==null) || 
             (this.creativeId!=null &&
              this.creativeId.equals(other.getCreativeId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.advertiserId==null && other.getAdvertiserId()==null) || 
             (this.advertiserId!=null &&
              this.advertiserId.equals(other.getAdvertiserId()))) &&
            ((this.billFrom==null && other.getBillFrom()==null) || 
             (this.billFrom!=null &&
              this.billFrom.equals(other.getBillFrom()))) &&
            ((this.rateType==null && other.getRateType()==null) || 
             (this.rateType!=null &&
              this.rateType.equals(other.getRateType()))) &&
            ((this.lineItemCostPerUnit==null && other.getLineItemCostPerUnit()==null) || 
             (this.lineItemCostPerUnit!=null &&
              this.lineItemCostPerUnit.equals(other.getLineItemCostPerUnit()))) &&
            ((this.lineItemContractedUnitsBought==null && other.getLineItemContractedUnitsBought()==null) || 
             (this.lineItemContractedUnitsBought!=null &&
              this.lineItemContractedUnitsBought.equals(other.getLineItemContractedUnitsBought()))) &&
            ((this.dfpVolume==null && other.getDfpVolume()==null) || 
             (this.dfpVolume!=null &&
              this.dfpVolume.equals(other.getDfpVolume()))) &&
            ((this.thirdPartyVolume==null && other.getThirdPartyVolume()==null) || 
             (this.thirdPartyVolume!=null &&
              this.thirdPartyVolume.equals(other.getThirdPartyVolume()))) &&
            ((this.manualVolume==null && other.getManualVolume()==null) || 
             (this.manualVolume!=null &&
              this.manualVolume.equals(other.getManualVolume()))) &&
            ((this.reconciledVolume==null && other.getReconciledVolume()==null) || 
             (this.reconciledVolume!=null &&
              this.reconciledVolume.equals(other.getReconciledVolume()))) &&
            ((this.contractedRevenue==null && other.getContractedRevenue()==null) || 
             (this.contractedRevenue!=null &&
              this.contractedRevenue.equals(other.getContractedRevenue()))) &&
            ((this.dfpRevenue==null && other.getDfpRevenue()==null) || 
             (this.dfpRevenue!=null &&
              this.dfpRevenue.equals(other.getDfpRevenue()))) &&
            ((this.thirdPartyRevenue==null && other.getThirdPartyRevenue()==null) || 
             (this.thirdPartyRevenue!=null &&
              this.thirdPartyRevenue.equals(other.getThirdPartyRevenue()))) &&
            ((this.manualRevenue==null && other.getManualRevenue()==null) || 
             (this.manualRevenue!=null &&
              this.manualRevenue.equals(other.getManualRevenue()))) &&
            ((this.reconciledRevenue==null && other.getReconciledRevenue()==null) || 
             (this.reconciledRevenue!=null &&
              this.reconciledRevenue.equals(other.getReconciledRevenue()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments())));
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
        if (getReconciliationReportId() != null) {
            _hashCode += getReconciliationReportId().hashCode();
        }
        if (getLineItemId() != null) {
            _hashCode += getLineItemId().hashCode();
        }
        if (getCreativeId() != null) {
            _hashCode += getCreativeId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getAdvertiserId() != null) {
            _hashCode += getAdvertiserId().hashCode();
        }
        if (getBillFrom() != null) {
            _hashCode += getBillFrom().hashCode();
        }
        if (getRateType() != null) {
            _hashCode += getRateType().hashCode();
        }
        if (getLineItemCostPerUnit() != null) {
            _hashCode += getLineItemCostPerUnit().hashCode();
        }
        if (getLineItemContractedUnitsBought() != null) {
            _hashCode += getLineItemContractedUnitsBought().hashCode();
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
        if (getReconciledVolume() != null) {
            _hashCode += getReconciledVolume().hashCode();
        }
        if (getContractedRevenue() != null) {
            _hashCode += getContractedRevenue().hashCode();
        }
        if (getDfpRevenue() != null) {
            _hashCode += getDfpRevenue().hashCode();
        }
        if (getThirdPartyRevenue() != null) {
            _hashCode += getThirdPartyRevenue().hashCode();
        }
        if (getManualRevenue() != null) {
            _hashCode += getManualRevenue().hashCode();
        }
        if (getReconciledRevenue() != null) {
            _hashCode += getReconciledRevenue().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReconciliationReportRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "ReconciliationReportRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationReportId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "reconciliationReportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "billFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "BillFrom"));
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
        elemField.setFieldName("lineItemCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lineItemCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemContractedUnitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "lineItemContractedUnitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "dfpVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "thirdPartyVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "manualVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "reconciledVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "contractedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "dfpRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "thirdPartyRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "manualRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "reconciledRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201405", "comments"));
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
