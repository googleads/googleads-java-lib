
package com.google.api.ads.dfp.jaxws.v201308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="rateCardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201308}DateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201308}DateTime" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costAdjustment" type="{https://www.google.com/apis/ads/publisher/v201308}CostAdjustment" minOccurs="0"/>
 *         &lt;element name="isArchived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="unitsBought" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitsBoughtBuffer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v201308}DeliveryRateType" minOccurs="0"/>
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v201308}RoadblockingType" minOccurs="0"/>
 *         &lt;element name="companionDeliveryOption" type="{https://www.google.com/apis/ads/publisher/v201308}CompanionDeliveryOption" minOccurs="0"/>
 *         &lt;element name="creativeRotationType" type="{https://www.google.com/apis/ads/publisher/v201308}CreativeRotationType" minOccurs="0"/>
 *         &lt;element name="frequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201308}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v201308}LineItemType" minOccurs="0"/>
 *         &lt;element name="lineItemPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="costType" type="{https://www.google.com/apis/ads/publisher/v201308}CostType" minOccurs="0"/>
 *         &lt;element name="creativePlaceholders" type="{https://www.google.com/apis/ads/publisher/v201308}CreativePlaceholder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v201308}Targeting" minOccurs="0"/>
 *         &lt;element name="customFieldValues" type="{https://www.google.com/apis/ads/publisher/v201308}BaseCustomFieldValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="appliedLabels" type="{https://www.google.com/apis/ads/publisher/v201308}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="effectiveAppliedLabels" type="{https://www.google.com/apis/ads/publisher/v201308}AppliedLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="premiums" type="{https://www.google.com/apis/ads/publisher/v201308}ProposalLineItemPremium" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baseRate" type="{https://www.google.com/apis/ads/publisher/v201308}Money" minOccurs="0"/>
 *         &lt;element name="costPerUnit" type="{https://www.google.com/apis/ads/publisher/v201308}Money" minOccurs="0"/>
 *         &lt;element name="cost" type="{https://www.google.com/apis/ads/publisher/v201308}Money" minOccurs="0"/>
 *         &lt;element name="deliveryIndicator" type="{https://www.google.com/apis/ads/publisher/v201308}DeliveryIndicator" minOccurs="0"/>
 *         &lt;element name="deliveryData" type="{https://www.google.com/apis/ads/publisher/v201308}DeliveryData" minOccurs="0"/>
 *         &lt;element name="computedStatus" type="{https://www.google.com/apis/ads/publisher/v201308}ComputedStatus" minOccurs="0"/>
 *         &lt;element name="billingCap" type="{https://www.google.com/apis/ads/publisher/v201308}BillingCap" minOccurs="0"/>
 *         &lt;element name="billingSchedule" type="{https://www.google.com/apis/ads/publisher/v201308}BillingSchedule" minOccurs="0"/>
 *         &lt;element name="billingSource" type="{https://www.google.com/apis/ads/publisher/v201308}BillingSource" minOccurs="0"/>
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
    "rateCardId",
    "productId",
    "name",
    "startDateTime",
    "endDateTime",
    "notes",
    "costAdjustment",
    "isArchived",
    "unitsBought",
    "unitsBoughtBuffer",
    "deliveryRateType",
    "roadblockingType",
    "companionDeliveryOption",
    "creativeRotationType",
    "frequencyCaps",
    "lineItemType",
    "lineItemPriority",
    "costType",
    "creativePlaceholders",
    "targeting",
    "customFieldValues",
    "appliedLabels",
    "effectiveAppliedLabels",
    "premiums",
    "baseRate",
    "costPerUnit",
    "cost",
    "deliveryIndicator",
    "deliveryData",
    "computedStatus",
    "billingCap",
    "billingSchedule",
    "billingSource"
})
public class ProposalLineItem {

    protected Long id;
    protected Long proposalId;
    protected Long rateCardId;
    protected String productId;
    protected String name;
    protected DateTime startDateTime;
    protected DateTime endDateTime;
    protected String notes;
    protected CostAdjustment costAdjustment;
    protected Boolean isArchived;
    protected Long unitsBought;
    protected Integer unitsBoughtBuffer;
    protected DeliveryRateType deliveryRateType;
    protected RoadblockingType roadblockingType;
    protected CompanionDeliveryOption companionDeliveryOption;
    protected CreativeRotationType creativeRotationType;
    protected List<FrequencyCap> frequencyCaps;
    protected LineItemType lineItemType;
    protected Integer lineItemPriority;
    protected CostType costType;
    protected List<CreativePlaceholder> creativePlaceholders;
    protected Targeting targeting;
    protected List<BaseCustomFieldValue> customFieldValues;
    protected List<AppliedLabel> appliedLabels;
    protected List<AppliedLabel> effectiveAppliedLabels;
    protected List<ProposalLineItemPremium> premiums;
    protected Money baseRate;
    protected Money costPerUnit;
    protected Money cost;
    protected DeliveryIndicator deliveryIndicator;
    protected DeliveryData deliveryData;
    protected ComputedStatus computedStatus;
    protected BillingCap billingCap;
    protected BillingSchedule billingSchedule;
    protected BillingSource billingSource;

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
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
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
     * Gets the value of the unitsBoughtBuffer property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnitsBoughtBuffer() {
        return unitsBoughtBuffer;
    }

    /**
     * Sets the value of the unitsBoughtBuffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnitsBoughtBuffer(Integer value) {
        this.unitsBoughtBuffer = value;
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
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCost(Money value) {
        this.cost = value;
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

}
