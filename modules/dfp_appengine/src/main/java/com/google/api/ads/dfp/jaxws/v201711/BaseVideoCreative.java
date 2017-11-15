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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base type for video creatives.
 *           
 * 
 * <p>Java class for BaseVideoCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseVideoCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="allowDurationOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trackingUrls" type="{https://www.google.com/apis/ads/publisher/v201711}ConversionEvent_TrackingUrlsMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companionCreativeIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customParameters" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="skippableAdType" type="{https://www.google.com/apis/ads/publisher/v201711}SkippableAdType" minOccurs="0"/>
 *         &lt;element name="vastPreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sslScanResult" type="{https://www.google.com/apis/ads/publisher/v201711}SslScanResult" minOccurs="0"/>
 *         &lt;element name="sslManualOverride" type="{https://www.google.com/apis/ads/publisher/v201711}SslManualOverride" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVideoCreative", propOrder = {
    "duration",
    "allowDurationOverride",
    "trackingUrls",
    "companionCreativeIds",
    "customParameters",
    "skippableAdType",
    "vastPreviewUrl",
    "sslScanResult",
    "sslManualOverride"
})
@XmlSeeAlso({
    VideoCreative.class,
    VideoRedirectCreative.class,
    SetTopBoxCreative.class
})
public abstract class BaseVideoCreative
    extends HasDestinationUrlCreative
{

    protected Integer duration;
    protected Boolean allowDurationOverride;
    protected List<ConversionEventTrackingUrlsMapEntry> trackingUrls;
    @XmlElement(type = Long.class)
    protected List<Long> companionCreativeIds;
    protected String customParameters;
    @XmlSchemaType(name = "string")
    protected SkippableAdType skippableAdType;
    protected String vastPreviewUrl;
    @XmlSchemaType(name = "string")
    protected SslScanResult sslScanResult;
    @XmlSchemaType(name = "string")
    protected SslManualOverride sslManualOverride;

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
     * Gets the value of the allowDurationOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDurationOverride() {
        return allowDurationOverride;
    }

    /**
     * Sets the value of the allowDurationOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDurationOverride(Boolean value) {
        this.allowDurationOverride = value;
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
     * Gets the value of the skippableAdType property.
     * 
     * @return
     *     possible object is
     *     {@link SkippableAdType }
     *     
     */
    public SkippableAdType getSkippableAdType() {
        return skippableAdType;
    }

    /**
     * Sets the value of the skippableAdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkippableAdType }
     *     
     */
    public void setSkippableAdType(SkippableAdType value) {
        this.skippableAdType = value;
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

    /**
     * Gets the value of the sslScanResult property.
     * 
     * @return
     *     possible object is
     *     {@link SslScanResult }
     *     
     */
    public SslScanResult getSslScanResult() {
        return sslScanResult;
    }

    /**
     * Sets the value of the sslScanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslScanResult }
     *     
     */
    public void setSslScanResult(SslScanResult value) {
        this.sslScanResult = value;
    }

    /**
     * Gets the value of the sslManualOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SslManualOverride }
     *     
     */
    public SslManualOverride getSslManualOverride() {
        return sslManualOverride;
    }

    /**
     * Sets the value of the sslManualOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SslManualOverride }
     *     
     */
    public void setSslManualOverride(SslManualOverride value) {
        this.sslManualOverride = value;
    }

}
