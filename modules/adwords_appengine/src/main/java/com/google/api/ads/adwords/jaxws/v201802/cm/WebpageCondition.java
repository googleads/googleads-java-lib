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
 *             Logical expression for targeting webpages of an advertiser's website.
 *             
 *             <p>A condition is defined as {@code operand OP argument}
 *             where {@code operand} is one of the values enumerated in
 *             {@link WebpageConditionOperand}, and, based on this value,
 *             {@code OP} is either of {@code EQUALS} or {@code CONTAINS}.</p>
 *           
 * 
 * <p>Java class for WebpageCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebpageCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201802}WebpageConditionOperand" minOccurs="0"/>
 *         &lt;element name="argument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebpageCondition", propOrder = {
    "operand",
    "argument"
})
public class WebpageCondition {

    @XmlSchemaType(name = "string")
    protected WebpageConditionOperand operand;
    protected String argument;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link WebpageConditionOperand }
     *     
     */
    public WebpageConditionOperand getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebpageConditionOperand }
     *     
     */
    public void setOperand(WebpageConditionOperand value) {
        this.operand = value;
    }

    /**
     * Gets the value of the argument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgument() {
        return argument;
    }

    /**
     * Sets the value of the argument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgument(String value) {
        this.argument = value;
    }

}
