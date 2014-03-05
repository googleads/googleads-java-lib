
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link BaseRatePage} of {@link BaseRate} objects that satisfy the given
 *             {@link Statement#query}.
 *             
 *             The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th>
 *             <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code rateCardId}</td>
 *             <td>{@link BaseRate#rateCardId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link BaseRate#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code status}</td>
 *             <td>{@link BaseRate#status}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productTemplateId}</td>
 *             <td>{@link ProductTemplateBaseRate#id}<br><b>Note:</b>&nbsp;Cannot be
 *             combined with {@code productId}.
 *             </tr>
 *             <td>{@code productId}</td>
 *             <td>{@link ProductBaseRate#id}<br><b>Note:</b>&nbsp;Cannot be combined with
 *             {@code productTemplateId}.
 *             </tr>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of base rates.
 *             @return the page of base rates that match the given filter
 *           
 * 
 * <p>Java class for getBaseRatesByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getBaseRatesByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201403}Statement" minOccurs="0"/>
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
@XmlRootElement(name = "getBaseRatesByStatement")
public class BaseRateServiceInterfacegetBaseRatesByStatement {

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
