
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Usage stats about a single {@link ConversionTracker}.
 *           
 * 
 * <p>Java class for ConversionTrackerStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionTrackerStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numConversionEvents" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conversionValue" type="{https://adwords.google.com/api/adwords/cm/v201406}Money" minOccurs="0"/>
 *         &lt;element name="mostRecentConversionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numConvertedClicks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionTrackerStats", propOrder = {
    "numConversionEvents",
    "conversionValue",
    "mostRecentConversionDate",
    "numConvertedClicks"
})
public class ConversionTrackerStats {

    protected Integer numConversionEvents;
    protected Money conversionValue;
    protected String mostRecentConversionDate;
    protected Integer numConvertedClicks;

    /**
     * Gets the value of the numConversionEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumConversionEvents() {
        return numConversionEvents;
    }

    /**
     * Sets the value of the numConversionEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumConversionEvents(Integer value) {
        this.numConversionEvents = value;
    }

    /**
     * Gets the value of the conversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getConversionValue() {
        return conversionValue;
    }

    /**
     * Sets the value of the conversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setConversionValue(Money value) {
        this.conversionValue = value;
    }

    /**
     * Gets the value of the mostRecentConversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMostRecentConversionDate() {
        return mostRecentConversionDate;
    }

    /**
     * Sets the value of the mostRecentConversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMostRecentConversionDate(String value) {
        this.mostRecentConversionDate = value;
    }

    /**
     * Gets the value of the numConvertedClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumConvertedClicks() {
        return numConvertedClicks;
    }

    /**
     * Sets the value of the numConvertedClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumConvertedClicks(Integer value) {
        this.numConvertedClicks = value;
    }

}
