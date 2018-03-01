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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Setting for storing the mobile app to advertise and creative assets for Universal app campaigns.
 *             This setting is required for Campaigns with advertising channel subtype UNIVERSAL_APP_CAMPAIGN
 *             and can only be attached to such Campaigns.
 *           
 * 
 * <p>Java class for UniversalAppCampaignSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalAppCampaignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Setting">
 *       &lt;sequence>
 *         &lt;element name="appId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="appVendor" type="{https://adwords.google.com/api/adwords/cm/v201802}MobileApplicationVendor" minOccurs="0"/>
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="youtubeVideoMediaIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageMediaIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="universalAppBiddingStrategyGoalType" type="{https://adwords.google.com/api/adwords/cm/v201802}UniversalAppBiddingStrategyGoalType" minOccurs="0"/>
 *         &lt;element name="youtubeVideoMediaIdsOps" type="{https://adwords.google.com/api/adwords/cm/v201802}ListOperations" minOccurs="0"/>
 *         &lt;element name="imageMediaIdsOps" type="{https://adwords.google.com/api/adwords/cm/v201802}ListOperations" minOccurs="0"/>
 *         &lt;element name="adsPolicyDecisions" type="{https://adwords.google.com/api/adwords/cm/v201802}UniversalAppCampaignAdsPolicyDecisions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalAppCampaignSetting", propOrder = {
    "appId",
    "appVendor",
    "description1",
    "description2",
    "description3",
    "description4",
    "youtubeVideoMediaIds",
    "imageMediaIds",
    "universalAppBiddingStrategyGoalType",
    "youtubeVideoMediaIdsOps",
    "imageMediaIdsOps",
    "adsPolicyDecisions"
})
public class UniversalAppCampaignSetting
    extends Setting
{

    protected String appId;
    @XmlSchemaType(name = "string")
    protected MobileApplicationVendor appVendor;
    protected String description1;
    protected String description2;
    protected String description3;
    protected String description4;
    @XmlElement(type = Long.class)
    protected List<Long> youtubeVideoMediaIds;
    @XmlElement(type = Long.class)
    protected List<Long> imageMediaIds;
    @XmlSchemaType(name = "string")
    protected UniversalAppBiddingStrategyGoalType universalAppBiddingStrategyGoalType;
    protected ListOperations youtubeVideoMediaIdsOps;
    protected ListOperations imageMediaIdsOps;
    protected List<UniversalAppCampaignAdsPolicyDecisions> adsPolicyDecisions;

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

    /**
     * Gets the value of the description1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the description3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription3() {
        return description3;
    }

    /**
     * Sets the value of the description3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription3(String value) {
        this.description3 = value;
    }

    /**
     * Gets the value of the description4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription4() {
        return description4;
    }

    /**
     * Sets the value of the description4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription4(String value) {
        this.description4 = value;
    }

    /**
     * Gets the value of the youtubeVideoMediaIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the youtubeVideoMediaIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYoutubeVideoMediaIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getYoutubeVideoMediaIds() {
        if (youtubeVideoMediaIds == null) {
            youtubeVideoMediaIds = new ArrayList<Long>();
        }
        return this.youtubeVideoMediaIds;
    }

    /**
     * Gets the value of the imageMediaIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageMediaIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageMediaIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getImageMediaIds() {
        if (imageMediaIds == null) {
            imageMediaIds = new ArrayList<Long>();
        }
        return this.imageMediaIds;
    }

    /**
     * Gets the value of the universalAppBiddingStrategyGoalType property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalAppBiddingStrategyGoalType }
     *     
     */
    public UniversalAppBiddingStrategyGoalType getUniversalAppBiddingStrategyGoalType() {
        return universalAppBiddingStrategyGoalType;
    }

    /**
     * Sets the value of the universalAppBiddingStrategyGoalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalAppBiddingStrategyGoalType }
     *     
     */
    public void setUniversalAppBiddingStrategyGoalType(UniversalAppBiddingStrategyGoalType value) {
        this.universalAppBiddingStrategyGoalType = value;
    }

    /**
     * Gets the value of the youtubeVideoMediaIdsOps property.
     * 
     * @return
     *     possible object is
     *     {@link ListOperations }
     *     
     */
    public ListOperations getYoutubeVideoMediaIdsOps() {
        return youtubeVideoMediaIdsOps;
    }

    /**
     * Sets the value of the youtubeVideoMediaIdsOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOperations }
     *     
     */
    public void setYoutubeVideoMediaIdsOps(ListOperations value) {
        this.youtubeVideoMediaIdsOps = value;
    }

    /**
     * Gets the value of the imageMediaIdsOps property.
     * 
     * @return
     *     possible object is
     *     {@link ListOperations }
     *     
     */
    public ListOperations getImageMediaIdsOps() {
        return imageMediaIdsOps;
    }

    /**
     * Sets the value of the imageMediaIdsOps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOperations }
     *     
     */
    public void setImageMediaIdsOps(ListOperations value) {
        this.imageMediaIdsOps = value;
    }

    /**
     * Gets the value of the adsPolicyDecisions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adsPolicyDecisions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdsPolicyDecisions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalAppCampaignAdsPolicyDecisions }
     * 
     * 
     */
    public List<UniversalAppCampaignAdsPolicyDecisions> getAdsPolicyDecisions() {
        if (adsPolicyDecisions == null) {
            adsPolicyDecisions = new ArrayList<UniversalAppCampaignAdsPolicyDecisions>();
        }
        return this.adsPolicyDecisions;
    }

}
