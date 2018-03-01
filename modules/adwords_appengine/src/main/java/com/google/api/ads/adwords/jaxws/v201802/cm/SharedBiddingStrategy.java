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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Bidding strategies store shared bidding configuration data and are account-level objects.
 *           
 * 
 * <p>Java class for SharedBiddingStrategy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedBiddingStrategy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="biddingScheme" type="{https://adwords.google.com/api/adwords/cm/v201802}BiddingScheme" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}SharedBiddingStrategy.BiddingStrategyStatus" minOccurs="0"/>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/cm/v201802}BiddingStrategyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedBiddingStrategy", propOrder = {
    "biddingScheme",
    "id",
    "name",
    "status",
    "type"
})
public class SharedBiddingStrategy {

    protected BiddingScheme biddingScheme;
    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected SharedBiddingStrategyBiddingStrategyStatus status;
    @XmlSchemaType(name = "string")
    protected BiddingStrategyType type;

    /**
     * Gets the value of the biddingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingScheme }
     *     
     */
    public BiddingScheme getBiddingScheme() {
        return biddingScheme;
    }

    /**
     * Sets the value of the biddingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingScheme }
     *     
     */
    public void setBiddingScheme(BiddingScheme value) {
        this.biddingScheme = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SharedBiddingStrategyBiddingStrategyStatus }
     *     
     */
    public SharedBiddingStrategyBiddingStrategyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedBiddingStrategyBiddingStrategyStatus }
     *     
     */
    public void setStatus(SharedBiddingStrategyBiddingStrategyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BiddingStrategyType }
     *     
     */
    public BiddingStrategyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiddingStrategyType }
     *     
     */
    public void setType(BiddingStrategyType value) {
        this.type = value;
    }

}
