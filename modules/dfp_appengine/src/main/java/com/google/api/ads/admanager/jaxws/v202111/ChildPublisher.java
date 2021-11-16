// Copyright 2021 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202111;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ChildPublisher} represents a network being managed as part of Multiple Customer
 *             Management.
 *           
 * 
 * <p>Java class for ChildPublisher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildPublisher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvedDelegationType" type="{https://www.google.com/apis/ads/publisher/v202111}DelegationType" minOccurs="0"/>
 *         &lt;element name="proposedDelegationType" type="{https://www.google.com/apis/ads/publisher/v202111}DelegationType" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v202111}DelegationStatus" minOccurs="0"/>
 *         &lt;element name="accountStatus" type="{https://www.google.com/apis/ads/publisher/v202111}AccountStatus" minOccurs="0"/>
 *         &lt;element name="childNetworkCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proposedRevenueShareMillipercent" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildPublisher", propOrder = {
    "approvedDelegationType",
    "proposedDelegationType",
    "status",
    "accountStatus",
    "childNetworkCode",
    "proposedRevenueShareMillipercent"
})
public class ChildPublisher {

    @XmlSchemaType(name = "string")
    protected DelegationType approvedDelegationType;
    @XmlSchemaType(name = "string")
    protected DelegationType proposedDelegationType;
    @XmlSchemaType(name = "string")
    protected DelegationStatus status;
    @XmlSchemaType(name = "string")
    protected AccountStatus accountStatus;
    protected String childNetworkCode;
    protected Long proposedRevenueShareMillipercent;

    /**
     * Gets the value of the approvedDelegationType property.
     * 
     * @return
     *     possible object is
     *     {@link DelegationType }
     *     
     */
    public DelegationType getApprovedDelegationType() {
        return approvedDelegationType;
    }

    /**
     * Sets the value of the approvedDelegationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegationType }
     *     
     */
    public void setApprovedDelegationType(DelegationType value) {
        this.approvedDelegationType = value;
    }

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DelegationStatus }
     *     
     */
    public DelegationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegationStatus }
     *     
     */
    public void setStatus(DelegationStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus }
     *     
     */
    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus }
     *     
     */
    public void setAccountStatus(AccountStatus value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the childNetworkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildNetworkCode() {
        return childNetworkCode;
    }

    /**
     * Sets the value of the childNetworkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildNetworkCode(String value) {
        this.childNetworkCode = value;
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

}
