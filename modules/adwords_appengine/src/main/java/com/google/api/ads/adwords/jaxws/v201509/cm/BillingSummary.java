
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the billing summary of the job that provides the overall cost of
 *             the job's operations, i.e., for the work done <i>by</i> the job. This
 *             therefore excludes the cost of operating on the job itself - setting up the
 *             job, polling for its status, retrieving the result, etc.
 *           
 * 
 * <p>Java class for BillingSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOperations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numUnits" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingSummary", propOrder = {
    "numOperations",
    "numUnits"
})
public class BillingSummary {

    protected Integer numOperations;
    protected Long numUnits;

    /**
     * Gets the value of the numOperations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumOperations() {
        return numOperations;
    }

    /**
     * Sets the value of the numOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumOperations(Integer value) {
        this.numOperations = value;
    }

    /**
     * Gets the value of the numUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumUnits() {
        return numUnits;
    }

    /**
     * Sets the value of the numUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumUnits(Long value) {
        this.numUnits = value;
    }

}
