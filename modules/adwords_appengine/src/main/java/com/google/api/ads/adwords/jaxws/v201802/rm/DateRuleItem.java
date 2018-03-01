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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An atomic rule fragment composing of date operation.
 *           
 * 
 * <p>Java class for DateRuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateRuleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/rm/v201802}DateKey" minOccurs="0"/>
 *         &lt;element name="op" type="{https://adwords.google.com/api/adwords/rm/v201802}DateRuleItem.DateOperator" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relativeValue" type="{https://adwords.google.com/api/adwords/rm/v201802}RelativeDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateRuleItem", propOrder = {
    "key",
    "op",
    "value",
    "relativeValue"
})
public class DateRuleItem {

    protected DateKey key;
    @XmlSchemaType(name = "string")
    protected DateRuleItemDateOperator op;
    protected String value;
    protected RelativeDate relativeValue;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link DateKey }
     *     
     */
    public DateKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateKey }
     *     
     */
    public void setKey(DateKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link DateRuleItemDateOperator }
     *     
     */
    public DateRuleItemDateOperator getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRuleItemDateOperator }
     *     
     */
    public void setOp(DateRuleItemDateOperator value) {
        this.op = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the relativeValue property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDate }
     *     
     */
    public RelativeDate getRelativeValue() {
        return relativeValue;
    }

    /**
     * Sets the value of the relativeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDate }
     *     
     */
    public void setRelativeValue(RelativeDate value) {
        this.relativeValue = value;
    }

}
