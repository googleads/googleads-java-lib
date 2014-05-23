
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a criterion in the context of a targeting group for performance
 *             reports. The criterion may not be explicitly targeted by the targeting group,
 *             but implicitly included.
 *             
 *             In particular, if you have a targeting group with only one placement being
 *             "youtube.com", your targeting group will run on all watch pages. Some of them
 *             will be reported as "ReportedTargetingGroupCriterion" when you ask for a
 *             performance report.
 *           
 * 
 * <p>Java class for ReportedTargetingGroupCriterion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportedTargetingGroupCriterion">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/video/v201402}TargetingGroupCriterion">
 *       &lt;sequence>
 *         &lt;element name="stats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" minOccurs="0"/>
 *         &lt;element name="segmentedStats" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partiallyExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportedTargetingGroupCriterion", propOrder = {
    "stats",
    "segmentedStats",
    "excluded",
    "partiallyExcluded"
})
public class ReportedTargetingGroupCriterion
    extends TargetingGroupCriterion
{

    protected VideoEntityStats stats;
    protected List<VideoEntityStats> segmentedStats;
    protected Boolean excluded;
    protected Boolean partiallyExcluded;

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
     * Gets the value of the excluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluded() {
        return excluded;
    }

    /**
     * Sets the value of the excluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluded(Boolean value) {
        this.excluded = value;
    }

    /**
     * Gets the value of the partiallyExcluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartiallyExcluded() {
        return partiallyExcluded;
    }

    /**
     * Sets the value of the partiallyExcluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartiallyExcluded(Boolean value) {
        this.partiallyExcluded = value;
    }

}
