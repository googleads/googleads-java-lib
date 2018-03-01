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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the pending invitations for the customer IDs in the selector.
 *             @param selector the manager customer ids (inviters) or the client customer ids (invitees)
 *             @throws ApiException when there is at least one error with the request
 *           
 * 
 * <p>Java class for getPendingInvitations element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getPendingInvitations">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="selector" type="{https://adwords.google.com/api/adwords/mcm/v201802}PendingInvitationSelector" minOccurs="0"/>
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
    "selector"
})
@XmlRootElement(name = "getPendingInvitations")
public class ManagedCustomerServiceInterfacegetPendingInvitations {

    protected PendingInvitationSelector selector;

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link PendingInvitationSelector }
     *     
     */
    public PendingInvitationSelector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingInvitationSelector }
     *     
     */
    public void setSelector(PendingInvitationSelector value) {
        this.selector = value;
    }

}
