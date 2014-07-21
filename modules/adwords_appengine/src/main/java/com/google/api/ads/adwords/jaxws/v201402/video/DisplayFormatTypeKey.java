
package com.google.api.ads.adwords.jaxws.v201402.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Segment key for segmenting by {@link
 *             com.google.ads.api.services.video.common.types.VideoAdDisplayFormat.Type}.
 *           
 * 
 * <p>Java class for DisplayFormatTypeKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayFormatTypeKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayFormatType" type="{https://adwords.google.com/api/adwords/video/v201402}VideoAdDisplayFormat.Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayFormatTypeKey", propOrder = {
    "displayFormatType"
})
public class DisplayFormatTypeKey {

    protected VideoAdDisplayFormatType displayFormatType;

    /**
     * Gets the value of the displayFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoAdDisplayFormatType }
     *     
     */
    public VideoAdDisplayFormatType getDisplayFormatType() {
        return displayFormatType;
    }

    /**
     * Sets the value of the displayFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoAdDisplayFormatType }
     *     
     */
    public void setDisplayFormatType(VideoAdDisplayFormatType value) {
        this.displayFormatType = value;
    }

}
