
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with live stream event start and end date times.
 *           
 * 
 * <p>Java class for LiveStreamEventDateTimeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiveStreamEventDateTimeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201403}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201403}LiveStreamEventDateTimeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiveStreamEventDateTimeError", propOrder = {
    "reason"
})
public class LiveStreamEventDateTimeError
    extends ApiError
{

    protected LiveStreamEventDateTimeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link LiveStreamEventDateTimeErrorReason }
     *     
     */
    public LiveStreamEventDateTimeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LiveStreamEventDateTimeErrorReason }
     *     
     */
    public void setReason(LiveStreamEventDateTimeErrorReason value) {
        this.reason = value;
    }

}
