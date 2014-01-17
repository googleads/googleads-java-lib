
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base type for creatives that display a Flash-based ad. If the Flash ad
 *             cannot load, a fallback image is displayed instead.
 *           
 * 
 * <p>Java class for BaseFlashCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFlashCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="flashName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flashByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fallbackImageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackImageByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clickTagRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fallbackPreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flashAssetSize" type="{https://www.google.com/apis/ads/publisher/v201208}Size" minOccurs="0"/>
 *         &lt;element name="fallbackAssetSize" type="{https://www.google.com/apis/ads/publisher/v201208}Size" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFlashCreative", propOrder = {
    "flashName",
    "flashByteArray",
    "fallbackImageName",
    "fallbackImageByteArray",
    "overrideSize",
    "clickTagRequired",
    "fallbackPreviewUrl",
    "flashAssetSize",
    "fallbackAssetSize"
})
@XmlSeeAlso({
    FlashOverlayCreative.class,
    FlashCreative.class
})
public abstract class BaseFlashCreative
    extends HasDestinationUrlCreative
{

    protected String flashName;
    protected byte[] flashByteArray;
    protected String fallbackImageName;
    protected byte[] fallbackImageByteArray;
    protected Boolean overrideSize;
    protected Boolean clickTagRequired;
    protected String fallbackPreviewUrl;
    protected Size flashAssetSize;
    protected Size fallbackAssetSize;

    /**
     * Gets the value of the flashName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashName() {
        return flashName;
    }

    /**
     * Sets the value of the flashName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashName(String value) {
        this.flashName = value;
    }

    /**
     * Gets the value of the flashByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFlashByteArray() {
        return flashByteArray;
    }

    /**
     * Sets the value of the flashByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFlashByteArray(byte[] value) {
        this.flashByteArray = value;
    }

    /**
     * Gets the value of the fallbackImageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackImageName() {
        return fallbackImageName;
    }

    /**
     * Sets the value of the fallbackImageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackImageName(String value) {
        this.fallbackImageName = value;
    }

    /**
     * Gets the value of the fallbackImageByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFallbackImageByteArray() {
        return fallbackImageByteArray;
    }

    /**
     * Sets the value of the fallbackImageByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFallbackImageByteArray(byte[] value) {
        this.fallbackImageByteArray = value;
    }

    /**
     * Gets the value of the overrideSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideSize() {
        return overrideSize;
    }

    /**
     * Sets the value of the overrideSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideSize(Boolean value) {
        this.overrideSize = value;
    }

    /**
     * Gets the value of the clickTagRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClickTagRequired() {
        return clickTagRequired;
    }

    /**
     * Sets the value of the clickTagRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClickTagRequired(Boolean value) {
        this.clickTagRequired = value;
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

    /**
     * Gets the value of the flashAssetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getFlashAssetSize() {
        return flashAssetSize;
    }

    /**
     * Sets the value of the flashAssetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setFlashAssetSize(Size value) {
        this.flashAssetSize = value;
    }

    /**
     * Gets the value of the fallbackAssetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getFallbackAssetSize() {
        return fallbackAssetSize;
    }

    /**
     * Sets the value of the fallbackAssetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setFallbackAssetSize(Size value) {
        this.fallbackAssetSize = value;
    }

}
