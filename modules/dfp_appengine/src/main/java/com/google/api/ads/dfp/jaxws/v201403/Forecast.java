
package com.google.api.ads.dfp.jaxws.v201403;

import java.util.ArrayList;
import java.util.List;
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
 *             <ul>
 *             <li>Available units -- How many units can be booked without affecting any
 *             other line items. Booking more than this number can overbook lower or equal
 *             priority line items.
 *             <li>Possible units -- How many units can be booked without affecting any
 *             higher priority line items. Booking more than this number can overbook
 *             higher priority line items.
 *             <li>Matched (forecast) units -- How many units satisfy all specified
 *             criteria.
 *             </ul>
 *             
 *             <p>The term "<em>can</em> overbook" is used, because if more impressions are
 *             served than are predicted, the extra available inventory might enable all
 *             inventory guarantees to be met without overbooking.
 *             
 *             <p><img src="http://chart.apis.google.com/chart?chxl=0:|Available|Possible|Matched (forecast)&chxp=0,20,60,100&chxs=0,000000,11.5,0,t,676767&chxtc=0,10&chxt=x&chs=440x75&cht=bhs&chco=D4F8AD,FFF15C,FC5D5D&chd=t:20|40|40&chp=0,0.05&chm=tNo+overbooking,000000,0,0,10,1,:-75|tOverbook+lower+priority,000000,0,0,10,1,:20|tOverbook+higher+priority,000000,0,0,10,1,:175"/>
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
 *         &lt;element name="unitType" type="{https://www.google.com/apis/ads/publisher/v201403}UnitType" minOccurs="0"/>
 *         &lt;element name="availableUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="deliveredUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="matchedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="possibleUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reservedUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contendingLineItems" type="{https://www.google.com/apis/ads/publisher/v201403}ContendingLineItem" maxOccurs="unbounded" minOccurs="0"/>
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
    "reservedUnits",
    "contendingLineItems"
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
    protected List<ContendingLineItem> contendingLineItems;

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

}
