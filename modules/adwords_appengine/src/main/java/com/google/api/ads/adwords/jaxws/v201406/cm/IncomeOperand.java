
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This operand specifies the income bracket a household falls under.
 *           
 * 
 * <p>Java class for IncomeOperand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomeOperand">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}FunctionArgumentOperand">
 *       &lt;sequence>
 *         &lt;element name="tier" type="{https://adwords.google.com/api/adwords/cm/v201406}IncomeTier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeOperand", propOrder = {
    "tier"
})
public class IncomeOperand
    extends FunctionArgumentOperand
{

    protected IncomeTier tier;

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeTier }
     *     
     */
    public IncomeTier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeTier }
     *     
     */
    public void setTier(IncomeTier value) {
        this.tier = value;
    }

}
