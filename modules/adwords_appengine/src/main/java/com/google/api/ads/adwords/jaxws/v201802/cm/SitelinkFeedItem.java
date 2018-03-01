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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a sitelink extension.
 *           
 * 
 * <p>Java class for SitelinkFeedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SitelinkFeedItem">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}ExtensionFeedItem">
 *       &lt;sequence>
 *         &lt;element name="sitelinkText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitelinkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitelinkLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitelinkLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitelinkFinalUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="sitelinkFinalMobileUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="sitelinkTrackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sitelinkUrlCustomParameters" type="{https://adwords.google.com/api/adwords/cm/v201802}CustomParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SitelinkFeedItem", propOrder = {
    "sitelinkText",
    "sitelinkUrl",
    "sitelinkLine2",
    "sitelinkLine3",
    "sitelinkFinalUrls",
    "sitelinkFinalMobileUrls",
    "sitelinkTrackingUrlTemplate",
    "sitelinkUrlCustomParameters"
})
public class SitelinkFeedItem
    extends ExtensionFeedItem
{

    protected String sitelinkText;
    protected String sitelinkUrl;
    protected String sitelinkLine2;
    protected String sitelinkLine3;
    protected UrlList sitelinkFinalUrls;
    protected UrlList sitelinkFinalMobileUrls;
    protected String sitelinkTrackingUrlTemplate;
    protected CustomParameters sitelinkUrlCustomParameters;

    /**
     * Gets the value of the sitelinkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitelinkText() {
        return sitelinkText;
    }

    /**
     * Sets the value of the sitelinkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitelinkText(String value) {
        this.sitelinkText = value;
    }

    /**
     * Gets the value of the sitelinkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitelinkUrl() {
        return sitelinkUrl;
    }

    /**
     * Sets the value of the sitelinkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitelinkUrl(String value) {
        this.sitelinkUrl = value;
    }

    /**
     * Gets the value of the sitelinkLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitelinkLine2() {
        return sitelinkLine2;
    }

    /**
     * Sets the value of the sitelinkLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitelinkLine2(String value) {
        this.sitelinkLine2 = value;
    }

    /**
     * Gets the value of the sitelinkLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitelinkLine3() {
        return sitelinkLine3;
    }

    /**
     * Sets the value of the sitelinkLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitelinkLine3(String value) {
        this.sitelinkLine3 = value;
    }

    /**
     * Gets the value of the sitelinkFinalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getSitelinkFinalUrls() {
        return sitelinkFinalUrls;
    }

    /**
     * Sets the value of the sitelinkFinalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setSitelinkFinalUrls(UrlList value) {
        this.sitelinkFinalUrls = value;
    }

    /**
     * Gets the value of the sitelinkFinalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getSitelinkFinalMobileUrls() {
        return sitelinkFinalMobileUrls;
    }

    /**
     * Sets the value of the sitelinkFinalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setSitelinkFinalMobileUrls(UrlList value) {
        this.sitelinkFinalMobileUrls = value;
    }

    /**
     * Gets the value of the sitelinkTrackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitelinkTrackingUrlTemplate() {
        return sitelinkTrackingUrlTemplate;
    }

    /**
     * Sets the value of the sitelinkTrackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitelinkTrackingUrlTemplate(String value) {
        this.sitelinkTrackingUrlTemplate = value;
    }

    /**
     * Gets the value of the sitelinkUrlCustomParameters property.
     * 
     * @return
     *     possible object is
     *     {@link CustomParameters }
     *     
     */
    public CustomParameters getSitelinkUrlCustomParameters() {
        return sitelinkUrlCustomParameters;
    }

    /**
     * Sets the value of the sitelinkUrlCustomParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomParameters }
     *     
     */
    public void setSitelinkUrlCustomParameters(CustomParameters value) {
        this.sitelinkUrlCustomParameters = value;
    }

}
