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
 *             Target Outrank Share bidding strategy is an automated bidding strategy which automatically sets
 *             bids so that the customer's ads appear above a specified competitors' ads for a specified target
 *             fraction of the advertiser's eligible impressions on Google.com.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for TargetOutrankShareBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetOutrankShareBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="targetOutrankShare" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="competitorDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCpcBidCeiling" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="bidChangesForRaisesOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "TargetOutrankShareBiddingScheme", propOrder = {
    "targetOutrankShare",
    "competitorDomain",
    "maxCpcBidCeiling",
    "bidChangesForRaisesOnly",
    "raiseBidWhenLowQualityScore"
})
public class TargetOutrankShareBiddingScheme
    extends BiddingScheme
{

    protected Integer targetOutrankShare;
    protected String competitorDomain;
    protected Money maxCpcBidCeiling;
    protected Boolean bidChangesForRaisesOnly;
    protected Boolean raiseBidWhenLowQualityScore;

    /**
     * Gets the value of the targetOutrankShare property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTargetOutrankShare() {
        return targetOutrankShare;
    }

    /**
     * Sets the value of the targetOutrankShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTargetOutrankShare(Integer value) {
        this.targetOutrankShare = value;
    }

    /**
     * Gets the value of the competitorDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetitorDomain() {
        return competitorDomain;
    }

    /**
     * Sets the value of the competitorDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetitorDomain(String value) {
        this.competitorDomain = value;
    }

    /**
     * Gets the value of the maxCpcBidCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxCpcBidCeiling() {
        return maxCpcBidCeiling;
    }

    /**
     * Sets the value of the maxCpcBidCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxCpcBidCeiling(Money value) {
        this.maxCpcBidCeiling = value;
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
