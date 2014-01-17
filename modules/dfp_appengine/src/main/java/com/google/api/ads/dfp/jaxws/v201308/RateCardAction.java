
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link RateCard} objects.
 *           
 * 
 * <p>Java class for RateCardAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateCardAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardAction", propOrder = {
    "rateCardActionType"
})
@XmlSeeAlso({
    ActivateRateCards.class,
    DeactivateRateCards.class
})
public abstract class RateCardAction {

    @XmlElement(name = "RateCardAction.Type")
    protected String rateCardActionType;

    /**
     * Gets the value of the rateCardActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCardActionType() {
        return rateCardActionType;
    }

    /**
     * Sets the value of the rateCardActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCardActionType(String value) {
        this.rateCardActionType = value;
    }

}
