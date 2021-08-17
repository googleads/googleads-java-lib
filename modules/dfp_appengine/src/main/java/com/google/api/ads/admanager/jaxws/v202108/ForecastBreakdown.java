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


package com.google.api.ads.admanager.jaxws.v202108;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the breakdown entries for a list of targetings and/or creatives.
 *           
 * 
 * <p>Java class for ForecastBreakdown complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastBreakdown">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{https://www.google.com/apis/ads/publisher/v202108}DateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{https://www.google.com/apis/ads/publisher/v202108}DateTime" minOccurs="0"/>
 *         &lt;element name="breakdownEntries" type="{https://www.google.com/apis/ads/publisher/v202108}ForecastBreakdownEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastBreakdown", propOrder = {
    "startTime",
    "endTime",
    "breakdownEntries"
})
public class ForecastBreakdown {

    protected DateTime startTime;
    protected DateTime endTime;
    protected List<ForecastBreakdownEntry> breakdownEntries;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartTime(DateTime value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndTime(DateTime value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the breakdownEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakdownEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakdownEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastBreakdownEntry }
     * 
     * 
     */
    public List<ForecastBreakdownEntry> getBreakdownEntries() {
        if (breakdownEntries == null) {
            breakdownEntries = new ArrayList<ForecastBreakdownEntry>();
        }
        return this.breakdownEntries;
    }

}
