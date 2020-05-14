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


package com.google.api.ads.admanager.jaxws.v202002;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Saves all of the provided traffic adjustments.
 *             
 *             <p>If there is already a {@link TrafficForecastAdjustment} saved for the same {@link
 *             TrafficTimeSeriesFilterCriteria}, the pre-existing {@link TrafficForecastAdjustment} will be
 *             completely replaced with the submitted {@link TrafficForecastAdjustment}.
 *             
 *             <p>This method is only available when MAKE_TRAFFIC_FORECAST_ADJUSTMENTS_IN_BULK is enabled in
 *             the global settings on your network.
 *             
 *             <p>This method is incompatible with the use of traffic forecast segments and forecast
 *             adjustments. It will throw an exception if that use is enabled for this network.
 *           
 * 
 * <p>Java class for updateTrafficAdjustments element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateTrafficAdjustments">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adjustments" type="{https://www.google.com/apis/ads/publisher/v202002}TrafficForecastAdjustment" maxOccurs="unbounded" minOccurs="0"/>
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
    "adjustments"
})
@XmlRootElement(name = "updateTrafficAdjustments")
public class AdjustmentServiceInterfaceupdateTrafficAdjustments {

    protected List<TrafficForecastAdjustment> adjustments;

    /**
     * Gets the value of the adjustments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjustments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjustments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficForecastAdjustment }
     * 
     * 
     */
    public List<TrafficForecastAdjustment> getAdjustments() {
        if (adjustments == null) {
            adjustments = new ArrayList<TrafficForecastAdjustment>();
        }
        return this.adjustments;
    }

}
