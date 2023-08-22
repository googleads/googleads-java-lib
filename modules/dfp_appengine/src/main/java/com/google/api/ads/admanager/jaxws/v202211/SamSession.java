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


package com.google.api.ads.admanager.jaxws.v202211;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isVodSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="streamCreateRequest" type="{https://www.google.com/apis/ads/publisher/v202211}StreamCreateRequest" minOccurs="0"/&gt;
 *         &lt;element name="adBreaks" type="{https://www.google.com/apis/ads/publisher/v202211}AdBreak" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v202211}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="sessionDurationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contentDurationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamSession", propOrder = {
    "sessionId",
    "isVodSession",
    "streamCreateRequest",
    "adBreaks",
    "startDateTime",
    "sessionDurationMillis",
    "contentDurationMillis"
})
public class SamSession {

    protected String sessionId;
    protected Boolean isVodSession;
    protected StreamCreateRequest streamCreateRequest;
    protected List<AdBreak> adBreaks;
    protected DateTime startDateTime;
    protected Long sessionDurationMillis;
    protected Long contentDurationMillis;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the isVodSession property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVodSession() {
        return isVodSession;
    }

    /**
     * Sets the value of the isVodSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVodSession(Boolean value) {
        this.isVodSession = value;
    }

    /**
     * Gets the value of the streamCreateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link StreamCreateRequest }
     *     
     */
    public StreamCreateRequest getStreamCreateRequest() {
        return streamCreateRequest;
    }

    /**
     * Sets the value of the streamCreateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamCreateRequest }
     *     
     */
    public void setStreamCreateRequest(StreamCreateRequest value) {
        this.streamCreateRequest = value;
    }

    /**
     * Gets the value of the adBreaks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adBreaks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdBreaks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdBreak }
     * 
     * 
     */
    public List<AdBreak> getAdBreaks() {
        if (adBreaks == null) {
            adBreaks = new ArrayList<AdBreak>();
        }
        return this.adBreaks;
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
     * Gets the value of the sessionDurationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionDurationMillis() {
        return sessionDurationMillis;
    }

    /**
     * Sets the value of the sessionDurationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionDurationMillis(Long value) {
        this.sessionDurationMillis = value;
    }

    /**
     * Gets the value of the contentDurationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContentDurationMillis() {
        return contentDurationMillis;
    }

    /**
     * Sets the value of the contentDurationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContentDurationMillis(Long value) {
        this.contentDurationMillis = value;
    }

}
