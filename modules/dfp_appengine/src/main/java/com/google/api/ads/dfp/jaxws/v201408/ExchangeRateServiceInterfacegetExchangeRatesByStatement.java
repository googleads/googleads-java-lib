
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ExchangeRatePage} of {@link ExchangeRate} objects that satisfy the given
 *             {@link Statement#query}. The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ExchangeRate#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code currencyCode}</td>
 *             <td>{@link ExchangeRate#currencyCode}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code refreshRate}</td>
 *             <td>{@link ExchangeRate#refreshRate}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code direction}</td>
 *             <td>{@link ExchangeRate#direction}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code exchangeRate}</td>
 *             <td>{@link ExchangeRate#exchangeRate}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of exchange rates
 *             @return the exchange rates that match the given filter
 *           
 * 
 * <p>Java class for getExchangeRatesByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getExchangeRatesByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201408}Statement" minOccurs="0"/>
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
    "filterStatement"
})
@XmlRootElement(name = "getExchangeRatesByStatement")
public class ExchangeRateServiceInterfacegetExchangeRatesByStatement {

    protected Statement filterStatement;

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
