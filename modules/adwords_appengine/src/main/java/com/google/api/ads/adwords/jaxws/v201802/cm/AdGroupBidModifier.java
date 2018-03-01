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
 *             Represents an adgroup level bid modifier override for campaign level criterion
 *             bid modifier values.
 *           
 * 
 * <p>Java class for AdGroupBidModifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupBidModifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/cm/v201802}Criterion" minOccurs="0"/>
 *         &lt;element name="bidModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="baseAdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bidModifierSource" type="{https://adwords.google.com/api/adwords/cm/v201802}BidModifierSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupBidModifier", propOrder = {
    "campaignId",
    "adGroupId",
    "criterion",
    "bidModifier",
    "baseAdGroupId",
    "bidModifierSource"
})
public class AdGroupBidModifier {

    protected Long campaignId;
    protected Long adGroupId;
    protected Criterion criterion;
    protected Double bidModifier;
    protected Long baseAdGroupId;
    @XmlSchemaType(name = "string")
    protected BidModifierSource bidModifierSource;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the adGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdGroupId() {
        return adGroupId;
    }

    /**
     * Sets the value of the adGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdGroupId(Long value) {
        this.adGroupId = value;
    }

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link Criterion }
     *     
     */
    public Criterion getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criterion }
     *     
     */
    public void setCriterion(Criterion value) {
        this.criterion = value;
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
     * Gets the value of the baseAdGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseAdGroupId() {
        return baseAdGroupId;
    }

    /**
     * Sets the value of the baseAdGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseAdGroupId(Long value) {
        this.baseAdGroupId = value;
    }

    /**
     * Gets the value of the bidModifierSource property.
     * 
     * @return
     *     possible object is
     *     {@link BidModifierSource }
     *     
     */
    public BidModifierSource getBidModifierSource() {
        return bidModifierSource;
    }

    /**
     * Sets the value of the bidModifierSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidModifierSource }
     *     
     */
    public void setBidModifierSource(BidModifierSource value) {
        this.bidModifierSource = value;
    }

}
