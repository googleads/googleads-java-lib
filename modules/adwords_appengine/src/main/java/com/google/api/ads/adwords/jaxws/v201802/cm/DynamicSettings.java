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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents Dynamic Settings.
 *           
 * 
 * <p>Java class for DynamicSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="landscapeLogoImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="pricePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicSettings", propOrder = {
    "landscapeLogoImage",
    "pricePrefix",
    "promoText"
})
public class DynamicSettings {

    protected Image landscapeLogoImage;
    protected String pricePrefix;
    protected String promoText;

    /**
     * Gets the value of the landscapeLogoImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLandscapeLogoImage() {
        return landscapeLogoImage;
    }

    /**
     * Sets the value of the landscapeLogoImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLandscapeLogoImage(Image value) {
        this.landscapeLogoImage = value;
    }

    /**
     * Gets the value of the pricePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePrefix() {
        return pricePrefix;
    }

    /**
     * Sets the value of the pricePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePrefix(String value) {
        this.pricePrefix = value;
    }

    /**
     * Gets the value of the promoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoText() {
        return promoText;
    }

    /**
     * Sets the value of the promoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoText(String value) {
        this.promoText = value;
    }

}
