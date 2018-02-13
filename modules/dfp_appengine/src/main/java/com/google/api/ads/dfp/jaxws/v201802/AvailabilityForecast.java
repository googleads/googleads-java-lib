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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes predicted inventory availability for a {@link ProspectiveLineItem}.
 *             
 *             <p>Inventory has three threshold values along a line of possible inventory. From least to most,
 *             these are:
 *             
 *             <dl>
 *             <li>Available units -- How many units can be booked without affecting any other line items.
 *             Booking more than this number can cause lower and same priority line items to underdeliver.
 *             <li>Possible units -- How many units can be booked without affecting any higher priority line
 *             items. Booking more than this number can cause the line item to underdeliver.
 *             <li>Matched (forecast) units -- How many units satisfy all specified criteria.
 *             </dl>
 *             
 *             <p>Underdelivery is caused by overbooking. However, if more impressions are served than are
 *             predicted, the extra available inventory might enable all inventory guarantees to be met without
 *             overbooking.
 *           
 * 
 * <p>Java class for AvailabilityForecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AvailabilityForecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineItemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v201802}UnitType" minOccurs="0"/>
 *         &lt;element name="availableUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveredUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="possibleUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reservedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetingCriteriaBreakdowns" type="{https://www.google.com/apis/ads/publisher/v201802}TargetingCriteriaBreakdown" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contendingLineItems" type="{https://www.google.com/apis/ads/publisher/v201802}ContendingLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alternativeUnitTypeForecasts" type="{https://www.google.com/apis/ads/publisher/v201802}AlternativeUnitTypeForecast" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="demographicBreakdowns" type="{https://www.google.com/apis/ads/publisher/v201802}GrpDemographicBreakdown" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailabilityForecast", propOrder = {
    "lineItemId",
    "orderId",
    "unitType",
    "availableUnits",
    "deliveredUnits",
    "matchedUnits",
    "possibleUnits",
    "reservedUnits",
    "targetingCriteriaBreakdowns",
    "contendingLineItems",
    "alternativeUnitTypeForecasts",
    "demographicBreakdowns"
})
public class AvailabilityForecast {

    protected Long lineItemId;
    protected Long orderId;
    @XmlSchemaType(name = "string")
    protected UnitType unitType;
    protected Long availableUnits;
    protected Long deliveredUnits;
    protected Long matchedUnits;
    protected Long possibleUnits;
    protected Long reservedUnits;
    protected List<TargetingCriteriaBreakdown> targetingCriteriaBreakdowns;
    protected List<ContendingLineItem> contendingLineItems;
    protected List<AlternativeUnitTypeForecast> alternativeUnitTypeForecasts;
    protected List<GrpDemographicBreakdown> demographicBreakdowns;

    /**
     * Gets the value of the lineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLineItemId() {
        return lineItemId;
    }

    /**
     * Sets the value of the lineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLineItemId(Long value) {
        this.lineItemId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the unitType property.
     * 
     * @return
     *     possible object is
     *     {@link UnitType }
     *     
     */
    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Sets the value of the unitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitType }
     *     
     */
    public void setUnitType(UnitType value) {
        this.unitType = value;
    }

    /**
     * Gets the value of the availableUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailableUnits() {
        return availableUnits;
    }

    /**
     * Sets the value of the availableUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailableUnits(Long value) {
        this.availableUnits = value;
    }

    /**
     * Gets the value of the deliveredUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeliveredUnits() {
        return deliveredUnits;
    }

    /**
     * Sets the value of the deliveredUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeliveredUnits(Long value) {
        this.deliveredUnits = value;
    }

    /**
     * Gets the value of the matchedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMatchedUnits() {
        return matchedUnits;
    }

    /**
     * Sets the value of the matchedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMatchedUnits(Long value) {
        this.matchedUnits = value;
    }

    /**
     * Gets the value of the possibleUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPossibleUnits() {
        return possibleUnits;
    }

    /**
     * Sets the value of the possibleUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPossibleUnits(Long value) {
        this.possibleUnits = value;
    }

    /**
     * Gets the value of the reservedUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReservedUnits() {
        return reservedUnits;
    }

    /**
     * Sets the value of the reservedUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReservedUnits(Long value) {
        this.reservedUnits = value;
    }

    /**
     * Gets the value of the targetingCriteriaBreakdowns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetingCriteriaBreakdowns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetingCriteriaBreakdowns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetingCriteriaBreakdown }
     * 
     * 
     */
    public List<TargetingCriteriaBreakdown> getTargetingCriteriaBreakdowns() {
        if (targetingCriteriaBreakdowns == null) {
            targetingCriteriaBreakdowns = new ArrayList<TargetingCriteriaBreakdown>();
        }
        return this.targetingCriteriaBreakdowns;
    }

    /**
     * Gets the value of the contendingLineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contendingLineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContendingLineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContendingLineItem }
     * 
     * 
     */
    public List<ContendingLineItem> getContendingLineItems() {
        if (contendingLineItems == null) {
            contendingLineItems = new ArrayList<ContendingLineItem>();
        }
        return this.contendingLineItems;
    }

    /**
     * Gets the value of the alternativeUnitTypeForecasts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeUnitTypeForecasts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeUnitTypeForecasts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeUnitTypeForecast }
     * 
     * 
     */
    public List<AlternativeUnitTypeForecast> getAlternativeUnitTypeForecasts() {
        if (alternativeUnitTypeForecasts == null) {
            alternativeUnitTypeForecasts = new ArrayList<AlternativeUnitTypeForecast>();
        }
        return this.alternativeUnitTypeForecasts;
    }

    /**
     * Gets the value of the demographicBreakdowns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demographicBreakdowns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemographicBreakdowns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrpDemographicBreakdown }
     * 
     * 
     */
    public List<GrpDemographicBreakdown> getDemographicBreakdowns() {
        if (demographicBreakdowns == null) {
            demographicBreakdowns = new ArrayList<GrpDemographicBreakdown>();
        }
        return this.demographicBreakdowns;
    }

}
