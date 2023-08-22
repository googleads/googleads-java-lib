// Copyright 2023 Google LLC
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


package com.google.api.ads.admanager.jaxws.v202308;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} that contains externally hosted audio ads and is served via VAST XML.
 *           
 * 
 * <p>Java class for AudioRedirectCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AudioRedirectCreative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202308}BaseAudioCreative"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="audioAssets" type="{https://www.google.com/apis/ads/publisher/v202308}VideoRedirectAsset" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mezzanineFile" type="{https://www.google.com/apis/ads/publisher/v202308}VideoRedirectAsset" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioRedirectCreative", propOrder = {
    "audioAssets",
    "mezzanineFile"
})
public class AudioRedirectCreative
    extends BaseAudioCreative
{

    protected List<VideoRedirectAsset> audioAssets;
    protected VideoRedirectAsset mezzanineFile;

    /**
     * Gets the value of the audioAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audioAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudioAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoRedirectAsset }
     * 
     * 
     */
    public List<VideoRedirectAsset> getAudioAssets() {
        if (audioAssets == null) {
            audioAssets = new ArrayList<VideoRedirectAsset>();
        }
        return this.audioAssets;
    }

    /**
     * Gets the value of the mezzanineFile property.
     * 
     * @return
     *     possible object is
     *     {@link VideoRedirectAsset }
     *     
     */
    public VideoRedirectAsset getMezzanineFile() {
        return mezzanineFile;
    }

    /**
     * Sets the value of the mezzanineFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link VideoRedirectAsset }
     *     
     */
    public void setMezzanineFile(VideoRedirectAsset value) {
        this.mezzanineFile = value;
    }

}
