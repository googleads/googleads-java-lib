
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link ThirdPartySlot} objects.
 *           
 * 
 * <p>Java class for ThirdPartySlotAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartySlotAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThirdPartySlotAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartySlotAction", propOrder = {
    "thirdPartySlotActionType"
})
@XmlSeeAlso({
    ArchiveThirdPartySlots.class,
    ActivateThirdPartySlots.class
})
public abstract class ThirdPartySlotAction {

    @XmlElement(name = "ThirdPartySlotAction.Type")
    protected String thirdPartySlotActionType;

    /**
     * Gets the value of the thirdPartySlotActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartySlotActionType() {
        return thirdPartySlotActionType;
    }

    /**
     * Sets the value of the thirdPartySlotActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartySlotActionType(String value) {
        this.thirdPartySlotActionType = value;
    }

}
