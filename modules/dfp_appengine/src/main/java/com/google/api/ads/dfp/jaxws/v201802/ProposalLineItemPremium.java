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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the status of a triggered {@link PremiumRateValue} (formerly
 *             referred to as a {@code RateCardCustomization}).
 *           
 * 
 * <p>Java class for ProposalLineItemPremium complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemPremium">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="premiumRateValue" type="{https://www.google.com/apis/ads/publisher/v201802}PremiumRateValue" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201802}ProposalLineItemPremiumStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemPremium", propOrder = {
    "premiumRateValue",
    "status"
})
public class ProposalLineItemPremium {

    protected PremiumRateValue premiumRateValue;
    @XmlSchemaType(name = "string")
    protected ProposalLineItemPremiumStatus status;

    /**
     * Gets the value of the premiumRateValue property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumRateValue }
     *     
     */
    public PremiumRateValue getPremiumRateValue() {
        return premiumRateValue;
    }

    /**
     * Sets the value of the premiumRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumRateValue }
     *     
     */
    public void setPremiumRateValue(PremiumRateValue value) {
        this.premiumRateValue = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItemPremiumStatus }
     *     
     */
    public ProposalLineItemPremiumStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItemPremiumStatus }
     *     
     */
    public void setStatus(ProposalLineItemPremiumStatus value) {
        this.status = value;
    }

}
