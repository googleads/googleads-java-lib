
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.DateRange;


/**
 * 
 *             Selects statistics for date range.
 *           
 * 
 * <p>Java class for StatsSelector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsSelector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRange" type="{https://adwords.google.com/api/adwords/cm/v201402}DateRange" minOccurs="0"/>
 *         &lt;element name="segmentationDimensions" type="{https://adwords.google.com/api/adwords/video/v201402}SegmentationDimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metrics" type="{https://adwords.google.com/api/adwords/video/v201402}Metric" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summaryTypes" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats.SummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="segmentedSummaryType" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats.SummaryType" minOccurs="0"/>
 *         &lt;element name="allTimeRestrict" type="{https://adwords.google.com/api/adwords/video/v201402}StatsSelector.AllTimeRestrict" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsSelector", propOrder = {
    "dateRange",
    "segmentationDimensions",
    "metrics",
    "summaryTypes",
    "segmentedSummaryType",
    "allTimeRestrict"
})
public class StatsSelector {

    protected DateRange dateRange;
    protected List<SegmentationDimension> segmentationDimensions;
    protected List<Metric> metrics;
    protected List<VideoEntityStatsSummaryType> summaryTypes;
    protected VideoEntityStatsSummaryType segmentedSummaryType;
    protected StatsSelectorAllTimeRestrict allTimeRestrict;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    public void setDateRange(DateRange value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the segmentationDimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentationDimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentationDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentationDimension }
     * 
     * 
     */
    public List<SegmentationDimension> getSegmentationDimensions() {
        if (segmentationDimensions == null) {
            segmentationDimensions = new ArrayList<SegmentationDimension>();
        }
        return this.segmentationDimensions;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metric }
     * 
     * 
     */
    public List<Metric> getMetrics() {
        if (metrics == null) {
            metrics = new ArrayList<Metric>();
        }
        return this.metrics;
    }

    /**
     * Gets the value of the summaryTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoEntityStatsSummaryType }
     * 
     * 
     */
    public List<VideoEntityStatsSummaryType> getSummaryTypes() {
        if (summaryTypes == null) {
            summaryTypes = new ArrayList<VideoEntityStatsSummaryType>();
        }
        return this.summaryTypes;
    }

    /**
     * Gets the value of the segmentedSummaryType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEntityStatsSummaryType }
     *     
     */
    public VideoEntityStatsSummaryType getSegmentedSummaryType() {
        return segmentedSummaryType;
    }

    /**
     * Sets the value of the segmentedSummaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEntityStatsSummaryType }
     *     
     */
    public void setSegmentedSummaryType(VideoEntityStatsSummaryType value) {
        this.segmentedSummaryType = value;
    }

    /**
     * Gets the value of the allTimeRestrict property.
     * 
     * @return
     *     possible object is
     *     {@link StatsSelectorAllTimeRestrict }
     *     
     */
    public StatsSelectorAllTimeRestrict getAllTimeRestrict() {
        return allTimeRestrict;
    }

    /**
     * Sets the value of the allTimeRestrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsSelectorAllTimeRestrict }
     *     
     */
    public void setAllTimeRestrict(StatsSelectorAllTimeRestrict value) {
        this.allTimeRestrict = value;
    }

}
