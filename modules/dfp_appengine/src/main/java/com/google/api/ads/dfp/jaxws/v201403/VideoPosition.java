
package com.google.api.ads.dfp.jaxws.v201403;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a targetable position within a video. A video ad can be targeted
 *             to a position (pre-roll, all mid-rolls, or post-roll), or to a specific mid-roll index.
 *           
 * 
 * <p>Java class for VideoPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionType" type="{https://www.google.com/apis/ads/publisher/v201403}VideoPosition.Type" minOccurs="0"/>
 *         &lt;element name="midrollIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPosition", propOrder = {
    "positionType",
    "midrollIndex"
})
public class VideoPosition {

    protected VideoPositionType positionType;
    protected Integer midrollIndex;

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionType }
     *     
     */
    public VideoPositionType getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionType }
     *     
     */
    public void setPositionType(VideoPositionType value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the midrollIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMidrollIndex() {
        return midrollIndex;
    }

    /**
     * Sets the value of the midrollIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMidrollIndex(Integer value) {
        this.midrollIndex = value;
    }

}
