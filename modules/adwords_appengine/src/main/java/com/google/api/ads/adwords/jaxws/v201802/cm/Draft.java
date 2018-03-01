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
 *             The interface object which contains the basic information of a draft.  Entity specific
 *             information in the campaign tree are represented by their respective entities objects with a
 *             corresponding draftId.
 *           
 * 
 * <p>Java class for Draft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Draft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draftId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="draftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="draftStatus" type="{https://adwords.google.com/api/adwords/cm/v201802}DraftStatus" minOccurs="0"/>
 *         &lt;element name="draftCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="hasRunningTrial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Draft", propOrder = {
    "draftId",
    "baseCampaignId",
    "draftName",
    "draftStatus",
    "draftCampaignId",
    "hasRunningTrial"
})
public class Draft {

    protected Long draftId;
    protected Long baseCampaignId;
    protected String draftName;
    @XmlSchemaType(name = "string")
    protected DraftStatus draftStatus;
    protected Long draftCampaignId;
    protected Boolean hasRunningTrial;

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
     * Gets the value of the draftName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraftName() {
        return draftName;
    }

    /**
     * Sets the value of the draftName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraftName(String value) {
        this.draftName = value;
    }

    /**
     * Gets the value of the draftStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DraftStatus }
     *     
     */
    public DraftStatus getDraftStatus() {
        return draftStatus;
    }

    /**
     * Sets the value of the draftStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DraftStatus }
     *     
     */
    public void setDraftStatus(DraftStatus value) {
        this.draftStatus = value;
    }

    /**
     * Gets the value of the draftCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDraftCampaignId() {
        return draftCampaignId;
    }

    /**
     * Sets the value of the draftCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDraftCampaignId(Long value) {
        this.draftCampaignId = value;
    }

    /**
     * Gets the value of the hasRunningTrial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRunningTrial() {
        return hasRunningTrial;
    }

    /**
     * Sets the value of the hasRunningTrial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRunningTrial(Boolean value) {
        this.hasRunningTrial = value;
    }

}
