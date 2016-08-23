// Copyright 2015 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201508;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code PropoalLineItemConstraints} represents all the constraints set for a
 *             {@link ProposalLineItem} and is always readonly. It comes from the {@link Product},
 *             based on which the proposal line item is created.
 *           
 * 
 * <p>Java class for ProposalLineItemConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="builtInFrequencyCaps" type="{https://www.google.com/apis/ads/publisher/v201508}FrequencyCap" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="productBuiltInTargeting" type="{https://www.google.com/apis/ads/publisher/v201508}Targeting" minOccurs="0"/>
 *         &lt;element name="customizableAttributes" type="{https://www.google.com/apis/ads/publisher/v201508}CustomizableAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemConstraints", propOrder = {
    "builtInFrequencyCaps",
    "productBuiltInTargeting",
    "customizableAttributes"
})
public class ProposalLineItemConstraints {

    protected List<FrequencyCap> builtInFrequencyCaps;
    protected Targeting productBuiltInTargeting;
    protected CustomizableAttributes customizableAttributes;

    /**
     * Gets the value of the builtInFrequencyCaps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the builtInFrequencyCaps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuiltInFrequencyCaps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrequencyCap }
     * 
     * 
     */
    public List<FrequencyCap> getBuiltInFrequencyCaps() {
        if (builtInFrequencyCaps == null) {
            builtInFrequencyCaps = new ArrayList<FrequencyCap>();
        }
        return this.builtInFrequencyCaps;
    }

    /**
     * Gets the value of the productBuiltInTargeting property.
     * 
     * @return
     *     possible object is
     *     {@link Targeting }
     *     
     */
    public Targeting getProductBuiltInTargeting() {
        return productBuiltInTargeting;
    }

    /**
     * Sets the value of the productBuiltInTargeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Targeting }
     *     
     */
    public void setProductBuiltInTargeting(Targeting value) {
        this.productBuiltInTargeting = value;
    }

    /**
     * Gets the value of the customizableAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizableAttributes }
     *     
     */
    public CustomizableAttributes getCustomizableAttributes() {
        return customizableAttributes;
    }

    /**
     * Sets the value of the customizableAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizableAttributes }
     *     
     */
    public void setCustomizableAttributes(CustomizableAttributes value) {
        this.customizableAttributes = value;
    }

}
