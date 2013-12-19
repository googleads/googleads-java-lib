
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a failure result for an individual mutate operation.
 *             
 *             <p>Currently, operations are applied in transactional batches, so the
 *             corresponding operation for this result may not itself be faulty.</p>
 *             
 *             <p>The errors in the exception may contain {@code OGNL path}s that identify
 *             the faulty operations in the batch. Please see the subsequent
 *             {@link BatchFailureResult}s to determine the remaining operations that were
 *             also applied in the batch and their positions within the batch.</p>
 *           
 * 
 * <p>Java class for FailureResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}OperationResult">
 *       &lt;sequence>
 *         &lt;element name="cause" type="{https://adwords.google.com/api/adwords/cm/v201306}ApiException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FailureResult", propOrder = {
    "cause"
})
public class FailureResult
    extends OperationResult
{

    protected ApiException cause;

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link ApiException }
     *     
     */
    public ApiException getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiException }
     *     
     */
    public void setCause(ApiException value) {
        this.cause = value;
    }

}
