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
 *             YouTube video criterion.
 *             <p> A criterion of this type can be either targeted or excluded.
 *             <span class="constraint AdxEnabled">This is disabled for AdX when it is contained within Operators: ADD, SET.</span>
 *           
 * 
 * <p>Java class for YouTubeVideo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YouTubeVideo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Criterion">
 *       &lt;sequence>
 *         &lt;element name="videoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="videoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YouTubeVideo", propOrder = {
    "videoId",
    "videoName"
})
public class YouTubeVideo
    extends Criterion
{

    protected String videoId;
    protected String videoName;

    /**
     * Gets the value of the videoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of the videoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoId(String value) {
        this.videoId = value;
    }

    /**
     * Gets the value of the videoName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * Sets the value of the videoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoName(String value) {
        this.videoName = value;
    }

}
