
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on
 *             {@link LineItemCreativeAssociation} objects.
 *           
 * 
 * <p>Java class for LineItemCreativeAssociationAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineItemCreativeAssociationAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineItemCreativeAssociationAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemCreativeAssociationAction", propOrder = {
    "lineItemCreativeAssociationActionType"
})
@XmlSeeAlso({
    ActivateLineItemCreativeAssociations.class,
    DeactivateLineItemCreativeAssociations.class
})
public abstract class LineItemCreativeAssociationAction {

    @XmlElement(name = "LineItemCreativeAssociationAction.Type")
    protected String lineItemCreativeAssociationActionType;

    /**
     * Gets the value of the lineItemCreativeAssociationActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemCreativeAssociationActionType() {
        return lineItemCreativeAssociationActionType;
    }

    /**
     * Sets the value of the lineItemCreativeAssociationActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemCreativeAssociationActionType(String value) {
        this.lineItemCreativeAssociationActionType = value;
    }

}
