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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Slate} encapsulates all the information necessary to represent a Slate entity, the video
 *             creative used by Dynamic Ad Insertion to fill vacant ad slots.
 *           
 * 
 * <p>Java class for Slate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Slate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202505}SlateStatus" minOccurs="0"/&gt;
 *         &lt;element name="transcodeStatus" type="{https://www.google.com/apis/ads/publisher/v202505}TranscodeStatus" minOccurs="0"/&gt;
 *         &lt;element name="videoSourceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v202505}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Slate", propOrder = {
    "id",
    "name",
    "status",
    "transcodeStatus",
    "videoSourceUrl",
    "lastModifiedDateTime"
})
public class Slate {

    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected SlateStatus status;
    @XmlSchemaType(name = "string")
    protected TranscodeStatus transcodeStatus;
    protected String videoSourceUrl;
    protected DateTime lastModifiedDateTime;

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
     *     {@link SlateStatus }
     *     
     */
    public SlateStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlateStatus }
     *     
     */
    public void setStatus(SlateStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the transcodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TranscodeStatus }
     *     
     */
    public TranscodeStatus getTranscodeStatus() {
        return transcodeStatus;
    }

    /**
     * Sets the value of the transcodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranscodeStatus }
     *     
     */
    public void setTranscodeStatus(TranscodeStatus value) {
        this.transcodeStatus = value;
    }

    /**
     * Gets the value of the videoSourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceUrl() {
        return videoSourceUrl;
    }

    /**
     * Sets the value of the videoSourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoSourceUrl(String value) {
        this.videoSourceUrl = value;
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

}
