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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Operation;


/**
 * 
 *             Operation for moving ManagedCustomer links. See {@link ManagedCustomerService#mutateManager}.
 *           
 * 
 * <p>Java class for MoveOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201802}ManagedCustomerLink" minOccurs="0"/>
 *         &lt;element name="oldManagerCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOperation", propOrder = {
    "operand",
    "oldManagerCustomerId"
})
public class MoveOperation
    extends Operation
{

    protected ManagedCustomerLink operand;
    protected Long oldManagerCustomerId;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomerLink }
     *     
     */
    public ManagedCustomerLink getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomerLink }
     *     
     */
    public void setOperand(ManagedCustomerLink value) {
        this.operand = value;
    }

    /**
     * Gets the value of the oldManagerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOldManagerCustomerId() {
        return oldManagerCustomerId;
    }

    /**
     * Sets the value of the oldManagerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOldManagerCustomerId(Long value) {
        this.oldManagerCustomerId = value;
    }

}
