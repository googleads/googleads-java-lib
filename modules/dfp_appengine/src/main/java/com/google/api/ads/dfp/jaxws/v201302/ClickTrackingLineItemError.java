
package com.google.api.ads.dfp.jaxws.v201302;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Click tracking is a special line item type with a number of unique errors as
 *             described below.
 *           
 * 
 * <p>Java class for ClickTrackingLineItemError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClickTrackingLineItemError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201302}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201302}ClickTrackingLineItemError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClickTrackingLineItemError", propOrder = {
    "reason"
})
public class ClickTrackingLineItemError
    extends ApiError
{

    protected ClickTrackingLineItemErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ClickTrackingLineItemErrorReason }
     *     
     */
    public ClickTrackingLineItemErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClickTrackingLineItemErrorReason }
     *     
     */
    public void setReason(ClickTrackingLineItemErrorReason value) {
        this.reason = value;
    }

}
