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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a universal app ad
 *             
 *             <p class="caution"><b>Caution:</b> Universal app ads do not use #displayUrl displayUrl},
 *             \{@link #finalAppUrls finalAppUrls}, or {@link #devicePreference devicePreference}; setting these
 *             fields on a universal app ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for UniversalAppAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniversalAppAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}Ad">
 *       &lt;sequence>
 *         &lt;element name="headlines" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descriptions" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mandatoryAdText" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" minOccurs="0"/>
 *         &lt;element name="images" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="videos" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="html5MediaBundles" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalAppAd", propOrder = {
    "headlines",
    "descriptions",
    "mandatoryAdText",
    "images",
    "videos",
    "html5MediaBundles"
})
public class UniversalAppAd
    extends Ad
{

    protected List<AssetLink> headlines;
    protected List<AssetLink> descriptions;
    protected AssetLink mandatoryAdText;
    protected List<AssetLink> images;
    protected List<AssetLink> videos;
    protected List<AssetLink> html5MediaBundles;

    /**
     * Gets the value of the headlines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headlines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeadlines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getHeadlines() {
        if (headlines == null) {
            headlines = new ArrayList<AssetLink>();
        }
        return this.headlines;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<AssetLink>();
        }
        return this.descriptions;
    }

    /**
     * Gets the value of the mandatoryAdText property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLink }
     *     
     */
    public AssetLink getMandatoryAdText() {
        return mandatoryAdText;
    }

    /**
     * Sets the value of the mandatoryAdText property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLink }
     *     
     */
    public void setMandatoryAdText(AssetLink value) {
        this.mandatoryAdText = value;
    }

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getImages() {
        if (images == null) {
            images = new ArrayList<AssetLink>();
        }
        return this.images;
    }

    /**
     * Gets the value of the videos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getVideos() {
        if (videos == null) {
            videos = new ArrayList<AssetLink>();
        }
        return this.videos;
    }

    /**
     * Gets the value of the html5MediaBundles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the html5MediaBundles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHtml5MediaBundles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getHtml5MediaBundles() {
        if (html5MediaBundles == null) {
            html5MediaBundles = new ArrayList<AssetLink>();
        }
        return this.html5MediaBundles;
    }

}
