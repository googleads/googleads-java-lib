
package com.google.api.ads.dfp.jaxws.v201208;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The base type for creatives that display an image.
 *           
 * 
 * <p>Java class for BaseImageCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseImageCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201208}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="assetSize" type="{https://www.google.com/apis/ads/publisher/v201208}Size" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseImageCreative", propOrder = {
    "imageName",
    "imageByteArray",
    "overrideSize",
    "assetSize",
    "imageUrl"
})
@XmlSeeAlso({
    ImageCreative.class,
    ImageOverlayCreative.class
})
public abstract class BaseImageCreative
    extends HasDestinationUrlCreative
{

    protected String imageName;
    protected byte[] imageByteArray;
    protected Boolean overrideSize;
    protected Size assetSize;
    protected String imageUrl;

    /**
     * Gets the value of the imageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Sets the value of the imageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    /**
     * Gets the value of the imageByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageByteArray() {
        return imageByteArray;
    }

    /**
     * Sets the value of the imageByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageByteArray(byte[] value) {
        this.imageByteArray = value;
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
     * Gets the value of the assetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getAssetSize() {
        return assetSize;
    }

    /**
     * Sets the value of the assetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setAssetSize(Size value) {
        this.assetSize = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

}
