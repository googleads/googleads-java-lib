
package com.google.api.ads.adwords.jaxws.v201502.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Target Spend bidding scheme, in which Google automatically places
 *             bids for the user based on their daily/monthly budget or optional
 *             spend target.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for TargetSpendBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetSpendBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}BiddingScheme">
 *       &lt;sequence>
 *         &lt;element name="bidCeiling" type="{https://adwords.google.com/api/adwords/cm/v201502}Money" minOccurs="0"/>
 *         &lt;element name="spendTarget" type="{https://adwords.google.com/api/adwords/cm/v201502}Money" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetSpendBiddingScheme", propOrder = {
    "bidCeiling",
    "spendTarget"
})
public class TargetSpendBiddingScheme
    extends BiddingScheme
{

    protected Money bidCeiling;
    protected Money spendTarget;

    /**
     * Gets the value of the bidCeiling property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getBidCeiling() {
        return bidCeiling;
    }

    /**
     * Sets the value of the bidCeiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setBidCeiling(Money value) {
        this.bidCeiling = value;
    }

    /**
     * Gets the value of the spendTarget property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSpendTarget() {
        return spendTarget;
    }

    /**
     * Sets the value of the spendTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSpendTarget(Money value) {
        this.spendTarget = value;
    }

}
