
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a Mobile Device.
 *           
 * 
 * <p>Java class for MobileDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobileDevice">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201311}Technology">
 *       &lt;sequence>
 *         &lt;element name="manufacturerCriterionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDevice", propOrder = {
    "manufacturerCriterionId"
})
public class MobileDevice
    extends Technology
{

    protected Long manufacturerCriterionId;

    /**
     * Gets the value of the manufacturerCriterionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getManufacturerCriterionId() {
        return manufacturerCriterionId;
    }

    /**
     * Sets the value of the manufacturerCriterionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setManufacturerCriterionId(Long value) {
        this.manufacturerCriterionId = value;
    }

}
