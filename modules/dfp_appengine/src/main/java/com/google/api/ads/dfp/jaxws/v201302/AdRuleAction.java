
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link AdRule} objects.
 *           
 * 
 * <p>Java class for AdRuleAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdRuleAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdRuleAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRuleAction", propOrder = {
    "adRuleActionType"
})
@XmlSeeAlso({
    ActivateAdRules.class,
    DeactivateAdRules.class,
    DeleteAdRules.class
})
public abstract class AdRuleAction {

    @XmlElement(name = "AdRuleAction.Type")
    protected String adRuleActionType;

    /**
     * Gets the value of the adRuleActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdRuleActionType() {
        return adRuleActionType;
    }

    /**
     * Sets the value of the adRuleActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdRuleActionType(String value) {
        this.adRuleActionType = value;
    }

}
