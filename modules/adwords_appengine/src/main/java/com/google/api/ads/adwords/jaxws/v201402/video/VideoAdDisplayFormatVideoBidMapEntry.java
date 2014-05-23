
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             This represents an entry in a map with a key of type VideoAdDisplayFormat
 *             and value of type VideoBid.
 *           
 * 
 * <p>Java class for VideoAdDisplayFormat_VideoBidMapEntry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAdDisplayFormat_VideoBidMapEntry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdDisplayFormat" minOccurs="0"/>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/video/v201402}VideoBid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAdDisplayFormat_VideoBidMapEntry", propOrder = {
    "key",
    "value"
})
public class VideoAdDisplayFormatVideoBidMapEntry {

    protected VideoAdDisplayFormat key;
    protected VideoBid value;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdDisplayFormat }
     *     
     */
    public VideoAdDisplayFormat getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdDisplayFormat }
     *     
     */
    public void setKey(VideoAdDisplayFormat value) {
        this.key = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link VideoBid }
     *     
     */
    public VideoBid getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoBid }
     *     
     */
    public void setValue(VideoBid value) {
        this.value = value;
    }

}
