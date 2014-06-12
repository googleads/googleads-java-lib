
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that loads an image asset from a specified URL.
 *           
 * 
 * <p>Java class for ImageRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageRedirectCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201405}BaseImageRedirectCreative">
 *       &lt;sequence>
 *         &lt;element name="altText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyImpressionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageRedirectCreative", propOrder = {
    "altText",
    "thirdPartyImpressionUrl"
})
public class ImageRedirectCreative
    extends BaseImageRedirectCreative
{

    protected String altText;
    protected String thirdPartyImpressionUrl;

    /**
     * Gets the value of the altText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltText() {
        return altText;
    }

    /**
     * Sets the value of the altText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltText(String value) {
        this.altText = value;
    }

    /**
     * Gets the value of the thirdPartyImpressionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyImpressionUrl() {
        return thirdPartyImpressionUrl;
    }

    /**
     * Sets the value of the thirdPartyImpressionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyImpressionUrl(String value) {
        this.thirdPartyImpressionUrl = value;
    }

}
