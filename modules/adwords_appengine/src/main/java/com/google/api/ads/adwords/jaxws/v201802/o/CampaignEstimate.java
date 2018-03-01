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


package com.google.api.ads.adwords.jaxws.v201802.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the estimate results for a single campaign.
 *           
 * 
 * <p>Java class for CampaignEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignEstimate">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}Estimate">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adGroupEstimates" type="{https://adwords.google.com/api/adwords/o/v201802}AdGroupEstimate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="platformEstimates" type="{https://adwords.google.com/api/adwords/o/v201802}PlatformCampaignEstimate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEstimate", propOrder = {
    "campaignId",
    "adGroupEstimates",
    "platformEstimates"
})
public class CampaignEstimate
    extends Estimate
{

    protected Long campaignId;
    protected List<AdGroupEstimate> adGroupEstimates;
    protected List<PlatformCampaignEstimate> platformEstimates;

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
     * Gets the value of the adGroupEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupEstimate }
     * 
     * 
     */
    public List<AdGroupEstimate> getAdGroupEstimates() {
        if (adGroupEstimates == null) {
            adGroupEstimates = new ArrayList<AdGroupEstimate>();
        }
        return this.adGroupEstimates;
    }

    /**
     * Gets the value of the platformEstimates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the platformEstimates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlatformEstimates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlatformCampaignEstimate }
     * 
     * 
     */
    public List<PlatformCampaignEstimate> getPlatformEstimates() {
        if (platformEstimates == null) {
            platformEstimates = new ArrayList<PlatformCampaignEstimate>();
        }
        return this.platformEstimates;
    }

}
