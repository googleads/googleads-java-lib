
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Paging;


/**
 * 
 *             A filter for selecting video campaigns from customer's AdWords account.
 *             Only the video campaigns that match all criteria will be returned.
 *           
 * 
 * <p>Java class for VideoCampaignSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoCampaignSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ids" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="campaignStatuses" type="{https://adwords.google.com/api/adwords/video/v201406}VideoCampaignStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statsSelector" type="{https://adwords.google.com/api/adwords/video/v201406}StatsSelector" minOccurs="0"/>
 *         &lt;element name="paging" type="{https://adwords.google.com/api/adwords/cm/v201406}Paging" minOccurs="0"/>
 *         &lt;element name="sorting" type="{https://adwords.google.com/api/adwords/video/v201406}Sorting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoCampaignSelector", propOrder = {
    "ids",
    "campaignStatuses",
    "statsSelector",
    "paging",
    "sorting"
})
public class VideoCampaignSelector {

    @XmlElement(type = Long.class)
    protected List<Long> ids;
    protected List<VideoCampaignStatus> campaignStatuses;
    protected StatsSelector statsSelector;
    protected Paging paging;
    protected Sorting sorting;

    /**
     * Gets the value of the ids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getIds() {
        if (ids == null) {
            ids = new ArrayList<Long>();
        }
        return this.ids;
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
