// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Stores campaign-level info related to Universal App Campaigns.
 *           
 * 
 * <p>Java class for UniversalAppCampaignInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalAppCampaignInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biddingStrategyGoalType" type="{https://adwords.google.com/api/adwords/cm/v201809}UniversalAppBiddingStrategyGoalType" minOccurs="0"/>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appVendor" type="{https://adwords.google.com/api/adwords/cm/v201809}MobileApplicationVendor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalAppCampaignInfo", propOrder = {
    "biddingStrategyGoalType",
    "appId",
    "appVendor"
})
public class UniversalAppCampaignInfo {

    @XmlSchemaType(name = "string")
    protected UniversalAppBiddingStrategyGoalType biddingStrategyGoalType;
    protected String appId;
    @XmlSchemaType(name = "string")
    protected MobileApplicationVendor appVendor;

    /**
     * Gets the value of the biddingStrategyGoalType property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalAppBiddingStrategyGoalType }
     *     
     */
    public UniversalAppBiddingStrategyGoalType getBiddingStrategyGoalType() {
        return biddingStrategyGoalType;
    }

    /**
     * Sets the value of the biddingStrategyGoalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalAppBiddingStrategyGoalType }
     *     
     */
    public void setBiddingStrategyGoalType(UniversalAppBiddingStrategyGoalType value) {
        this.biddingStrategyGoalType = value;
    }

    /**
     * Gets the value of the appId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Sets the value of the appId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppId(String value) {
        this.appId = value;
    }

    /**
     * Gets the value of the appVendor property.
     * 
     * @return
     *     possible object is
     *     {@link MobileApplicationVendor }
     *     
     */
    public MobileApplicationVendor getAppVendor() {
        return appVendor;
    }

    /**
     * Sets the value of the appVendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileApplicationVendor }
     *     
     */
    public void setAppVendor(MobileApplicationVendor value) {
        this.appVendor = value;
    }

}
