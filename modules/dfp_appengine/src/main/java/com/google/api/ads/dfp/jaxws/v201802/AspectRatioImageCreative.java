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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code Creative} intended for mobile platforms that displays an image,
 *             whose {@link LineItem#creativePlaceholders size} is defined as an
 *             {@link CreativeSizeType#ASPECT_RATIO aspect ratio}, i.e.
 *             {@link Size#isAspectRatio}. It can have multiple images whose dimensions
 *             conform to that aspect ratio.
 *           
 * 
 * <p>Java class for AspectRatioImageCreative complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AspectRatioImageCreative">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201802}HasDestinationUrlCreative">
 *       &lt;sequence>
 *         &lt;element name="imageAssets" type="{https://www.google.com/apis/ads/publisher/v201802}CreativeAsset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyImpressionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideSize" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AspectRatioImageCreative", propOrder = {
    "imageAssets",
    "altText",
    "thirdPartyImpressionUrl",
    "overrideSize"
})
public class AspectRatioImageCreative
    extends HasDestinationUrlCreative
{

    protected List<CreativeAsset> imageAssets;
    protected String altText;
    protected String thirdPartyImpressionUrl;
    protected Boolean overrideSize;

    /**
     * Gets the value of the imageAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreativeAsset }
     * 
     * 
     */
    public List<CreativeAsset> getImageAssets() {
        if (imageAssets == null) {
            imageAssets = new ArrayList<CreativeAsset>();
        }
        return this.imageAssets;
    }

    /**
     * Gets the value of the altText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltText() {
        return altText;
    }

    /**
     * Sets the value of the altText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltText(String value) {
        this.altText = value;
    }

    /**
     * Gets the value of the thirdPartyImpressionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyImpressionUrl() {
        return thirdPartyImpressionUrl;
    }

    /**
     * Sets the value of the thirdPartyImpressionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyImpressionUrl(String value) {
        this.thirdPartyImpressionUrl = value;
    }

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

}
