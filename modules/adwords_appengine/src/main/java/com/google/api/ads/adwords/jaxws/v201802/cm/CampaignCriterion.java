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
 *             Represents a campaign level criterion.
 *           
 * 
 * <p>Java class for CampaignCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="isNegative" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/cm/v201802}Criterion" minOccurs="0"/>
 *         &lt;element name="bidModifier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="campaignCriterionStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}CampaignCriterion.CampaignCriterionStatus" minOccurs="0"/>
 *         &lt;element name="baseCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="forwardCompatibilityMap" type="{https://adwords.google.com/api/adwords/cm/v201802}String_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CampaignCriterion.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignCriterion", propOrder = {
    "campaignId",
    "isNegative",
    "criterion",
    "bidModifier",
    "campaignCriterionStatus",
    "baseCampaignId",
    "forwardCompatibilityMap",
    "campaignCriterionType"
})
@XmlSeeAlso({
    NegativeCampaignCriterion.class
})
public class CampaignCriterion {

    protected Long campaignId;
    protected Boolean isNegative;
    protected Criterion criterion;
    protected Double bidModifier;
    @XmlSchemaType(name = "string")
    protected CampaignCriterionCampaignCriterionStatus campaignCriterionStatus;
    protected Long baseCampaignId;
    protected List<StringStringMapEntry> forwardCompatibilityMap;
    @XmlElement(name = "CampaignCriterion.Type")
    protected String campaignCriterionType;

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
     * Gets the value of the isNegative property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNegative() {
        return isNegative;
    }

    /**
     * Sets the value of the isNegative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNegative(Boolean value) {
        this.isNegative = value;
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
     * Gets the value of the campaignCriterionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignCriterionCampaignCriterionStatus }
     *     
     */
    public CampaignCriterionCampaignCriterionStatus getCampaignCriterionStatus() {
        return campaignCriterionStatus;
    }

    /**
     * Sets the value of the campaignCriterionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignCriterionCampaignCriterionStatus }
     *     
     */
    public void setCampaignCriterionStatus(CampaignCriterionCampaignCriterionStatus value) {
        this.campaignCriterionStatus = value;
    }

    /**
     * Gets the value of the baseCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseCampaignId() {
        return baseCampaignId;
    }

    /**
     * Sets the value of the baseCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseCampaignId(Long value) {
        this.baseCampaignId = value;
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
     * Gets the value of the campaignCriterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignCriterionType() {
        return campaignCriterionType;
    }

    /**
     * Sets the value of the campaignCriterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignCriterionType(String value) {
        this.campaignCriterionType = value;
    }

}
