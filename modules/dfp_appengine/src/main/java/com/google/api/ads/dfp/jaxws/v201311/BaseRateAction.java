
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the action that can be performed on {@link BaseRate} objects.
 *           
 * 
 * <p>Java class for BaseRateAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRateAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseRateAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRateAction", propOrder = {
    "baseRateActionType"
})
@XmlSeeAlso({
    DeactivateBaseRates.class,
    ActivateBaseRates.class
})
public abstract class BaseRateAction {

    @XmlElement(name = "BaseRateAction.Type")
    protected String baseRateActionType;

    /**
     * Gets the value of the baseRateActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseRateActionType() {
        return baseRateActionType;
    }

    /**
     * Sets the value of the baseRateActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseRateActionType(String value) {
        this.baseRateActionType = value;
    }

}
