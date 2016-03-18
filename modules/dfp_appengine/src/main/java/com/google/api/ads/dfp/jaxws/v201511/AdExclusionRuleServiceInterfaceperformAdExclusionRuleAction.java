
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs action on {@link AdExclusionRule} objects that satisfy the
 *             given {@link Statement#query}.
 *             
 *             @param adExclusionRuleAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of ad exclusion rules
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performAdExclusionRuleAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performAdExclusionRuleAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adExclusionRuleAction" type="{https://www.google.com/apis/ads/publisher/v201511}AdExclusionRuleAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201511}Statement" minOccurs="0"/>
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
    "adExclusionRuleAction",
    "filterStatement"
})
@XmlRootElement(name = "performAdExclusionRuleAction")
public class AdExclusionRuleServiceInterfaceperformAdExclusionRuleAction {

    protected AdExclusionRuleAction adExclusionRuleAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the adExclusionRuleAction property.
     * 
     * @return
     *     possible object is
     *     {@link AdExclusionRuleAction }
     *     
     */
    public AdExclusionRuleAction getAdExclusionRuleAction() {
        return adExclusionRuleAction;
    }

    /**
     * Sets the value of the adExclusionRuleAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExclusionRuleAction }
     *     
     */
    public void setAdExclusionRuleAction(AdExclusionRuleAction value) {
        this.adExclusionRuleAction = value;
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
