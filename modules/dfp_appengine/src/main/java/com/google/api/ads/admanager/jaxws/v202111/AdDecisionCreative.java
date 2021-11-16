// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdDecisionCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdDecisionCreative">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="slateDurationMills" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativeDurationMills" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="creativeTranscode" type="{https://www.google.com/apis/ads/publisher/v202111}CreativeTranscode" minOccurs="0"/>
 *         &lt;element name="googleVideoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="samError" type="{https://www.google.com/apis/ads/publisher/v202111}SamError" minOccurs="0"/>
 *         &lt;element name="isTranscoded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdDecisionCreative", propOrder = {
    "sequence",
    "slateDurationMills",
    "creativeDurationMills",
    "creativeTranscode",
    "googleVideoId",
    "samError",
    "isTranscoded"
})
public class AdDecisionCreative {

    protected Integer sequence;
    protected Long slateDurationMills;
    protected Long creativeDurationMills;
    protected CreativeTranscode creativeTranscode;
    protected String googleVideoId;
    protected SamError samError;
    protected Boolean isTranscoded;

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the slateDurationMills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSlateDurationMills() {
        return slateDurationMills;
    }

    /**
     * Sets the value of the slateDurationMills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSlateDurationMills(Long value) {
        this.slateDurationMills = value;
    }

    /**
     * Gets the value of the creativeDurationMills property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreativeDurationMills() {
        return creativeDurationMills;
    }

    /**
     * Sets the value of the creativeDurationMills property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreativeDurationMills(Long value) {
        this.creativeDurationMills = value;
    }

    /**
     * Gets the value of the creativeTranscode property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeTranscode }
     *     
     */
    public CreativeTranscode getCreativeTranscode() {
        return creativeTranscode;
    }

    /**
     * Sets the value of the creativeTranscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeTranscode }
     *     
     */
    public void setCreativeTranscode(CreativeTranscode value) {
        this.creativeTranscode = value;
    }

    /**
     * Gets the value of the googleVideoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleVideoId() {
        return googleVideoId;
    }

    /**
     * Sets the value of the googleVideoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleVideoId(String value) {
        this.googleVideoId = value;
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
     * Gets the value of the isTranscoded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTranscoded() {
        return isTranscoded;
    }

    /**
     * Sets the value of the isTranscoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTranscoded(Boolean value) {
        this.isTranscoded = value;
    }

}
