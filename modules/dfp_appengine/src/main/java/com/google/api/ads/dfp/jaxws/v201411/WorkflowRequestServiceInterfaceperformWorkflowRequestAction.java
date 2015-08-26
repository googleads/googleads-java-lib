
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Perform actions on {@link WorkflowRequest} objects that match the given
 *             {@link Statement#query}.
 *             
 *             @param action the action to perform
 *             @param filterStatement a Publisher Query Language statement used to filter a set of workflow
 *             requests
 *             @return the result of the action performed
 *           
 * 
 * <p>Java class for performWorkflowRequestAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="performWorkflowRequestAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="action" type="{https://www.google.com/apis/ads/publisher/v201411}WorkflowRequestAction" minOccurs="0"/>
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
    "action",
    "filterStatement"
})
@XmlRootElement(name = "performWorkflowRequestAction")
public class WorkflowRequestServiceInterfaceperformWorkflowRequestAction {

    protected WorkflowRequestAction action;
    protected Statement filterStatement;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowRequestAction }
     *     
     */
    public WorkflowRequestAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowRequestAction }
     *     
     */
    public void setAction(WorkflowRequestAction value) {
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
