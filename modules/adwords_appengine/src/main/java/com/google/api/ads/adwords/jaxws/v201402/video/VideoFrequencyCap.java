
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Frequency cap for a video campaign.
 *             A frequency cap is the maximum number of times a video ad can be shown to a user over a
 *             particular time period.
 *             
 *             Frequency cap object is immutable.
 *             No cap is expressed as 0 impressions, no time unit, and no level.
 *           
 * 
 * <p>Java class for VideoFrequencyCap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoFrequencyCap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="impressions" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="timeUnit" type="{https://adwords.google.com/api/adwords/video/v201402}TimeUnit" minOccurs="0"/>
 *         &lt;element name="level" type="{https://adwords.google.com/api/adwords/video/v201402}VideoLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoFrequencyCap", propOrder = {
    "impressions",
    "timeUnit",
    "level"
})
public class VideoFrequencyCap {

    protected Long impressions;
    protected TimeUnit timeUnit;
    protected VideoLevel level;

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
     * Gets the value of the timeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TimeUnit }
     *     
     */
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets the value of the timeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeUnit }
     *     
     */
    public void setTimeUnit(TimeUnit value) {
        this.timeUnit = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link VideoLevel }
     *     
     */
    public VideoLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoLevel }
     *     
     */
    public void setLevel(VideoLevel value) {
        this.level = value;
    }

}
