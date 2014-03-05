
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link RateCardCustomization} objects that satisfy the
 *             given {@link Statement#query}.
 *             
 *             @param rateCardCustomizationAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of rate card customizations.
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performRateCardCustomizationAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performRateCardCustomizationAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCardCustomizationAction" type="{https://www.google.com/apis/ads/publisher/v201403}RateCardCustomizationAction" minOccurs="0"/>
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
    "rateCardCustomizationAction",
    "filterStatement"
})
@XmlRootElement(name = "performRateCardCustomizationAction")
public class RateCardCustomizationServiceInterfaceperformRateCardCustomizationAction {

    protected RateCardCustomizationAction rateCardCustomizationAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the rateCardCustomizationAction property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardCustomizationAction }
     *     
     */
    public RateCardCustomizationAction getRateCardCustomizationAction() {
        return rateCardCustomizationAction;
    }

    /**
     * Sets the value of the rateCardCustomizationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardCustomizationAction }
     *     
     */
    public void setRateCardCustomizationAction(RateCardCustomizationAction value) {
        this.rateCardCustomizationAction = value;
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
