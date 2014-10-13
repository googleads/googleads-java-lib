
package com.google.api.ads.adwords.jaxws.v201409.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Contains offline-validation and approval results for a given FeedItem and FeedMapping. Each
 *             validation detail indicates any issues found on the feed item when used in the context
 *             of the feed mapping.
 *           
 * 
 * <p>Java class for FeedItemValidationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemValidationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feedMappingId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="validationStatus" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemValidationDetail.ValidationStatus" minOccurs="0"/>
 *         &lt;element name="validationErrors" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemAttributeError" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201409}FeedItemValidationDetail.ApprovalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemValidationDetail", propOrder = {
    "feedMappingId",
    "validationStatus",
    "validationErrors",
    "approvalStatus"
})
public class FeedItemValidationDetail {

    protected Long feedMappingId;
    protected FeedItemValidationDetailValidationStatus validationStatus;
    protected List<FeedItemAttributeError> validationErrors;
    protected FeedItemValidationDetailApprovalStatus approvalStatus;

    /**
     * Gets the value of the feedMappingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFeedMappingId() {
        return feedMappingId;
    }

    /**
     * Sets the value of the feedMappingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFeedMappingId(Long value) {
        this.feedMappingId = value;
    }

    /**
     * Gets the value of the validationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemValidationDetailValidationStatus }
     *     
     */
    public FeedItemValidationDetailValidationStatus getValidationStatus() {
        return validationStatus;
    }

    /**
     * Sets the value of the validationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemValidationDetailValidationStatus }
     *     
     */
    public void setValidationStatus(FeedItemValidationDetailValidationStatus value) {
        this.validationStatus = value;
    }

    /**
     * Gets the value of the validationErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validationErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidationErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeedItemAttributeError }
     * 
     * 
     */
    public List<FeedItemAttributeError> getValidationErrors() {
        if (validationErrors == null) {
            validationErrors = new ArrayList<FeedItemAttributeError>();
        }
        return this.validationErrors;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FeedItemValidationDetailApprovalStatus }
     *     
     */
    public FeedItemValidationDetailApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedItemValidationDetailApprovalStatus }
     *     
     */
    public void setApprovalStatus(FeedItemValidationDetailApprovalStatus value) {
        this.approvalStatus = value;
    }

}
