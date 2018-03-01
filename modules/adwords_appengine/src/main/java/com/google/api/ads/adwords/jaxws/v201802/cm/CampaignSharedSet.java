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
 *             CampaignSharedSets are used for managing the shared sets
 *             associated with a campaign.
 *           
 * 
 * <p>Java class for CampaignSharedSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignSharedSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sharedSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sharedSetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sharedSetType" type="{https://adwords.google.com/api/adwords/cm/v201802}SharedSetType" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}CampaignSharedSet.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignSharedSet", propOrder = {
    "sharedSetId",
    "campaignId",
    "sharedSetName",
    "sharedSetType",
    "campaignName",
    "status"
})
public class CampaignSharedSet {

    protected Long sharedSetId;
    protected Long campaignId;
    protected String sharedSetName;
    @XmlSchemaType(name = "string")
    protected SharedSetType sharedSetType;
    protected String campaignName;
    @XmlSchemaType(name = "string")
    protected CampaignSharedSetStatus status;

    /**
     * Gets the value of the sharedSetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSharedSetId() {
        return sharedSetId;
    }

    /**
     * Sets the value of the sharedSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSharedSetId(Long value) {
        this.sharedSetId = value;
    }

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
     * Gets the value of the sharedSetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedSetName() {
        return sharedSetName;
    }

    /**
     * Sets the value of the sharedSetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedSetName(String value) {
        this.sharedSetName = value;
    }

    /**
     * Gets the value of the sharedSetType property.
     * 
     * @return
     *     possible object is
     *     {@link SharedSetType }
     *     
     */
    public SharedSetType getSharedSetType() {
        return sharedSetType;
    }

    /**
     * Sets the value of the sharedSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedSetType }
     *     
     */
    public void setSharedSetType(SharedSetType value) {
        this.sharedSetType = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSharedSetStatus }
     *     
     */
    public CampaignSharedSetStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSharedSetStatus }
     *     
     */
    public void setStatus(CampaignSharedSetStatus value) {
        this.status = value;
    }

}
