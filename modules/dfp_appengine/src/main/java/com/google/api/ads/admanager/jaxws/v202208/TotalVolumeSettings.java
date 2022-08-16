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


package com.google.api.ads.admanager.jaxws.v202208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Settings to specify a single total traffic volume that will be used as the expected total future
 *             volume for a forecast adjustment.
 *             
 *             <p>For example, an {@code adOpportunityCount} of 3,000 indicates a forecast goal for the
 *             targeting specified on the parent traffic forecast segment of 3,000 ad opportunities over the
 *             entire duration of the adjustment.
 *           
 * 
 * <p>Java class for TotalVolumeSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalVolumeSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adOpportunityCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalVolumeSettings", propOrder = {
    "adOpportunityCount"
})
public class TotalVolumeSettings {

    protected Long adOpportunityCount;

    /**
     * Gets the value of the adOpportunityCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdOpportunityCount() {
        return adOpportunityCount;
    }

    /**
     * Sets the value of the adOpportunityCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdOpportunityCount(Long value) {
        this.adOpportunityCount = value;
    }

}
