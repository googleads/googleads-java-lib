
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link CustomTargetingKey} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param customTargetingKeyAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of custom targeting keys
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performCustomTargetingKeyAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performCustomTargetingKeyAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="customTargetingKeyAction" type="{https://www.google.com/apis/ads/publisher/v201602}CustomTargetingKeyAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201602}Statement" minOccurs="0"/>
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
    "customTargetingKeyAction",
    "filterStatement"
})
@XmlRootElement(name = "performCustomTargetingKeyAction")
public class CustomTargetingServiceInterfaceperformCustomTargetingKeyAction {

    protected CustomTargetingKeyAction customTargetingKeyAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the customTargetingKeyAction property.
     * 
     * @return
     *     possible object is
     *     {@link CustomTargetingKeyAction }
     *     
     */
    public CustomTargetingKeyAction getCustomTargetingKeyAction() {
        return customTargetingKeyAction;
    }

    /**
     * Sets the value of the customTargetingKeyAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomTargetingKeyAction }
     *     
     */
    public void setCustomTargetingKeyAction(CustomTargetingKeyAction value) {
        this.customTargetingKeyAction = value;
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
