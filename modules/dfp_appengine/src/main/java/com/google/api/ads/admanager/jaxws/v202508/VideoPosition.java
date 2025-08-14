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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a targetable position within a video. A video ad can be targeted
 *             to a position (pre-roll, all mid-rolls, or post-roll), or to a specific mid-roll index.
 *           
 * 
 * <p>Java class for VideoPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="positionType" type="{https://www.google.com/apis/ads/publisher/v202508}VideoPosition.Type" minOccurs="0"/&gt;
 *         &lt;element name="midrollIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPosition", propOrder = {
    "positionType",
    "midrollIndex"
})
public class VideoPosition {

    @XmlSchemaType(name = "string")
    protected VideoPositionType positionType;
    protected Integer midrollIndex;

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionType }
     *     
     */
    public VideoPositionType getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionType }
     *     
     */
    public void setPositionType(VideoPositionType value) {
        this.positionType = value;
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

}
