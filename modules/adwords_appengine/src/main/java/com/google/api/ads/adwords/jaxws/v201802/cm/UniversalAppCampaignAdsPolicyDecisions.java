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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains Universal App Campaign Ads Policy decisions with asset identifier information, where
 *             available.
 *           
 * 
 * <p>Java class for UniversalAppCampaignAdsPolicyDecisions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalAppCampaignAdsPolicyDecisions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="universalAppCampaignAsset" type="{https://adwords.google.com/api/adwords/cm/v201802}UniversalAppCampaignAsset" minOccurs="0"/>
 *         &lt;element name="assetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policyTopicEntries" type="{https://adwords.google.com/api/adwords/cm/v201802}PolicyTopicEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalAppCampaignAdsPolicyDecisions", propOrder = {
    "universalAppCampaignAsset",
    "assetId",
    "policyTopicEntries"
})
public class UniversalAppCampaignAdsPolicyDecisions {

    @XmlSchemaType(name = "string")
    protected UniversalAppCampaignAsset universalAppCampaignAsset;
    protected String assetId;
    protected List<PolicyTopicEntry> policyTopicEntries;

    /**
     * Gets the value of the universalAppCampaignAsset property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalAppCampaignAsset }
     *     
     */
    public UniversalAppCampaignAsset getUniversalAppCampaignAsset() {
        return universalAppCampaignAsset;
    }

    /**
     * Sets the value of the universalAppCampaignAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalAppCampaignAsset }
     *     
     */
    public void setUniversalAppCampaignAsset(UniversalAppCampaignAsset value) {
        this.universalAppCampaignAsset = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the policyTopicEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policyTopicEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicyTopicEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyTopicEntry }
     * 
     * 
     */
    public List<PolicyTopicEntry> getPolicyTopicEntries() {
        if (policyTopicEntries == null) {
            policyTopicEntries = new ArrayList<PolicyTopicEntry>();
        }
        return this.policyTopicEntries;
    }

}
