
package com.google.api.ads.dfp.jaxws.v201602;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error that occurs while parsing a PQL query contained in a
 *             {@link Statement} object.
 *           
 * 
 * <p>Java class for PublisherQueryLanguageSyntaxError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublisherQueryLanguageSyntaxError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201602}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://www.google.com/apis/ads/publisher/v201602}PublisherQueryLanguageSyntaxError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublisherQueryLanguageSyntaxError", propOrder = {
    "reason"
})
public class PublisherQueryLanguageSyntaxError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected PublisherQueryLanguageSyntaxErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link PublisherQueryLanguageSyntaxErrorReason }
     *     
     */
    public PublisherQueryLanguageSyntaxErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublisherQueryLanguageSyntaxErrorReason }
     *     
     */
    public void setReason(PublisherQueryLanguageSyntaxErrorReason value) {
        this.reason = value;
    }

}
