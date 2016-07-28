
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Adgroup level bid multipliers used in manual CPM bidding strategy.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for ManualCPMAdGroupExperimentBidMultipliers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualCPMAdGroupExperimentBidMultipliers">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}AdGroupExperimentBidMultipliers">
 *       &lt;sequence>
 *         &lt;element name="maxCpmMultiplier" type="{https://adwords.google.com/api/adwords/cm/v201607}BidMultiplier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualCPMAdGroupExperimentBidMultipliers", propOrder = {
    "maxCpmMultiplier"
})
public class ManualCPMAdGroupExperimentBidMultipliers
    extends AdGroupExperimentBidMultipliers
{

    protected BidMultiplier maxCpmMultiplier;

    /**
     * Gets the value of the maxCpmMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BidMultiplier }
     *     
     */
    public BidMultiplier getMaxCpmMultiplier() {
        return maxCpmMultiplier;
    }

    /**
     * Sets the value of the maxCpmMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BidMultiplier }
     *     
     */
    public void setMaxCpmMultiplier(BidMultiplier value) {
        this.maxCpmMultiplier = value;
    }

}
