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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201802.cm.Operation;


/**
 * 
 *             An operation to create or modify a managed customer.
 *             
 *             <p><b>Note:</b> The {@code REMOVE} operator is not supported.
 *           
 * 
 * <p>Java class for ManagedCustomerOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201802}ManagedCustomer" minOccurs="0"/>
 *         &lt;element name="inviteeEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviteeRole" type="{https://adwords.google.com/api/adwords/mcm/v201802}AccessRole" minOccurs="0"/>
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
    "operand",
    "inviteeEmail",
    "inviteeRole"
})
public class ManagedCustomerOperation
    extends Operation
{

    protected ManagedCustomer operand;
    protected String inviteeEmail;
    @XmlSchemaType(name = "string")
    protected AccessRole inviteeRole;

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

    /**
     * Gets the value of the inviteeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteeEmail() {
        return inviteeEmail;
    }

    /**
     * Sets the value of the inviteeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteeEmail(String value) {
        this.inviteeEmail = value;
    }

    /**
     * Gets the value of the inviteeRole property.
     * 
     * @return
     *     possible object is
     *     {@link AccessRole }
     *     
     */
    public AccessRole getInviteeRole() {
        return inviteeRole;
    }

    /**
     * Sets the value of the inviteeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessRole }
     *     
     */
    public void setInviteeRole(AccessRole value) {
        this.inviteeRole = value;
    }

}
