// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ProposalLineItem} is an instance of sales {@link Product}. It belongs to
 *             a {@link Proposal} and is created according to a {@link Product} and
 *             {@link RateCard}. When the proposal is turned into an {@link Order}, this object is
 *             turned into a {@link LineItem}.
 *           
 * 
 * <p>Java class for ProposalLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateCardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="timeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="internalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costAdjustment" type="{https://www.google.com/apis/ads/publisher/v201711}CostAdjustment" minOccurs="0"/>
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="goal" type="{https://www.google.com/apis/ads/publisher/v201711}Goal" minOccurs="0"/>
 *         &lt;element name="contractedQuantityBuffer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="scheduledQuantity" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contractedUnitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v201711}DeliveryRateType" minOccurs="0"/>
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v201711}RoadblockingType" minOccurs="0"/>
 *         &lt;element name="companionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v201711}CompanionDeliveryOption" minOccurs="0"/>
 *         &lt;element name="creativeRotationType" type="{https://www.google.com/apis/ads/publisher/v201711}CreativeRotationType" minOccurs="0"/>
 *         &lt;element name="videoMaxDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="frequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201711}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dfpLineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v201711}LineItemType" minOccurs="0"/>
 *         &lt;element name="lineItemPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v201711}RateType" minOccurs="0"/>
 *         &lt;element name="creativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v201711}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v201711}Targeting" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201711}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201711}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201711}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disableSameAdvertiserCompetitiveExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="productConstraints" type="{https://www.google.com/apis/ads/publisher/v201711}ProposalLineItemConstraints" minOccurs="0"/>
 *         &lt;element name="premiums" type="{https://www.google.com/apis/ads/publisher/v201711}ProposalLineItemPremium" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="baseRate" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="netRate" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="grossRate" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="netCost" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="grossCost" type="{https://www.google.com/apis/ads/publisher/v201711}Money" minOccurs="0"/>
 *         &lt;element name="deliveryIndicator" type="{https://www.google.com/apis/ads/publisher/v201711}DeliveryIndicator" minOccurs="0"/>
 *         &lt;element name="deliveryData" type="{https://www.google.com/apis/ads/publisher/v201711}DeliveryData" minOccurs="0"/>
 *         &lt;element name="computedStatus" type="{https://www.google.com/apis/ads/publisher/v201711}ComputedStatus" minOccurs="0"/>
 *         &lt;element name="billingCap" type="{https://www.google.com/apis/ads/publisher/v201711}BillingCap" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{https://www.google.com/apis/ads/publisher/v201711}BillingSchedule" minOccurs="0"/>
 *         &lt;element name="billingSource" type="{https://www.google.com/apis/ads/publisher/v201711}BillingSource" minOccurs="0"/>
 *         &lt;element name="billingBase" type="{https://www.google.com/apis/ads/publisher/v201711}BillingBase" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="reservationStatus" type="{https://www.google.com/apis/ads/publisher/v201711}ReservationStatus" minOccurs="0"/>
 *         &lt;element name="lastReservationDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="useThirdPartyAdServerFromProposal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="thirdPartyAdServerId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="customThirdPartyAdServerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v201711}EnvironmentType" minOccurs="0"/>
 *         &lt;element name="isProgrammatic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="linkStatus" type="{https://www.google.com/apis/ads/publisher/v201711}LinkStatus" minOccurs="0"/>
 *         &lt;element name="marketplaceInfo" type="{https://www.google.com/apis/ads/publisher/v201711}ProposalLineItemMarketplaceInfo" minOccurs="0"/>
 *         &lt;element name="rateCardPricingModel" type="{https://www.google.com/apis/ads/publisher/v201711}PricingModel" minOccurs="0"/>
 *         &lt;element name="additionalTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="programmaticCreativeSource" type="{https://www.google.com/apis/ads/publisher/v201711}ProgrammaticCreativeSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItem", propOrder = {
    "id",
    "proposalId",
    "packageId",
    "rateCardId",
    "productId",
    "name",
    "startDateTime",
    "endDateTime",
    "timeZoneId",
    "internalNotes",
    "costAdjustment",
    "isArchived",
    "goal",
    "contractedQuantityBuffer",
    "scheduledQuantity",
    "contractedUnitsBought",
    "deliveryRateType",
    "roadblockingType",
    "companionDeliveryOption",
    "creativeRotationType",
    "videoMaxDuration",
    "frequencyCaps",
    "dfpLineItemId",
    "lineItemType",
    "lineItemPriority",
    "rateType",
    "creativePlaceholders",
    "targeting",
    "customFieldValues",
    "appliedLabels",
    "effectiveAppliedLabels",
    "disableSameAdvertiserCompetitiveExclusion",
    "productConstraints",
    "premiums",
    "isSold",
    "baseRate",
    "netRate",
    "grossRate",
    "netCost",
    "grossCost",
    "deliveryIndicator",
    "deliveryData",
    "computedStatus",
    "billingCap",
    "billingSchedule",
    "billingSource",
    "billingBase",
    "lastModifiedDateTime",
    "reservationStatus",
    "lastReservationDateTime",
    "useThirdPartyAdServerFromProposal",
    "thirdPartyAdServerId",
    "customThirdPartyAdServerName",
    "environmentType",
    "isProgrammatic",
    "linkStatus",
    "marketplaceInfo",
    "rateCardPricingModel",
    "additionalTerms",
    "programmaticCreativeSource"
})
public class ProposalLineItem {

    protected Long id;
    protected Long proposalId;
    protected Long packageId;
    protected Long rateCardId;
    protected Long productId;
    protected String name;
    protected DateTime startDateTime;
    protected DateTime endDateTime;
    protected String timeZoneId;
    protected String internalNotes;
    @XmlSchemaType(name = "string")
    protected CostAdjustment costAdjustment;
    protected Boolean isArchived;
    protected Goal goal;
    protected Integer contractedQuantityBuffer;
    protected Long scheduledQuantity;
    protected Long contractedUnitsBought;
    @XmlSchemaType(name = "string")
    protected DeliveryRateType deliveryRateType;
    @XmlSchemaType(name = "string")
    protected RoadblockingType roadblockingType;
    @XmlSchemaType(name = "string")
    protected CompanionDeliveryOption companionDeliveryOption;
    @XmlSchemaType(name = "string")
    protected CreativeRotationType creativeRotationType;
    protected Long videoMaxDuration;
    protected List<FrequencyCap> frequencyCaps;
    protected Long dfpLineItemId;
    @XmlSchemaType(name = "string")
    protected LineItemType lineItemType;
    protected Integer lineItemPriority;
    @XmlSchemaType(name = "string")
    protected RateType rateType;
    protected List<CreativePlaceholder> creativePlaceholders;
    protected Targeting targeting;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected Boolean disableSameAdvertiserCompetitiveExclusion;
    protected ProposalLineItemConstraints productConstraints;
    protected List<ProposalLineItemPremium> premiums;
    protected Boolean isSold;
    protected Money baseRate;
    protected Money netRate;
    protected Money grossRate;
    protected Money netCost;
    protected Money grossCost;
    protected DeliveryIndicator deliveryIndicator;
    protected DeliveryData deliveryData;
    @XmlSchemaType(name = "string")
    protected ComputedStatus computedStatus;
    @XmlSchemaType(name = "string")
    protected BillingCap billingCap;
    @XmlSchemaType(name = "string")
    protected BillingSchedule billingSchedule;
    @XmlSchemaType(name = "string")
    protected BillingSource billingSource;
    @XmlSchemaType(name = "string")
    protected BillingBase billingBase;
    protected DateTime lastModifiedDateTime;
    @XmlSchemaType(name = "string")
    protected ReservationStatus reservationStatus;
    protected DateTime lastReservationDateTime;
    protected Boolean useThirdPartyAdServerFromProposal;
    protected Integer thirdPartyAdServerId;
    protected String customThirdPartyAdServerName;
    @XmlSchemaType(name = "string")
    protected EnvironmentType environmentType;
    protected Boolean isProgrammatic;
    @XmlSchemaType(name = "string")
    protected LinkStatus linkStatus;
    protected ProposalLineItemMarketplaceInfo marketplaceInfo;
    @XmlSchemaType(name = "string")
    protected PricingModel rateCardPricingModel;
    protected String additionalTerms;
    @XmlSchemaType(name = "string")
    protected ProgrammaticCreativeSource programmaticCreativeSource;

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
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageId(Long value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the rateCardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardId() {
        return rateCardId;
    }

    /**
     * Sets the value of the rateCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardId(Long value) {
        this.rateCardId = value;
    }

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProductId(Long value) {
        this.productId = value;
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
     * Gets the value of the costAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link CostAdjustment }
     *     
     */
    public CostAdjustment getCostAdjustment() {
        return costAdjustment;
    }

    /**
     * Sets the value of the costAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostAdjustment }
     *     
     */
    public void setCostAdjustment(CostAdjustment value) {
        this.costAdjustment = value;
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
     * Gets the value of the goal property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getGoal() {
        return goal;
    }

    /**
     * Sets the value of the goal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setGoal(Goal value) {
        this.goal = value;
    }

    /**
     * Gets the value of the contractedQuantityBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContractedQuantityBuffer() {
        return contractedQuantityBuffer;
    }

    /**
     * Sets the value of the contractedQuantityBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContractedQuantityBuffer(Integer value) {
        this.contractedQuantityBuffer = value;
    }

    /**
     * Gets the value of the scheduledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScheduledQuantity() {
        return scheduledQuantity;
    }

    /**
     * Sets the value of the scheduledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScheduledQuantity(Long value) {
        this.scheduledQuantity = value;
    }

    /**
     * Gets the value of the contractedUnitsBought property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContractedUnitsBought() {
        return contractedUnitsBought;
    }

    /**
     * Sets the value of the contractedUnitsBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContractedUnitsBought(Long value) {
        this.contractedUnitsBought = value;
    }

    /**
     * Gets the value of the deliveryRateType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRateType }
     *     
     */
    public DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }

    /**
     * Sets the value of the deliveryRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRateType }
     *     
     */
    public void setDeliveryRateType(DeliveryRateType value) {
        this.deliveryRateType = value;
    }

    /**
     * Gets the value of the roadblockingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadblockingType }
     *     
     */
    public RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }

    /**
     * Sets the value of the roadblockingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadblockingType }
     *     
     */
    public void setRoadblockingType(RoadblockingType value) {
        this.roadblockingType = value;
    }

    /**
     * Gets the value of the companionDeliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link CompanionDeliveryOption }
     *     
     */
    public CompanionDeliveryOption getCompanionDeliveryOption() {
        return companionDeliveryOption;
    }

    /**
     * Sets the value of the companionDeliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanionDeliveryOption }
     *     
     */
    public void setCompanionDeliveryOption(CompanionDeliveryOption value) {
        this.companionDeliveryOption = value;
    }

    /**
     * Gets the value of the creativeRotationType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeRotationType }
     *     
     */
    public CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }

    /**
     * Sets the value of the creativeRotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeRotationType }
     *     
     */
    public void setCreativeRotationType(CreativeRotationType value) {
        this.creativeRotationType = value;
    }

    /**
     * Gets the value of the videoMaxDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoMaxDuration() {
        return videoMaxDuration;
    }

    /**
     * Sets the value of the videoMaxDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoMaxDuration(Long value) {
        this.videoMaxDuration = value;
    }

    /**
     * Gets the value of the frequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyCap }
     * 
     * 
     */
    public List<FrequencyCap> getFrequencyCaps() {
        if (frequencyCaps == null) {
            frequencyCaps = new ArrayList<FrequencyCap>();
        }
        return this.frequencyCaps;
    }

    /**
     * Gets the value of the dfpLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDfpLineItemId() {
        return dfpLineItemId;
    }

    /**
     * Sets the value of the dfpLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDfpLineItemId(Long value) {
        this.dfpLineItemId = value;
    }

    /**
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType }
     *     
     */
    public LineItemType getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType }
     *     
     */
    public void setLineItemType(LineItemType value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the lineItemPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineItemPriority() {
        return lineItemPriority;
    }

    /**
     * Sets the value of the lineItemPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineItemPriority(Integer value) {
        this.lineItemPriority = value;
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
     * Gets the value of the creativePlaceholders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creativePlaceholders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreativePlaceholders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativePlaceholder }
     * 
     * 
     */
    public List<CreativePlaceholder> getCreativePlaceholders() {
        if (creativePlaceholders == null) {
            creativePlaceholders = new ArrayList<CreativePlaceholder>();
        }
        return this.creativePlaceholders;
    }

    /**
     * Gets the value of the targeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getTargeting() {
        return targeting;
    }

    /**
     * Sets the value of the targeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setTargeting(Targeting value) {
        this.targeting = value;
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
     * Gets the value of the disableSameAdvertiserCompetitiveExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableSameAdvertiserCompetitiveExclusion() {
        return disableSameAdvertiserCompetitiveExclusion;
    }

    /**
     * Sets the value of the disableSameAdvertiserCompetitiveExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableSameAdvertiserCompetitiveExclusion(Boolean value) {
        this.disableSameAdvertiserCompetitiveExclusion = value;
    }

    /**
     * Gets the value of the productConstraints property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItemConstraints }
     *     
     */
    public ProposalLineItemConstraints getProductConstraints() {
        return productConstraints;
    }

    /**
     * Sets the value of the productConstraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItemConstraints }
     *     
     */
    public void setProductConstraints(ProposalLineItemConstraints value) {
        this.productConstraints = value;
    }

    /**
     * Gets the value of the premiums property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiums property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiums().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProposalLineItemPremium }
     * 
     * 
     */
    public List<ProposalLineItemPremium> getPremiums() {
        if (premiums == null) {
            premiums = new ArrayList<ProposalLineItemPremium>();
        }
        return this.premiums;
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
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBaseRate(Money value) {
        this.baseRate = value;
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
     * Gets the value of the netCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getNetCost() {
        return netCost;
    }

    /**
     * Sets the value of the netCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setNetCost(Money value) {
        this.netCost = value;
    }

    /**
     * Gets the value of the grossCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getGrossCost() {
        return grossCost;
    }

    /**
     * Sets the value of the grossCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setGrossCost(Money value) {
        this.grossCost = value;
    }

    /**
     * Gets the value of the deliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryIndicator }
     *     
     */
    public DeliveryIndicator getDeliveryIndicator() {
        return deliveryIndicator;
    }

    /**
     * Sets the value of the deliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryIndicator }
     *     
     */
    public void setDeliveryIndicator(DeliveryIndicator value) {
        this.deliveryIndicator = value;
    }

    /**
     * Gets the value of the deliveryData property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryData }
     *     
     */
    public DeliveryData getDeliveryData() {
        return deliveryData;
    }

    /**
     * Sets the value of the deliveryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryData }
     *     
     */
    public void setDeliveryData(DeliveryData value) {
        this.deliveryData = value;
    }

    /**
     * Gets the value of the computedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ComputedStatus }
     *     
     */
    public ComputedStatus getComputedStatus() {
        return computedStatus;
    }

    /**
     * Sets the value of the computedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputedStatus }
     *     
     */
    public void setComputedStatus(ComputedStatus value) {
        this.computedStatus = value;
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
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationStatus }
     *     
     */
    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationStatus }
     *     
     */
    public void setReservationStatus(ReservationStatus value) {
        this.reservationStatus = value;
    }

    /**
     * Gets the value of the lastReservationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastReservationDateTime() {
        return lastReservationDateTime;
    }

    /**
     * Sets the value of the lastReservationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastReservationDateTime(DateTime value) {
        this.lastReservationDateTime = value;
    }

    /**
     * Gets the value of the useThirdPartyAdServerFromProposal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseThirdPartyAdServerFromProposal() {
        return useThirdPartyAdServerFromProposal;
    }

    /**
     * Sets the value of the useThirdPartyAdServerFromProposal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseThirdPartyAdServerFromProposal(Boolean value) {
        this.useThirdPartyAdServerFromProposal = value;
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
     * Gets the value of the environmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentType }
     *     
     */
    public EnvironmentType getEnvironmentType() {
        return environmentType;
    }

    /**
     * Sets the value of the environmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentType }
     *     
     */
    public void setEnvironmentType(EnvironmentType value) {
        this.environmentType = value;
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
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LinkStatus }
     *     
     */
    public LinkStatus getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkStatus }
     *     
     */
    public void setLinkStatus(LinkStatus value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the marketplaceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItemMarketplaceInfo }
     *     
     */
    public ProposalLineItemMarketplaceInfo getMarketplaceInfo() {
        return marketplaceInfo;
    }

    /**
     * Sets the value of the marketplaceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItemMarketplaceInfo }
     *     
     */
    public void setMarketplaceInfo(ProposalLineItemMarketplaceInfo value) {
        this.marketplaceInfo = value;
    }

    /**
     * Gets the value of the rateCardPricingModel property.
     * 
     * @return
     *     possible object is
     *     {@link PricingModel }
     *     
     */
    public PricingModel getRateCardPricingModel() {
        return rateCardPricingModel;
    }

    /**
     * Sets the value of the rateCardPricingModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingModel }
     *     
     */
    public void setRateCardPricingModel(PricingModel value) {
        this.rateCardPricingModel = value;
    }

    /**
     * Gets the value of the additionalTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTerms() {
        return additionalTerms;
    }

    /**
     * Sets the value of the additionalTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTerms(String value) {
        this.additionalTerms = value;
    }

    /**
     * Gets the value of the programmaticCreativeSource property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammaticCreativeSource }
     *     
     */
    public ProgrammaticCreativeSource getProgrammaticCreativeSource() {
        return programmaticCreativeSource;
    }

    /**
     * Sets the value of the programmaticCreativeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammaticCreativeSource }
     *     
     */
    public void setProgrammaticCreativeSource(ProgrammaticCreativeSource value) {
        this.programmaticCreativeSource = value;
    }

}
