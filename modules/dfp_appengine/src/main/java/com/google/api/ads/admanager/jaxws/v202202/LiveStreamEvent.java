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


package com.google.api.ads.admanager.jaxws.v202202;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code LiveStreamEvent} encapsulates all the information necessary to enable DAI (Dynamic Ad
 *             Insertion) into a live video stream.
 *             
 *             <p>This includes information such as the start and expected end time of the live stream, the URL
 *             of the actual content for Ad Manager to pull and insert ads into, as well as the metadata
 *             necessary to generate ad requests during the live stream.
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
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202202}LiveStreamEventStatus" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{https://www.google.com/apis/ads/publisher/v202202}DateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v202202}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v202202}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTimeType" type="{https://www.google.com/apis/ads/publisher/v202202}StartDateTimeType" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v202202}DateTime" minOccurs="0"/>
 *         &lt;element name="unlimitedEndDateTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="totalEstimatedConcurrentUsers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contentUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adTags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assetKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="slateCreativeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dvrWindowSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enableDaiAuthenticationKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adBreakFillType" type="{https://www.google.com/apis/ads/publisher/v202202}AdBreakFillType" minOccurs="0"/>
 *         &lt;element name="underfillAdBreakFillType" type="{https://www.google.com/apis/ads/publisher/v202202}AdBreakFillType" minOccurs="0"/>
 *         &lt;element name="adHolidayDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enableMaxFillerDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="maxFillerDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enableDurationlessAdBreaks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="defaultAdBreakDuration" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="streamCreateDaiAuthenticationKeyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sourceContentConfigurationIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hlsSettings" type="{https://www.google.com/apis/ads/publisher/v202202}HlsSettings" minOccurs="0"/>
 *         &lt;element name="enableAllowlistedIps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dynamicAdInsertionType" type="{https://www.google.com/apis/ads/publisher/v202202}DynamicAdInsertionType" minOccurs="0"/>
 *         &lt;element name="enableRelativePlaylistDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="streamingFormat" type="{https://www.google.com/apis/ads/publisher/v202202}StreamingFormat" minOccurs="0"/>
 *         &lt;element name="prefetchEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prefetchSettings" type="{https://www.google.com/apis/ads/publisher/v202202}PrefetchSettings" minOccurs="0"/>
 *         &lt;element name="enableForceCloseAdBreaks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableShortSegmentDropping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customAssetKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daiEncodingProfileIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segmentUrlAuthenticationKeyIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adBreakMarkups" type="{https://www.google.com/apis/ads/publisher/v202202}AdBreakMarkupType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adBreakMarkupTypesEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adServingFormat" type="{https://www.google.com/apis/ads/publisher/v202202}AdServingFormat" minOccurs="0"/>
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
    "status",
    "creationDateTime",
    "lastModifiedDateTime",
    "startDateTime",
    "startDateTimeType",
    "endDateTime",
    "unlimitedEndDateTime",
    "totalEstimatedConcurrentUsers",
    "contentUrls",
    "adTags",
    "assetKey",
    "slateCreativeId",
    "dvrWindowSeconds",
    "enableDaiAuthenticationKeys",
    "adBreakFillType",
    "underfillAdBreakFillType",
    "adHolidayDuration",
    "enableMaxFillerDuration",
    "maxFillerDuration",
    "enableDurationlessAdBreaks",
    "defaultAdBreakDuration",
    "streamCreateDaiAuthenticationKeyIds",
    "sourceContentConfigurationIds",
    "hlsSettings",
    "enableAllowlistedIps",
    "dynamicAdInsertionType",
    "enableRelativePlaylistDelivery",
    "streamingFormat",
    "prefetchEnabled",
    "prefetchSettings",
    "enableForceCloseAdBreaks",
    "enableShortSegmentDropping",
    "customAssetKey",
    "daiEncodingProfileIds",
    "segmentUrlAuthenticationKeyIds",
    "adBreakMarkups",
    "adBreakMarkupTypesEnabled",
    "adServingFormat"
})
public class LiveStreamEvent {

    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected LiveStreamEventStatus status;
    protected DateTime creationDateTime;
    protected DateTime lastModifiedDateTime;
    protected DateTime startDateTime;
    @XmlSchemaType(name = "string")
    protected StartDateTimeType startDateTimeType;
    protected DateTime endDateTime;
    protected Boolean unlimitedEndDateTime;
    protected Long totalEstimatedConcurrentUsers;
    protected List<String> contentUrls;
    protected List<String> adTags;
    protected String assetKey;
    protected Long slateCreativeId;
    protected Integer dvrWindowSeconds;
    protected Boolean enableDaiAuthenticationKeys;
    @XmlSchemaType(name = "string")
    protected AdBreakFillType adBreakFillType;
    @XmlSchemaType(name = "string")
    protected AdBreakFillType underfillAdBreakFillType;
    protected Long adHolidayDuration;
    protected Boolean enableMaxFillerDuration;
    protected Long maxFillerDuration;
    protected Boolean enableDurationlessAdBreaks;
    protected Long defaultAdBreakDuration;
    @XmlElement(type = Long.class)
    protected List<Long> streamCreateDaiAuthenticationKeyIds;
    @XmlElement(type = Long.class)
    protected List<Long> sourceContentConfigurationIds;
    protected HlsSettings hlsSettings;
    protected Boolean enableAllowlistedIps;
    @XmlSchemaType(name = "string")
    protected DynamicAdInsertionType dynamicAdInsertionType;
    protected Boolean enableRelativePlaylistDelivery;
    @XmlSchemaType(name = "string")
    protected StreamingFormat streamingFormat;
    protected Boolean prefetchEnabled;
    protected PrefetchSettings prefetchSettings;
    protected Boolean enableForceCloseAdBreaks;
    protected Boolean enableShortSegmentDropping;
    protected String customAssetKey;
    @XmlElement(type = Long.class)
    protected List<Long> daiEncodingProfileIds;
    @XmlElement(type = Long.class)
    protected List<Long> segmentUrlAuthenticationKeyIds;
    @XmlSchemaType(name = "string")
    protected List<AdBreakMarkupType> adBreakMarkups;
    protected Boolean adBreakMarkupTypesEnabled;
    @XmlSchemaType(name = "string")
    protected AdServingFormat adServingFormat;

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
     * Gets the value of the assetKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetKey() {
        return assetKey;
    }

    /**
     * Sets the value of the assetKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetKey(String value) {
        this.assetKey = value;
    }

    /**
     * Gets the value of the slateCreativeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlateCreativeId() {
        return slateCreativeId;
    }

    /**
     * Sets the value of the slateCreativeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlateCreativeId(Long value) {
        this.slateCreativeId = value;
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
     * Gets the value of the enableDaiAuthenticationKeys property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableDaiAuthenticationKeys() {
        return enableDaiAuthenticationKeys;
    }

    /**
     * Sets the value of the enableDaiAuthenticationKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableDaiAuthenticationKeys(Boolean value) {
        this.enableDaiAuthenticationKeys = value;
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
     * Gets the value of the underfillAdBreakFillType property.
     * 
     * @return
     *     possible object is
     *     {@link AdBreakFillType }
     *     
     */
    public AdBreakFillType getUnderfillAdBreakFillType() {
        return underfillAdBreakFillType;
    }

    /**
     * Sets the value of the underfillAdBreakFillType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdBreakFillType }
     *     
     */
    public void setUnderfillAdBreakFillType(AdBreakFillType value) {
        this.underfillAdBreakFillType = value;
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
     * Gets the value of the enableMaxFillerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableMaxFillerDuration() {
        return enableMaxFillerDuration;
    }

    /**
     * Sets the value of the enableMaxFillerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableMaxFillerDuration(Boolean value) {
        this.enableMaxFillerDuration = value;
    }

    /**
     * Gets the value of the maxFillerDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxFillerDuration() {
        return maxFillerDuration;
    }

    /**
     * Sets the value of the maxFillerDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxFillerDuration(Long value) {
        this.maxFillerDuration = value;
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
     * Gets the value of the streamCreateDaiAuthenticationKeyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streamCreateDaiAuthenticationKeyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreamCreateDaiAuthenticationKeyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getStreamCreateDaiAuthenticationKeyIds() {
        if (streamCreateDaiAuthenticationKeyIds == null) {
            streamCreateDaiAuthenticationKeyIds = new ArrayList<Long>();
        }
        return this.streamCreateDaiAuthenticationKeyIds;
    }

    /**
     * Gets the value of the sourceContentConfigurationIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceContentConfigurationIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceContentConfigurationIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSourceContentConfigurationIds() {
        if (sourceContentConfigurationIds == null) {
            sourceContentConfigurationIds = new ArrayList<Long>();
        }
        return this.sourceContentConfigurationIds;
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

    /**
     * Gets the value of the enableAllowlistedIps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableAllowlistedIps() {
        return enableAllowlistedIps;
    }

    /**
     * Sets the value of the enableAllowlistedIps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableAllowlistedIps(Boolean value) {
        this.enableAllowlistedIps = value;
    }

    /**
     * Gets the value of the dynamicAdInsertionType property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicAdInsertionType }
     *     
     */
    public DynamicAdInsertionType getDynamicAdInsertionType() {
        return dynamicAdInsertionType;
    }

    /**
     * Sets the value of the dynamicAdInsertionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicAdInsertionType }
     *     
     */
    public void setDynamicAdInsertionType(DynamicAdInsertionType value) {
        this.dynamicAdInsertionType = value;
    }

    /**
     * Gets the value of the enableRelativePlaylistDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableRelativePlaylistDelivery() {
        return enableRelativePlaylistDelivery;
    }

    /**
     * Sets the value of the enableRelativePlaylistDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableRelativePlaylistDelivery(Boolean value) {
        this.enableRelativePlaylistDelivery = value;
    }

    /**
     * Gets the value of the streamingFormat property.
     * 
     * @return
     *     possible object is
     *     {@link StreamingFormat }
     *     
     */
    public StreamingFormat getStreamingFormat() {
        return streamingFormat;
    }

    /**
     * Sets the value of the streamingFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamingFormat }
     *     
     */
    public void setStreamingFormat(StreamingFormat value) {
        this.streamingFormat = value;
    }

    /**
     * Gets the value of the prefetchEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrefetchEnabled() {
        return prefetchEnabled;
    }

    /**
     * Sets the value of the prefetchEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrefetchEnabled(Boolean value) {
        this.prefetchEnabled = value;
    }

    /**
     * Gets the value of the prefetchSettings property.
     * 
     * @return
     *     possible object is
     *     {@link PrefetchSettings }
     *     
     */
    public PrefetchSettings getPrefetchSettings() {
        return prefetchSettings;
    }

    /**
     * Sets the value of the prefetchSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefetchSettings }
     *     
     */
    public void setPrefetchSettings(PrefetchSettings value) {
        this.prefetchSettings = value;
    }

    /**
     * Gets the value of the enableForceCloseAdBreaks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableForceCloseAdBreaks() {
        return enableForceCloseAdBreaks;
    }

    /**
     * Sets the value of the enableForceCloseAdBreaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableForceCloseAdBreaks(Boolean value) {
        this.enableForceCloseAdBreaks = value;
    }

    /**
     * Gets the value of the enableShortSegmentDropping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableShortSegmentDropping() {
        return enableShortSegmentDropping;
    }

    /**
     * Sets the value of the enableShortSegmentDropping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableShortSegmentDropping(Boolean value) {
        this.enableShortSegmentDropping = value;
    }

    /**
     * Gets the value of the customAssetKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomAssetKey() {
        return customAssetKey;
    }

    /**
     * Sets the value of the customAssetKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomAssetKey(String value) {
        this.customAssetKey = value;
    }

    /**
     * Gets the value of the daiEncodingProfileIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daiEncodingProfileIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaiEncodingProfileIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getDaiEncodingProfileIds() {
        if (daiEncodingProfileIds == null) {
            daiEncodingProfileIds = new ArrayList<Long>();
        }
        return this.daiEncodingProfileIds;
    }

    /**
     * Gets the value of the segmentUrlAuthenticationKeyIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentUrlAuthenticationKeyIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentUrlAuthenticationKeyIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getSegmentUrlAuthenticationKeyIds() {
        if (segmentUrlAuthenticationKeyIds == null) {
            segmentUrlAuthenticationKeyIds = new ArrayList<Long>();
        }
        return this.segmentUrlAuthenticationKeyIds;
    }

    /**
     * Gets the value of the adBreakMarkups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adBreakMarkups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdBreakMarkups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdBreakMarkupType }
     * 
     * 
     */
    public List<AdBreakMarkupType> getAdBreakMarkups() {
        if (adBreakMarkups == null) {
            adBreakMarkups = new ArrayList<AdBreakMarkupType>();
        }
        return this.adBreakMarkups;
    }

    /**
     * Gets the value of the adBreakMarkupTypesEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdBreakMarkupTypesEnabled() {
        return adBreakMarkupTypesEnabled;
    }

    /**
     * Sets the value of the adBreakMarkupTypesEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdBreakMarkupTypesEnabled(Boolean value) {
        this.adBreakMarkupTypesEnabled = value;
    }

    /**
     * Gets the value of the adServingFormat property.
     * 
     * @return
     *     possible object is
     *     {@link AdServingFormat }
     *     
     */
    public AdServingFormat getAdServingFormat() {
        return adServingFormat;
    }

    /**
     * Sets the value of the adServingFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdServingFormat }
     *     
     */
    public void setAdServingFormat(AdServingFormat value) {
        this.adServingFormat = value;
    }

}
