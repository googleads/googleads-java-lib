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
 *             This operand specifies the income bracket a household falls under.
 *           
 * 
 * <p>Java class for IncomeOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomeOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="tier" type="{https://adwords.google.com/api/adwords/cm/v201802}IncomeTier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeOperand", propOrder = {
    "tier"
})
public class IncomeOperand
    extends FunctionArgumentOperand
{

    @XmlSchemaType(name = "string")
    protected IncomeTier tier;

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeTier }
     *     
     */
    public IncomeTier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeTier }
     *     
     */
    public void setTier(IncomeTier value) {
        this.tier = value;
    }

}
