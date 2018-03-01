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
 *             Setting for shopping campaigns. Defines the universe of products covered by the campaign.
 *             Encapsulates a merchant ID, sales country, and campaign priority.
 *           
 * 
 * <p>Java class for ShoppingSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Setting">
 *       &lt;sequence>
 *         &lt;element name="merchantId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="salesCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignPriority" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="enableLocal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="purchasePlatform" type="{https://adwords.google.com/api/adwords/cm/v201802}ShoppingPurchasePlatform" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingSetting", propOrder = {
    "merchantId",
    "salesCountry",
    "campaignPriority",
    "enableLocal",
    "purchasePlatform"
})
public class ShoppingSetting
    extends Setting
{

    protected Long merchantId;
    protected String salesCountry;
    protected Integer campaignPriority;
    protected Boolean enableLocal;
    @XmlSchemaType(name = "string")
    protected ShoppingPurchasePlatform purchasePlatform;

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMerchantId(Long value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the salesCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesCountry() {
        return salesCountry;
    }

    /**
     * Sets the value of the salesCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesCountry(String value) {
        this.salesCountry = value;
    }

    /**
     * Gets the value of the campaignPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignPriority() {
        return campaignPriority;
    }

    /**
     * Sets the value of the campaignPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignPriority(Integer value) {
        this.campaignPriority = value;
    }

    /**
     * Gets the value of the enableLocal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableLocal() {
        return enableLocal;
    }

    /**
     * Sets the value of the enableLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableLocal(Boolean value) {
        this.enableLocal = value;
    }

    /**
     * Gets the value of the purchasePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingPurchasePlatform }
     *     
     */
    public ShoppingPurchasePlatform getPurchasePlatform() {
        return purchasePlatform;
    }

    /**
     * Sets the value of the purchasePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingPurchasePlatform }
     *     
     */
    public void setPurchasePlatform(ShoppingPurchasePlatform value) {
        this.purchasePlatform = value;
    }

}
