/**
 * ReconciliationReportRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201308;


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
    private com.google.api.ads.dfp.axis.v201308.BillFrom billFrom;

    /* The {@link LineItem#costType} of the line item this row represents.
     * This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201308.CostType lineItemCostType;

    /* The {@link LineItem#costPerUnit} of the line item this row
     * represents.
     *                 This attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201308.Money lineItemCostPerUnit;

    /* The {@link LineItem#contractedUnitsBought} of the line item
     * this row represents.
     *                 {@code null} if it is unlimited.
     *                 This attribute is read-only. */
    private java.lang.Long lineItemContractedUnitsBought;

    /* The clicks recorded by the DoubleClick for Publishers server.
     * If the {@link #billFrom} is {@link BillFrom#DFP} and the {@link #costType}
     * is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only. */
    private java.lang.Long dfpClicks;

    /* The impressions recorded by the DoubleClick for Publishers
     * server.
     *                 If the {@link #billFrom} is {@link BillFrom#DFP} and
     * the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only. */
    private java.lang.Long dfpImpressions;

    /* The number of days the line item be impressed and recorded
     * by DoubleClick for Publishers
     *                 server. If the {@link #billFrom} is {@link BillFrom#DFP}
     * and the {@link #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only. */
    private java.lang.Integer dfpLineItemDays;

    /* The clicks recorded by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional. */
    private java.lang.Long thirdPartyClicks;

    /* The impressions recorded by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional. */
    private java.lang.Long thirdPartyImpressions;

    /* The number of days the line item be impressed and recorded
     * by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional. */
    private java.lang.Integer thirdPartyLineItemDays;

    /* The clicks manually entered.
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL}
     * and the {@link #costType} is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional. */
    private java.lang.Long manualClicks;

    /* The impressions manually entered.
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL}
     * and the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional. */
    private java.lang.Long manualImpressions;

    /* The number of days the line item be impressed and entered manually.
     * If the {@link #billFrom} is {@link BillFrom#MANUAL} and the {@link
     * #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional. */
    private java.lang.Integer manualLineItemDays;

    /* The clicks depending upon the {@link #billFrom} value.
     *                 This attribute is read-only. */
    private java.lang.Long reconciledClicks;

    /* The impression depending upon the {@link #billFrom} value.
     *                 This attribute is read-only. */
    private java.lang.Long reconciledImpressions;

    /* The line item days depending upon the {@link #billFrom} value.
     * This attribute is read-only. */
    private java.lang.Integer reconciledLineItemDays;

    /* The revenue calculated based on the {@link #contractedGoal}
     * and {@link #costPerUnit}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201308.Money contractedRevenue;

    /* The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #dfpClicks}, {@link #dfpImpressions} and {@link
     * #dfpLineItemDays}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201308.Money dfpRevenue;

    /* The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #thirdPartyClicks}, {@link #thirdPartyImpressions}
     * and {@link #thirdPartyLineItemDays}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201308.Money thirdPartyRevenue;

    /* The revenue calculated based on the {@link #costPerUnit}, {@link
     * #costType},
     *                 {@link #manualClicks}, {@link #manualImpressions}
     * and {@link #manualLineItemDays}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201308.Money manualRevenue;

    /* The revenue calculated based on the {@link #billFrom}, {@link
     * #contractedRevenue},
     *                 {@link #dfpRevenue}, {@link #thirdPartyRevenue} and
     * {@link #manualRevenue}.
     *                 This attribute is calculated by Google and is read-only. */
    private com.google.api.ads.dfp.axis.v201308.Money reconciledRevenue;

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
           com.google.api.ads.dfp.axis.v201308.BillFrom billFrom,
           com.google.api.ads.dfp.axis.v201308.CostType lineItemCostType,
           com.google.api.ads.dfp.axis.v201308.Money lineItemCostPerUnit,
           java.lang.Long lineItemContractedUnitsBought,
           java.lang.Long dfpClicks,
           java.lang.Long dfpImpressions,
           java.lang.Integer dfpLineItemDays,
           java.lang.Long thirdPartyClicks,
           java.lang.Long thirdPartyImpressions,
           java.lang.Integer thirdPartyLineItemDays,
           java.lang.Long manualClicks,
           java.lang.Long manualImpressions,
           java.lang.Integer manualLineItemDays,
           java.lang.Long reconciledClicks,
           java.lang.Long reconciledImpressions,
           java.lang.Integer reconciledLineItemDays,
           com.google.api.ads.dfp.axis.v201308.Money contractedRevenue,
           com.google.api.ads.dfp.axis.v201308.Money dfpRevenue,
           com.google.api.ads.dfp.axis.v201308.Money thirdPartyRevenue,
           com.google.api.ads.dfp.axis.v201308.Money manualRevenue,
           com.google.api.ads.dfp.axis.v201308.Money reconciledRevenue,
           java.lang.String comments) {
           this.reconciliationReportId = reconciliationReportId;
           this.lineItemId = lineItemId;
           this.creativeId = creativeId;
           this.orderId = orderId;
           this.advertiserId = advertiserId;
           this.billFrom = billFrom;
           this.lineItemCostType = lineItemCostType;
           this.lineItemCostPerUnit = lineItemCostPerUnit;
           this.lineItemContractedUnitsBought = lineItemContractedUnitsBought;
           this.dfpClicks = dfpClicks;
           this.dfpImpressions = dfpImpressions;
           this.dfpLineItemDays = dfpLineItemDays;
           this.thirdPartyClicks = thirdPartyClicks;
           this.thirdPartyImpressions = thirdPartyImpressions;
           this.thirdPartyLineItemDays = thirdPartyLineItemDays;
           this.manualClicks = manualClicks;
           this.manualImpressions = manualImpressions;
           this.manualLineItemDays = manualLineItemDays;
           this.reconciledClicks = reconciledClicks;
           this.reconciledImpressions = reconciledImpressions;
           this.reconciledLineItemDays = reconciledLineItemDays;
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
    public com.google.api.ads.dfp.axis.v201308.BillFrom getBillFrom() {
        return billFrom;
    }


    /**
     * Sets the billFrom value for this ReconciliationReportRow.
     * 
     * @param billFrom   * Defines which source of volume to bill from.
     *                 This attribute is optional and defaults to {@link
     * BillFrom#DEFAULT}.
     */
    public void setBillFrom(com.google.api.ads.dfp.axis.v201308.BillFrom billFrom) {
        this.billFrom = billFrom;
    }


    /**
     * Gets the lineItemCostType value for this ReconciliationReportRow.
     * 
     * @return lineItemCostType   * The {@link LineItem#costType} of the line item this row represents.
     * This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201308.CostType getLineItemCostType() {
        return lineItemCostType;
    }


    /**
     * Sets the lineItemCostType value for this ReconciliationReportRow.
     * 
     * @param lineItemCostType   * The {@link LineItem#costType} of the line item this row represents.
     * This attribute is read-only.
     */
    public void setLineItemCostType(com.google.api.ads.dfp.axis.v201308.CostType lineItemCostType) {
        this.lineItemCostType = lineItemCostType;
    }


    /**
     * Gets the lineItemCostPerUnit value for this ReconciliationReportRow.
     * 
     * @return lineItemCostPerUnit   * The {@link LineItem#costPerUnit} of the line item this row
     * represents.
     *                 This attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201308.Money getLineItemCostPerUnit() {
        return lineItemCostPerUnit;
    }


    /**
     * Sets the lineItemCostPerUnit value for this ReconciliationReportRow.
     * 
     * @param lineItemCostPerUnit   * The {@link LineItem#costPerUnit} of the line item this row
     * represents.
     *                 This attribute is read-only.
     */
    public void setLineItemCostPerUnit(com.google.api.ads.dfp.axis.v201308.Money lineItemCostPerUnit) {
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
     * Gets the dfpClicks value for this ReconciliationReportRow.
     * 
     * @return dfpClicks   * The clicks recorded by the DoubleClick for Publishers server.
     * If the {@link #billFrom} is {@link BillFrom#DFP} and the {@link #costType}
     * is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getDfpClicks() {
        return dfpClicks;
    }


    /**
     * Sets the dfpClicks value for this ReconciliationReportRow.
     * 
     * @param dfpClicks   * The clicks recorded by the DoubleClick for Publishers server.
     * If the {@link #billFrom} is {@link BillFrom#DFP} and the {@link #costType}
     * is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only.
     */
    public void setDfpClicks(java.lang.Long dfpClicks) {
        this.dfpClicks = dfpClicks;
    }


    /**
     * Gets the dfpImpressions value for this ReconciliationReportRow.
     * 
     * @return dfpImpressions   * The impressions recorded by the DoubleClick for Publishers
     * server.
     *                 If the {@link #billFrom} is {@link BillFrom#DFP} and
     * the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only.
     */
    public java.lang.Long getDfpImpressions() {
        return dfpImpressions;
    }


    /**
     * Sets the dfpImpressions value for this ReconciliationReportRow.
     * 
     * @param dfpImpressions   * The impressions recorded by the DoubleClick for Publishers
     * server.
     *                 If the {@link #billFrom} is {@link BillFrom#DFP} and
     * the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only.
     */
    public void setDfpImpressions(java.lang.Long dfpImpressions) {
        this.dfpImpressions = dfpImpressions;
    }


    /**
     * Gets the dfpLineItemDays value for this ReconciliationReportRow.
     * 
     * @return dfpLineItemDays   * The number of days the line item be impressed and recorded
     * by DoubleClick for Publishers
     *                 server. If the {@link #billFrom} is {@link BillFrom#DFP}
     * and the {@link #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only.
     */
    public java.lang.Integer getDfpLineItemDays() {
        return dfpLineItemDays;
    }


    /**
     * Sets the dfpLineItemDays value for this ReconciliationReportRow.
     * 
     * @param dfpLineItemDays   * The number of days the line item be impressed and recorded
     * by DoubleClick for Publishers
     *                 server. If the {@link #billFrom} is {@link BillFrom#DFP}
     * and the {@link #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is read-only.
     */
    public void setDfpLineItemDays(java.lang.Integer dfpLineItemDays) {
        this.dfpLineItemDays = dfpLineItemDays;
    }


    /**
     * Gets the thirdPartyClicks value for this ReconciliationReportRow.
     * 
     * @return thirdPartyClicks   * The clicks recorded by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public java.lang.Long getThirdPartyClicks() {
        return thirdPartyClicks;
    }


    /**
     * Sets the thirdPartyClicks value for this ReconciliationReportRow.
     * 
     * @param thirdPartyClicks   * The clicks recorded by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public void setThirdPartyClicks(java.lang.Long thirdPartyClicks) {
        this.thirdPartyClicks = thirdPartyClicks;
    }


    /**
     * Gets the thirdPartyImpressions value for this ReconciliationReportRow.
     * 
     * @return thirdPartyImpressions   * The impressions recorded by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public java.lang.Long getThirdPartyImpressions() {
        return thirdPartyImpressions;
    }


    /**
     * Sets the thirdPartyImpressions value for this ReconciliationReportRow.
     * 
     * @param thirdPartyImpressions   * The impressions recorded by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public void setThirdPartyImpressions(java.lang.Long thirdPartyImpressions) {
        this.thirdPartyImpressions = thirdPartyImpressions;
    }


    /**
     * Gets the thirdPartyLineItemDays value for this ReconciliationReportRow.
     * 
     * @return thirdPartyLineItemDays   * The number of days the line item be impressed and recorded
     * by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public java.lang.Integer getThirdPartyLineItemDays() {
        return thirdPartyLineItemDays;
    }


    /**
     * Sets the thirdPartyLineItemDays value for this ReconciliationReportRow.
     * 
     * @param thirdPartyLineItemDays   * The number of days the line item be impressed and recorded
     * by the third-party ad server.
     *                 If the {@link #billFrom} is {@link BillFrom#THIRD_PARTY}
     * and the {@link #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public void setThirdPartyLineItemDays(java.lang.Integer thirdPartyLineItemDays) {
        this.thirdPartyLineItemDays = thirdPartyLineItemDays;
    }


    /**
     * Gets the manualClicks value for this ReconciliationReportRow.
     * 
     * @return manualClicks   * The clicks manually entered.
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL}
     * and the {@link #costType} is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public java.lang.Long getManualClicks() {
        return manualClicks;
    }


    /**
     * Sets the manualClicks value for this ReconciliationReportRow.
     * 
     * @param manualClicks   * The clicks manually entered.
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL}
     * and the {@link #costType} is
     *                 {@link CostType#CPC}, this attribute will be set to
     * {@link #reconciledClicks} and used to
     *                 calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public void setManualClicks(java.lang.Long manualClicks) {
        this.manualClicks = manualClicks;
    }


    /**
     * Gets the manualImpressions value for this ReconciliationReportRow.
     * 
     * @return manualImpressions   * The impressions manually entered.
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL}
     * and the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public java.lang.Long getManualImpressions() {
        return manualImpressions;
    }


    /**
     * Sets the manualImpressions value for this ReconciliationReportRow.
     * 
     * @param manualImpressions   * The impressions manually entered.
     *                 If the {@link #billFrom} is {@link BillFrom#MANUAL}
     * and the {@link #costType} is
     *                 {@link CostType#CPM}, this attribute will be set to
     * {@link #reconciledImpressions} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public void setManualImpressions(java.lang.Long manualImpressions) {
        this.manualImpressions = manualImpressions;
    }


    /**
     * Gets the manualLineItemDays value for this ReconciliationReportRow.
     * 
     * @return manualLineItemDays   * The number of days the line item be impressed and entered manually.
     * If the {@link #billFrom} is {@link BillFrom#MANUAL} and the {@link
     * #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public java.lang.Integer getManualLineItemDays() {
        return manualLineItemDays;
    }


    /**
     * Sets the manualLineItemDays value for this ReconciliationReportRow.
     * 
     * @param manualLineItemDays   * The number of days the line item be impressed and entered manually.
     * If the {@link #billFrom} is {@link BillFrom#MANUAL} and the {@link
     * #costType} is
     *                 {@link CostType#CPD}, this attribute will be set to
     * {@link #reconciledLineItemDays} and
     *                 used to calculate the {@link #reconciledRevenue}.
     *                 This attribute is optional.
     */
    public void setManualLineItemDays(java.lang.Integer manualLineItemDays) {
        this.manualLineItemDays = manualLineItemDays;
    }


    /**
     * Gets the reconciledClicks value for this ReconciliationReportRow.
     * 
     * @return reconciledClicks   * The clicks depending upon the {@link #billFrom} value.
     *                 This attribute is read-only.
     */
    public java.lang.Long getReconciledClicks() {
        return reconciledClicks;
    }


    /**
     * Sets the reconciledClicks value for this ReconciliationReportRow.
     * 
     * @param reconciledClicks   * The clicks depending upon the {@link #billFrom} value.
     *                 This attribute is read-only.
     */
    public void setReconciledClicks(java.lang.Long reconciledClicks) {
        this.reconciledClicks = reconciledClicks;
    }


    /**
     * Gets the reconciledImpressions value for this ReconciliationReportRow.
     * 
     * @return reconciledImpressions   * The impression depending upon the {@link #billFrom} value.
     *                 This attribute is read-only.
     */
    public java.lang.Long getReconciledImpressions() {
        return reconciledImpressions;
    }


    /**
     * Sets the reconciledImpressions value for this ReconciliationReportRow.
     * 
     * @param reconciledImpressions   * The impression depending upon the {@link #billFrom} value.
     *                 This attribute is read-only.
     */
    public void setReconciledImpressions(java.lang.Long reconciledImpressions) {
        this.reconciledImpressions = reconciledImpressions;
    }


    /**
     * Gets the reconciledLineItemDays value for this ReconciliationReportRow.
     * 
     * @return reconciledLineItemDays   * The line item days depending upon the {@link #billFrom} value.
     * This attribute is read-only.
     */
    public java.lang.Integer getReconciledLineItemDays() {
        return reconciledLineItemDays;
    }


    /**
     * Sets the reconciledLineItemDays value for this ReconciliationReportRow.
     * 
     * @param reconciledLineItemDays   * The line item days depending upon the {@link #billFrom} value.
     * This attribute is read-only.
     */
    public void setReconciledLineItemDays(java.lang.Integer reconciledLineItemDays) {
        this.reconciledLineItemDays = reconciledLineItemDays;
    }


    /**
     * Gets the contractedRevenue value for this ReconciliationReportRow.
     * 
     * @return contractedRevenue   * The revenue calculated based on the {@link #contractedGoal}
     * and {@link #costPerUnit}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public com.google.api.ads.dfp.axis.v201308.Money getContractedRevenue() {
        return contractedRevenue;
    }


    /**
     * Sets the contractedRevenue value for this ReconciliationReportRow.
     * 
     * @param contractedRevenue   * The revenue calculated based on the {@link #contractedGoal}
     * and {@link #costPerUnit}.
     *                 This attribute is calculated by Google and is read-only.
     */
    public void setContractedRevenue(com.google.api.ads.dfp.axis.v201308.Money contractedRevenue) {
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
    public com.google.api.ads.dfp.axis.v201308.Money getDfpRevenue() {
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
    public void setDfpRevenue(com.google.api.ads.dfp.axis.v201308.Money dfpRevenue) {
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
    public com.google.api.ads.dfp.axis.v201308.Money getThirdPartyRevenue() {
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
    public void setThirdPartyRevenue(com.google.api.ads.dfp.axis.v201308.Money thirdPartyRevenue) {
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
    public com.google.api.ads.dfp.axis.v201308.Money getManualRevenue() {
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
    public void setManualRevenue(com.google.api.ads.dfp.axis.v201308.Money manualRevenue) {
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
    public com.google.api.ads.dfp.axis.v201308.Money getReconciledRevenue() {
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
    public void setReconciledRevenue(com.google.api.ads.dfp.axis.v201308.Money reconciledRevenue) {
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
            ((this.lineItemCostType==null && other.getLineItemCostType()==null) || 
             (this.lineItemCostType!=null &&
              this.lineItemCostType.equals(other.getLineItemCostType()))) &&
            ((this.lineItemCostPerUnit==null && other.getLineItemCostPerUnit()==null) || 
             (this.lineItemCostPerUnit!=null &&
              this.lineItemCostPerUnit.equals(other.getLineItemCostPerUnit()))) &&
            ((this.lineItemContractedUnitsBought==null && other.getLineItemContractedUnitsBought()==null) || 
             (this.lineItemContractedUnitsBought!=null &&
              this.lineItemContractedUnitsBought.equals(other.getLineItemContractedUnitsBought()))) &&
            ((this.dfpClicks==null && other.getDfpClicks()==null) || 
             (this.dfpClicks!=null &&
              this.dfpClicks.equals(other.getDfpClicks()))) &&
            ((this.dfpImpressions==null && other.getDfpImpressions()==null) || 
             (this.dfpImpressions!=null &&
              this.dfpImpressions.equals(other.getDfpImpressions()))) &&
            ((this.dfpLineItemDays==null && other.getDfpLineItemDays()==null) || 
             (this.dfpLineItemDays!=null &&
              this.dfpLineItemDays.equals(other.getDfpLineItemDays()))) &&
            ((this.thirdPartyClicks==null && other.getThirdPartyClicks()==null) || 
             (this.thirdPartyClicks!=null &&
              this.thirdPartyClicks.equals(other.getThirdPartyClicks()))) &&
            ((this.thirdPartyImpressions==null && other.getThirdPartyImpressions()==null) || 
             (this.thirdPartyImpressions!=null &&
              this.thirdPartyImpressions.equals(other.getThirdPartyImpressions()))) &&
            ((this.thirdPartyLineItemDays==null && other.getThirdPartyLineItemDays()==null) || 
             (this.thirdPartyLineItemDays!=null &&
              this.thirdPartyLineItemDays.equals(other.getThirdPartyLineItemDays()))) &&
            ((this.manualClicks==null && other.getManualClicks()==null) || 
             (this.manualClicks!=null &&
              this.manualClicks.equals(other.getManualClicks()))) &&
            ((this.manualImpressions==null && other.getManualImpressions()==null) || 
             (this.manualImpressions!=null &&
              this.manualImpressions.equals(other.getManualImpressions()))) &&
            ((this.manualLineItemDays==null && other.getManualLineItemDays()==null) || 
             (this.manualLineItemDays!=null &&
              this.manualLineItemDays.equals(other.getManualLineItemDays()))) &&
            ((this.reconciledClicks==null && other.getReconciledClicks()==null) || 
             (this.reconciledClicks!=null &&
              this.reconciledClicks.equals(other.getReconciledClicks()))) &&
            ((this.reconciledImpressions==null && other.getReconciledImpressions()==null) || 
             (this.reconciledImpressions!=null &&
              this.reconciledImpressions.equals(other.getReconciledImpressions()))) &&
            ((this.reconciledLineItemDays==null && other.getReconciledLineItemDays()==null) || 
             (this.reconciledLineItemDays!=null &&
              this.reconciledLineItemDays.equals(other.getReconciledLineItemDays()))) &&
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
        if (getLineItemCostType() != null) {
            _hashCode += getLineItemCostType().hashCode();
        }
        if (getLineItemCostPerUnit() != null) {
            _hashCode += getLineItemCostPerUnit().hashCode();
        }
        if (getLineItemContractedUnitsBought() != null) {
            _hashCode += getLineItemContractedUnitsBought().hashCode();
        }
        if (getDfpClicks() != null) {
            _hashCode += getDfpClicks().hashCode();
        }
        if (getDfpImpressions() != null) {
            _hashCode += getDfpImpressions().hashCode();
        }
        if (getDfpLineItemDays() != null) {
            _hashCode += getDfpLineItemDays().hashCode();
        }
        if (getThirdPartyClicks() != null) {
            _hashCode += getThirdPartyClicks().hashCode();
        }
        if (getThirdPartyImpressions() != null) {
            _hashCode += getThirdPartyImpressions().hashCode();
        }
        if (getThirdPartyLineItemDays() != null) {
            _hashCode += getThirdPartyLineItemDays().hashCode();
        }
        if (getManualClicks() != null) {
            _hashCode += getManualClicks().hashCode();
        }
        if (getManualImpressions() != null) {
            _hashCode += getManualImpressions().hashCode();
        }
        if (getManualLineItemDays() != null) {
            _hashCode += getManualLineItemDays().hashCode();
        }
        if (getReconciledClicks() != null) {
            _hashCode += getReconciledClicks().hashCode();
        }
        if (getReconciledImpressions() != null) {
            _hashCode += getReconciledImpressions().hashCode();
        }
        if (getReconciledLineItemDays() != null) {
            _hashCode += getReconciledLineItemDays().hashCode();
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
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ReconciliationReportRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliationReportId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "reconciliationReportId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creativeId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "creativeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertiserId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "advertiserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "billFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "BillFrom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemCostType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemCostType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "CostType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemCostPerUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemCostPerUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineItemContractedUnitsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "lineItemContractedUnitsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "dfpClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "dfpImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpLineItemDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "dfpLineItemDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "thirdPartyClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "thirdPartyImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyLineItemDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "thirdPartyLineItemDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "manualClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "manualImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualLineItemDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "manualLineItemDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "reconciledClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledImpressions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "reconciledImpressions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledLineItemDays");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "reconciledLineItemDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "contractedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dfpRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "dfpRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "thirdPartyRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "manualRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciledRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "reconciledRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "comments"));
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
