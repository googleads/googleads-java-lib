// Copyright 2020 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Settings to specify historical volume data that will be used as the expected future traffic
 *             volume for a {@link ForecastAdjustment}.
 *             
 *             <p>The historical daily ad opportunity volumes are fetched for the requested historical targeting
 *             and range, multiplied by the multiplier, and then translated into the date range of this
 *             adjustment. The duration of the historical date range does *not* need to be the same as the
 *             duration of this adjustment's date range.
 *           
 * 
 * <p>Java class for HistoricalBasisVolumeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalBasisVolumeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="useParentTrafficForecastSegmentTargeting" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="targeting" type="{https://www.google.com/apis/ads/publisher/v202005}Targeting" minOccurs="0"/>
 *         &lt;element name="historicalDateRange" type="{https://www.google.com/apis/ads/publisher/v202005}DateRange" minOccurs="0"/>
 *         &lt;element name="multiplierMilliPercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalBasisVolumeSettings", propOrder = {
    "useParentTrafficForecastSegmentTargeting",
    "targeting",
    "historicalDateRange",
    "multiplierMilliPercent"
})
public class HistoricalBasisVolumeSettings {

    protected Boolean useParentTrafficForecastSegmentTargeting;
    protected Targeting targeting;
    protected DateRange historicalDateRange;
    protected Long multiplierMilliPercent;

    /**
     * Gets the value of the useParentTrafficForecastSegmentTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseParentTrafficForecastSegmentTargeting() {
        return useParentTrafficForecastSegmentTargeting;
    }

    /**
     * Sets the value of the useParentTrafficForecastSegmentTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseParentTrafficForecastSegmentTargeting(Boolean value) {
        this.useParentTrafficForecastSegmentTargeting = value;
    }

    /**
     * Gets the value of the targeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getTargeting() {
        return targeting;
    }

    /**
     * Sets the value of the targeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setTargeting(Targeting value) {
        this.targeting = value;
    }

    /**
     * Gets the value of the historicalDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getHistoricalDateRange() {
        return historicalDateRange;
    }

    /**
     * Sets the value of the historicalDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setHistoricalDateRange(DateRange value) {
        this.historicalDateRange = value;
    }

    /**
     * Gets the value of the multiplierMilliPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMultiplierMilliPercent() {
        return multiplierMilliPercent;
    }

    /**
     * Sets the value of the multiplierMilliPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMultiplierMilliPercent(Long value) {
        this.multiplierMilliPercent = value;
    }

}
