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


package com.google.api.ads.admanager.jaxws.v202411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the template that populates the fields of a new line item being created.
 *           
 * 
 * <p>Java class for LineItemTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lineItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enabledForSameAdvertiserException" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lineItemType" type="{https://www.google.com/apis/ads/publisher/v202411}LineItemType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryRateType" type="{https://www.google.com/apis/ads/publisher/v202411}DeliveryRateType" minOccurs="0"/&gt;
 *         &lt;element name="roadblockingType" type="{https://www.google.com/apis/ads/publisher/v202411}RoadblockingType" minOccurs="0"/&gt;
 *         &lt;element name="creativeRotationType" type="{https://www.google.com/apis/ads/publisher/v202411}CreativeRotationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemTemplate", propOrder = {
    "id",
    "name",
    "isDefault",
    "lineItemName",
    "enabledForSameAdvertiserException",
    "notes",
    "lineItemType",
    "deliveryRateType",
    "roadblockingType",
    "creativeRotationType"
})
public class LineItemTemplate {

    protected Long id;
    protected String name;
    protected Boolean isDefault;
    protected String lineItemName;
    protected Boolean enabledForSameAdvertiserException;
    protected String notes;
    @XmlSchemaType(name = "string")
    protected LineItemType lineItemType;
    @XmlSchemaType(name = "string")
    protected DeliveryRateType deliveryRateType;
    @XmlSchemaType(name = "string")
    protected RoadblockingType roadblockingType;
    @XmlSchemaType(name = "string")
    protected CreativeRotationType creativeRotationType;

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
     * Gets the value of the isDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Sets the value of the isDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Gets the value of the lineItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemName() {
        return lineItemName;
    }

    /**
     * Sets the value of the lineItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemName(String value) {
        this.lineItemName = value;
    }

    /**
     * Gets the value of the enabledForSameAdvertiserException property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledForSameAdvertiserException() {
        return enabledForSameAdvertiserException;
    }

    /**
     * Sets the value of the enabledForSameAdvertiserException property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledForSameAdvertiserException(Boolean value) {
        this.enabledForSameAdvertiserException = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the lineItemType property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemType }
     *     
     */
    public LineItemType getLineItemType() {
        return lineItemType;
    }

    /**
     * Sets the value of the lineItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemType }
     *     
     */
    public void setLineItemType(LineItemType value) {
        this.lineItemType = value;
    }

    /**
     * Gets the value of the deliveryRateType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryRateType }
     *     
     */
    public DeliveryRateType getDeliveryRateType() {
        return deliveryRateType;
    }

    /**
     * Sets the value of the deliveryRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryRateType }
     *     
     */
    public void setDeliveryRateType(DeliveryRateType value) {
        this.deliveryRateType = value;
    }

    /**
     * Gets the value of the roadblockingType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadblockingType }
     *     
     */
    public RoadblockingType getRoadblockingType() {
        return roadblockingType;
    }

    /**
     * Sets the value of the roadblockingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadblockingType }
     *     
     */
    public void setRoadblockingType(RoadblockingType value) {
        this.roadblockingType = value;
    }

    /**
     * Gets the value of the creativeRotationType property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeRotationType }
     *     
     */
    public CreativeRotationType getCreativeRotationType() {
        return creativeRotationType;
    }

    /**
     * Sets the value of the creativeRotationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeRotationType }
     *     
     */
    public void setCreativeRotationType(CreativeRotationType value) {
        this.creativeRotationType = value;
    }

}
