
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error having to do with {@link PremiumRate}.
 *           
 * 
 * <p>Java class for PremiumRateError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumRateError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201511}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201511}PremiumRateError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumRateError", propOrder = {
    "reason"
})
public class PremiumRateError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected PremiumRateErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumRateErrorReason }
     *     
     */
    public PremiumRateErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumRateErrorReason }
     *     
     */
    public void setReason(PremiumRateErrorReason value) {
        this.reason = value;
    }

}
