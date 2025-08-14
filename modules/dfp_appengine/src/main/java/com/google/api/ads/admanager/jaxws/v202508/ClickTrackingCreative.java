// Copyright 2025 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202508;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A creative that is used for tracking clicks on ads that are served directly from the customers'
 *             web servers or media servers. NOTE: The size attribute is not used for click tracking creative
 *             and it will not be persisted upon save.
 *           
 * 
 * <p>Java class for ClickTrackingCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClickTrackingCreative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202508}Creative"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clickTrackingUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClickTrackingCreative", propOrder = {
    "clickTrackingUrl"
})
public class ClickTrackingCreative
    extends Creative
{

    protected String clickTrackingUrl;

    /**
     * Gets the value of the clickTrackingUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClickTrackingUrl() {
        return clickTrackingUrl;
    }

    /**
     * Sets the value of the clickTrackingUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClickTrackingUrl(String value) {
        this.clickTrackingUrl = value;
    }

}
