
package com.google.api.ads.adwords.jaxws.v201607.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201607.cm.Platform;


/**
 * 
 *             Contains a campaign level estimate for a specified {@link Platform}.
 *           
 * 
 * <p>Java class for PlatformCampaignEstimate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlatformCampaignEstimate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platform" type="{https://adwords.google.com/api/adwords/cm/v201607}Platform" minOccurs="0"/>
 *         &lt;element name="minEstimate" type="{https://adwords.google.com/api/adwords/o/v201607}StatsEstimate" minOccurs="0"/>
 *         &lt;element name="maxEstimate" type="{https://adwords.google.com/api/adwords/o/v201607}StatsEstimate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformCampaignEstimate", propOrder = {
    "platform",
    "minEstimate",
    "maxEstimate"
})
public class PlatformCampaignEstimate {

    protected Platform platform;
    protected StatsEstimate minEstimate;
    protected StatsEstimate maxEstimate;

    /**
     * Gets the value of the platform property.
     * 
     * @return
     *     possible object is
     *     {@link Platform }
     *     
     */
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets the value of the platform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Platform }
     *     
     */
    public void setPlatform(Platform value) {
        this.platform = value;
    }

    /**
     * Gets the value of the minEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link StatsEstimate }
     *     
     */
    public StatsEstimate getMinEstimate() {
        return minEstimate;
    }

    /**
     * Sets the value of the minEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsEstimate }
     *     
     */
    public void setMinEstimate(StatsEstimate value) {
        this.minEstimate = value;
    }

    /**
     * Gets the value of the maxEstimate property.
     * 
     * @return
     *     possible object is
     *     {@link StatsEstimate }
     *     
     */
    public StatsEstimate getMaxEstimate() {
        return maxEstimate;
    }

    /**
     * Sets the value of the maxEstimate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatsEstimate }
     *     
     */
    public void setMaxEstimate(StatsEstimate value) {
        this.maxEstimate = value;
    }

}
