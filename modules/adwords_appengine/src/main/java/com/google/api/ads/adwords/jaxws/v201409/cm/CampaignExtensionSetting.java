
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A CampaignExtensionSetting is used add or modify extensions being served for the specified
 *             campaign.
 *           
 * 
 * <p>Java class for CampaignExtensionSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampaignExtensionSetting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="extensionType" type="{https://adwords.google.com/api/adwords/cm/v201409}Feed.Type" minOccurs="0"/>
 *         &lt;element name="extensionSetting" type="{https://adwords.google.com/api/adwords/cm/v201409}ExtensionSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampaignExtensionSetting", propOrder = {
    "campaignId",
    "extensionType",
    "extensionSetting"
})
public class CampaignExtensionSetting {

    protected Long campaignId;
    protected FeedType extensionType;
    protected ExtensionSetting extensionSetting;

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
     * Gets the value of the extensionType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedType }
     *     
     */
    public FeedType getExtensionType() {
        return extensionType;
    }

    /**
     * Sets the value of the extensionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedType }
     *     
     */
    public void setExtensionType(FeedType value) {
        this.extensionType = value;
    }

    /**
     * Gets the value of the extensionSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionSetting }
     *     
     */
    public ExtensionSetting getExtensionSetting() {
        return extensionSetting;
    }

    /**
     * Sets the value of the extensionSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionSetting }
     *     
     */
    public void setExtensionSetting(ExtensionSetting value) {
        this.extensionSetting = value;
    }

}
