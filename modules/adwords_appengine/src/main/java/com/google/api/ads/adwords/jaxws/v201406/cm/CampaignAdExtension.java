
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a campaign level ad extension. A campaign ad extension specifies
 *             a campaign and an ad extension which can extend any ad under that campaign.
 *           
 * 
 * <p>Java class for CampaignAdExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignAdExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="adExtension" type="{https://adwords.google.com/api/adwords/cm/v201406}AdExtension" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/cm/v201406}CampaignAdExtension.Status" minOccurs="0"/>
 *         &lt;element name="approvalStatus" type="{https://adwords.google.com/api/adwords/cm/v201406}CampaignAdExtension.ApprovalStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignAdExtension", propOrder = {
    "campaignId",
    "adExtension",
    "status",
    "approvalStatus"
})
public class CampaignAdExtension {

    protected Long campaignId;
    protected AdExtension adExtension;
    protected CampaignAdExtensionStatus status;
    protected CampaignAdExtensionApprovalStatus approvalStatus;

    /**
     * Gets the value of the campaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of the campaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCampaignId(Long value) {
        this.campaignId = value;
    }

    /**
     * Gets the value of the adExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AdExtension }
     *     
     */
    public AdExtension getAdExtension() {
        return adExtension;
    }

    /**
     * Sets the value of the adExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdExtension }
     *     
     */
    public void setAdExtension(AdExtension value) {
        this.adExtension = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAdExtensionStatus }
     *     
     */
    public CampaignAdExtensionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAdExtensionStatus }
     *     
     */
    public void setStatus(CampaignAdExtensionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignAdExtensionApprovalStatus }
     *     
     */
    public CampaignAdExtensionApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignAdExtensionApprovalStatus }
     *     
     */
    public void setApprovalStatus(CampaignAdExtensionApprovalStatus value) {
        this.approvalStatus = value;
    }

}
