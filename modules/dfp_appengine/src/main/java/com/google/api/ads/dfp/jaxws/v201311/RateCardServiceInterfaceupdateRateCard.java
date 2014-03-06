
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link RateCard}.
 *             
 *             @param rateCard the rate card to be updated
 *             @return the updated rate card
 *           
 * 
 * <p>Java class for updateRateCard element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateRateCard">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCard" type="{https://www.google.com/apis/ads/publisher/v201311}RateCard" minOccurs="0"/>
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
@XmlRootElement(name = "updateRateCard")
public class RateCardServiceInterfaceupdateRateCard {

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
