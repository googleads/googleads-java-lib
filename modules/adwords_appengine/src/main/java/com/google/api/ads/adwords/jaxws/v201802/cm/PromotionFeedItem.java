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
 *             Represents a promotion extension.
 *           
 * 
 * <p>Java class for PromotionFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="promotionTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discountModifier" type="{https://adwords.google.com/api/adwords/cm/v201802}PromotionExtensionDiscountModifier" minOccurs="0"/>
 *         &lt;element name="percentOff" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="moneyAmountOff" type="{https://adwords.google.com/api/adwords/cm/v201802}MoneyWithCurrency" minOccurs="0"/>
 *         &lt;element name="promotionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordersOverAmount" type="{https://adwords.google.com/api/adwords/cm/v201802}MoneyWithCurrency" minOccurs="0"/>
 *         &lt;element name="promotionStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occasion" type="{https://adwords.google.com/api/adwords/cm/v201802}PromotionExtensionOccasion" minOccurs="0"/>
 *         &lt;element name="finalUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="finalMobileUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promotionUrlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201802}CustomParameters" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionFeedItem", propOrder = {
    "promotionTarget",
    "discountModifier",
    "percentOff",
    "moneyAmountOff",
    "promotionCode",
    "ordersOverAmount",
    "promotionStart",
    "promotionEnd",
    "occasion",
    "finalUrls",
    "finalMobileUrls",
    "trackingUrlTemplate",
    "promotionUrlCustomParameters",
    "language"
})
public class PromotionFeedItem
    extends ExtensionFeedItem
{

    protected String promotionTarget;
    @XmlSchemaType(name = "string")
    protected PromotionExtensionDiscountModifier discountModifier;
    protected Long percentOff;
    protected MoneyWithCurrency moneyAmountOff;
    protected String promotionCode;
    protected MoneyWithCurrency ordersOverAmount;
    protected String promotionStart;
    protected String promotionEnd;
    @XmlSchemaType(name = "string")
    protected PromotionExtensionOccasion occasion;
    protected UrlList finalUrls;
    protected UrlList finalMobileUrls;
    protected String trackingUrlTemplate;
    protected CustomParameters promotionUrlCustomParameters;
    protected String language;

    /**
     * Gets the value of the promotionTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionTarget() {
        return promotionTarget;
    }

    /**
     * Sets the value of the promotionTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionTarget(String value) {
        this.promotionTarget = value;
    }

    /**
     * Gets the value of the discountModifier property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionExtensionDiscountModifier }
     *     
     */
    public PromotionExtensionDiscountModifier getDiscountModifier() {
        return discountModifier;
    }

    /**
     * Sets the value of the discountModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionExtensionDiscountModifier }
     *     
     */
    public void setDiscountModifier(PromotionExtensionDiscountModifier value) {
        this.discountModifier = value;
    }

    /**
     * Gets the value of the percentOff property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPercentOff() {
        return percentOff;
    }

    /**
     * Sets the value of the percentOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPercentOff(Long value) {
        this.percentOff = value;
    }

    /**
     * Gets the value of the moneyAmountOff property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public MoneyWithCurrency getMoneyAmountOff() {
        return moneyAmountOff;
    }

    /**
     * Sets the value of the moneyAmountOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public void setMoneyAmountOff(MoneyWithCurrency value) {
        this.moneyAmountOff = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the ordersOverAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public MoneyWithCurrency getOrdersOverAmount() {
        return ordersOverAmount;
    }

    /**
     * Sets the value of the ordersOverAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public void setOrdersOverAmount(MoneyWithCurrency value) {
        this.ordersOverAmount = value;
    }

    /**
     * Gets the value of the promotionStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionStart() {
        return promotionStart;
    }

    /**
     * Sets the value of the promotionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionStart(String value) {
        this.promotionStart = value;
    }

    /**
     * Gets the value of the promotionEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionEnd() {
        return promotionEnd;
    }

    /**
     * Sets the value of the promotionEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionEnd(String value) {
        this.promotionEnd = value;
    }

    /**
     * Gets the value of the occasion property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionExtensionOccasion }
     *     
     */
    public PromotionExtensionOccasion getOccasion() {
        return occasion;
    }

    /**
     * Sets the value of the occasion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionExtensionOccasion }
     *     
     */
    public void setOccasion(PromotionExtensionOccasion value) {
        this.occasion = value;
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
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

    /**
     * Gets the value of the promotionUrlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getPromotionUrlCustomParameters() {
        return promotionUrlCustomParameters;
    }

    /**
     * Sets the value of the promotionUrlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setPromotionUrlCustomParameters(CustomParameters value) {
        this.promotionUrlCustomParameters = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
