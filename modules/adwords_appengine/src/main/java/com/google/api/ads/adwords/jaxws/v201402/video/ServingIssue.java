
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A serving issue on a particular entity (e.g. VideoCampaign: insufficient funds).
 *           
 * 
 * <p>Java class for ServingIssue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServingIssue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/video/v201402}ServingIssue.Reason" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetingGroupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoAdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideActionLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="severity" type="{https://adwords.google.com/api/adwords/video/v201402}ServingIssue.Severity" minOccurs="0"/>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/video/v201402}ServingIssue.Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServingIssue", propOrder = {
    "reason",
    "campaignId",
    "targetingGroupId",
    "videoAdId",
    "videoId",
    "hideActionLink",
    "severity",
    "type"
})
public class ServingIssue {

    protected ServingIssueReason reason;
    protected Long campaignId;
    protected Long targetingGroupId;
    protected Long videoAdId;
    protected String videoId;
    protected Boolean hideActionLink;
    protected ServingIssueSeverity severity;
    protected ServingIssueType type;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ServingIssueReason }
     *     
     */
    public ServingIssueReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingIssueReason }
     *     
     */
    public void setReason(ServingIssueReason value) {
        this.reason = value;
    }

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
     * Gets the value of the targetingGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTargetingGroupId() {
        return targetingGroupId;
    }

    /**
     * Sets the value of the targetingGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTargetingGroupId(Long value) {
        this.targetingGroupId = value;
    }

    /**
     * Gets the value of the videoAdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoAdId() {
        return videoAdId;
    }

    /**
     * Sets the value of the videoAdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoAdId(Long value) {
        this.videoAdId = value;
    }

    /**
     * Gets the value of the videoId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * Sets the value of the videoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoId(String value) {
        this.videoId = value;
    }

    /**
     * Gets the value of the hideActionLink property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideActionLink() {
        return hideActionLink;
    }

    /**
     * Sets the value of the hideActionLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideActionLink(Boolean value) {
        this.hideActionLink = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link ServingIssueSeverity }
     *     
     */
    public ServingIssueSeverity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingIssueSeverity }
     *     
     */
    public void setSeverity(ServingIssueSeverity value) {
        this.severity = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ServingIssueType }
     *     
     */
    public ServingIssueType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingIssueType }
     *     
     */
    public void setType(ServingIssueType value) {
        this.type = value;
    }

}
