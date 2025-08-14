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
 *             Stores values of {@link CreativeTemplateVariable} of {@link VariableType#ASSET}.
 *           
 * 
 * <p>Java class for AssetCreativeTemplateVariableValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssetCreativeTemplateVariableValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v202508}BaseCreativeTemplateVariableValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="asset" type="{https://www.google.com/apis/ads/publisher/v202508}CreativeAsset" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetCreativeTemplateVariableValue", propOrder = {
    "asset"
})
public class AssetCreativeTemplateVariableValue
    extends BaseCreativeTemplateVariableValue
{

    protected CreativeAsset asset;

    /**
     * Gets the value of the asset property.
     * 
     * @return
     *     possible object is
     *     {@link CreativeAsset }
     *     
     */
    public CreativeAsset getAsset() {
        return asset;
    }

    /**
     * Sets the value of the asset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreativeAsset }
     *     
     */
    public void setAsset(CreativeAsset value) {
        this.asset = value;
    }

}
