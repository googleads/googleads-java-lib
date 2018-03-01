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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Page-One Promoted bidding scheme, which sets max cpc bids to
 *             target impressions on page one or page one promoted slots on google.com.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for PageOnePromotedBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageOnePromotedBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="strategyGoal" type="{https://adwords.google.com/api/adwords/cm/v201802}PageOnePromotedBiddingScheme.StrategyGoal" minOccurs="0"/>
 *         &lt;element name="bidCeiling" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="bidModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bidChangesForRaisesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="raiseBidWhenBudgetConstrained" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="raiseBidWhenLowQualityScore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageOnePromotedBiddingScheme", propOrder = {
    "strategyGoal",
    "bidCeiling",
    "bidModifier",
    "bidChangesForRaisesOnly",
    "raiseBidWhenBudgetConstrained",
    "raiseBidWhenLowQualityScore"
})
public class PageOnePromotedBiddingScheme
    extends BiddingScheme
{

    @XmlSchemaType(name = "string")
    protected PageOnePromotedBiddingSchemeStrategyGoal strategyGoal;
    protected Money bidCeiling;
    protected Double bidModifier;
    protected Boolean bidChangesForRaisesOnly;
    protected Boolean raiseBidWhenBudgetConstrained;
    protected Boolean raiseBidWhenLowQualityScore;

    /**
     * Gets the value of the strategyGoal property.
     * 
     * @return
     *     possible object is
     *     {@link PageOnePromotedBiddingSchemeStrategyGoal }
     *     
     */
    public PageOnePromotedBiddingSchemeStrategyGoal getStrategyGoal() {
        return strategyGoal;
    }

    /**
     * Sets the value of the strategyGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageOnePromotedBiddingSchemeStrategyGoal }
     *     
     */
    public void setStrategyGoal(PageOnePromotedBiddingSchemeStrategyGoal value) {
        this.strategyGoal = value;
    }

    /**
     * Gets the value of the bidCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Sets the value of the bidCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBidCeiling(Money value) {
        this.bidCeiling = value;
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
     * Gets the value of the bidChangesForRaisesOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBidChangesForRaisesOnly() {
        return bidChangesForRaisesOnly;
    }

    /**
     * Sets the value of the bidChangesForRaisesOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBidChangesForRaisesOnly(Boolean value) {
        this.bidChangesForRaisesOnly = value;
    }

    /**
     * Gets the value of the raiseBidWhenBudgetConstrained property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRaiseBidWhenBudgetConstrained() {
        return raiseBidWhenBudgetConstrained;
    }

    /**
     * Sets the value of the raiseBidWhenBudgetConstrained property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaiseBidWhenBudgetConstrained(Boolean value) {
        this.raiseBidWhenBudgetConstrained = value;
    }

    /**
     * Gets the value of the raiseBidWhenLowQualityScore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRaiseBidWhenLowQualityScore() {
        return raiseBidWhenLowQualityScore;
    }

    /**
     * Sets the value of the raiseBidWhenLowQualityScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRaiseBidWhenLowQualityScore(Boolean value) {
        this.raiseBidWhenLowQualityScore = value;
    }

}
