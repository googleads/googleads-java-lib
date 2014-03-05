
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Action that can be performed on {@link AudienceSegment} objects.
 *           
 * 
 * <p>Java class for AudienceSegmentAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudienceSegmentAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AudienceSegmentAction.Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceSegmentAction", propOrder = {
    "audienceSegmentActionType"
})
@XmlSeeAlso({
    ApproveAudienceSegments.class,
    ActivateAudienceSegments.class,
    PopulateAudienceSegments.class,
    RejectAudienceSegments.class,
    DeactivateAudienceSegments.class
})
public abstract class AudienceSegmentAction {

    @XmlElement(name = "AudienceSegmentAction.Type")
    protected String audienceSegmentActionType;

    /**
     * Gets the value of the audienceSegmentActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudienceSegmentActionType() {
        return audienceSegmentActionType;
    }

    /**
     * Sets the value of the audienceSegmentActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudienceSegmentActionType(String value) {
        this.audienceSegmentActionType = value;
    }

}
