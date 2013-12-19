
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Target Cpa bidding strategy helps you maximize your return on investment
 *             (ROI) by automatically getting you the most possible conversions for your budget.
 *             
 *             This is similar to the <code>ConversionOptimizerBiddingScheme<code> but does not
 *             support user-entered AdGroup-level target CPA bids, but rather a strategy-wide
 *             average CPA target.
 *             
 *             <p>Note that campaigns must meet <a
 *             href="//support.google.com/adwords/bin/answer.py?answer=2471188">specific
 *             eligibility requirements</a> before they can use the <code>TargetCpaBiddingScheme</code>
 *             bidding strategy.
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
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="targetCpa" type="{https://adwords.google.com/api/adwords/cm/v201309}Money" minOccurs="0"/>
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
    "targetCpa"
})
public class TargetCpaBiddingScheme
    extends BiddingScheme
{

    protected Money targetCpa;

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

}
