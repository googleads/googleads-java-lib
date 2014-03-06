
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs action on {@link ProductTemplate} objects that satisfy the given
 *             {@link Statement#query}.
 *             
 *             @param action the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of product templates
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performProductTemplateAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performProductTemplateAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="action" type="{https://www.google.com/apis/ads/publisher/v201403}ProductTemplateAction" minOccurs="0"/>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201403}Statement" minOccurs="0"/>
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
    "action",
    "filterStatement"
})
@XmlRootElement(name = "performProductTemplateAction")
public class ProductTemplateServiceInterfaceperformProductTemplateAction {

    protected ProductTemplateAction action;
    protected Statement filterStatement;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTemplateAction }
     *     
     */
    public ProductTemplateAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTemplateAction }
     *     
     */
    public void setAction(ProductTemplateAction value) {
        this.action = value;
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
