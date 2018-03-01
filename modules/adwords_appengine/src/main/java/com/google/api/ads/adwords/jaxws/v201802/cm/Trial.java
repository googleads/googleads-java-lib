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
 *             Interface for campaign trial entities. A trial is an experiment created by an advertiser from
 *             changes in a draft.
 *           
 * 
 * <p>Java class for Trial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="draftId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="budgetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trafficSplitPercent" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}TrialStatus" minOccurs="0"/>
 *         &lt;element name="trialCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trial", propOrder = {
    "id",
    "baseCampaignId",
    "draftId",
    "budgetId",
    "name",
    "startDate",
    "endDate",
    "trafficSplitPercent",
    "status",
    "trialCampaignId"
})
public class Trial {

    protected Long id;
    protected Long baseCampaignId;
    protected Long draftId;
    protected Long budgetId;
    protected String name;
    protected String startDate;
    protected String endDate;
    protected Integer trafficSplitPercent;
    @XmlSchemaType(name = "string")
    protected TrialStatus status;
    protected Long trialCampaignId;

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
     * Gets the value of the draftId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDraftId() {
        return draftId;
    }

    /**
     * Sets the value of the draftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDraftId(Long value) {
        this.draftId = value;
    }

    /**
     * Gets the value of the budgetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetId() {
        return budgetId;
    }

    /**
     * Sets the value of the budgetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetId(Long value) {
        this.budgetId = value;
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
     * Gets the value of the trafficSplitPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrafficSplitPercent() {
        return trafficSplitPercent;
    }

    /**
     * Sets the value of the trafficSplitPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrafficSplitPercent(Integer value) {
        this.trafficSplitPercent = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TrialStatus }
     *     
     */
    public TrialStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrialStatus }
     *     
     */
    public void setStatus(TrialStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the trialCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrialCampaignId() {
        return trialCampaignId;
    }

    /**
     * Sets the value of the trialCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrialCampaignId(Long value) {
        this.trialCampaignId = value;
    }

}
