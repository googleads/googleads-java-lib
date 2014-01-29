
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with Rich Media Studio creatives.
 *           
 * 
 * <p>Java class for RichMediaStudioCreativeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RichMediaStudioCreativeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201308}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201308}RichMediaStudioCreativeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RichMediaStudioCreativeError", propOrder = {
    "reason"
})
public class RichMediaStudioCreativeError
    extends ApiError
{

    protected RichMediaStudioCreativeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link RichMediaStudioCreativeErrorReason }
     *     
     */
    public RichMediaStudioCreativeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RichMediaStudioCreativeErrorReason }
     *     
     */
    public void setReason(RichMediaStudioCreativeErrorReason value) {
        this.reason = value;
    }

}
