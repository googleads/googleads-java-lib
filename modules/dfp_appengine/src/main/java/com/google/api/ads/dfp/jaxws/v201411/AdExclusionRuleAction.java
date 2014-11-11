
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link AdExclusionRule} objects.
 *           
 * 
 * <p>Java class for AdExclusionRuleAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdExclusionRuleAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdExclusionRuleAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdExclusionRuleAction", propOrder = {
    "adExclusionRuleActionType"
})
@XmlSeeAlso({
    DeactivateAdExclusionRules.class,
    ActivateAdExclusionRules.class
})
public abstract class AdExclusionRuleAction {

    @XmlElement(name = "AdExclusionRuleAction.Type")
    protected String adExclusionRuleActionType;

    /**
     * Gets the value of the adExclusionRuleActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdExclusionRuleActionType() {
        return adExclusionRuleActionType;
    }

    /**
     * Sets the value of the adExclusionRuleActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdExclusionRuleActionType(String value) {
        this.adExclusionRuleActionType = value;
    }

}
