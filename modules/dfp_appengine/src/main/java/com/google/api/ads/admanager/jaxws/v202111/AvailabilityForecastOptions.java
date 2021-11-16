// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Forecasting options for line item availability forecasts.
 *           
 * 
 * <p>Java class for AvailabilityForecastOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityForecastOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeTargetingCriteriaBreakdown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeContendingLineItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="breakdown" type="{https://www.google.com/apis/ads/publisher/v202111}ForecastBreakdownOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityForecastOptions", propOrder = {
    "includeTargetingCriteriaBreakdown",
    "includeContendingLineItems",
    "breakdown"
})
public class AvailabilityForecastOptions {

    protected Boolean includeTargetingCriteriaBreakdown;
    protected Boolean includeContendingLineItems;
    protected ForecastBreakdownOptions breakdown;

    /**
     * Gets the value of the includeTargetingCriteriaBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTargetingCriteriaBreakdown() {
        return includeTargetingCriteriaBreakdown;
    }

    /**
     * Sets the value of the includeTargetingCriteriaBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTargetingCriteriaBreakdown(Boolean value) {
        this.includeTargetingCriteriaBreakdown = value;
    }

    /**
     * Gets the value of the includeContendingLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeContendingLineItems() {
        return includeContendingLineItems;
    }

    /**
     * Sets the value of the includeContendingLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeContendingLineItems(Boolean value) {
        this.includeContendingLineItems = value;
    }

    /**
     * Gets the value of the breakdown property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastBreakdownOptions }
     *     
     */
    public ForecastBreakdownOptions getBreakdown() {
        return breakdown;
    }

    /**
     * Sets the value of the breakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastBreakdownOptions }
     *     
     */
    public void setBreakdown(ForecastBreakdownOptions value) {
        this.breakdown = value;
    }

}
