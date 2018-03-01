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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A set of estimates for a criterion's performance for a specific bid
 *             amount.
 *           
 * 
 * <p>Java class for BidLandscape.LandscapePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BidLandscape.LandscapePoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bid" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="clicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="promotedImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="requiredBudget" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="biddableConversions" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="biddableConversionsValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bidModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalLocalImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalLocalClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalLocalCost" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="totalLocalPromotedImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BidLandscape.LandscapePoint", propOrder = {
    "bid",
    "clicks",
    "cost",
    "impressions",
    "promotedImpressions",
    "requiredBudget",
    "biddableConversions",
    "biddableConversionsValue",
    "bidModifier",
    "totalLocalImpressions",
    "totalLocalClicks",
    "totalLocalCost",
    "totalLocalPromotedImpressions"
})
public class BidLandscapeLandscapePoint {

    protected Money bid;
    protected Long clicks;
    protected Money cost;
    protected Long impressions;
    protected Long promotedImpressions;
    protected Money requiredBudget;
    protected Double biddableConversions;
    protected Double biddableConversionsValue;
    protected Double bidModifier;
    protected Long totalLocalImpressions;
    protected Long totalLocalClicks;
    protected Money totalLocalCost;
    protected Long totalLocalPromotedImpressions;

    /**
     * Gets the value of the bid property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBid() {
        return bid;
    }

    /**
     * Sets the value of the bid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBid(Money value) {
        this.bid = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClicks(Long value) {
        this.clicks = value;
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
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the promotedImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPromotedImpressions() {
        return promotedImpressions;
    }

    /**
     * Sets the value of the promotedImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPromotedImpressions(Long value) {
        this.promotedImpressions = value;
    }

    /**
     * Gets the value of the requiredBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getRequiredBudget() {
        return requiredBudget;
    }

    /**
     * Sets the value of the requiredBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setRequiredBudget(Money value) {
        this.requiredBudget = value;
    }

    /**
     * Gets the value of the biddableConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBiddableConversions() {
        return biddableConversions;
    }

    /**
     * Sets the value of the biddableConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBiddableConversions(Double value) {
        this.biddableConversions = value;
    }

    /**
     * Gets the value of the biddableConversionsValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBiddableConversionsValue() {
        return biddableConversionsValue;
    }

    /**
     * Sets the value of the biddableConversionsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBiddableConversionsValue(Double value) {
        this.biddableConversionsValue = value;
    }

    /**
     * Gets the value of the bidModifier property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBidModifier() {
        return bidModifier;
    }

    /**
     * Sets the value of the bidModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBidModifier(Double value) {
        this.bidModifier = value;
    }

    /**
     * Gets the value of the totalLocalImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalLocalImpressions() {
        return totalLocalImpressions;
    }

    /**
     * Sets the value of the totalLocalImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalLocalImpressions(Long value) {
        this.totalLocalImpressions = value;
    }

    /**
     * Gets the value of the totalLocalClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalLocalClicks() {
        return totalLocalClicks;
    }

    /**
     * Sets the value of the totalLocalClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalLocalClicks(Long value) {
        this.totalLocalClicks = value;
    }

    /**
     * Gets the value of the totalLocalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalLocalCost() {
        return totalLocalCost;
    }

    /**
     * Sets the value of the totalLocalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalLocalCost(Money value) {
        this.totalLocalCost = value;
    }

    /**
     * Gets the value of the totalLocalPromotedImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalLocalPromotedImpressions() {
        return totalLocalPromotedImpressions;
    }

    /**
     * Sets the value of the totalLocalPromotedImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalLocalPromotedImpressions(Long value) {
        this.totalLocalPromotedImpressions = value;
    }

}
