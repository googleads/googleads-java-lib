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
 *             Marketplace info for {@link ProposalLineItem} with a corresponding deal in Marketplace.
 *           
 * 
 * <p>Java class for ProposalLineItemMarketplaceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalLineItemMarketplaceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adExchangeEnvironment" type="{https://www.google.com/apis/ads/publisher/v201802}AdExchangeEnvironment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalLineItemMarketplaceInfo", propOrder = {
    "adExchangeEnvironment"
})
public class ProposalLineItemMarketplaceInfo {

    @XmlSchemaType(name = "string")
    protected AdExchangeEnvironment adExchangeEnvironment;

    /**
     * Gets the value of the adExchangeEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link AdExchangeEnvironment }
     *     
     */
    public AdExchangeEnvironment getAdExchangeEnvironment() {
        return adExchangeEnvironment;
    }

    /**
     * Sets the value of the adExchangeEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExchangeEnvironment }
     *     
     */
    public void setAdExchangeEnvironment(AdExchangeEnvironment value) {
        this.adExchangeEnvironment = value;
    }

}
