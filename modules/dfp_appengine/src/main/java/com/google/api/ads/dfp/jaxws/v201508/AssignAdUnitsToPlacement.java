
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The action used for assigning a group of {@link AdUnit} objects to a
 *             {@link Placement}.
 *           
 * 
 * <p>Java class for AssignAdUnitsToPlacement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignAdUnitsToPlacement">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}AdUnitAction">
 *       &lt;sequence>
 *         &lt;element name="placementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignAdUnitsToPlacement", propOrder = {
    "placementId"
})
public class AssignAdUnitsToPlacement
    extends AdUnitAction
{

    protected Long placementId;

    /**
     * Gets the value of the placementId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPlacementId() {
        return placementId;
    }

    /**
     * Sets the value of the placementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPlacementId(Long value) {
        this.placementId = value;
    }

}
