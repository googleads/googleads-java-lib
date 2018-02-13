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
 *             Marketplace information for a programmatic {@link Product}.
 *           
 * 
 * <p>Java class for ProductMarketplaceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMarketplaceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adExchangeEnvironment" type="{https://www.google.com/apis/ads/publisher/v201802}AdExchangeEnvironment" minOccurs="0"/>
 *         &lt;element name="additionalTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalTermsSource" type="{https://www.google.com/apis/ads/publisher/v201802}ValueSourceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductMarketplaceInfo", propOrder = {
    "adExchangeEnvironment",
    "additionalTerms",
    "additionalTermsSource"
})
public class ProductMarketplaceInfo {

    @XmlSchemaType(name = "string")
    protected AdExchangeEnvironment adExchangeEnvironment;
    protected String additionalTerms;
    @XmlSchemaType(name = "string")
    protected ValueSourceType additionalTermsSource;

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

    /**
     * Gets the value of the additionalTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTerms() {
        return additionalTerms;
    }

    /**
     * Sets the value of the additionalTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTerms(String value) {
        this.additionalTerms = value;
    }

    /**
     * Gets the value of the additionalTermsSource property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSourceType }
     *     
     */
    public ValueSourceType getAdditionalTermsSource() {
        return additionalTermsSource;
    }

    /**
     * Sets the value of the additionalTermsSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSourceType }
     *     
     */
    public void setAdditionalTermsSource(ValueSourceType value) {
        this.additionalTermsSource = value;
    }

}
