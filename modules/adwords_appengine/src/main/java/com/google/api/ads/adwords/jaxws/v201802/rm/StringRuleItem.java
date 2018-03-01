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
 *             An atomic rule fragment composing of string operation.
 *           
 * 
 * <p>Java class for StringRuleItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringRuleItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/rm/v201802}StringKey" minOccurs="0"/>
 *         &lt;element name="op" type="{https://adwords.google.com/api/adwords/rm/v201802}StringRuleItem.StringOperator" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringRuleItem", propOrder = {
    "key",
    "op",
    "value"
})
public class StringRuleItem {

    protected StringKey key;
    @XmlSchemaType(name = "string")
    protected StringRuleItemStringOperator op;
    protected String value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link StringKey }
     *     
     */
    public StringKey getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringKey }
     *     
     */
    public void setKey(StringKey value) {
        this.key = value;
    }

    /**
     * Gets the value of the op property.
     * 
     * @return
     *     possible object is
     *     {@link StringRuleItemStringOperator }
     *     
     */
    public StringRuleItemStringOperator getOp() {
        return op;
    }

    /**
     * Sets the value of the op property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringRuleItemStringOperator }
     *     
     */
    public void setOp(StringRuleItemStringOperator value) {
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

}
