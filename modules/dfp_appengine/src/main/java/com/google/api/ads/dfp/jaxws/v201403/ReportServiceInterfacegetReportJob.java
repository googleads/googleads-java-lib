
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns the {@link ReportJob} uniquely identified by the given ID with only the
 *             {@link ReportJob#reportJobStatus} and {@link ReportJob#id} fields filled in.
 *             
 *             <p>Replaced with {@code ReportService.getReportJobStatus} beginning in V201505.
 *             
 *             @param reportJobId the Id of the report job which must already exist
 *             @return the {@code ReportJob} uniquely identified by the given ID with the ID and status
 *             fields filled in.
 *           
 * 
 * <p>Java class for getReportJob element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReportJob">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="reportJobId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reportJobId"
})
@XmlRootElement(name = "getReportJob")
public class ReportServiceInterfacegetReportJob {

    protected Long reportJobId;

    /**
     * Gets the value of the reportJobId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportJobId() {
        return reportJobId;
    }

    /**
     * Sets the value of the reportJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportJobId(Long value) {
        this.reportJobId = value;
    }

}
