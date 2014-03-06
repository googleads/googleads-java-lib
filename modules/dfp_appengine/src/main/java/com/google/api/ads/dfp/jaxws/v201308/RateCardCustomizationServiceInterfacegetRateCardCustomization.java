
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link RateCardCustomization} object uniquely identified by the
 *             given ID.
 *             
 *             @param rateCardCustomizationId the ID of the rate card customization, which
 *             must already exist.
 *           
 * 
 * <p>Java class for getRateCardCustomization element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getRateCardCustomization">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rateCardCustomizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "rateCardCustomizationId"
})
@XmlRootElement(name = "getRateCardCustomization")
public class RateCardCustomizationServiceInterfacegetRateCardCustomization {

    protected Long rateCardCustomizationId;

    /**
     * Gets the value of the rateCardCustomizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRateCardCustomizationId() {
        return rateCardCustomizationId;
    }

    /**
     * Sets the value of the rateCardCustomizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRateCardCustomizationId(Long value) {
        this.rateCardCustomizationId = value;
    }

}
