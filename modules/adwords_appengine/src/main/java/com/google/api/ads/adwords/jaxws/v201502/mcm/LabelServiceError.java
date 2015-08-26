
package com.google.api.ads.adwords.jaxws.v201502.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201502.cm.ApiError;


/**
 * 
 *             Errors for {@link LabelService}.
 *           
 * 
 * <p>Java class for LabelServiceError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelServiceError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201502}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/mcm/v201502}LabelServiceError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelServiceError", propOrder = {
    "reason"
})
public class LabelServiceError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected LabelServiceErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link LabelServiceErrorReason }
     *     
     */
    public LabelServiceErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelServiceErrorReason }
     *     
     */
    public void setReason(LabelServiceErrorReason value) {
        this.reason = value;
    }

}
