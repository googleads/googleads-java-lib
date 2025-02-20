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


package com.google.api.ads.admanager.jaxws.v202502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains forecasted and historical traffic volume data describing a segment of traffic.
 *           
 * 
 * <p>Java class for TrafficDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficDataResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="historicalTimeSeries" type="{https://www.google.com/apis/ads/publisher/v202502}TimeSeries" minOccurs="0"/&gt;
 *         &lt;element name="forecastedTimeSeries" type="{https://www.google.com/apis/ads/publisher/v202502}TimeSeries" minOccurs="0"/&gt;
 *         &lt;element name="forecastedAssignedTimeSeries" type="{https://www.google.com/apis/ads/publisher/v202502}TimeSeries" minOccurs="0"/&gt;
 *         &lt;element name="overallDateRange" type="{https://www.google.com/apis/ads/publisher/v202502}DateRange" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficDataResponse", propOrder = {
    "historicalTimeSeries",
    "forecastedTimeSeries",
    "forecastedAssignedTimeSeries",
    "overallDateRange"
})
public class TrafficDataResponse {

    protected TimeSeries historicalTimeSeries;
    protected TimeSeries forecastedTimeSeries;
    protected TimeSeries forecastedAssignedTimeSeries;
    protected DateRange overallDateRange;

    /**
     * Gets the value of the historicalTimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeries }
     *     
     */
    public TimeSeries getHistoricalTimeSeries() {
        return historicalTimeSeries;
    }

    /**
     * Sets the value of the historicalTimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeries }
     *     
     */
    public void setHistoricalTimeSeries(TimeSeries value) {
        this.historicalTimeSeries = value;
    }

    /**
     * Gets the value of the forecastedTimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeries }
     *     
     */
    public TimeSeries getForecastedTimeSeries() {
        return forecastedTimeSeries;
    }

    /**
     * Sets the value of the forecastedTimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeries }
     *     
     */
    public void setForecastedTimeSeries(TimeSeries value) {
        this.forecastedTimeSeries = value;
    }

    /**
     * Gets the value of the forecastedAssignedTimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeries }
     *     
     */
    public TimeSeries getForecastedAssignedTimeSeries() {
        return forecastedAssignedTimeSeries;
    }

    /**
     * Sets the value of the forecastedAssignedTimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeries }
     *     
     */
    public void setForecastedAssignedTimeSeries(TimeSeries value) {
        this.forecastedAssignedTimeSeries = value;
    }

    /**
     * Gets the value of the overallDateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getOverallDateRange() {
        return overallDateRange;
    }

    /**
     * Sets the value of the overallDateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setOverallDateRange(DateRange value) {
        this.overallDateRange = value;
    }

}
