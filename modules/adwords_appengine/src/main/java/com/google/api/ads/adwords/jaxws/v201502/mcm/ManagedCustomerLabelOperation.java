
package com.google.api.ads.adwords.jaxws.v201502.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201502.cm.Operation;


/**
 * 
 *             An operation to apply or remove an account label from a managed customer.
 *           
 * 
 * <p>Java class for ManagedCustomerLabelOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerLabelOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201502}ManagedCustomerLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerLabelOperation", propOrder = {
    "operand"
})
public class ManagedCustomerLabelOperation
    extends Operation
{

    protected ManagedCustomerLabel operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomerLabel }
     *     
     */
    public ManagedCustomerLabel getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomerLabel }
     *     
     */
    public void setOperand(ManagedCustomerLabel value) {
        this.operand = value;
    }

}
