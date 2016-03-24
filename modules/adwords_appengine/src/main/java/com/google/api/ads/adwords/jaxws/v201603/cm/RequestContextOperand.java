
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An operand in a function referring to a value in the request context.
 *           
 * 
 * <p>Java class for RequestContextOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestContextOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="contextType" type="{https://adwords.google.com/api/adwords/cm/v201603}RequestContextOperand.ContextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestContextOperand", propOrder = {
    "contextType"
})
public class RequestContextOperand
    extends FunctionArgumentOperand
{

    @XmlSchemaType(name = "string")
    protected RequestContextOperandContextType contextType;

    /**
     * Gets the value of the contextType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestContextOperandContextType }
     *     
     */
    public RequestContextOperandContextType getContextType() {
        return contextType;
    }

    /**
     * Sets the value of the contextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestContextOperandContextType }
     *     
     */
    public void setContextType(RequestContextOperandContextType value) {
        this.contextType = value;
    }

}
