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


package com.google.api.ads.adwords.jaxws.v201605.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201605.cm.Operation;


/**
 * 
 *             An operation to create or modify a managed customer.
 *             <p class="note"><b>Note:</b>
 *             <li><code>ADD</code> operator is supported in all API versions.</li>
 *             <li><code>SET</code> operator is supported beginning with v201601.</li>
 *             <li><code>REMOVE</code> operator is not supported.</li>
 *             </p>
 *           
 * 
 * <p>Java class for ManagedCustomerOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201605}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201605}ManagedCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerOperation", propOrder = {
    "operand"
})
public class ManagedCustomerOperation
    extends Operation
{

    protected ManagedCustomer operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomer }
     *     
     */
    public ManagedCustomer getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomer }
     *     
     */
    public void setOperand(ManagedCustomer value) {
        this.operand = value;
    }

}
