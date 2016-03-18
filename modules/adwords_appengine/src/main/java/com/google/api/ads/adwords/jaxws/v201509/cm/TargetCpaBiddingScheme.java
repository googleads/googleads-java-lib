
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             <a href="https://support.google.com/adwords/answer/6268632">Target CPA</a> is an automated bid
 *             strategy that sets bids to help get as many conversions as possible at the target
 *             cost-per-acquisition (CPA) you set.
 *             
 *             <p>A {@linkplain #targetCpa target CPA} must be set for the strategy, but can also be optionally
 *             set for individual ad groups in the strategy. Ad group targets, if set, will override strategy
 *             targets.
 *             
 *             <p>Note that campaigns must meet
 *             <a href="https://support.google.com/adwords/answer/2471188">specific eligibility requirements</a>
 *             before they can use the Target CPA bid strategy.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for TargetCpaBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetCpaBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="targetCpa" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="maxCpcBidCeiling" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *         &lt;element name="maxCpcBidFloor" type="{https://adwords.google.com/api/adwords/cm/v201509}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetCpaBiddingScheme", propOrder = {
    "targetCpa",
    "maxCpcBidCeiling",
    "maxCpcBidFloor"
})
public class TargetCpaBiddingScheme
    extends BiddingScheme
{

    protected Money targetCpa;
    protected Money maxCpcBidCeiling;
    protected Money maxCpcBidFloor;

    /**
     * Gets the value of the targetCpa property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTargetCpa() {
        return targetCpa;
    }

    /**
     * Sets the value of the targetCpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTargetCpa(Money value) {
        this.targetCpa = value;
    }

    /**
     * Gets the value of the maxCpcBidCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxCpcBidCeiling() {
        return maxCpcBidCeiling;
    }

    /**
     * Sets the value of the maxCpcBidCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxCpcBidCeiling(Money value) {
        this.maxCpcBidCeiling = value;
    }

    /**
     * Gets the value of the maxCpcBidFloor property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxCpcBidFloor() {
        return maxCpcBidFloor;
    }

    /**
     * Sets the value of the maxCpcBidFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxCpcBidFloor(Money value) {
        this.maxCpcBidFloor = value;
    }

}
