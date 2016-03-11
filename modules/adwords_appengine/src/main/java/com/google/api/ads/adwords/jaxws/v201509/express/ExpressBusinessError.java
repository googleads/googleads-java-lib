
package com.google.api.ads.adwords.jaxws.v201509.express;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.google.api.ads.adwords.jaxws.v201509.cm.ApiError;


/**
 * 
 *             Express business related errors.
 *           
 * 
 * <p>Java class for ExpressBusinessError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressBusinessError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/express/v201509}ExpressBusinessError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressBusinessError", propOrder = {
    "reason"
})
public class ExpressBusinessError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected ExpressBusinessErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressBusinessErrorReason }
     *     
     */
    public ExpressBusinessErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressBusinessErrorReason }
     *     
     */
    public void setReason(ExpressBusinessErrorReason value) {
        this.reason = value;
    }

}
