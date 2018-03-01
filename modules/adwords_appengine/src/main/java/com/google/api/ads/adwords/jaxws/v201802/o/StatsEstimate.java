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
import com.google.api.ads.adwords.jaxws.v201802.cm.Money;


/**
 * 
 *             Represents a set of stats for a daily traffic estimate.
 *             
 *             <p>{@code averageCpc}, {@code averagePosition} and {@code clickThroughRate} will be
 *             {@code null} when not defined and {@code clicksPerDay} or {@code impressionsPerDay}
 *             is {@code 0}, respectively.</p>
 *           
 * 
 * <p>Java class for StatsEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="averageCpc" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *         &lt;element name="averagePosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clickThroughRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="clicksPerDay" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="impressionsPerDay" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="totalCost" type="{https://adwords.google.com/api/adwords/cm/v201802}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsEstimate", propOrder = {
    "averageCpc",
    "averagePosition",
    "clickThroughRate",
    "clicksPerDay",
    "impressionsPerDay",
    "totalCost"
})
public class StatsEstimate {

    protected Money averageCpc;
    protected Double averagePosition;
    protected Double clickThroughRate;
    protected Float clicksPerDay;
    protected Float impressionsPerDay;
    protected Money totalCost;

    /**
     * Gets the value of the averageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageCpc() {
        return averageCpc;
    }

    /**
     * Sets the value of the averageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageCpc(Money value) {
        this.averageCpc = value;
    }

    /**
     * Gets the value of the averagePosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAveragePosition() {
        return averagePosition;
    }

    /**
     * Sets the value of the averagePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAveragePosition(Double value) {
        this.averagePosition = value;
    }

    /**
     * Gets the value of the clickThroughRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClickThroughRate() {
        return clickThroughRate;
    }

    /**
     * Sets the value of the clickThroughRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClickThroughRate(Double value) {
        this.clickThroughRate = value;
    }

    /**
     * Gets the value of the clicksPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getClicksPerDay() {
        return clicksPerDay;
    }

    /**
     * Sets the value of the clicksPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setClicksPerDay(Float value) {
        this.clicksPerDay = value;
    }

    /**
     * Gets the value of the impressionsPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getImpressionsPerDay() {
        return impressionsPerDay;
    }

    /**
     * Sets the value of the impressionsPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setImpressionsPerDay(Float value) {
        this.impressionsPerDay = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalCost(Money value) {
        this.totalCost = value;
    }

}
