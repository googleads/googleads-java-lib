
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Caused by supplying sizes that are not compatible with the Afc sizes.
 *           
 * 
 * <p>Java class for AdUnitAfcSizeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdUnitAfcSizeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201311}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201311}AdUnitAfcSizeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdUnitAfcSizeError", propOrder = {
    "reason"
})
public class AdUnitAfcSizeError
    extends ApiError
{

    protected AdUnitAfcSizeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdUnitAfcSizeErrorReason }
     *     
     */
    public AdUnitAfcSizeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdUnitAfcSizeErrorReason }
     *     
     */
    public void setReason(AdUnitAfcSizeErrorReason value) {
        this.reason = value;
    }

}
