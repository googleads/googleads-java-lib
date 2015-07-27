
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with workflow validation.
 *             <p>In versions V201502 and earlier, the workflow error message defined by a network administrator
 *             that describes how a workflow rule is violated is stored in the {@link #trigger}. Beginning in
 *             V201505, it is stored in the {@link #errorString}.
 *           
 * 
 * <p>Java class for WorkflowValidationError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowValidationError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201505}WorkflowValidationError.Reason" minOccurs="0"/>
 *         &lt;element name="workflowErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowValidationError", propOrder = {
    "reason",
    "workflowErrorMessage"
})
public class WorkflowValidationError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected WorkflowValidationErrorReason reason;
    protected String workflowErrorMessage;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowValidationErrorReason }
     *     
     */
    public WorkflowValidationErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowValidationErrorReason }
     *     
     */
    public void setReason(WorkflowValidationErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the workflowErrorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowErrorMessage() {
        return workflowErrorMessage;
    }

    /**
     * Sets the value of the workflowErrorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowErrorMessage(String value) {
        this.workflowErrorMessage = value;
    }

}
