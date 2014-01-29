
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors that indicate issues with the function.
 *           
 * 
 * <p>Java class for FunctionError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201306}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201306}FunctionError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionError", propOrder = {
    "reason"
})
public class FunctionError
    extends ApiError
{

    protected FunctionErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionErrorReason }
     *     
     */
    public FunctionErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionErrorReason }
     *     
     */
    public void setReason(FunctionErrorReason value) {
        this.reason = value;
    }

}
