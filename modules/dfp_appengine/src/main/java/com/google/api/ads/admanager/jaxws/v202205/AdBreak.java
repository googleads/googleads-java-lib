// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202205;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdBreak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdBreak">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootAdResponses" type="{https://www.google.com/apis/ads/publisher/v202205}AdResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adDecisionCreatives" type="{https://www.google.com/apis/ads/publisher/v202205}AdDecisionCreative" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="podNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="linearAbsolutePodNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adBreakDurationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="filledDurationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="servedDurationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v202205}DateTime" minOccurs="0"/>
 *         &lt;element name="startTimeOffsetMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="samError" type="{https://www.google.com/apis/ads/publisher/v202205}SamError" minOccurs="0"/>
 *         &lt;element name="midrollIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="decisionedAds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trackingEvents" type="{https://www.google.com/apis/ads/publisher/v202205}TrackingEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdBreak", propOrder = {
    "rootAdResponses",
    "adDecisionCreatives",
    "podNum",
    "linearAbsolutePodNum",
    "adBreakDurationMillis",
    "filledDurationMillis",
    "servedDurationMillis",
    "startDateTime",
    "startTimeOffsetMillis",
    "samError",
    "midrollIndex",
    "decisionedAds",
    "trackingEvents"
})
public class AdBreak {

    protected List<AdResponse> rootAdResponses;
    protected List<AdDecisionCreative> adDecisionCreatives;
    protected Integer podNum;
    protected Integer linearAbsolutePodNum;
    protected Long adBreakDurationMillis;
    protected Long filledDurationMillis;
    protected Long servedDurationMillis;
    protected DateTime startDateTime;
    protected Long startTimeOffsetMillis;
    protected SamError samError;
    protected Integer midrollIndex;
    protected Boolean decisionedAds;
    protected List<TrackingEvent> trackingEvents;

    /**
     * Gets the value of the rootAdResponses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootAdResponses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootAdResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdResponse }
     * 
     * 
     */
    public List<AdResponse> getRootAdResponses() {
        if (rootAdResponses == null) {
            rootAdResponses = new ArrayList<AdResponse>();
        }
        return this.rootAdResponses;
    }

    /**
     * Gets the value of the adDecisionCreatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adDecisionCreatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdDecisionCreatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdDecisionCreative }
     * 
     * 
     */
    public List<AdDecisionCreative> getAdDecisionCreatives() {
        if (adDecisionCreatives == null) {
            adDecisionCreatives = new ArrayList<AdDecisionCreative>();
        }
        return this.adDecisionCreatives;
    }

    /**
     * Gets the value of the podNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPodNum() {
        return podNum;
    }

    /**
     * Sets the value of the podNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPodNum(Integer value) {
        this.podNum = value;
    }

    /**
     * Gets the value of the linearAbsolutePodNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLinearAbsolutePodNum() {
        return linearAbsolutePodNum;
    }

    /**
     * Sets the value of the linearAbsolutePodNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLinearAbsolutePodNum(Integer value) {
        this.linearAbsolutePodNum = value;
    }

    /**
     * Gets the value of the adBreakDurationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdBreakDurationMillis() {
        return adBreakDurationMillis;
    }

    /**
     * Sets the value of the adBreakDurationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdBreakDurationMillis(Long value) {
        this.adBreakDurationMillis = value;
    }

    /**
     * Gets the value of the filledDurationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFilledDurationMillis() {
        return filledDurationMillis;
    }

    /**
     * Sets the value of the filledDurationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFilledDurationMillis(Long value) {
        this.filledDurationMillis = value;
    }

    /**
     * Gets the value of the servedDurationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServedDurationMillis() {
        return servedDurationMillis;
    }

    /**
     * Sets the value of the servedDurationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServedDurationMillis(Long value) {
        this.servedDurationMillis = value;
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
     * Gets the value of the startTimeOffsetMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartTimeOffsetMillis() {
        return startTimeOffsetMillis;
    }

    /**
     * Sets the value of the startTimeOffsetMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartTimeOffsetMillis(Long value) {
        this.startTimeOffsetMillis = value;
    }

    /**
     * Gets the value of the samError property.
     * 
     * @return
     *     possible object is
     *     {@link SamError }
     *     
     */
    public SamError getSamError() {
        return samError;
    }

    /**
     * Sets the value of the samError property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamError }
     *     
     */
    public void setSamError(SamError value) {
        this.samError = value;
    }

    /**
     * Gets the value of the midrollIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMidrollIndex() {
        return midrollIndex;
    }

    /**
     * Sets the value of the midrollIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMidrollIndex(Integer value) {
        this.midrollIndex = value;
    }

    /**
     * Gets the value of the decisionedAds property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecisionedAds() {
        return decisionedAds;
    }

    /**
     * Sets the value of the decisionedAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecisionedAds(Boolean value) {
        this.decisionedAds = value;
    }

    /**
     * Gets the value of the trackingEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingEvent }
     * 
     * 
     */
    public List<TrackingEvent> getTrackingEvents() {
        if (trackingEvents == null) {
            trackingEvents = new ArrayList<TrackingEvent>();
        }
        return this.trackingEvents;
    }

}
