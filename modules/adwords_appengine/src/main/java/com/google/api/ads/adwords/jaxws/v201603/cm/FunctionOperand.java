
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A function operand in a matching function.
 *             Used to represent nested functions.
 *           
 * 
 * <p>Java class for FunctionOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/cm/v201603}Function" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionOperand", propOrder = {
    "value"
})
public class FunctionOperand
    extends FunctionArgumentOperand
{

    protected Function value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setValue(Function value) {
        this.value = value;
    }

}
