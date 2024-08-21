// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Rule of a {@link FirstPartyAudienceSegment} that defines user's eligibility criteria to be part
 *             of a segment.
 *           
 * 
 * <p>Java class for FirstPartyAudienceSegmentRule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstPartyAudienceSegmentRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="inventoryRule" type="{https://www.google.com/apis/ads/publisher/v202408}InventoryTargeting" minOccurs="0"/&gt;
 *         &lt;element name="customCriteriaRule" type="{https://www.google.com/apis/ads/publisher/v202408}CustomCriteriaSet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FirstPartyAudienceSegmentRule", propOrder = {
    "inventoryRule",
    "customCriteriaRule"
})
public class FirstPartyAudienceSegmentRule {

    protected InventoryTargeting inventoryRule;
    protected CustomCriteriaSet customCriteriaRule;

    /**
     * Gets the value of the inventoryRule property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTargeting }
     *     
     */
    public InventoryTargeting getInventoryRule() {
        return inventoryRule;
    }

    /**
     * Sets the value of the inventoryRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTargeting }
     *     
     */
    public void setInventoryRule(InventoryTargeting value) {
        this.inventoryRule = value;
    }

    /**
     * Gets the value of the customCriteriaRule property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCriteriaSet }
     *     
     */
    public CustomCriteriaSet getCustomCriteriaRule() {
        return customCriteriaRule;
    }

    /**
     * Sets the value of the customCriteriaRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCriteriaSet }
     *     
     */
    public void setCustomCriteriaRule(CustomCriteriaSet value) {
        this.customCriteriaRule = value;
    }

}
