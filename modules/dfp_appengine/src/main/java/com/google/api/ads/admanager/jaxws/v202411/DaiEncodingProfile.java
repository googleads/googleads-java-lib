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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link DaiEncodingProfile} contains data about a publisher's encoding profiles. Ad Manager
 *             Dynamic Ad Insertion (DAI) uses the profile information about the content to select an
 *             appropriate ad transcode to play for the particular video.
 *           
 * 
 * <p>Java class for DaiEncodingProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DaiEncodingProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202411}DaiEncodingProfileStatus" minOccurs="0"/&gt;
 *         &lt;element name="variantType" type="{https://www.google.com/apis/ads/publisher/v202411}VariantType" minOccurs="0"/&gt;
 *         &lt;element name="containerType" type="{https://www.google.com/apis/ads/publisher/v202411}ContainerType" minOccurs="0"/&gt;
 *         &lt;element name="videoSettings" type="{https://www.google.com/apis/ads/publisher/v202411}VideoSettings" minOccurs="0"/&gt;
 *         &lt;element name="audioSettings" type="{https://www.google.com/apis/ads/publisher/v202411}AudioSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DaiEncodingProfile", propOrder = {
    "id",
    "name",
    "status",
    "variantType",
    "containerType",
    "videoSettings",
    "audioSettings"
})
public class DaiEncodingProfile {

    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected DaiEncodingProfileStatus status;
    @XmlSchemaType(name = "string")
    protected VariantType variantType;
    @XmlSchemaType(name = "string")
    protected ContainerType containerType;
    protected VideoSettings videoSettings;
    protected AudioSettings audioSettings;

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
     *     {@link DaiEncodingProfileStatus }
     *     
     */
    public DaiEncodingProfileStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaiEncodingProfileStatus }
     *     
     */
    public void setStatus(DaiEncodingProfileStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the variantType property.
     * 
     * @return
     *     possible object is
     *     {@link VariantType }
     *     
     */
    public VariantType getVariantType() {
        return variantType;
    }

    /**
     * Sets the value of the variantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariantType }
     *     
     */
    public void setVariantType(VariantType value) {
        this.variantType = value;
    }

    /**
     * Gets the value of the containerType property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType }
     *     
     */
    public ContainerType getContainerType() {
        return containerType;
    }

    /**
     * Sets the value of the containerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType }
     *     
     */
    public void setContainerType(ContainerType value) {
        this.containerType = value;
    }

    /**
     * Gets the value of the videoSettings property.
     * 
     * @return
     *     possible object is
     *     {@link VideoSettings }
     *     
     */
    public VideoSettings getVideoSettings() {
        return videoSettings;
    }

    /**
     * Sets the value of the videoSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoSettings }
     *     
     */
    public void setVideoSettings(VideoSettings value) {
        this.videoSettings = value;
    }

    /**
     * Gets the value of the audioSettings property.
     * 
     * @return
     *     possible object is
     *     {@link AudioSettings }
     *     
     */
    public AudioSettings getAudioSettings() {
        return audioSettings;
    }

    /**
     * Sets the value of the audioSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSettings }
     *     
     */
    public void setAudioSettings(AudioSettings value) {
        this.audioSettings = value;
    }

}
