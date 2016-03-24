
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error that can occur during calls to the ConversionTypeService.
 *           
 * 
 * <p>Java class for ConversionTrackingError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionTrackingError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201603}ConversionTrackingError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionTrackingError", propOrder = {
    "reason"
})
public class ConversionTrackingError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected ConversionTrackingErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionTrackingErrorReason }
     *     
     */
    public ConversionTrackingErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionTrackingErrorReason }
     *     
     */
    public void setReason(ConversionTrackingErrorReason value) {
        this.reason = value;
    }

}
