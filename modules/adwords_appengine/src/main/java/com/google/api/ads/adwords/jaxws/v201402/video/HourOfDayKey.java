
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Segmentation key for hour-of-day dimension.  The hour should be an integer from 0 to 23.
 *           
 * 
 * <p>Java class for HourOfDayKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HourOfDayKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hourOfDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HourOfDayKey", propOrder = {
    "hourOfDay"
})
public class HourOfDayKey {

    protected Integer hourOfDay;

    /**
     * Gets the value of the hourOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHourOfDay() {
        return hourOfDay;
    }

    /**
     * Sets the value of the hourOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHourOfDay(Integer value) {
        this.hourOfDay = value;
    }

}
