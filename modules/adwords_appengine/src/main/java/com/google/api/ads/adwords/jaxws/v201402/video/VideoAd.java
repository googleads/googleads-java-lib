
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a video ad, which promotes a given video in a variety
 *             of display formats on a variety of networks.
 *           
 * 
 * <p>Java class for VideoAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="videoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="targetingGroupAssociations" type="{https://adwords.google.com/api/adwords/video/v201402}TargetingGroupAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" minOccurs="0"/>
 *         &lt;element name="segmentedStats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="issues" type="{https://adwords.google.com/api/adwords/video/v201402}ServingInfo" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{https://adwords.google.com/api/adwords/video/v201402}VideoImage" minOccurs="0"/>
 *         &lt;element name="youTubeDestinationPage" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAd.YouTubeDestinationPage" minOccurs="0"/>
 *         &lt;element name="destinationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companionBanner" type="{https://adwords.google.com/api/adwords/video/v201402}VideoImage" minOccurs="0"/>
 *         &lt;element name="showVideoAnnotations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdStatus" minOccurs="0"/>
 *         &lt;element name="approvalStatuses" type="{https://adwords.google.com/api/adwords/video/v201402}ApprovalContext_VideoAd_ApprovalStatusMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="approvalLimits" type="{https://adwords.google.com/api/adwords/video/v201402}ApprovalContext_VideoAd_ApprovalLimitMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="disapprovalReasons" type="{https://adwords.google.com/api/adwords/video/v201402}ScopedDisapprovalReason" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statusByFormat" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdDisplayFormat_VideoAdStatusMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAd", propOrder = {
    "id",
    "name",
    "videoId",
    "campaignId",
    "targetingGroupAssociations",
    "stats",
    "segmentedStats",
    "issues",
    "campaignName",
    "headline",
    "description1",
    "description2",
    "image",
    "youTubeDestinationPage",
    "destinationUrl",
    "displayUrl",
    "companionBanner",
    "showVideoAnnotations",
    "status",
    "approvalStatuses",
    "approvalLimits",
    "disapprovalReasons",
    "statusByFormat"
})
public class VideoAd {

    protected Long id;
    protected String name;
    protected String videoId;
    protected Long campaignId;
    protected List<TargetingGroupAssociation> targetingGroupAssociations;
    protected VideoEntityStats stats;
    protected List<VideoEntityStats> segmentedStats;
    protected ServingInfo issues;
    protected String campaignName;
    protected String headline;
    protected String description1;
    protected String description2;
    protected VideoImage image;
    protected VideoAdYouTubeDestinationPage youTubeDestinationPage;
    protected String destinationUrl;
    protected String displayUrl;
    protected VideoImage companionBanner;
    protected Boolean showVideoAnnotations;
    protected VideoAdStatus status;
    protected List<ApprovalContextVideoAdApprovalStatusMapEntry> approvalStatuses;
    protected List<ApprovalContextVideoAdApprovalLimitMapEntry> approvalLimits;
    protected List<ScopedDisapprovalReason> disapprovalReasons;
    protected List<VideoAdDisplayFormatVideoAdStatusMapEntry> statusByFormat;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the targetingGroupAssociations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetingGroupAssociations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetingGroupAssociations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetingGroupAssociation }
     * 
     * 
     */
    public List<TargetingGroupAssociation> getTargetingGroupAssociations() {
        if (targetingGroupAssociations == null) {
            targetingGroupAssociations = new ArrayList<TargetingGroupAssociation>();
        }
        return this.targetingGroupAssociations;
    }

    /**
     * Gets the value of the stats property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEntityStats }
     *     
     */
    public VideoEntityStats getStats() {
        return stats;
    }

    /**
     * Sets the value of the stats property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEntityStats }
     *     
     */
    public void setStats(VideoEntityStats value) {
        this.stats = value;
    }

    /**
     * Gets the value of the segmentedStats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentedStats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentedStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoEntityStats }
     * 
     * 
     */
    public List<VideoEntityStats> getSegmentedStats() {
        if (segmentedStats == null) {
            segmentedStats = new ArrayList<VideoEntityStats>();
        }
        return this.segmentedStats;
    }

    /**
     * Gets the value of the issues property.
     * 
     * @return
     *     possible object is
     *     {@link ServingInfo }
     *     
     */
    public ServingInfo getIssues() {
        return issues;
    }

    /**
     * Sets the value of the issues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServingInfo }
     *     
     */
    public void setIssues(ServingInfo value) {
        this.issues = value;
    }

    /**
     * Gets the value of the campaignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * Sets the value of the campaignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the description1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * Sets the value of the description1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription1(String value) {
        this.description1 = value;
    }

    /**
     * Gets the value of the description2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * Sets the value of the description2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription2(String value) {
        this.description2 = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link VideoImage }
     *     
     */
    public VideoImage getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoImage }
     *     
     */
    public void setImage(VideoImage value) {
        this.image = value;
    }

    /**
     * Gets the value of the youTubeDestinationPage property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdYouTubeDestinationPage }
     *     
     */
    public VideoAdYouTubeDestinationPage getYouTubeDestinationPage() {
        return youTubeDestinationPage;
    }

    /**
     * Sets the value of the youTubeDestinationPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdYouTubeDestinationPage }
     *     
     */
    public void setYouTubeDestinationPage(VideoAdYouTubeDestinationPage value) {
        this.youTubeDestinationPage = value;
    }

    /**
     * Gets the value of the destinationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    /**
     * Sets the value of the destinationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUrl(String value) {
        this.destinationUrl = value;
    }

    /**
     * Gets the value of the displayUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayUrl() {
        return displayUrl;
    }

    /**
     * Sets the value of the displayUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayUrl(String value) {
        this.displayUrl = value;
    }

    /**
     * Gets the value of the companionBanner property.
     * 
     * @return
     *     possible object is
     *     {@link VideoImage }
     *     
     */
    public VideoImage getCompanionBanner() {
        return companionBanner;
    }

    /**
     * Sets the value of the companionBanner property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoImage }
     *     
     */
    public void setCompanionBanner(VideoImage value) {
        this.companionBanner = value;
    }

    /**
     * Gets the value of the showVideoAnnotations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowVideoAnnotations() {
        return showVideoAnnotations;
    }

    /**
     * Sets the value of the showVideoAnnotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowVideoAnnotations(Boolean value) {
        this.showVideoAnnotations = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdStatus }
     *     
     */
    public VideoAdStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdStatus }
     *     
     */
    public void setStatus(VideoAdStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the approvalStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalContextVideoAdApprovalStatusMapEntry }
     * 
     * 
     */
    public List<ApprovalContextVideoAdApprovalStatusMapEntry> getApprovalStatuses() {
        if (approvalStatuses == null) {
            approvalStatuses = new ArrayList<ApprovalContextVideoAdApprovalStatusMapEntry>();
        }
        return this.approvalStatuses;
    }

    /**
     * Gets the value of the approvalLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvalLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovalLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovalContextVideoAdApprovalLimitMapEntry }
     * 
     * 
     */
    public List<ApprovalContextVideoAdApprovalLimitMapEntry> getApprovalLimits() {
        if (approvalLimits == null) {
            approvalLimits = new ArrayList<ApprovalContextVideoAdApprovalLimitMapEntry>();
        }
        return this.approvalLimits;
    }

    /**
     * Gets the value of the disapprovalReasons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disapprovalReasons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisapprovalReasons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScopedDisapprovalReason }
     * 
     * 
     */
    public List<ScopedDisapprovalReason> getDisapprovalReasons() {
        if (disapprovalReasons == null) {
            disapprovalReasons = new ArrayList<ScopedDisapprovalReason>();
        }
        return this.disapprovalReasons;
    }

    /**
     * Gets the value of the statusByFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusByFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusByFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoAdDisplayFormatVideoAdStatusMapEntry }
     * 
     * 
     */
    public List<VideoAdDisplayFormatVideoAdStatusMapEntry> getStatusByFormat() {
        if (statusByFormat == null) {
            statusByFormat = new ArrayList<VideoAdDisplayFormatVideoAdStatusMapEntry>();
        }
        return this.statusByFormat;
    }

}
