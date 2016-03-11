
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a list of shopping bidding categories.
 *             
 *             A country predicate must be included in the selector, only {@link Predicate.Operator#EQUALS}
 *             and {@link Predicate.Operator#IN} with a single value are supported in the country predicate.
 *             An empty parentDimensionType predicate will filter for root categories.
 *             
 *             @return A list of shopping bidding categories.
 *             @throws ApiException when there is at least one error with the request.
 *           
 * 
 * <p>Java class for getProductBiddingCategoryData element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProductBiddingCategoryData">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="selector" type="{https://adwords.google.com/api/adwords/cm/v201509}Selector" minOccurs="0"/>
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
    "selector"
})
@XmlRootElement(name = "getProductBiddingCategoryData")
public class ConstantDataServiceInterfacegetProductBiddingCategoryData {

    protected Selector selector;

    /**
     * Gets the value of the selector property.
     * 
     * @return
     *     possible object is
     *     {@link Selector }
     *     
     */
    public Selector getSelector() {
        return selector;
    }

    /**
     * Sets the value of the selector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Selector }
     *     
     */
    public void setSelector(Selector value) {
        this.selector = value;
    }

}
