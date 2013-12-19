
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link BaseRate} object.
 *             
 *             @param baseRate the base rate to be updated
 *             @return the updated base rate
 *           
 * 
 * <p>Java class for updateBaseRate element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateBaseRate">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="baseRate" type="{https://www.google.com/apis/ads/publisher/v201308}BaseRate" minOccurs="0"/>
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
    "baseRate"
})
@XmlRootElement(name = "updateBaseRate")
public class BaseRateServiceInterfaceupdateBaseRate {

    protected BaseRate baseRate;

    /**
     * Gets the value of the baseRate property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRate }
     *     
     */
    public BaseRate getBaseRate() {
        return baseRate;
    }

    /**
     * Sets the value of the baseRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRate }
     *     
     */
    public void setBaseRate(BaseRate value) {
        this.baseRate = value;
    }

}
