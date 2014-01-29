
package com.google.api.ads.adwords.jaxws.v201306.cm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code BulkMutateJob} is essentially a mixed collection of mutate
 *             operations from the following AdWords API campaign management services:
 *             <ul>
 *             <li>{@link CampaignService}</li>
 *             <li>{@link CampaignTargetService}</li>
 *             <li>{@link CampaignCriterionService}</li>
 *             <li>{@link AdGroupService}</li>
 *             <li>{@link AdGroupAdService}</li>
 *             <li>{@link AdGroupCriterionService}</li>
 *             </ul>
 *             
 *             <p>The mutate operations in a job's request are constructed in exactly the
 *             same way as they are for synchronous calls to these services.</p>
 *             
 *             <p>The mutate operations are grouped by their scoping entity in the
 *             AdWords customer tree. Currently, mutate operations can be grouped either
 *             by the customer or by their parent campaign. However, they cannot be
 *             grouped both ways - some by customer and others by campaigns - in the same
 *             job.</p>
 *             
 *             <p class="note"><b>Note:</b> A job may have no more than 500,000 mutate
 *             operations in total, and no more than 10 different scoping campaigns.</p>
 *             
 *             <p>The mutate operations must be packaged into containers called
 *             {@code Operation Streams}, each tagged with the ID of the scoping entity of
 *             its operations.</p>
 *             
 *             <p>To facilitate the building of very large bulk mutate jobs, the operation
 *             streams of a job can be submitted using multiple request parts. A job is
 *             queued for processing as soon as it can be determined that all of its
 *             request parts have been received.</p>
 *             
 *             <p class="note"><b>Note:</b> A job may have no more than 100 request parts.
 *             Each part may have no more than 25 operation streams and no more than 10,000
 *             operations in total.</p>
 *           
 * 
 * <p>Java class for BulkMutateJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMutateJob">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Job">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="policy" type="{https://adwords.google.com/api/adwords/cm/v201306}BulkMutateJobPolicy" minOccurs="0"/>
 *         &lt;element name="request" type="{https://adwords.google.com/api/adwords/cm/v201306}BulkMutateRequest" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201306}BasicJobStatus" minOccurs="0"/>
 *         &lt;element name="history" type="{https://adwords.google.com/api/adwords/cm/v201306}BulkMutateJobEvent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{https://adwords.google.com/api/adwords/cm/v201306}BulkMutateResult" minOccurs="0"/>
 *         &lt;element name="numRequestParts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numRequestPartsReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMutateJob", propOrder = {
    "id",
    "policy",
    "request",
    "status",
    "history",
    "result",
    "numRequestParts",
    "numRequestPartsReceived"
})
public class BulkMutateJob
    extends Job
{

    protected Long id;
    protected BulkMutateJobPolicy policy;
    protected BulkMutateRequest request;
    protected BasicJobStatus status;
    protected List<BulkMutateJobEvent> history;
    protected BulkMutateResult result;
    protected Integer numRequestParts;
    protected Integer numRequestPartsReceived;

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
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link BulkMutateJobPolicy }
     *     
     */
    public BulkMutateJobPolicy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkMutateJobPolicy }
     *     
     */
    public void setPolicy(BulkMutateJobPolicy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link BulkMutateRequest }
     *     
     */
    public BulkMutateRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkMutateRequest }
     *     
     */
    public void setRequest(BulkMutateRequest value) {
        this.request = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BasicJobStatus }
     *     
     */
    public BasicJobStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicJobStatus }
     *     
     */
    public void setStatus(BasicJobStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the history property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the history property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BulkMutateJobEvent }
     * 
     * 
     */
    public List<BulkMutateJobEvent> getHistory() {
        if (history == null) {
            history = new ArrayList<BulkMutateJobEvent>();
        }
        return this.history;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link BulkMutateResult }
     *     
     */
    public BulkMutateResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link BulkMutateResult }
     *     
     */
    public void setResult(BulkMutateResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the numRequestParts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRequestParts() {
        return numRequestParts;
    }

    /**
     * Sets the value of the numRequestParts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRequestParts(Integer value) {
        this.numRequestParts = value;
    }

    /**
     * Gets the value of the numRequestPartsReceived property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumRequestPartsReceived() {
        return numRequestPartsReceived;
    }

    /**
     * Sets the value of the numRequestPartsReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumRequestPartsReceived(Integer value) {
        this.numRequestPartsReceived = value;
    }

}
