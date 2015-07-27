
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link SharedAdUnit} objects.
 *           
 * 
 * <p>Java class for SharedAdUnitAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SharedAdUnitAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SharedAdUnitAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SharedAdUnitAction", propOrder = {
    "sharedAdUnitActionType"
})
@XmlSeeAlso({
    ApproveSharedAdUnits.class,
    RejectSharedAdUnits.class
})
public abstract class SharedAdUnitAction {

    @XmlElement(name = "SharedAdUnitAction.Type")
    protected String sharedAdUnitActionType;

    /**
     * Gets the value of the sharedAdUnitActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedAdUnitActionType() {
        return sharedAdUnitActionType;
    }

    /**
     * Sets the value of the sharedAdUnitActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedAdUnitActionType(String value) {
        this.sharedAdUnitActionType = value;
    }

}
