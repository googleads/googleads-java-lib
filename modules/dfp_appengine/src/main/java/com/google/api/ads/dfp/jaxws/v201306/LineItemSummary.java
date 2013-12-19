
package com.google.api.ads.dfp.jaxws.v201306;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The {@code LineItemSummary} represents the base class from which a {@code
 *             LineItem} is derived.
 *           
 * 
 * <p>Java class for LineItemSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201306}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTimeType" type="{https://www.google.com/apis/ads/publisher/v201306}StartDateTimeType" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201306}DateTime" minOccurs="0"/>
 *         &lt;element name="autoExtensionDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unlimitedEndDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="creativeRotationType" type="{https://www.google.com/apis/ads/publisher/v201306}CreativeRotationType" minOccurs="0"/>
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v201306}DeliveryRateType" minOccurs="0"/>
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v201306}RoadblockingType" minOccurs="0"/>
 *         &lt;element name="frequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201306}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v201306}LineItemType" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v201306}UnitType" minOccurs="0"/>
 *         &lt;element name="duration" type="{https://www.google.com/apis/ads/publisher/v201306}LineItemSummary.Duration" minOccurs="0"/>
 *         &lt;element name="unitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="costPerUnit" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="valueCostPerUnit" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="costType" type="{https://www.google.com/apis/ads/publisher/v201306}CostType" minOccurs="0"/>
 *         &lt;element name="discountType" type="{https://www.google.com/apis/ads/publisher/v201306}LineItemDiscountType" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="contractedUnitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v201306}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targetPlatform" type="{https://www.google.com/apis/ads/publisher/v201306}TargetPlatform" minOccurs="0"/>
 *         &lt;element name="environmentType" type="{https://www.google.com/apis/ads/publisher/v201306}EnvironmentType" minOccurs="0"/>
 *         &lt;element name="companionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v201306}CompanionDeliveryOption" minOccurs="0"/>
 *         &lt;element name="creativePersistenceType" type="{https://www.google.com/apis/ads/publisher/v201306}CreativePersistenceType" minOccurs="0"/>
 *         &lt;element name="allowOverbook" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="skipInventoryCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reserveAtCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://www.google.com/apis/ads/publisher/v201306}Stats" minOccurs="0"/>
 *         &lt;element name="deliveryIndicator" type="{https://www.google.com/apis/ads/publisher/v201306}DeliveryIndicator" minOccurs="0"/>
 *         &lt;element name="deliveryData" type="{https://www.google.com/apis/ads/publisher/v201306}DeliveryData" minOccurs="0"/>
 *         &lt;element name="budget" type="{https://www.google.com/apis/ads/publisher/v201306}Money" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201306}ComputedStatus" minOccurs="0"/>
 *         &lt;element name="reservationStatus" type="{https://www.google.com/apis/ads/publisher/v201306}LineItemSummary.ReservationStatus" minOccurs="0"/>
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="webPropertyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201306}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201306}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disableSameAdvertiserCompetitiveExclusion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lastModifiedByApp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201306}DateTime" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{https://www.google.com/apis/ads/publisher/v201306}DateTime" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201306}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isMissingCreatives" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LineItemSummary.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    "roadblockingType",
    "frequencyCaps",
    "lineItemType",
    "priority",
    "unitType",
    "duration",
    "unitsBought",
    "costPerUnit",
    "valueCostPerUnit",
    "costType",
    "discountType",
    "discount",
    "contractedUnitsBought",
    "creativePlaceholders",
    "targetPlatform",
    "environmentType",
    "companionDeliveryOption",
    "creativePersistenceType",
    "allowOverbook",
    "skipInventoryCheck",
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
    "lastModifiedDateTime",
    "creationDateTime",
    "customFieldValues",
    "isMissingCreatives",
    "lineItemSummaryType"
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
    protected StartDateTimeType startDateTimeType;
    protected DateTime endDateTime;
    protected Integer autoExtensionDays;
    protected Boolean unlimitedEndDateTime;
    protected CreativeRotationType creativeRotationType;
    protected DeliveryRateType deliveryRateType;
    protected RoadblockingType roadblockingType;
    protected List<FrequencyCap> frequencyCaps;
    protected LineItemType lineItemType;
    protected Integer priority;
    protected UnitType unitType;
    protected LineItemSummaryDuration duration;
    protected Long unitsBought;
    protected Money costPerUnit;
    protected Money valueCostPerUnit;
    protected CostType costType;
    protected LineItemDiscountType discountType;
    protected Double discount;
    protected Long contractedUnitsBought;
    protected List<CreativePlaceholder> creativePlaceholders;
    protected TargetPlatform targetPlatform;
    protected EnvironmentType environmentType;
    protected CompanionDeliveryOption companionDeliveryOption;
    protected CreativePersistenceType creativePersistenceType;
    protected Boolean allowOverbook;
    protected Boolean skipInventoryCheck;
    protected Boolean reserveAtCreation;
    protected Stats stats;
    protected DeliveryIndicator deliveryIndicator;
    protected DeliveryData deliveryData;
    protected Money budget;
    protected ComputedStatus status;
    protected LineItemSummaryReservationStatus reservationStatus;
    protected Boolean isArchived;
    protected String webPropertyCode;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected Boolean disableSameAdvertiserCompetitiveExclusion;
    protected String lastModifiedByApp;
    protected String notes;
    protected DateTime lastModifiedDateTime;
    protected DateTime creationDateTime;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected Boolean isMissingCreatives;
    @XmlElement(name = "LineItemSummary.Type")
    protected String lineItemSummaryType;

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
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnitType(UnitType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemSummaryDuration }
     *     
     */
    public LineItemSummaryDuration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemSummaryDuration }
     *     
     */
    public void setDuration(LineItemSummaryDuration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the unitsBought property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUnitsBought() {
        return unitsBought;
    }

    /**
     * Sets the value of the unitsBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUnitsBought(Long value) {
        this.unitsBought = value;
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
     * Gets the value of the targetPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link TargetPlatform }
     *     
     */
    public TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }

    /**
     * Sets the value of the targetPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetPlatform }
     *     
     */
    public void setTargetPlatform(TargetPlatform value) {
        this.targetPlatform = value;
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
     * Gets the value of the creativePersistenceType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativePersistenceType }
     *     
     */
    public CreativePersistenceType getCreativePersistenceType() {
        return creativePersistenceType;
    }

    /**
     * Sets the value of the creativePersistenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativePersistenceType }
     *     
     */
    public void setCreativePersistenceType(CreativePersistenceType value) {
        this.creativePersistenceType = value;
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
     * Gets the value of the lineItemSummaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemSummaryType() {
        return lineItemSummaryType;
    }

    /**
     * Sets the value of the lineItemSummaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemSummaryType(String value) {
        this.lineItemSummaryType = value;
    }

}
