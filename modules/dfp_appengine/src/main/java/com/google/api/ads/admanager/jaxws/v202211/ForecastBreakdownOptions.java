// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202211;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Configuration of forecast breakdown.
 *           
 * 
 * <p>Java class for ForecastBreakdownOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastBreakdownOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeWindows" type="{https://www.google.com/apis/ads/publisher/v202211}DateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="targets" type="{https://www.google.com/apis/ads/publisher/v202211}ForecastBreakdownTarget" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastBreakdownOptions", propOrder = {
    "timeWindows",
    "targets"
})
public class ForecastBreakdownOptions {

    protected List<DateTime> timeWindows;
    protected List<ForecastBreakdownTarget> targets;

    /**
     * Gets the value of the timeWindows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeWindows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeWindows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTime }
     * 
     * 
     */
    public List<DateTime> getTimeWindows() {
        if (timeWindows == null) {
            timeWindows = new ArrayList<DateTime>();
        }
        return this.timeWindows;
    }

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastBreakdownTarget }
     * 
     * 
     */
    public List<ForecastBreakdownTarget> getTargets() {
        if (targets == null) {
            targets = new ArrayList<ForecastBreakdownTarget>();
        }
        return this.targets;
    }

}
