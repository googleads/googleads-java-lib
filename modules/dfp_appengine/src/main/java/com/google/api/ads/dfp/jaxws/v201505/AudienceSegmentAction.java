
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudienceSegmentAction")
@XmlSeeAlso({
    PopulateAudienceSegments.class,
    DeactivateAudienceSegments.class,
    RejectAudienceSegments.class,
    ApproveAudienceSegments.class,
    ActivateAudienceSegments.class
})
public abstract class AudienceSegmentAction {


}
