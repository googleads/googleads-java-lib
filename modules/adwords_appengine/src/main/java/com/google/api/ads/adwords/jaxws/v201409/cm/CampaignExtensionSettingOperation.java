
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Operation used to create or mutate a CampaignExtensionSetting.
 *           
 * 
 * <p>Java class for CampaignExtensionSettingOperation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignExtensionSettingOperation">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201409}Operation">
 *       &lt;sequence>
 *         &lt;element name="operand" type="{https://adwords.google.com/api/adwords/cm/v201409}CampaignExtensionSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignExtensionSettingOperation", propOrder = {
    "operand"
})
public class CampaignExtensionSettingOperation
    extends Operation
{

    protected CampaignExtensionSetting operand;

    /**
     * Gets the value of the operand property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignExtensionSetting }
     *     
     */
    public CampaignExtensionSetting getOperand() {
        return operand;
    }

    /**
     * Sets the value of the operand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignExtensionSetting }
     *     
     */
    public void setOperand(CampaignExtensionSetting value) {
        this.operand = value;
    }

}
