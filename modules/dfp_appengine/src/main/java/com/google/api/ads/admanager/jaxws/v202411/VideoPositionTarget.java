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
 *             Represents the options for targetable positions within a video.
 *           
 * 
 * <p>Java class for VideoPositionTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPositionTarget"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="videoPosition" type="{https://www.google.com/apis/ads/publisher/v202411}VideoPosition" minOccurs="0"/&gt;
 *         &lt;element name="videoBumperType" type="{https://www.google.com/apis/ads/publisher/v202411}VideoBumperType" minOccurs="0"/&gt;
 *         &lt;element name="videoPositionWithinPod" type="{https://www.google.com/apis/ads/publisher/v202411}VideoPositionWithinPod" minOccurs="0"/&gt;
 *         &lt;element name="adSpotId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPositionTarget", propOrder = {
    "videoPosition",
    "videoBumperType",
    "videoPositionWithinPod",
    "adSpotId"
})
public class VideoPositionTarget {

    protected VideoPosition videoPosition;
    @XmlSchemaType(name = "string")
    protected VideoBumperType videoBumperType;
    protected VideoPositionWithinPod videoPositionWithinPod;
    protected Long adSpotId;

    /**
     * Gets the value of the videoPosition property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPosition }
     *     
     */
    public VideoPosition getVideoPosition() {
        return videoPosition;
    }

    /**
     * Sets the value of the videoPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPosition }
     *     
     */
    public void setVideoPosition(VideoPosition value) {
        this.videoPosition = value;
    }

    /**
     * Gets the value of the videoBumperType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoBumperType }
     *     
     */
    public VideoBumperType getVideoBumperType() {
        return videoBumperType;
    }

    /**
     * Sets the value of the videoBumperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoBumperType }
     *     
     */
    public void setVideoBumperType(VideoBumperType value) {
        this.videoBumperType = value;
    }

    /**
     * Gets the value of the videoPositionWithinPod property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionWithinPod }
     *     
     */
    public VideoPositionWithinPod getVideoPositionWithinPod() {
        return videoPositionWithinPod;
    }

    /**
     * Sets the value of the videoPositionWithinPod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionWithinPod }
     *     
     */
    public void setVideoPositionWithinPod(VideoPositionWithinPod value) {
        this.videoPositionWithinPod = value;
    }

    /**
     * Gets the value of the adSpotId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdSpotId() {
        return adSpotId;
    }

    /**
     * Sets the value of the adSpotId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdSpotId(Long value) {
        this.adSpotId = value;
    }

}
