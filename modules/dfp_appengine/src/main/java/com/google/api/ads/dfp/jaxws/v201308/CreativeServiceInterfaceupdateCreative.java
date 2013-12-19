
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link Creative}.
 *             
 *             @param creative the creative to update
 *             @return the updated creative
 *           
 * 
 * <p>Java class for updateCreative element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateCreative">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="creative" type="{https://www.google.com/apis/ads/publisher/v201308}Creative" minOccurs="0"/>
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
@XmlRootElement(name = "updateCreative")
public class CreativeServiceInterfaceupdateCreative {

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
