
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An event defined by a status change of a job.
 *           
 * 
 * <p>Java class for JobEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobEvent.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobEvent", propOrder = {
    "dateTime",
    "jobEventType"
})
public class JobEvent {

    protected String dateTime;
    @XmlElement(name = "JobEvent.Type")
    protected String jobEventType;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(String value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the jobEventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobEventType() {
        return jobEventType;
    }

    /**
     * Sets the value of the jobEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobEventType(String value) {
        this.jobEventType = value;
    }

}
