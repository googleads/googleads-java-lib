
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link Placement}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link Placement#name}</li>
 *             <li>{@link Placement#description}</li>
 *             </ul>
 *             
 *             @param placement the placement to create
 *             @return the new placement with its ID set
 *           
 * 
 * <p>Java class for createPlacement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createPlacement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="placement" type="{https://www.google.com/apis/ads/publisher/v201211}Placement" minOccurs="0"/>
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
    "placement"
})
@XmlRootElement(name = "createPlacement")
public class PlacementServiceInterfacecreatePlacement {

    protected Placement placement;

    /**
     * Gets the value of the placement property.
     * 
     * @return
     *     possible object is
     *     {@link Placement }
     *     
     */
    public Placement getPlacement() {
        return placement;
    }

    /**
     * Sets the value of the placement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Placement }
     *     
     */
    public void setPlacement(Placement value) {
        this.placement = value;
    }

}
