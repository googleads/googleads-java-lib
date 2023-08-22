// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202302;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Settings to specify daily ad opportunity counts that will be used as the expected future traffic
 *             volume for a forecast adjustment.
 *             
 *             <p>For example: [10000, 20000, 5000] indicates expected traffic for the targeting specified on
 *             the parent traffic forecast segment of 10,000 ad opportunities for the first day, 20,000 ad
 *             opportunities for the second, and 5,000 for the third.
 *           
 * 
 * <p>Java class for DailyVolumeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailyVolumeSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adOpportunityCounts" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyVolumeSettings", propOrder = {
    "adOpportunityCounts"
})
public class DailyVolumeSettings {

    @XmlElement(type = Long.class)
    protected List<Long> adOpportunityCounts;

    /**
     * Gets the value of the adOpportunityCounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adOpportunityCounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdOpportunityCounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getAdOpportunityCounts() {
        if (adOpportunityCounts == null) {
            adOpportunityCounts = new ArrayList<Long>();
        }
        return this.adOpportunityCounts;
    }

}
