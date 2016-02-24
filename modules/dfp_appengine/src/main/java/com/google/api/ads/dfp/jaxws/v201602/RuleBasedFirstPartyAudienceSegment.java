
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link RuleBasedFirstPartyAudienceSegment} is a {@link FirstPartyAudienceSegment} owned by the
 *             publisher network. It contains a rule.
 *           
 * 
 * <p>Java class for RuleBasedFirstPartyAudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleBasedFirstPartyAudienceSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}RuleBasedFirstPartyAudienceSegmentSummary">
 *       &lt;sequence>
 *         &lt;element name="rule" type="{https://www.google.com/apis/ads/publisher/v201602}FirstPartyAudienceSegmentRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleBasedFirstPartyAudienceSegment", propOrder = {
    "rule"
})
public class RuleBasedFirstPartyAudienceSegment
    extends RuleBasedFirstPartyAudienceSegmentSummary
{

    protected FirstPartyAudienceSegmentRule rule;

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link FirstPartyAudienceSegmentRule }
     *     
     */
    public FirstPartyAudienceSegmentRule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstPartyAudienceSegmentRule }
     *     
     */
    public void setRule(FirstPartyAudienceSegmentRule value) {
        this.rule = value;
    }

}
