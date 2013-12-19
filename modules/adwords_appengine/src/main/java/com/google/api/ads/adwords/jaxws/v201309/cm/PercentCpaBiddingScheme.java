
package com.google.api.ads.adwords.jaxws.v201309.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Percentage CPA based bidding scheme attributes where user pays a percent of conversions.
 *             This bidding strategy is available only to some advertisers.
 *             <p>A campaign can only be created with PercentCPA bidding strategy. Existing
 *             campaigns with a different bidding strategy cannot be transitioned to PercentCPA.
 *             <p>Similarly, once created as a PercentCPA, a campaign cannot be transitioned to
 *             any other bidding strategy.
 *             <span class="constraint AdxEnabled">This is disabled for AdX.</span>
 *           
 * 
 * <p>Java class for PercentCpaBiddingScheme complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentCpaBiddingScheme">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201309}BiddingScheme">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentCpaBiddingScheme")
public class PercentCpaBiddingScheme
    extends BiddingScheme
{


}
