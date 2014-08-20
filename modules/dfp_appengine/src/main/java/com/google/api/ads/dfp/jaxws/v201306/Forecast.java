
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes predicted inventory availability for a line item with the specified
 *             properties.
 *             
 *             <p>Inventory has three threshold values along a line of possible inventory.
 *             From least to most, these are:
 *             
 *             <dl>
 *             <li>Available units -- How many units can be booked without affecting any other line items.
 *             Booking more than this number can cause lower- and same-priority line items to underdeliver.
 *             <li>Possible units -- How many units can be booked without affecting any higher priority line
 *             items. Booking more than this number can cause the line item to underdeliver.
 *             <li>Matched (forecast) units -- How many units satisfy all specified
 *             criteria.
 *             </dl>
 *             
 *             <p>Underdelivery is caused by overbooking. However, if more impressions are served than are
 *             predicted, the extra available inventory might enable all inventory guarantees to be met without
 *             overbooking.
 *           
 * 
 * <p>Java class for Forecast complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Forecast">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v201306}UnitType" minOccurs="0"/>
 *         &lt;element name="availableUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveredUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="possibleUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reservedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Forecast", propOrder = {
    "id",
    "orderId",
    "unitType",
    "availableUnits",
    "deliveredUnits",
    "matchedUnits",
    "possibleUnits",
    "reservedUnits"
})
public class Forecast {

    protected Long id;
    protected Long orderId;
    protected UnitType unitType;
    protected Long availableUnits;
    protected Long deliveredUnits;
    protected Long matchedUnits;
    protected Long possibleUnits;
    protected Long reservedUnits;

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

}
