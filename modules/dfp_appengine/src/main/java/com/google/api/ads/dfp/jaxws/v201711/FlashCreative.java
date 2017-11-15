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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that displays a Flash-based ad. If the Flash ad cannot
 *             load, a fallback image is displayed instead.
 *           
 * 
 * <p>Java class for FlashCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlashCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201711}BaseFlashCreative">
 *       &lt;sequence>
 *         &lt;element name="swiffyAsset" type="{https://www.google.com/apis/ads/publisher/v201711}SwiffyFallbackAsset" minOccurs="0"/>
 *         &lt;element name="createSwiffyAsset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lockedOrientation" type="{https://www.google.com/apis/ads/publisher/v201711}LockedOrientation" minOccurs="0"/>
 *         &lt;element name="clickTagOverlayEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlashCreative", propOrder = {
    "swiffyAsset",
    "createSwiffyAsset",
    "lockedOrientation",
    "clickTagOverlayEnabled"
})
public class FlashCreative
    extends BaseFlashCreative
{

    protected SwiffyFallbackAsset swiffyAsset;
    protected Boolean createSwiffyAsset;
    @XmlSchemaType(name = "string")
    protected LockedOrientation lockedOrientation;
    protected Boolean clickTagOverlayEnabled;

    /**
     * Gets the value of the swiffyAsset property.
     * 
     * @return
     *     possible object is
     *     {@link SwiffyFallbackAsset }
     *     
     */
    public SwiffyFallbackAsset getSwiffyAsset() {
        return swiffyAsset;
    }

    /**
     * Sets the value of the swiffyAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwiffyFallbackAsset }
     *     
     */
    public void setSwiffyAsset(SwiffyFallbackAsset value) {
        this.swiffyAsset = value;
    }

    /**
     * Gets the value of the createSwiffyAsset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateSwiffyAsset() {
        return createSwiffyAsset;
    }

    /**
     * Sets the value of the createSwiffyAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateSwiffyAsset(Boolean value) {
        this.createSwiffyAsset = value;
    }

    /**
     * Gets the value of the lockedOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link LockedOrientation }
     *     
     */
    public LockedOrientation getLockedOrientation() {
        return lockedOrientation;
    }

    /**
     * Sets the value of the lockedOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LockedOrientation }
     *     
     */
    public void setLockedOrientation(LockedOrientation value) {
        this.lockedOrientation = value;
    }

    /**
     * Gets the value of the clickTagOverlayEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClickTagOverlayEnabled() {
        return clickTagOverlayEnabled;
    }

    /**
     * Sets the value of the clickTagOverlayEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClickTagOverlayEnabled(Boolean value) {
        this.clickTagOverlayEnabled = value;
    }

}
