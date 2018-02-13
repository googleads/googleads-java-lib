// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A premium rate holding a set of {@link PremiumRateValue} objects with the same {@link
 *             PremiumFeature}.
 *           
 * 
 * <p>Java class for PremiumRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rateCardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="pricingMethod" type="{https://www.google.com/apis/ads/publisher/v201802}PricingMethod" minOccurs="0"/>
 *         &lt;element name="premiumFeature" type="{https://www.google.com/apis/ads/publisher/v201802}PremiumFeature" minOccurs="0"/>
 *         &lt;element name="premiumRateValues" type="{https://www.google.com/apis/ads/publisher/v201802}PremiumRateValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumRate", propOrder = {
    "id",
    "rateCardId",
    "pricingMethod",
    "premiumFeature",
    "premiumRateValues"
})
public class PremiumRate {

    protected Long id;
    protected Long rateCardId;
    @XmlSchemaType(name = "string")
    protected PricingMethod pricingMethod;
    protected PremiumFeature premiumFeature;
    protected List<PremiumRateValue> premiumRateValues;

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
     * Gets the value of the rateCardId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardId() {
        return rateCardId;
    }

    /**
     * Sets the value of the rateCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardId(Long value) {
        this.rateCardId = value;
    }

    /**
     * Gets the value of the pricingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PricingMethod }
     *     
     */
    public PricingMethod getPricingMethod() {
        return pricingMethod;
    }

    /**
     * Sets the value of the pricingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingMethod }
     *     
     */
    public void setPricingMethod(PricingMethod value) {
        this.pricingMethod = value;
    }

    /**
     * Gets the value of the premiumFeature property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumFeature }
     *     
     */
    public PremiumFeature getPremiumFeature() {
        return premiumFeature;
    }

    /**
     * Sets the value of the premiumFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumFeature }
     *     
     */
    public void setPremiumFeature(PremiumFeature value) {
        this.premiumFeature = value;
    }

    /**
     * Gets the value of the premiumRateValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumRateValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumRateValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiumRateValue }
     * 
     * 
     */
    public List<PremiumRateValue> getPremiumRateValues() {
        if (premiumRateValues == null) {
            premiumRateValues = new ArrayList<PremiumRateValue>();
        }
        return this.premiumRateValues;
    }

}
