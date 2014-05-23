
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Page;


/**
 * 
 *             Contains a subset of video campaigns matching filtering and paging options
 *             of the VideoCampaignService.get() call.
 *           
 * 
 * <p>Java class for VideoCampaignPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoCampaignPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/video/v201402}VideoCampaign" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summaryStats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summaryBudgets" type="{https://adwords.google.com/api/adwords/video/v201402}SummaryBudgets" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoCampaignPage", propOrder = {
    "entries",
    "summaryStats",
    "summaryBudgets"
})
public class VideoCampaignPage
    extends Page
{

    protected List<VideoCampaign> entries;
    protected List<VideoEntityStats> summaryStats;
    protected SummaryBudgets summaryBudgets;

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoCampaign }
     * 
     * 
     */
    public List<VideoCampaign> getEntries() {
        if (entries == null) {
            entries = new ArrayList<VideoCampaign>();
        }
        return this.entries;
    }

    /**
     * Gets the value of the summaryStats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryStats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoEntityStats }
     * 
     * 
     */
    public List<VideoEntityStats> getSummaryStats() {
        if (summaryStats == null) {
            summaryStats = new ArrayList<VideoEntityStats>();
        }
        return this.summaryStats;
    }

    /**
     * Gets the value of the summaryBudgets property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryBudgets }
     *     
     */
    public SummaryBudgets getSummaryBudgets() {
        return summaryBudgets;
    }

    /**
     * Sets the value of the summaryBudgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryBudgets }
     *     
     */
    public void setSummaryBudgets(SummaryBudgets value) {
        this.summaryBudgets = value;
    }

}
