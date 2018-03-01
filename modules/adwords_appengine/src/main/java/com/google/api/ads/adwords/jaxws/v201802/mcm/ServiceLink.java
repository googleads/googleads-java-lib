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
 *             A data-sharing connection between an AdWords customer and another Google service.
 *           
 * 
 * <p>Java class for ServiceLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceType" type="{https://adwords.google.com/api/adwords/mcm/v201802}ServiceType" minOccurs="0"/>
 *         &lt;element name="serviceLinkId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="linkStatus" type="{https://adwords.google.com/api/adwords/mcm/v201802}ServiceLink.LinkStatus" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLink", propOrder = {
    "serviceType",
    "serviceLinkId",
    "linkStatus",
    "name"
})
public class ServiceLink {

    @XmlSchemaType(name = "string")
    protected ServiceType serviceType;
    protected Long serviceLinkId;
    @XmlSchemaType(name = "string")
    protected ServiceLinkLinkStatus linkStatus;
    protected String name;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setServiceType(ServiceType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the serviceLinkId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServiceLinkId() {
        return serviceLinkId;
    }

    /**
     * Sets the value of the serviceLinkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServiceLinkId(Long value) {
        this.serviceLinkId = value;
    }

    /**
     * Gets the value of the linkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLinkLinkStatus }
     *     
     */
    public ServiceLinkLinkStatus getLinkStatus() {
        return linkStatus;
    }

    /**
     * Sets the value of the linkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLinkLinkStatus }
     *     
     */
    public void setLinkStatus(ServiceLinkLinkStatus value) {
        this.linkStatus = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
