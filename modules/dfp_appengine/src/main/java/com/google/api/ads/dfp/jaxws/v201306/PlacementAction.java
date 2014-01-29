
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link Placement} objects.
 *           
 * 
 * <p>Java class for PlacementAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacementAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlacementAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementAction", propOrder = {
    "placementActionType"
})
@XmlSeeAlso({
    ActivatePlacements.class,
    DeactivatePlacements.class,
    ArchivePlacements.class
})
public abstract class PlacementAction {

    @XmlElement(name = "PlacementAction.Type")
    protected String placementActionType;

    /**
     * Gets the value of the placementActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementActionType() {
        return placementActionType;
    }

    /**
     * Sets the value of the placementActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementActionType(String value) {
        this.placementActionType = value;
    }

}
