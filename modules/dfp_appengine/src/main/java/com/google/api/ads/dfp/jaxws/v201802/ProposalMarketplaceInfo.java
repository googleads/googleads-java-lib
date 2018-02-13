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


package com.google.api.ads.dfp.jaxws.v201802;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Marketplace info for a proposal with a corresponding order in Marketplace.
 *           
 * 
 * <p>Java class for ProposalMarketplaceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalMarketplaceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasLocalVersionEdits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="negotiationStatus" type="{https://www.google.com/apis/ads/publisher/v201802}NegotiationStatus" minOccurs="0"/>
 *         &lt;element name="marketplaceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isNewVersionFromBuyer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buyerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalMarketplaceInfo", propOrder = {
    "hasLocalVersionEdits",
    "negotiationStatus",
    "marketplaceComment",
    "isNewVersionFromBuyer",
    "buyerAccountId"
})
public class ProposalMarketplaceInfo {

    protected Boolean hasLocalVersionEdits;
    @XmlSchemaType(name = "string")
    protected NegotiationStatus negotiationStatus;
    protected String marketplaceComment;
    protected Boolean isNewVersionFromBuyer;
    protected Long buyerAccountId;

    /**
     * Gets the value of the hasLocalVersionEdits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLocalVersionEdits() {
        return hasLocalVersionEdits;
    }

    /**
     * Sets the value of the hasLocalVersionEdits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLocalVersionEdits(Boolean value) {
        this.hasLocalVersionEdits = value;
    }

    /**
     * Gets the value of the negotiationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NegotiationStatus }
     *     
     */
    public NegotiationStatus getNegotiationStatus() {
        return negotiationStatus;
    }

    /**
     * Sets the value of the negotiationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NegotiationStatus }
     *     
     */
    public void setNegotiationStatus(NegotiationStatus value) {
        this.negotiationStatus = value;
    }

    /**
     * Gets the value of the marketplaceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceComment() {
        return marketplaceComment;
    }

    /**
     * Sets the value of the marketplaceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceComment(String value) {
        this.marketplaceComment = value;
    }

    /**
     * Gets the value of the isNewVersionFromBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNewVersionFromBuyer() {
        return isNewVersionFromBuyer;
    }

    /**
     * Sets the value of the isNewVersionFromBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNewVersionFromBuyer(Boolean value) {
        this.isNewVersionFromBuyer = value;
    }

    /**
     * Gets the value of the buyerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBuyerAccountId() {
        return buyerAccountId;
    }

    /**
     * Sets the value of the buyerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBuyerAccountId(Long value) {
        this.buyerAccountId = value;
    }

}
