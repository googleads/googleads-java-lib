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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents one row in a price extension.
 *           
 * 
 * <p>Java class for PriceTableRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceTableRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="finalMobileUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="price" type="{https://adwords.google.com/api/adwords/cm/v201802}MoneyWithCurrency" minOccurs="0"/>
 *         &lt;element name="priceUnit" type="{https://adwords.google.com/api/adwords/cm/v201802}PriceExtensionPriceUnit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceTableRow", propOrder = {
    "header",
    "description",
    "finalUrls",
    "finalMobileUrls",
    "price",
    "priceUnit"
})
public class PriceTableRow {

    protected String header;
    protected String description;
    protected UrlList finalUrls;
    protected UrlList finalMobileUrls;
    protected MoneyWithCurrency price;
    @XmlSchemaType(name = "string")
    protected PriceExtensionPriceUnit priceUnit;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the finalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the value of the finalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setFinalUrls(UrlList value) {
        this.finalUrls = value;
    }

    /**
     * Gets the value of the finalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the value of the finalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setFinalMobileUrls(UrlList value) {
        this.finalMobileUrls = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public MoneyWithCurrency getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public void setPrice(MoneyWithCurrency value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link PriceExtensionPriceUnit }
     *     
     */
    public PriceExtensionPriceUnit getPriceUnit() {
        return priceUnit;
    }

    /**
     * Sets the value of the priceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceExtensionPriceUnit }
     *     
     */
    public void setPriceUnit(PriceExtensionPriceUnit value) {
        this.priceUnit = value;
    }

}
