
package com.google.api.ads.adwords.jaxws.v201406.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Operation;


/**
 * 
 *             An operation on a managed customer.
 *             <p class="note"><b>Note:</b> only <code>ADD</code> operator is supported.</p>
 *           
 * 
 * <p>Java class for ManagedCustomerOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCustomerOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201406}ManagedCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCustomerOperation", propOrder = {
    "operand"
})
public class ManagedCustomerOperation
    extends Operation
{

    protected ManagedCustomer operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomer }
     *     
     */
    public ManagedCustomer getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomer }
     *     
     */
    public void setOperand(ManagedCustomer value) {
        this.operand = value;
    }

}
