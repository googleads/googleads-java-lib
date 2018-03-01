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
import com.google.api.ads.adwords.jaxws.v201802.cm.Criterion;
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;
import com.google.api.ads.adwords.jaxws.v201802.cm.NetworkSetting;


/**
 * 
 *             Represents a campaign that will be estimated.<p>
 *             
 *             Returns traffic estimates for the requested set of campaigns.
 *             The campaigns can be all new or all existing, or a mixture of
 *             new and existing. Only existing campaigns may contain estimates for existing
 *             ad groups.<p>
 *             
 *             For existing campaigns, the campaign and optionally the ad group will be
 *             used as context to produce more accurate estimates. Traffic estimates may
 *             only be requested on keywords, so regardless of whether campaign and ad group
 *             IDs are provided or left blank, at least one keyword is required to estimate
 *             traffic.<p>
 *             
 *             To make a keyword estimates request in which estimates do not consider
 *             existing account information (e.g. historical ad group performance), set
 *             {@link #campaignId} to {@code null}.
 *           
 * 
 * <p>Java class for CampaignEstimateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignEstimateRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201802}EstimateRequest">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adGroupEstimateRequests" type="{https://adwords.google.com/api/adwords/o/v201802}AdGroupEstimateRequest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="criteria" type="{https://adwords.google.com/api/adwords/cm/v201802}Criterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkSetting" type="{https://adwords.google.com/api/adwords/cm/v201802}NetworkSetting" minOccurs="0"/>
 *         &lt;element name="dailyBudget" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignEstimateRequest", propOrder = {
    "campaignId",
    "adGroupEstimateRequests",
    "criteria",
    "networkSetting",
    "dailyBudget"
})
public class CampaignEstimateRequest
    extends EstimateRequest
{

    protected Long campaignId;
    protected List<AdGroupEstimateRequest> adGroupEstimateRequests;
    protected List<Criterion> criteria;
    protected NetworkSetting networkSetting;
    protected Money dailyBudget;

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
     * Gets the value of the adGroupEstimateRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adGroupEstimateRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdGroupEstimateRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdGroupEstimateRequest }
     * 
     * 
     */
    public List<AdGroupEstimateRequest> getAdGroupEstimateRequests() {
        if (adGroupEstimateRequests == null) {
            adGroupEstimateRequests = new ArrayList<AdGroupEstimateRequest>();
        }
        return this.adGroupEstimateRequests;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Criterion }
     * 
     * 
     */
    public List<Criterion> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<Criterion>();
        }
        return this.criteria;
    }

    /**
     * Gets the value of the networkSetting property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSetting }
     *     
     */
    public NetworkSetting getNetworkSetting() {
        return networkSetting;
    }

    /**
     * Sets the value of the networkSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSetting }
     *     
     */
    public void setNetworkSetting(NetworkSetting value) {
        this.networkSetting = value;
    }

    /**
     * Gets the value of the dailyBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getDailyBudget() {
        return dailyBudget;
    }

    /**
     * Sets the value of the dailyBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setDailyBudget(Money value) {
        this.dailyBudget = value;
    }

}
