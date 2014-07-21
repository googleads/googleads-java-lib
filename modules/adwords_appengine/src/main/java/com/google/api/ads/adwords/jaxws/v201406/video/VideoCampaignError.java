
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.ApiError;


/**
 * 
 *             Base error class for VideoCampaignService.
 *             <p/>
 *             Note that this class is associated to
 *             {@link com.google.ads.api.services.campaignmgmt.campaign.CampaignError}.
 *             The prefix used for the messages is "CAMPAIGN" and not "VIDEO_CAMPAIGN"
 *             See {@link VideoApiErrorLocalizer#getReasonId()} for details.
 *           
 * 
 * <p>Java class for VideoCampaignError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoCampaignError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/video/v201406}VideoCampaignError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoCampaignError", propOrder = {
    "reason"
})
public class VideoCampaignError
    extends ApiError
{

    protected VideoCampaignErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCampaignErrorReason }
     *     
     */
    public VideoCampaignErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCampaignErrorReason }
     *     
     */
    public void setReason(VideoCampaignErrorReason value) {
        this.reason = value;
    }

}
