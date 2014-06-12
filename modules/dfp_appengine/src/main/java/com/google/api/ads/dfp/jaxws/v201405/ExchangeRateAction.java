
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link ExchangeRate} objects.
 *           
 * 
 * <p>Java class for ExchangeRateAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchangeRateAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExchangeRateAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateAction", propOrder = {
    "exchangeRateActionType"
})
@XmlSeeAlso({
    DeleteExchangeRates.class
})
public abstract class ExchangeRateAction {

    @XmlElement(name = "ExchangeRateAction.Type")
    protected String exchangeRateActionType;

    /**
     * Gets the value of the exchangeRateActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateActionType() {
        return exchangeRateActionType;
    }

    /**
     * Sets the value of the exchangeRateActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateActionType(String value) {
        this.exchangeRateActionType = value;
    }

}
