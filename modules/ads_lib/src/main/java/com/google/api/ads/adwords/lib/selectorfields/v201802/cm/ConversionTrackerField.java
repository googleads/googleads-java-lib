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
 * A {@code Enum} to facilitate the selection of fields for {@code ConversionTracker}.
 */
public enum ConversionTrackerField implements EntityField {

  // Fields constants definitions

  /**
   * Controls whether conversion event values and currency codes are taken from the tag snippet or from {@code ConversionTracker#defaultRevenueValue} and {@code ConversionTracker#defaultRevenueCurrencyCode}.
   * If alwaysUseDefaultRevenueValue is true, then conversion events will always use defaultRevenueValue and defaultRevenueCurrencyCode, even if the tag has supplied a value and/or code when reporting the conversion event.
   * If alwaysUseDefaultRevenueValue is false, then defaultRevenueValue and defaultRevenueCurrencyCode are only used if the tag does not supply a value, or the tag's value is unparseable.
   */
  @Filterable
  AlwaysUseDefaultRevenueValue(true),

  /**
   * App ID of the app conversion tracker.
   * This field is required for certain conversion types, in particular, Android app install (first open) and Android app install (from Google Play).
   */
  @Filterable
  AppId(true),

  /**
   * App platform of the app conversion tracker.
   * This field defaults to NONE.
   * Once it is set to a value other than NONE it cannot be changed again.
   * It must be set at the same time as AppConversionType.
   */
  @Filterable
  AppPlatform(true),

  /**
   * The postback URL.
   * When the conversion type specifies a postback url, Google will send information about each conversion event to that url as they happen.
   * Details, including formatting requirements for this field: https://developers.google.com/app-conversion-tracking/docs/app-install-feedback
   */
  @Filterable
  AppPostbackUrl(true),

  /**
   * Attribution models describing how to distribute credit for a particular conversion across potentially many prior interactions.
   * See https://support.google.com/adwords/answer/6259715 for more information about attribution modeling in AdWords.
   */
  AttributionModelType(false),

  /**
   * The category of conversion that is being tracked.
   */
  @Filterable
  Category(true),

  /**
   * The external customer ID of the conversion type owner, or 0 if this is a system-defined conversion type.
   * Only the conversion type owner may edit properties of the conversion type.
   */
  @Filterable
  ConversionTypeOwnerCustomerId(true),

  /**
   * How to count events for this conversion tracker.
   * If countingType is MANY_PER_CLICK, then all conversion events are counted.
   * If countingType is ONE_PER_CLICK, then only the first conversion event of this type following a given click will be counted.
   * More information is available at https://support.google.com/adwords/answer/3438531
   */
  @Filterable
  CountingType(true),

  /**
   * The click-through conversion (ctc) lookback window is the maximum number of days between the time a conversion event happens and the previous corresponding ad click.
   * <p>Conversion events that occur more than this many days after the click are ignored.
   * <p>This field is only editable for Adwords Conversions and Upload Conversions, but has a system defined default for other types of conversions.
   * The allowed range of values for this window depends on the type of conversion and may expand, but 1-90 days is the currently allowed range.
   */
  @Filterable
  CtcLookbackWindow(true),

  /**
   * The status of the data-driven attribution model for the conversion type.
   */
  @Filterable
  DataDrivenModelStatus(true),

  /**
   * The currency code to use when the tag for this conversion tracker sends conversion events without currency codes.
   * This code is applied on the server side, and is applicable to all ConversionTracker subclasses.
   * It must be a valid ISO4217 3-character code, such as USD.
   * <p> This code is used if the code in the tag is not supplied or is unsupported, or if {@code ConversionTracker#alwaysUseDefaultRevenueValue} is set to true.
   * If this default code is not set the currency code of the account is used as the default code.
   * <p> Set the default code to XXX in order to specify that this conversion type does not have units of a currency (that is, it is unitless).
   * In this case no currency conversion will occur even if a currency code is set in the tag.
   */
  @Filterable
  DefaultRevenueCurrencyCode(true),

  /**
   * The value to use when the tag for this conversion tracker sends conversion events without values.
   * This value is applied on the server side, and is applicable to all ConversionTracker subclasses.
   * <p> See also the corresponding {@code ConversionTracker#defaultRevenueCurrencyCode}, and see {@code ConversionTracker#alwaysUseDefaultRevenueValue} for details about when this value is used.
   */
  @Filterable
  DefaultRevenueValue(true),

  /**
   * Whether this conversion tracker should be excluded from the "Conversions" columns in reports.
   * <p> If true, the conversion tracker will not be counted towards Conversions.
   * If false, it will be counted in Conversions.
   * This is the default.</p> Either way, conversions will still be counted in the "AllConversions" columns in reports.
   */
  @Filterable
  ExcludeFromBidding(true),

  /**
   * The event snippet that works with the global site tag to track actions that should be counted as conversions.
   * Returns an empty string if the conversion tracker does not use snippets.
   */
  @Filterable
  GoogleEventSnippet(true),

  /**
   * The global site tag that adds visitors to your basic remarketing lists and sets new cookies on your domain, which will store information about the ad click that brought a user to your website.
   * Returns an empty string if the conversion tracker does not use snippets.
   */
  @Filterable
  GoogleGlobalSiteTag(true),

  /**
   * ID of this conversion tracker, {@code null} when creating a new one.
   * <p>There are some system-defined conversion trackers that are available for all customers to use.
   * See {@code ConversionTrackerService#mutate} for more information about how to modify these types.
   * <ul> <li>179 - Calls from Ads</li> <li>214 - Android Downloads</li> <li>239 - Store Visits</li> </ul>
   */
  @Filterable
  Id(true),

  /**
   * The last time a conversion tag for this conversion type successfully fired and was seen by AdWords.
   * This firing event may not have been the result of an attributable conversion (ex: because the tag was fired from a browser that did not previously click an ad from the appropriate advertiser).
   * <p>This datetime is in <b>UTC</b>, not the advertiser's time zone.</p>
   */
  LastReceivedRequestTime(false),

  /**
   * The date of the most recent ad click that led to a conversion of this conversion type.
   * <p>This date is in the <b>advertiser's defined time zone</b>.</p>
   */
  MostRecentConversionDate(false),

  /**
   * Name of this conversion tracker.
   */
  @Filterable
  Name(true),

  /**
   * The ID of the original conversion type on which this ConversionType is based.
   * This is used to facilitate a connection between an existing shared conversion type (e.g.
   * Calls from ads) and an advertiser-specific conversion type.
   * This may only be specified for ADD operations, and can never be modified once a ConversionType is created.
   */
  @Filterable
  OriginalConversionTypeId(true),

  /**
   * The phone-call duration (in seconds) after which a conversion should be reported for this AdCallMetricsConversion.
   */
  @Filterable
  PhoneCallDuration(true),

  /**
   * Status of this conversion tracker.
   */
  @Filterable
  Status(true),

  /**
   * Tracking code to use for the conversion type.
   */
  @Filterable
  TrackingCodeType(true),

  /**
   * Lookback window for view-through conversions in days.
   * This is the length of time in which a conversion without a click can be attributed to an impression.
   */
  @Filterable
  ViewthroughLookbackWindow(true),

  /**
   * 
   */
  WebsitePhoneCallDuration(false),

  ;

  private final boolean isFilterable;

  private ConversionTrackerField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
