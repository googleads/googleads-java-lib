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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Comparable types for constructing ranges with.
 *           
 * 
 * <p>Java class for ComparableValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComparableValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComparableValue.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComparableValue", propOrder = {
    "comparableValueType"
})
@XmlSeeAlso({
    com.google.api.ads.adwords.jaxws.v201802.rm.MoneyWithCurrency.class,
    Money.class,
    NumberValue.class,
    com.google.api.ads.adwords.jaxws.v201802.cm.MoneyWithCurrency.class
})
public abstract class ComparableValue {

    @XmlElement(name = "ComparableValue.Type")
    protected String comparableValueType;

    /**
     * Gets the value of the comparableValueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparableValueType() {
        return comparableValueType;
    }

    /**
     * Sets the value of the comparableValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparableValueType(String value) {
        this.comparableValueType = value;
    }

}
