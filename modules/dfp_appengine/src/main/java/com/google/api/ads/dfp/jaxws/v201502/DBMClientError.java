
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Errors related to using the DBM Api.
 *           
 * 
 * <p>Java class for DBMClientError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBMClientError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201502}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201502}DBMClientError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBMClientError", propOrder = {
    "reason"
})
public class DBMClientError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected DBMClientErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link DBMClientErrorReason }
     *     
     */
    public DBMClientErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DBMClientErrorReason }
     *     
     */
    public void setReason(DBMClientErrorReason value) {
        this.reason = value;
    }

}
