
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation for creating, modifying and promoting/archiving campaign trials.
 *           
 * 
 * <p>Java class for TrialOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrialOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201603}Trial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrialOperation", propOrder = {
    "operand"
})
public class TrialOperation
    extends Operation
{

    protected Trial operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link Trial }
     *     
     */
    public Trial getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trial }
     *     
     */
    public void setOperand(Trial value) {
        this.operand = value;
    }

}
