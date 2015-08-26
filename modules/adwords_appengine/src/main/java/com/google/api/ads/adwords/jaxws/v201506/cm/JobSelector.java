
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             For selecting jobs whose information will be returned from a get method call
 *             of a job service.
 *           
 * 
 * <p>Java class for JobSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="includeHistory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="includeStats" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JobSelector.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobSelector", propOrder = {
    "includeHistory",
    "includeStats",
    "jobSelectorType"
})
@XmlSeeAlso({
    BulkMutateJobSelector.class
})
public abstract class JobSelector {

    protected Boolean includeHistory;
    protected Boolean includeStats;
    @XmlElement(name = "JobSelector.Type")
    protected String jobSelectorType;

    /**
     * Gets the value of the includeHistory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeHistory() {
        return includeHistory;
    }

    /**
     * Sets the value of the includeHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeHistory(Boolean value) {
        this.includeHistory = value;
    }

    /**
     * Gets the value of the includeStats property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeStats() {
        return includeStats;
    }

    /**
     * Sets the value of the includeStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeStats(Boolean value) {
        this.includeStats = value;
    }

    /**
     * Gets the value of the jobSelectorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobSelectorType() {
        return jobSelectorType;
    }

    /**
     * Sets the value of the jobSelectorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobSelectorType(String value) {
        this.jobSelectorType = value;
    }

}
