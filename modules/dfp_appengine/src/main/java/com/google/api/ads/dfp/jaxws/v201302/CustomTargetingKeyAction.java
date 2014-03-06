
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link CustomTargetingKey}
 *             objects.
 *           
 * 
 * <p>Java class for CustomTargetingKeyAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTargetingKeyAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomTargetingKeyAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTargetingKeyAction", propOrder = {
    "customTargetingKeyActionType"
})
@XmlSeeAlso({
    DeleteCustomTargetingKeys.class
})
public abstract class CustomTargetingKeyAction {

    @XmlElement(name = "CustomTargetingKeyAction.Type")
    protected String customTargetingKeyActionType;

    /**
     * Gets the value of the customTargetingKeyActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTargetingKeyActionType() {
        return customTargetingKeyActionType;
    }

    /**
     * Sets the value of the customTargetingKeyActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTargetingKeyActionType(String value) {
        this.customTargetingKeyActionType = value;
    }

}
