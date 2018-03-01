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


/**
 * 
 *             Represents an AdWords manager-client link.
 *           
 * 
 * <p>Java class for ManagedCustomerLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managerCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkStatus" type="{https://adwords.google.com/api/adwords/mcm/v201802}LinkStatus" minOccurs="0"/>
 *         &lt;element name="pendingDescriptiveName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerLink", propOrder = {
    "managerCustomerId",
    "clientCustomerId",
    "linkStatus",
    "pendingDescriptiveName",
    "isHidden"
})
public class ManagedCustomerLink {

    protected Long managerCustomerId;
    protected Long clientCustomerId;
    @XmlSchemaType(name = "string")
    protected LinkStatus linkStatus;
    protected String pendingDescriptiveName;
    protected Boolean isHidden;

    /**
     * Gets the value of the managerCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManagerCustomerId() {
        return managerCustomerId;
    }

    /**
     * Sets the value of the managerCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManagerCustomerId(Long value) {
        this.managerCustomerId = value;
    }

    /**
     * Gets the value of the clientCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientCustomerId() {
        return clientCustomerId;
    }

    /**
     * Sets the value of the clientCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientCustomerId(Long value) {
        this.clientCustomerId = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LinkStatus }
     *     
     */
    public LinkStatus getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkStatus }
     *     
     */
    public void setLinkStatus(LinkStatus value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the pendingDescriptiveName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingDescriptiveName() {
        return pendingDescriptiveName;
    }

    /**
     * Sets the value of the pendingDescriptiveName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingDescriptiveName(String value) {
        this.pendingDescriptiveName = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

}
