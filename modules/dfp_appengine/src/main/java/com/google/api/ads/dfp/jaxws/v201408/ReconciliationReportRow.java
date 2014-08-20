
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ReconciliationReportRow} represents each row in the reconciliation report.
 *             Each row is identified by its {@link #reconciliationReportId}, {@link #lineItemId},
 *             {@link #creativeId}, and {@link #proposalLineItemId}.
 *           
 * 
 * <p>Java class for ReconciliationReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationReportRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reconciliationReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="advertiserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalLineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billFrom" type="{https://www.google.com/apis/ads/publisher/v201408}BillFrom" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201408}RateType" minOccurs="0"/>
 *         &lt;element name="lineItemCostPerUnit" type="{https://www.google.com/apis/ads/publisher/v201408}Money" minOccurs="0"/>
 *         &lt;element name="lineItemContractedUnitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dfpVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="thirdPartyVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="manualVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reconciledVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractedRevenue" type="{https://www.google.com/apis/ads/publisher/v201408}Money" minOccurs="0"/>
 *         &lt;element name="dfpRevenue" type="{https://www.google.com/apis/ads/publisher/v201408}Money" minOccurs="0"/>
 *         &lt;element name="thirdPartyRevenue" type="{https://www.google.com/apis/ads/publisher/v201408}Money" minOccurs="0"/>
 *         &lt;element name="manualRevenue" type="{https://www.google.com/apis/ads/publisher/v201408}Money" minOccurs="0"/>
 *         &lt;element name="reconciledRevenue" type="{https://www.google.com/apis/ads/publisher/v201408}Money" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationReportRow", propOrder = {
    "reconciliationReportId",
    "lineItemId",
    "creativeId",
    "orderId",
    "advertiserId",
    "proposalLineItemId",
    "proposalId",
    "billFrom",
    "rateType",
    "lineItemCostPerUnit",
    "lineItemContractedUnitsBought",
    "dfpVolume",
    "thirdPartyVolume",
    "manualVolume",
    "reconciledVolume",
    "contractedRevenue",
    "dfpRevenue",
    "thirdPartyRevenue",
    "manualRevenue",
    "reconciledRevenue",
    "comments"
})
public class ReconciliationReportRow {

    protected Long reconciliationReportId;
    protected Long lineItemId;
    protected Long creativeId;
    protected Long orderId;
    protected Long advertiserId;
    protected Long proposalLineItemId;
    protected Long proposalId;
    protected BillFrom billFrom;
    protected RateType rateType;
    protected Money lineItemCostPerUnit;
    protected Long lineItemContractedUnitsBought;
    protected Long dfpVolume;
    protected Long thirdPartyVolume;
    protected Long manualVolume;
    protected Long reconciledVolume;
    protected Money contractedRevenue;
    protected Money dfpRevenue;
    protected Money thirdPartyRevenue;
    protected Money manualRevenue;
    protected Money reconciledRevenue;
    protected String comments;

    /**
     * Gets the value of the reconciliationReportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciliationReportId() {
        return reconciliationReportId;
    }

    /**
     * Sets the value of the reconciliationReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciliationReportId(Long value) {
        this.reconciliationReportId = value;
    }

    /**
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemId(Long value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the creativeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeId() {
        return creativeId;
    }

    /**
     * Sets the value of the creativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeId(Long value) {
        this.creativeId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the advertiserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvertiserId() {
        return advertiserId;
    }

    /**
     * Sets the value of the advertiserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvertiserId(Long value) {
        this.advertiserId = value;
    }

    /**
     * Gets the value of the proposalLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalLineItemId() {
        return proposalLineItemId;
    }

    /**
     * Sets the value of the proposalLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalLineItemId(Long value) {
        this.proposalLineItemId = value;
    }

    /**
     * Gets the value of the proposalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalId() {
        return proposalId;
    }

    /**
     * Sets the value of the proposalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalId(Long value) {
        this.proposalId = value;
    }

    /**
     * Gets the value of the billFrom property.
     * 
     * @return
     *     possible object is
     *     {@link BillFrom }
     *     
     */
    public BillFrom getBillFrom() {
        return billFrom;
    }

    /**
     * Sets the value of the billFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillFrom }
     *     
     */
    public void setBillFrom(BillFrom value) {
        this.billFrom = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link RateType }
     *     
     */
    public RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType }
     *     
     */
    public void setRateType(RateType value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the lineItemCostPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getLineItemCostPerUnit() {
        return lineItemCostPerUnit;
    }

    /**
     * Sets the value of the lineItemCostPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setLineItemCostPerUnit(Money value) {
        this.lineItemCostPerUnit = value;
    }

    /**
     * Gets the value of the lineItemContractedUnitsBought property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemContractedUnitsBought() {
        return lineItemContractedUnitsBought;
    }

    /**
     * Sets the value of the lineItemContractedUnitsBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemContractedUnitsBought(Long value) {
        this.lineItemContractedUnitsBought = value;
    }

    /**
     * Gets the value of the dfpVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDfpVolume() {
        return dfpVolume;
    }

    /**
     * Sets the value of the dfpVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDfpVolume(Long value) {
        this.dfpVolume = value;
    }

    /**
     * Gets the value of the thirdPartyVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThirdPartyVolume() {
        return thirdPartyVolume;
    }

    /**
     * Sets the value of the thirdPartyVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThirdPartyVolume(Long value) {
        this.thirdPartyVolume = value;
    }

    /**
     * Gets the value of the manualVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManualVolume() {
        return manualVolume;
    }

    /**
     * Sets the value of the manualVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManualVolume(Long value) {
        this.manualVolume = value;
    }

    /**
     * Gets the value of the reconciledVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciledVolume() {
        return reconciledVolume;
    }

    /**
     * Sets the value of the reconciledVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciledVolume(Long value) {
        this.reconciledVolume = value;
    }

    /**
     * Gets the value of the contractedRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getContractedRevenue() {
        return contractedRevenue;
    }

    /**
     * Sets the value of the contractedRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setContractedRevenue(Money value) {
        this.contractedRevenue = value;
    }

    /**
     * Gets the value of the dfpRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDfpRevenue() {
        return dfpRevenue;
    }

    /**
     * Sets the value of the dfpRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDfpRevenue(Money value) {
        this.dfpRevenue = value;
    }

    /**
     * Gets the value of the thirdPartyRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getThirdPartyRevenue() {
        return thirdPartyRevenue;
    }

    /**
     * Sets the value of the thirdPartyRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setThirdPartyRevenue(Money value) {
        this.thirdPartyRevenue = value;
    }

    /**
     * Gets the value of the manualRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getManualRevenue() {
        return manualRevenue;
    }

    /**
     * Sets the value of the manualRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setManualRevenue(Money value) {
        this.manualRevenue = value;
    }

    /**
     * Gets the value of the reconciledRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getReconciledRevenue() {
        return reconciledRevenue;
    }

    /**
     * Sets the value of the reconciledRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setReconciledRevenue(Money value) {
        this.reconciledRevenue = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
