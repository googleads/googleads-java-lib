
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operations for adding/updating CampaignSharedSet entities.
 *           
 * 
 * <p>Java class for CampaignSharedSetOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignSharedSetOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201603}CampaignSharedSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignSharedSetOperation", propOrder = {
    "operand"
})
public class CampaignSharedSetOperation
    extends Operation
{

    protected CampaignSharedSet operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSharedSet }
     *     
     */
    public CampaignSharedSet getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSharedSet }
     *     
     */
    public void setOperand(CampaignSharedSet value) {
        this.operand = value;
    }

}
