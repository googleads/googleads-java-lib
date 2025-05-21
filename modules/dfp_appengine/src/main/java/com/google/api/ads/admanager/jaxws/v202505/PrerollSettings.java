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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Settings for ad breaks on {@link LiveStreamEvent} that are specific to preroll.
 *           
 * 
 * <p>Java class for PrerollSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrerollSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxAdPodDurationSeconds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrerollSettings", propOrder = {
    "adTag",
    "maxAdPodDurationSeconds"
})
public class PrerollSettings {

    protected String adTag;
    protected Long maxAdPodDurationSeconds;

    /**
     * Gets the value of the adTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdTag() {
        return adTag;
    }

    /**
     * Sets the value of the adTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdTag(String value) {
        this.adTag = value;
    }

    /**
     * Gets the value of the maxAdPodDurationSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxAdPodDurationSeconds() {
        return maxAdPodDurationSeconds;
    }

    /**
     * Sets the value of the maxAdPodDurationSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxAdPodDurationSeconds(Long value) {
        this.maxAdPodDurationSeconds = value;
    }

}
