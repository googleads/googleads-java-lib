
package com.google.api.ads.adwords.jaxws.v201506.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201506.cm.Operation;


/**
 * 
 *             Operation for adding, updating, or deleting a label.
 *           
 * 
 * <p>Java class for AccountLabelOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountLabelOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/mcm/v201506}AccountLabel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLabelOperation", propOrder = {
    "operand"
})
public class AccountLabelOperation
    extends Operation
{

    protected AccountLabel operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLabel }
     *     
     */
    public AccountLabel getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLabel }
     *     
     */
    public void setOperand(AccountLabel value) {
        this.operand = value;
    }

}
