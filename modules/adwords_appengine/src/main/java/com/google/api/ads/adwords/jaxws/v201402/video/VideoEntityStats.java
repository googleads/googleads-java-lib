
package com.google.api.ads.adwords.jaxws.v201402.video;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201402.cm.Money;


/**
 * 
 *             Statistics about video API entities.
 *           
 * 
 * <p>Java class for VideoEntityStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoEntityStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="summaryType" type="{https://adwords.google.com/api/adwords/video/v201402}VideoEntityStats.SummaryType" minOccurs="0"/>
 *         &lt;element name="segmentKey" type="{https://adwords.google.com/api/adwords/video/v201402}SegmentKey" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="views" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="averageCpc" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="averageCpv" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="averageCpm" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="impressionReachFrequencies" type="{https://adwords.google.com/api/adwords/video/v201402}Integer_LongMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="averageImpressionFrequency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="averageViewFrequency" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="uniqueViews" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="thumbnailImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="videoImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="websiteClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="conversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="costPerConversion" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="viewThroughConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="conversionsManyPerView" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="costPerConversionManyPerView" type="{https://adwords.google.com/api/adwords/cm/v201402}Money" minOccurs="0"/>
 *         &lt;element name="conversionRateManyPerView" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalConversionValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valuePerConv" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valuePerConvManyPerView" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="followOnViews" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="followOnViewRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="followOnSubscribes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="followOnSubscribeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="followOnLikes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="followOnComments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="followOnShares" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="followOnAddToPlaylist" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ctr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="vtr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="videoStarts" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quartile25s" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quartile50s" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quartile75s" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quartile100s" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quartile25Percents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quartile50Percents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quartile75Percents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="quartile100Percents" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="percentServed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="eligibleFollowOnClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="engagementScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="retentionScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalViews" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ctaImpressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ctaClicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ctaCtr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoEntityStats", propOrder = {
    "summaryType",
    "segmentKey",
    "startDate",
    "endDate",
    "views",
    "cost",
    "averageCpc",
    "averageCpv",
    "averageCpm",
    "impressionReachFrequencies",
    "averageImpressionFrequency",
    "averageViewFrequency",
    "uniqueViews",
    "thumbnailImpressions",
    "videoImpressions",
    "totalImpressions",
    "websiteClicks",
    "conversions",
    "costPerConversion",
    "conversionRate",
    "viewThroughConversions",
    "conversionsManyPerView",
    "costPerConversionManyPerView",
    "conversionRateManyPerView",
    "totalConversionValue",
    "valuePerConv",
    "valuePerConvManyPerView",
    "followOnViews",
    "followOnViewRate",
    "followOnSubscribes",
    "followOnSubscribeRate",
    "followOnLikes",
    "followOnComments",
    "followOnShares",
    "followOnAddToPlaylist",
    "ctr",
    "vtr",
    "videoStarts",
    "quartile25S",
    "quartile50S",
    "quartile75S",
    "quartile100S",
    "quartile25Percents",
    "quartile50Percents",
    "quartile75Percents",
    "quartile100Percents",
    "percentServed",
    "eligibleFollowOnClicks",
    "engagementScore",
    "retentionScore",
    "totalViews",
    "ctaImpressions",
    "ctaClicks",
    "ctaCtr"
})
public class VideoEntityStats {

    protected VideoEntityStatsSummaryType summaryType;
    protected SegmentKey segmentKey;
    protected String startDate;
    protected String endDate;
    protected Long views;
    protected Money cost;
    protected Money averageCpc;
    protected Money averageCpv;
    protected Money averageCpm;
    protected List<IntegerLongMapEntry> impressionReachFrequencies;
    protected Double averageImpressionFrequency;
    protected Double averageViewFrequency;
    protected Long uniqueViews;
    protected Long thumbnailImpressions;
    protected Long videoImpressions;
    protected Long totalImpressions;
    protected Long websiteClicks;
    protected Long conversions;
    protected Money costPerConversion;
    protected Double conversionRate;
    protected Long viewThroughConversions;
    protected Long conversionsManyPerView;
    protected Money costPerConversionManyPerView;
    protected Double conversionRateManyPerView;
    protected Double totalConversionValue;
    protected Double valuePerConv;
    protected Double valuePerConvManyPerView;
    protected Long followOnViews;
    protected Double followOnViewRate;
    protected Long followOnSubscribes;
    protected Double followOnSubscribeRate;
    protected Long followOnLikes;
    protected Long followOnComments;
    protected Long followOnShares;
    protected Long followOnAddToPlaylist;
    protected Double ctr;
    protected Double vtr;
    protected Long videoStarts;
    @XmlElement(name = "quartile25s")
    protected Long quartile25S;
    @XmlElement(name = "quartile50s")
    protected Long quartile50S;
    @XmlElement(name = "quartile75s")
    protected Long quartile75S;
    @XmlElement(name = "quartile100s")
    protected Long quartile100S;
    protected Double quartile25Percents;
    protected Double quartile50Percents;
    protected Double quartile75Percents;
    protected Double quartile100Percents;
    protected Double percentServed;
    protected Long eligibleFollowOnClicks;
    protected Double engagementScore;
    protected Double retentionScore;
    protected Long totalViews;
    protected Long ctaImpressions;
    protected Long ctaClicks;
    protected Double ctaCtr;

    /**
     * Gets the value of the summaryType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoEntityStatsSummaryType }
     *     
     */
    public VideoEntityStatsSummaryType getSummaryType() {
        return summaryType;
    }

    /**
     * Sets the value of the summaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoEntityStatsSummaryType }
     *     
     */
    public void setSummaryType(VideoEntityStatsSummaryType value) {
        this.summaryType = value;
    }

    /**
     * Gets the value of the segmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentKey }
     *     
     */
    public SegmentKey getSegmentKey() {
        return segmentKey;
    }

    /**
     * Sets the value of the segmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentKey }
     *     
     */
    public void setSegmentKey(SegmentKey value) {
        this.segmentKey = value;
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
     * Gets the value of the views property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getViews() {
        return views;
    }

    /**
     * Sets the value of the views property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setViews(Long value) {
        this.views = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCost(Money value) {
        this.cost = value;
    }

    /**
     * Gets the value of the averageCpc property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageCpc() {
        return averageCpc;
    }

    /**
     * Sets the value of the averageCpc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageCpc(Money value) {
        this.averageCpc = value;
    }

    /**
     * Gets the value of the averageCpv property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageCpv() {
        return averageCpv;
    }

    /**
     * Sets the value of the averageCpv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageCpv(Money value) {
        this.averageCpv = value;
    }

    /**
     * Gets the value of the averageCpm property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageCpm() {
        return averageCpm;
    }

    /**
     * Sets the value of the averageCpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageCpm(Money value) {
        this.averageCpm = value;
    }

    /**
     * Gets the value of the impressionReachFrequencies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impressionReachFrequencies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpressionReachFrequencies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntegerLongMapEntry }
     * 
     * 
     */
    public List<IntegerLongMapEntry> getImpressionReachFrequencies() {
        if (impressionReachFrequencies == null) {
            impressionReachFrequencies = new ArrayList<IntegerLongMapEntry>();
        }
        return this.impressionReachFrequencies;
    }

    /**
     * Gets the value of the averageImpressionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageImpressionFrequency() {
        return averageImpressionFrequency;
    }

    /**
     * Sets the value of the averageImpressionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageImpressionFrequency(Double value) {
        this.averageImpressionFrequency = value;
    }

    /**
     * Gets the value of the averageViewFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageViewFrequency() {
        return averageViewFrequency;
    }

    /**
     * Sets the value of the averageViewFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageViewFrequency(Double value) {
        this.averageViewFrequency = value;
    }

    /**
     * Gets the value of the uniqueViews property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueViews() {
        return uniqueViews;
    }

    /**
     * Sets the value of the uniqueViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueViews(Long value) {
        this.uniqueViews = value;
    }

    /**
     * Gets the value of the thumbnailImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getThumbnailImpressions() {
        return thumbnailImpressions;
    }

    /**
     * Sets the value of the thumbnailImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setThumbnailImpressions(Long value) {
        this.thumbnailImpressions = value;
    }

    /**
     * Gets the value of the videoImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoImpressions() {
        return videoImpressions;
    }

    /**
     * Sets the value of the videoImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoImpressions(Long value) {
        this.videoImpressions = value;
    }

    /**
     * Gets the value of the totalImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalImpressions() {
        return totalImpressions;
    }

    /**
     * Sets the value of the totalImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalImpressions(Long value) {
        this.totalImpressions = value;
    }

    /**
     * Gets the value of the websiteClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWebsiteClicks() {
        return websiteClicks;
    }

    /**
     * Sets the value of the websiteClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWebsiteClicks(Long value) {
        this.websiteClicks = value;
    }

    /**
     * Gets the value of the conversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversions() {
        return conversions;
    }

    /**
     * Sets the value of the conversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversions(Long value) {
        this.conversions = value;
    }

    /**
     * Gets the value of the costPerConversion property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCostPerConversion() {
        return costPerConversion;
    }

    /**
     * Sets the value of the costPerConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCostPerConversion(Money value) {
        this.costPerConversion = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionRate(Double value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the viewThroughConversions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getViewThroughConversions() {
        return viewThroughConversions;
    }

    /**
     * Sets the value of the viewThroughConversions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setViewThroughConversions(Long value) {
        this.viewThroughConversions = value;
    }

    /**
     * Gets the value of the conversionsManyPerView property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConversionsManyPerView() {
        return conversionsManyPerView;
    }

    /**
     * Sets the value of the conversionsManyPerView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConversionsManyPerView(Long value) {
        this.conversionsManyPerView = value;
    }

    /**
     * Gets the value of the costPerConversionManyPerView property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCostPerConversionManyPerView() {
        return costPerConversionManyPerView;
    }

    /**
     * Sets the value of the costPerConversionManyPerView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCostPerConversionManyPerView(Money value) {
        this.costPerConversionManyPerView = value;
    }

    /**
     * Gets the value of the conversionRateManyPerView property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConversionRateManyPerView() {
        return conversionRateManyPerView;
    }

    /**
     * Sets the value of the conversionRateManyPerView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConversionRateManyPerView(Double value) {
        this.conversionRateManyPerView = value;
    }

    /**
     * Gets the value of the totalConversionValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConversionValue() {
        return totalConversionValue;
    }

    /**
     * Sets the value of the totalConversionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConversionValue(Double value) {
        this.totalConversionValue = value;
    }

    /**
     * Gets the value of the valuePerConv property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValuePerConv() {
        return valuePerConv;
    }

    /**
     * Sets the value of the valuePerConv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValuePerConv(Double value) {
        this.valuePerConv = value;
    }

    /**
     * Gets the value of the valuePerConvManyPerView property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValuePerConvManyPerView() {
        return valuePerConvManyPerView;
    }

    /**
     * Sets the value of the valuePerConvManyPerView property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValuePerConvManyPerView(Double value) {
        this.valuePerConvManyPerView = value;
    }

    /**
     * Gets the value of the followOnViews property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowOnViews() {
        return followOnViews;
    }

    /**
     * Sets the value of the followOnViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowOnViews(Long value) {
        this.followOnViews = value;
    }

    /**
     * Gets the value of the followOnViewRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFollowOnViewRate() {
        return followOnViewRate;
    }

    /**
     * Sets the value of the followOnViewRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFollowOnViewRate(Double value) {
        this.followOnViewRate = value;
    }

    /**
     * Gets the value of the followOnSubscribes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowOnSubscribes() {
        return followOnSubscribes;
    }

    /**
     * Sets the value of the followOnSubscribes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowOnSubscribes(Long value) {
        this.followOnSubscribes = value;
    }

    /**
     * Gets the value of the followOnSubscribeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFollowOnSubscribeRate() {
        return followOnSubscribeRate;
    }

    /**
     * Sets the value of the followOnSubscribeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFollowOnSubscribeRate(Double value) {
        this.followOnSubscribeRate = value;
    }

    /**
     * Gets the value of the followOnLikes property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowOnLikes() {
        return followOnLikes;
    }

    /**
     * Sets the value of the followOnLikes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowOnLikes(Long value) {
        this.followOnLikes = value;
    }

    /**
     * Gets the value of the followOnComments property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowOnComments() {
        return followOnComments;
    }

    /**
     * Sets the value of the followOnComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowOnComments(Long value) {
        this.followOnComments = value;
    }

    /**
     * Gets the value of the followOnShares property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowOnShares() {
        return followOnShares;
    }

    /**
     * Sets the value of the followOnShares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowOnShares(Long value) {
        this.followOnShares = value;
    }

    /**
     * Gets the value of the followOnAddToPlaylist property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFollowOnAddToPlaylist() {
        return followOnAddToPlaylist;
    }

    /**
     * Sets the value of the followOnAddToPlaylist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFollowOnAddToPlaylist(Long value) {
        this.followOnAddToPlaylist = value;
    }

    /**
     * Gets the value of the ctr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCtr() {
        return ctr;
    }

    /**
     * Sets the value of the ctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCtr(Double value) {
        this.ctr = value;
    }

    /**
     * Gets the value of the vtr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVtr() {
        return vtr;
    }

    /**
     * Sets the value of the vtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVtr(Double value) {
        this.vtr = value;
    }

    /**
     * Gets the value of the videoStarts property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoStarts() {
        return videoStarts;
    }

    /**
     * Sets the value of the videoStarts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoStarts(Long value) {
        this.videoStarts = value;
    }

    /**
     * Gets the value of the quartile25S property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuartile25S() {
        return quartile25S;
    }

    /**
     * Sets the value of the quartile25S property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuartile25S(Long value) {
        this.quartile25S = value;
    }

    /**
     * Gets the value of the quartile50S property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuartile50S() {
        return quartile50S;
    }

    /**
     * Sets the value of the quartile50S property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuartile50S(Long value) {
        this.quartile50S = value;
    }

    /**
     * Gets the value of the quartile75S property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuartile75S() {
        return quartile75S;
    }

    /**
     * Sets the value of the quartile75S property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuartile75S(Long value) {
        this.quartile75S = value;
    }

    /**
     * Gets the value of the quartile100S property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuartile100S() {
        return quartile100S;
    }

    /**
     * Sets the value of the quartile100S property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuartile100S(Long value) {
        this.quartile100S = value;
    }

    /**
     * Gets the value of the quartile25Percents property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuartile25Percents() {
        return quartile25Percents;
    }

    /**
     * Sets the value of the quartile25Percents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuartile25Percents(Double value) {
        this.quartile25Percents = value;
    }

    /**
     * Gets the value of the quartile50Percents property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuartile50Percents() {
        return quartile50Percents;
    }

    /**
     * Sets the value of the quartile50Percents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuartile50Percents(Double value) {
        this.quartile50Percents = value;
    }

    /**
     * Gets the value of the quartile75Percents property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuartile75Percents() {
        return quartile75Percents;
    }

    /**
     * Sets the value of the quartile75Percents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuartile75Percents(Double value) {
        this.quartile75Percents = value;
    }

    /**
     * Gets the value of the quartile100Percents property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuartile100Percents() {
        return quartile100Percents;
    }

    /**
     * Sets the value of the quartile100Percents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuartile100Percents(Double value) {
        this.quartile100Percents = value;
    }

    /**
     * Gets the value of the percentServed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentServed() {
        return percentServed;
    }

    /**
     * Sets the value of the percentServed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentServed(Double value) {
        this.percentServed = value;
    }

    /**
     * Gets the value of the eligibleFollowOnClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEligibleFollowOnClicks() {
        return eligibleFollowOnClicks;
    }

    /**
     * Sets the value of the eligibleFollowOnClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEligibleFollowOnClicks(Long value) {
        this.eligibleFollowOnClicks = value;
    }

    /**
     * Gets the value of the engagementScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEngagementScore() {
        return engagementScore;
    }

    /**
     * Sets the value of the engagementScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEngagementScore(Double value) {
        this.engagementScore = value;
    }

    /**
     * Gets the value of the retentionScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetentionScore() {
        return retentionScore;
    }

    /**
     * Sets the value of the retentionScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetentionScore(Double value) {
        this.retentionScore = value;
    }

    /**
     * Gets the value of the totalViews property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalViews() {
        return totalViews;
    }

    /**
     * Sets the value of the totalViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalViews(Long value) {
        this.totalViews = value;
    }

    /**
     * Gets the value of the ctaImpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCtaImpressions() {
        return ctaImpressions;
    }

    /**
     * Sets the value of the ctaImpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCtaImpressions(Long value) {
        this.ctaImpressions = value;
    }

    /**
     * Gets the value of the ctaClicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCtaClicks() {
        return ctaClicks;
    }

    /**
     * Sets the value of the ctaClicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCtaClicks(Long value) {
        this.ctaClicks = value;
    }

    /**
     * Gets the value of the ctaCtr property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCtaCtr() {
        return ctaCtr;
    }

    /**
     * Sets the value of the ctaCtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCtaCtr(Double value) {
        this.ctaCtr = value;
    }

}
