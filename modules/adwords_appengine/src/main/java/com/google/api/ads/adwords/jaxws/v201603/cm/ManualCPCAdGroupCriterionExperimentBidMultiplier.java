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


package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             AdGroupCriterion level bid multiplier used in manual CPC bidding strategies.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCPCAdGroupCriterionExperimentBidMultiplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCPCAdGroupCriterionExperimentBidMultiplier">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}AdGroupCriterionExperimentBidMultiplier">
 *       &lt;sequence>
 *         &lt;element name="maxCpcMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201603}BidMultiplier" minOccurs="0"/>
 *         &lt;element name="multiplierSource" type="{https://adwords.google.com/api/adwords/cm/v201603}MultiplierSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCPCAdGroupCriterionExperimentBidMultiplier", propOrder = {
    "maxCpcMultiplier",
    "multiplierSource"
})
public class ManualCPCAdGroupCriterionExperimentBidMultiplier
    extends AdGroupCriterionExperimentBidMultiplier
{

    protected BidMultiplier maxCpcMultiplier;
    @XmlSchemaType(name = "string")
    protected MultiplierSource multiplierSource;

    /**
     * Gets the value of the maxCpcMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BidMultiplier }
     *     
     */
    public BidMultiplier getMaxCpcMultiplier() {
        return maxCpcMultiplier;
    }

    /**
     * Sets the value of the maxCpcMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidMultiplier }
     *     
     */
    public void setMaxCpcMultiplier(BidMultiplier value) {
        this.maxCpcMultiplier = value;
    }

    /**
     * Gets the value of the multiplierSource property.
     * 
     * @return
     *     possible object is
     *     {@link MultiplierSource }
     *     
     */
    public MultiplierSource getMultiplierSource() {
        return multiplierSource;
    }

    /**
     * Sets the value of the multiplierSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplierSource }
     *     
     */
    public void setMultiplierSource(MultiplierSource value) {
        this.multiplierSource = value;
    }

}
