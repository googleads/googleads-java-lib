// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Adgroup level bid multipliers used in manual CPM bidding strategy.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCPMAdGroupExperimentBidMultipliers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCPMAdGroupExperimentBidMultipliers">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201605}AdGroupExperimentBidMultipliers">
 *       &lt;sequence>
 *         &lt;element name="maxCpmMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201605}BidMultiplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCPMAdGroupExperimentBidMultipliers", propOrder = {
    "maxCpmMultiplier"
})
public class ManualCPMAdGroupExperimentBidMultipliers
    extends AdGroupExperimentBidMultipliers
{

    protected BidMultiplier maxCpmMultiplier;

    /**
     * Gets the value of the maxCpmMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BidMultiplier }
     *     
     */
    public BidMultiplier getMaxCpmMultiplier() {
        return maxCpmMultiplier;
    }

    /**
     * Sets the value of the maxCpmMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidMultiplier }
     *     
     */
    public void setMaxCpmMultiplier(BidMultiplier value) {
        this.maxCpmMultiplier = value;
    }

}
