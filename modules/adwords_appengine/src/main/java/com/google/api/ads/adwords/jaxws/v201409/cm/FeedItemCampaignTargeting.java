
package com.google.api.ads.adwords.jaxws.v201409.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Specifies the campaign the request context must match in order for
 *             the feed item to be considered eligible for serving (aka the targeted campaign).
 *             E.g., if the below campaign targeting is set to campaignId = X, then the feed
 *             item can only serve under campaign X.
 *           
 * 
 * <p>Java class for FeedItemCampaignTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedItemCampaignTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetingCampaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedItemCampaignTargeting", propOrder = {
    "targetingCampaignId"
})
public class FeedItemCampaignTargeting {

    @XmlElement(name = "TargetingCampaignId")
    protected Long targetingCampaignId;

    /**
     * Gets the value of the targetingCampaignId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetingCampaignId() {
        return targetingCampaignId;
    }

    /**
     * Sets the value of the targetingCampaignId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetingCampaignId(Long value) {
        this.targetingCampaignId = value;
    }

}
