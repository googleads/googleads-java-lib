
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Page;


/**
 * 
 *             Contains the set of TargetingGroupCriteria matching filtering and paging options
 *             of the VideoTargetingGroupCriterionService.get() call.
 *           
 * 
 * <p>Java class for TargetingGroupCriterionPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupCriterionPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201402}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/video/v201402}TargetingGroupCriterion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summaryStats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupCriterionPage", propOrder = {
    "entries",
    "summaryStats"
})
public class TargetingGroupCriterionPage
    extends Page
{

    protected List<TargetingGroupCriterion> entries;
    protected List<VideoEntityStats> summaryStats;

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
     * {@link TargetingGroupCriterion }
     * 
     * 
     */
    public List<TargetingGroupCriterion> getEntries() {
        if (entries == null) {
            entries = new ArrayList<TargetingGroupCriterion>();
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

}
