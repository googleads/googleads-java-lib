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

package com.google.api.ads.adwords.lib.selectorfields.v201802.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroupAd}.
 */
public enum AdGroupAdField implements EntityField {

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
   * The id of the adgroup containing this ad.
   */
  @Filterable
  AdGroupId(true),

  /**
   * Type of ad.
   */
  @Filterable
  AdType(true),

  /**
   * The Advertising Digital Identification code for this media, as defined by the American Association of Advertising Agencies, used mainly for television commercials.
   */
  AdvertisingId(false),

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
   * Indicates if this ad was added by AdWords.
   */
  @Filterable
  Automated(true),

  /**
   * ID of the base ad group from which this draft/trial ad was created.
   * For base ad groups this is equal to the ad group ID.
   * If the ad group was created in the draft or trial and has no corresponding base ad group, this field is null.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseAdGroupId(true),

  /**
   * ID of the base campaign from which this draft/trial ad was created.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseCampaignId(true),

  /**
   * The business name.
   * Maximum display width is 25.
   * <span class="constraint Required">This field is required and should not be {@code null} when it is contained within {@code Operator}s : ADD.</span>
   */
  @Filterable
  BusinessName(true),

  /**
   * Business name of the ad.
   */
  @Filterable
  CallOnlyAdBusinessName(true),

  /**
   * If set to true, enable call tracking for the creative.
   * Enabling call tracking also enables call conversions.
   */
  CallOnlyAdCallTracked(false),

  /**
   * Conversion type to attribute a call conversion to.
   * If not set, then a default conversion type id is used.
   * Only in effect if callTracked is also set to true otherwise this field is ignored.
   */
  CallOnlyAdConversionTypeId(false),

  /**
   * Two letter country code for the ad.
   * Examples: 'US', 'GB'.
   */
  @Filterable
  CallOnlyAdCountryCode(true),

  /**
   * First line of ad text.
   */
  @Filterable
  CallOnlyAdDescription1(true),

  /**
   * Second line of ad text.
   */
  @Filterable
  CallOnlyAdDescription2(true),

  /**
   * By default, call conversions are enabled when callTracked is on.
   * To disable call conversions, set this field to true.
   * Only in effect if callTracked is also set to true.
   * If callTracked is set to false, this field is ignored.
   */
  CallOnlyAdDisableCallConversion(false),

  /**
   * Phone number string for the ad.
   * Examples: '(800) 356-9377', "16502531234", "+442001234567"
   */
  @Filterable
  CallOnlyAdPhoneNumber(true),

  /**
   * Url to be used for phone number verification.
   */
  @Filterable
  CallOnlyAdPhoneNumberVerificationUrl(true),

  /**
   * Call to action text.
   * Valid texts: https://support.google.com/adwords/answer/7005917
   */
  @Filterable
  CallToActionText(true),

  /**
   * Approval status that combines review state and status.
   */
  @Filterable
  CombinedApprovalStatus(true),

  /**
   * Media creation date in the format YYYY-MM-DD HH:MM:SS+TZ.
   * This is not updatable and not specifiable.
   */
  CreationTime(false),

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
   * The device preference for the ad.
   * You can only specify a preference for mobile devices (CriterionId 30001).
   * If unspecified (no device preference), all devices are targeted.
   */
  @Filterable
  DevicePreference(true),

  /**
   * Various dimension sizes for the media.
   * Only applies to image media (and video media for video thumbnails).
   */
  Dimensions(false),

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
   * Allowed expanding directions.
   * These directions are used to match publishers' ad slots.
   * For example, if a slot allows expansion toward the right, only ads with EXPANDING_RIGHT specified will show up there.
   */
  ExpandingDirections(false),

  /**
   * The size of the media file in bytes.
   */
  FileSize(false),

  /**
   * Specifies which format the ad will be served in.
   * The default value is ALL_FORMATS.
   */
  @Filterable
  FormatSetting(true),

  /**
   * Header image.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "GmailAd"}.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 300x100 and the aspect ratio must be in 3:1 to 5:1 (+-1%).
   */
  GmailHeaderImage(false),

  /**
   * Marketing image.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "GmailAd"}.Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 600x314 and the aspect ratio must be 600:314 (+-1%).
   * For square marketing image, the minimum size is 300x300 and the aspect ratio must be 1:1 (+-1%).
   * Either productVideos or marketingImage must be specified.
   */
  GmailMarketingImage(false),

  /**
   * Business name of the advertiser.
   * Maximum display width is 20 characters.
   */
  @Filterable
  GmailTeaserBusinessName(true),

  /**
   * Description of the teaser.
   * Maximum display width is 90 characters.
   */
  @Filterable
  GmailTeaserDescription(true),

  /**
   * Headline of the teaser.
   * Maximum display width is 25 characters.
   */
  @Filterable
  GmailTeaserHeadline(true),

  /**
   * Required.
   * Logo image.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "GmailTeaser"}.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 144x144 and the aspect ratio must be 1:1 (+-1%).
   * Required.
   */
  GmailTeaserLogoImage(false),

  /**
   * The headline of the ad.
   */
  @Filterable
  Headline(true),

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
   * Height of the dimension
   */
  Height(false),

  /**
   * ID of this ad.
   * This field is ignored when creating ads using {@code AdGroupAdService}.
   */
  @Filterable
  Id(true),

  /**
   * The name label for this ad.
   * <span class="constraint Required"> This field is required and should not be {@code null}.</span>
   */
  @Filterable
  ImageCreativeName(true),

  /**
   * The Industry Standard Commercial Identifier code for this media, used mainly for television commercials.
   */
  IndustryStandardCommercialIdentifier(false),

  /**
   * Defines whether or not the ad is cookie targeted.
   * (i.e.
   * user list targeting, or the network's equivalent).
   */
  IsCookieTargeted(false),

  /**
   * Defines whether or not the ad contains a tracking pixel of any kind.
   */
  IsTagged(false),

  /**
   * Defines whether or not the ad is targeting user interest.
   */
  IsUserInterestTargeted(false),

  /**
   * Labels that are attached to the AdGroupAd.
   * To associate an existing {@code Label} to an existing {@code AdGroupAd}, use {@code AdGroupAdService#mutateLabel} with ADD operator.
   * To remove an associated {@code Label} from the {@code AdGroupAd}, use {@code AdGroupAdService#mutateLabel} with REMOVE operator.
   * To filter on {@code Label}s, use one of {@code Predicate.Operator#CONTAINS_ALL}, {@code Predicate.Operator#CONTAINS_ANY}, {@code Predicate.Operator#CONTAINS_NONE} operators with a list of {@code Label} ids.
   */
  @Filterable
  Labels(true),

  /**
   * Landscape logo image.
   * This ad format does not allow the creation of an image using the Image.data field.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "DynamicSettings"}.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 512x128 the aspect ratio must be 512:128 (+-1%).
   */
  LandscapeLogoImage(false),

  /**
   * Logo image to be used in the ad.
   * This ad format does not allow the creation of an image using the Image.data field.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "ResponsiveDisplayAd"}.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 128x128 and the aspect ratio must be 1:1 (+-1%).
   */
  LogoImage(false),

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
   * Marketing image to be used in the ad.
   * This ad format does not allow the creation of an image using the Image.data field.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "ResponsiveDisplayAd"}.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 600x314 and the aspect ratio must be 600:314 (+-1%).
   */
  MarketingImage(false),

  /**
   * Text of the display-call-to-action.
   * Maximum display width is 15 characters.
   */
  @Filterable
  MarketingImageCallToActionText(true),

  /**
   * Text color of the display-call-to-action.
   * In hexadecimal, e.g.
   * #ffffff for white.
   */
  @Filterable
  MarketingImageCallToActionTextColor(true),

  /**
   * Description of the marketing image.
   * Maximum display width is 90 characters.
   */
  @Filterable
  MarketingImageDescription(true),

  /**
   * Headline of the marketing image.
   * Maximum display width is 25 characters.
   */
  @Filterable
  MarketingImageHeadline(true),

  /**
   * ID of this media object.
   */
  MediaId(false),

  /**
   * The mime type of the media.
   */
  MimeType(false),

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
   * Summary of policy findings for this ad.
   */
  PolicySummary(false),

  /**
   * Prefix before price.
   * Maximum display width is 10.
   * example, "as low as".
   */
  @Filterable
  PricePrefix(true),

  /**
   * Product images.
   * Support up to 15 product images.
   */
  ProductImages(false),

  /**
   * Product Videos.
   * Either productVideoList or marketingImage must be specified.
   * Supports up to 7 product videos.
   * It must be a YouTube hosted video and mediaId must be populated.
   * The YouTube hosted video can be added to AdWords through either the AdWords UI or through AdWords Scripts (https://developers.google.com/adwords/scripts/docs/reference/adwordsapp/adwordsapp_videobuilder).
   */
  ProductVideoList(false),

  /**
   * Promotion text used for dynamic formats of responsive ads.
   * Maximum display width is 25.
   * For example, "Free two-day shipping".
   */
  @Filterable
  PromoText(true),

  /**
   * Indicates whether the audio is ready to play on the web.
   */
  ReadyToPlayOnTheWeb(false),

  /**
   * Media reference ID key.
   */
  ReferenceId(false),

  /**
   * <a href="/adwords/api/docs/appendix/richmediacodes"> Certified Vendor Format ID</a>.
   */
  RichMediaAdCertifiedVendorFormatId(false),

  /**
   * Duration for the ad (in milliseconds).
   * Default is 0.
   */
  RichMediaAdDuration(false),

  /**
   * Impression beacon URL for the ad.
   */
  RichMediaAdImpressionBeaconUrl(false),

  /**
   * Name of the rich media ad.
   * <span class="constraint Required">This field is required and should not be {@code null}.</span>
   */
  RichMediaAdName(false),

  /**
   * Snippet for this ad.
   * Required for standard third-party ads.
   * <p>The length of the string should be between 1 and 3072, inclusive.
   */
  RichMediaAdSnippet(false),

  /**
   * SourceUrl pointing to the third party snippet.
   * For third party in-stream video ads, this stores the VAST URL.
   * For DFA ads, it stores the InRed URL.
   */
  RichMediaAdSourceUrl(false),

  /**
   * Type of this rich media ad, the default is Standard.
   */
  RichMediaAdType(false),

  /**
   * Short format of the headline of the ad.
   * Maximum display width is 25.
   */
  @Filterable
  ShortHeadline(true),

  /**
   * The URL of where the original media was downloaded from (or a file name).
   */
  SourceUrl(false),

  /**
   * Square marketing image to be used in the ad.
   * This image may be used when a square aspect ratio is more appropriate than the aspect ratio of the {@code #marketingImage} image.
   * This ad format does not allow the creation of an image using the Image.data field.
   * An image must first be created using the MediaService, and Image.mediaId must be populated when creating a {@code "ResponsiveDisplayAd"}.
   * Valid image types are GIF, JPEG, and PNG.
   * The minimum size is 300x300 the aspect ratio must be 1:1 (+-1%).
   */
  SquareMarketingImage(false),

  /**
   * The status of the ad.
   * This field is required and should not be {@code null} when it is contained within {@code Operator}s : SET.
   */
  @Filterable
  Status(true),

  /**
   * The streaming URL of the audio.
   */
  StreamingUrl(false),

  /**
   * The source of this system-managed ad.
   */
  @Filterable
  SystemManagedEntitySource(true),

  /**
   * Duration of this ad (if it contains playable media).
   */
  TemplateAdDuration(false),

  /**
   * Name of this ad.
   * <span class="constraint Required"> This field is required and should not be {@code null}.</span>
   */
  TemplateAdName(false),

  /**
   * Group ID of all template ads, which should be created together.
   * Template ads in the same union reference the same data but have different dimensions.
   * Single ads do not have a union ID.
   * If a template ad specifies an ad union with only one ad, no union will be created.
   */
  TemplateAdUnionId(false),

  /**
   * The name of this field.
   */
  TemplateElementFieldName(false),

  /**
   * Text value for text field types.
   * Null if not text field.
   * The field is a text field if type is ADDRESS, ENUM, TEXT, URL, or VISIBLE_URL.
   */
  TemplateElementFieldText(false),

  /**
   * The type of this field.
   */
  TemplateElementFieldType(false),

  /**
   * ID of the template to use.
   */
  @Filterable
  TemplateId(true),

  /**
   * For copies, the ad id of the ad this was or should be copied from.
   */
  TemplateOriginAdId(false),

  /**
   * Type of the creative.
   */
  Type(false),

  /**
   * Unique name for this element.
   */
  UniqueName(false),

  /**
   * Destination URL.
   * <p>Do not set this field if you are using upgraded URLs, as described at: https://developers.google.com/adwords/api/docs/guides/upgraded-urls
   */
  @Filterable
  Url(true),

  /**
   * Additional urls for the ad that are tagged with a unique identifier.
   * Currently only used for TemplateAds for specific template IDs.
   * For all other ad types, use finalUrls, finalMobileUrls and finalAppUrls instead.
   */
  UrlData(false),

  /**
   * URLs pointing to the resized media for the given sizes.
   * Only applies to image media.
   */
  Urls(false),

  /**
   * Video Types of the ad.
   * (RealMedia, Quick Time etc.)
   */
  VideoTypes(false),

  /**
   * Width of the dimension
   */
  Width(false),

  /**
   * For YouTube-hosted videos, the YouTube video ID (as seen in YouTube URLs) may also be filled in.
   */
  YouTubeVideoIdString(false),

  ;

  private final boolean isFilterable;

  private AdGroupAdField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
