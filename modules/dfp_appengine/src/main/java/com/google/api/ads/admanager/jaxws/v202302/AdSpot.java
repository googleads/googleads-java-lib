// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202302;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link AdSpot} is a targetable entity used in the creation of {@link AdRule} objects.
 *             
 *             <p>A ad spot contains a variable number of ads and has constraints (ad duration, reservation
 *             type, etc) on the ads that can appear in it.
 *           
 * 
 * <p>Java class for AdSpot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSpot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customSpot" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="flexible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="maxDurationMillis" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="maxNumberOfAds" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="targetingType" type="{https://www.google.com/apis/ads/publisher/v202302}AdSpotTargetingType" minOccurs="0"/&gt;
 *         &lt;element name="backfillBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="allowedLineItemTypes" type="{https://www.google.com/apis/ads/publisher/v202302}LineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="inventorySharingBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSpot", propOrder = {
    "id",
    "name",
    "displayName",
    "customSpot",
    "flexible",
    "maxDurationMillis",
    "maxNumberOfAds",
    "targetingType",
    "backfillBlocked",
    "allowedLineItemTypes",
    "inventorySharingBlocked"
})
public class AdSpot {

    protected Long id;
    protected String name;
    protected String displayName;
    protected Boolean customSpot;
    protected Boolean flexible;
    protected Long maxDurationMillis;
    protected Integer maxNumberOfAds;
    @XmlSchemaType(name = "string")
    protected AdSpotTargetingType targetingType;
    protected Boolean backfillBlocked;
    @XmlSchemaType(name = "string")
    protected List<LineItemType> allowedLineItemTypes;
    protected Boolean inventorySharingBlocked;

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
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the customSpot property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomSpot() {
        return customSpot;
    }

    /**
     * Sets the value of the customSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomSpot(Boolean value) {
        this.customSpot = value;
    }

    /**
     * Gets the value of the flexible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlexible() {
        return flexible;
    }

    /**
     * Sets the value of the flexible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlexible(Boolean value) {
        this.flexible = value;
    }

    /**
     * Gets the value of the maxDurationMillis property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxDurationMillis() {
        return maxDurationMillis;
    }

    /**
     * Sets the value of the maxDurationMillis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxDurationMillis(Long value) {
        this.maxDurationMillis = value;
    }

    /**
     * Gets the value of the maxNumberOfAds property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfAds() {
        return maxNumberOfAds;
    }

    /**
     * Sets the value of the maxNumberOfAds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfAds(Integer value) {
        this.maxNumberOfAds = value;
    }

    /**
     * Gets the value of the targetingType property.
     * 
     * @return
     *     possible object is
     *     {@link AdSpotTargetingType }
     *     
     */
    public AdSpotTargetingType getTargetingType() {
        return targetingType;
    }

    /**
     * Sets the value of the targetingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSpotTargetingType }
     *     
     */
    public void setTargetingType(AdSpotTargetingType value) {
        this.targetingType = value;
    }

    /**
     * Gets the value of the backfillBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackfillBlocked() {
        return backfillBlocked;
    }

    /**
     * Sets the value of the backfillBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackfillBlocked(Boolean value) {
        this.backfillBlocked = value;
    }

    /**
     * Gets the value of the allowedLineItemTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedLineItemTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowedLineItemTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineItemType }
     * 
     * 
     */
    public List<LineItemType> getAllowedLineItemTypes() {
        if (allowedLineItemTypes == null) {
            allowedLineItemTypes = new ArrayList<LineItemType>();
        }
        return this.allowedLineItemTypes;
    }

    /**
     * Gets the value of the inventorySharingBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInventorySharingBlocked() {
        return inventorySharingBlocked;
    }

    /**
     * Sets the value of the inventorySharingBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInventorySharingBlocked(Boolean value) {
        this.inventorySharingBlocked = value;
    }

}
