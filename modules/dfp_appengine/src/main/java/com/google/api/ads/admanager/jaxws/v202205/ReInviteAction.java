// Copyright 2022 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202205;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used by the parent network to send a new invitation with a potentially updated
 *             proposal to a rejected or withdrawn child publisher.
 *           
 * 
 * <p>Java class for ReInviteAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReInviteAction">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202205}CompanyAction">
 *       &lt;sequence>
 *         &lt;element name="proposedDelegationType" type="{https://www.google.com/apis/ads/publisher/v202205}DelegationType" minOccurs="0"/>
 *         &lt;element name="proposedRevenueShareMillipercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposedEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReInviteAction", propOrder = {
    "proposedDelegationType",
    "proposedRevenueShareMillipercent",
    "proposedEmail"
})
public class ReInviteAction
    extends CompanyAction
{

    @XmlSchemaType(name = "string")
    protected DelegationType proposedDelegationType;
    protected Long proposedRevenueShareMillipercent;
    protected String proposedEmail;

    /**
     * Gets the value of the proposedDelegationType property.
     * 
     * @return
     *     possible object is
     *     {@link DelegationType }
     *     
     */
    public DelegationType getProposedDelegationType() {
        return proposedDelegationType;
    }

    /**
     * Sets the value of the proposedDelegationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegationType }
     *     
     */
    public void setProposedDelegationType(DelegationType value) {
        this.proposedDelegationType = value;
    }

    /**
     * Gets the value of the proposedRevenueShareMillipercent property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposedRevenueShareMillipercent() {
        return proposedRevenueShareMillipercent;
    }

    /**
     * Sets the value of the proposedRevenueShareMillipercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposedRevenueShareMillipercent(Long value) {
        this.proposedRevenueShareMillipercent = value;
    }

    /**
     * Gets the value of the proposedEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedEmail() {
        return proposedEmail;
    }

    /**
     * Sets the value of the proposedEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedEmail(String value) {
        this.proposedEmail = value;
    }

}
