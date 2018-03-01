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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Adds {@linkplain AccountLabel}s to, and removes
 *             {@linkplain AccountLabel}s from, {@linkplain ManagedCustomer}s.
 *             
 *             <p>To add an {@linkplain AccountLabel} to a {@linkplain ManagedCustomer},
 *             use {@link Operator#ADD}.
 *             To remove an {@linkplain AccountLabel} from a {@linkplain ManagedCustomer},
 *             use {@link Operator#REMOVE}.</p>
 *             <p>The label must already exist (see {@link AccountLabelService#mutate} for
 *             how to create them) and be owned by the authenticated user.</p>
 *             <p>The {@linkplain ManagedCustomer} must already exist and be managed by
 *             the customer making the request (either directly or indirectly).</p>
 *             <p>An AccountLabel may be applied to at most 1000 customers.</p>
 *             <p>This method does not support partial failures, and will fail if any
 *             operation is invalid.</p>
 *           
 * 
 * <p>Java class for mutateLabel element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateLabel">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/mcm/v201802}ManagedCustomerLabelOperation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "operations"
})
@XmlRootElement(name = "mutateLabel")
public class ManagedCustomerServiceInterfacemutateLabel {

    protected List<ManagedCustomerLabelOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagedCustomerLabelOperation }
     * 
     * 
     */
    public List<ManagedCustomerLabelOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<ManagedCustomerLabelOperation>();
        }
        return this.operations;
    }

}
