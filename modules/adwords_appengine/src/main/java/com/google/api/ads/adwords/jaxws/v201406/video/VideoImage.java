
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an image within a VideoAd.
 *           
 * 
 * <p>Java class for VideoImage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoImage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{https://adwords.google.com/api/adwords/video/v201406}VideoImage.Type" minOccurs="0"/>
 *         &lt;element name="secondaryType" type="{https://adwords.google.com/api/adwords/video/v201406}VideoImage.Type" minOccurs="0"/>
 *         &lt;element name="mediaId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mimeType" type="{https://adwords.google.com/api/adwords/video/v201406}VideoImage.MimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoImage", propOrder = {
    "type",
    "secondaryType",
    "mediaId",
    "url",
    "mimeType"
})
public class VideoImage {

    protected VideoImageType type;
    protected VideoImageType secondaryType;
    protected Long mediaId;
    protected String url;
    protected VideoImageMimeType mimeType;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VideoImageType }
     *     
     */
    public VideoImageType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoImageType }
     *     
     */
    public void setType(VideoImageType value) {
        this.type = value;
    }

    /**
     * Gets the value of the secondaryType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoImageType }
     *     
     */
    public VideoImageType getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoImageType }
     *     
     */
    public void setSecondaryType(VideoImageType value) {
        this.secondaryType = value;
    }

    /**
     * Gets the value of the mediaId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMediaId() {
        return mediaId;
    }

    /**
     * Sets the value of the mediaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMediaId(Long value) {
        this.mediaId = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoImageMimeType }
     *     
     */
    public VideoImageMimeType getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoImageMimeType }
     *     
     */
    public void setMimeType(VideoImageMimeType value) {
        this.mimeType = value;
    }

}
