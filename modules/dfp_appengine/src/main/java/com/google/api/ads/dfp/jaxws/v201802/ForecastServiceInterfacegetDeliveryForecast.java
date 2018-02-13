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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets the delivery forecast for a list of {@link ProspectiveLineItem} objects in a single
 *             delivery simulation with line items potentially contending with each other. A delivery forecast
 *             reports the number of units that will be delivered to each line item given the line item goals
 *             and contentions from other line items.
 *             
 *             @param lineItems line items to be forecasted for delivery
 *             @param forecastOptions options controlling the forecast
 *           
 * 
 * <p>Java class for getDeliveryForecast element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getDeliveryForecast">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="lineItems" type="{https://www.google.com/apis/ads/publisher/v201802}ProspectiveLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="forecastOptions" type="{https://www.google.com/apis/ads/publisher/v201802}DeliveryForecastOptions" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lineItems",
    "forecastOptions"
})
@XmlRootElement(name = "getDeliveryForecast")
public class ForecastServiceInterfacegetDeliveryForecast {

    protected List<ProspectiveLineItem> lineItems;
    protected DeliveryForecastOptions forecastOptions;

    /**
     * Gets the value of the lineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProspectiveLineItem }
     * 
     * 
     */
    public List<ProspectiveLineItem> getLineItems() {
        if (lineItems == null) {
            lineItems = new ArrayList<ProspectiveLineItem>();
        }
        return this.lineItems;
    }

    /**
     * Gets the value of the forecastOptions property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryForecastOptions }
     *     
     */
    public DeliveryForecastOptions getForecastOptions() {
        return forecastOptions;
    }

    /**
     * Sets the value of the forecastOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryForecastOptions }
     *     
     */
    public void setForecastOptions(DeliveryForecastOptions value) {
        this.forecastOptions = value;
    }

}
