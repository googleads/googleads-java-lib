
package com.google.api.ads.adwords.jaxws.v201502.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Base interface for types of display ads.
 *           
 * 
 * <p>Java class for DisplayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FlashDisplayType" type="{https://adwords.google.com/api/adwords/o/v201502}FlashDisplayType"/>
 *         &lt;element name="HtmlDisplayType" type="{https://adwords.google.com/api/adwords/o/v201502}HtmlDisplayType"/>
 *         &lt;element name="ImageDisplayType" type="{https://adwords.google.com/api/adwords/o/v201502}ImageDisplayType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayType", propOrder = {
    "flashDisplayType",
    "htmlDisplayType",
    "imageDisplayType"
})
public class DisplayType {

    @XmlElement(name = "FlashDisplayType")
    protected FlashDisplayType flashDisplayType;
    @XmlElement(name = "HtmlDisplayType")
    protected HtmlDisplayType htmlDisplayType;
    @XmlElement(name = "ImageDisplayType")
    protected ImageDisplayType imageDisplayType;

    /**
     * Gets the value of the flashDisplayType property.
     * 
     * @return
     *     possible object is
     *     {@link FlashDisplayType }
     *     
     */
    public FlashDisplayType getFlashDisplayType() {
        return flashDisplayType;
    }

    /**
     * Sets the value of the flashDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashDisplayType }
     *     
     */
    public void setFlashDisplayType(FlashDisplayType value) {
        this.flashDisplayType = value;
    }

    /**
     * Gets the value of the htmlDisplayType property.
     * 
     * @return
     *     possible object is
     *     {@link HtmlDisplayType }
     *     
     */
    public HtmlDisplayType getHtmlDisplayType() {
        return htmlDisplayType;
    }

    /**
     * Sets the value of the htmlDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HtmlDisplayType }
     *     
     */
    public void setHtmlDisplayType(HtmlDisplayType value) {
        this.htmlDisplayType = value;
    }

    /**
     * Gets the value of the imageDisplayType property.
     * 
     * @return
     *     possible object is
     *     {@link ImageDisplayType }
     *     
     */
    public ImageDisplayType getImageDisplayType() {
        return imageDisplayType;
    }

    /**
     * Sets the value of the imageDisplayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageDisplayType }
     *     
     */
    public void setImageDisplayType(ImageDisplayType value) {
        this.imageDisplayType = value;
    }

}
