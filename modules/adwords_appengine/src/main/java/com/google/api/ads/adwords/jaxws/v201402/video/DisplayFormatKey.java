
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A SegmentKey for segmenting by {@link VideoAdDisplayFormat}.
 *           
 * 
 * <p>Java class for DisplayFormatKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayFormatKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayFormat" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdDisplayFormat" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayFormatKey", propOrder = {
    "displayFormat"
})
public class DisplayFormatKey {

    protected VideoAdDisplayFormat displayFormat;

    /**
     * Gets the value of the displayFormat property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdDisplayFormat }
     *     
     */
    public VideoAdDisplayFormat getDisplayFormat() {
        return displayFormat;
    }

    /**
     * Sets the value of the displayFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdDisplayFormat }
     *     
     */
    public void setDisplayFormat(VideoAdDisplayFormat value) {
        this.displayFormat = value;
    }

}
