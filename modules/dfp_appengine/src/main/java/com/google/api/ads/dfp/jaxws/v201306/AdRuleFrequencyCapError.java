
package com.google.api.ads.dfp.jaxws.v201306;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors related to ad rule frequency caps
 *           
 * 
 * <p>Java class for AdRuleFrequencyCapError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdRuleFrequencyCapError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201306}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201306}AdRuleFrequencyCapError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdRuleFrequencyCapError", propOrder = {
    "reason"
})
public class AdRuleFrequencyCapError
    extends ApiError
{

    protected AdRuleFrequencyCapErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdRuleFrequencyCapErrorReason }
     *     
     */
    public AdRuleFrequencyCapErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdRuleFrequencyCapErrorReason }
     *     
     */
    public void setReason(AdRuleFrequencyCapErrorReason value) {
        this.reason = value;
    }

}
