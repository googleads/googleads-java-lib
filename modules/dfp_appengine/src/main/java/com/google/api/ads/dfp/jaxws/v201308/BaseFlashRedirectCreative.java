
package com.google.api.ads.dfp.jaxws.v201308;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The base type for creatives that load a Flash asset from a specified URL.
 *             If the remote flash asset cannot be served, a fallback image is used at an
 *             alternate URL.
 *           
 * 
 * <p>Java class for BaseFlashRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFlashRedirectCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201308}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="flashUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackPreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFlashRedirectCreative", propOrder = {
    "flashUrl",
    "fallbackUrl",
    "fallbackPreviewUrl"
})
@XmlSeeAlso({
    FlashRedirectCreative.class,
    FlashRedirectOverlayCreative.class
})
public abstract class BaseFlashRedirectCreative
    extends HasDestinationUrlCreative
{

    protected String flashUrl;
    protected String fallbackUrl;
    protected String fallbackPreviewUrl;

    /**
     * Gets the value of the flashUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashUrl() {
        return flashUrl;
    }

    /**
     * Sets the value of the flashUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashUrl(String value) {
        this.flashUrl = value;
    }

    /**
     * Gets the value of the fallbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackUrl() {
        return fallbackUrl;
    }

    /**
     * Sets the value of the fallbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackUrl(String value) {
        this.fallbackUrl = value;
    }

    /**
     * Gets the value of the fallbackPreviewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackPreviewUrl() {
        return fallbackPreviewUrl;
    }

    /**
     * Sets the value of the fallbackPreviewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackPreviewUrl(String value) {
        this.fallbackPreviewUrl = value;
    }

}
