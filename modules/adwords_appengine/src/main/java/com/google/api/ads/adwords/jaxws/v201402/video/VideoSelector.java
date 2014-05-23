
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Paging;


/**
 * 
 *             Filters for selecting videos that have been used in ads within the current account.
 *           
 * 
 * <p>Java class for VideoSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videoIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campaignIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campaignStatuses" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaignStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="includeCallToActions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="statsSelector" type="{https://adwords.google.com/api/adwords/video/v201402}StatsSelector" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://adwords.google.com/api/adwords/cm/v201402}Paging" minOccurs="0"/>
 *         &lt;element name="sorting" type="{https://adwords.google.com/api/adwords/video/v201402}Sorting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoSelector", propOrder = {
    "videoIds",
    "campaignIds",
    "campaignStatuses",
    "includeCallToActions",
    "statsSelector",
    "paging",
    "sorting"
})
public class VideoSelector {

    protected List<String> videoIds;
    @XmlElement(type = Long.class)
    protected List<Long> campaignIds;
    protected List<VideoCampaignStatus> campaignStatuses;
    protected Boolean includeCallToActions;
    protected StatsSelector statsSelector;
    protected Paging paging;
    protected Sorting sorting;

    /**
     * Gets the value of the videoIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoIds() {
        if (videoIds == null) {
            videoIds = new ArrayList<String>();
        }
        return this.videoIds;
    }

    /**
     * Gets the value of the campaignIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCampaignIds() {
        if (campaignIds == null) {
            campaignIds = new ArrayList<Long>();
        }
        return this.campaignIds;
    }

    /**
     * Gets the value of the campaignStatuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campaignStatuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampaignStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoCampaignStatus }
     * 
     * 
     */
    public List<VideoCampaignStatus> getCampaignStatuses() {
        if (campaignStatuses == null) {
            campaignStatuses = new ArrayList<VideoCampaignStatus>();
        }
        return this.campaignStatuses;
    }

    /**
     * Gets the value of the includeCallToActions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCallToActions() {
        return includeCallToActions;
    }

    /**
     * Sets the value of the includeCallToActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCallToActions(Boolean value) {
        this.includeCallToActions = value;
    }

    /**
     * Gets the value of the statsSelector property.
     * 
     * @return
     *     possible object is
     *     {@link StatsSelector }
     *     
     */
    public StatsSelector getStatsSelector() {
        return statsSelector;
    }

    /**
     * Sets the value of the statsSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsSelector }
     *     
     */
    public void setStatsSelector(StatsSelector value) {
        this.statsSelector = value;
    }

    /**
     * Gets the value of the paging property.
     * 
     * @return
     *     possible object is
     *     {@link Paging }
     *     
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Sets the value of the paging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paging }
     *     
     */
    public void setPaging(Paging value) {
        this.paging = value;
    }

    /**
     * Gets the value of the sorting property.
     * 
     * @return
     *     possible object is
     *     {@link Sorting }
     *     
     */
    public Sorting getSorting() {
        return sorting;
    }

    /**
     * Sets the value of the sorting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sorting }
     *     
     */
    public void setSorting(Sorting value) {
        this.sorting = value;
    }

}
