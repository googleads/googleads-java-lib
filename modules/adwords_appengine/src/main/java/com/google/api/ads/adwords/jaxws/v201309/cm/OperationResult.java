
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the result of an individual mutate operation.
 *           
 * 
 * <p>Java class for OperationResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationResult.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationResult", propOrder = {
    "operationResultType"
})
@XmlSeeAlso({
    BatchFailureResult.class,
    UnprocessedResult.class,
    FailureResult.class,
    ReturnValueResult.class,
    LostResult.class
})
public abstract class OperationResult {

    @XmlElement(name = "OperationResult.Type")
    protected String operationResultType;

    /**
     * Gets the value of the operationResultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationResultType() {
        return operationResultType;
    }

    /**
     * Sets the value of the operationResultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationResultType(String value) {
        this.operationResultType = value;
    }

}
