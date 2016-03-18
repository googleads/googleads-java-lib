
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link NonRuleBasedFirstPartyAudienceSegment} is a {@link FirstPartyAudienceSegment} owned by
 *             the publisher network. It doesn't contain a rule. Cookies are usually added to this segment via
 *             cookie upload.
 *             
 *             <p>These segments are created by data management platforms or Google Analytics. They cannot be
 *             created using the DFP API.
 *           
 * 
 * <p>Java class for NonRuleBasedFirstPartyAudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonRuleBasedFirstPartyAudienceSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}FirstPartyAudienceSegment">
 *       &lt;sequence>
 *         &lt;element name="membershipExpirationDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonRuleBasedFirstPartyAudienceSegment", propOrder = {
    "membershipExpirationDays"
})
public class NonRuleBasedFirstPartyAudienceSegment
    extends FirstPartyAudienceSegment
{

    protected Integer membershipExpirationDays;

    /**
     * Gets the value of the membershipExpirationDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMembershipExpirationDays() {
        return membershipExpirationDays;
    }

    /**
     * Sets the value of the membershipExpirationDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMembershipExpirationDays(Integer value) {
        this.membershipExpirationDays = value;
    }

}
