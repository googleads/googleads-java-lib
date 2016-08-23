// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.adwords.jaxws.v201607.express;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201607.cm.Criterion;
import com.google.api.ads.adwords.jaxws.v201607.cm.Money;


/**
 * 
 *             A promotion for a business. It contains all the user specified data as needed by AdWords Express
 *             to generate AdWords campaigns.
 *           
 * 
 * <p>Java class for Promotion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promotion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/express/v201607}Promotion.Status" minOccurs="0"/>
 *         &lt;element name="creatives" type="{https://adwords.google.com/api/adwords/express/v201607}Creative" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{https://adwords.google.com/api/adwords/express/v201607}PhoneNumber" minOccurs="0"/>
 *         &lt;element name="streetAddressVisible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callTrackingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="budget" type="{https://adwords.google.com/api/adwords/cm/v201607}Money" minOccurs="0"/>
 *         &lt;element name="criteria" type="{https://adwords.google.com/api/adwords/cm/v201607}Criterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campaignIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remainingBudget" type="{https://adwords.google.com/api/adwords/cm/v201607}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promotion", propOrder = {
    "id",
    "name",
    "status",
    "creatives",
    "destinationUrl",
    "phoneNumber",
    "streetAddressVisible",
    "callTrackingEnabled",
    "budget",
    "criteria",
    "campaignIds",
    "remainingBudget"
})
public class Promotion {

    protected Long id;
    protected String name;
    @XmlSchemaType(name = "string")
    protected PromotionStatus status;
    protected List<Creative> creatives;
    protected String destinationUrl;
    protected PhoneNumber phoneNumber;
    protected Boolean streetAddressVisible;
    protected Boolean callTrackingEnabled;
    protected Money budget;
    protected List<Criterion> criteria;
    @XmlElement(type = Long.class)
    protected List<Long> campaignIds;
    protected Money remainingBudget;

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
     *     {@link PromotionStatus }
     *     
     */
    public PromotionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionStatus }
     *     
     */
    public void setStatus(PromotionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the creatives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creatives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Creative }
     * 
     * 
     */
    public List<Creative> getCreatives() {
        if (creatives == null) {
            creatives = new ArrayList<Creative>();
        }
        return this.creatives;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumber }
     *     
     */
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumber }
     *     
     */
    public void setPhoneNumber(PhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the streetAddressVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreetAddressVisible() {
        return streetAddressVisible;
    }

    /**
     * Sets the value of the streetAddressVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreetAddressVisible(Boolean value) {
        this.streetAddressVisible = value;
    }

    /**
     * Gets the value of the callTrackingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCallTrackingEnabled() {
        return callTrackingEnabled;
    }

    /**
     * Sets the value of the callTrackingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCallTrackingEnabled(Boolean value) {
        this.callTrackingEnabled = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBudget(Money value) {
        this.budget = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Criterion }
     * 
     * 
     */
    public List<Criterion> getCriteria() {
        if (criteria == null) {
            criteria = new ArrayList<Criterion>();
        }
        return this.criteria;
    }

    /**
     * Gets the value of the campaignIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCampaignIds() {
        if (campaignIds == null) {
            campaignIds = new ArrayList<Long>();
        }
        return this.campaignIds;
    }

    /**
     * Gets the value of the remainingBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getRemainingBudget() {
        return remainingBudget;
    }

    /**
     * Sets the value of the remainingBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setRemainingBudget(Money value) {
        this.remainingBudget = value;
    }

}
