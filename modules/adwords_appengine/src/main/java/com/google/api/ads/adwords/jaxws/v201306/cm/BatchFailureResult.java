
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a failure result for a mutate operation that was applied in a
 *             transactional batch. It does not imply that the corresponding operation
 *             for this result itself caused the failure. To determine that, please see
 *             the {@link FailureResult} provided for the first operation of the batch.
 *           
 * 
 * <p>Java class for BatchFailureResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BatchFailureResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}OperationResult">
 *       &lt;sequence>
 *         &lt;element name="operationIndexInBatch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchFailureResult", propOrder = {
    "operationIndexInBatch"
})
public class BatchFailureResult
    extends OperationResult
{

    protected Integer operationIndexInBatch;

    /**
     * Gets the value of the operationIndexInBatch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperationIndexInBatch() {
        return operationIndexInBatch;
    }

    /**
     * Sets the value of the operationIndexInBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperationIndexInBatch(Integer value) {
        this.operationIndexInBatch = value;
    }

}
