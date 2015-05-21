
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link FirstPartyAudienceSegment} is an {@link AudienceSegment} owned by the publisher network.
 *           
 * 
 * <p>Java class for FirstPartyAudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FirstPartyAudienceSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}AudienceSegment">
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
@XmlType(name = "FirstPartyAudienceSegment")
@XmlSeeAlso({
    NonRuleBasedFirstPartyAudienceSegment.class,
    RuleBasedFirstPartyAudienceSegmentSummary.class
})
public abstract class FirstPartyAudienceSegment
    extends AudienceSegment
{


}
