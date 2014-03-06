
package com.google.api.ads.adwords.jaxws.v201402.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Immutable structure to hold an ad schedule target.
 *           
 * 
 * <p>Java class for AdScheduleTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdScheduleTarget">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Target">
 *       &lt;sequence>
 *         &lt;element name="dayOfWeek" type="{https://adwords.google.com/api/adwords/cm/v201402}DayOfWeek" minOccurs="0"/>
 *         &lt;element name="startHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="startMinute" type="{https://adwords.google.com/api/adwords/cm/v201402}MinuteOfHour" minOccurs="0"/>
 *         &lt;element name="endHour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endMinute" type="{https://adwords.google.com/api/adwords/cm/v201402}MinuteOfHour" minOccurs="0"/>
 *         &lt;element name="bidMultiplier" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdScheduleTarget", propOrder = {
    "dayOfWeek",
    "startHour",
    "startMinute",
    "endHour",
    "endMinute",
    "bidMultiplier"
})
public class AdScheduleTarget
    extends Target
{

    protected DayOfWeek dayOfWeek;
    protected Integer startHour;
    protected MinuteOfHour startMinute;
    protected Integer endHour;
    protected MinuteOfHour endMinute;
    protected Double bidMultiplier;

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
     * Gets the value of the startHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartHour() {
        return startHour;
    }

    /**
     * Sets the value of the startHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartHour(Integer value) {
        this.startHour = value;
    }

    /**
     * Gets the value of the startMinute property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteOfHour }
     *     
     */
    public MinuteOfHour getStartMinute() {
        return startMinute;
    }

    /**
     * Sets the value of the startMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteOfHour }
     *     
     */
    public void setStartMinute(MinuteOfHour value) {
        this.startMinute = value;
    }

    /**
     * Gets the value of the endHour property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndHour() {
        return endHour;
    }

    /**
     * Sets the value of the endHour property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndHour(Integer value) {
        this.endHour = value;
    }

    /**
     * Gets the value of the endMinute property.
     * 
     * @return
     *     possible object is
     *     {@link MinuteOfHour }
     *     
     */
    public MinuteOfHour getEndMinute() {
        return endMinute;
    }

    /**
     * Sets the value of the endMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinuteOfHour }
     *     
     */
    public void setEndMinute(MinuteOfHour value) {
        this.endMinute = value;
    }

    /**
     * Gets the value of the bidMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBidMultiplier() {
        return bidMultiplier;
    }

    /**
     * Sets the value of the bidMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBidMultiplier(Double value) {
        this.bidMultiplier = value;
    }

}
