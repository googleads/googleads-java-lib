// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.selectorfields.v201806.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code Ad}.
 */
public enum AdField implements EntityField {

  // Fields constants definitions

  /**
   * Accent color.
   * In hexadecimal, e.g.
   * #ffffff for white.
   * If one of mainColor and accentColor is set, the other is required as well.
   */
  @Filterable
  AccentColor(true),

  /**
   * Type of ad.
   */
  @Filterable
  AdType(true),

  /**
   * Advertiser?s consent to allow flexible color.
   * When true, we may serve the ad with different color when necessary.
   * When false, we will serve the ad with advertiser color or neutral color.
   * Must be true if mainColor and accentColor are not set.
   * The default value is true.
   */
  @Filterable
  AllowFlexibleColor(true),

  /**
   * The business name.
   * Maximum display width is 25.
   * <span class="constraint Required">This field is required and should not be {@code null} when it is contained within {@code Operator}s : ADD.</span>
   */
  @Filterable
  BusinessName(true),

  /**
   * Call to action text.
   * Valid texts: https://support.google.com/adwords/answer/7005917
   */
  @Filterable
  CallToActionText(true),

  /**
   * A list of final app URLs that will be used on mobile if the user has the specific app installed.
   * <p>This field is used for upgraded urls only, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  CreativeFinalAppUrls(true),

  /**
   * A list of possible final mobile URLs after all cross domain redirects.
   * <p>This field is used for upgraded urls only, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  CreativeFinalMobileUrls(true),

  /**
   * URL template for appending params to Final URL.
   * <p>On update, empty string ("") indicates to clear the field.
   * <p>This field is supported only in test accounts.
   */
  @Filterable
  CreativeFinalUrlSuffix(true),

  /**
   * A list of possible final URLs after all cross domain redirects.
   * <p>This field is used for upgraded urls only, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  CreativeFinalUrls(true),

  /**
   * URL template for constructing a tracking URL.
   * <p>This field is used for upgraded urls only, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  CreativeTrackingUrlTemplate(true),

  /**
   * A list of mappings to be used for substituting URL custom parameter tags in the trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
   * <p>This field is used for upgraded urls only, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  CreativeUrlCustomParameters(true),

  /**
   * The descriptive text of the ad.
   */
  @Filterable
  Description(true),

  /**
   * The first description line.
   */
  @Filterable
  Description1(true),

  /**
   * The second description line.
   */
  @Filterable
  Description2(true),

  /**
   * Visible URL.
   */
  @Filterable
  DisplayUrl(true),

  /**
   * The duration of the associated audio, in milliseconds.
   */
  @Filterable
  DurationMillis(true),

  /**
   * Specifies which format the ad will be served in.
   * The default value is ALL_FORMATS.
   */
  @Filterable
  FormatSetting(true),

  /**
   * First part of the headline.
   */
  @Filterable
  HeadlinePart1(true),

  /**
   * Second part of the headline.
   */
  @Filterable
  HeadlinePart2(true),

  /**
   * ID of this ad.
   * This field is ignored when creating ads using {@code AdGroupAdService}.
   */
  @Filterable
  Id(true),

  /**
   * Long format of the headline of the ad.
   * Maximum display width is 90.
   */
  @Filterable
  LongHeadline(true),

  /**
   * Main color.
   * In hexadecimal, e.g.
   * #ffffff for white.
   * If one of mainColor and accentColor is set, the other is required as well.
   */
  @Filterable
  MainColor(true),

  /**
   * Accent color, represented as a hexadecimal string (e.g.
   * #ffffff for white).
   * If one of mainColor and accentColor is set, the other is required as well.
   */
  @Filterable
  MultiAssetResponsiveDisplayAdAccentColor(true),

  /**
   * Allow flexible color.
   * If set to true, the ad will show on text and native ad placements even when publisher settings may override your custom color selections.
   * This field must be set to true if both mainColor and accentColor are not set.
   * The default value is true.
   */
  @Filterable
  MultiAssetResponsiveDisplayAdAllowFlexibleColor(true),

  /**
   * The Advertiser/brand name.
   * Maximum display width is 25.
   */
  @Filterable
  MultiAssetResponsiveDisplayAdBusinessName(true),

  /**
   * Call to action text.
   */
  @Filterable
  MultiAssetResponsiveDisplayAdCallToActionText(true),

  /**
   * The descriptive text of the ad.
   * Maximum display width is 90.
   * One description is required.
   * Support up to 5 descriptions.
   */
  MultiAssetResponsiveDisplayAdDescriptions(false),

  /**
   * Prefix before price.
   * Maximum display width is 10.
   * For example, "as low as".
   * For more details, check the help page https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
   */
  @Filterable
  MultiAssetResponsiveDisplayAdDynamicSettingsPricePrefix(true),

  /**
   * Promotion text used for dynamic formats of multi-asset responsive display ads.
   * Maximum display width is 25.
   * For example, "Free two-day shipping".
   * For more details, check the help page https://developers.google.com/adwords/api/docs/guides/dynamic-remarketing
   */
  @Filterable
  MultiAssetResponsiveDisplayAdDynamicSettingsPromoText(true),

  /**
   * Specifies which format the ad will be served in.
   * The default value is ALL_FORMATS.
   */
  @Filterable
  MultiAssetResponsiveDisplayAdFormatSetting(true),

  /**
   * Short format of the headline of the ad.
   * Maximum display width is 30.
   * One short headline is required.
   * Support up to 5 short headlines.
   */
  MultiAssetResponsiveDisplayAdHeadlines(false),

  /**
   * Landscape logo image which is used for serving dynamic MultiAssetResponsiveDisplayAd.
   * This ad format does not allow the creation of an image using the ImageAsset.imageData field.
   * An imageAsset must first be created using the AssetService, and ImageAsset.assetId must be populated in this field.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 512x128 and the aspect ratio must be 4:1 (+-1%).
   * Optional.
   * Support up to 5 with logoImages.
   */
  MultiAssetResponsiveDisplayAdLandscapeLogoImages(false),

  /**
   * Logo image to be used in the ad.
   * This ad format does not allow the creation of an image using the ImageAsset.imageData field.
   * An imageAsset must first be created using the AssetService, and ImageAsset.assetId must be populated in this field.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 128x128 and the aspect ratio must be 1:1 (+-1%).
   * Optional.
   * Support up to 5 with landscapeLogoImages.
   */
  MultiAssetResponsiveDisplayAdLogoImages(false),

  /**
   * Long format of the headline of the ad.
   * Maximum display width is 90.
   */
  MultiAssetResponsiveDisplayAdLongHeadline(false),

  /**
   * Main color, represented as a hexadecimal string (e.g.
   * #ffffff for white).
   * If one of mainColor and accentColor is set, the other is required as well.
   */
  @Filterable
  MultiAssetResponsiveDisplayAdMainColor(true),

  /**
   * Marketing image to be used in the ad.
   * This ad format does not allow the creation of an imageAsset using the ImageAsset.imageData field.
   * An imageAsset must first be created using the AssetService, and ImageAsset.assetId must be populated in this field.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 600x314 and the aspect ratio must be 1.91:1 (+-1%).
   * One marketingImage is required.
   * Support up to 15 with squareMarketingImages.
   */
  MultiAssetResponsiveDisplayAdMarketingImages(false),

  /**
   * Square marketing image to be used in the ad.
   * This image may be used when a square aspect ratio is more appropriate than the aspect ratio of the {@code #marketingImage} image.
   * This ad format does not allow the creation of an imageAsset using the ImageAsset.imageData field.
   * An imageAsset must first be created using the AssetService, and ImageAsset.assetId must be populated in this field.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 300x300 the aspect ratio must be 1:1 (+-1%).
   * One squareMarketingImage is required.
   * Support up to 15 with marketingImages.
   */
  MultiAssetResponsiveDisplayAdSquareMarketingImages(false),

  /**
   * Name of the ad.
   */
  Name(false),

  /**
   * Text that appears in the ad with the displayed URL.
   */
  @Filterable
  Path1(true),

  /**
   * In addition to {@code #path1}, more text that appears with the displayed URL.
   */
  @Filterable
  Path2(true),

  /**
   * Indicates whether the audio is ready to play on the web.
   */
  ReadyToPlayOnTheWeb(false),

  /**
   * Descriptions.
   * When the Ad serves, the descriptions will be selected from this list.
   */
  ResponsiveSearchAdDescriptions(false),

  /**
   * Headlines.
   * When the Ad serves, the headlines will be selected from this list.
   */
  ResponsiveSearchAdHeadlines(false),

  /**
   * Text that appears in the ad with the displayed URL.
   */
  @Filterable
  ResponsiveSearchAdPath1(true),

  /**
   * In addition to {@code #path1}, more text that appears with the displayed URL.
   */
  @Filterable
  ResponsiveSearchAdPath2(true),

  /**
   * Short format of the headline of the ad.
   * Maximum display width is 25.
   */
  @Filterable
  ShortHeadline(true),

  /**
   * The streaming URL of the audio.
   */
  StreamingUrl(false),

  /**
   * Type of the creative.
   */
  Type(false),

  /**
   * Destination URL.
   * <p>Do not set this field if you are using upgraded URLs, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  Url(true),

  ;

  private final boolean isFilterable;

  private AdField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
