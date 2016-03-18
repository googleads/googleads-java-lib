
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Error for AdSense related API calls.
 *           
 * 
 * <p>Java class for AdSenseAccountError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdSenseAccountError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201505}AdSenseAccountError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdSenseAccountError", propOrder = {
    "reason"
})
public class AdSenseAccountError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdSenseAccountErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdSenseAccountErrorReason }
     *     
     */
    public AdSenseAccountErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdSenseAccountErrorReason }
     *     
     */
    public void setReason(AdSenseAccountErrorReason value) {
        this.reason = value;
    }

}
