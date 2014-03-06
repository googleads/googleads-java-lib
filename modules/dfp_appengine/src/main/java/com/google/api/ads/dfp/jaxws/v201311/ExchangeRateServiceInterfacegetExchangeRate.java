
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ExchangeRate} object uniquely identified by the given
 *             {@code exchangeRateId}.
 *             
 *             @param exchangeRateId the ID of the exchange rate, which must already exist
 *             @return the exchange rate uniquely identified by the given {@code exchangeRateId}
 *           
 * 
 * <p>Java class for getExchangeRate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getExchangeRate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="exchangeRateId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "exchangeRateId"
})
@XmlRootElement(name = "getExchangeRate")
public class ExchangeRateServiceInterfacegetExchangeRate {

    protected Long exchangeRateId;

    /**
     * Gets the value of the exchangeRateId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExchangeRateId() {
        return exchangeRateId;
    }

    /**
     * Sets the value of the exchangeRateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExchangeRateId(Long value) {
        this.exchangeRateId = value;
    }

}
