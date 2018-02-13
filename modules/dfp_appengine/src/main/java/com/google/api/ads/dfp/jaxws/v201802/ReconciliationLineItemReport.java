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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains reconciliation data of a {@link LineItem} and/or {@link ProposalLineItem}.
 *           
 * 
 * <p>Java class for ReconciliationLineItemReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationLineItemReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reconciliationReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalLineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201802}RateType" minOccurs="0"/>
 *         &lt;element name="netRate" type="{https://www.google.com/apis/ads/publisher/v201802}Money" minOccurs="0"/>
 *         &lt;element name="grossRate" type="{https://www.google.com/apis/ads/publisher/v201802}Money" minOccurs="0"/>
 *         &lt;element name="pricingModel" type="{https://www.google.com/apis/ads/publisher/v201802}PricingModel" minOccurs="0"/>
 *         &lt;element name="dfpVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="thirdPartyVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="manualVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reconciliationSource" type="{https://www.google.com/apis/ads/publisher/v201802}BillFrom" minOccurs="0"/>
 *         &lt;element name="reconciledVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="capVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rolloverVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billableVolume" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="netBillableRevenue" type="{https://www.google.com/apis/ads/publisher/v201802}Money" minOccurs="0"/>
 *         &lt;element name="grossBillableRevenue" type="{https://www.google.com/apis/ads/publisher/v201802}Money" minOccurs="0"/>
 *         &lt;element name="billableRevenueOverrides" type="{https://www.google.com/apis/ads/publisher/v201802}BillableRevenueOverrides" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationLineItemReport", propOrder = {
    "id",
    "reconciliationReportId",
    "orderId",
    "proposalId",
    "lineItemId",
    "proposalLineItemId",
    "rateType",
    "netRate",
    "grossRate",
    "pricingModel",
    "dfpVolume",
    "thirdPartyVolume",
    "manualVolume",
    "reconciliationSource",
    "reconciledVolume",
    "capVolume",
    "rolloverVolume",
    "billableVolume",
    "netBillableRevenue",
    "grossBillableRevenue",
    "billableRevenueOverrides"
})
public class ReconciliationLineItemReport {

    protected Long id;
    protected Long reconciliationReportId;
    protected Long orderId;
    protected Long proposalId;
    protected Long lineItemId;
    protected Long proposalLineItemId;
    @XmlSchemaType(name = "string")
    protected RateType rateType;
    protected Money netRate;
    protected Money grossRate;
    @XmlSchemaType(name = "string")
    protected PricingModel pricingModel;
    protected Long dfpVolume;
    protected Long thirdPartyVolume;
    protected Long manualVolume;
    @XmlSchemaType(name = "string")
    protected BillFrom reconciliationSource;
    protected Long reconciledVolume;
    protected Long capVolume;
    protected Long rolloverVolume;
    protected Long billableVolume;
    protected Money netBillableRevenue;
    protected Money grossBillableRevenue;
    protected BillableRevenueOverrides billableRevenueOverrides;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

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
     * Gets the value of the netRate property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetRate() {
        return netRate;
    }

    /**
     * Sets the value of the netRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetRate(Money value) {
        this.netRate = value;
    }

    /**
     * Gets the value of the grossRate property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getGrossRate() {
        return grossRate;
    }

    /**
     * Sets the value of the grossRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setGrossRate(Money value) {
        this.grossRate = value;
    }

    /**
     * Gets the value of the pricingModel property.
     * 
     * @return
     *     possible object is
     *     {@link PricingModel }
     *     
     */
    public PricingModel getPricingModel() {
        return pricingModel;
    }

    /**
     * Sets the value of the pricingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModel }
     *     
     */
    public void setPricingModel(PricingModel value) {
        this.pricingModel = value;
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
     * Gets the value of the reconciliationSource property.
     * 
     * @return
     *     possible object is
     *     {@link BillFrom }
     *     
     */
    public BillFrom getReconciliationSource() {
        return reconciliationSource;
    }

    /**
     * Sets the value of the reconciliationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillFrom }
     *     
     */
    public void setReconciliationSource(BillFrom value) {
        this.reconciliationSource = value;
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
     * Gets the value of the capVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCapVolume() {
        return capVolume;
    }

    /**
     * Sets the value of the capVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCapVolume(Long value) {
        this.capVolume = value;
    }

    /**
     * Gets the value of the rolloverVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRolloverVolume() {
        return rolloverVolume;
    }

    /**
     * Sets the value of the rolloverVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRolloverVolume(Long value) {
        this.rolloverVolume = value;
    }

    /**
     * Gets the value of the billableVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillableVolume() {
        return billableVolume;
    }

    /**
     * Sets the value of the billableVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillableVolume(Long value) {
        this.billableVolume = value;
    }

    /**
     * Gets the value of the netBillableRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetBillableRevenue() {
        return netBillableRevenue;
    }

    /**
     * Sets the value of the netBillableRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetBillableRevenue(Money value) {
        this.netBillableRevenue = value;
    }

    /**
     * Gets the value of the grossBillableRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getGrossBillableRevenue() {
        return grossBillableRevenue;
    }

    /**
     * Sets the value of the grossBillableRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setGrossBillableRevenue(Money value) {
        this.grossBillableRevenue = value;
    }

    /**
     * Gets the value of the billableRevenueOverrides property.
     * 
     * @return
     *     possible object is
     *     {@link BillableRevenueOverrides }
     *     
     */
    public BillableRevenueOverrides getBillableRevenueOverrides() {
        return billableRevenueOverrides;
    }

    /**
     * Sets the value of the billableRevenueOverrides property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillableRevenueOverrides }
     *     
     */
    public void setBillableRevenueOverrides(BillableRevenueOverrides value) {
        this.billableRevenueOverrides = value;
    }

}
