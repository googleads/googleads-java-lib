
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a new {@link ThirdPartySlot}.
 *             
 *             The following fields are required:
 *             <ul>
 *             <li>{@link ThirdPartySlot#companyId}</li>
 *             <li>{@link ThirdPartySlot#externalUniqueId}</li>
 *             <li>{@link ThirdPartySlot#externalUniqueName}</li>
 *             <li>{@link ThirdPartySlot#description}</li>
 *             </ul>
 *             
 *             @param thirdPartySlot the third-party slot to create
 *             @return the new third-party slot with its ID filled in
 *           
 * 
 * <p>Java class for createThirdPartySlot element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createThirdPartySlot">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="thirdPartySlot" type="{https://www.google.com/apis/ads/publisher/v201208}ThirdPartySlot" minOccurs="0"/>
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
@XmlRootElement(name = "createThirdPartySlot")
public class ThirdPartySlotServiceInterfacecreateThirdPartySlot {

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
