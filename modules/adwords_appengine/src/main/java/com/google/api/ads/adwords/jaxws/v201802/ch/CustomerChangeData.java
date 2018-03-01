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


package com.google.api.ads.adwords.jaxws.v201802.ch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Holds information about changes to a customer
 *           
 * 
 * <p>Java class for CustomerChangeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerChangeData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changedCampaigns" type="{https://adwords.google.com/api/adwords/ch/v201802}CampaignChangeData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="changedFeeds" type="{https://adwords.google.com/api/adwords/ch/v201802}FeedChangeData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastChangeTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerChangeData", propOrder = {
    "changedCampaigns",
    "changedFeeds",
    "lastChangeTimestamp"
})
public class CustomerChangeData {

    protected List<CampaignChangeData> changedCampaigns;
    protected List<FeedChangeData> changedFeeds;
    protected String lastChangeTimestamp;

    /**
     * Gets the value of the changedCampaigns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedCampaigns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedCampaigns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignChangeData }
     * 
     * 
     */
    public List<CampaignChangeData> getChangedCampaigns() {
        if (changedCampaigns == null) {
            changedCampaigns = new ArrayList<CampaignChangeData>();
        }
        return this.changedCampaigns;
    }

    /**
     * Gets the value of the changedFeeds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changedFeeds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangedFeeds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedChangeData }
     * 
     * 
     */
    public List<FeedChangeData> getChangedFeeds() {
        if (changedFeeds == null) {
            changedFeeds = new ArrayList<FeedChangeData>();
        }
        return this.changedFeeds;
    }

    /**
     * Gets the value of the lastChangeTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChangeTimestamp() {
        return lastChangeTimestamp;
    }

    /**
     * Sets the value of the lastChangeTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChangeTimestamp(String value) {
        this.lastChangeTimestamp = value;
    }

}
