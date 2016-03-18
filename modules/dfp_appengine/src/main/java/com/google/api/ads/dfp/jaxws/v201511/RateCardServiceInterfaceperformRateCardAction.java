
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs action on {@link RateCard} objects that satisfy the
 *             given {@link Statement#query}.
 *             
 *             @param rateCardAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of rate cards.
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performRateCardAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performRateCardAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCardAction" type="{https://www.google.com/apis/ads/publisher/v201511}RateCardAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201511}Statement" minOccurs="0"/>
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
    "rateCardAction",
    "filterStatement"
})
@XmlRootElement(name = "performRateCardAction")
public class RateCardServiceInterfaceperformRateCardAction {

    protected RateCardAction rateCardAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the rateCardAction property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardAction }
     *     
     */
    public RateCardAction getRateCardAction() {
        return rateCardAction;
    }

    /**
     * Sets the value of the rateCardAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardAction }
     *     
     */
    public void setRateCardAction(RateCardAction value) {
        this.rateCardAction = value;
    }

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
