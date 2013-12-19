
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Updates the specified {@link ThirdPartySlot}.
 *             
 *             @param thirdPartySlot the third-party slot to update
 *             @return the updated third-party slot
 *           
 * 
 * <p>Java class for updateThirdPartySlot element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="updateThirdPartySlot">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="thirdPartySlot" type="{https://www.google.com/apis/ads/publisher/v201211}ThirdPartySlot" minOccurs="0"/>
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
    "thirdPartySlot"
})
@XmlRootElement(name = "updateThirdPartySlot")
public class ThirdPartySlotServiceInterfaceupdateThirdPartySlot {

    protected ThirdPartySlot thirdPartySlot;

    /**
     * Gets the value of the thirdPartySlot property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartySlot }
     *     
     */
    public ThirdPartySlot getThirdPartySlot() {
        return thirdPartySlot;
    }

    /**
     * Sets the value of the thirdPartySlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartySlot }
     *     
     */
    public void setThirdPartySlot(ThirdPartySlot value) {
        this.thirdPartySlot = value;
    }

}
