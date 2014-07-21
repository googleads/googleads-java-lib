
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a TargetingGroup. TargetingGroups are used to target VideoAds.
 *           
 * 
 * <p>Java class for TargetingGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="campaignId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroupStatus" minOccurs="0"/>
 *         &lt;element name="bidsByFormat" type="{https://adwords.google.com/api/adwords/video/v201406}BidsByFormat" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/video/v201406}VideoEntityStats" minOccurs="0"/>
 *         &lt;element name="issues" type="{https://adwords.google.com/api/adwords/video/v201406}ServingInfo" minOccurs="0"/>
 *         &lt;element name="segmentedStats" type="{https://adwords.google.com/api/adwords/video/v201406}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroup", propOrder = {
    "id",
    "campaignId",
    "name",
    "status",
    "bidsByFormat",
    "stats",
    "issues",
    "segmentedStats",
    "campaignName"
})
public class TargetingGroup {

    protected Long id;
    protected Long campaignId;
    protected String name;
    protected TargetingGroupStatus status;
    protected BidsByFormat bidsByFormat;
    protected VideoEntityStats stats;
    protected ServingInfo issues;
    protected List<VideoEntityStats> segmentedStats;
    protected String campaignName;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TargetingGroupStatus }
     *     
     */
    public TargetingGroupStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetingGroupStatus }
     *     
     */
    public void setStatus(TargetingGroupStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the bidsByFormat property.
     * 
     * @return
     *     possible object is
     *     {@link BidsByFormat }
     *     
     */
    public BidsByFormat getBidsByFormat() {
        return bidsByFormat;
    }

    /**
     * Sets the value of the bidsByFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidsByFormat }
     *     
     */
    public void setBidsByFormat(BidsByFormat value) {
        this.bidsByFormat = value;
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

}
