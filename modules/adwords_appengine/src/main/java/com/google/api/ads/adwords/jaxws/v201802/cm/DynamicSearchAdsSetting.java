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
 *             Setting for controlling Dynamic Search Ads (DSA). Contains the domain name and the language
 *             used by the DSA system to automatically generate landing pages and keywords for a campaign.
 *           
 * 
 * <p>Java class for DynamicSearchAdsSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicSearchAdsSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Setting">
 *       &lt;sequence>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useSuppliedUrlsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pageFeed" type="{https://adwords.google.com/api/adwords/cm/v201802}PageFeed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicSearchAdsSetting", propOrder = {
    "domainName",
    "languageCode",
    "useSuppliedUrlsOnly",
    "pageFeed"
})
public class DynamicSearchAdsSetting
    extends Setting
{

    protected String domainName;
    protected String languageCode;
    protected Boolean useSuppliedUrlsOnly;
    protected PageFeed pageFeed;

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the useSuppliedUrlsOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseSuppliedUrlsOnly() {
        return useSuppliedUrlsOnly;
    }

    /**
     * Sets the value of the useSuppliedUrlsOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSuppliedUrlsOnly(Boolean value) {
        this.useSuppliedUrlsOnly = value;
    }

    /**
     * Gets the value of the pageFeed property.
     * 
     * @return
     *     possible object is
     *     {@link PageFeed }
     *     
     */
    public PageFeed getPageFeed() {
        return pageFeed;
    }

    /**
     * Sets the value of the pageFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageFeed }
     *     
     */
    public void setPageFeed(PageFeed value) {
        this.pageFeed = value;
    }

}
