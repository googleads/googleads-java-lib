
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link SuggestedAdUnit} objects.
 *           
 * 
 * <p>Java class for SuggestedAdUnitAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuggestedAdUnitAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuggestedAdUnitAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestedAdUnitAction", propOrder = {
    "suggestedAdUnitActionType"
})
@XmlSeeAlso({
    ApproveSuggestedAdUnit.class
})
public abstract class SuggestedAdUnitAction {

    @XmlElement(name = "SuggestedAdUnitAction.Type")
    protected String suggestedAdUnitActionType;

    /**
     * Gets the value of the suggestedAdUnitActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedAdUnitActionType() {
        return suggestedAdUnitActionType;
    }

    /**
     * Sets the value of the suggestedAdUnitActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedAdUnitActionType(String value) {
        this.suggestedAdUnitActionType = value;
    }

}
