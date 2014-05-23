
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a video campaign, which contains a set of video ads.
 *           
 * 
 * <p>Java class for VideoCampaign complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoCampaign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaignStatus" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="budgetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="biddingMode" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaign.BiddingMode" minOccurs="0"/>
 *         &lt;element name="targetingMode" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaign.TargetingMode" minOccurs="0"/>
 *         &lt;element name="spendingStatus" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaign.SpendingStatus" minOccurs="0"/>
 *         &lt;element name="schedulingStatus" type="{https://adwords.google.com/api/adwords/video/v201402}CampaignSchedulingStatus" minOccurs="0"/>
 *         &lt;element name="adServingOptimizationStatus" type="{https://adwords.google.com/api/adwords/video/v201402}AdServingOptimizationStatus" minOccurs="0"/>
 *         &lt;element name="frequencyCap" type="{https://adwords.google.com/api/adwords/video/v201402}VideoFrequencyCap" minOccurs="0"/>
 *         &lt;element name="networks" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdNetworks" minOccurs="0"/>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" minOccurs="0"/>
 *         &lt;element name="segmentedStats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoCampaign", propOrder = {
    "id",
    "name",
    "status",
    "startDate",
    "endDate",
    "budgetId",
    "biddingMode",
    "targetingMode",
    "spendingStatus",
    "schedulingStatus",
    "adServingOptimizationStatus",
    "frequencyCap",
    "networks",
    "stats",
    "segmentedStats"
})
public class VideoCampaign {

    protected Long id;
    protected String name;
    protected VideoCampaignStatus status;
    protected String startDate;
    protected String endDate;
    protected Long budgetId;
    protected VideoCampaignBiddingMode biddingMode;
    protected VideoCampaignTargetingMode targetingMode;
    protected VideoCampaignSpendingStatus spendingStatus;
    protected CampaignSchedulingStatus schedulingStatus;
    protected AdServingOptimizationStatus adServingOptimizationStatus;
    protected VideoFrequencyCap frequencyCap;
    protected VideoAdNetworks networks;
    protected VideoEntityStats stats;
    protected List<VideoEntityStats> segmentedStats;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCampaignStatus }
     *     
     */
    public VideoCampaignStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCampaignStatus }
     *     
     */
    public void setStatus(VideoCampaignStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the budgetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBudgetId() {
        return budgetId;
    }

    /**
     * Sets the value of the budgetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBudgetId(Long value) {
        this.budgetId = value;
    }

    /**
     * Gets the value of the biddingMode property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCampaignBiddingMode }
     *     
     */
    public VideoCampaignBiddingMode getBiddingMode() {
        return biddingMode;
    }

    /**
     * Sets the value of the biddingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCampaignBiddingMode }
     *     
     */
    public void setBiddingMode(VideoCampaignBiddingMode value) {
        this.biddingMode = value;
    }

    /**
     * Gets the value of the targetingMode property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCampaignTargetingMode }
     *     
     */
    public VideoCampaignTargetingMode getTargetingMode() {
        return targetingMode;
    }

    /**
     * Sets the value of the targetingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCampaignTargetingMode }
     *     
     */
    public void setTargetingMode(VideoCampaignTargetingMode value) {
        this.targetingMode = value;
    }

    /**
     * Gets the value of the spendingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VideoCampaignSpendingStatus }
     *     
     */
    public VideoCampaignSpendingStatus getSpendingStatus() {
        return spendingStatus;
    }

    /**
     * Sets the value of the spendingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoCampaignSpendingStatus }
     *     
     */
    public void setSpendingStatus(VideoCampaignSpendingStatus value) {
        this.spendingStatus = value;
    }

    /**
     * Gets the value of the schedulingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSchedulingStatus }
     *     
     */
    public CampaignSchedulingStatus getSchedulingStatus() {
        return schedulingStatus;
    }

    /**
     * Sets the value of the schedulingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSchedulingStatus }
     *     
     */
    public void setSchedulingStatus(CampaignSchedulingStatus value) {
        this.schedulingStatus = value;
    }

    /**
     * Gets the value of the adServingOptimizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AdServingOptimizationStatus }
     *     
     */
    public AdServingOptimizationStatus getAdServingOptimizationStatus() {
        return adServingOptimizationStatus;
    }

    /**
     * Sets the value of the adServingOptimizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdServingOptimizationStatus }
     *     
     */
    public void setAdServingOptimizationStatus(AdServingOptimizationStatus value) {
        this.adServingOptimizationStatus = value;
    }

    /**
     * Gets the value of the frequencyCap property.
     * 
     * @return
     *     possible object is
     *     {@link VideoFrequencyCap }
     *     
     */
    public VideoFrequencyCap getFrequencyCap() {
        return frequencyCap;
    }

    /**
     * Sets the value of the frequencyCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoFrequencyCap }
     *     
     */
    public void setFrequencyCap(VideoFrequencyCap value) {
        this.frequencyCap = value;
    }

    /**
     * Gets the value of the networks property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdNetworks }
     *     
     */
    public VideoAdNetworks getNetworks() {
        return networks;
    }

    /**
     * Sets the value of the networks property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdNetworks }
     *     
     */
    public void setNetworks(VideoAdNetworks value) {
        this.networks = value;
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

}
