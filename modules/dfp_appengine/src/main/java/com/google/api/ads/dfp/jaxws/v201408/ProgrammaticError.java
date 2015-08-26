
package com.google.api.ads.dfp.jaxws.v201408;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors associated with programmatic line items
 *           
 * 
 * <p>Java class for ProgrammaticError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgrammaticError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201408}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201408}ProgrammaticError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgrammaticError", propOrder = {
    "reason"
})
public class ProgrammaticError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected ProgrammaticErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ProgrammaticErrorReason }
     *     
     */
    public ProgrammaticErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgrammaticErrorReason }
     *     
     */
    public void setReason(ProgrammaticErrorReason value) {
        this.reason = value;
    }

}
