// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201601.cm;

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
 *         &lt;element name="AdGroupAdLabel" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroupAdLabel"/>
 *         &lt;element name="AdGroupAd" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroupAd"/>
 *         &lt;element name="AdGroupBidModifier" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroupBidModifier"/>
 *         &lt;element name="AdGroupCriterionLabel" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroupCriterionLabel"/>
 *         &lt;element name="AdGroupCriterion" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroupCriterion"/>
 *         &lt;element name="AdGroupLabel" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroupLabel"/>
 *         &lt;element name="AdGroup" type="{https://adwords.google.com/api/adwords/cm/v201601}AdGroup"/>
 *         &lt;element name="Ad" type="{https://adwords.google.com/api/adwords/cm/v201601}Ad"/>
 *         &lt;element name="Budget" type="{https://adwords.google.com/api/adwords/cm/v201601}Budget"/>
 *         &lt;element name="CampaignAdExtension" type="{https://adwords.google.com/api/adwords/cm/v201601}CampaignAdExtension"/>
 *         &lt;element name="CampaignCriterion" type="{https://adwords.google.com/api/adwords/cm/v201601}CampaignCriterion"/>
 *         &lt;element name="CampaignLabel" type="{https://adwords.google.com/api/adwords/cm/v201601}CampaignLabel"/>
 *         &lt;element name="Campaign" type="{https://adwords.google.com/api/adwords/cm/v201601}Campaign"/>
 *         &lt;element name="FeedItem" type="{https://adwords.google.com/api/adwords/cm/v201601}FeedItem"/>
 *         &lt;element name="Job" type="{https://adwords.google.com/api/adwords/cm/v201601}Job"/>
 *         &lt;element name="Label" type="{https://adwords.google.com/api/adwords/cm/v201601}Label"/>
 *         &lt;element name="Media" type="{https://adwords.google.com/api/adwords/cm/v201601}Media"/>
 *         &lt;element name="PlaceHolder" type="{https://adwords.google.com/api/adwords/cm/v201601}PlaceHolder"/>
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
    "adGroupAdLabel",
    "adGroupAd",
    "adGroupBidModifier",
    "adGroupCriterionLabel",
    "adGroupCriterion",
    "adGroupLabel",
    "adGroup",
    "ad",
    "budget",
    "campaignAdExtension",
    "campaignCriterion",
    "campaignLabel",
    "campaign",
    "feedItem",
    "job",
    "label",
    "media",
    "placeHolder"
})
public class Operand {

    @XmlElement(name = "AdGroupAdLabel")
    protected AdGroupAdLabel adGroupAdLabel;
    @XmlElement(name = "AdGroupAd")
    protected AdGroupAd adGroupAd;
    @XmlElement(name = "AdGroupBidModifier")
    protected AdGroupBidModifier adGroupBidModifier;
    @XmlElement(name = "AdGroupCriterionLabel")
    protected AdGroupCriterionLabel adGroupCriterionLabel;
    @XmlElement(name = "AdGroupCriterion")
    protected AdGroupCriterion adGroupCriterion;
    @XmlElement(name = "AdGroupLabel")
    protected AdGroupLabel adGroupLabel;
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
    @XmlElement(name = "CampaignLabel")
    protected CampaignLabel campaignLabel;
    @XmlElement(name = "Campaign")
    protected Campaign campaign;
    @XmlElement(name = "FeedItem")
    protected FeedItem feedItem;
    @XmlElement(name = "Job")
    protected Job job;
    @XmlElement(name = "Label")
    protected Label label;
    @XmlElement(name = "Media")
    protected Media media;
    @XmlElement(name = "PlaceHolder")
    protected PlaceHolder placeHolder;

    /**
     * Gets the value of the adGroupAdLabel property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAdLabel }
     *     
     */
    public AdGroupAdLabel getAdGroupAdLabel() {
        return adGroupAdLabel;
    }

    /**
     * Sets the value of the adGroupAdLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAdLabel }
     *     
     */
    public void setAdGroupAdLabel(AdGroupAdLabel value) {
        this.adGroupAdLabel = value;
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
     * Gets the value of the adGroupCriterionLabel property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupCriterionLabel }
     *     
     */
    public AdGroupCriterionLabel getAdGroupCriterionLabel() {
        return adGroupCriterionLabel;
    }

    /**
     * Sets the value of the adGroupCriterionLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupCriterionLabel }
     *     
     */
    public void setAdGroupCriterionLabel(AdGroupCriterionLabel value) {
        this.adGroupCriterionLabel = value;
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
     * Gets the value of the adGroupLabel property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupLabel }
     *     
     */
    public AdGroupLabel getAdGroupLabel() {
        return adGroupLabel;
    }

    /**
     * Sets the value of the adGroupLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupLabel }
     *     
     */
    public void setAdGroupLabel(AdGroupLabel value) {
        this.adGroupLabel = value;
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
     * Gets the value of the campaignLabel property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignLabel }
     *     
     */
    public CampaignLabel getCampaignLabel() {
        return campaignLabel;
    }

    /**
     * Sets the value of the campaignLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignLabel }
     *     
     */
    public void setCampaignLabel(CampaignLabel value) {
        this.campaignLabel = value;
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
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link Label }
     *     
     */
    public Label getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link Label }
     *     
     */
    public void setLabel(Label value) {
        this.label = value;
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

}
