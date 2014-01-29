
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Indicates that a server-side error has occured. {@code InternalApiError}s
 *             are generally not the result of an invalid request or message sent by the
 *             client.
 *           
 * 
 * <p>Java class for InternalApiError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalApiError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201208}InternalApiError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalApiError", propOrder = {
    "reason"
})
public class InternalApiError
    extends ApiError
{

    protected InternalApiErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link InternalApiErrorReason }
     *     
     */
    public InternalApiErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalApiErrorReason }
     *     
     */
    public void setReason(InternalApiErrorReason value) {
        this.reason = value;
    }

}
