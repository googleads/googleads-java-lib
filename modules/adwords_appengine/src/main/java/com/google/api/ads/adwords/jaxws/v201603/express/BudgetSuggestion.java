// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201603.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201603.cm.Money;


/**
 * 
 *             A budget suggestion and its associated data (all are estimates).
 *           
 * 
 * <p>Java class for BudgetSuggestion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetSuggestion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpc" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="minCpc" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="maxCpc" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="cpm" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="suggestedBudget" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="minBudget" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="maxBudget" type="{https://adwords.google.com/api/adwords/cm/v201603}Money" minOccurs="0"/>
 *         &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{https://adwords.google.com/api/adwords/express/v201603}CurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetSuggestion", propOrder = {
    "cpc",
    "minCpc",
    "maxCpc",
    "cpm",
    "suggestedBudget",
    "minBudget",
    "maxBudget",
    "impressions",
    "currencyCode"
})
public class BudgetSuggestion {

    protected Money cpc;
    protected Money minCpc;
    protected Money maxCpc;
    protected Money cpm;
    protected Money suggestedBudget;
    protected Money minBudget;
    protected Money maxBudget;
    protected Long impressions;
    @XmlSchemaType(name = "string")
    protected CurrencyCode currencyCode;

    /**
     * Gets the value of the cpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCpc() {
        return cpc;
    }

    /**
     * Sets the value of the cpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCpc(Money value) {
        this.cpc = value;
    }

    /**
     * Gets the value of the minCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinCpc() {
        return minCpc;
    }

    /**
     * Sets the value of the minCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinCpc(Money value) {
        this.minCpc = value;
    }

    /**
     * Gets the value of the maxCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxCpc() {
        return maxCpc;
    }

    /**
     * Sets the value of the maxCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxCpc(Money value) {
        this.maxCpc = value;
    }

    /**
     * Gets the value of the cpm property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCpm() {
        return cpm;
    }

    /**
     * Sets the value of the cpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCpm(Money value) {
        this.cpm = value;
    }

    /**
     * Gets the value of the suggestedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSuggestedBudget() {
        return suggestedBudget;
    }

    /**
     * Sets the value of the suggestedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSuggestedBudget(Money value) {
        this.suggestedBudget = value;
    }

    /**
     * Gets the value of the minBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinBudget() {
        return minBudget;
    }

    /**
     * Sets the value of the minBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinBudget(Money value) {
        this.minBudget = value;
    }

    /**
     * Gets the value of the maxBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxBudget() {
        return maxBudget;
    }

    /**
     * Sets the value of the maxBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxBudget(Money value) {
        this.maxBudget = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCode }
     *     
     */
    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCode }
     *     
     */
    public void setCurrencyCode(CurrencyCode value) {
        this.currencyCode = value;
    }

}
