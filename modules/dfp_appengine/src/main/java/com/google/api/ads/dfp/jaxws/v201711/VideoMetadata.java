// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.dfp.jaxws.v201711;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Metadata for a video asset.
 *           
 * 
 * <p>Java class for VideoMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scalableType" type="{https://www.google.com/apis/ads/publisher/v201711}ScalableType" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bitRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minimumBitRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="maximumBitRate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="size" type="{https://www.google.com/apis/ads/publisher/v201711}Size" minOccurs="0"/>
 *         &lt;element name="mimeType" type="{https://www.google.com/apis/ads/publisher/v201711}MimeType" minOccurs="0"/>
 *         &lt;element name="deliveryType" type="{https://www.google.com/apis/ads/publisher/v201711}VideoDeliveryType" minOccurs="0"/>
 *         &lt;element name="codecs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoMetadata", propOrder = {
    "scalableType",
    "duration",
    "bitRate",
    "minimumBitRate",
    "maximumBitRate",
    "size",
    "mimeType",
    "deliveryType",
    "codecs"
})
public class VideoMetadata {

    @XmlSchemaType(name = "string")
    protected ScalableType scalableType;
    protected Integer duration;
    protected Integer bitRate;
    protected Integer minimumBitRate;
    protected Integer maximumBitRate;
    protected Size size;
    @XmlSchemaType(name = "string")
    protected MimeType mimeType;
    @XmlSchemaType(name = "string")
    protected VideoDeliveryType deliveryType;
    protected List<String> codecs;

    /**
     * Gets the value of the scalableType property.
     * 
     * @return
     *     possible object is
     *     {@link ScalableType }
     *     
     */
    public ScalableType getScalableType() {
        return scalableType;
    }

    /**
     * Sets the value of the scalableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScalableType }
     *     
     */
    public void setScalableType(ScalableType value) {
        this.scalableType = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the bitRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitRate(Integer value) {
        this.bitRate = value;
    }

    /**
     * Gets the value of the minimumBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumBitRate() {
        return minimumBitRate;
    }

    /**
     * Sets the value of the minimumBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumBitRate(Integer value) {
        this.minimumBitRate = value;
    }

    /**
     * Gets the value of the maximumBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumBitRate() {
        return maximumBitRate;
    }

    /**
     * Sets the value of the maximumBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumBitRate(Integer value) {
        this.maximumBitRate = value;
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
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link MimeType }
     *     
     */
    public MimeType getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeType }
     *     
     */
    public void setMimeType(MimeType value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link VideoDeliveryType }
     *     
     */
    public VideoDeliveryType getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoDeliveryType }
     *     
     */
    public void setDeliveryType(VideoDeliveryType value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the codecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCodecs() {
        if (codecs == null) {
            codecs = new ArrayList<String>();
        }
        return this.codecs;
    }

}
