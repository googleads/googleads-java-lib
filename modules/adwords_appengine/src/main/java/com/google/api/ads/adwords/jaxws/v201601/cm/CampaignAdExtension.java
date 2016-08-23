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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a campaign level ad extension. A campaign ad extension specifies
 *             a campaign and an ad extension which can extend any ad under that campaign.
 *           
 * 
 * <p>Java class for CampaignAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignAdExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adExtension" type="{https://adwords.google.com/api/adwords/cm/v201601}AdExtension" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201601}CampaignAdExtension.Status" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201601}CampaignAdExtension.ApprovalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignAdExtension", propOrder = {
    "campaignId",
    "adExtension",
    "status",
    "approvalStatus"
})
public class CampaignAdExtension {

    protected Long campaignId;
    protected AdExtension adExtension;
    @XmlSchemaType(name = "string")
    protected CampaignAdExtensionStatus status;
    @XmlSchemaType(name = "string")
    protected CampaignAdExtensionApprovalStatus approvalStatus;

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
     * Gets the value of the adExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtension }
     *     
     */
    public AdExtension getAdExtension() {
        return adExtension;
    }

    /**
     * Sets the value of the adExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtension }
     *     
     */
    public void setAdExtension(AdExtension value) {
        this.adExtension = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAdExtensionStatus }
     *     
     */
    public CampaignAdExtensionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAdExtensionStatus }
     *     
     */
    public void setStatus(CampaignAdExtensionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAdExtensionApprovalStatus }
     *     
     */
    public CampaignAdExtensionApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAdExtensionApprovalStatus }
     *     
     */
    public void setApprovalStatus(CampaignAdExtensionApprovalStatus value) {
        this.approvalStatus = value;
    }

}
