
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link ThirdPartySlot} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param thirdPartySlotAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of third-party slots
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performThirdPartySlotAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performThirdPartySlotAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="thirdPartySlotAction" type="{https://www.google.com/apis/ads/publisher/v201208}ThirdPartySlotAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201208}Statement" minOccurs="0"/>
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
    "thirdPartySlotAction",
    "filterStatement"
})
@XmlRootElement(name = "performThirdPartySlotAction")
public class ThirdPartySlotServiceInterfaceperformThirdPartySlotAction {

    protected ThirdPartySlotAction thirdPartySlotAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the thirdPartySlotAction property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartySlotAction }
     *     
     */
    public ThirdPartySlotAction getThirdPartySlotAction() {
        return thirdPartySlotAction;
    }

    /**
     * Sets the value of the thirdPartySlotAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartySlotAction }
     *     
     */
    public void setThirdPartySlotAction(ThirdPartySlotAction value) {
        this.thirdPartySlotAction = value;
    }

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
