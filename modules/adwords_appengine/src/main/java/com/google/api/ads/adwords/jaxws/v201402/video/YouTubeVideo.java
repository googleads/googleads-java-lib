
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a video asset.
 *           
 * 
 * <p>Java class for YouTubeVideo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YouTubeVideo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateUploaded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationSec" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userPublicName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="viewCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignInfos" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaignInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="callToAction" type="{https://adwords.google.com/api/adwords/video/v201402}CallToAction" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" minOccurs="0"/>
 *         &lt;element name="segmentedStats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{https://adwords.google.com/api/adwords/video/v201402}YouTubeVideo.AccessLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YouTubeVideo", propOrder = {
    "id",
    "title",
    "description",
    "dateUploaded",
    "durationSec",
    "userPublicName",
    "userId",
    "viewCount",
    "campaignInfos",
    "callToAction",
    "stats",
    "segmentedStats",
    "accessLevel"
})
public class YouTubeVideo {

    protected String id;
    protected String title;
    protected String description;
    protected String dateUploaded;
    protected Long durationSec;
    protected String userPublicName;
    protected String userId;
    protected Long viewCount;
    protected List<VideoCampaignInfo> campaignInfos;
    protected CallToAction callToAction;
    protected VideoEntityStats stats;
    protected List<VideoEntityStats> segmentedStats;
    protected YouTubeVideoAccessLevel accessLevel;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the dateUploaded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateUploaded() {
        return dateUploaded;
    }

    /**
     * Sets the value of the dateUploaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateUploaded(String value) {
        this.dateUploaded = value;
    }

    /**
     * Gets the value of the durationSec property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationSec() {
        return durationSec;
    }

    /**
     * Sets the value of the durationSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationSec(Long value) {
        this.durationSec = value;
    }

    /**
     * Gets the value of the userPublicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPublicName() {
        return userPublicName;
    }

    /**
     * Sets the value of the userPublicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPublicName(String value) {
        this.userPublicName = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the viewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getViewCount() {
        return viewCount;
    }

    /**
     * Sets the value of the viewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setViewCount(Long value) {
        this.viewCount = value;
    }

    /**
     * Gets the value of the campaignInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoCampaignInfo }
     * 
     * 
     */
    public List<VideoCampaignInfo> getCampaignInfos() {
        if (campaignInfos == null) {
            campaignInfos = new ArrayList<VideoCampaignInfo>();
        }
        return this.campaignInfos;
    }

    /**
     * Gets the value of the callToAction property.
     * 
     * @return
     *     possible object is
     *     {@link CallToAction }
     *     
     */
    public CallToAction getCallToAction() {
        return callToAction;
    }

    /**
     * Sets the value of the callToAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallToAction }
     *     
     */
    public void setCallToAction(CallToAction value) {
        this.callToAction = value;
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
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link YouTubeVideoAccessLevel }
     *     
     */
    public YouTubeVideoAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link YouTubeVideoAccessLevel }
     *     
     */
    public void setAccessLevel(YouTubeVideoAccessLevel value) {
        this.accessLevel = value;
    }

}
