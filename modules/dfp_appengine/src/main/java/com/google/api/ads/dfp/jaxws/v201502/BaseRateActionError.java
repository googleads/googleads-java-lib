
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error having to do with {@link BaseRate} when performing actions.
 *           
 * 
 * <p>Java class for BaseRateActionError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseRateActionError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201502}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201502}BaseRateActionError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRateActionError", propOrder = {
    "reason"
})
public class BaseRateActionError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected BaseRateActionErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRateActionErrorReason }
     *     
     */
    public BaseRateActionErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRateActionErrorReason }
     *     
     */
    public void setReason(BaseRateActionErrorReason value) {
        this.reason = value;
    }

}
