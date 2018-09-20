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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Representation of multi-asset responsive display ad format.
 *             
 *             <p class="caution"><b>Caution:</b> multi-asset responsive display ads do not use {@link #url
 *             url}, {@link #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls}, or {@link
 *             #devicePreference devicePreference}; setting these fields on a multi-asset responsive display ad
 *             will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for MultiAssetResponsiveDisplayAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiAssetResponsiveDisplayAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201809}Ad">
 *       &lt;sequence>
 *         &lt;element name="marketingImages" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="squareMarketingImages" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="logoImages" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="landscapeLogoImages" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="headlines" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longHeadline" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" minOccurs="0"/>
 *         &lt;element name="descriptions" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="youTubeVideos" type="{https://adwords.google.com/api/adwords/cm/v201809}AssetLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accentColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowFlexibleColor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callToActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamicSettingsPricePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamicSettingsPromoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formatSetting" type="{https://adwords.google.com/api/adwords/cm/v201809}DisplayAdFormatSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiAssetResponsiveDisplayAd", propOrder = {
    "marketingImages",
    "squareMarketingImages",
    "logoImages",
    "landscapeLogoImages",
    "headlines",
    "longHeadline",
    "descriptions",
    "youTubeVideos",
    "businessName",
    "mainColor",
    "accentColor",
    "allowFlexibleColor",
    "callToActionText",
    "dynamicSettingsPricePrefix",
    "dynamicSettingsPromoText",
    "formatSetting"
})
public class MultiAssetResponsiveDisplayAd
    extends Ad
{

    protected List<AssetLink> marketingImages;
    protected List<AssetLink> squareMarketingImages;
    protected List<AssetLink> logoImages;
    protected List<AssetLink> landscapeLogoImages;
    protected List<AssetLink> headlines;
    protected AssetLink longHeadline;
    protected List<AssetLink> descriptions;
    protected List<AssetLink> youTubeVideos;
    protected String businessName;
    protected String mainColor;
    protected String accentColor;
    protected Boolean allowFlexibleColor;
    protected String callToActionText;
    protected String dynamicSettingsPricePrefix;
    protected String dynamicSettingsPromoText;
    @XmlSchemaType(name = "string")
    protected DisplayAdFormatSetting formatSetting;

    /**
     * Gets the value of the marketingImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getMarketingImages() {
        if (marketingImages == null) {
            marketingImages = new ArrayList<AssetLink>();
        }
        return this.marketingImages;
    }

    /**
     * Gets the value of the squareMarketingImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the squareMarketingImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSquareMarketingImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getSquareMarketingImages() {
        if (squareMarketingImages == null) {
            squareMarketingImages = new ArrayList<AssetLink>();
        }
        return this.squareMarketingImages;
    }

    /**
     * Gets the value of the logoImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logoImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLogoImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getLogoImages() {
        if (logoImages == null) {
            logoImages = new ArrayList<AssetLink>();
        }
        return this.logoImages;
    }

    /**
     * Gets the value of the landscapeLogoImages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the landscapeLogoImages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLandscapeLogoImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getLandscapeLogoImages() {
        if (landscapeLogoImages == null) {
            landscapeLogoImages = new ArrayList<AssetLink>();
        }
        return this.landscapeLogoImages;
    }

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
     * Gets the value of the longHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link AssetLink }
     *     
     */
    public AssetLink getLongHeadline() {
        return longHeadline;
    }

    /**
     * Sets the value of the longHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetLink }
     *     
     */
    public void setLongHeadline(AssetLink value) {
        this.longHeadline = value;
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
     * Gets the value of the youTubeVideos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the youTubeVideos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYouTubeVideos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetLink }
     * 
     * 
     */
    public List<AssetLink> getYouTubeVideos() {
        if (youTubeVideos == null) {
            youTubeVideos = new ArrayList<AssetLink>();
        }
        return this.youTubeVideos;
    }

    /**
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the mainColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainColor() {
        return mainColor;
    }

    /**
     * Sets the value of the mainColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainColor(String value) {
        this.mainColor = value;
    }

    /**
     * Gets the value of the accentColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccentColor() {
        return accentColor;
    }

    /**
     * Sets the value of the accentColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccentColor(String value) {
        this.accentColor = value;
    }

    /**
     * Gets the value of the allowFlexibleColor property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowFlexibleColor() {
        return allowFlexibleColor;
    }

    /**
     * Sets the value of the allowFlexibleColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowFlexibleColor(Boolean value) {
        this.allowFlexibleColor = value;
    }

    /**
     * Gets the value of the callToActionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallToActionText() {
        return callToActionText;
    }

    /**
     * Sets the value of the callToActionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallToActionText(String value) {
        this.callToActionText = value;
    }

    /**
     * Gets the value of the dynamicSettingsPricePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicSettingsPricePrefix() {
        return dynamicSettingsPricePrefix;
    }

    /**
     * Sets the value of the dynamicSettingsPricePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicSettingsPricePrefix(String value) {
        this.dynamicSettingsPricePrefix = value;
    }

    /**
     * Gets the value of the dynamicSettingsPromoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicSettingsPromoText() {
        return dynamicSettingsPromoText;
    }

    /**
     * Sets the value of the dynamicSettingsPromoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicSettingsPromoText(String value) {
        this.dynamicSettingsPromoText = value;
    }

    /**
     * Gets the value of the formatSetting property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAdFormatSetting }
     *     
     */
    public DisplayAdFormatSetting getFormatSetting() {
        return formatSetting;
    }

    /**
     * Sets the value of the formatSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAdFormatSetting }
     *     
     */
    public void setFormatSetting(DisplayAdFormatSetting value) {
        this.formatSetting = value;
    }

}
