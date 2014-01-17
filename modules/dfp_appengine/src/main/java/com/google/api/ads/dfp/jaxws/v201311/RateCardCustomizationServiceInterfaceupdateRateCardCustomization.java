
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link RateCardCustomization} object.
 *             
 *             @param rateCardCustomization the rate card customization to be updated
 *             @return the updated rate card customization
 *           
 * 
 * <p>Java class for updateRateCardCustomization element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateRateCardCustomization">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCardCustomization" type="{https://www.google.com/apis/ads/publisher/v201311}RateCardCustomization" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rateCardCustomization"
})
@XmlRootElement(name = "updateRateCardCustomization")
public class RateCardCustomizationServiceInterfaceupdateRateCardCustomization {

    protected RateCardCustomization rateCardCustomization;

    /**
     * Gets the value of the rateCardCustomization property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardCustomization }
     *     
     */
    public RateCardCustomization getRateCardCustomization() {
        return rateCardCustomization;
    }

    /**
     * Sets the value of the rateCardCustomization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardCustomization }
     *     
     */
    public void setRateCardCustomization(RateCardCustomization value) {
        this.rateCardCustomization = value;
    }

}
