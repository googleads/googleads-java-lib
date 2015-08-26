
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code WorkflowExternalConditionRequest} represents a workflow condition that requires external
 *             system to determine the result.
 *           
 * 
 * <p>Java class for WorkflowExternalConditionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowExternalConditionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201502}WorkflowRequest">
 *       &lt;sequence>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201502}WorkflowExternalConditionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkflowExternalConditionRequest", propOrder = {
    "status"
})
public class WorkflowExternalConditionRequest
    extends WorkflowRequest
{

    @XmlSchemaType(name = "string")
    protected WorkflowExternalConditionStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowExternalConditionStatus }
     *     
     */
    public WorkflowExternalConditionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowExternalConditionStatus }
     *     
     */
    public void setStatus(WorkflowExternalConditionStatus value) {
        this.status = value;
    }

}
