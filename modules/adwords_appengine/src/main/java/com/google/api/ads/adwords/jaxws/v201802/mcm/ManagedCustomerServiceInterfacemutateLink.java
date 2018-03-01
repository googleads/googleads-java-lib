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
 *             Modifies the ManagedCustomer forest. These actions are possible (categorized by
 *             Operator + Link Status):
 *             
 *             <ul>
 *             <li>ADD + PENDING:   manager extends invitations</li>
 *             <li>SET + CANCELLED: manager rescinds invitations</li>
 *             <li>SET + INACTIVE:  manager/client terminates links</li>
 *             <li>SET + ACTIVE:    client accepts invitations</li>
 *             <li>SET + REFUSED:   client declines invitations</li>
 *             </ul>
 *             
 *             In addition to these, active links can also be marked hidden / unhidden.
 *             <ul>
 *             <li> An ACTIVE link can be marked hidden with SET + ACTIVE along with setting the
 *             isHidden bit to true. </li>
 *             <li> An ACTIVE link can be marked unhidden with SET + ACTIVE along with setting the
 *             isHidden bit to false. </li>
 *             </ul>
 *             
 *             @param operations the list of operations
 *             @return results for the given operations
 *             @throws ApiException with a {@link ManagedCustomerServiceError}
 *           
 * 
 * <p>Java class for mutateLink element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateLink">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/mcm/v201802}LinkOperation" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlRootElement(name = "mutateLink")
public class ManagedCustomerServiceInterfacemutateLink {

    protected List<LinkOperation> operations;

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
     * {@link LinkOperation }
     * 
     * 
     */
    public List<LinkOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<LinkOperation>();
        }
        return this.operations;
    }

}
