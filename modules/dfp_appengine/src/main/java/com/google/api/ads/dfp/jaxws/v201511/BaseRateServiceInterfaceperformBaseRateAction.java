
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link BaseRate} objects that satisfy the given
 *             {@link Statement#query}.
 *             
 *             @param baseRateAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of base rates.
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performBaseRateAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performBaseRateAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="baseRateAction" type="{https://www.google.com/apis/ads/publisher/v201511}BaseRateAction" minOccurs="0"/>
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
    "baseRateAction",
    "filterStatement"
})
@XmlRootElement(name = "performBaseRateAction")
public class BaseRateServiceInterfaceperformBaseRateAction {

    protected BaseRateAction baseRateAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the baseRateAction property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateAction }
     *     
     */
    public BaseRateAction getBaseRateAction() {
        return baseRateAction;
    }

    /**
     * Sets the value of the baseRateAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateAction }
     *     
     */
    public void setBaseRateAction(BaseRateAction value) {
        this.baseRateAction = value;
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
