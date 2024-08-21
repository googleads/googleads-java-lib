// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearStreamCreateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearStreamCreateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202408}StreamCreateRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="liveStreamEventAssetKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="liveStreamEventId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="eventStartDateTime" type="{https://www.google.com/apis/ads/publisher/v202408}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="eventEndDateTime" type="{https://www.google.com/apis/ads/publisher/v202408}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="prefetchEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="podTrimmingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearStreamCreateRequest", propOrder = {
    "liveStreamEventAssetKey",
    "eventName",
    "liveStreamEventId",
    "eventStartDateTime",
    "eventEndDateTime",
    "prefetchEnabled",
    "podTrimmingEnabled"
})
public class LinearStreamCreateRequest
    extends StreamCreateRequest
{

    protected String liveStreamEventAssetKey;
    protected String eventName;
    protected Long liveStreamEventId;
    protected DateTime eventStartDateTime;
    protected DateTime eventEndDateTime;
    protected Boolean prefetchEnabled;
    protected Boolean podTrimmingEnabled;

    /**
     * Gets the value of the liveStreamEventAssetKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiveStreamEventAssetKey() {
        return liveStreamEventAssetKey;
    }

    /**
     * Sets the value of the liveStreamEventAssetKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiveStreamEventAssetKey(String value) {
        this.liveStreamEventAssetKey = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the liveStreamEventId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLiveStreamEventId() {
        return liveStreamEventId;
    }

    /**
     * Sets the value of the liveStreamEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLiveStreamEventId(Long value) {
        this.liveStreamEventId = value;
    }

    /**
     * Gets the value of the eventStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEventStartDateTime() {
        return eventStartDateTime;
    }

    /**
     * Sets the value of the eventStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEventStartDateTime(DateTime value) {
        this.eventStartDateTime = value;
    }

    /**
     * Gets the value of the eventEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEventEndDateTime() {
        return eventEndDateTime;
    }

    /**
     * Sets the value of the eventEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEventEndDateTime(DateTime value) {
        this.eventEndDateTime = value;
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
     * Gets the value of the podTrimmingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPodTrimmingEnabled() {
        return podTrimmingEnabled;
    }

    /**
     * Sets the value of the podTrimmingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPodTrimmingEnabled(Boolean value) {
        this.podTrimmingEnabled = value;
    }

}
