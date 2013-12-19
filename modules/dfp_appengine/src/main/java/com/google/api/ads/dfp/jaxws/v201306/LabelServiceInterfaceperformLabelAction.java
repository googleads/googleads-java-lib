
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Performs actions on {@link Label} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param labelAction the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter
 *             a set of labels
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performLabelAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performLabelAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="labelAction" type="{https://www.google.com/apis/ads/publisher/v201306}LabelAction" minOccurs="0"/>
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
    "labelAction",
    "filterStatement"
})
@XmlRootElement(name = "performLabelAction")
public class LabelServiceInterfaceperformLabelAction {

    protected LabelAction labelAction;
    protected Statement filterStatement;

    /**
     * Gets the value of the labelAction property.
     * 
     * @return
     *     possible object is
     *     {@link LabelAction }
     *     
     */
    public LabelAction getLabelAction() {
        return labelAction;
    }

    /**
     * Sets the value of the labelAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelAction }
     *     
     */
    public void setLabelAction(LabelAction value) {
        this.labelAction = value;
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
