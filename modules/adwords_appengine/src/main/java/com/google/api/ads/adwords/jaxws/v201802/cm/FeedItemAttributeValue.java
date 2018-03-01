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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a feed item's value for a particular feed attribute. A feed item's value is
 *             composed of a collection of these attribute values.
 *           
 * 
 * <p>Java class for FeedItemAttributeValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemAttributeValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedAttributeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="integerValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="doubleValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="booleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="integerValues" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doubleValues" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="booleanValues" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stringValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="moneyWithCurrencyValue" type="{https://adwords.google.com/api/adwords/cm/v201802}MoneyWithCurrency" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemAttributeValue", propOrder = {
    "feedAttributeId",
    "integerValue",
    "doubleValue",
    "booleanValue",
    "stringValue",
    "integerValues",
    "doubleValues",
    "booleanValues",
    "stringValues",
    "moneyWithCurrencyValue"
})
public class FeedItemAttributeValue {

    protected Long feedAttributeId;
    protected Long integerValue;
    protected Double doubleValue;
    protected Boolean booleanValue;
    protected String stringValue;
    @XmlElement(type = Long.class)
    protected List<Long> integerValues;
    @XmlElement(type = Double.class)
    protected List<Double> doubleValues;
    @XmlElement(type = Boolean.class)
    protected List<Boolean> booleanValues;
    protected List<String> stringValues;
    protected MoneyWithCurrency moneyWithCurrencyValue;

    /**
     * Gets the value of the feedAttributeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedAttributeId() {
        return feedAttributeId;
    }

    /**
     * Sets the value of the feedAttributeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedAttributeId(Long value) {
        this.feedAttributeId = value;
    }

    /**
     * Gets the value of the integerValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIntegerValue() {
        return integerValue;
    }

    /**
     * Sets the value of the integerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIntegerValue(Long value) {
        this.integerValue = value;
    }

    /**
     * Gets the value of the doubleValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * Sets the value of the doubleValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleValue(Double value) {
        this.doubleValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the integerValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the integerValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntegerValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIntegerValues() {
        if (integerValues == null) {
            integerValues = new ArrayList<Long>();
        }
        return this.integerValues;
    }

    /**
     * Gets the value of the doubleValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doubleValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoubleValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getDoubleValues() {
        if (doubleValues == null) {
            doubleValues = new ArrayList<Double>();
        }
        return this.doubleValues;
    }

    /**
     * Gets the value of the booleanValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getBooleanValues() {
        if (booleanValues == null) {
            booleanValues = new ArrayList<Boolean>();
        }
        return this.booleanValues;
    }

    /**
     * Gets the value of the stringValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStringValues() {
        if (stringValues == null) {
            stringValues = new ArrayList<String>();
        }
        return this.stringValues;
    }

    /**
     * Gets the value of the moneyWithCurrencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public MoneyWithCurrency getMoneyWithCurrencyValue() {
        return moneyWithCurrencyValue;
    }

    /**
     * Sets the value of the moneyWithCurrencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyWithCurrency }
     *     
     */
    public void setMoneyWithCurrencyValue(MoneyWithCurrency value) {
        this.moneyWithCurrencyValue = value;
    }

}
