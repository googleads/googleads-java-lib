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


package com.google.api.ads.admanager.jaxws.v201908;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a unique segment of a traffic forecast adjustment. Each {@link
 *             TrafficForecastAdjustmentSegment} targets a range of dates in the future to which the adjustment
 *             applies.
 *           
 * 
 * <p>Java class for TrafficForecastAdjustmentSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficForecastAdjustmentSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basisType" type="{https://www.google.com/apis/ads/publisher/v201908}BasisType" minOccurs="0"/>
 *         &lt;element name="adjustmentTimeSeries" type="{https://www.google.com/apis/ads/publisher/v201908}TimeSeries" minOccurs="0"/>
 *         &lt;element name="historicalAdjustment" type="{https://www.google.com/apis/ads/publisher/v201908}HistoricalAdjustment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficForecastAdjustmentSegment", propOrder = {
    "basisType",
    "adjustmentTimeSeries",
    "historicalAdjustment"
})
public class TrafficForecastAdjustmentSegment {

    @XmlSchemaType(name = "string")
    protected BasisType basisType;
    protected TimeSeries adjustmentTimeSeries;
    protected HistoricalAdjustment historicalAdjustment;

    /**
     * Gets the value of the basisType property.
     * 
     * @return
     *     possible object is
     *     {@link BasisType }
     *     
     */
    public BasisType getBasisType() {
        return basisType;
    }

    /**
     * Sets the value of the basisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasisType }
     *     
     */
    public void setBasisType(BasisType value) {
        this.basisType = value;
    }

    /**
     * Gets the value of the adjustmentTimeSeries property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSeries }
     *     
     */
    public TimeSeries getAdjustmentTimeSeries() {
        return adjustmentTimeSeries;
    }

    /**
     * Sets the value of the adjustmentTimeSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSeries }
     *     
     */
    public void setAdjustmentTimeSeries(TimeSeries value) {
        this.adjustmentTimeSeries = value;
    }

    /**
     * Gets the value of the historicalAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link HistoricalAdjustment }
     *     
     */
    public HistoricalAdjustment getHistoricalAdjustment() {
        return historicalAdjustment;
    }

    /**
     * Sets the value of the historicalAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoricalAdjustment }
     *     
     */
    public void setHistoricalAdjustment(HistoricalAdjustment value) {
        this.historicalAdjustment = value;
    }

}
