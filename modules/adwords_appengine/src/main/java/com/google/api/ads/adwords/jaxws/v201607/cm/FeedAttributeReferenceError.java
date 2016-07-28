
package com.google.api.ads.adwords.jaxws.v201607.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error indicating a problem with a reference to a feed attribute in an ad.
 *           
 * 
 * <p>Java class for FeedAttributeReferenceError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeedAttributeReferenceError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201607}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201607}FeedAttributeReferenceError.Reason" minOccurs="0"/>
 *         &lt;element name="feedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feedAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedAttributeReferenceError", propOrder = {
    "reason",
    "feedName",
    "feedAttributeName"
})
public class FeedAttributeReferenceError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected FeedAttributeReferenceErrorReason reason;
    protected String feedName;
    protected String feedAttributeName;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link FeedAttributeReferenceErrorReason }
     *     
     */
    public FeedAttributeReferenceErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedAttributeReferenceErrorReason }
     *     
     */
    public void setReason(FeedAttributeReferenceErrorReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the feedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedName() {
        return feedName;
    }

    /**
     * Sets the value of the feedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedName(String value) {
        this.feedName = value;
    }

    /**
     * Gets the value of the feedAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedAttributeName() {
        return feedAttributeName;
    }

    /**
     * Sets the value of the feedAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedAttributeName(String value) {
        this.feedAttributeName = value;
    }

}
