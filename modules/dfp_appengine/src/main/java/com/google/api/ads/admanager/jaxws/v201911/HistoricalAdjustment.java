// Copyright 2019 Google LLC
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


package com.google.api.ads.admanager.jaxws.v201911;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a {@link TrafficForecastAdjustmentSegment} whose {@link BasisType} is {@link
 *             BasisType#HISTORICAL}.
 *           
 * 
 * <p>Java class for HistoricalAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoricalAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="targetDateRange" type="{https://www.google.com/apis/ads/publisher/v201911}DateRange" minOccurs="0"/>
 *         &lt;element name="referenceDateRange" type="{https://www.google.com/apis/ads/publisher/v201911}DateRange" minOccurs="0"/>
 *         &lt;element name="milliPercentMultiplier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoricalAdjustment", propOrder = {
    "targetDateRange",
    "referenceDateRange",
    "milliPercentMultiplier"
})
public class HistoricalAdjustment {

    protected DateRange targetDateRange;
    protected DateRange referenceDateRange;
    protected Long milliPercentMultiplier;

    /**
     * Gets the value of the targetDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getTargetDateRange() {
        return targetDateRange;
    }

    /**
     * Sets the value of the targetDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setTargetDateRange(DateRange value) {
        this.targetDateRange = value;
    }

    /**
     * Gets the value of the referenceDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getReferenceDateRange() {
        return referenceDateRange;
    }

    /**
     * Sets the value of the referenceDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setReferenceDateRange(DateRange value) {
        this.referenceDateRange = value;
    }

    /**
     * Gets the value of the milliPercentMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMilliPercentMultiplier() {
        return milliPercentMultiplier;
    }

    /**
     * Sets the value of the milliPercentMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMilliPercentMultiplier(Long value) {
        this.milliPercentMultiplier = value;
    }

}
