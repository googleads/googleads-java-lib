
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link Creative}.
 *             
 *             The following fields are required along with the required fields of the
 *             sub-class:
 *             <ul>
 *             <li>{@link Creative#advertiserId}</li>
 *             <li>{@link Creative#name}</li>
 *             <li>{@link Creative#size}</li>
 *             </ul>
 *             
 *             @param creative the creative to create
 *             @return the new creative with its ID set
 *           
 * 
 * <p>Java class for createCreative element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createCreative">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creative" type="{https://www.google.com/apis/ads/publisher/v201311}Creative" minOccurs="0"/>
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
    "creative"
})
@XmlRootElement(name = "createCreative")
public class CreativeServiceInterfacecreateCreative {

    protected Creative creative;

    /**
     * Gets the value of the creative property.
     * 
     * @return
     *     possible object is
     *     {@link Creative }
     *     
     */
    public Creative getCreative() {
        return creative;
    }

    /**
     * Sets the value of the creative property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creative }
     *     
     */
    public void setCreative(Creative value) {
        this.creative = value;
    }

}
