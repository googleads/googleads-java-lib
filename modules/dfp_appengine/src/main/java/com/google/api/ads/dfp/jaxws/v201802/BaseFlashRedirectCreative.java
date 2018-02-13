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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The base type for creatives that load a Flash asset from a specified URL.
 *             If the remote flash asset cannot be served, a fallback image is used at an
 *             alternate URL.
 *           
 * 
 * <p>Java class for BaseFlashRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFlashRedirectCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="flashUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fallbackPreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sslScanResult" type="{https://www.google.com/apis/ads/publisher/v201802}SslScanResult" minOccurs="0"/>
 *         &lt;element name="sslManualOverride" type="{https://www.google.com/apis/ads/publisher/v201802}SslManualOverride" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFlashRedirectCreative", propOrder = {
    "flashUrl",
    "fallbackUrl",
    "fallbackPreviewUrl",
    "sslScanResult",
    "sslManualOverride"
})
@XmlSeeAlso({
    FlashRedirectCreative.class,
    FlashRedirectOverlayCreative.class
})
public abstract class BaseFlashRedirectCreative
    extends HasDestinationUrlCreative
{

    protected String flashUrl;
    protected String fallbackUrl;
    protected String fallbackPreviewUrl;
    @XmlSchemaType(name = "string")
    protected SslScanResult sslScanResult;
    @XmlSchemaType(name = "string")
    protected SslManualOverride sslManualOverride;

    /**
     * Gets the value of the flashUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashUrl() {
        return flashUrl;
    }

    /**
     * Sets the value of the flashUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashUrl(String value) {
        this.flashUrl = value;
    }

    /**
     * Gets the value of the fallbackUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackUrl() {
        return fallbackUrl;
    }

    /**
     * Sets the value of the fallbackUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackUrl(String value) {
        this.fallbackUrl = value;
    }

    /**
     * Gets the value of the fallbackPreviewUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFallbackPreviewUrl() {
        return fallbackPreviewUrl;
    }

    /**
     * Sets the value of the fallbackPreviewUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFallbackPreviewUrl(String value) {
        this.fallbackPreviewUrl = value;
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
