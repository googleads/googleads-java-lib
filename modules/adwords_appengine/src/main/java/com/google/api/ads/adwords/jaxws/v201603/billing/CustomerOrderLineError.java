
package com.google.api.ads.adwords.jaxws.v201603.billing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201603.cm.ApiError;


/**
 * 
 *             Error information returned for CustomerOrderLineService.
 *           
 * 
 * <p>Java class for CustomerOrderLineError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrderLineError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/billing/v201603}CustomerOrderLineError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrderLineError", propOrder = {
    "reason"
})
public class CustomerOrderLineError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected CustomerOrderLineErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderLineErrorReason }
     *     
     */
    public CustomerOrderLineErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderLineErrorReason }
     *     
     */
    public void setReason(CustomerOrderLineErrorReason value) {
        this.reason = value;
    }

}
