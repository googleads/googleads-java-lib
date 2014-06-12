
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error having to do with {@link RateCardCustomizationGroup}.
 *           
 * 
 * <p>Java class for RateCardCustomizationGroupError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateCardCustomizationGroupError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201405}RateCardCustomizationGroupError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateCardCustomizationGroupError", propOrder = {
    "reason"
})
public class RateCardCustomizationGroupError
    extends ApiError
{

    protected RateCardCustomizationGroupErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RateCardCustomizationGroupErrorReason }
     *     
     */
    public RateCardCustomizationGroupErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateCardCustomizationGroupErrorReason }
     *     
     */
    public void setReason(RateCardCustomizationGroupErrorReason value) {
        this.reason = value;
    }

}
