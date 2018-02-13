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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Proposal} represents an agreement between an interactive
 *             advertising seller and a buyer that specifies the details of an
 *             advertising campaign.
 *           
 * 
 * <p>Java class for Proposal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Proposal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isProgrammatic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dfpOrderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pricingModel" type="{https://www.google.com/apis/ads/publisher/v201802}PricingModel" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="timeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalStatus" minOccurs="0"/>
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="advertiser" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalCompanyAssociation" minOccurs="0"/>
 *         &lt;element name="agencies" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalCompanyAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="probabilityOfClose" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="billingCap" type="{https://www.google.com/apis/ads/publisher/v201802}BillingCap" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{https://www.google.com/apis/ads/publisher/v201802}BillingSchedule" minOccurs="0"/>
 *         &lt;element name="billingSource" type="{https://www.google.com/apis/ads/publisher/v201802}BillingSource" minOccurs="0"/>
 *         &lt;element name="billingBase" type="{https://www.google.com/apis/ads/publisher/v201802}BillingBase" minOccurs="0"/>
 *         &lt;element name="poNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budget" type="{https://www.google.com/apis/ads/publisher/v201802}Money" minOccurs="0"/>
 *         &lt;element name="primarySalesperson" type="{https://www.google.com/apis/ads/publisher/v201802}SalespersonSplit" minOccurs="0"/>
 *         &lt;element name="secondarySalespeople" type="{https://www.google.com/apis/ads/publisher/v201802}SalespersonSplit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesPlannerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaryTraffickerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="secondaryTraffickerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sellerContactIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedTeamIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201802}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201802}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201802}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="advertiserDiscount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalDiscount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exchangeRate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="refreshExchangeRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="agencyCommission" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valueAddedTax" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isSold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalApprovalStatus" minOccurs="0"/>
 *         &lt;element name="workflowProgress" type="{https://www.google.com/apis/ads/publisher/v201802}WorkflowProgress" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="resources" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="actualExpiryTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="expectedExpiryTime" type="{https://www.google.com/apis/ads/publisher/v201802}DateTime" minOccurs="0"/>
 *         &lt;element name="thirdPartyAdServerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customThirdPartyAdServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="termsAndConditions" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalTermsAndConditions" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastRetractionDetails" type="{https://www.google.com/apis/ads/publisher/v201802}RetractionDetails" minOccurs="0"/>
 *         &lt;element name="marketplaceInfo" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalMarketplaceInfo" minOccurs="0"/>
 *         &lt;element name="offlineErrors" type="{https://www.google.com/apis/ads/publisher/v201802}OfflineError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasOfflineErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buyerRfp" type="{https://www.google.com/apis/ads/publisher/v201802}BuyerRfp" minOccurs="0"/>
 *         &lt;element name="hasBuyerRfp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal", propOrder = {
    "id",
    "isProgrammatic",
    "dfpOrderId",
    "name",
    "pricingModel",
    "startDateTime",
    "endDateTime",
    "timeZoneId",
    "status",
    "isArchived",
    "advertiser",
    "agencies",
    "probabilityOfClose",
    "billingCap",
    "billingSchedule",
    "billingSource",
    "billingBase",
    "poNumber",
    "internalNotes",
    "budget",
    "primarySalesperson",
    "secondarySalespeople",
    "salesPlannerIds",
    "primaryTraffickerId",
    "secondaryTraffickerIds",
    "sellerContactIds",
    "appliedTeamIds",
    "customFieldValues",
    "appliedLabels",
    "effectiveAppliedLabels",
    "advertiserDiscount",
    "proposalDiscount",
    "currencyCode",
    "exchangeRate",
    "refreshExchangeRate",
    "agencyCommission",
    "valueAddedTax",
    "isSold",
    "approvalStatus",
    "workflowProgress",
    "lastModifiedDateTime",
    "resources",
    "actualExpiryTime",
    "expectedExpiryTime",
    "thirdPartyAdServerId",
    "customThirdPartyAdServerName",
    "termsAndConditions",
    "lastRetractionDetails",
    "marketplaceInfo",
    "offlineErrors",
    "hasOfflineErrors",
    "buyerRfp",
    "hasBuyerRfp"
})
public class Proposal {

    protected Long id;
    protected Boolean isProgrammatic;
    protected Long dfpOrderId;
    protected String name;
    @XmlSchemaType(name = "string")
    protected PricingModel pricingModel;
    protected DateTime startDateTime;
    protected DateTime endDateTime;
    protected String timeZoneId;
    @XmlSchemaType(name = "string")
    protected ProposalStatus status;
    protected Boolean isArchived;
    protected ProposalCompanyAssociation advertiser;
    protected List<ProposalCompanyAssociation> agencies;
    protected Long probabilityOfClose;
    @XmlSchemaType(name = "string")
    protected BillingCap billingCap;
    @XmlSchemaType(name = "string")
    protected BillingSchedule billingSchedule;
    @XmlSchemaType(name = "string")
    protected BillingSource billingSource;
    @XmlSchemaType(name = "string")
    protected BillingBase billingBase;
    protected String poNumber;
    protected String internalNotes;
    protected Money budget;
    protected SalespersonSplit primarySalesperson;
    protected List<SalespersonSplit> secondarySalespeople;
    @XmlElement(type = Long.class)
    protected List<Long> salesPlannerIds;
    protected Long primaryTraffickerId;
    @XmlElement(type = Long.class)
    protected List<Long> secondaryTraffickerIds;
    @XmlElement(type = Long.class)
    protected List<Long> sellerContactIds;
    @XmlElement(type = Long.class)
    protected List<Long> appliedTeamIds;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected Long advertiserDiscount;
    protected Long proposalDiscount;
    protected String currencyCode;
    protected Long exchangeRate;
    protected Boolean refreshExchangeRate;
    protected Long agencyCommission;
    protected Long valueAddedTax;
    protected Boolean isSold;
    @XmlSchemaType(name = "string")
    protected ProposalApprovalStatus approvalStatus;
    protected WorkflowProgress workflowProgress;
    protected DateTime lastModifiedDateTime;
    protected List<ProposalLink> resources;
    protected DateTime actualExpiryTime;
    protected DateTime expectedExpiryTime;
    protected Integer thirdPartyAdServerId;
    protected String customThirdPartyAdServerName;
    protected List<ProposalTermsAndConditions> termsAndConditions;
    protected RetractionDetails lastRetractionDetails;
    protected ProposalMarketplaceInfo marketplaceInfo;
    protected List<OfflineError> offlineErrors;
    protected Boolean hasOfflineErrors;
    protected BuyerRfp buyerRfp;
    protected Boolean hasBuyerRfp;

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
     * Gets the value of the isProgrammatic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProgrammatic() {
        return isProgrammatic;
    }

    /**
     * Sets the value of the isProgrammatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProgrammatic(Boolean value) {
        this.isProgrammatic = value;
    }

    /**
     * Gets the value of the dfpOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDfpOrderId() {
        return dfpOrderId;
    }

    /**
     * Sets the value of the dfpOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDfpOrderId(Long value) {
        this.dfpOrderId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartDateTime(DateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndDateTime(DateTime value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the timeZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * Sets the value of the timeZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneId(String value) {
        this.timeZoneId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalStatus }
     *     
     */
    public ProposalStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalStatus }
     *     
     */
    public void setStatus(ProposalStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the isArchived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsArchived() {
        return isArchived;
    }

    /**
     * Sets the value of the isArchived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsArchived(Boolean value) {
        this.isArchived = value;
    }

    /**
     * Gets the value of the advertiser property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalCompanyAssociation }
     *     
     */
    public ProposalCompanyAssociation getAdvertiser() {
        return advertiser;
    }

    /**
     * Sets the value of the advertiser property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalCompanyAssociation }
     *     
     */
    public void setAdvertiser(ProposalCompanyAssociation value) {
        this.advertiser = value;
    }

    /**
     * Gets the value of the agencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposalCompanyAssociation }
     * 
     * 
     */
    public List<ProposalCompanyAssociation> getAgencies() {
        if (agencies == null) {
            agencies = new ArrayList<ProposalCompanyAssociation>();
        }
        return this.agencies;
    }

    /**
     * Gets the value of the probabilityOfClose property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProbabilityOfClose() {
        return probabilityOfClose;
    }

    /**
     * Sets the value of the probabilityOfClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProbabilityOfClose(Long value) {
        this.probabilityOfClose = value;
    }

    /**
     * Gets the value of the billingCap property.
     * 
     * @return
     *     possible object is
     *     {@link BillingCap }
     *     
     */
    public BillingCap getBillingCap() {
        return billingCap;
    }

    /**
     * Sets the value of the billingCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingCap }
     *     
     */
    public void setBillingCap(BillingCap value) {
        this.billingCap = value;
    }

    /**
     * Gets the value of the billingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSchedule }
     *     
     */
    public BillingSchedule getBillingSchedule() {
        return billingSchedule;
    }

    /**
     * Sets the value of the billingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSchedule }
     *     
     */
    public void setBillingSchedule(BillingSchedule value) {
        this.billingSchedule = value;
    }

    /**
     * Gets the value of the billingSource property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSource }
     *     
     */
    public BillingSource getBillingSource() {
        return billingSource;
    }

    /**
     * Sets the value of the billingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSource }
     *     
     */
    public void setBillingSource(BillingSource value) {
        this.billingSource = value;
    }

    /**
     * Gets the value of the billingBase property.
     * 
     * @return
     *     possible object is
     *     {@link BillingBase }
     *     
     */
    public BillingBase getBillingBase() {
        return billingBase;
    }

    /**
     * Sets the value of the billingBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingBase }
     *     
     */
    public void setBillingBase(BillingBase value) {
        this.billingBase = value;
    }

    /**
     * Gets the value of the poNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoNumber() {
        return poNumber;
    }

    /**
     * Sets the value of the poNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoNumber(String value) {
        this.poNumber = value;
    }

    /**
     * Gets the value of the internalNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNotes() {
        return internalNotes;
    }

    /**
     * Sets the value of the internalNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNotes(String value) {
        this.internalNotes = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBudget(Money value) {
        this.budget = value;
    }

    /**
     * Gets the value of the primarySalesperson property.
     * 
     * @return
     *     possible object is
     *     {@link SalespersonSplit }
     *     
     */
    public SalespersonSplit getPrimarySalesperson() {
        return primarySalesperson;
    }

    /**
     * Sets the value of the primarySalesperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalespersonSplit }
     *     
     */
    public void setPrimarySalesperson(SalespersonSplit value) {
        this.primarySalesperson = value;
    }

    /**
     * Gets the value of the secondarySalespeople property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondarySalespeople property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondarySalespeople().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalespersonSplit }
     * 
     * 
     */
    public List<SalespersonSplit> getSecondarySalespeople() {
        if (secondarySalespeople == null) {
            secondarySalespeople = new ArrayList<SalespersonSplit>();
        }
        return this.secondarySalespeople;
    }

    /**
     * Gets the value of the salesPlannerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesPlannerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesPlannerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSalesPlannerIds() {
        if (salesPlannerIds == null) {
            salesPlannerIds = new ArrayList<Long>();
        }
        return this.salesPlannerIds;
    }

    /**
     * Gets the value of the primaryTraffickerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryTraffickerId() {
        return primaryTraffickerId;
    }

    /**
     * Sets the value of the primaryTraffickerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryTraffickerId(Long value) {
        this.primaryTraffickerId = value;
    }

    /**
     * Gets the value of the secondaryTraffickerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryTraffickerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryTraffickerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSecondaryTraffickerIds() {
        if (secondaryTraffickerIds == null) {
            secondaryTraffickerIds = new ArrayList<Long>();
        }
        return this.secondaryTraffickerIds;
    }

    /**
     * Gets the value of the sellerContactIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellerContactIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellerContactIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSellerContactIds() {
        if (sellerContactIds == null) {
            sellerContactIds = new ArrayList<Long>();
        }
        return this.sellerContactIds;
    }

    /**
     * Gets the value of the appliedTeamIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedTeamIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedTeamIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAppliedTeamIds() {
        if (appliedTeamIds == null) {
            appliedTeamIds = new ArrayList<Long>();
        }
        return this.appliedTeamIds;
    }

    /**
     * Gets the value of the customFieldValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFieldValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFieldValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseCustomFieldValue }
     * 
     * 
     */
    public List<BaseCustomFieldValue> getCustomFieldValues() {
        if (customFieldValues == null) {
            customFieldValues = new ArrayList<BaseCustomFieldValue>();
        }
        return this.customFieldValues;
    }

    /**
     * Gets the value of the appliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getAppliedLabels() {
        if (appliedLabels == null) {
            appliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.appliedLabels;
    }

    /**
     * Gets the value of the effectiveAppliedLabels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the effectiveAppliedLabels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEffectiveAppliedLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedLabel }
     * 
     * 
     */
    public List<AppliedLabel> getEffectiveAppliedLabels() {
        if (effectiveAppliedLabels == null) {
            effectiveAppliedLabels = new ArrayList<AppliedLabel>();
        }
        return this.effectiveAppliedLabels;
    }

    /**
     * Gets the value of the advertiserDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvertiserDiscount() {
        return advertiserDiscount;
    }

    /**
     * Sets the value of the advertiserDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvertiserDiscount(Long value) {
        this.advertiserDiscount = value;
    }

    /**
     * Gets the value of the proposalDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalDiscount() {
        return proposalDiscount;
    }

    /**
     * Sets the value of the proposalDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalDiscount(Long value) {
        this.proposalDiscount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeRate(Long value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the refreshExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefreshExchangeRate() {
        return refreshExchangeRate;
    }

    /**
     * Sets the value of the refreshExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefreshExchangeRate(Boolean value) {
        this.refreshExchangeRate = value;
    }

    /**
     * Gets the value of the agencyCommission property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAgencyCommission() {
        return agencyCommission;
    }

    /**
     * Sets the value of the agencyCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAgencyCommission(Long value) {
        this.agencyCommission = value;
    }

    /**
     * Gets the value of the valueAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getValueAddedTax() {
        return valueAddedTax;
    }

    /**
     * Sets the value of the valueAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setValueAddedTax(Long value) {
        this.valueAddedTax = value;
    }

    /**
     * Gets the value of the isSold property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSold() {
        return isSold;
    }

    /**
     * Sets the value of the isSold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSold(Boolean value) {
        this.isSold = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalApprovalStatus }
     *     
     */
    public ProposalApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalApprovalStatus }
     *     
     */
    public void setApprovalStatus(ProposalApprovalStatus value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the workflowProgress property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowProgress }
     *     
     */
    public WorkflowProgress getWorkflowProgress() {
        return workflowProgress;
    }

    /**
     * Sets the value of the workflowProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowProgress }
     *     
     */
    public void setWorkflowProgress(WorkflowProgress value) {
        this.workflowProgress = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposalLink }
     * 
     * 
     */
    public List<ProposalLink> getResources() {
        if (resources == null) {
            resources = new ArrayList<ProposalLink>();
        }
        return this.resources;
    }

    /**
     * Gets the value of the actualExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getActualExpiryTime() {
        return actualExpiryTime;
    }

    /**
     * Sets the value of the actualExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setActualExpiryTime(DateTime value) {
        this.actualExpiryTime = value;
    }

    /**
     * Gets the value of the expectedExpiryTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getExpectedExpiryTime() {
        return expectedExpiryTime;
    }

    /**
     * Sets the value of the expectedExpiryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setExpectedExpiryTime(DateTime value) {
        this.expectedExpiryTime = value;
    }

    /**
     * Gets the value of the thirdPartyAdServerId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getThirdPartyAdServerId() {
        return thirdPartyAdServerId;
    }

    /**
     * Sets the value of the thirdPartyAdServerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setThirdPartyAdServerId(Integer value) {
        this.thirdPartyAdServerId = value;
    }

    /**
     * Gets the value of the customThirdPartyAdServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomThirdPartyAdServerName() {
        return customThirdPartyAdServerName;
    }

    /**
     * Sets the value of the customThirdPartyAdServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomThirdPartyAdServerName(String value) {
        this.customThirdPartyAdServerName = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the termsAndConditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTermsAndConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposalTermsAndConditions }
     * 
     * 
     */
    public List<ProposalTermsAndConditions> getTermsAndConditions() {
        if (termsAndConditions == null) {
            termsAndConditions = new ArrayList<ProposalTermsAndConditions>();
        }
        return this.termsAndConditions;
    }

    /**
     * Gets the value of the lastRetractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RetractionDetails }
     *     
     */
    public RetractionDetails getLastRetractionDetails() {
        return lastRetractionDetails;
    }

    /**
     * Sets the value of the lastRetractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetractionDetails }
     *     
     */
    public void setLastRetractionDetails(RetractionDetails value) {
        this.lastRetractionDetails = value;
    }

    /**
     * Gets the value of the marketplaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalMarketplaceInfo }
     *     
     */
    public ProposalMarketplaceInfo getMarketplaceInfo() {
        return marketplaceInfo;
    }

    /**
     * Sets the value of the marketplaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalMarketplaceInfo }
     *     
     */
    public void setMarketplaceInfo(ProposalMarketplaceInfo value) {
        this.marketplaceInfo = value;
    }

    /**
     * Gets the value of the offlineErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offlineErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfflineErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfflineError }
     * 
     * 
     */
    public List<OfflineError> getOfflineErrors() {
        if (offlineErrors == null) {
            offlineErrors = new ArrayList<OfflineError>();
        }
        return this.offlineErrors;
    }

    /**
     * Gets the value of the hasOfflineErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOfflineErrors() {
        return hasOfflineErrors;
    }

    /**
     * Sets the value of the hasOfflineErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOfflineErrors(Boolean value) {
        this.hasOfflineErrors = value;
    }

    /**
     * Gets the value of the buyerRfp property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerRfp }
     *     
     */
    public BuyerRfp getBuyerRfp() {
        return buyerRfp;
    }

    /**
     * Sets the value of the buyerRfp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerRfp }
     *     
     */
    public void setBuyerRfp(BuyerRfp value) {
        this.buyerRfp = value;
    }

    /**
     * Gets the value of the hasBuyerRfp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBuyerRfp() {
        return hasBuyerRfp;
    }

    /**
     * Sets the value of the hasBuyerRfp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBuyerRfp(Boolean value) {
        this.hasBuyerRfp = value;
    }

}
