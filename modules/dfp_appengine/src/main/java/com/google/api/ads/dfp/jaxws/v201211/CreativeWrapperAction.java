
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link CreativeWrapper}
 *             objects.
 *           
 * 
 * <p>Java class for CreativeWrapperAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeWrapperAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreativeWrapperAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeWrapperAction", propOrder = {
    "creativeWrapperActionType"
})
@XmlSeeAlso({
    ActivateCreativeWrappers.class,
    DeactivateCreativeWrappers.class
})
public abstract class CreativeWrapperAction {

    @XmlElement(name = "CreativeWrapperAction.Type")
    protected String creativeWrapperActionType;

    /**
     * Gets the value of the creativeWrapperActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreativeWrapperActionType() {
        return creativeWrapperActionType;
    }

    /**
     * Sets the value of the creativeWrapperActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreativeWrapperActionType(String value) {
        this.creativeWrapperActionType = value;
    }

}
