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
 *             Holds a set of final urls that are scoped within a namespace.
 *           
 * 
 * <p>Java class for UrlData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UrlData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="finalUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="finalMobileUrls" type="{https://adwords.google.com/api/adwords/cm/v201802}UrlList" minOccurs="0"/>
 *         &lt;element name="trackingUrlTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlData", propOrder = {
    "urlId",
    "finalUrls",
    "finalMobileUrls",
    "trackingUrlTemplate"
})
public class UrlData {

    protected String urlId;
    protected UrlList finalUrls;
    protected UrlList finalMobileUrls;
    protected String trackingUrlTemplate;

    /**
     * Gets the value of the urlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlId() {
        return urlId;
    }

    /**
     * Sets the value of the urlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlId(String value) {
        this.urlId = value;
    }

    /**
     * Gets the value of the finalUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getFinalUrls() {
        return finalUrls;
    }

    /**
     * Sets the value of the finalUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setFinalUrls(UrlList value) {
        this.finalUrls = value;
    }

    /**
     * Gets the value of the finalMobileUrls property.
     * 
     * @return
     *     possible object is
     *     {@link UrlList }
     *     
     */
    public UrlList getFinalMobileUrls() {
        return finalMobileUrls;
    }

    /**
     * Sets the value of the finalMobileUrls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlList }
     *     
     */
    public void setFinalMobileUrls(UrlList value) {
        this.finalMobileUrls = value;
    }

    /**
     * Gets the value of the trackingUrlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingUrlTemplate() {
        return trackingUrlTemplate;
    }

    /**
     * Sets the value of the trackingUrlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingUrlTemplate(String value) {
        this.trackingUrlTemplate = value;
    }

}
