
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link LineItem} objects.
 *           
 * 
 * <p>Java class for LineItemAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemAction", propOrder = {
    "lineItemActionType"
})
@XmlSeeAlso({
    ReleaseLineItems.class,
    UnarchiveLineItems.class,
    ResumeLineItems.class,
    ArchiveLineItems.class,
    DeleteLineItems.class,
    ActivateLineItems.class,
    PauseLineItems.class,
    ReserveLineItems.class
})
public abstract class LineItemAction {

    @XmlElement(name = "LineItemAction.Type")
    protected String lineItemActionType;

    /**
     * Gets the value of the lineItemActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemActionType() {
        return lineItemActionType;
    }

    /**
     * Sets the value of the lineItemActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemActionType(String value) {
        this.lineItemActionType = value;
    }

}
