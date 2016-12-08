// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201611;

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
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201611}LiveStreamEventStatus" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{https://www.google.com/apis/ads/publisher/v201611}DateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201611}DateTime" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201611}DateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201611}DateTime" minOccurs="0"/>
 *         &lt;element name="totalEstimatedConcurrentUsers" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contentUrls" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="adTags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="liveStreamEventCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authenticationService" type="{https://www.google.com/apis/ads/publisher/v201611}AuthenticationService" minOccurs="0"/>
 *         &lt;element name="authenticationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dvrWindowSeconds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="adBreakFillType" type="{https://www.google.com/apis/ads/publisher/v201611}AdBreakFillType" minOccurs="0"/>
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
    "endDateTime",
    "totalEstimatedConcurrentUsers",
    "contentUrls",
    "adTags",
    "liveStreamEventCode",
    "authenticationService",
    "authenticationKey",
    "dvrWindowSeconds",
    "adBreakFillType"
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
    protected DateTime endDateTime;
    protected Long totalEstimatedConcurrentUsers;
    protected List<String> contentUrls;
    protected List<String> adTags;
    protected String liveStreamEventCode;
    @XmlSchemaType(name = "string")
    protected AuthenticationService authenticationService;
    protected String authenticationKey;
    protected Integer dvrWindowSeconds;
    @XmlSchemaType(name = "string")
    protected AdBreakFillType adBreakFillType;

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
     * Gets the value of the authenticationService property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationService }
     *     
     */
    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    /**
     * Sets the value of the authenticationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationService }
     *     
     */
    public void setAuthenticationService(AuthenticationService value) {
        this.authenticationService = value;
    }

    /**
     * Gets the value of the authenticationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationKey() {
        return authenticationKey;
    }

    /**
     * Sets the value of the authenticationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationKey(String value) {
        this.authenticationKey = value;
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

}
