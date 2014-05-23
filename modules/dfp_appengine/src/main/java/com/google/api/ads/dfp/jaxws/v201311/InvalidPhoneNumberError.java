
package com.google.api.ads.dfp.jaxws.v201311;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Lists all errors associated with phone numbers.
 *           
 * 
 * <p>Java class for InvalidPhoneNumberError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidPhoneNumberError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201311}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201311}InvalidPhoneNumberError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidPhoneNumberError", propOrder = {
    "reason"
})
public class InvalidPhoneNumberError
    extends ApiError
{

    protected InvalidPhoneNumberErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidPhoneNumberErrorReason }
     *     
     */
    public InvalidPhoneNumberErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidPhoneNumberErrorReason }
     *     
     */
    public void setReason(InvalidPhoneNumberErrorReason value) {
        this.reason = value;
    }

}
