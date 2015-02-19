
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors associated with set-top box {@link LineItem line items}.
 *           
 * 
 * <p>Java class for SetTopBoxLineItemError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTopBoxLineItemError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201502}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201502}SetTopBoxLineItemError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTopBoxLineItemError", propOrder = {
    "reason"
})
public class SetTopBoxLineItemError
    extends ApiError
{

    protected SetTopBoxLineItemErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link SetTopBoxLineItemErrorReason }
     *     
     */
    public SetTopBoxLineItemErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTopBoxLineItemErrorReason }
     *     
     */
    public void setReason(SetTopBoxLineItemErrorReason value) {
        this.reason = value;
    }

}
