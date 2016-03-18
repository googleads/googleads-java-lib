
package com.google.api.ads.adwords.jaxws.v201509.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a Review extension.
 *           
 * 
 * <p>Java class for ReviewFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201509}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="reviewText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewSourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewSourceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reviewTextExactlyQuoted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewFeedItem", propOrder = {
    "reviewText",
    "reviewSourceName",
    "reviewSourceUrl",
    "reviewTextExactlyQuoted"
})
public class ReviewFeedItem
    extends ExtensionFeedItem
{

    protected String reviewText;
    protected String reviewSourceName;
    protected String reviewSourceUrl;
    protected Boolean reviewTextExactlyQuoted;

    /**
     * Gets the value of the reviewText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewText() {
        return reviewText;
    }

    /**
     * Sets the value of the reviewText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewText(String value) {
        this.reviewText = value;
    }

    /**
     * Gets the value of the reviewSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewSourceName() {
        return reviewSourceName;
    }

    /**
     * Sets the value of the reviewSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewSourceName(String value) {
        this.reviewSourceName = value;
    }

    /**
     * Gets the value of the reviewSourceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReviewSourceUrl() {
        return reviewSourceUrl;
    }

    /**
     * Sets the value of the reviewSourceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReviewSourceUrl(String value) {
        this.reviewSourceUrl = value;
    }

    /**
     * Gets the value of the reviewTextExactlyQuoted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReviewTextExactlyQuoted() {
        return reviewTextExactlyQuoted;
    }

    /**
     * Sets the value of the reviewTextExactlyQuoted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReviewTextExactlyQuoted(Boolean value) {
        this.reviewTextExactlyQuoted = value;
    }

}
