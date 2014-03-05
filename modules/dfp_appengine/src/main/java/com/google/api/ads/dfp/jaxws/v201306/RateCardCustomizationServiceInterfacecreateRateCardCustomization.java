
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link RateCardCustomization} object.
 *             
 *             @param rateCardCustomization the {@link RateCardCustomization} to be
 *             created
 *             @return the {@link RateCardCustomization} with its ID filled in
 *           
 * 
 * <p>Java class for createRateCardCustomization element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createRateCardCustomization">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCardCustomization" type="{https://www.google.com/apis/ads/publisher/v201306}RateCardCustomization" minOccurs="0"/>
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
@XmlRootElement(name = "createRateCardCustomization")
public class RateCardCustomizationServiceInterfacecreateRateCardCustomization {

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
