
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link Placement}.
 *             
 *             @param placement the placement to update
 *             @return the updated placement
 *           
 * 
 * <p>Java class for updatePlacement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updatePlacement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="placement" type="{https://www.google.com/apis/ads/publisher/v201308}Placement" minOccurs="0"/>
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
@XmlRootElement(name = "updatePlacement")
public class PlacementServiceInterfaceupdatePlacement {

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
