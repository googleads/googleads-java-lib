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


package com.google.api.ads.adwords.jaxws.v201802.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Platform;


/**
 * 
 *             Contains a campaign level estimate for a specified {@link Platform}.
 *           
 * 
 * <p>Java class for PlatformCampaignEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlatformCampaignEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platform" type="{https://adwords.google.com/api/adwords/cm/v201802}Platform" minOccurs="0"/>
 *         &lt;element name="minEstimate" type="{https://adwords.google.com/api/adwords/o/v201802}StatsEstimate" minOccurs="0"/>
 *         &lt;element name="maxEstimate" type="{https://adwords.google.com/api/adwords/o/v201802}StatsEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformCampaignEstimate", propOrder = {
    "platform",
    "minEstimate",
    "maxEstimate"
})
public class PlatformCampaignEstimate {

    protected Platform platform;
    protected StatsEstimate minEstimate;
    protected StatsEstimate maxEstimate;

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link Platform }
     *     
     */
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform }
     *     
     */
    public void setPlatform(Platform value) {
        this.platform = value;
    }

    /**
     * Gets the value of the minEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link StatsEstimate }
     *     
     */
    public StatsEstimate getMinEstimate() {
        return minEstimate;
    }

    /**
     * Sets the value of the minEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsEstimate }
     *     
     */
    public void setMinEstimate(StatsEstimate value) {
        this.minEstimate = value;
    }

    /**
     * Gets the value of the maxEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link StatsEstimate }
     *     
     */
    public StatsEstimate getMaxEstimate() {
        return maxEstimate;
    }

    /**
     * Sets the value of the maxEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsEstimate }
     *     
     */
    public void setMaxEstimate(StatsEstimate value) {
        this.maxEstimate = value;
    }

}
