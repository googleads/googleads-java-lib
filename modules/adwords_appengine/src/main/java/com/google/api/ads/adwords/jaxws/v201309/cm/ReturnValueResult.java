
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a success result of processing a mutate operation that returned
 *             a value.
 *           
 * 
 * <p>Java class for ReturnValueResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnValueResult">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}OperationResult">
 *       &lt;sequence>
 *         &lt;element name="returnValue" type="{https://adwords.google.com/api/adwords/cm/v201309}Operand" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnValueResult", propOrder = {
    "returnValue"
})
public class ReturnValueResult
    extends OperationResult
{

    protected Operand returnValue;

    /**
     * Gets the value of the returnValue property.
     * 
     * @return
     *     possible object is
     *     {@link Operand }
     *     
     */
    public Operand getReturnValue() {
        return returnValue;
    }

    /**
     * Sets the value of the returnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operand }
     *     
     */
    public void setReturnValue(Operand value) {
        this.returnValue = value;
    }

}
