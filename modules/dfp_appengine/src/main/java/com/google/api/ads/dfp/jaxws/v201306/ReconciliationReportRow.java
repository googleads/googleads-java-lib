
package com.google.api.ads.dfp.jaxws.v201306;

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
 *         &lt;element name="billFrom" type="{https://www.google.com/apis/ads/publisher/v201306}BillFrom" minOccurs="0"/>
 *         &lt;element name="lineItemCostType" type="{https://www.google.com/apis/ads/publisher/v201306}CostType" minOccurs="0"/>
 *         &lt;element name="lineItemCostPerUnit" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="lineItemContractedUnitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dfpClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dfpImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dfpLineItemDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="thirdPartyClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="thirdPartyImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="thirdPartyLineItemDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="manualClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="manualImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="manualLineItemDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="reconciledClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reconciledImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reconciledLineItemDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contractedRevenue" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="dfpRevenue" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="thirdPartyRevenue" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="manualRevenue" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="reconciledRevenue" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
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
    "billFrom",
    "lineItemCostType",
    "lineItemCostPerUnit",
    "lineItemContractedUnitsBought",
    "dfpClicks",
    "dfpImpressions",
    "dfpLineItemDays",
    "thirdPartyClicks",
    "thirdPartyImpressions",
    "thirdPartyLineItemDays",
    "manualClicks",
    "manualImpressions",
    "manualLineItemDays",
    "reconciledClicks",
    "reconciledImpressions",
    "reconciledLineItemDays",
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
    protected BillFrom billFrom;
    protected CostType lineItemCostType;
    protected Money lineItemCostPerUnit;
    protected Long lineItemContractedUnitsBought;
    protected Long dfpClicks;
    protected Long dfpImpressions;
    protected Integer dfpLineItemDays;
    protected Long thirdPartyClicks;
    protected Long thirdPartyImpressions;
    protected Integer thirdPartyLineItemDays;
    protected Long manualClicks;
    protected Long manualImpressions;
    protected Integer manualLineItemDays;
    protected Long reconciledClicks;
    protected Long reconciledImpressions;
    protected Integer reconciledLineItemDays;
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
     * Gets the value of the lineItemCostType property.
     * 
     * @return
     *     possible object is
     *     {@link CostType }
     *     
     */
    public CostType getLineItemCostType() {
        return lineItemCostType;
    }

    /**
     * Sets the value of the lineItemCostType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostType }
     *     
     */
    public void setLineItemCostType(CostType value) {
        this.lineItemCostType = value;
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
     * Gets the value of the dfpClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDfpClicks() {
        return dfpClicks;
    }

    /**
     * Sets the value of the dfpClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDfpClicks(Long value) {
        this.dfpClicks = value;
    }

    /**
     * Gets the value of the dfpImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDfpImpressions() {
        return dfpImpressions;
    }

    /**
     * Sets the value of the dfpImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDfpImpressions(Long value) {
        this.dfpImpressions = value;
    }

    /**
     * Gets the value of the dfpLineItemDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDfpLineItemDays() {
        return dfpLineItemDays;
    }

    /**
     * Sets the value of the dfpLineItemDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDfpLineItemDays(Integer value) {
        this.dfpLineItemDays = value;
    }

    /**
     * Gets the value of the thirdPartyClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThirdPartyClicks() {
        return thirdPartyClicks;
    }

    /**
     * Sets the value of the thirdPartyClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThirdPartyClicks(Long value) {
        this.thirdPartyClicks = value;
    }

    /**
     * Gets the value of the thirdPartyImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThirdPartyImpressions() {
        return thirdPartyImpressions;
    }

    /**
     * Sets the value of the thirdPartyImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThirdPartyImpressions(Long value) {
        this.thirdPartyImpressions = value;
    }

    /**
     * Gets the value of the thirdPartyLineItemDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirdPartyLineItemDays() {
        return thirdPartyLineItemDays;
    }

    /**
     * Sets the value of the thirdPartyLineItemDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirdPartyLineItemDays(Integer value) {
        this.thirdPartyLineItemDays = value;
    }

    /**
     * Gets the value of the manualClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManualClicks() {
        return manualClicks;
    }

    /**
     * Sets the value of the manualClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManualClicks(Long value) {
        this.manualClicks = value;
    }

    /**
     * Gets the value of the manualImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManualImpressions() {
        return manualImpressions;
    }

    /**
     * Sets the value of the manualImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManualImpressions(Long value) {
        this.manualImpressions = value;
    }

    /**
     * Gets the value of the manualLineItemDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getManualLineItemDays() {
        return manualLineItemDays;
    }

    /**
     * Sets the value of the manualLineItemDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setManualLineItemDays(Integer value) {
        this.manualLineItemDays = value;
    }

    /**
     * Gets the value of the reconciledClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciledClicks() {
        return reconciledClicks;
    }

    /**
     * Sets the value of the reconciledClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciledClicks(Long value) {
        this.reconciledClicks = value;
    }

    /**
     * Gets the value of the reconciledImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciledImpressions() {
        return reconciledImpressions;
    }

    /**
     * Sets the value of the reconciledImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciledImpressions(Long value) {
        this.reconciledImpressions = value;
    }

    /**
     * Gets the value of the reconciledLineItemDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReconciledLineItemDays() {
        return reconciledLineItemDays;
    }

    /**
     * Sets the value of the reconciledLineItemDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReconciledLineItemDays(Integer value) {
        this.reconciledLineItemDays = value;
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
