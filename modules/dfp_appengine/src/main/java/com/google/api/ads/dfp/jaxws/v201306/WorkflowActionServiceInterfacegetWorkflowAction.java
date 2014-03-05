
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link WorkflowAction} uniquely identified by the given ID.
 *             
 *             @param workflowActionId the ID of the workflow action, which must already exist
 *             @return the {@code WorkflowAction} uniquely identified by the given ID.
 *           
 * 
 * <p>Java class for getWorkflowAction element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getWorkflowAction">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="workflowActionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "workflowActionId"
})
@XmlRootElement(name = "getWorkflowAction")
public class WorkflowActionServiceInterfacegetWorkflowAction {

    protected Long workflowActionId;

    /**
     * Gets the value of the workflowActionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWorkflowActionId() {
        return workflowActionId;
    }

    /**
     * Sets the value of the workflowActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWorkflowActionId(Long value) {
        this.workflowActionId = value;
    }

}
