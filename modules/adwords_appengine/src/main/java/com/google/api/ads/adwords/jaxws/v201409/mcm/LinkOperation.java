
package com.google.api.ads.adwords.jaxws.v201409.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201409.cm.Operation;


/**
 * 
 *             Operation for modifying ManagedCustomer links. See {@link ManagedCustomerService#mutateLink}.
 *           
 * 
 * <p>Java class for LinkOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201409}ManagedCustomerLink" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkOperation", propOrder = {
    "operand"
})
public class LinkOperation
    extends Operation
{

    protected ManagedCustomerLink operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedCustomerLink }
     *     
     */
    public ManagedCustomerLink getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedCustomerLink }
     *     
     */
    public void setOperand(ManagedCustomerLink value) {
        this.operand = value;
    }

}
