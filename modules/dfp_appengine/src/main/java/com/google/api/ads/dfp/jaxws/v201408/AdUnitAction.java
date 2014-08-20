
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link AdUnit} objects.
 *           
 * 
 * <p>Java class for AdUnitAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnitAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdUnitAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnitAction", propOrder = {
    "adUnitActionType"
})
@XmlSeeAlso({
    DeactivateAdUnits.class,
    ActivateAdUnits.class,
    ArchiveAdUnits.class,
    RemoveAdUnitsFromPlacement.class,
    AssignAdUnitsToPlacement.class
})
public abstract class AdUnitAction {

    @XmlElement(name = "AdUnitAction.Type")
    protected String adUnitActionType;

    /**
     * Gets the value of the adUnitActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdUnitActionType() {
        return adUnitActionType;
    }

    /**
     * Sets the value of the adUnitActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdUnitActionType(String value) {
        this.adUnitActionType = value;
    }

}
