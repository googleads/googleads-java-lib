
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A marker interface for entities that can be operated upon in mutate
 *             operations.
 *           
 * 
 * <p>Java class for Operand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Operand">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AdExtensionOverride" type="{https://adwords.google.com/api/adwords/cm/v201402}AdExtensionOverride"/>
 *         &lt;element name="AdGroupAd" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupAd"/>
 *         &lt;element name="AdGroupBidModifier" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupBidModifier"/>
 *         &lt;element name="AdGroupCriterion" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroupCriterion"/>
 *         &lt;element name="AdGroup" type="{https://adwords.google.com/api/adwords/cm/v201402}AdGroup"/>
 *         &lt;element name="Ad" type="{https://adwords.google.com/api/adwords/cm/v201402}Ad"/>
 *         &lt;element name="Budget" type="{https://adwords.google.com/api/adwords/cm/v201402}Budget"/>
 *         &lt;element name="CampaignAdExtension" type="{https://adwords.google.com/api/adwords/cm/v201402}CampaignAdExtension"/>
 *         &lt;element name="CampaignCriterion" type="{https://adwords.google.com/api/adwords/cm/v201402}CampaignCriterion"/>
 *         &lt;element name="Campaign" type="{https://adwords.google.com/api/adwords/cm/v201402}Campaign"/>
 *         &lt;element name="FeedItem" type="{https://adwords.google.com/api/adwords/cm/v201402}FeedItem"/>
 *         &lt;element name="Job" type="{https://adwords.google.com/api/adwords/cm/v201402}Job"/>
 *         &lt;element name="Media" type="{https://adwords.google.com/api/adwords/cm/v201402}Media"/>
 *         &lt;element name="PlaceHolder" type="{https://adwords.google.com/api/adwords/cm/v201402}PlaceHolder"/>
 *         &lt;element name="TargetList" type="{https://adwords.google.com/api/adwords/cm/v201402}TargetList"/>
 *         &lt;element name="Target" type="{https://adwords.google.com/api/adwords/cm/v201402}Target"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Operand", propOrder = {
    "adExtensionOverride",
    "adGroupAd",
    "adGroupBidModifier",
    "adGroupCriterion",
    "adGroup",
    "ad",
    "budget",
    "campaignAdExtension",
    "campaignCriterion",
    "campaign",
    "feedItem",
    "job",
    "media",
    "placeHolder",
    "targetList",
    "target"
})
public class Operand {

    @XmlElement(name = "AdExtensionOverride")
    protected AdExtensionOverride adExtensionOverride;
    @XmlElement(name = "AdGroupAd")
    protected AdGroupAd adGroupAd;
    @XmlElement(name = "AdGroupBidModifier")
    protected AdGroupBidModifier adGroupBidModifier;
    @XmlElement(name = "AdGroupCriterion")
    protected AdGroupCriterion adGroupCriterion;
    @XmlElement(name = "AdGroup")
    protected AdGroup adGroup;
    @XmlElement(name = "Ad")
    protected Ad ad;
    @XmlElement(name = "Budget")
    protected Budget budget;
    @XmlElement(name = "CampaignAdExtension")
    protected CampaignAdExtension campaignAdExtension;
    @XmlElement(name = "CampaignCriterion")
    protected CampaignCriterion campaignCriterion;
    @XmlElement(name = "Campaign")
    protected Campaign campaign;
    @XmlElement(name = "FeedItem")
    protected FeedItem feedItem;
    @XmlElement(name = "Job")
    protected Job job;
    @XmlElement(name = "Media")
    protected Media media;
    @XmlElement(name = "PlaceHolder")
    protected PlaceHolder placeHolder;
    @XmlElement(name = "TargetList")
    protected TargetList targetList;
    @XmlElement(name = "Target")
    protected Target target;

    /**
     * Gets the value of the adExtensionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtensionOverride }
     *     
     */
    public AdExtensionOverride getAdExtensionOverride() {
        return adExtensionOverride;
    }

    /**
     * Sets the value of the adExtensionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtensionOverride }
     *     
     */
    public void setAdExtensionOverride(AdExtensionOverride value) {
        this.adExtensionOverride = value;
    }

    /**
     * Gets the value of the adGroupAd property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAd }
     *     
     */
    public AdGroupAd getAdGroupAd() {
        return adGroupAd;
    }

    /**
     * Sets the value of the adGroupAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAd }
     *     
     */
    public void setAdGroupAd(AdGroupAd value) {
        this.adGroupAd = value;
    }

    /**
     * Gets the value of the adGroupBidModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupBidModifier }
     *     
     */
    public AdGroupBidModifier getAdGroupBidModifier() {
        return adGroupBidModifier;
    }

    /**
     * Sets the value of the adGroupBidModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupBidModifier }
     *     
     */
    public void setAdGroupBidModifier(AdGroupBidModifier value) {
        this.adGroupBidModifier = value;
    }

    /**
     * Gets the value of the adGroupCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterion }
     *     
     */
    public AdGroupCriterion getAdGroupCriterion() {
        return adGroupCriterion;
    }

    /**
     * Sets the value of the adGroupCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterion }
     *     
     */
    public void setAdGroupCriterion(AdGroupCriterion value) {
        this.adGroupCriterion = value;
    }

    /**
     * Gets the value of the adGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroup }
     *     
     */
    public AdGroup getAdGroup() {
        return adGroup;
    }

    /**
     * Sets the value of the adGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroup }
     *     
     */
    public void setAdGroup(AdGroup value) {
        this.adGroup = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link Ad }
     *     
     */
    public Ad getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ad }
     *     
     */
    public void setAd(Ad value) {
        this.ad = value;
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
     * Gets the value of the campaignAdExtension property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAdExtension }
     *     
     */
    public CampaignAdExtension getCampaignAdExtension() {
        return campaignAdExtension;
    }

    /**
     * Sets the value of the campaignAdExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAdExtension }
     *     
     */
    public void setCampaignAdExtension(CampaignAdExtension value) {
        this.campaignAdExtension = value;
    }

    /**
     * Gets the value of the campaignCriterion property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignCriterion }
     *     
     */
    public CampaignCriterion getCampaignCriterion() {
        return campaignCriterion;
    }

    /**
     * Sets the value of the campaignCriterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignCriterion }
     *     
     */
    public void setCampaignCriterion(CampaignCriterion value) {
        this.campaignCriterion = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link Campaign }
     *     
     */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link Campaign }
     *     
     */
    public void setCampaign(Campaign value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the feedItem property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItem }
     *     
     */
    public FeedItem getFeedItem() {
        return feedItem;
    }

    /**
     * Sets the value of the feedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItem }
     *     
     */
    public void setFeedItem(FeedItem value) {
        this.feedItem = value;
    }

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link Job }
     *     
     */
    public Job getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link Job }
     *     
     */
    public void setJob(Job value) {
        this.job = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setMedia(Media value) {
        this.media = value;
    }

    /**
     * Gets the value of the placeHolder property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceHolder }
     *     
     */
    public PlaceHolder getPlaceHolder() {
        return placeHolder;
    }

    /**
     * Sets the value of the placeHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceHolder }
     *     
     */
    public void setPlaceHolder(PlaceHolder value) {
        this.placeHolder = value;
    }

    /**
     * Gets the value of the targetList property.
     * 
     * @return
     *     possible object is
     *     {@link TargetList }
     *     
     */
    public TargetList getTargetList() {
        return targetList;
    }

    /**
     * Sets the value of the targetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetList }
     *     
     */
    public void setTargetList(TargetList value) {
        this.targetList = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Target }
     *     
     */
    public Target getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Target }
     *     
     */
    public void setTarget(Target value) {
        this.target = value;
    }

}
