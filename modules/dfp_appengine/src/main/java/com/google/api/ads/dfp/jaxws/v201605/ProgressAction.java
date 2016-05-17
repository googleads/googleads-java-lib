
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An action that is being or was done to progress the workflow.
 *           
 * 
 * <p>Java class for ProgressAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgressAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evaluationTime" type="{https://www.google.com/apis/ads/publisher/v201605}DateTime" minOccurs="0"/>
 *         &lt;element name="evaluationStatus" type="{https://www.google.com/apis/ads/publisher/v201605}EvaluationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgressAction", propOrder = {
    "evaluationTime",
    "evaluationStatus"
})
@XmlSeeAlso({
    ReserveInventoryProgressAction.class,
    RequestApprovalProgressAction.class,
    SendNotificationProgressAction.class
})
public abstract class ProgressAction {

    protected DateTime evaluationTime;
    @XmlSchemaType(name = "string")
    protected EvaluationStatus evaluationStatus;

    /**
     * Gets the value of the evaluationTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEvaluationTime() {
        return evaluationTime;
    }

    /**
     * Sets the value of the evaluationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEvaluationTime(DateTime value) {
        this.evaluationTime = value;
    }

    /**
     * Gets the value of the evaluationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EvaluationStatus }
     *     
     */
    public EvaluationStatus getEvaluationStatus() {
        return evaluationStatus;
    }

    /**
     * Sets the value of the evaluationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvaluationStatus }
     *     
     */
    public void setEvaluationStatus(EvaluationStatus value) {
        this.evaluationStatus = value;
    }

}
