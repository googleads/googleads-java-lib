
package com.google.api.ads.adwords.jaxws.v201406.video;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A SegmentKey for segmenting by VideoAd.
 *           
 * 
 * <p>Java class for VideoAdKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoAdKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videoAdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="videoAdId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAdKey", propOrder = {
    "videoAdName",
    "videoAdId"
})
public class VideoAdKey {

    protected String videoAdName;
    protected Long videoAdId;

    /**
     * Gets the value of the videoAdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoAdName() {
        return videoAdName;
    }

    /**
     * Sets the value of the videoAdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoAdName(String value) {
        this.videoAdName = value;
    }

    /**
     * Gets the value of the videoAdId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVideoAdId() {
        return videoAdId;
    }

    /**
     * Sets the value of the videoAdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVideoAdId(Long value) {
        this.videoAdId = value;
    }

}
