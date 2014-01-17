
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link CustomTargetingValue}
 *             objects.
 *           
 * 
 * <p>Java class for CustomTargetingValueAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTargetingValueAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomTargetingValueAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTargetingValueAction", propOrder = {
    "customTargetingValueActionType"
})
@XmlSeeAlso({
    DeleteCustomTargetingValues.class
})
public abstract class CustomTargetingValueAction {

    @XmlElement(name = "CustomTargetingValueAction.Type")
    protected String customTargetingValueActionType;

    /**
     * Gets the value of the customTargetingValueActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTargetingValueActionType() {
        return customTargetingValueActionType;
    }

    /**
     * Sets the value of the customTargetingValueActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTargetingValueActionType(String value) {
        this.customTargetingValueActionType = value;
    }

}
