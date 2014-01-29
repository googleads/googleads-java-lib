
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adUnitAction" type="{https://www.google.com/apis/ads/publisher/v201311}AdUnitAction" minOccurs="0"/>
 *         &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201311}Statement" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adUnitAction",
    "filterStatement"
})
@XmlRootElement(name = "performAdUnitAction")
public class PerformAdUnitAction {

    protected AdUnitAction adUnitAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the adUnitAction property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitAction }
     *     
     */
    public AdUnitAction getAdUnitAction() {
        return adUnitAction;
    }

    /**
     * Sets the value of the adUnitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitAction }
     *     
     */
    public void setAdUnitAction(AdUnitAction value) {
        this.adUnitAction = value;
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
