
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link RateCard}. Rate cards must be activated before being
 *             associated with proposal line items and products.
 *             
 *             @param rateCard the rate card to be created
 *             @return the rate card with corresponding fields set by Google.
 *           
 * 
 * <p>Java class for createRateCard element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createRateCard">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCard" type="{https://www.google.com/apis/ads/publisher/v201308}RateCard" minOccurs="0"/>
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
    "rateCard"
})
@XmlRootElement(name = "createRateCard")
public class RateCardServiceInterfacecreateRateCard {

    protected RateCard rateCard;

    /**
     * Gets the value of the rateCard property.
     * 
     * @return
     *     possible object is
     *     {@link RateCard }
     *     
     */
    public RateCard getRateCard() {
        return rateCard;
    }

    /**
     * Sets the value of the rateCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCard }
     *     
     */
    public void setRateCard(RateCard value) {
        this.rateCard = value;
    }

}
