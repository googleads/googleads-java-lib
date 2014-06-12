
package com.google.api.ads.dfp.jaxws.v201405;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the options for targetable positions within a video.
 *           
 * 
 * <p>Java class for VideoPositionTarget complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoPositionTarget">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videoPosition" type="{https://www.google.com/apis/ads/publisher/v201405}VideoPosition" minOccurs="0"/>
 *         &lt;element name="videoBumperType" type="{https://www.google.com/apis/ads/publisher/v201405}VideoBumperType" minOccurs="0"/>
 *         &lt;element name="videoPositionWithinPod" type="{https://www.google.com/apis/ads/publisher/v201405}VideoPositionWithinPod" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoPositionTarget", propOrder = {
    "videoPosition",
    "videoBumperType",
    "videoPositionWithinPod"
})
public class VideoPositionTarget {

    protected VideoPosition videoPosition;
    protected VideoBumperType videoBumperType;
    protected VideoPositionWithinPod videoPositionWithinPod;

    /**
     * Gets the value of the videoPosition property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPosition }
     *     
     */
    public VideoPosition getVideoPosition() {
        return videoPosition;
    }

    /**
     * Sets the value of the videoPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPosition }
     *     
     */
    public void setVideoPosition(VideoPosition value) {
        this.videoPosition = value;
    }

    /**
     * Gets the value of the videoBumperType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoBumperType }
     *     
     */
    public VideoBumperType getVideoBumperType() {
        return videoBumperType;
    }

    /**
     * Sets the value of the videoBumperType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoBumperType }
     *     
     */
    public void setVideoBumperType(VideoBumperType value) {
        this.videoBumperType = value;
    }

    /**
     * Gets the value of the videoPositionWithinPod property.
     * 
     * @return
     *     possible object is
     *     {@link VideoPositionWithinPod }
     *     
     */
    public VideoPositionWithinPod getVideoPositionWithinPod() {
        return videoPositionWithinPod;
    }

    /**
     * Sets the value of the videoPositionWithinPod property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoPositionWithinPod }
     *     
     */
    public void setVideoPositionWithinPod(VideoPositionWithinPod value) {
        this.videoPositionWithinPod = value;
    }

}
