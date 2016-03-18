
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Error information for AdGroupAdService.
 *           
 * 
 * <p>Java class for AdGroupAdError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdGroupAdError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201509}AdGroupAdError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdGroupAdError", propOrder = {
    "reason"
})
public class AdGroupAdError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdGroupAdErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdGroupAdErrorReason }
     *     
     */
    public AdGroupAdErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdGroupAdErrorReason }
     *     
     */
    public void setReason(AdGroupAdErrorReason value) {
        this.reason = value;
    }

}
