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

/**
 * ResponsiveDisplayAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201802.cm;


/**
 * Enhanced display ad format.
 *             
 *             <p class="caution"><b>Caution:</b> Responsive display
 * ads do not use {@link #url url},
 *             {@link #displayUrl displayUrl}, {@link #finalAppUrls finalAppUrls},
 * or
 *             {@link #devicePreference devicePreference};
 *             setting these fields on a responsive display ad will cause
 * an error.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class ResponsiveDisplayAd  extends com.google.api.ads.adwords.axis.v201802.cm.Ad  implements java.io.Serializable {
    /* Marketing image to be used in the ad. This ad format does not
     * allow the creation of an image
     *                     using the Image.data field. An image must first
     * be created using the MediaService, and
     *                     Image.mediaId must be populated when creating
     * a {@link "ResponsiveDisplayAd"}. Valid image
     *                     types are GIF, JPEG, and PNG. The minimum size
     * is 600x314 and the aspect ratio must be 600:314
     *                     (+-1%).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201802.cm.Image marketingImage;

    /* Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the Image.data field. An image must first be created
     * using the MediaService, and Image.mediaId
     *                     must be populated when creating a {@link "ResponsiveDisplayAd"}.
     * Valid image types are GIF,
     *                     JPEG, and PNG. The minimum size is 128x128 and
     * the aspect ratio must be 1:1 (+-1%). */
    private com.google.api.ads.adwords.axis.v201802.cm.Image logoImage;

    /* Square marketing image to be used in the ad. This image may
     * be used when a square aspect ratio
     *                     is more appropriate than the aspect ratio of the
     * {@link #marketingImage} image. This ad format
     *                     does not allow the creation of an image using
     * the Image.data field. An image must first be
     *                     created using the MediaService, and Image.mediaId
     * must be populated when creating a {@link
     *                     "ResponsiveDisplayAd"}. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 300x300
     *                     the aspect ratio must be 1:1 (+-1%). */
    private com.google.api.ads.adwords.axis.v201802.cm.Image squareMarketingImage;

    /* Short format of the headline of the ad. Maximum display width
     * is 25.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String shortHeadline;

    /* Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String longHeadline;

    /* The descriptive text of the ad. Maximum display width is 90.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Description".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.String description;

    /* The business name. Maximum display width is 25. <span class="constraint
     * Required">This field is
     *                     required and should not be {@code null} when it
     * is contained within {@link Operator}s :
     *                     ADD.</span> */
    private java.lang.String businessName;

    /* Main color. In hexadecimal, e.g. #ffffff for white. If one
     * of mainColor and accentColor is set,
     *                     the other is required as well. */
    private java.lang.String mainColor;

    /* Accent color. In hexadecimal, e.g. #ffffff for white. If one
     * of mainColor and accentColor is
     *                     set, the other is required as well. */
    private java.lang.String accentColor;

    /* Advertiser’s consent to allow flexible color. When true, we
     * may serve the ad with different
     *                     color when necessary. When false, we will serve
     * the ad with advertiser color or neutral color.
     *                     Must be true if mainColor and accentColor are
     * not set. The default value is true. */
    private java.lang.Boolean allowFlexibleColor;

    /* Call to action text. Valid texts: https://support.google.com/adwords/answer/7005917 */
    private java.lang.String callToActionText;

    /* Settings for serving dynamic ResponsiveDisplayAd. */
    private com.google.api.ads.adwords.axis.v201802.cm.DynamicSettings dynamicDisplayAdSettings;

    /* Specifies which format the ad will be served in. The default
     * value is ALL_FORMATS. */
    private com.google.api.ads.adwords.axis.v201802.cm.DisplayAdFormatSetting formatSetting;

    public ResponsiveDisplayAd() {
    }

    public ResponsiveDisplayAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201802.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201802.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201802.cm.UrlData[] urlData,
           java.lang.Boolean automated,
           com.google.api.ads.adwords.axis.v201802.cm.AdType type,
           java.lang.Long devicePreference,
           com.google.api.ads.adwords.axis.v201802.cm.SystemManagedEntitySource systemManagedEntitySource,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201802.cm.Image marketingImage,
           com.google.api.ads.adwords.axis.v201802.cm.Image logoImage,
           com.google.api.ads.adwords.axis.v201802.cm.Image squareMarketingImage,
           java.lang.String shortHeadline,
           java.lang.String longHeadline,
           java.lang.String description,
           java.lang.String businessName,
           java.lang.String mainColor,
           java.lang.String accentColor,
           java.lang.Boolean allowFlexibleColor,
           java.lang.String callToActionText,
           com.google.api.ads.adwords.axis.v201802.cm.DynamicSettings dynamicDisplayAdSettings,
           com.google.api.ads.adwords.axis.v201802.cm.DisplayAdFormatSetting formatSetting) {
        super(
            id,
            url,
            displayUrl,
            finalUrls,
            finalMobileUrls,
            finalAppUrls,
            trackingUrlTemplate,
            finalUrlSuffix,
            urlCustomParameters,
            urlData,
            automated,
            type,
            devicePreference,
            systemManagedEntitySource,
            adType);
        this.marketingImage = marketingImage;
        this.logoImage = logoImage;
        this.squareMarketingImage = squareMarketingImage;
        this.shortHeadline = shortHeadline;
        this.longHeadline = longHeadline;
        this.description = description;
        this.businessName = businessName;
        this.mainColor = mainColor;
        this.accentColor = accentColor;
        this.allowFlexibleColor = allowFlexibleColor;
        this.callToActionText = callToActionText;
        this.dynamicDisplayAdSettings = dynamicDisplayAdSettings;
        this.formatSetting = formatSetting;
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this.getClass())
            .omitNullValues()
            .add("accentColor", getAccentColor())
            .add("adType", getAdType())
            .add("allowFlexibleColor", getAllowFlexibleColor())
            .add("automated", getAutomated())
            .add("businessName", getBusinessName())
            .add("callToActionText", getCallToActionText())
            .add("description", getDescription())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("dynamicDisplayAdSettings", getDynamicDisplayAdSettings())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("formatSetting", getFormatSetting())
            .add("id", getId())
            .add("logoImage", getLogoImage())
            .add("longHeadline", getLongHeadline())
            .add("mainColor", getMainColor())
            .add("marketingImage", getMarketingImage())
            .add("shortHeadline", getShortHeadline())
            .add("squareMarketingImage", getSquareMarketingImage())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .toString();
    }

    /**
     * Gets the marketingImage value for this ResponsiveDisplayAd.
     * 
     * @return marketingImage   * Marketing image to be used in the ad. This ad format does not
     * allow the creation of an image
     *                     using the Image.data field. An image must first
     * be created using the MediaService, and
     *                     Image.mediaId must be populated when creating
     * a {@link "ResponsiveDisplayAd"}. Valid image
     *                     types are GIF, JPEG, and PNG. The minimum size
     * is 600x314 and the aspect ratio must be 600:314
     *                     (+-1%).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getMarketingImage() {
        return marketingImage;
    }


    /**
     * Sets the marketingImage value for this ResponsiveDisplayAd.
     * 
     * @param marketingImage   * Marketing image to be used in the ad. This ad format does not
     * allow the creation of an image
     *                     using the Image.data field. An image must first
     * be created using the MediaService, and
     *                     Image.mediaId must be populated when creating
     * a {@link "ResponsiveDisplayAd"}. Valid image
     *                     types are GIF, JPEG, and PNG. The minimum size
     * is 600x314 and the aspect ratio must be 600:314
     *                     (+-1%).
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setMarketingImage(com.google.api.ads.adwords.axis.v201802.cm.Image marketingImage) {
        this.marketingImage = marketingImage;
    }


    /**
     * Gets the logoImage value for this ResponsiveDisplayAd.
     * 
     * @return logoImage   * Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the Image.data field. An image must first be created
     * using the MediaService, and Image.mediaId
     *                     must be populated when creating a {@link "ResponsiveDisplayAd"}.
     * Valid image types are GIF,
     *                     JPEG, and PNG. The minimum size is 128x128 and
     * the aspect ratio must be 1:1 (+-1%).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getLogoImage() {
        return logoImage;
    }


    /**
     * Sets the logoImage value for this ResponsiveDisplayAd.
     * 
     * @param logoImage   * Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the Image.data field. An image must first be created
     * using the MediaService, and Image.mediaId
     *                     must be populated when creating a {@link "ResponsiveDisplayAd"}.
     * Valid image types are GIF,
     *                     JPEG, and PNG. The minimum size is 128x128 and
     * the aspect ratio must be 1:1 (+-1%).
     */
    public void setLogoImage(com.google.api.ads.adwords.axis.v201802.cm.Image logoImage) {
        this.logoImage = logoImage;
    }


    /**
     * Gets the squareMarketingImage value for this ResponsiveDisplayAd.
     * 
     * @return squareMarketingImage   * Square marketing image to be used in the ad. This image may
     * be used when a square aspect ratio
     *                     is more appropriate than the aspect ratio of the
     * {@link #marketingImage} image. This ad format
     *                     does not allow the creation of an image using
     * the Image.data field. An image must first be
     *                     created using the MediaService, and Image.mediaId
     * must be populated when creating a {@link
     *                     "ResponsiveDisplayAd"}. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 300x300
     *                     the aspect ratio must be 1:1 (+-1%).
     */
    public com.google.api.ads.adwords.axis.v201802.cm.Image getSquareMarketingImage() {
        return squareMarketingImage;
    }


    /**
     * Sets the squareMarketingImage value for this ResponsiveDisplayAd.
     * 
     * @param squareMarketingImage   * Square marketing image to be used in the ad. This image may
     * be used when a square aspect ratio
     *                     is more appropriate than the aspect ratio of the
     * {@link #marketingImage} image. This ad format
     *                     does not allow the creation of an image using
     * the Image.data field. An image must first be
     *                     created using the MediaService, and Image.mediaId
     * must be populated when creating a {@link
     *                     "ResponsiveDisplayAd"}. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 300x300
     *                     the aspect ratio must be 1:1 (+-1%).
     */
    public void setSquareMarketingImage(com.google.api.ads.adwords.axis.v201802.cm.Image squareMarketingImage) {
        this.squareMarketingImage = squareMarketingImage;
    }


    /**
     * Gets the shortHeadline value for this ResponsiveDisplayAd.
     * 
     * @return shortHeadline   * Short format of the headline of the ad. Maximum display width
     * is 25.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getShortHeadline() {
        return shortHeadline;
    }


    /**
     * Sets the shortHeadline value for this ResponsiveDisplayAd.
     * 
     * @param shortHeadline   * Short format of the headline of the ad. Maximum display width
     * is 25.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setShortHeadline(java.lang.String shortHeadline) {
        this.shortHeadline = shortHeadline;
    }


    /**
     * Gets the longHeadline value for this ResponsiveDisplayAd.
     * 
     * @return longHeadline   * Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getLongHeadline() {
        return longHeadline;
    }


    /**
     * Sets the longHeadline value for this ResponsiveDisplayAd.
     * 
     * @param longHeadline   * Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setLongHeadline(java.lang.String longHeadline) {
        this.longHeadline = longHeadline;
    }


    /**
     * Gets the description value for this ResponsiveDisplayAd.
     * 
     * @return description   * The descriptive text of the ad. Maximum display width is 90.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Description".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ResponsiveDisplayAd.
     * 
     * @param description   * The descriptive text of the ad. Maximum display width is 90.
     * <span class="constraint Selectable">This field can be selected using
     * the value "Description".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the businessName value for this ResponsiveDisplayAd.
     * 
     * @return businessName   * The business name. Maximum display width is 25. <span class="constraint
     * Required">This field is
     *                     required and should not be {@code null} when it
     * is contained within {@link Operator}s :
     *                     ADD.</span>
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this ResponsiveDisplayAd.
     * 
     * @param businessName   * The business name. Maximum display width is 25. <span class="constraint
     * Required">This field is
     *                     required and should not be {@code null} when it
     * is contained within {@link Operator}s :
     *                     ADD.</span>
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the mainColor value for this ResponsiveDisplayAd.
     * 
     * @return mainColor   * Main color. In hexadecimal, e.g. #ffffff for white. If one
     * of mainColor and accentColor is set,
     *                     the other is required as well.
     */
    public java.lang.String getMainColor() {
        return mainColor;
    }


    /**
     * Sets the mainColor value for this ResponsiveDisplayAd.
     * 
     * @param mainColor   * Main color. In hexadecimal, e.g. #ffffff for white. If one
     * of mainColor and accentColor is set,
     *                     the other is required as well.
     */
    public void setMainColor(java.lang.String mainColor) {
        this.mainColor = mainColor;
    }


    /**
     * Gets the accentColor value for this ResponsiveDisplayAd.
     * 
     * @return accentColor   * Accent color. In hexadecimal, e.g. #ffffff for white. If one
     * of mainColor and accentColor is
     *                     set, the other is required as well.
     */
    public java.lang.String getAccentColor() {
        return accentColor;
    }


    /**
     * Sets the accentColor value for this ResponsiveDisplayAd.
     * 
     * @param accentColor   * Accent color. In hexadecimal, e.g. #ffffff for white. If one
     * of mainColor and accentColor is
     *                     set, the other is required as well.
     */
    public void setAccentColor(java.lang.String accentColor) {
        this.accentColor = accentColor;
    }


    /**
     * Gets the allowFlexibleColor value for this ResponsiveDisplayAd.
     * 
     * @return allowFlexibleColor   * Advertiser’s consent to allow flexible color. When true, we
     * may serve the ad with different
     *                     color when necessary. When false, we will serve
     * the ad with advertiser color or neutral color.
     *                     Must be true if mainColor and accentColor are
     * not set. The default value is true.
     */
    public java.lang.Boolean getAllowFlexibleColor() {
        return allowFlexibleColor;
    }


    /**
     * Sets the allowFlexibleColor value for this ResponsiveDisplayAd.
     * 
     * @param allowFlexibleColor   * Advertiser’s consent to allow flexible color. When true, we
     * may serve the ad with different
     *                     color when necessary. When false, we will serve
     * the ad with advertiser color or neutral color.
     *                     Must be true if mainColor and accentColor are
     * not set. The default value is true.
     */
    public void setAllowFlexibleColor(java.lang.Boolean allowFlexibleColor) {
        this.allowFlexibleColor = allowFlexibleColor;
    }


    /**
     * Gets the callToActionText value for this ResponsiveDisplayAd.
     * 
     * @return callToActionText   * Call to action text. Valid texts: https://support.google.com/adwords/answer/7005917
     */
    public java.lang.String getCallToActionText() {
        return callToActionText;
    }


    /**
     * Sets the callToActionText value for this ResponsiveDisplayAd.
     * 
     * @param callToActionText   * Call to action text. Valid texts: https://support.google.com/adwords/answer/7005917
     */
    public void setCallToActionText(java.lang.String callToActionText) {
        this.callToActionText = callToActionText;
    }


    /**
     * Gets the dynamicDisplayAdSettings value for this ResponsiveDisplayAd.
     * 
     * @return dynamicDisplayAdSettings   * Settings for serving dynamic ResponsiveDisplayAd.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DynamicSettings getDynamicDisplayAdSettings() {
        return dynamicDisplayAdSettings;
    }


    /**
     * Sets the dynamicDisplayAdSettings value for this ResponsiveDisplayAd.
     * 
     * @param dynamicDisplayAdSettings   * Settings for serving dynamic ResponsiveDisplayAd.
     */
    public void setDynamicDisplayAdSettings(com.google.api.ads.adwords.axis.v201802.cm.DynamicSettings dynamicDisplayAdSettings) {
        this.dynamicDisplayAdSettings = dynamicDisplayAdSettings;
    }


    /**
     * Gets the formatSetting value for this ResponsiveDisplayAd.
     * 
     * @return formatSetting   * Specifies which format the ad will be served in. The default
     * value is ALL_FORMATS.
     */
    public com.google.api.ads.adwords.axis.v201802.cm.DisplayAdFormatSetting getFormatSetting() {
        return formatSetting;
    }


    /**
     * Sets the formatSetting value for this ResponsiveDisplayAd.
     * 
     * @param formatSetting   * Specifies which format the ad will be served in. The default
     * value is ALL_FORMATS.
     */
    public void setFormatSetting(com.google.api.ads.adwords.axis.v201802.cm.DisplayAdFormatSetting formatSetting) {
        this.formatSetting = formatSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponsiveDisplayAd)) return false;
        ResponsiveDisplayAd other = (ResponsiveDisplayAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.marketingImage==null && other.getMarketingImage()==null) || 
             (this.marketingImage!=null &&
              this.marketingImage.equals(other.getMarketingImage()))) &&
            ((this.logoImage==null && other.getLogoImage()==null) || 
             (this.logoImage!=null &&
              this.logoImage.equals(other.getLogoImage()))) &&
            ((this.squareMarketingImage==null && other.getSquareMarketingImage()==null) || 
             (this.squareMarketingImage!=null &&
              this.squareMarketingImage.equals(other.getSquareMarketingImage()))) &&
            ((this.shortHeadline==null && other.getShortHeadline()==null) || 
             (this.shortHeadline!=null &&
              this.shortHeadline.equals(other.getShortHeadline()))) &&
            ((this.longHeadline==null && other.getLongHeadline()==null) || 
             (this.longHeadline!=null &&
              this.longHeadline.equals(other.getLongHeadline()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.businessName==null && other.getBusinessName()==null) || 
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.mainColor==null && other.getMainColor()==null) || 
             (this.mainColor!=null &&
              this.mainColor.equals(other.getMainColor()))) &&
            ((this.accentColor==null && other.getAccentColor()==null) || 
             (this.accentColor!=null &&
              this.accentColor.equals(other.getAccentColor()))) &&
            ((this.allowFlexibleColor==null && other.getAllowFlexibleColor()==null) || 
             (this.allowFlexibleColor!=null &&
              this.allowFlexibleColor.equals(other.getAllowFlexibleColor()))) &&
            ((this.callToActionText==null && other.getCallToActionText()==null) || 
             (this.callToActionText!=null &&
              this.callToActionText.equals(other.getCallToActionText()))) &&
            ((this.dynamicDisplayAdSettings==null && other.getDynamicDisplayAdSettings()==null) || 
             (this.dynamicDisplayAdSettings!=null &&
              this.dynamicDisplayAdSettings.equals(other.getDynamicDisplayAdSettings()))) &&
            ((this.formatSetting==null && other.getFormatSetting()==null) || 
             (this.formatSetting!=null &&
              this.formatSetting.equals(other.getFormatSetting())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getMarketingImage() != null) {
            _hashCode += getMarketingImage().hashCode();
        }
        if (getLogoImage() != null) {
            _hashCode += getLogoImage().hashCode();
        }
        if (getSquareMarketingImage() != null) {
            _hashCode += getSquareMarketingImage().hashCode();
        }
        if (getShortHeadline() != null) {
            _hashCode += getShortHeadline().hashCode();
        }
        if (getLongHeadline() != null) {
            _hashCode += getLongHeadline().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getMainColor() != null) {
            _hashCode += getMainColor().hashCode();
        }
        if (getAccentColor() != null) {
            _hashCode += getAccentColor().hashCode();
        }
        if (getAllowFlexibleColor() != null) {
            _hashCode += getAllowFlexibleColor().hashCode();
        }
        if (getCallToActionText() != null) {
            _hashCode += getCallToActionText().hashCode();
        }
        if (getDynamicDisplayAdSettings() != null) {
            _hashCode += getDynamicDisplayAdSettings().hashCode();
        }
        if (getFormatSetting() != null) {
            _hashCode += getFormatSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponsiveDisplayAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "ResponsiveDisplayAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "marketingImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "logoImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("squareMarketingImage");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "squareMarketingImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortHeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "shortHeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longHeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "longHeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "mainColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accentColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "accentColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFlexibleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "allowFlexibleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callToActionText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "callToActionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicDisplayAdSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "dynamicDisplayAdSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DynamicSettings"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "formatSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201802", "DisplayAdFormatSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
