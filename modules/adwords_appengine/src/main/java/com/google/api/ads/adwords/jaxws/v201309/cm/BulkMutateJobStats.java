
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Bulk mutate job-handling statistics.
 *           
 * 
 * <p>Java class for BulkMutateJobStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BulkMutateJobStats">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}JobStats">
 *       &lt;sequence>
 *         &lt;element name="numOperations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numFailedOperations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numUnprocessedOperations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BulkMutateJobStats", propOrder = {
    "numOperations",
    "numFailedOperations",
    "numUnprocessedOperations"
})
public class BulkMutateJobStats
    extends JobStats
{

    protected Integer numOperations;
    protected Integer numFailedOperations;
    protected Integer numUnprocessedOperations;

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
     * Gets the value of the numFailedOperations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumFailedOperations() {
        return numFailedOperations;
    }

    /**
     * Sets the value of the numFailedOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumFailedOperations(Integer value) {
        this.numFailedOperations = value;
    }

    /**
     * Gets the value of the numUnprocessedOperations property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumUnprocessedOperations() {
        return numUnprocessedOperations;
    }

    /**
     * Sets the value of the numUnprocessedOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumUnprocessedOperations(Integer value) {
        this.numUnprocessedOperations = value;
    }

}
