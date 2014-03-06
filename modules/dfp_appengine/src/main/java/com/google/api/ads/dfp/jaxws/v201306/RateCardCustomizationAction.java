
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the action that can be performed on {@link RateCardCustomization}
 *             objects.
 *           
 * 
 * <p>Java class for RateCardCustomizationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardCustomizationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RateCardCustomizationAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardCustomizationAction", propOrder = {
    "rateCardCustomizationActionType"
})
@XmlSeeAlso({
    DeactivateRateCardCustomizations.class,
    ActivateRateCardCustomizations.class
})
public abstract class RateCardCustomizationAction {

    @XmlElement(name = "RateCardCustomizationAction.Type")
    protected String rateCardCustomizationActionType;

    /**
     * Gets the value of the rateCardCustomizationActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCardCustomizationActionType() {
        return rateCardCustomizationActionType;
    }

    /**
     * Sets the value of the rateCardCustomizationActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCardCustomizationActionType(String value) {
        this.rateCardCustomizationActionType = value;
    }

}
