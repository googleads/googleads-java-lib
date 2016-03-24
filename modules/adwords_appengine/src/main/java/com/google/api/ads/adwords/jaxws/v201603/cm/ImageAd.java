
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents an ImageAd.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ImageAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201603}Ad">
 *       &lt;sequence>
 *         &lt;element name="image" type="{https://adwords.google.com/api/adwords/cm/v201603}Image" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adToCopyImageFrom" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageAd", propOrder = {
    "image",
    "name",
    "adToCopyImageFrom"
})
public class ImageAd
    extends Ad
{

    protected Image image;
    protected String name;
    protected Long adToCopyImageFrom;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setImage(Image value) {
        this.image = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the adToCopyImageFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdToCopyImageFrom() {
        return adToCopyImageFrom;
    }

    /**
     * Sets the value of the adToCopyImageFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdToCopyImageFrom(Long value) {
        this.adToCopyImageFrom = value;
    }

}
