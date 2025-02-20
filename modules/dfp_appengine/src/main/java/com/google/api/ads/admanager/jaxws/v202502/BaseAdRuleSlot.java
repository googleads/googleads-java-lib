// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Simple object representing an ad slot within an {@link AdRule}. Ad rule slots contain information
 *             about the types/number of ads to display, as well as additional information on how the ad server
 *             will generate playlists.
 *           
 * 
 * <p>Java class for BaseAdRuleSlot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAdRuleSlot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="slotBehavior" type="{https://www.google.com/apis/ads/publisher/v202502}AdRuleSlotBehavior" minOccurs="0"/&gt;
 *         &lt;element name="maxVideoAdDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="videoMidrollFrequencyType" type="{https://www.google.com/apis/ads/publisher/v202502}MidrollFrequencyType" minOccurs="0"/&gt;
 *         &lt;element name="videoMidrollFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bumper" type="{https://www.google.com/apis/ads/publisher/v202502}AdRuleSlotBumper" minOccurs="0"/&gt;
 *         &lt;element name="maxBumperDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maxPodDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maxAdsInPod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="breakTemplateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAdRuleSlot", propOrder = {
    "slotBehavior",
    "maxVideoAdDuration",
    "videoMidrollFrequencyType",
    "videoMidrollFrequency",
    "bumper",
    "maxBumperDuration",
    "maxPodDuration",
    "maxAdsInPod",
    "breakTemplateId"
})
@XmlSeeAlso({
    NoPoddingAdRuleSlot.class,
    OptimizedPoddingAdRuleSlot.class,
    StandardPoddingAdRuleSlot.class,
    UnknownAdRuleSlot.class
})
public abstract class BaseAdRuleSlot {

    @XmlSchemaType(name = "string")
    protected AdRuleSlotBehavior slotBehavior;
    protected Long maxVideoAdDuration;
    @XmlSchemaType(name = "string")
    protected MidrollFrequencyType videoMidrollFrequencyType;
    protected String videoMidrollFrequency;
    @XmlSchemaType(name = "string")
    protected AdRuleSlotBumper bumper;
    protected Long maxBumperDuration;
    protected Long maxPodDuration;
    protected Integer maxAdsInPod;
    protected Long breakTemplateId;

    /**
     * Gets the value of the slotBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link AdRuleSlotBehavior }
     *     
     */
    public AdRuleSlotBehavior getSlotBehavior() {
        return slotBehavior;
    }

    /**
     * Sets the value of the slotBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRuleSlotBehavior }
     *     
     */
    public void setSlotBehavior(AdRuleSlotBehavior value) {
        this.slotBehavior = value;
    }

    /**
     * Gets the value of the maxVideoAdDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxVideoAdDuration() {
        return maxVideoAdDuration;
    }

    /**
     * Sets the value of the maxVideoAdDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxVideoAdDuration(Long value) {
        this.maxVideoAdDuration = value;
    }

    /**
     * Gets the value of the videoMidrollFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link MidrollFrequencyType }
     *     
     */
    public MidrollFrequencyType getVideoMidrollFrequencyType() {
        return videoMidrollFrequencyType;
    }

    /**
     * Sets the value of the videoMidrollFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MidrollFrequencyType }
     *     
     */
    public void setVideoMidrollFrequencyType(MidrollFrequencyType value) {
        this.videoMidrollFrequencyType = value;
    }

    /**
     * Gets the value of the videoMidrollFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoMidrollFrequency() {
        return videoMidrollFrequency;
    }

    /**
     * Sets the value of the videoMidrollFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoMidrollFrequency(String value) {
        this.videoMidrollFrequency = value;
    }

    /**
     * Gets the value of the bumper property.
     * 
     * @return
     *     possible object is
     *     {@link AdRuleSlotBumper }
     *     
     */
    public AdRuleSlotBumper getBumper() {
        return bumper;
    }

    /**
     * Sets the value of the bumper property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRuleSlotBumper }
     *     
     */
    public void setBumper(AdRuleSlotBumper value) {
        this.bumper = value;
    }

    /**
     * Gets the value of the maxBumperDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxBumperDuration() {
        return maxBumperDuration;
    }

    /**
     * Sets the value of the maxBumperDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxBumperDuration(Long value) {
        this.maxBumperDuration = value;
    }

    /**
     * Gets the value of the maxPodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPodDuration() {
        return maxPodDuration;
    }

    /**
     * Sets the value of the maxPodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPodDuration(Long value) {
        this.maxPodDuration = value;
    }

    /**
     * Gets the value of the maxAdsInPod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAdsInPod() {
        return maxAdsInPod;
    }

    /**
     * Sets the value of the maxAdsInPod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAdsInPod(Integer value) {
        this.maxAdsInPod = value;
    }

    /**
     * Gets the value of the breakTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBreakTemplateId() {
        return breakTemplateId;
    }

    /**
     * Sets the value of the breakTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBreakTemplateId(Long value) {
        this.breakTemplateId = value;
    }

}
