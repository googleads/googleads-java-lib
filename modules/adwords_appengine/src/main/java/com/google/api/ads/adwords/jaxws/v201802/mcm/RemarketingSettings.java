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


package com.google.api.ads.adwords.jaxws.v201802.mcm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Customer-wide settings related to AdWords remarketing.
 *           
 * 
 * <p>Java class for RemarketingSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarketingSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="snippet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="googleGlobalSiteTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarketingSettings", propOrder = {
    "snippet",
    "googleGlobalSiteTag"
})
public class RemarketingSettings {

    protected String snippet;
    protected String googleGlobalSiteTag;

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnippet(String value) {
        this.snippet = value;
    }

    /**
     * Gets the value of the googleGlobalSiteTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoogleGlobalSiteTag() {
        return googleGlobalSiteTag;
    }

    /**
     * Sets the value of the googleGlobalSiteTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoogleGlobalSiteTag(String value) {
        this.googleGlobalSiteTag = value;
    }

}
