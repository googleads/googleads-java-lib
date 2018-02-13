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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The base type for creatives that display an image.
 *           
 * 
 * <p>Java class for BaseImageCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseImageCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="primaryImageAsset" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeAsset" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseImageCreative", propOrder = {
    "overrideSize",
    "primaryImageAsset"
})
@XmlSeeAlso({
    ImageOverlayCreative.class,
    ImageCreative.class
})
public abstract class BaseImageCreative
    extends HasDestinationUrlCreative
{

    protected Boolean overrideSize;
    protected CreativeAsset primaryImageAsset;

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
     * Gets the value of the primaryImageAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getPrimaryImageAsset() {
        return primaryImageAsset;
    }

    /**
     * Sets the value of the primaryImageAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setPrimaryImageAsset(CreativeAsset value) {
        this.primaryImageAsset = value;
    }

}
