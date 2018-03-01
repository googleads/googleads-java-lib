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
 *             An error indicating a problem with an ad customizer tag.
 *           
 * 
 * <p>Java class for AdCustomizerError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdCustomizerError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201802}AdCustomizerError.Reason" minOccurs="0"/>
 *         &lt;element name="functionString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operandIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="operandValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdCustomizerError", propOrder = {
    "reason",
    "functionString",
    "operatorName",
    "operandIndex",
    "operandValue"
})
public class AdCustomizerError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdCustomizerErrorReason reason;
    protected String functionString;
    protected String operatorName;
    protected Integer operandIndex;
    protected String operandValue;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdCustomizerErrorReason }
     *     
     */
    public AdCustomizerErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdCustomizerErrorReason }
     *     
     */
    public void setReason(AdCustomizerErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the functionString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionString() {
        return functionString;
    }

    /**
     * Sets the value of the functionString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionString(String value) {
        this.functionString = value;
    }

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Gets the value of the operandIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperandIndex() {
        return operandIndex;
    }

    /**
     * Sets the value of the operandIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperandIndex(Integer value) {
        this.operandIndex = value;
    }

    /**
     * Gets the value of the operandValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperandValue() {
        return operandValue;
    }

    /**
     * Sets the value of the operandValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperandValue(String value) {
        this.operandValue = value;
    }

}
