
package com.google.api.ads.dfp.jaxws.v201311;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ExchangeRate} objects.
 *             
 *             @param exchangeRates the exchange rates to update
 *             @return the updated exchange rates
 *           
 * 
 * <p>Java class for updateExchangeRates element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateExchangeRates">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="exchangeRates" type="{https://www.google.com/apis/ads/publisher/v201311}ExchangeRate" maxOccurs="unbounded" minOccurs="0"/>
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
    "exchangeRates"
})
@XmlRootElement(name = "updateExchangeRates")
public class ExchangeRateServiceInterfaceupdateExchangeRates {

    protected List<ExchangeRate> exchangeRates;

    /**
     * Gets the value of the exchangeRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRate }
     * 
     * 
     */
    public List<ExchangeRate> getExchangeRates() {
        if (exchangeRates == null) {
            exchangeRates = new ArrayList<ExchangeRate>();
        }
        return this.exchangeRates;
    }

}
