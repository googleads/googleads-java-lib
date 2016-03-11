
package com.google.api.ads.dfp.jaxws.v201508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors related to {@link VideoPositionTargeting}.
 *           
 * 
 * <p>Java class for VideoPositionTargetingError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPositionTargetingError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201508}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201508}VideoPositionTargetingError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPositionTargetingError", propOrder = {
    "reason"
})
public class VideoPositionTargetingError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected VideoPositionTargetingErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionTargetingErrorReason }
     *     
     */
    public VideoPositionTargetingErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionTargetingErrorReason }
     *     
     */
    public void setReason(VideoPositionTargetingErrorReason value) {
        this.reason = value;
    }

}
