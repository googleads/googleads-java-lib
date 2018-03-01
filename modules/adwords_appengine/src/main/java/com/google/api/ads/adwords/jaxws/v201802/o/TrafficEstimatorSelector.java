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
 *             Contains a list of campaigns to perform a traffic estimate on.
 *           
 * 
 * <p>Java class for TrafficEstimatorSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficEstimatorSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignEstimateRequests" type="{https://adwords.google.com/api/adwords/o/v201802}CampaignEstimateRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="platformEstimateRequested" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficEstimatorSelector", propOrder = {
    "campaignEstimateRequests",
    "platformEstimateRequested"
})
public class TrafficEstimatorSelector {

    protected List<CampaignEstimateRequest> campaignEstimateRequests;
    protected Boolean platformEstimateRequested;

    /**
     * Gets the value of the campaignEstimateRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignEstimateRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignEstimateRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampaignEstimateRequest }
     * 
     * 
     */
    public List<CampaignEstimateRequest> getCampaignEstimateRequests() {
        if (campaignEstimateRequests == null) {
            campaignEstimateRequests = new ArrayList<CampaignEstimateRequest>();
        }
        return this.campaignEstimateRequests;
    }

    /**
     * Gets the value of the platformEstimateRequested property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformEstimateRequested() {
        return platformEstimateRequested;
    }

    /**
     * Sets the value of the platformEstimateRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformEstimateRequested(Boolean value) {
        this.platformEstimateRequested = value;
    }

}
