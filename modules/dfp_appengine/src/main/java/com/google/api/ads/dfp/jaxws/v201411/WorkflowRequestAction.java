
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on {@link WorkflowRequest} objects.
 *           
 * 
 * <p>Java class for WorkflowRequestAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowRequestAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WorkflowRequestAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowRequestAction", propOrder = {
    "workflowRequestActionType"
})
@XmlSeeAlso({
    ApproveWorkflowApprovalRequests.class,
    RejectWorkflowApprovalRequests.class,
    SkipWorkflowExternalConditionRequests.class,
    TriggerWorkflowExternalConditionRequests.class
})
public abstract class WorkflowRequestAction {

    @XmlElement(name = "WorkflowRequestAction.Type")
    protected String workflowRequestActionType;

    /**
     * Gets the value of the workflowRequestActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowRequestActionType() {
        return workflowRequestActionType;
    }

    /**
     * Sets the value of the workflowRequestActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowRequestActionType(String value) {
        this.workflowRequestActionType = value;
    }

}
