// Copyright 2018 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201802;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An overlay {@code Creative} that loads an image asset from a specified URL
 *             and is served via VAST 2.0 XML. Overlays cover part of the video content
 *             they are displayed on top of.  This creative is read only.
 *           
 * 
 * <p>Java class for ImageRedirectOverlayCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageRedirectOverlayCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}BaseImageRedirectCreative">
 *       &lt;sequence>
 *         &lt;element name="assetSize" type="{https://www.google.com/apis/ads/publisher/v201802}Size" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="companionCreativeIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trackingUrls" type="{https://www.google.com/apis/ads/publisher/v201802}ConversionEvent_TrackingUrlsMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vastPreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageRedirectOverlayCreative", propOrder = {
    "assetSize",
    "duration",
    "companionCreativeIds",
    "trackingUrls",
    "customParameters",
    "vastPreviewUrl"
})
public class ImageRedirectOverlayCreative
    extends BaseImageRedirectCreative
{

    protected Size assetSize;
    protected Integer duration;
    @XmlElement(type = Long.class)
    protected List<Long> companionCreativeIds;
    protected List<ConversionEventTrackingUrlsMapEntry> trackingUrls;
    protected String customParameters;
    protected String vastPreviewUrl;

    /**
     * Gets the value of the assetSize property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getAssetSize() {
        return assetSize;
    }

    /**
     * Sets the value of the assetSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setAssetSize(Size value) {
        this.assetSize = value;
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
     * Gets the value of the companionCreativeIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companionCreativeIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanionCreativeIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getCompanionCreativeIds() {
        if (companionCreativeIds == null) {
            companionCreativeIds = new ArrayList<Long>();
        }
        return this.companionCreativeIds;
    }

    /**
     * Gets the value of the trackingUrls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingUrls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingUrls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConversionEventTrackingUrlsMapEntry }
     * 
     * 
     */
    public List<ConversionEventTrackingUrlsMapEntry> getTrackingUrls() {
        if (trackingUrls == null) {
            trackingUrls = new ArrayList<ConversionEventTrackingUrlsMapEntry>();
        }
        return this.trackingUrls;
    }

    /**
     * Gets the value of the customParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomParameters() {
        return customParameters;
    }

    /**
     * Sets the value of the customParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomParameters(String value) {
        this.customParameters = value;
    }

    /**
     * Gets the value of the vastPreviewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVastPreviewUrl() {
        return vastPreviewUrl;
    }

    /**
     * Sets the value of the vastPreviewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVastPreviewUrl(String value) {
        this.vastPreviewUrl = value;
    }

}
