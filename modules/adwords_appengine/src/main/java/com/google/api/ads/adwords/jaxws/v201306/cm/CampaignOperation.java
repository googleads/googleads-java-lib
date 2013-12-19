
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An operation on an AdWords campaign.
 *             <p class="note"><b>Note:</b> The <code>REMOVE</code> operator is not
 *             supported. To remove a campaign, set its {@link Campaign#status status}
 *             to <code>DELETED</code>.</p>
 *           
 * 
 * <p>Java class for CampaignOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201306}Campaign" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignOperation", propOrder = {
    "operand"
})
public class CampaignOperation
    extends Operation
{

    protected Campaign operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link Campaign }
     *     
     */
    public Campaign getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link Campaign }
     *     
     */
    public void setOperand(Campaign value) {
        this.operand = value;
    }

}
