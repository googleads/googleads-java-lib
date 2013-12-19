
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CustomTargetingValue} objects that match the
 *             given {@link Statement#query}.
 *             
 *             @param customTargetingValueAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of ad units
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performCustomTargetingValueAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCustomTargetingValueAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customTargetingValueAction" type="{https://www.google.com/apis/ads/publisher/v201308}CustomTargetingValueAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201308}Statement" minOccurs="0"/>
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
    "customTargetingValueAction",
    "filterStatement"
})
@XmlRootElement(name = "performCustomTargetingValueAction")
public class CustomTargetingServiceInterfaceperformCustomTargetingValueAction {

    protected CustomTargetingValueAction customTargetingValueAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the customTargetingValueAction property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTargetingValueAction }
     *     
     */
    public CustomTargetingValueAction getCustomTargetingValueAction() {
        return customTargetingValueAction;
    }

    /**
     * Sets the value of the customTargetingValueAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTargetingValueAction }
     *     
     */
    public void setCustomTargetingValueAction(CustomTargetingValueAction value) {
        this.customTargetingValueAction = value;
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
