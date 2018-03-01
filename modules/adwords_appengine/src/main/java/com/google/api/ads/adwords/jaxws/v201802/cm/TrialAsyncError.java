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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error that has occurred while asynchronously processing the creation or promotion of a trial.
 *           
 * 
 * <p>Java class for TrialAsyncError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrialAsyncError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trialId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="asyncError" type="{https://adwords.google.com/api/adwords/cm/v201802}ApiError" minOccurs="0"/>
 *         &lt;element name="trialCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="trialAdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="baseAdGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrialAsyncError", propOrder = {
    "trialId",
    "asyncError",
    "trialCampaignId",
    "trialAdGroupId",
    "baseCampaignId",
    "baseAdGroupId"
})
public class TrialAsyncError {

    protected Long trialId;
    protected ApiError asyncError;
    protected Long trialCampaignId;
    protected Long trialAdGroupId;
    protected Long baseCampaignId;
    protected Long baseAdGroupId;

    /**
     * Gets the value of the trialId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrialId() {
        return trialId;
    }

    /**
     * Sets the value of the trialId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrialId(Long value) {
        this.trialId = value;
    }

    /**
     * Gets the value of the asyncError property.
     * 
     * @return
     *     possible object is
     *     {@link ApiError }
     *     
     */
    public ApiError getAsyncError() {
        return asyncError;
    }

    /**
     * Sets the value of the asyncError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiError }
     *     
     */
    public void setAsyncError(ApiError value) {
        this.asyncError = value;
    }

    /**
     * Gets the value of the trialCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrialCampaignId() {
        return trialCampaignId;
    }

    /**
     * Sets the value of the trialCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrialCampaignId(Long value) {
        this.trialCampaignId = value;
    }

    /**
     * Gets the value of the trialAdGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTrialAdGroupId() {
        return trialAdGroupId;
    }

    /**
     * Sets the value of the trialAdGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTrialAdGroupId(Long value) {
        this.trialAdGroupId = value;
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
     * Gets the value of the baseAdGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBaseAdGroupId() {
        return baseAdGroupId;
    }

    /**
     * Sets the value of the baseAdGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBaseAdGroupId(Long value) {
        this.baseAdGroupId = value;
    }

}
