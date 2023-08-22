// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ProposalLineItem} is added to a programmatic {@link Proposal} and is similar to a
 *             delivery {@link LineItem}. It contains delivery details including information like impression
 *             goal or quantity, start and end times, and targeting.
 *           
 * 
 * <p>Java class for ProposalLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v202308}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v202308}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="timeZoneId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="internalNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="goal" type="{https://www.google.com/apis/ads/publisher/v202308}Goal" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGoals" type="{https://www.google.com/apis/ads/publisher/v202308}Goal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contractedUnitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v202308}DeliveryRateType" minOccurs="0"/&gt;
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v202308}RoadblockingType" minOccurs="0"/&gt;
 *         &lt;element name="companionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v202308}CompanionDeliveryOption" minOccurs="0"/&gt;
 *         &lt;element name="videoMaxDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="videoCreativeSkippableAdType" type="{https://www.google.com/apis/ads/publisher/v202308}SkippableAdType" minOccurs="0"/&gt;
 *         &lt;element name="frequencyCaps" type="{https://www.google.com/apis/ads/publisher/v202308}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dfpLineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v202308}LineItemType" minOccurs="0"/&gt;
 *         &lt;element name="lineItemPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rateType" type="{https://www.google.com/apis/ads/publisher/v202308}RateType" minOccurs="0"/&gt;
 *         &lt;element name="creativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v202308}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v202308}Targeting" minOccurs="0"/&gt;
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v202308}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v202308}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v202308}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="disableSameAdvertiserCompetitiveExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isSold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="netRate" type="{https://www.google.com/apis/ads/publisher/v202308}Money" minOccurs="0"/&gt;
 *         &lt;element name="netCost" type="{https://www.google.com/apis/ads/publisher/v202308}Money" minOccurs="0"/&gt;
 *         &lt;element name="deliveryIndicator" type="{https://www.google.com/apis/ads/publisher/v202308}DeliveryIndicator" minOccurs="0"/&gt;
 *         &lt;element name="deliveryData" type="{https://www.google.com/apis/ads/publisher/v202308}DeliveryData" minOccurs="0"/&gt;
 *         &lt;element name="computedStatus" type="{https://www.google.com/apis/ads/publisher/v202308}ComputedStatus" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v202308}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="reservationStatus" type="{https://www.google.com/apis/ads/publisher/v202308}ReservationStatus" minOccurs="0"/&gt;
 *         &lt;element name="lastReservationDateTime" type="{https://www.google.com/apis/ads/publisher/v202308}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v202308}EnvironmentType" minOccurs="0"/&gt;
 *         &lt;element name="allowedFormats" type="{https://www.google.com/apis/ads/publisher/v202308}AllowedFormats" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isProgrammatic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="additionalTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="programmaticCreativeSource" type="{https://www.google.com/apis/ads/publisher/v202308}ProgrammaticCreativeSource" minOccurs="0"/&gt;
 *         &lt;element name="grpSettings" type="{https://www.google.com/apis/ads/publisher/v202308}GrpSettings" minOccurs="0"/&gt;
 *         &lt;element name="estimatedMinimumImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyMeasurementSettings" type="{https://www.google.com/apis/ads/publisher/v202308}ThirdPartyMeasurementSettings" minOccurs="0"/&gt;
 *         &lt;element name="makegoodInfo" type="{https://www.google.com/apis/ads/publisher/v202308}ProposalLineItemMakegoodInfo" minOccurs="0"/&gt;
 *         &lt;element name="hasMakegood" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="canCreateMakegood" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="pauseRole" type="{https://www.google.com/apis/ads/publisher/v202308}NegotiationRole" minOccurs="0"/&gt;
 *         &lt;element name="pauseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItem", propOrder = {
    "id",
    "proposalId",
    "name",
    "startDateTime",
    "endDateTime",
    "timeZoneId",
    "internalNotes",
    "isArchived",
    "goal",
    "secondaryGoals",
    "contractedUnitsBought",
    "deliveryRateType",
    "roadblockingType",
    "companionDeliveryOption",
    "videoMaxDuration",
    "videoCreativeSkippableAdType",
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
    "isSold",
    "netRate",
    "netCost",
    "deliveryIndicator",
    "deliveryData",
    "computedStatus",
    "lastModifiedDateTime",
    "reservationStatus",
    "lastReservationDateTime",
    "environmentType",
    "allowedFormats",
    "isProgrammatic",
    "additionalTerms",
    "programmaticCreativeSource",
    "grpSettings",
    "estimatedMinimumImpressions",
    "thirdPartyMeasurementSettings",
    "makegoodInfo",
    "hasMakegood",
    "canCreateMakegood",
    "pauseRole",
    "pauseReason"
})
public class ProposalLineItem {

    protected Long id;
    protected Long proposalId;
    protected String name;
    protected DateTime startDateTime;
    protected DateTime endDateTime;
    protected String timeZoneId;
    protected String internalNotes;
    protected Boolean isArchived;
    protected Goal goal;
    protected List<Goal> secondaryGoals;
    protected Long contractedUnitsBought;
    @XmlSchemaType(name = "string")
    protected DeliveryRateType deliveryRateType;
    @XmlSchemaType(name = "string")
    protected RoadblockingType roadblockingType;
    @XmlSchemaType(name = "string")
    protected CompanionDeliveryOption companionDeliveryOption;
    protected Long videoMaxDuration;
    @XmlSchemaType(name = "string")
    protected SkippableAdType videoCreativeSkippableAdType;
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
    protected Boolean isSold;
    protected Money netRate;
    protected Money netCost;
    protected DeliveryIndicator deliveryIndicator;
    protected DeliveryData deliveryData;
    @XmlSchemaType(name = "string")
    protected ComputedStatus computedStatus;
    protected DateTime lastModifiedDateTime;
    @XmlSchemaType(name = "string")
    protected ReservationStatus reservationStatus;
    protected DateTime lastReservationDateTime;
    @XmlSchemaType(name = "string")
    protected EnvironmentType environmentType;
    @XmlSchemaType(name = "string")
    protected List<AllowedFormats> allowedFormats;
    protected Boolean isProgrammatic;
    protected String additionalTerms;
    @XmlSchemaType(name = "string")
    protected ProgrammaticCreativeSource programmaticCreativeSource;
    protected GrpSettings grpSettings;
    protected Long estimatedMinimumImpressions;
    protected ThirdPartyMeasurementSettings thirdPartyMeasurementSettings;
    protected ProposalLineItemMakegoodInfo makegoodInfo;
    protected Boolean hasMakegood;
    protected Boolean canCreateMakegood;
    @XmlSchemaType(name = "string")
    protected NegotiationRole pauseRole;
    protected String pauseReason;

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
     * Gets the value of the secondaryGoals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryGoals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryGoals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goal }
     * 
     * 
     */
    public List<Goal> getSecondaryGoals() {
        if (secondaryGoals == null) {
            secondaryGoals = new ArrayList<Goal>();
        }
        return this.secondaryGoals;
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
     * Gets the value of the videoCreativeSkippableAdType property.
     * 
     * @return
     *     possible object is
     *     {@link SkippableAdType }
     *     
     */
    public SkippableAdType getVideoCreativeSkippableAdType() {
        return videoCreativeSkippableAdType;
    }

    /**
     * Sets the value of the videoCreativeSkippableAdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkippableAdType }
     *     
     */
    public void setVideoCreativeSkippableAdType(SkippableAdType value) {
        this.videoCreativeSkippableAdType = value;
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
     * Gets the value of the allowedFormats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedFormats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedFormats }
     * 
     * 
     */
    public List<AllowedFormats> getAllowedFormats() {
        if (allowedFormats == null) {
            allowedFormats = new ArrayList<AllowedFormats>();
        }
        return this.allowedFormats;
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

    /**
     * Gets the value of the grpSettings property.
     * 
     * @return
     *     possible object is
     *     {@link GrpSettings }
     *     
     */
    public GrpSettings getGrpSettings() {
        return grpSettings;
    }

    /**
     * Sets the value of the grpSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrpSettings }
     *     
     */
    public void setGrpSettings(GrpSettings value) {
        this.grpSettings = value;
    }

    /**
     * Gets the value of the estimatedMinimumImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEstimatedMinimumImpressions() {
        return estimatedMinimumImpressions;
    }

    /**
     * Sets the value of the estimatedMinimumImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEstimatedMinimumImpressions(Long value) {
        this.estimatedMinimumImpressions = value;
    }

    /**
     * Gets the value of the thirdPartyMeasurementSettings property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyMeasurementSettings }
     *     
     */
    public ThirdPartyMeasurementSettings getThirdPartyMeasurementSettings() {
        return thirdPartyMeasurementSettings;
    }

    /**
     * Sets the value of the thirdPartyMeasurementSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyMeasurementSettings }
     *     
     */
    public void setThirdPartyMeasurementSettings(ThirdPartyMeasurementSettings value) {
        this.thirdPartyMeasurementSettings = value;
    }

    /**
     * Gets the value of the makegoodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItemMakegoodInfo }
     *     
     */
    public ProposalLineItemMakegoodInfo getMakegoodInfo() {
        return makegoodInfo;
    }

    /**
     * Sets the value of the makegoodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItemMakegoodInfo }
     *     
     */
    public void setMakegoodInfo(ProposalLineItemMakegoodInfo value) {
        this.makegoodInfo = value;
    }

    /**
     * Gets the value of the hasMakegood property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMakegood() {
        return hasMakegood;
    }

    /**
     * Sets the value of the hasMakegood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMakegood(Boolean value) {
        this.hasMakegood = value;
    }

    /**
     * Gets the value of the canCreateMakegood property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanCreateMakegood() {
        return canCreateMakegood;
    }

    /**
     * Sets the value of the canCreateMakegood property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanCreateMakegood(Boolean value) {
        this.canCreateMakegood = value;
    }

    /**
     * Gets the value of the pauseRole property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiationRole }
     *     
     */
    public NegotiationRole getPauseRole() {
        return pauseRole;
    }

    /**
     * Sets the value of the pauseRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiationRole }
     *     
     */
    public void setPauseRole(NegotiationRole value) {
        this.pauseRole = value;
    }

    /**
     * Gets the value of the pauseReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseReason() {
        return pauseReason;
    }

    /**
     * Sets the value of the pauseReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseReason(String value) {
        this.pauseReason = value;
    }

}
