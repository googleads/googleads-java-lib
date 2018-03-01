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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             CustomerFeeds are used to link a feed to the customer using a matching function,
 *             making the feed's feed items available in the customer's ads for substitution.
 *           
 * 
 * <p>Java class for CustomerFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerFeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchingFunction" type="{https://adwords.google.com/api/adwords/cm/v201802}Function" minOccurs="0"/>
 *         &lt;element name="placeholderTypes" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201802}CustomerFeed.Status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerFeed", propOrder = {
    "feedId",
    "matchingFunction",
    "placeholderTypes",
    "status"
})
public class CustomerFeed {

    protected Long feedId;
    protected Function matchingFunction;
    @XmlElement(type = Integer.class)
    protected List<Integer> placeholderTypes;
    @XmlSchemaType(name = "string")
    protected CustomerFeedStatus status;

    /**
     * Gets the value of the feedId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedId() {
        return feedId;
    }

    /**
     * Sets the value of the feedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedId(Long value) {
        this.feedId = value;
    }

    /**
     * Gets the value of the matchingFunction property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getMatchingFunction() {
        return matchingFunction;
    }

    /**
     * Sets the value of the matchingFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setMatchingFunction(Function value) {
        this.matchingFunction = value;
    }

    /**
     * Gets the value of the placeholderTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeholderTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceholderTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPlaceholderTypes() {
        if (placeholderTypes == null) {
            placeholderTypes = new ArrayList<Integer>();
        }
        return this.placeholderTypes;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerFeedStatus }
     *     
     */
    public CustomerFeedStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerFeedStatus }
     *     
     */
    public void setStatus(CustomerFeedStatus value) {
        this.status = value;
    }

}
