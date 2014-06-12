
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A rate customization applied to audience segment targeting.
 *           
 * 
 * <p>Java class for AudienceSegmentRateCardFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceSegmentRateCardFeature">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}RateCardFeature">
 *       &lt;sequence>
 *         &lt;element name="audienceSegmentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceSegmentRateCardFeature", propOrder = {
    "audienceSegmentId"
})
public class AudienceSegmentRateCardFeature
    extends RateCardFeature
{

    protected Long audienceSegmentId;

    /**
     * Gets the value of the audienceSegmentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAudienceSegmentId() {
        return audienceSegmentId;
    }

    /**
     * Sets the value of the audienceSegmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAudienceSegmentId(Long value) {
        this.audienceSegmentId = value;
    }

}
