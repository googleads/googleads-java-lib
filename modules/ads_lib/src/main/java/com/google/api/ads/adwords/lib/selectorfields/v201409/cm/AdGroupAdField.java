// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201409.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroupAd}.
 */
public enum AdGroupAdField implements EntityField {

  // Fields constants definitions

  /**
   * List of disapproval reasons.
   */
  @Filterable
  AdGroupAdDisapprovalReasons(true),

  /**
   * True if and only if this ad is not serving because it does not meet trademark policy.
   * This field is only useful when {@link #approvalStatus approvalStatus} is an approved status.
   */
  AdGroupAdTrademarkDisapproved(false),

  /**
   * Approval status.
   */
  @Filterable
  AdGroupCreativeApprovalStatus(true),

  /**
   * The id of the adgroup containing this ad.
   */
  @Filterable
  AdGroupId(true),

  /**
   * The Advertising Digital Identification code for this media, as defined by the American Association of Advertising Agencies, used mainly for television commercials.
   */
  AdvertisingId(false),

  /**
   * Business name of the ad.
   */
  CallOnlyAdBusinessName(false),

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
  CallOnlyAdCountryCode(false),

  /**
   * First line of ad text.
   */
  CallOnlyAdDescription1(false),

  /**
   * Second line of ad text.
   */
  CallOnlyAdDescription2(false),

  /**
   * Phone number string for the ad.
   * Examples: '(800) 356-9377', "16502531234", "+442001234567"
   */
  CallOnlyAdPhoneNumber(false),

  /**
   * Url to be used for phone number verification.
   */
  CallOnlyAdPhoneNumberVerificationUrl(false),

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
   * The first description line
   */
  @Filterable
  Description1(true),

  /**
   * The second description line
   */
  @Filterable
  Description2(true),

  /**
   * The device preference for the ad.
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
   * Status of the experiment row
   */
  ExperimentDataStatus(false),

  /**
   * Status of this AdGroupAd in the experiment.
   * It must be specified while adding experiment data, which could come as a SET as well
   */
  ExperimentDeltaStatus(false),

  /**
   * 
   */
  @Filterable
  ExperimentId(true),

  /**
   * The size of the media file in bytes.
   */
  FileSize(false),

  /**
   * The headline of the ad
   */
  @Filterable
  Headline(true),

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
   * To associate an existing {@link Label} to an existing {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel} with ADD operator.
   * To remove an associated {@link Label} from the {@link AdGroupAd}, use {@link AdGroupAdService#mutateLabel} with REMOVE operator.
   * To filter on {@link Label}s, use one of {@link Predicate.Operator#CONTAINS_ALL}, {@link Predicate.Operator#CONTAINS_ANY}, {@link Predicate.Operator#CONTAINS_NONE} operators with a list of {@link Label} ids.
   */
  @Filterable
  Labels(true),

  /**
   * ID of this media object.
   */
  MediaId(false),

  /**
   * The mime type of the media.
   */
  MimeType(false),

  /**
   * The business name of the mobile ad.
   * Must not exceed 20 characters (except for ads targeted to Japan, which must not exceed 10 Japanese characters).
   */
  MobileAdBusinessName(false),

  /**
   * The country code for the phone number in the click-to-call mobile ad.
   * The click-to-call ad will display only in this country.
   * This field will be used to verify the phone number format and validate the targeted mobile carriers.
   */
  MobileAdCountryCode(false),

  /**
   * The description line.
   */
  MobileAdDescription(false),

  /**
   * The headline of the ad.
   */
  MobileAdHeadline(false),

  /**
   * The list of markup languages to use for the mobile ad.
   */
  MobileAdMarkupLanguages(false),

  /**
   * The list of mobile carriers to use for the mobile ad.
   * Each string must be of the form 'CarrierName@CountryCode'.
   * To specify that all available carriers are to be used, use the reserved keyword 'ALLCARRIERS'.
   * See <a href="/adwords/api/docs/appendix/mobilecarriers">available mobile carriers</a>.
   */
  MobileAdMobileCarriers(false),

  /**
   * The click-to-call phone number.
   * Must not exceed 20 characters.
   */
  MobileAdPhoneNumber(false),

  /**
   * The list of markup languages to use for the mobile ad.
   */
  MobileImageAdMarkupLanguages(false),

  /**
   * The list of mobile carriers to use for the mobile ad.
   * Each string must be of the form 'CarrierName@CountryCode'.
   * To specify that all available carriers are to be used, use the reserved keyword 'ALLCARRIERS'.
   * See <a href="/adwords/api/docs/appendix/mobilecarriers">available mobile carriers</a>.
   */
  MobileImageAdMobileCarriers(false),

  /**
   * Name of the ad.
   */
  Name(false),

  /**
   * Promotional line for this ad.
   * This text will be displayed in addition to the products.
   */
  @Filterable
  PromotionLine(true),

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
   */
  RichMediaAdName(false),

  /**
   * Snippet for this ad.
   * Required for standard third-party ads.
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
   * The URL of where the original media was downloaded from (or a file name).
   */
  SourceUrl(false),

  /**
   * The status of the ad.
   */
  @Filterable
  Status(true),

  /**
   * The streaming URL of the audio.
   */
  StreamingUrl(false),

  /**
   * Duration of this ad (if it contains playable media).
   */
  TemplateAdDuration(false),

  /**
   * Name of this ad.
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

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
