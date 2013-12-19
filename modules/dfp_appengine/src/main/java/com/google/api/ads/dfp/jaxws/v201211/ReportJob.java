
package com.google.api.ads.dfp.jaxws.v201211;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a report job that will be run to retrieve performance and
 *             statistics information about ad campaigns, networks, inventory and sales.
 *           
 * 
 * <p>Java class for ReportJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportJob">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="reportQuery" type="{https://www.google.com/apis/ads/publisher/v201211}ReportQuery" minOccurs="0"/>
 *         &lt;element name="reportJobStatus" type="{https://www.google.com/apis/ads/publisher/v201211}ReportJobStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportJob", propOrder = {
    "id",
    "reportQuery",
    "reportJobStatus"
})
public class ReportJob {

    protected Long id;
    protected ReportQuery reportQuery;
    protected ReportJobStatus reportJobStatus;

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
     * Gets the value of the reportQuery property.
     * 
     * @return
     *     possible object is
     *     {@link ReportQuery }
     *     
     */
    public ReportQuery getReportQuery() {
        return reportQuery;
    }

    /**
     * Sets the value of the reportQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportQuery }
     *     
     */
    public void setReportQuery(ReportQuery value) {
        this.reportQuery = value;
    }

    /**
     * Gets the value of the reportJobStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ReportJobStatus }
     *     
     */
    public ReportJobStatus getReportJobStatus() {
        return reportJobStatus;
    }

    /**
     * Sets the value of the reportJobStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportJobStatus }
     *     
     */
    public void setReportJobStatus(ReportJobStatus value) {
        this.reportJobStatus = value;
    }

}
