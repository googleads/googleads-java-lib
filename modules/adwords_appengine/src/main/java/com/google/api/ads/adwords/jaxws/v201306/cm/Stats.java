
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Statistics about an ad or criterion within an ad group or campaign.
 *           
 * 
 * <p>Java class for Stats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Stats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="network" type="{https://adwords.google.com/api/adwords/cm/v201306}Stats.Network" minOccurs="0"/>
 *         &lt;element name="clicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cost" type="{https://adwords.google.com/api/adwords/cm/v201306}Money" minOccurs="0"/>
 *         &lt;element name="averagePosition" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="averageCpc" type="{https://adwords.google.com/api/adwords/cm/v201306}Money" minOccurs="0"/>
 *         &lt;element name="averageCpm" type="{https://adwords.google.com/api/adwords/cm/v201306}Money" minOccurs="0"/>
 *         &lt;element name="ctr" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="conversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="viewThroughConversions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="totalBudget" type="{https://adwords.google.com/api/adwords/cm/v201306}Money" minOccurs="0"/>
 *         &lt;element name="Stats.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stats", propOrder = {
    "startDate",
    "endDate",
    "network",
    "clicks",
    "impressions",
    "cost",
    "averagePosition",
    "averageCpc",
    "averageCpm",
    "ctr",
    "conversions",
    "viewThroughConversions",
    "totalBudget",
    "statsType"
})
@XmlSeeAlso({
    AdExtensionOverrideStats.class,
    CampaignAdExtensionStats.class,
    CampaignStats.class,
    AdStats.class
})
public class Stats {

    protected String startDate;
    protected String endDate;
    protected StatsNetwork network;
    protected Long clicks;
    protected Long impressions;
    protected Money cost;
    protected Double averagePosition;
    protected Money averageCpc;
    protected Money averageCpm;
    protected Double ctr;
    protected Long conversions;
    protected Long viewThroughConversions;
    protected Money totalBudget;
    @XmlElement(name = "Stats.Type")
    protected String statsType;

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
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link StatsNetwork }
     *     
     */
    public StatsNetwork getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsNetwork }
     *     
     */
    public void setNetwork(StatsNetwork value) {
        this.network = value;
    }

    /**
     * Gets the value of the clicks property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClicks() {
        return clicks;
    }

    /**
     * Sets the value of the clicks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClicks(Long value) {
        this.clicks = value;
    }

    /**
     * Gets the value of the impressions property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getImpressions() {
        return impressions;
    }

    /**
     * Sets the value of the impressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setImpressions(Long value) {
        this.impressions = value;
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
     * Gets the value of the averagePosition property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAveragePosition() {
        return averagePosition;
    }

    /**
     * Sets the value of the averagePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAveragePosition(Double value) {
        this.averagePosition = value;
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
     * Gets the value of the totalBudget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalBudget() {
        return totalBudget;
    }

    /**
     * Sets the value of the totalBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalBudget(Money value) {
        this.totalBudget = value;
    }

    /**
     * Gets the value of the statsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsType() {
        return statsType;
    }

    /**
     * Sets the value of the statsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsType(String value) {
        this.statsType = value;
    }

}
