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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Selector for getPendingInvitations method.
 *           
 * 
 * <p>Java class for PendingInvitationSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingInvitationSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerCustomerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="clientCustomerIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingInvitationSelector", propOrder = {
    "managerCustomerIds",
    "clientCustomerIds"
})
public class PendingInvitationSelector {

    @XmlElement(type = Long.class)
    protected List<Long> managerCustomerIds;
    @XmlElement(type = Long.class)
    protected List<Long> clientCustomerIds;

    /**
     * Gets the value of the managerCustomerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerCustomerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerCustomerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getManagerCustomerIds() {
        if (managerCustomerIds == null) {
            managerCustomerIds = new ArrayList<Long>();
        }
        return this.managerCustomerIds;
    }

    /**
     * Gets the value of the clientCustomerIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientCustomerIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientCustomerIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getClientCustomerIds() {
        if (clientCustomerIds == null) {
            clientCustomerIds = new ArrayList<Long>();
        }
        return this.clientCustomerIds;
    }

}
