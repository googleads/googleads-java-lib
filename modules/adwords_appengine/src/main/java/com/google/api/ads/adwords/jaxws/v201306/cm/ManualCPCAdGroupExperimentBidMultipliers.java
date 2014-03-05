
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Adgroup level bid multipliers used in manual CPC bidding strategies.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCPCAdGroupExperimentBidMultipliers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCPCAdGroupExperimentBidMultipliers">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}AdGroupExperimentBidMultipliers">
 *       &lt;sequence>
 *         &lt;element name="maxCpcMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201306}BidMultiplier" minOccurs="0"/>
 *         &lt;element name="maxContentCpcMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201306}BidMultiplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCPCAdGroupExperimentBidMultipliers", propOrder = {
    "maxCpcMultiplier",
    "maxContentCpcMultiplier"
})
public class ManualCPCAdGroupExperimentBidMultipliers
    extends AdGroupExperimentBidMultipliers
{

    protected BidMultiplier maxCpcMultiplier;
    protected BidMultiplier maxContentCpcMultiplier;

    /**
     * Gets the value of the maxCpcMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BidMultiplier }
     *     
     */
    public BidMultiplier getMaxCpcMultiplier() {
        return maxCpcMultiplier;
    }

    /**
     * Sets the value of the maxCpcMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidMultiplier }
     *     
     */
    public void setMaxCpcMultiplier(BidMultiplier value) {
        this.maxCpcMultiplier = value;
    }

    /**
     * Gets the value of the maxContentCpcMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BidMultiplier }
     *     
     */
    public BidMultiplier getMaxContentCpcMultiplier() {
        return maxContentCpcMultiplier;
    }

    /**
     * Sets the value of the maxContentCpcMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidMultiplier }
     *     
     */
    public void setMaxContentCpcMultiplier(BidMultiplier value) {
        this.maxContentCpcMultiplier = value;
    }

}
