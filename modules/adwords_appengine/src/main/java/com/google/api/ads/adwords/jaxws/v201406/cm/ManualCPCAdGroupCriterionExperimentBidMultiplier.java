
package com.google.api.ads.adwords.jaxws.v201406.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             AdGroupCriterion level bid multiplier used in manual CPC bidding strategies.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCPCAdGroupCriterionExperimentBidMultiplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCPCAdGroupCriterionExperimentBidMultiplier">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201406}AdGroupCriterionExperimentBidMultiplier">
 *       &lt;sequence>
 *         &lt;element name="maxCpcMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201406}BidMultiplier" minOccurs="0"/>
 *         &lt;element name="multiplierSource" type="{https://adwords.google.com/api/adwords/cm/v201406}MultiplierSource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCPCAdGroupCriterionExperimentBidMultiplier", propOrder = {
    "maxCpcMultiplier",
    "multiplierSource"
})
public class ManualCPCAdGroupCriterionExperimentBidMultiplier
    extends AdGroupCriterionExperimentBidMultiplier
{

    protected BidMultiplier maxCpcMultiplier;
    protected MultiplierSource multiplierSource;

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
     * Gets the value of the multiplierSource property.
     * 
     * @return
     *     possible object is
     *     {@link MultiplierSource }
     *     
     */
    public MultiplierSource getMultiplierSource() {
        return multiplierSource;
    }

    /**
     * Sets the value of the multiplierSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiplierSource }
     *     
     */
    public void setMultiplierSource(MultiplierSource value) {
        this.multiplierSource = value;
    }

}
