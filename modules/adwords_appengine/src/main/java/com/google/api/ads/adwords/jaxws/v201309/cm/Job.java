
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an asynchronous macro unit of work.
 *           
 * 
 * <p>Java class for Job complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Job">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="failureReason" type="{https://adwords.google.com/api/adwords/cm/v201309}ApiErrorReason" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/cm/v201309}JobStats" minOccurs="0"/>
 *         &lt;element name="billingSummary" type="{https://adwords.google.com/api/adwords/cm/v201309}BillingSummary" minOccurs="0"/>
 *         &lt;element name="Job.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Job", propOrder = {
    "failureReason",
    "stats",
    "billingSummary",
    "jobType"
})
@XmlSeeAlso({
    BulkMutateJob.class,
    SimpleMutateJob.class
})
public abstract class Job {

    protected ApiErrorReason failureReason;
    protected JobStats stats;
    protected BillingSummary billingSummary;
    @XmlElement(name = "Job.Type")
    protected String jobType;

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link ApiErrorReason }
     *     
     */
    public ApiErrorReason getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiErrorReason }
     *     
     */
    public void setFailureReason(ApiErrorReason value) {
        this.failureReason = value;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link JobStats }
     *     
     */
    public JobStats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobStats }
     *     
     */
    public void setStats(JobStats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the billingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSummary }
     *     
     */
    public BillingSummary getBillingSummary() {
        return billingSummary;
    }

    /**
     * Sets the value of the billingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSummary }
     *     
     */
    public void setBillingSummary(BillingSummary value) {
        this.billingSummary = value;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobType() {
        return jobType;
    }

    /**
     * Sets the value of the jobType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobType(String value) {
        this.jobType = value;
    }

}
