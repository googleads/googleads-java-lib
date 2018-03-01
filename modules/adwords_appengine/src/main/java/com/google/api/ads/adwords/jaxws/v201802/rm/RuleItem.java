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


package com.google.api.ads.adwords.jaxws.v201802.rm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An atomic rule fragment.
 *           
 * 
 * <p>Java class for RuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DateRuleItem" type="{https://adwords.google.com/api/adwords/rm/v201802}DateRuleItem"/>
 *         &lt;element name="NumberRuleItem" type="{https://adwords.google.com/api/adwords/rm/v201802}NumberRuleItem"/>
 *         &lt;element name="StringRuleItem" type="{https://adwords.google.com/api/adwords/rm/v201802}StringRuleItem"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleItem", propOrder = {
    "dateRuleItem",
    "numberRuleItem",
    "stringRuleItem"
})
public class RuleItem {

    @XmlElement(name = "DateRuleItem")
    protected DateRuleItem dateRuleItem;
    @XmlElement(name = "NumberRuleItem")
    protected NumberRuleItem numberRuleItem;
    @XmlElement(name = "StringRuleItem")
    protected StringRuleItem stringRuleItem;

    /**
     * Gets the value of the dateRuleItem property.
     * 
     * @return
     *     possible object is
     *     {@link DateRuleItem }
     *     
     */
    public DateRuleItem getDateRuleItem() {
        return dateRuleItem;
    }

    /**
     * Sets the value of the dateRuleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRuleItem }
     *     
     */
    public void setDateRuleItem(DateRuleItem value) {
        this.dateRuleItem = value;
    }

    /**
     * Gets the value of the numberRuleItem property.
     * 
     * @return
     *     possible object is
     *     {@link NumberRuleItem }
     *     
     */
    public NumberRuleItem getNumberRuleItem() {
        return numberRuleItem;
    }

    /**
     * Sets the value of the numberRuleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberRuleItem }
     *     
     */
    public void setNumberRuleItem(NumberRuleItem value) {
        this.numberRuleItem = value;
    }

    /**
     * Gets the value of the stringRuleItem property.
     * 
     * @return
     *     possible object is
     *     {@link StringRuleItem }
     *     
     */
    public StringRuleItem getStringRuleItem() {
        return stringRuleItem;
    }

    /**
     * Sets the value of the stringRuleItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringRuleItem }
     *     
     */
    public void setStringRuleItem(StringRuleItem value) {
        this.stringRuleItem = value;
    }

}
