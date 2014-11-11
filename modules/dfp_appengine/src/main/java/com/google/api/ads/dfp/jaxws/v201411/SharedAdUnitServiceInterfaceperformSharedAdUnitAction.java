
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on shared ad unit objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param sharedAdUnitAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of shared ad units
 *             @return the result of the update action, which contains the number of shared ad units
 *             on which the action was performed.
 *           
 * 
 * <p>Java class for performSharedAdUnitAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performSharedAdUnitAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="sharedAdUnitAction" type="{https://www.google.com/apis/ads/publisher/v201411}SharedAdUnitAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201411}Statement" minOccurs="0"/>
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
    "sharedAdUnitAction",
    "filterStatement"
})
@XmlRootElement(name = "performSharedAdUnitAction")
public class SharedAdUnitServiceInterfaceperformSharedAdUnitAction {

    protected SharedAdUnitAction sharedAdUnitAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the sharedAdUnitAction property.
     * 
     * @return
     *     possible object is
     *     {@link SharedAdUnitAction }
     *     
     */
    public SharedAdUnitAction getSharedAdUnitAction() {
        return sharedAdUnitAction;
    }

    /**
     * Sets the value of the sharedAdUnitAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SharedAdUnitAction }
     *     
     */
    public void setSharedAdUnitAction(SharedAdUnitAction value) {
        this.sharedAdUnitAction = value;
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
