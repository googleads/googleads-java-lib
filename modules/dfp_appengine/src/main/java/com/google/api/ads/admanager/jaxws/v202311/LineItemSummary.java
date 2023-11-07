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


package com.google.api.ads.admanager.jaxws.v202311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The {@code LineItemSummary} represents the base class from which a {@code LineItem} is derived.
 *           
 * 
 * <p>Java class for LineItemSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v202311}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="startDateTimeType" type="{https://www.google.com/apis/ads/publisher/v202311}StartDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v202311}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="autoExtensionDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="unlimitedEndDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="creativeRotationType" type="{https://www.google.com/apis/ads/publisher/v202311}CreativeRotationType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v202311}DeliveryRateType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryForecastSource" type="{https://www.google.com/apis/ads/publisher/v202311}DeliveryForecastSource" minOccurs="0"/&gt;
 *         &lt;element name="customPacingCurve" type="{https://www.google.com/apis/ads/publisher/v202311}CustomPacingCurve" minOccurs="0"/&gt;
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v202311}RoadblockingType" minOccurs="0"/&gt;
 *         &lt;element name="skippableAdType" type="{https://www.google.com/apis/ads/publisher/v202311}SkippableAdType" minOccurs="0"/&gt;
 *         &lt;element name="frequencyCaps" type="{https://www.google.com/apis/ads/publisher/v202311}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v202311}LineItemType" minOccurs="0"/&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="costPerUnit" type="{https://www.google.com/apis/ads/publisher/v202311}Money" minOccurs="0"/&gt;
 *         &lt;element name="valueCostPerUnit" type="{https://www.google.com/apis/ads/publisher/v202311}Money" minOccurs="0"/&gt;
 *         &lt;element name="costType" type="{https://www.google.com/apis/ads/publisher/v202311}CostType" minOccurs="0"/&gt;
 *         &lt;element name="discountType" type="{https://www.google.com/apis/ads/publisher/v202311}LineItemDiscountType" minOccurs="0"/&gt;
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="contractedUnitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="creativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v202311}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="activityAssociations" type="{https://www.google.com/apis/ads/publisher/v202311}LineItemActivityAssociation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v202311}EnvironmentType" minOccurs="0"/&gt;
 *         &lt;element name="allowedFormats" type="{https://www.google.com/apis/ads/publisher/v202311}AllowedFormats" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="companionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v202311}CompanionDeliveryOption" minOccurs="0"/&gt;
 *         &lt;element name="allowOverbook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="skipInventoryCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="skipCrossSellingRuleWarningChecks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reserveAtCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="stats" type="{https://www.google.com/apis/ads/publisher/v202311}Stats" minOccurs="0"/&gt;
 *         &lt;element name="deliveryIndicator" type="{https://www.google.com/apis/ads/publisher/v202311}DeliveryIndicator" minOccurs="0"/&gt;
 *         &lt;element name="deliveryData" type="{https://www.google.com/apis/ads/publisher/v202311}DeliveryData" minOccurs="0"/&gt;
 *         &lt;element name="budget" type="{https://www.google.com/apis/ads/publisher/v202311}Money" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202311}ComputedStatus" minOccurs="0"/&gt;
 *         &lt;element name="reservationStatus" type="{https://www.google.com/apis/ads/publisher/v202311}LineItemSummary.ReservationStatus" minOccurs="0"/&gt;
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="webPropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v202311}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v202311}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="disableSameAdvertiserCompetitiveExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedByApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="competitiveConstraintScope" type="{https://www.google.com/apis/ads/publisher/v202311}CompetitiveConstraintScope" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v202311}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="creationDateTime" type="{https://www.google.com/apis/ads/publisher/v202311}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v202311}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="isMissingCreatives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="programmaticCreativeSource" type="{https://www.google.com/apis/ads/publisher/v202311}ProgrammaticCreativeSource" minOccurs="0"/&gt;
 *         &lt;element name="thirdPartyMeasurementSettings" type="{https://www.google.com/apis/ads/publisher/v202311}ThirdPartyMeasurementSettings" minOccurs="0"/&gt;
 *         &lt;element name="youtubeKidsRestricted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="videoMaxDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="primaryGoal" type="{https://www.google.com/apis/ads/publisher/v202311}Goal" minOccurs="0"/&gt;
 *         &lt;element name="secondaryGoals" type="{https://www.google.com/apis/ads/publisher/v202311}Goal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="grpSettings" type="{https://www.google.com/apis/ads/publisher/v202311}GrpSettings" minOccurs="0"/&gt;
 *         &lt;element name="dealInfo" type="{https://www.google.com/apis/ads/publisher/v202311}LineItemDealInfoDto" minOccurs="0"/&gt;
 *         &lt;element name="viewabilityProviderCompanyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="childContentEligibility" type="{https://www.google.com/apis/ads/publisher/v202311}ChildContentEligibility" minOccurs="0"/&gt;
 *         &lt;element name="customVastExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemSummary", propOrder = {
    "orderId",
    "id",
    "name",
    "externalId",
    "orderName",
    "startDateTime",
    "startDateTimeType",
    "endDateTime",
    "autoExtensionDays",
    "unlimitedEndDateTime",
    "creativeRotationType",
    "deliveryRateType",
    "deliveryForecastSource",
    "customPacingCurve",
    "roadblockingType",
    "skippableAdType",
    "frequencyCaps",
    "lineItemType",
    "priority",
    "costPerUnit",
    "valueCostPerUnit",
    "costType",
    "discountType",
    "discount",
    "contractedUnitsBought",
    "creativePlaceholders",
    "activityAssociations",
    "environmentType",
    "allowedFormats",
    "companionDeliveryOption",
    "allowOverbook",
    "skipInventoryCheck",
    "skipCrossSellingRuleWarningChecks",
    "reserveAtCreation",
    "stats",
    "deliveryIndicator",
    "deliveryData",
    "budget",
    "status",
    "reservationStatus",
    "isArchived",
    "webPropertyCode",
    "appliedLabels",
    "effectiveAppliedLabels",
    "disableSameAdvertiserCompetitiveExclusion",
    "lastModifiedByApp",
    "notes",
    "competitiveConstraintScope",
    "lastModifiedDateTime",
    "creationDateTime",
    "customFieldValues",
    "isMissingCreatives",
    "programmaticCreativeSource",
    "thirdPartyMeasurementSettings",
    "youtubeKidsRestricted",
    "videoMaxDuration",
    "primaryGoal",
    "secondaryGoals",
    "grpSettings",
    "dealInfo",
    "viewabilityProviderCompanyIds",
    "childContentEligibility",
    "customVastExtension"
})
@XmlSeeAlso({
    LineItem.class
})
public class LineItemSummary {

    protected Long orderId;
    protected Long id;
    protected String name;
    protected String externalId;
    protected String orderName;
    protected DateTime startDateTime;
    @XmlSchemaType(name = "string")
    protected StartDateTimeType startDateTimeType;
    protected DateTime endDateTime;
    protected Integer autoExtensionDays;
    protected Boolean unlimitedEndDateTime;
    @XmlSchemaType(name = "string")
    protected CreativeRotationType creativeRotationType;
    @XmlSchemaType(name = "string")
    protected DeliveryRateType deliveryRateType;
    @XmlSchemaType(name = "string")
    protected DeliveryForecastSource deliveryForecastSource;
    protected CustomPacingCurve customPacingCurve;
    @XmlSchemaType(name = "string")
    protected RoadblockingType roadblockingType;
    @XmlSchemaType(name = "string")
    protected SkippableAdType skippableAdType;
    protected List<FrequencyCap> frequencyCaps;
    @XmlSchemaType(name = "string")
    protected LineItemType lineItemType;
    protected Integer priority;
    protected Money costPerUnit;
    protected Money valueCostPerUnit;
    @XmlSchemaType(name = "string")
    protected CostType costType;
    @XmlSchemaType(name = "string")
    protected LineItemDiscountType discountType;
    protected Double discount;
    protected Long contractedUnitsBought;
    protected List<CreativePlaceholder> creativePlaceholders;
    protected List<LineItemActivityAssociation> activityAssociations;
    @XmlSchemaType(name = "string")
    protected EnvironmentType environmentType;
    @XmlSchemaType(name = "string")
    protected List<AllowedFormats> allowedFormats;
    @XmlSchemaType(name = "string")
    protected CompanionDeliveryOption companionDeliveryOption;
    protected Boolean allowOverbook;
    protected Boolean skipInventoryCheck;
    protected Boolean skipCrossSellingRuleWarningChecks;
    protected Boolean reserveAtCreation;
    protected Stats stats;
    protected DeliveryIndicator deliveryIndicator;
    protected DeliveryData deliveryData;
    protected Money budget;
    @XmlSchemaType(name = "string")
    protected ComputedStatus status;
    @XmlSchemaType(name = "string")
    protected LineItemSummaryReservationStatus reservationStatus;
    protected Boolean isArchived;
    protected String webPropertyCode;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected Boolean disableSameAdvertiserCompetitiveExclusion;
    protected String lastModifiedByApp;
    protected String notes;
    @XmlSchemaType(name = "string")
    protected CompetitiveConstraintScope competitiveConstraintScope;
    protected DateTime lastModifiedDateTime;
    protected DateTime creationDateTime;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected Boolean isMissingCreatives;
    @XmlSchemaType(name = "string")
    protected ProgrammaticCreativeSource programmaticCreativeSource;
    protected ThirdPartyMeasurementSettings thirdPartyMeasurementSettings;
    protected Boolean youtubeKidsRestricted;
    protected Long videoMaxDuration;
    protected Goal primaryGoal;
    protected List<Goal> secondaryGoals;
    protected GrpSettings grpSettings;
    protected LineItemDealInfoDto dealInfo;
    @XmlElement(type = Long.class)
    protected List<Long> viewabilityProviderCompanyIds;
    @XmlSchemaType(name = "string")
    protected ChildContentEligibility childContentEligibility;
    protected String customVastExtension;

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
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the orderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets the value of the orderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderName(String value) {
        this.orderName = value;
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
     * Gets the value of the startDateTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateTimeType }
     *     
     */
    public StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }

    /**
     * Sets the value of the startDateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateTimeType }
     *     
     */
    public void setStartDateTimeType(StartDateTimeType value) {
        this.startDateTimeType = value;
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
     * Gets the value of the autoExtensionDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAutoExtensionDays() {
        return autoExtensionDays;
    }

    /**
     * Sets the value of the autoExtensionDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutoExtensionDays(Integer value) {
        this.autoExtensionDays = value;
    }

    /**
     * Gets the value of the unlimitedEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }

    /**
     * Sets the value of the unlimitedEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedEndDateTime(Boolean value) {
        this.unlimitedEndDateTime = value;
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
     * Gets the value of the deliveryForecastSource property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryForecastSource }
     *     
     */
    public DeliveryForecastSource getDeliveryForecastSource() {
        return deliveryForecastSource;
    }

    /**
     * Sets the value of the deliveryForecastSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryForecastSource }
     *     
     */
    public void setDeliveryForecastSource(DeliveryForecastSource value) {
        this.deliveryForecastSource = value;
    }

    /**
     * Gets the value of the customPacingCurve property.
     * 
     * @return
     *     possible object is
     *     {@link CustomPacingCurve }
     *     
     */
    public CustomPacingCurve getCustomPacingCurve() {
        return customPacingCurve;
    }

    /**
     * Sets the value of the customPacingCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomPacingCurve }
     *     
     */
    public void setCustomPacingCurve(CustomPacingCurve value) {
        this.customPacingCurve = value;
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
     * Gets the value of the skippableAdType property.
     * 
     * @return
     *     possible object is
     *     {@link SkippableAdType }
     *     
     */
    public SkippableAdType getSkippableAdType() {
        return skippableAdType;
    }

    /**
     * Sets the value of the skippableAdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkippableAdType }
     *     
     */
    public void setSkippableAdType(SkippableAdType value) {
        this.skippableAdType = value;
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
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the costPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCostPerUnit() {
        return costPerUnit;
    }

    /**
     * Sets the value of the costPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCostPerUnit(Money value) {
        this.costPerUnit = value;
    }

    /**
     * Gets the value of the valueCostPerUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getValueCostPerUnit() {
        return valueCostPerUnit;
    }

    /**
     * Sets the value of the valueCostPerUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setValueCostPerUnit(Money value) {
        this.valueCostPerUnit = value;
    }

    /**
     * Gets the value of the costType property.
     * 
     * @return
     *     possible object is
     *     {@link CostType }
     *     
     */
    public CostType getCostType() {
        return costType;
    }

    /**
     * Sets the value of the costType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CostType }
     *     
     */
    public void setCostType(CostType value) {
        this.costType = value;
    }

    /**
     * Gets the value of the discountType property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemDiscountType }
     *     
     */
    public LineItemDiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Sets the value of the discountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemDiscountType }
     *     
     */
    public void setDiscountType(LineItemDiscountType value) {
        this.discountType = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount(Double value) {
        this.discount = value;
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
     * Gets the value of the activityAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemActivityAssociation }
     * 
     * 
     */
    public List<LineItemActivityAssociation> getActivityAssociations() {
        if (activityAssociations == null) {
            activityAssociations = new ArrayList<LineItemActivityAssociation>();
        }
        return this.activityAssociations;
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
     * Gets the value of the allowOverbook property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowOverbook() {
        return allowOverbook;
    }

    /**
     * Sets the value of the allowOverbook property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowOverbook(Boolean value) {
        this.allowOverbook = value;
    }

    /**
     * Gets the value of the skipInventoryCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipInventoryCheck() {
        return skipInventoryCheck;
    }

    /**
     * Sets the value of the skipInventoryCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipInventoryCheck(Boolean value) {
        this.skipInventoryCheck = value;
    }

    /**
     * Gets the value of the skipCrossSellingRuleWarningChecks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipCrossSellingRuleWarningChecks() {
        return skipCrossSellingRuleWarningChecks;
    }

    /**
     * Sets the value of the skipCrossSellingRuleWarningChecks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipCrossSellingRuleWarningChecks(Boolean value) {
        this.skipCrossSellingRuleWarningChecks = value;
    }

    /**
     * Gets the value of the reserveAtCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReserveAtCreation() {
        return reserveAtCreation;
    }

    /**
     * Sets the value of the reserveAtCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReserveAtCreation(Boolean value) {
        this.reserveAtCreation = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link Stats }
     *     
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stats }
     *     
     */
    public void setStats(Stats value) {
        this.stats = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ComputedStatus }
     *     
     */
    public ComputedStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputedStatus }
     *     
     */
    public void setStatus(ComputedStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the reservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemSummaryReservationStatus }
     *     
     */
    public LineItemSummaryReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    /**
     * Sets the value of the reservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemSummaryReservationStatus }
     *     
     */
    public void setReservationStatus(LineItemSummaryReservationStatus value) {
        this.reservationStatus = value;
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
     * Gets the value of the webPropertyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPropertyCode() {
        return webPropertyCode;
    }

    /**
     * Sets the value of the webPropertyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPropertyCode(String value) {
        this.webPropertyCode = value;
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
     * Gets the value of the lastModifiedByApp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedByApp() {
        return lastModifiedByApp;
    }

    /**
     * Sets the value of the lastModifiedByApp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedByApp(String value) {
        this.lastModifiedByApp = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the competitiveConstraintScope property.
     * 
     * @return
     *     possible object is
     *     {@link CompetitiveConstraintScope }
     *     
     */
    public CompetitiveConstraintScope getCompetitiveConstraintScope() {
        return competitiveConstraintScope;
    }

    /**
     * Sets the value of the competitiveConstraintScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompetitiveConstraintScope }
     *     
     */
    public void setCompetitiveConstraintScope(CompetitiveConstraintScope value) {
        this.competitiveConstraintScope = value;
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
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreationDateTime(DateTime value) {
        this.creationDateTime = value;
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
     * Gets the value of the isMissingCreatives property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMissingCreatives() {
        return isMissingCreatives;
    }

    /**
     * Sets the value of the isMissingCreatives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMissingCreatives(Boolean value) {
        this.isMissingCreatives = value;
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
     * Gets the value of the youtubeKidsRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isYoutubeKidsRestricted() {
        return youtubeKidsRestricted;
    }

    /**
     * Sets the value of the youtubeKidsRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setYoutubeKidsRestricted(Boolean value) {
        this.youtubeKidsRestricted = value;
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
     * Gets the value of the primaryGoal property.
     * 
     * @return
     *     possible object is
     *     {@link Goal }
     *     
     */
    public Goal getPrimaryGoal() {
        return primaryGoal;
    }

    /**
     * Sets the value of the primaryGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Goal }
     *     
     */
    public void setPrimaryGoal(Goal value) {
        this.primaryGoal = value;
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
     * Gets the value of the dealInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemDealInfoDto }
     *     
     */
    public LineItemDealInfoDto getDealInfo() {
        return dealInfo;
    }

    /**
     * Sets the value of the dealInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemDealInfoDto }
     *     
     */
    public void setDealInfo(LineItemDealInfoDto value) {
        this.dealInfo = value;
    }

    /**
     * Gets the value of the viewabilityProviderCompanyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewabilityProviderCompanyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewabilityProviderCompanyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getViewabilityProviderCompanyIds() {
        if (viewabilityProviderCompanyIds == null) {
            viewabilityProviderCompanyIds = new ArrayList<Long>();
        }
        return this.viewabilityProviderCompanyIds;
    }

    /**
     * Gets the value of the childContentEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link ChildContentEligibility }
     *     
     */
    public ChildContentEligibility getChildContentEligibility() {
        return childContentEligibility;
    }

    /**
     * Sets the value of the childContentEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildContentEligibility }
     *     
     */
    public void setChildContentEligibility(ChildContentEligibility value) {
        this.childContentEligibility = value;
    }

    /**
     * Gets the value of the customVastExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomVastExtension() {
        return customVastExtension;
    }

    /**
     * Sets the value of the customVastExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomVastExtension(String value) {
        this.customVastExtension = value;
    }

}
