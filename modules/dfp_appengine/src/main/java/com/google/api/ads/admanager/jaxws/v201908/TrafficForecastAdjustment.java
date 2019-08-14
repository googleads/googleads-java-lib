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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a set of {@link TrafficForecastAdjustmentSegment} assigned to a slice of inventory
 *             defined by a {@link TrafficTimeSeriesFilterCriteria}.
 *           
 * 
 * <p>Java class for TrafficForecastAdjustment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficForecastAdjustment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="filterCriteria" type="{https://www.google.com/apis/ads/publisher/v201908}TrafficTimeSeriesFilterCriteria" minOccurs="0"/>
 *         &lt;element name="forecastAdjustmentSegments" type="{https://www.google.com/apis/ads/publisher/v201908}TrafficForecastAdjustmentSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastModifiedDateTime" type="{https://www.google.com/apis/ads/publisher/v201908}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficForecastAdjustment", propOrder = {
    "id",
    "filterCriteria",
    "forecastAdjustmentSegments",
    "lastModifiedDateTime"
})
public class TrafficForecastAdjustment {

    protected Long id;
    protected TrafficTimeSeriesFilterCriteria filterCriteria;
    protected List<TrafficForecastAdjustmentSegment> forecastAdjustmentSegments;
    protected DateTime lastModifiedDateTime;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the filterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficTimeSeriesFilterCriteria }
     *     
     */
    public TrafficTimeSeriesFilterCriteria getFilterCriteria() {
        return filterCriteria;
    }

    /**
     * Sets the value of the filterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficTimeSeriesFilterCriteria }
     *     
     */
    public void setFilterCriteria(TrafficTimeSeriesFilterCriteria value) {
        this.filterCriteria = value;
    }

    /**
     * Gets the value of the forecastAdjustmentSegments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastAdjustmentSegments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastAdjustmentSegments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficForecastAdjustmentSegment }
     * 
     * 
     */
    public List<TrafficForecastAdjustmentSegment> getForecastAdjustmentSegments() {
        if (forecastAdjustmentSegments == null) {
            forecastAdjustmentSegments = new ArrayList<TrafficForecastAdjustmentSegment>();
        }
        return this.forecastAdjustmentSegments;
    }

    /**
     * Gets the value of the lastModifiedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * Sets the value of the lastModifiedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setLastModifiedDateTime(DateTime value) {
        this.lastModifiedDateTime = value;
    }

}
