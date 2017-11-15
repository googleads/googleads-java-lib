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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code LiveStreamEvent} encapsulates all the information necessary
 *             to enable DAI (Dynamic Ad Insertion) into a live video stream.
 *             
 *             <p>This includes information such as the start and expected end time of
 *             the event, the URL of the actual content for DFP to pull and insert ads into,
 *             as well as the metadata necessary to generate ad requests during the event.
 *           
 * 
 * <p>Java class for LiveStreamEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveStreamEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201711}LiveStreamEventStatus" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTimeType" type="{https://www.google.com/apis/ads/publisher/v201711}StartDateTimeType" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201711}DateTime" minOccurs="0"/>
 *         &lt;element name="totalEstimatedConcurrentUsers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contentUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adTags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="liveStreamEventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dvrWindowSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adBreakFillType" type="{https://www.google.com/apis/ads/publisher/v201711}AdBreakFillType" minOccurs="0"/>
 *         &lt;element name="adHolidayDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enableDurationlessAdBreaks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultAdBreakDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sourceContentConfigurations" type="{https://www.google.com/apis/ads/publisher/v201711}CdnConfiguration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hlsSettings" type="{https://www.google.com/apis/ads/publisher/v201711}HlsSettings" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveStreamEvent", propOrder = {
    "id",
    "name",
    "description",
    "status",
    "creationDateTime",
    "lastModifiedDateTime",
    "startDateTime",
    "startDateTimeType",
    "endDateTime",
    "totalEstimatedConcurrentUsers",
    "contentUrls",
    "adTags",
    "liveStreamEventCode",
    "dvrWindowSeconds",
    "adBreakFillType",
    "adHolidayDuration",
    "enableDurationlessAdBreaks",
    "defaultAdBreakDuration",
    "sourceContentConfigurations",
    "hlsSettings"
})
public class LiveStreamEvent {

    protected Long id;
    protected String name;
    protected String description;
    @XmlSchemaType(name = "string")
    protected LiveStreamEventStatus status;
    protected DateTime creationDateTime;
    protected DateTime lastModifiedDateTime;
    protected DateTime startDateTime;
    @XmlSchemaType(name = "string")
    protected StartDateTimeType startDateTimeType;
    protected DateTime endDateTime;
    protected Long totalEstimatedConcurrentUsers;
    protected List<String> contentUrls;
    protected List<String> adTags;
    protected String liveStreamEventCode;
    protected Integer dvrWindowSeconds;
    @XmlSchemaType(name = "string")
    protected AdBreakFillType adBreakFillType;
    protected Long adHolidayDuration;
    protected Boolean enableDurationlessAdBreaks;
    protected Long defaultAdBreakDuration;
    protected List<CdnConfiguration> sourceContentConfigurations;
    protected HlsSettings hlsSettings;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link LiveStreamEventStatus }
     *     
     */
    public LiveStreamEventStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveStreamEventStatus }
     *     
     */
    public void setStatus(LiveStreamEventStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreationDateTime(DateTime value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
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
     * Gets the value of the totalEstimatedConcurrentUsers property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalEstimatedConcurrentUsers() {
        return totalEstimatedConcurrentUsers;
    }

    /**
     * Sets the value of the totalEstimatedConcurrentUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalEstimatedConcurrentUsers(Long value) {
        this.totalEstimatedConcurrentUsers = value;
    }

    /**
     * Gets the value of the contentUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContentUrls() {
        if (contentUrls == null) {
            contentUrls = new ArrayList<String>();
        }
        return this.contentUrls;
    }

    /**
     * Gets the value of the adTags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adTags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdTags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdTags() {
        if (adTags == null) {
            adTags = new ArrayList<String>();
        }
        return this.adTags;
    }

    /**
     * Gets the value of the liveStreamEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveStreamEventCode() {
        return liveStreamEventCode;
    }

    /**
     * Sets the value of the liveStreamEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveStreamEventCode(String value) {
        this.liveStreamEventCode = value;
    }

    /**
     * Gets the value of the dvrWindowSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDvrWindowSeconds() {
        return dvrWindowSeconds;
    }

    /**
     * Sets the value of the dvrWindowSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDvrWindowSeconds(Integer value) {
        this.dvrWindowSeconds = value;
    }

    /**
     * Gets the value of the adBreakFillType property.
     * 
     * @return
     *     possible object is
     *     {@link AdBreakFillType }
     *     
     */
    public AdBreakFillType getAdBreakFillType() {
        return adBreakFillType;
    }

    /**
     * Sets the value of the adBreakFillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdBreakFillType }
     *     
     */
    public void setAdBreakFillType(AdBreakFillType value) {
        this.adBreakFillType = value;
    }

    /**
     * Gets the value of the adHolidayDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdHolidayDuration() {
        return adHolidayDuration;
    }

    /**
     * Sets the value of the adHolidayDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdHolidayDuration(Long value) {
        this.adHolidayDuration = value;
    }

    /**
     * Gets the value of the enableDurationlessAdBreaks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDurationlessAdBreaks() {
        return enableDurationlessAdBreaks;
    }

    /**
     * Sets the value of the enableDurationlessAdBreaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDurationlessAdBreaks(Boolean value) {
        this.enableDurationlessAdBreaks = value;
    }

    /**
     * Gets the value of the defaultAdBreakDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDefaultAdBreakDuration() {
        return defaultAdBreakDuration;
    }

    /**
     * Sets the value of the defaultAdBreakDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultAdBreakDuration(Long value) {
        this.defaultAdBreakDuration = value;
    }

    /**
     * Gets the value of the sourceContentConfigurations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceContentConfigurations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceContentConfigurations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CdnConfiguration }
     * 
     * 
     */
    public List<CdnConfiguration> getSourceContentConfigurations() {
        if (sourceContentConfigurations == null) {
            sourceContentConfigurations = new ArrayList<CdnConfiguration>();
        }
        return this.sourceContentConfigurations;
    }

    /**
     * Gets the value of the hlsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link HlsSettings }
     *     
     */
    public HlsSettings getHlsSettings() {
        return hlsSettings;
    }

    /**
     * Sets the value of the hlsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link HlsSettings }
     *     
     */
    public void setHlsSettings(HlsSettings value) {
        this.hlsSettings = value;
    }

}
