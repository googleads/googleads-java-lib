
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A composite {@code DisapprovalReason} with the affected {@code
 *             ApprovalContext}.
 *           
 * 
 * <p>Java class for ScopedDisapprovalReason complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScopedDisapprovalReason">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approvalContext" type="{https://adwords.google.com/api/adwords/video/v201402}ApprovalContext" minOccurs="0"/>
 *         &lt;element name="disapprovalReason" type="{https://adwords.google.com/api/adwords/video/v201402}DisapprovalReason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScopedDisapprovalReason", propOrder = {
    "approvalContext",
    "disapprovalReason"
})
public class ScopedDisapprovalReason {

    protected ApprovalContext approvalContext;
    protected DisapprovalReason disapprovalReason;

    /**
     * Gets the value of the approvalContext property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalContext }
     *     
     */
    public ApprovalContext getApprovalContext() {
        return approvalContext;
    }

    /**
     * Sets the value of the approvalContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalContext }
     *     
     */
    public void setApprovalContext(ApprovalContext value) {
        this.approvalContext = value;
    }

    /**
     * Gets the value of the disapprovalReason property.
     * 
     * @return
     *     possible object is
     *     {@link DisapprovalReason }
     *     
     */
    public DisapprovalReason getDisapprovalReason() {
        return disapprovalReason;
    }

    /**
     * Sets the value of the disapprovalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisapprovalReason }
     *     
     */
    public void setDisapprovalReason(DisapprovalReason value) {
        this.disapprovalReason = value;
    }

}
