// Copyright 2024 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202402;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a prospective line item to be forecasted.
 *           
 * 
 * <p>Java class for ProspectiveLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProspectiveLineItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineItem" type="{https://www.google.com/apis/ads/publisher/v202402}LineItem" minOccurs="0"/&gt;
 *         &lt;element name="proposalLineItem" type="{https://www.google.com/apis/ads/publisher/v202402}ProposalLineItem" minOccurs="0"/&gt;
 *         &lt;element name="advertiserId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProspectiveLineItem", propOrder = {
    "lineItem",
    "proposalLineItem",
    "advertiserId"
})
public class ProspectiveLineItem {

    protected LineItem lineItem;
    protected ProposalLineItem proposalLineItem;
    protected Long advertiserId;

    /**
     * Gets the value of the lineItem property.
     * 
     * @return
     *     possible object is
     *     {@link LineItem }
     *     
     */
    public LineItem getLineItem() {
        return lineItem;
    }

    /**
     * Sets the value of the lineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItem }
     *     
     */
    public void setLineItem(LineItem value) {
        this.lineItem = value;
    }

    /**
     * Gets the value of the proposalLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalLineItem }
     *     
     */
    public ProposalLineItem getProposalLineItem() {
        return proposalLineItem;
    }

    /**
     * Sets the value of the proposalLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalLineItem }
     *     
     */
    public void setProposalLineItem(ProposalLineItem value) {
        this.proposalLineItem = value;
    }

    /**
     * Gets the value of the advertiserId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdvertiserId() {
        return advertiserId;
    }

    /**
     * Sets the value of the advertiserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdvertiserId(Long value) {
        this.advertiserId = value;
    }

}
