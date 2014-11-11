
package com.google.api.ads.dfp.jaxws.v201411;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code CreativeAsset} is an asset that can be used in creatives.
 *           
 * 
 * <p>Java class for CreativeAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreativeAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assetByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assetUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="size" type="{https://www.google.com/apis/ads/publisher/v201411}Size" minOccurs="0"/>
 *         &lt;element name="imageDensity" type="{https://www.google.com/apis/ads/publisher/v201411}ImageDensity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreativeAsset", propOrder = {
    "assetId",
    "assetByteArray",
    "fileName",
    "fileSize",
    "assetUrl",
    "size",
    "imageDensity"
})
public class CreativeAsset {

    protected Long assetId;
    protected byte[] assetByteArray;
    protected String fileName;
    protected Long fileSize;
    protected String assetUrl;
    protected Size size;
    protected ImageDensity imageDensity;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAssetId(Long value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAssetByteArray() {
        return assetByteArray;
    }

    /**
     * Sets the value of the assetByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAssetByteArray(byte[] value) {
        this.assetByteArray = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the assetUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetUrl() {
        return assetUrl;
    }

    /**
     * Sets the value of the assetUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetUrl(String value) {
        this.assetUrl = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the imageDensity property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDensity }
     *     
     */
    public ImageDensity getImageDensity() {
        return imageDensity;
    }

    /**
     * Sets the value of the imageDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDensity }
     *     
     */
    public void setImageDensity(ImageDensity value) {
        this.imageDensity = value;
    }

}
