
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the result data of a job. This contains both the results of
 *             successfully processed operations as well as errors returned by failed
 *             operations.
 *           
 * 
 * <p>Java class for JobResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JobResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SimpleMutateResult" type="{https://adwords.google.com/api/adwords/cm/v201509}SimpleMutateResult"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JobResult", propOrder = {
    "simpleMutateResult"
})
public class JobResult {

    @XmlElement(name = "SimpleMutateResult")
    protected SimpleMutateResult simpleMutateResult;

    /**
     * Gets the value of the simpleMutateResult property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleMutateResult }
     *     
     */
    public SimpleMutateResult getSimpleMutateResult() {
        return simpleMutateResult;
    }

    /**
     * Sets the value of the simpleMutateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMutateResult }
     *     
     */
    public void setSimpleMutateResult(SimpleMutateResult value) {
        this.simpleMutateResult = value;
    }

}
