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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A base type for creatives that display a Flash-based ad. If the Flash ad
 *             cannot load, a fallback image is displayed instead.
 *           
 * 
 * <p>Java class for BaseFlashCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFlashCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="clickTagRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sslScanResult" type="{https://www.google.com/apis/ads/publisher/v201711}SslScanResult" minOccurs="0"/>
 *         &lt;element name="sslManualOverride" type="{https://www.google.com/apis/ads/publisher/v201711}SslManualOverride" minOccurs="0"/>
 *         &lt;element name="flashAsset" type="{https://www.google.com/apis/ads/publisher/v201711}CreativeAsset" minOccurs="0"/>
 *         &lt;element name="fallbackImageAsset" type="{https://www.google.com/apis/ads/publisher/v201711}CreativeAsset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFlashCreative", propOrder = {
    "overrideSize",
    "clickTagRequired",
    "sslScanResult",
    "sslManualOverride",
    "flashAsset",
    "fallbackImageAsset"
})
@XmlSeeAlso({
    FlashCreative.class,
    FlashOverlayCreative.class
})
public abstract class BaseFlashCreative
    extends HasDestinationUrlCreative
{

    protected Boolean overrideSize;
    protected Boolean clickTagRequired;
    @XmlSchemaType(name = "string")
    protected SslScanResult sslScanResult;
    @XmlSchemaType(name = "string")
    protected SslManualOverride sslManualOverride;
    protected CreativeAsset flashAsset;
    protected CreativeAsset fallbackImageAsset;

    /**
     * Gets the value of the overrideSize property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideSize() {
        return overrideSize;
    }

    /**
     * Sets the value of the overrideSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideSize(Boolean value) {
        this.overrideSize = value;
    }

    /**
     * Gets the value of the clickTagRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClickTagRequired() {
        return clickTagRequired;
    }

    /**
     * Sets the value of the clickTagRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClickTagRequired(Boolean value) {
        this.clickTagRequired = value;
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

    /**
     * Gets the value of the flashAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getFlashAsset() {
        return flashAsset;
    }

    /**
     * Sets the value of the flashAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setFlashAsset(CreativeAsset value) {
        this.flashAsset = value;
    }

    /**
     * Gets the value of the fallbackImageAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getFallbackImageAsset() {
        return fallbackImageAsset;
    }

    /**
     * Sets the value of the fallbackImageAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setFallbackImageAsset(CreativeAsset value) {
        this.fallbackImageAsset = value;
    }

}
