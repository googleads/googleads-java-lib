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
 *             A constant operand in a matching function.
 *           
 * 
 * <p>Java class for ConstantOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstantOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201802}ConstantOperand.ConstantType" minOccurs="0"/>
 *         &lt;element name="unit" type="{https://adwords.google.com/api/adwords/cm/v201802}ConstantOperand.Unit" minOccurs="0"/>
 *         &lt;element name="longValue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="booleanValue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="doubleValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="stringValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstantOperand", propOrder = {
    "type",
    "unit",
    "longValue",
    "booleanValue",
    "doubleValue",
    "stringValue"
})
public class ConstantOperand
    extends FunctionArgumentOperand
{

    @XmlSchemaType(name = "string")
    protected ConstantOperandConstantType type;
    @XmlSchemaType(name = "string")
    protected ConstantOperandUnit unit;
    protected Long longValue;
    protected Boolean booleanValue;
    protected Double doubleValue;
    protected String stringValue;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantOperandConstantType }
     *     
     */
    public ConstantOperandConstantType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantOperandConstantType }
     *     
     */
    public void setType(ConstantOperandConstantType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantOperandUnit }
     *     
     */
    public ConstantOperandUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantOperandUnit }
     *     
     */
    public void setUnit(ConstantOperandUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the longValue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLongValue() {
        return longValue;
    }

    /**
     * Sets the value of the longValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLongValue(Long value) {
        this.longValue = value;
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

}
