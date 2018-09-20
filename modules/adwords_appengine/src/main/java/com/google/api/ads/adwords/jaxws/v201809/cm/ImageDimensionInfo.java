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
 *             Information about an image asset in specfic dimensions, either original or resized.
 *           
 * 
 * <p>Java class for ImageDimensionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageDimensionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imageHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imageWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageDimensionInfo", propOrder = {
    "imageHeight",
    "imageWidth",
    "imageUrl"
})
public class ImageDimensionInfo {

    protected Integer imageHeight;
    protected Integer imageWidth;
    protected String imageUrl;

    /**
     * Gets the value of the imageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageHeight() {
        return imageHeight;
    }

    /**
     * Sets the value of the imageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageHeight(Integer value) {
        this.imageHeight = value;
    }

    /**
     * Gets the value of the imageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageWidth() {
        return imageWidth;
    }

    /**
     * Sets the value of the imageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageWidth(Integer value) {
        this.imageWidth = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

}
