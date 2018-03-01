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
 *             Represents a criterion in an ad group, used with AdGroupCriterionService.
 *           
 * 
 * <p>Java class for AdGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupCriterion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="criterionUse" type="{https://adwords.google.com/api/adwords/cm/v201802}CriterionUse" minOccurs="0"/>
 *         &lt;element name="criterion" type="{https://adwords.google.com/api/adwords/cm/v201802}Criterion" minOccurs="0"/>
 *         &lt;element name="labels" type="{https://adwords.google.com/api/adwords/cm/v201802}Label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forwardCompatibilityMap" type="{https://adwords.google.com/api/adwords/cm/v201802}String_StringMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="baseCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseAdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="AdGroupCriterion.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupCriterion", propOrder = {
    "adGroupId",
    "criterionUse",
    "criterion",
    "labels",
    "forwardCompatibilityMap",
    "baseCampaignId",
    "baseAdGroupId",
    "adGroupCriterionType"
})
@XmlSeeAlso({
    NegativeAdGroupCriterion.class,
    BiddableAdGroupCriterion.class
})
public class AdGroupCriterion {

    protected Long adGroupId;
    @XmlSchemaType(name = "string")
    protected CriterionUse criterionUse;
    protected Criterion criterion;
    protected List<Label> labels;
    protected List<StringStringMapEntry> forwardCompatibilityMap;
    protected Long baseCampaignId;
    protected Long baseAdGroupId;
    @XmlElement(name = "AdGroupCriterion.Type")
    protected String adGroupCriterionType;

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
     * Gets the value of the criterionUse property.
     * 
     * @return
     *     possible object is
     *     {@link CriterionUse }
     *     
     */
    public CriterionUse getCriterionUse() {
        return criterionUse;
    }

    /**
     * Sets the value of the criterionUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterionUse }
     *     
     */
    public void setCriterionUse(CriterionUse value) {
        this.criterionUse = value;
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
     * Gets the value of the adGroupCriterionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdGroupCriterionType() {
        return adGroupCriterionType;
    }

    /**
     * Sets the value of the adGroupCriterionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdGroupCriterionType(String value) {
        this.adGroupCriterionType = value;
    }

}
