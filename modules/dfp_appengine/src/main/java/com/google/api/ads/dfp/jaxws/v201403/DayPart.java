
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@code DayPart} represents a time-period within a day of the week which is
 *             targeted by a {@link LineItem}.
 *           
 * 
 * <p>Java class for DayPart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayPart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayOfWeek" type="{https://www.google.com/apis/ads/publisher/v201403}DayOfWeek" minOccurs="0"/>
 *         &lt;element name="startTime" type="{https://www.google.com/apis/ads/publisher/v201403}TimeOfDay" minOccurs="0"/>
 *         &lt;element name="endTime" type="{https://www.google.com/apis/ads/publisher/v201403}TimeOfDay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayPart", propOrder = {
    "dayOfWeek",
    "startTime",
    "endTime"
})
public class DayPart {

    protected DayOfWeek dayOfWeek;
    protected TimeOfDay startTime;
    protected TimeOfDay endTime;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeek }
     *     
     */
    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeek }
     *     
     */
    public void setDayOfWeek(DayOfWeek value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOfDay }
     *     
     */
    public TimeOfDay getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOfDay }
     *     
     */
    public void setStartTime(TimeOfDay value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeOfDay }
     *     
     */
    public TimeOfDay getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeOfDay }
     *     
     */
    public void setEndTime(TimeOfDay value) {
        this.endTime = value;
    }

}
