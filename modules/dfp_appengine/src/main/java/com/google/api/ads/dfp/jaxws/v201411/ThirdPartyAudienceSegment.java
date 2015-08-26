
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link ThirdPartyAudienceSegment} is an {@link AudienceSegment} owned by a data provider and
 *             licensed to the DFP publisher.
 *           
 * 
 * <p>Java class for ThirdPartyAudienceSegment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAudienceSegment">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201411}AudienceSegment">
 *       &lt;sequence>
 *         &lt;element name="approvalStatus" type="{https://www.google.com/apis/ads/publisher/v201411}ThirdPartyAudienceSegment.AudienceSegmentApprovalStatus" minOccurs="0"/>
 *         &lt;element name="cost" type="{https://www.google.com/apis/ads/publisher/v201411}Money" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{https://www.google.com/apis/ads/publisher/v201411}DateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{https://www.google.com/apis/ads/publisher/v201411}DateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdPartyAudienceSegment", propOrder = {
    "approvalStatus",
    "cost",
    "startDateTime",
    "endDateTime"
})
public class ThirdPartyAudienceSegment
    extends AudienceSegment
{

    @XmlSchemaType(name = "string")
    protected ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus approvalStatus;
    protected Money cost;
    protected DateTime startDateTime;
    protected DateTime endDateTime;

    /**
     * Gets the value of the approvalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus }
     *     
     */
    public ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * Sets the value of the approvalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus }
     *     
     */
    public void setApprovalStatus(ThirdPartyAudienceSegmentAudienceSegmentApprovalStatus value) {
        this.approvalStatus = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setCost(Money value) {
        this.cost = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setStartDateTime(DateTime value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setEndDateTime(DateTime value) {
        this.endDateTime = value;
    }

}
