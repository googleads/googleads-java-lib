
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link AdRule} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param adRuleAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of ad rules
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performAdRuleAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performAdRuleAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="adRuleAction" type="{https://www.google.com/apis/ads/publisher/v201306}AdRuleAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201306}Statement" minOccurs="0"/>
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
    "adRuleAction",
    "filterStatement"
})
@XmlRootElement(name = "performAdRuleAction")
public class AdRuleServiceInterfaceperformAdRuleAction {

    protected AdRuleAction adRuleAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the adRuleAction property.
     * 
     * @return
     *     possible object is
     *     {@link AdRuleAction }
     *     
     */
    public AdRuleAction getAdRuleAction() {
        return adRuleAction;
    }

    /**
     * Sets the value of the adRuleAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRuleAction }
     *     
     */
    public void setAdRuleAction(AdRuleAction value) {
        this.adRuleAction = value;
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
