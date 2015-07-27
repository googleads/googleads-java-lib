
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error that occurs while executing a PQL query contained in
 *             a {@link Statement} object.
 *           
 * 
 * <p>Java class for PublisherQueryLanguageContextError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublisherQueryLanguageContextError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201405}PublisherQueryLanguageContextError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublisherQueryLanguageContextError", propOrder = {
    "reason"
})
public class PublisherQueryLanguageContextError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected PublisherQueryLanguageContextErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherQueryLanguageContextErrorReason }
     *     
     */
    public PublisherQueryLanguageContextErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherQueryLanguageContextErrorReason }
     *     
     */
    public void setReason(PublisherQueryLanguageContextErrorReason value) {
        this.reason = value;
    }

}
