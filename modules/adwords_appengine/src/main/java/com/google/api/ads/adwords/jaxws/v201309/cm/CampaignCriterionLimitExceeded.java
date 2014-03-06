
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Error to indicate that too many negative criteria added to some campaign.
 *           
 * 
 * <p>Java class for CampaignCriterionLimitExceeded complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignCriterionLimitExceeded">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}EntityCountLimitExceeded">
 *       &lt;sequence>
 *         &lt;element name="limitType" type="{https://adwords.google.com/api/adwords/cm/v201309}CampaignCriterionLimitExceeded.CriteriaLimitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignCriterionLimitExceeded", propOrder = {
    "limitType"
})
public class CampaignCriterionLimitExceeded
    extends EntityCountLimitExceeded
{

    protected CampaignCriterionLimitExceededCriteriaLimitType limitType;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignCriterionLimitExceededCriteriaLimitType }
     *     
     */
    public CampaignCriterionLimitExceededCriteriaLimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignCriterionLimitExceededCriteriaLimitType }
     *     
     */
    public void setLimitType(CampaignCriterionLimitExceededCriteriaLimitType value) {
        this.limitType = value;
    }

}
