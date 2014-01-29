
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignSharedSetError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignSharedSetError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201309}CampaignSharedSetError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignSharedSetError", propOrder = {
    "reason"
})
public class CampaignSharedSetError
    extends ApiError
{

    protected CampaignSharedSetErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSharedSetErrorReason }
     *     
     */
    public CampaignSharedSetErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSharedSetErrorReason }
     *     
     */
    public void setReason(CampaignSharedSetErrorReason value) {
        this.reason = value;
    }

}
