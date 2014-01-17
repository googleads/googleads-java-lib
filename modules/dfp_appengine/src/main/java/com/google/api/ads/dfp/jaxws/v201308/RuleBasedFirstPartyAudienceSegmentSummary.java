
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link RuleBasedFirstPartyAudienceSegmentSummary} is a {@link FirstPartyAudienceSegment} owned
 *             by the publisher network.
 *           
 * 
 * <p>Java class for RuleBasedFirstPartyAudienceSegmentSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleBasedFirstPartyAudienceSegmentSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201308}FirstPartyAudienceSegment">
 *       &lt;sequence>
 *         &lt;element name="pageViews" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="recencyDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "RuleBasedFirstPartyAudienceSegmentSummary", propOrder = {
    "pageViews",
    "recencyDays",
    "membershipExpirationDays"
})
@XmlSeeAlso({
    RuleBasedFirstPartyAudienceSegment.class
})
public class RuleBasedFirstPartyAudienceSegmentSummary
    extends FirstPartyAudienceSegment
{

    protected Integer pageViews;
    protected Integer recencyDays;
    protected Integer membershipExpirationDays;

    /**
     * Gets the value of the pageViews property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageViews() {
        return pageViews;
    }

    /**
     * Sets the value of the pageViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageViews(Integer value) {
        this.pageViews = value;
    }

    /**
     * Gets the value of the recencyDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRecencyDays() {
        return recencyDays;
    }

    /**
     * Sets the value of the recencyDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRecencyDays(Integer value) {
        this.recencyDays = value;
    }

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
