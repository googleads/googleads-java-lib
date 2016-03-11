
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains reconciliation data of an {@link Order} and/or {@link Proposal}.
 *           
 * 
 * <p>Java class for ReconciliationOrderReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReconciliationOrderReport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reconciliationReportId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="proposalId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="status" type="{https://www.google.com/apis/ads/publisher/v201505}ReconciliationOrderReportStatus" minOccurs="0"/>
 *         &lt;element name="submissionDateTime" type="{https://www.google.com/apis/ads/publisher/v201505}DateTime" minOccurs="0"/>
 *         &lt;element name="submitterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationOrderReport", propOrder = {
    "id",
    "reconciliationReportId",
    "orderId",
    "proposalId",
    "status",
    "submissionDateTime",
    "submitterId"
})
public class ReconciliationOrderReport {

    protected Long id;
    protected Long reconciliationReportId;
    protected Long orderId;
    protected Long proposalId;
    @XmlSchemaType(name = "string")
    protected ReconciliationOrderReportStatus status;
    protected DateTime submissionDateTime;
    protected Long submitterId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the reconciliationReportId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReconciliationReportId() {
        return reconciliationReportId;
    }

    /**
     * Sets the value of the reconciliationReportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReconciliationReportId(Long value) {
        this.reconciliationReportId = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the proposalId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProposalId() {
        return proposalId;
    }

    /**
     * Sets the value of the proposalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProposalId(Long value) {
        this.proposalId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationOrderReportStatus }
     *     
     */
    public ReconciliationOrderReportStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationOrderReportStatus }
     *     
     */
    public void setStatus(ReconciliationOrderReportStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the submissionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getSubmissionDateTime() {
        return submissionDateTime;
    }

    /**
     * Sets the value of the submissionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setSubmissionDateTime(DateTime value) {
        this.submissionDateTime = value;
    }

    /**
     * Gets the value of the submitterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubmitterId() {
        return submitterId;
    }

    /**
     * Sets the value of the submitterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubmitterId(Long value) {
        this.submitterId = value;
    }

}
