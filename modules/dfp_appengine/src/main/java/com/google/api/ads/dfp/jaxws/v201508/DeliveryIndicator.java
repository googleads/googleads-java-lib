
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Indicates the delivery performance of the {@link LineItem}.
 *           
 * 
 * <p>Java class for DeliveryIndicator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryIndicator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expectedDeliveryPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="actualDeliveryPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryIndicator", propOrder = {
    "expectedDeliveryPercentage",
    "actualDeliveryPercentage"
})
public class DeliveryIndicator {

    protected Double expectedDeliveryPercentage;
    protected Double actualDeliveryPercentage;

    /**
     * Gets the value of the expectedDeliveryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedDeliveryPercentage() {
        return expectedDeliveryPercentage;
    }

    /**
     * Sets the value of the expectedDeliveryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedDeliveryPercentage(Double value) {
        this.expectedDeliveryPercentage = value;
    }

    /**
     * Gets the value of the actualDeliveryPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getActualDeliveryPercentage() {
        return actualDeliveryPercentage;
    }

    /**
     * Sets the value of the actualDeliveryPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setActualDeliveryPercentage(Double value) {
        this.actualDeliveryPercentage = value;
    }

}
