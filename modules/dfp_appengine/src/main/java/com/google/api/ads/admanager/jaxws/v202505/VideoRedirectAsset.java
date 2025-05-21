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


package com.google.api.ads.admanager.jaxws.v202505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An externally-hosted video asset.
 *           
 * 
 * <p>Java class for VideoRedirectAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoRedirectAsset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202505}RedirectAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metadata" type="{https://www.google.com/apis/ads/publisher/v202505}VideoMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRedirectAsset", propOrder = {
    "metadata"
})
public class VideoRedirectAsset
    extends RedirectAsset
{

    protected VideoMetadata metadata;

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link VideoMetadata }
     *     
     */
    public VideoMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoMetadata }
     *     
     */
    public void setMetadata(VideoMetadata value) {
        this.metadata = value;
    }

}
