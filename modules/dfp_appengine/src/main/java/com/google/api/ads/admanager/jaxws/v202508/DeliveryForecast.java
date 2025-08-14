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


package com.google.api.ads.admanager.jaxws.v202508;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The forecast of delivery for a list of {@link ProspectiveLineItem} objects to be reserved at the
 *             same time.
 *           
 * 
 * <p>Java class for DeliveryForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryForecast"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItemDeliveryForecasts" type="{https://www.google.com/apis/ads/publisher/v202508}LineItemDeliveryForecast" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryForecast", propOrder = {
    "lineItemDeliveryForecasts"
})
public class DeliveryForecast {

    protected List<LineItemDeliveryForecast> lineItemDeliveryForecasts;

    /**
     * Gets the value of the lineItemDeliveryForecasts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItemDeliveryForecasts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItemDeliveryForecasts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemDeliveryForecast }
     * 
     * 
     */
    public List<LineItemDeliveryForecast> getLineItemDeliveryForecasts() {
        if (lineItemDeliveryForecasts == null) {
            lineItemDeliveryForecasts = new ArrayList<LineItemDeliveryForecast>();
        }
        return this.lineItemDeliveryForecasts;
    }

}
