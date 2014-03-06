
package com.google.api.ads.adwords.jaxws.v201402.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Operation;


/**
 * 
 *             Operation for {@link BudgetOrder}.
 *           
 * 
 * <p>Java class for BudgetOrderOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BudgetOrderOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/billing/v201402}BudgetOrder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BudgetOrderOperation", propOrder = {
    "operand"
})
public class BudgetOrderOperation
    extends Operation
{

    protected BudgetOrder operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetOrder }
     *     
     */
    public BudgetOrder getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetOrder }
     *     
     */
    public void setOperand(BudgetOrder value) {
        this.operand = value;
    }

}
