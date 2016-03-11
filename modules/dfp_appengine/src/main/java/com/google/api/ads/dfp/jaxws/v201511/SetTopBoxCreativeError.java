
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors associated with {@link SetTopBoxCreative set-top box creatives}.
 *           
 * 
 * <p>Java class for SetTopBoxCreativeError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTopBoxCreativeError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201511}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201511}SetTopBoxCreativeError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTopBoxCreativeError", propOrder = {
    "reason"
})
public class SetTopBoxCreativeError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected SetTopBoxCreativeErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link SetTopBoxCreativeErrorReason }
     *     
     */
    public SetTopBoxCreativeErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTopBoxCreativeErrorReason }
     *     
     */
    public void setReason(SetTopBoxCreativeErrorReason value) {
        this.reason = value;
    }

}
