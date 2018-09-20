// Copyright 2018 Google LLC
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


package com.google.api.ads.adwords.jaxws.v201809.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a media bundle asset.
 *           
 * 
 * <p>Java class for MediaBundleAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaBundleAsset">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}Asset">
 *       &lt;sequence>
 *         &lt;element name="mediaBundleData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaBundleAsset", propOrder = {
    "mediaBundleData"
})
public class MediaBundleAsset
    extends Asset
{

    protected byte[] mediaBundleData;

    /**
     * Gets the value of the mediaBundleData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMediaBundleData() {
        return mediaBundleData;
    }

    /**
     * Sets the value of the mediaBundleData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMediaBundleData(byte[] value) {
        this.mediaBundleData = value;
    }

}
