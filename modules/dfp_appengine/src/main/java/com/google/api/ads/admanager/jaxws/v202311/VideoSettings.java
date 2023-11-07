// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Information about the video settings of an encoding profile.
 *           
 * 
 * <p>Java class for VideoSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bitrate" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="framesPerSecond" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="resolution" type="{https://www.google.com/apis/ads/publisher/v202311}Size" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSettings", propOrder = {
    "codec",
    "bitrate",
    "framesPerSecond",
    "resolution"
})
public class VideoSettings {

    protected String codec;
    protected Long bitrate;
    protected Double framesPerSecond;
    protected Size resolution;

    /**
     * Gets the value of the codec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Sets the value of the codec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodec(String value) {
        this.codec = value;
    }

    /**
     * Gets the value of the bitrate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBitrate() {
        return bitrate;
    }

    /**
     * Sets the value of the bitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBitrate(Long value) {
        this.bitrate = value;
    }

    /**
     * Gets the value of the framesPerSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFramesPerSecond() {
        return framesPerSecond;
    }

    /**
     * Sets the value of the framesPerSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFramesPerSecond(Double value) {
        this.framesPerSecond = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setResolution(Size value) {
        this.resolution = value;
    }

}
