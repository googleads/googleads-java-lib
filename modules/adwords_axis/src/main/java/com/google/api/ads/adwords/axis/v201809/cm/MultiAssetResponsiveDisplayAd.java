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

/**
 * MultiAssetResponsiveDisplayAd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201809.cm;


/**
 * Representation of multi-asset responsive display ad format.
 *             
 *             <p class="caution"><b>Caution:</b> multi-asset responsive
 * display ads do not use {@link #url
 *             url}, {@link #displayUrl displayUrl}, {@link #finalAppUrls
 * finalAppUrls}, or {@link
 *             #devicePreference devicePreference}; setting these fields
 * on a multi-asset responsive display ad
 *             will cause an error.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class MultiAssetResponsiveDisplayAd  extends com.google.api.ads.adwords.axis.v201809.cm.Ad  implements java.io.Serializable {
    /* Marketing image to be used in the ad. This ad format does not
     * allow the creation of an
     *                     imageAsset using the ImageAsset.imageData field.
     * An imageAsset must first be created using the
     *                     AssetService, and ImageAsset.assetId must be populated
     * in this field. Valid image types are
     *                     GIF, JPEG, and PNG. The minimum size is 600x314
     * and the aspect ratio must be 1.91:1 (+-1%). One
     *                     marketingImage is required. Support up to 15 with
     * squareMarketingImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdMarketingImages".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] marketingImages;

    /* Square marketing image to be used in the ad. This image may
     * be used when a square aspect ratio
     *                     is more appropriate than the aspect ratio of the
     * {@link #marketingImage} image. This ad format
     *                     does not allow the creation of an imageAsset using
     * the ImageAsset.imageData field. An
     *                     imageAsset must first be created using the AssetService,
     * and ImageAsset.assetId must be
     *                     populated in this field. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 300x300
     *                     the aspect ratio must be 1:1 (+-1%). One squareMarketingImage
     * is required. Support up to 15
     *                     with marketingImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdSquareMarketingImages".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] squareMarketingImages;

    /* Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the ImageAsset.imageData field. An imageAsset
     * must first be created using the AssetService, and
     *                     ImageAsset.assetId must be populated in this field.
     * Valid image types are GIF, JPEG, and PNG.
     *                     The minimum size is 128x128 and the aspect ratio
     * must be 1:1 (+-1%). Optional. Support up to 5
     *                     with landscapeLogoImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLogoImages".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] logoImages;

    /* Landscape logo image which is used for serving dynamic MultiAssetResponsiveDisplayAd.
     * This ad
     *                     format does not allow the creation of an image
     * using the ImageAsset.imageData field. An
     *                     imageAsset must first be created using the AssetService,
     * and ImageAsset.assetId must be
     *                     populated in this field. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 512x128
     *                     and the aspect ratio must be 4:1 (+-1%). Optional.
     * Support up to 5 with logoImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLandscapeLogoImages".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] landscapeLogoImages;

    /* Short format of the headline of the ad. Maximum display width
     * is 30. One short headline is
     *                     required. Support up to 5 short headlines.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdHeadlines".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] headlines;

    /* Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLongHeadline".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink longHeadline;

    /* The descriptive text of the ad. Maximum display width is 90.
     * One description is required.
     *                     Support up to 5 descriptions.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] descriptions;

    /* The YouTube videos of the ad. Optional. Support up to 5 youtube
     * videos. Asset.assetId must be
     *                     populated in this field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdYouTubeVideos".</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] youTubeVideos;

    /* The Advertiser/brand name. Maximum display width is 25.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdBusinessName".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span> */
    private java.lang.String businessName;

    /* Main color, represented as a hexadecimal string (e.g. #ffffff
     * for white). If one of mainColor
     *                     and accentColor is set, the other is required
     * as well.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdMainColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String mainColor;

    /* Accent color, represented as a hexadecimal string (e.g. #ffffff
     * for white). If one of mainColor
     *                     and accentColor is set, the other is required
     * as well.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdAccentColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String accentColor;

    /* Allow flexible color. If set to true, the ad will show on text
     * and native ad placements even
     *                     when publisher settings may override your custom
     * color selections. This field must be set to
     *                     true if both mainColor and accentColor are not
     * set. The default value is true.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdAllowFlexibleColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.Boolean allowFlexibleColor;

    /* Call to action text.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdCallToActionText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String callToActionText;

    /* Prefix before price. Maximum display width is 10. For example,
     * "as low as". For more details,
     *                     check the help page https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
     * <span class="constraint Selectable">This field can be selected using
     * the value "MultiAssetResponsiveDisplayAdDynamicSettingsPricePrefix".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String dynamicSettingsPricePrefix;

    /* Promotion text used for dynamic formats of multi-asset responsive
     * display ads. Maximum display
     *                     width is 25. For example, "Free two-day shipping".
     * For more details, check the help page
     *                     https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
     * <span class="constraint Selectable">This field can be selected using
     * the value "MultiAssetResponsiveDisplayAdDynamicSettingsPromoText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private java.lang.String dynamicSettingsPromoText;

    /* Specifies which format the ad will be served in. The default
     * value is ALL_FORMATS.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdFormatSetting".</span><span
     * class="constraint Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201809.cm.DisplayAdFormatSetting formatSetting;

    public MultiAssetResponsiveDisplayAd() {
    }

    public MultiAssetResponsiveDisplayAd(
           java.lang.Long id,
           java.lang.String url,
           java.lang.String displayUrl,
           java.lang.String[] finalUrls,
           java.lang.String[] finalMobileUrls,
           com.google.api.ads.adwords.axis.v201809.cm.AppUrl[] finalAppUrls,
           java.lang.String trackingUrlTemplate,
           java.lang.String finalUrlSuffix,
           com.google.api.ads.adwords.axis.v201809.cm.CustomParameters urlCustomParameters,
           com.google.api.ads.adwords.axis.v201809.cm.UrlData[] urlData,
           java.lang.Boolean automated,
           com.google.api.ads.adwords.axis.v201809.cm.AdType type,
           java.lang.Long devicePreference,
           com.google.api.ads.adwords.axis.v201809.cm.SystemManagedEntitySource systemManagedEntitySource,
           java.lang.String adType,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] marketingImages,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] squareMarketingImages,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] logoImages,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] landscapeLogoImages,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] headlines,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink longHeadline,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] descriptions,
           com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] youTubeVideos,
           java.lang.String businessName,
           java.lang.String mainColor,
           java.lang.String accentColor,
           java.lang.Boolean allowFlexibleColor,
           java.lang.String callToActionText,
           java.lang.String dynamicSettingsPricePrefix,
           java.lang.String dynamicSettingsPromoText,
           com.google.api.ads.adwords.axis.v201809.cm.DisplayAdFormatSetting formatSetting) {
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
        this.marketingImages = marketingImages;
        this.squareMarketingImages = squareMarketingImages;
        this.logoImages = logoImages;
        this.landscapeLogoImages = landscapeLogoImages;
        this.headlines = headlines;
        this.longHeadline = longHeadline;
        this.descriptions = descriptions;
        this.youTubeVideos = youTubeVideos;
        this.businessName = businessName;
        this.mainColor = mainColor;
        this.accentColor = accentColor;
        this.allowFlexibleColor = allowFlexibleColor;
        this.callToActionText = callToActionText;
        this.dynamicSettingsPricePrefix = dynamicSettingsPricePrefix;
        this.dynamicSettingsPromoText = dynamicSettingsPromoText;
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
            .add("descriptions", getDescriptions())
            .add("devicePreference", getDevicePreference())
            .add("displayUrl", getDisplayUrl())
            .add("dynamicSettingsPricePrefix", getDynamicSettingsPricePrefix())
            .add("dynamicSettingsPromoText", getDynamicSettingsPromoText())
            .add("finalAppUrls", getFinalAppUrls())
            .add("finalMobileUrls", getFinalMobileUrls())
            .add("finalUrlSuffix", getFinalUrlSuffix())
            .add("finalUrls", getFinalUrls())
            .add("formatSetting", getFormatSetting())
            .add("headlines", getHeadlines())
            .add("id", getId())
            .add("landscapeLogoImages", getLandscapeLogoImages())
            .add("logoImages", getLogoImages())
            .add("longHeadline", getLongHeadline())
            .add("mainColor", getMainColor())
            .add("marketingImages", getMarketingImages())
            .add("squareMarketingImages", getSquareMarketingImages())
            .add("systemManagedEntitySource", getSystemManagedEntitySource())
            .add("trackingUrlTemplate", getTrackingUrlTemplate())
            .add("type", getType())
            .add("url", getUrl())
            .add("urlCustomParameters", getUrlCustomParameters())
            .add("urlData", getUrlData())
            .add("youTubeVideos", getYouTubeVideos())
            .toString();
    }

    /**
     * Gets the marketingImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return marketingImages   * Marketing image to be used in the ad. This ad format does not
     * allow the creation of an
     *                     imageAsset using the ImageAsset.imageData field.
     * An imageAsset must first be created using the
     *                     AssetService, and ImageAsset.assetId must be populated
     * in this field. Valid image types are
     *                     GIF, JPEG, and PNG. The minimum size is 600x314
     * and the aspect ratio must be 1.91:1 (+-1%). One
     *                     marketingImage is required. Support up to 15 with
     * squareMarketingImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdMarketingImages".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getMarketingImages() {
        return marketingImages;
    }


    /**
     * Sets the marketingImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param marketingImages   * Marketing image to be used in the ad. This ad format does not
     * allow the creation of an
     *                     imageAsset using the ImageAsset.imageData field.
     * An imageAsset must first be created using the
     *                     AssetService, and ImageAsset.assetId must be populated
     * in this field. Valid image types are
     *                     GIF, JPEG, and PNG. The minimum size is 600x314
     * and the aspect ratio must be 1.91:1 (+-1%). One
     *                     marketingImage is required. Support up to 15 with
     * squareMarketingImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdMarketingImages".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setMarketingImages(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] marketingImages) {
        this.marketingImages = marketingImages;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getMarketingImages(int i) {
        return this.marketingImages[i];
    }

    public void setMarketingImages(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.marketingImages[i] = _value;
    }


    /**
     * Gets the squareMarketingImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return squareMarketingImages   * Square marketing image to be used in the ad. This image may
     * be used when a square aspect ratio
     *                     is more appropriate than the aspect ratio of the
     * {@link #marketingImage} image. This ad format
     *                     does not allow the creation of an imageAsset using
     * the ImageAsset.imageData field. An
     *                     imageAsset must first be created using the AssetService,
     * and ImageAsset.assetId must be
     *                     populated in this field. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 300x300
     *                     the aspect ratio must be 1:1 (+-1%). One squareMarketingImage
     * is required. Support up to 15
     *                     with marketingImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdSquareMarketingImages".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getSquareMarketingImages() {
        return squareMarketingImages;
    }


    /**
     * Sets the squareMarketingImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param squareMarketingImages   * Square marketing image to be used in the ad. This image may
     * be used when a square aspect ratio
     *                     is more appropriate than the aspect ratio of the
     * {@link #marketingImage} image. This ad format
     *                     does not allow the creation of an imageAsset using
     * the ImageAsset.imageData field. An
     *                     imageAsset must first be created using the AssetService,
     * and ImageAsset.assetId must be
     *                     populated in this field. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 300x300
     *                     the aspect ratio must be 1:1 (+-1%). One squareMarketingImage
     * is required. Support up to 15
     *                     with marketingImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdSquareMarketingImages".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setSquareMarketingImages(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] squareMarketingImages) {
        this.squareMarketingImages = squareMarketingImages;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getSquareMarketingImages(int i) {
        return this.squareMarketingImages[i];
    }

    public void setSquareMarketingImages(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.squareMarketingImages[i] = _value;
    }


    /**
     * Gets the logoImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return logoImages   * Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the ImageAsset.imageData field. An imageAsset
     * must first be created using the AssetService, and
     *                     ImageAsset.assetId must be populated in this field.
     * Valid image types are GIF, JPEG, and PNG.
     *                     The minimum size is 128x128 and the aspect ratio
     * must be 1:1 (+-1%). Optional. Support up to 5
     *                     with landscapeLogoImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLogoImages".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getLogoImages() {
        return logoImages;
    }


    /**
     * Sets the logoImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param logoImages   * Logo image to be used in the ad. This ad format does not allow
     * the creation of an image using
     *                     the ImageAsset.imageData field. An imageAsset
     * must first be created using the AssetService, and
     *                     ImageAsset.assetId must be populated in this field.
     * Valid image types are GIF, JPEG, and PNG.
     *                     The minimum size is 128x128 and the aspect ratio
     * must be 1:1 (+-1%). Optional. Support up to 5
     *                     with landscapeLogoImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLogoImages".</span>
     */
    public void setLogoImages(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] logoImages) {
        this.logoImages = logoImages;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getLogoImages(int i) {
        return this.logoImages[i];
    }

    public void setLogoImages(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.logoImages[i] = _value;
    }


    /**
     * Gets the landscapeLogoImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return landscapeLogoImages   * Landscape logo image which is used for serving dynamic MultiAssetResponsiveDisplayAd.
     * This ad
     *                     format does not allow the creation of an image
     * using the ImageAsset.imageData field. An
     *                     imageAsset must first be created using the AssetService,
     * and ImageAsset.assetId must be
     *                     populated in this field. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 512x128
     *                     and the aspect ratio must be 4:1 (+-1%). Optional.
     * Support up to 5 with logoImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLandscapeLogoImages".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getLandscapeLogoImages() {
        return landscapeLogoImages;
    }


    /**
     * Sets the landscapeLogoImages value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param landscapeLogoImages   * Landscape logo image which is used for serving dynamic MultiAssetResponsiveDisplayAd.
     * This ad
     *                     format does not allow the creation of an image
     * using the ImageAsset.imageData field. An
     *                     imageAsset must first be created using the AssetService,
     * and ImageAsset.assetId must be
     *                     populated in this field. Valid image types are
     * GIF, JPEG, and PNG. The minimum size is 512x128
     *                     and the aspect ratio must be 4:1 (+-1%). Optional.
     * Support up to 5 with logoImages.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLandscapeLogoImages".</span>
     */
    public void setLandscapeLogoImages(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] landscapeLogoImages) {
        this.landscapeLogoImages = landscapeLogoImages;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getLandscapeLogoImages(int i) {
        return this.landscapeLogoImages[i];
    }

    public void setLandscapeLogoImages(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.landscapeLogoImages[i] = _value;
    }


    /**
     * Gets the headlines value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return headlines   * Short format of the headline of the ad. Maximum display width
     * is 30. One short headline is
     *                     required. Support up to 5 short headlines.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdHeadlines".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getHeadlines() {
        return headlines;
    }


    /**
     * Sets the headlines value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param headlines   * Short format of the headline of the ad. Maximum display width
     * is 30. One short headline is
     *                     required. Support up to 5 short headlines.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdHeadlines".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setHeadlines(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] headlines) {
        this.headlines = headlines;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getHeadlines(int i) {
        return this.headlines[i];
    }

    public void setHeadlines(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.headlines[i] = _value;
    }


    /**
     * Gets the longHeadline value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return longHeadline   * Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLongHeadline".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getLongHeadline() {
        return longHeadline;
    }


    /**
     * Sets the longHeadline value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param longHeadline   * Long format of the headline of the ad. Maximum display width
     * is 90.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdLongHeadline".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setLongHeadline(com.google.api.ads.adwords.axis.v201809.cm.AssetLink longHeadline) {
        this.longHeadline = longHeadline;
    }


    /**
     * Gets the descriptions value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return descriptions   * The descriptive text of the ad. Maximum display width is 90.
     * One description is required.
     *                     Support up to 5 descriptions.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getDescriptions() {
        return descriptions;
    }


    /**
     * Sets the descriptions value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param descriptions   * The descriptive text of the ad. Maximum display width is 90.
     * One description is required.
     *                     Support up to 5 descriptions.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdDescriptions".</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setDescriptions(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] descriptions) {
        this.descriptions = descriptions;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getDescriptions(int i) {
        return this.descriptions[i];
    }

    public void setDescriptions(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.descriptions[i] = _value;
    }


    /**
     * Gets the youTubeVideos value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return youTubeVideos   * The YouTube videos of the ad. Optional. Support up to 5 youtube
     * videos. Asset.assetId must be
     *                     populated in this field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdYouTubeVideos".</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] getYouTubeVideos() {
        return youTubeVideos;
    }


    /**
     * Sets the youTubeVideos value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param youTubeVideos   * The YouTube videos of the ad. Optional. Support up to 5 youtube
     * videos. Asset.assetId must be
     *                     populated in this field.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdYouTubeVideos".</span>
     */
    public void setYouTubeVideos(com.google.api.ads.adwords.axis.v201809.cm.AssetLink[] youTubeVideos) {
        this.youTubeVideos = youTubeVideos;
    }

    public com.google.api.ads.adwords.axis.v201809.cm.AssetLink getYouTubeVideos(int i) {
        return this.youTubeVideos[i];
    }

    public void setYouTubeVideos(int i, com.google.api.ads.adwords.axis.v201809.cm.AssetLink _value) {
        this.youTubeVideos[i] = _value;
    }


    /**
     * Gets the businessName value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return businessName   * The Advertiser/brand name. Maximum display width is 25.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdBusinessName".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public java.lang.String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param businessName   * The Advertiser/brand name. Maximum display width is 25.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdBusinessName".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD.</span>
     */
    public void setBusinessName(java.lang.String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the mainColor value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return mainColor   * Main color, represented as a hexadecimal string (e.g. #ffffff
     * for white). If one of mainColor
     *                     and accentColor is set, the other is required
     * as well.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdMainColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getMainColor() {
        return mainColor;
    }


    /**
     * Sets the mainColor value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param mainColor   * Main color, represented as a hexadecimal string (e.g. #ffffff
     * for white). If one of mainColor
     *                     and accentColor is set, the other is required
     * as well.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdMainColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setMainColor(java.lang.String mainColor) {
        this.mainColor = mainColor;
    }


    /**
     * Gets the accentColor value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return accentColor   * Accent color, represented as a hexadecimal string (e.g. #ffffff
     * for white). If one of mainColor
     *                     and accentColor is set, the other is required
     * as well.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdAccentColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getAccentColor() {
        return accentColor;
    }


    /**
     * Sets the accentColor value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param accentColor   * Accent color, represented as a hexadecimal string (e.g. #ffffff
     * for white). If one of mainColor
     *                     and accentColor is set, the other is required
     * as well.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdAccentColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setAccentColor(java.lang.String accentColor) {
        this.accentColor = accentColor;
    }


    /**
     * Gets the allowFlexibleColor value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return allowFlexibleColor   * Allow flexible color. If set to true, the ad will show on text
     * and native ad placements even
     *                     when publisher settings may override your custom
     * color selections. This field must be set to
     *                     true if both mainColor and accentColor are not
     * set. The default value is true.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdAllowFlexibleColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.Boolean getAllowFlexibleColor() {
        return allowFlexibleColor;
    }


    /**
     * Sets the allowFlexibleColor value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param allowFlexibleColor   * Allow flexible color. If set to true, the ad will show on text
     * and native ad placements even
     *                     when publisher settings may override your custom
     * color selections. This field must be set to
     *                     true if both mainColor and accentColor are not
     * set. The default value is true.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdAllowFlexibleColor".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setAllowFlexibleColor(java.lang.Boolean allowFlexibleColor) {
        this.allowFlexibleColor = allowFlexibleColor;
    }


    /**
     * Gets the callToActionText value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return callToActionText   * Call to action text.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdCallToActionText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getCallToActionText() {
        return callToActionText;
    }


    /**
     * Sets the callToActionText value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param callToActionText   * Call to action text.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdCallToActionText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setCallToActionText(java.lang.String callToActionText) {
        this.callToActionText = callToActionText;
    }


    /**
     * Gets the dynamicSettingsPricePrefix value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return dynamicSettingsPricePrefix   * Prefix before price. Maximum display width is 10. For example,
     * "as low as". For more details,
     *                     check the help page https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
     * <span class="constraint Selectable">This field can be selected using
     * the value "MultiAssetResponsiveDisplayAdDynamicSettingsPricePrefix".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDynamicSettingsPricePrefix() {
        return dynamicSettingsPricePrefix;
    }


    /**
     * Sets the dynamicSettingsPricePrefix value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param dynamicSettingsPricePrefix   * Prefix before price. Maximum display width is 10. For example,
     * "as low as". For more details,
     *                     check the help page https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
     * <span class="constraint Selectable">This field can be selected using
     * the value "MultiAssetResponsiveDisplayAdDynamicSettingsPricePrefix".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setDynamicSettingsPricePrefix(java.lang.String dynamicSettingsPricePrefix) {
        this.dynamicSettingsPricePrefix = dynamicSettingsPricePrefix;
    }


    /**
     * Gets the dynamicSettingsPromoText value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return dynamicSettingsPromoText   * Promotion text used for dynamic formats of multi-asset responsive
     * display ads. Maximum display
     *                     width is 25. For example, "Free two-day shipping".
     * For more details, check the help page
     *                     https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
     * <span class="constraint Selectable">This field can be selected using
     * the value "MultiAssetResponsiveDisplayAdDynamicSettingsPromoText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getDynamicSettingsPromoText() {
        return dynamicSettingsPromoText;
    }


    /**
     * Sets the dynamicSettingsPromoText value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param dynamicSettingsPromoText   * Promotion text used for dynamic formats of multi-asset responsive
     * display ads. Maximum display
     *                     width is 25. For example, "Free two-day shipping".
     * For more details, check the help page
     *                     https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
     * <span class="constraint Selectable">This field can be selected using
     * the value "MultiAssetResponsiveDisplayAdDynamicSettingsPromoText".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setDynamicSettingsPromoText(java.lang.String dynamicSettingsPromoText) {
        this.dynamicSettingsPromoText = dynamicSettingsPromoText;
    }


    /**
     * Gets the formatSetting value for this MultiAssetResponsiveDisplayAd.
     * 
     * @return formatSetting   * Specifies which format the ad will be served in. The default
     * value is ALL_FORMATS.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdFormatSetting".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201809.cm.DisplayAdFormatSetting getFormatSetting() {
        return formatSetting;
    }


    /**
     * Sets the formatSetting value for this MultiAssetResponsiveDisplayAd.
     * 
     * @param formatSetting   * Specifies which format the ad will be served in. The default
     * value is ALL_FORMATS.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "MultiAssetResponsiveDisplayAdFormatSetting".</span><span
     * class="constraint Filterable">This field can be filtered on.</span>
     */
    public void setFormatSetting(com.google.api.ads.adwords.axis.v201809.cm.DisplayAdFormatSetting formatSetting) {
        this.formatSetting = formatSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiAssetResponsiveDisplayAd)) return false;
        MultiAssetResponsiveDisplayAd other = (MultiAssetResponsiveDisplayAd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.marketingImages==null && other.getMarketingImages()==null) || 
             (this.marketingImages!=null &&
              java.util.Arrays.equals(this.marketingImages, other.getMarketingImages()))) &&
            ((this.squareMarketingImages==null && other.getSquareMarketingImages()==null) || 
             (this.squareMarketingImages!=null &&
              java.util.Arrays.equals(this.squareMarketingImages, other.getSquareMarketingImages()))) &&
            ((this.logoImages==null && other.getLogoImages()==null) || 
             (this.logoImages!=null &&
              java.util.Arrays.equals(this.logoImages, other.getLogoImages()))) &&
            ((this.landscapeLogoImages==null && other.getLandscapeLogoImages()==null) || 
             (this.landscapeLogoImages!=null &&
              java.util.Arrays.equals(this.landscapeLogoImages, other.getLandscapeLogoImages()))) &&
            ((this.headlines==null && other.getHeadlines()==null) || 
             (this.headlines!=null &&
              java.util.Arrays.equals(this.headlines, other.getHeadlines()))) &&
            ((this.longHeadline==null && other.getLongHeadline()==null) || 
             (this.longHeadline!=null &&
              this.longHeadline.equals(other.getLongHeadline()))) &&
            ((this.descriptions==null && other.getDescriptions()==null) || 
             (this.descriptions!=null &&
              java.util.Arrays.equals(this.descriptions, other.getDescriptions()))) &&
            ((this.youTubeVideos==null && other.getYouTubeVideos()==null) || 
             (this.youTubeVideos!=null &&
              java.util.Arrays.equals(this.youTubeVideos, other.getYouTubeVideos()))) &&
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
            ((this.dynamicSettingsPricePrefix==null && other.getDynamicSettingsPricePrefix()==null) || 
             (this.dynamicSettingsPricePrefix!=null &&
              this.dynamicSettingsPricePrefix.equals(other.getDynamicSettingsPricePrefix()))) &&
            ((this.dynamicSettingsPromoText==null && other.getDynamicSettingsPromoText()==null) || 
             (this.dynamicSettingsPromoText!=null &&
              this.dynamicSettingsPromoText.equals(other.getDynamicSettingsPromoText()))) &&
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
        if (getMarketingImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarketingImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarketingImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSquareMarketingImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSquareMarketingImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSquareMarketingImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogoImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLogoImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLogoImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLandscapeLogoImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandscapeLogoImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandscapeLogoImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeadlines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeadlines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeadlines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLongHeadline() != null) {
            _hashCode += getLongHeadline().hashCode();
        }
        if (getDescriptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescriptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescriptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getYouTubeVideos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYouTubeVideos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYouTubeVideos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDynamicSettingsPricePrefix() != null) {
            _hashCode += getDynamicSettingsPricePrefix().hashCode();
        }
        if (getDynamicSettingsPromoText() != null) {
            _hashCode += getDynamicSettingsPromoText().hashCode();
        }
        if (getFormatSetting() != null) {
            _hashCode += getFormatSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiAssetResponsiveDisplayAd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "MultiAssetResponsiveDisplayAd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "marketingImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("squareMarketingImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "squareMarketingImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "logoImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landscapeLogoImages");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "landscapeLogoImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headlines");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "headlines"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longHeadline");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "longHeadline"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "descriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("youTubeVideos");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "youTubeVideos"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "AssetLink"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "mainColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accentColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "accentColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFlexibleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "allowFlexibleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callToActionText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "callToActionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicSettingsPricePrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "dynamicSettingsPricePrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicSettingsPromoText");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "dynamicSettingsPromoText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "formatSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201809", "DisplayAdFormatSetting"));
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
