
package com.google.api.ads.adwords.jaxws.v201406.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201406.cm.Page;


/**
 * 
 *             Contains the set of TargetingGroups matching filtering and paging options
 *             of the VideoTargetingGroupService.get() call.
 *           
 * 
 * <p>Java class for TargetingGroupPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingGroupPage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}Page">
 *       &lt;sequence>
 *         &lt;element name="entries" type="{https://adwords.google.com/api/adwords/video/v201406}TargetingGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summaryStats" type="{https://adwords.google.com/api/adwords/video/v201406}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingGroupPage", propOrder = {
    "entries",
    "summaryStats"
})
public class TargetingGroupPage
    extends Page
{

    protected List<TargetingGroup> entries;
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
     * {@link TargetingGroup }
     * 
     * 
     */
    public List<TargetingGroup> getEntries() {
        if (entries == null) {
            entries = new ArrayList<TargetingGroup>();
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
