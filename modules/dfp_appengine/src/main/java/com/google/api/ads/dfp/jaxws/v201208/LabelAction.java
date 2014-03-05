
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link Label} objects.
 *           
 * 
 * <p>Java class for LabelAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LabelAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelAction", propOrder = {
    "labelActionType"
})
@XmlSeeAlso({
    DeactivateLabels.class,
    ActivateLabels.class
})
public abstract class LabelAction {

    @XmlElement(name = "LabelAction.Type")
    protected String labelActionType;

    /**
     * Gets the value of the labelActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelActionType() {
        return labelActionType;
    }

    /**
     * Sets the value of the labelActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelActionType(String value) {
        this.labelActionType = value;
    }

}
