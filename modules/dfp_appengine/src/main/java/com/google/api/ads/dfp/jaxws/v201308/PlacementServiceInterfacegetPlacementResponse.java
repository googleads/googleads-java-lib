
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPlacementResponse element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getPlacementResponse">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="rval" type="{https://www.google.com/apis/ads/publisher/v201308}Placement" minOccurs="0"/>
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
    "rval"
})
@XmlRootElement(name = "getPlacementResponse")
public class PlacementServiceInterfacegetPlacementResponse {

    protected Placement rval;

    /**
     * Gets the value of the rval property.
     * 
     * @return
     *     possible object is
     *     {@link Placement }
     *     
     */
    public Placement getRval() {
        return rval;
    }

    /**
     * Sets the value of the rval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Placement }
     *     
     */
    public void setRval(Placement value) {
        this.rval = value;
    }

}
