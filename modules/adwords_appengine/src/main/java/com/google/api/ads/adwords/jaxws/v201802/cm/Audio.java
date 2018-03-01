// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Encapsulates an Audio media identified by a MediaId.
 *           
 * 
 * <p>Java class for Audio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Audio">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Media">
 *       &lt;sequence>
 *         &lt;element name="durationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="streamingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readyToPlayOnTheWeb" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Audio", propOrder = {
    "durationMillis",
    "streamingUrl",
    "readyToPlayOnTheWeb"
})
public class Audio
    extends Media
{

    protected Long durationMillis;
    protected String streamingUrl;
    protected Boolean readyToPlayOnTheWeb;

    /**
     * Gets the value of the durationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationMillis() {
        return durationMillis;
    }

    /**
     * Sets the value of the durationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationMillis(Long value) {
        this.durationMillis = value;
    }

    /**
     * Gets the value of the streamingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamingUrl() {
        return streamingUrl;
    }

    /**
     * Sets the value of the streamingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamingUrl(String value) {
        this.streamingUrl = value;
    }

    /**
     * Gets the value of the readyToPlayOnTheWeb property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadyToPlayOnTheWeb() {
        return readyToPlayOnTheWeb;
    }

    /**
     * Sets the value of the readyToPlayOnTheWeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadyToPlayOnTheWeb(Boolean value) {
        this.readyToPlayOnTheWeb = value;
    }

}
