
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors specific to editing custom field values
 *           
 * 
 * <p>Java class for CustomFieldValueError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFieldValueError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201602}CustomFieldValueError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldValueError", propOrder = {
    "reason"
})
public class CustomFieldValueError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected CustomFieldValueErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldValueErrorReason }
     *     
     */
    public CustomFieldValueErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldValueErrorReason }
     *     
     */
    public void setReason(CustomFieldValueErrorReason value) {
        this.reason = value;
    }

}
