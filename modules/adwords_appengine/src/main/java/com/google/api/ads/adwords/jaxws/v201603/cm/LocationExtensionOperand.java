
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This operand specifies information required for location extension targeting.
 *           
 * 
 * <p>Java class for LocationExtensionOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationExtensionOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="radius" type="{https://adwords.google.com/api/adwords/cm/v201603}ConstantOperand" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationExtensionOperand", propOrder = {
    "radius",
    "locationId"
})
public class LocationExtensionOperand
    extends FunctionArgumentOperand
{

    protected ConstantOperand radius;
    protected Long locationId;

    /**
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantOperand }
     *     
     */
    public ConstantOperand getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantOperand }
     *     
     */
    public void setRadius(ConstantOperand value) {
        this.radius = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
    }

}
