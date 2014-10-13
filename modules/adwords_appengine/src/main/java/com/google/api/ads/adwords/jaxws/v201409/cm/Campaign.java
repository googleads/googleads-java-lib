
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Data representing an AdWords campaign.
 *           
 * 
 * <p>Java class for Campaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Campaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201409}CampaignStatus" minOccurs="0"/>
 *         &lt;element name="servingStatus" type="{https://adwords.google.com/api/adwords/cm/v201409}ServingStatus" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budget" type="{https://adwords.google.com/api/adwords/cm/v201409}Budget" minOccurs="0"/>
 *         &lt;element name="conversionOptimizerEligibility" type="{https://adwords.google.com/api/adwords/cm/v201409}ConversionOptimizerEligibility" minOccurs="0"/>
 *         &lt;element name="adServingOptimizationStatus" type="{https://adwords.google.com/api/adwords/cm/v201409}AdServingOptimizationStatus" minOccurs="0"/>
 *         &lt;element name="frequencyCap" type="{https://adwords.google.com/api/adwords/cm/v201409}FrequencyCap" minOccurs="0"/>
 *         &lt;element name="settings" type="{https://adwords.google.com/api/adwords/cm/v201409}Setting" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="advertisingChannelType" type="{https://adwords.google.com/api/adwords/cm/v201409}AdvertisingChannelType" minOccurs="0"/>
 *         &lt;element name="advertisingChannelSubType" type="{https://adwords.google.com/api/adwords/cm/v201409}AdvertisingChannelSubType" minOccurs="0"/>
 *         &lt;element name="networkSetting" type="{https://adwords.google.com/api/adwords/cm/v201409}NetworkSetting" minOccurs="0"/>
 *         &lt;element name="labels" type="{https://adwords.google.com/api/adwords/cm/v201409}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="biddingStrategyConfiguration" type="{https://adwords.google.com/api/adwords/cm/v201409}BiddingStrategyConfiguration" minOccurs="0"/>
 *         &lt;element name="forwardCompatibilityMap" type="{https://adwords.google.com/api/adwords/cm/v201409}String_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201409}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campaign", propOrder = {
    "id",
    "name",
    "status",
    "servingStatus",
    "startDate",
    "endDate",
    "budget",
    "conversionOptimizerEligibility",
    "adServingOptimizationStatus",
    "frequencyCap",
    "settings",
    "advertisingChannelType",
    "advertisingChannelSubType",
    "networkSetting",
    "labels",
    "biddingStrategyConfiguration",
    "forwardCompatibilityMap",
    "trackingUrlTemplate",
    "urlCustomParameters"
})
public class Campaign {

    protected Long id;
    protected String name;
    protected CampaignStatus status;
    protected ServingStatus servingStatus;
    protected String startDate;
    protected String endDate;
    protected Budget budget;
    protected ConversionOptimizerEligibility conversionOptimizerEligibility;
    protected AdServingOptimizationStatus adServingOptimizationStatus;
    protected FrequencyCap frequencyCap;
    protected List<Setting> settings;
    protected AdvertisingChannelType advertisingChannelType;
    protected AdvertisingChannelSubType advertisingChannelSubType;
    protected NetworkSetting networkSetting;
    protected List<Label> labels;
    protected BiddingStrategyConfiguration biddingStrategyConfiguration;
    protected List<StringStringMapEntry> forwardCompatibilityMap;
    protected String trackingUrlTemplate;
    protected CustomParameters urlCustomParameters;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignStatus }
     *     
     */
    public CampaignStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignStatus }
     *     
     */
    public void setStatus(CampaignStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the servingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServingStatus }
     *     
     */
    public ServingStatus getServingStatus() {
        return servingStatus;
    }

    /**
     * Sets the value of the servingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingStatus }
     *     
     */
    public void setServingStatus(ServingStatus value) {
        this.servingStatus = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Budget }
     *     
     */
    public Budget getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Budget }
     *     
     */
    public void setBudget(Budget value) {
        this.budget = value;
    }

    /**
     * Gets the value of the conversionOptimizerEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionOptimizerEligibility }
     *     
     */
    public ConversionOptimizerEligibility getConversionOptimizerEligibility() {
        return conversionOptimizerEligibility;
    }

    /**
     * Sets the value of the conversionOptimizerEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionOptimizerEligibility }
     *     
     */
    public void setConversionOptimizerEligibility(ConversionOptimizerEligibility value) {
        this.conversionOptimizerEligibility = value;
    }

    /**
     * Gets the value of the adServingOptimizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdServingOptimizationStatus }
     *     
     */
    public AdServingOptimizationStatus getAdServingOptimizationStatus() {
        return adServingOptimizationStatus;
    }

    /**
     * Sets the value of the adServingOptimizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdServingOptimizationStatus }
     *     
     */
    public void setAdServingOptimizationStatus(AdServingOptimizationStatus value) {
        this.adServingOptimizationStatus = value;
    }

    /**
     * Gets the value of the frequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyCap }
     *     
     */
    public FrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    /**
     * Sets the value of the frequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyCap }
     *     
     */
    public void setFrequencyCap(FrequencyCap value) {
        this.frequencyCap = value;
    }

    /**
     * Gets the value of the settings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Setting }
     * 
     * 
     */
    public List<Setting> getSettings() {
        if (settings == null) {
            settings = new ArrayList<Setting>();
        }
        return this.settings;
    }

    /**
     * Gets the value of the advertisingChannelType property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisingChannelType }
     *     
     */
    public AdvertisingChannelType getAdvertisingChannelType() {
        return advertisingChannelType;
    }

    /**
     * Sets the value of the advertisingChannelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisingChannelType }
     *     
     */
    public void setAdvertisingChannelType(AdvertisingChannelType value) {
        this.advertisingChannelType = value;
    }

    /**
     * Gets the value of the advertisingChannelSubType property.
     * 
     * @return
     *     possible object is
     *     {@link AdvertisingChannelSubType }
     *     
     */
    public AdvertisingChannelSubType getAdvertisingChannelSubType() {
        return advertisingChannelSubType;
    }

    /**
     * Sets the value of the advertisingChannelSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvertisingChannelSubType }
     *     
     */
    public void setAdvertisingChannelSubType(AdvertisingChannelSubType value) {
        this.advertisingChannelSubType = value;
    }

    /**
     * Gets the value of the networkSetting property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSetting }
     *     
     */
    public NetworkSetting getNetworkSetting() {
        return networkSetting;
    }

    /**
     * Sets the value of the networkSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSetting }
     *     
     */
    public void setNetworkSetting(NetworkSetting value) {
        this.networkSetting = value;
    }

    /**
     * Gets the value of the labels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * 
     * 
     */
    public List<Label> getLabels() {
        if (labels == null) {
            labels = new ArrayList<Label>();
        }
        return this.labels;
    }

    /**
     * Gets the value of the biddingStrategyConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public BiddingStrategyConfiguration getBiddingStrategyConfiguration() {
        return biddingStrategyConfiguration;
    }

    /**
     * Sets the value of the biddingStrategyConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyConfiguration }
     *     
     */
    public void setBiddingStrategyConfiguration(BiddingStrategyConfiguration value) {
        this.biddingStrategyConfiguration = value;
    }

    /**
     * Gets the value of the forwardCompatibilityMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forwardCompatibilityMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForwardCompatibilityMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringStringMapEntry }
     * 
     * 
     */
    public List<StringStringMapEntry> getForwardCompatibilityMap() {
        if (forwardCompatibilityMap == null) {
            forwardCompatibilityMap = new ArrayList<StringStringMapEntry>();
        }
        return this.forwardCompatibilityMap;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the urlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getUrlCustomParameters() {
        return urlCustomParameters;
    }

    /**
     * Sets the value of the urlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setUrlCustomParameters(CustomParameters value) {
        this.urlCustomParameters = value;
    }

}
