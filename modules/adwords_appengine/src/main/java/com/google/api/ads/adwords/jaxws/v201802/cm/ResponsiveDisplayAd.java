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


package com.google.api.ads.adwords.jaxws.v201802.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Enhanced display ad format.
 *             
 *             <p class="caution"><b>Caution:</b> Responsive display ads do not use {@link #url url},
 *             {@link #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls}, or
 *             {@link #devicePreference devicePreference};
 *             setting these fields on a responsive display ad will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for AdX.</span>
 *           
 * 
 * <p>Java class for ResponsiveDisplayAd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsiveDisplayAd">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201802}Ad">
 *       &lt;sequence>
 *         &lt;element name="marketingImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="logoImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="squareMarketingImage" type="{https://adwords.google.com/api/adwords/cm/v201802}Image" minOccurs="0"/>
 *         &lt;element name="shortHeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longHeadline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mainColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accentColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowFlexibleColor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="callToActionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dynamicDisplayAdSettings" type="{https://adwords.google.com/api/adwords/cm/v201802}DynamicSettings" minOccurs="0"/>
 *         &lt;element name="formatSetting" type="{https://adwords.google.com/api/adwords/cm/v201802}DisplayAdFormatSetting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsiveDisplayAd", propOrder = {
    "marketingImage",
    "logoImage",
    "squareMarketingImage",
    "shortHeadline",
    "longHeadline",
    "description",
    "businessName",
    "mainColor",
    "accentColor",
    "allowFlexibleColor",
    "callToActionText",
    "dynamicDisplayAdSettings",
    "formatSetting"
})
public class ResponsiveDisplayAd
    extends Ad
{

    protected Image marketingImage;
    protected Image logoImage;
    protected Image squareMarketingImage;
    protected String shortHeadline;
    protected String longHeadline;
    protected String description;
    protected String businessName;
    protected String mainColor;
    protected String accentColor;
    protected Boolean allowFlexibleColor;
    protected String callToActionText;
    protected DynamicSettings dynamicDisplayAdSettings;
    @XmlSchemaType(name = "string")
    protected DisplayAdFormatSetting formatSetting;

    /**
     * Gets the value of the marketingImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getMarketingImage() {
        return marketingImage;
    }

    /**
     * Sets the value of the marketingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setMarketingImage(Image value) {
        this.marketingImage = value;
    }

    /**
     * Gets the value of the logoImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getLogoImage() {
        return logoImage;
    }

    /**
     * Sets the value of the logoImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setLogoImage(Image value) {
        this.logoImage = value;
    }

    /**
     * Gets the value of the squareMarketingImage property.
     * 
     * @return
     *     possible object is
     *     {@link Image }
     *     
     */
    public Image getSquareMarketingImage() {
        return squareMarketingImage;
    }

    /**
     * Sets the value of the squareMarketingImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Image }
     *     
     */
    public void setSquareMarketingImage(Image value) {
        this.squareMarketingImage = value;
    }

    /**
     * Gets the value of the shortHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortHeadline() {
        return shortHeadline;
    }

    /**
     * Sets the value of the shortHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortHeadline(String value) {
        this.shortHeadline = value;
    }

    /**
     * Gets the value of the longHeadline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongHeadline() {
        return longHeadline;
    }

    /**
     * Sets the value of the longHeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongHeadline(String value) {
        this.longHeadline = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the dynamicDisplayAdSettings property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicSettings }
     *     
     */
    public DynamicSettings getDynamicDisplayAdSettings() {
        return dynamicDisplayAdSettings;
    }

    /**
     * Sets the value of the dynamicDisplayAdSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicSettings }
     *     
     */
    public void setDynamicDisplayAdSettings(DynamicSettings value) {
        this.dynamicDisplayAdSettings = value;
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
