// Copyright 2017 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201711;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An {@link AdRule} contains data that the ad server will use to generate a playlist of video ads.
 *           
 * 
 * <p>Java class for AdRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adRuleId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v201711}Targeting" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTimeType" type="{https://www.google.com/apis/ads/publisher/v201711}StartDateTimeType" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="unlimitedEndDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201711}AdRuleStatus" minOccurs="0"/>
 *         &lt;element name="frequencyCapBehavior" type="{https://www.google.com/apis/ads/publisher/v201711}FrequencyCapBehavior" minOccurs="0"/>
 *         &lt;element name="maxImpressionsPerLineItemPerStream" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maxImpressionsPerLineItemPerPod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="preroll" type="{https://www.google.com/apis/ads/publisher/v201711}BaseAdRuleSlot" minOccurs="0"/>
 *         &lt;element name="midroll" type="{https://www.google.com/apis/ads/publisher/v201711}BaseAdRuleSlot" minOccurs="0"/>
 *         &lt;element name="postroll" type="{https://www.google.com/apis/ads/publisher/v201711}BaseAdRuleSlot" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRule", propOrder = {
    "adRuleId",
    "name",
    "priority",
    "targeting",
    "startDateTime",
    "startDateTimeType",
    "endDateTime",
    "unlimitedEndDateTime",
    "status",
    "frequencyCapBehavior",
    "maxImpressionsPerLineItemPerStream",
    "maxImpressionsPerLineItemPerPod",
    "preroll",
    "midroll",
    "postroll"
})
public class AdRule {

    protected Long adRuleId;
    protected String name;
    protected Integer priority;
    protected Targeting targeting;
    protected DateTime startDateTime;
    @XmlSchemaType(name = "string")
    protected StartDateTimeType startDateTimeType;
    protected DateTime endDateTime;
    protected Boolean unlimitedEndDateTime;
    @XmlSchemaType(name = "string")
    protected AdRuleStatus status;
    @XmlSchemaType(name = "string")
    protected FrequencyCapBehavior frequencyCapBehavior;
    protected Integer maxImpressionsPerLineItemPerStream;
    protected Integer maxImpressionsPerLineItemPerPod;
    protected BaseAdRuleSlot preroll;
    protected BaseAdRuleSlot midroll;
    protected BaseAdRuleSlot postroll;

    /**
     * Gets the value of the adRuleId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdRuleId() {
        return adRuleId;
    }

    /**
     * Sets the value of the adRuleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdRuleId(Long value) {
        this.adRuleId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPriority(Integer value) {
        this.priority = value;
    }

    /**
     * Gets the value of the targeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getTargeting() {
        return targeting;
    }

    /**
     * Sets the value of the targeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setTargeting(Targeting value) {
        this.targeting = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartDateTime(DateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the startDateTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link StartDateTimeType }
     *     
     */
    public StartDateTimeType getStartDateTimeType() {
        return startDateTimeType;
    }

    /**
     * Sets the value of the startDateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartDateTimeType }
     *     
     */
    public void setStartDateTimeType(StartDateTimeType value) {
        this.startDateTimeType = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndDateTime(DateTime value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the unlimitedEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlimitedEndDateTime() {
        return unlimitedEndDateTime;
    }

    /**
     * Sets the value of the unlimitedEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlimitedEndDateTime(Boolean value) {
        this.unlimitedEndDateTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AdRuleStatus }
     *     
     */
    public AdRuleStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRuleStatus }
     *     
     */
    public void setStatus(AdRuleStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the frequencyCapBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyCapBehavior }
     *     
     */
    public FrequencyCapBehavior getFrequencyCapBehavior() {
        return frequencyCapBehavior;
    }

    /**
     * Sets the value of the frequencyCapBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyCapBehavior }
     *     
     */
    public void setFrequencyCapBehavior(FrequencyCapBehavior value) {
        this.frequencyCapBehavior = value;
    }

    /**
     * Gets the value of the maxImpressionsPerLineItemPerStream property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxImpressionsPerLineItemPerStream() {
        return maxImpressionsPerLineItemPerStream;
    }

    /**
     * Sets the value of the maxImpressionsPerLineItemPerStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxImpressionsPerLineItemPerStream(Integer value) {
        this.maxImpressionsPerLineItemPerStream = value;
    }

    /**
     * Gets the value of the maxImpressionsPerLineItemPerPod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxImpressionsPerLineItemPerPod() {
        return maxImpressionsPerLineItemPerPod;
    }

    /**
     * Sets the value of the maxImpressionsPerLineItemPerPod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxImpressionsPerLineItemPerPod(Integer value) {
        this.maxImpressionsPerLineItemPerPod = value;
    }

    /**
     * Gets the value of the preroll property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAdRuleSlot }
     *     
     */
    public BaseAdRuleSlot getPreroll() {
        return preroll;
    }

    /**
     * Sets the value of the preroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAdRuleSlot }
     *     
     */
    public void setPreroll(BaseAdRuleSlot value) {
        this.preroll = value;
    }

    /**
     * Gets the value of the midroll property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAdRuleSlot }
     *     
     */
    public BaseAdRuleSlot getMidroll() {
        return midroll;
    }

    /**
     * Sets the value of the midroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAdRuleSlot }
     *     
     */
    public void setMidroll(BaseAdRuleSlot value) {
        this.midroll = value;
    }

    /**
     * Gets the value of the postroll property.
     * 
     * @return
     *     possible object is
     *     {@link BaseAdRuleSlot }
     *     
     */
    public BaseAdRuleSlot getPostroll() {
        return postroll;
    }

    /**
     * Sets the value of the postroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAdRuleSlot }
     *     
     */
    public void setPostroll(BaseAdRuleSlot value) {
        this.postroll = value;
    }

}
