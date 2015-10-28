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

package com.google.api.ads.adwords.lib.selectorfields.v201502.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code ConversionTracker}.
 */
public enum ConversionTrackerField implements EntityField {

  // Fields constants definitions

  /**
   * Controls whether conversion event values and currency codes are taken from the tag snippet or from {@link ConversionTracker#defaultRevenueValue} and {@link ConversionTracker#defaultRevenueCurrencyCode}.
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
   * Background color for the site stats logo as a hex triplet (e.g.
   * "99ccff").
   */
  @Filterable
  BackgroundColor(true),

  /**
   * The category of conversion that is being tracked.
   */
  @Filterable
  Category(true),

  /**
   * Language used on the conversion page.
   */
  @Filterable
  ConversionPageLanguage(true),

  /**
   * The external customer ID of the conversion type owner, or 0 if this is a system-defined conversion type.
   * Only the conversion type owner may edit properties of the conversion type.
   */
  @Filterable
  ConversionTypeOwnerCustomerId(true),

  /**
   * 
   */
  @Filterable
  ConversionValue(true),

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
   * The allowed range of values for this window depends on the type of conversion and may expand, but 7-90 days is the currently-allowed range.
   */
  @Filterable
  CtcLookbackWindow(true),

  /**
   * The currency code to use when the tag for this conversion tracker sends conversion events without currency codes.
   * This code is applied on the server side, and is applicable to all ConversionTracker subclasses.
   * It must be a valid ISO4217 3-character code, such as USD.
   * <p> This code is used if the code in the tag is not supplied or is unsupported, or if {@link ConversionTracker#alwaysUseDefaultRevenueValue} is set to true.
   * If this default code is not set the currency code of the account is used as the default code.
   * <p> Set the default code to XXX in order to specify that this conversion type does not have units of a currency (that is, it is unitless).
   * In this case no currency conversion will occur even if a currency code is set in the tag.
   */
  @Filterable
  DefaultRevenueCurrencyCode(true),

  /**
   * The value to use when the tag for this conversion tracker sends conversion events without values.
   * This value is applied on the server side, and is applicable to all ConversionTracker subclasses.
   * <p> See also the corresponding {@link ConversionTracker#defaultRevenueCurrencyCode}, and see {@link ConversionTracker#alwaysUseDefaultRevenueValue} for details about when this value is used.
   */
  @Filterable
  DefaultRevenueValue(true),

  /**
   * Whether this conversion tracker should be excluded from the "Conv (opt.)" columns in reports.
   * <p> If true, the conversion tracker will not be counted towards Conv (opt.).
   * If false, it will be counted in Conv (opt.).
   * This is the default.
   * </p> Either way, conversions will still be counted in the "Conversions" columns in reports.
   */
  @Filterable
  ExcludeFromBidding(true),

  /**
   * ID of this conversion tracker, {@code null} when creating a new one.
   * <p>There are some system-defined conversion trackers that are available for all customers to use.
   * See {@link ConversionTrackerService#mutate} for more information about how to modify these types.
   * <ul> <li>179 - Calls from Ads</li> <li>214 - Android Downloads</li> <li>239 - Store Visits</li> </ul>
   */
  @Filterable
  Id(true),

  /**
   * Indicates whether to turn on charging for product ads.
   */
  @Filterable
  IsProductAdsChargeable(true),

  /**
   * Markup language for the snippet.
   */
  @Filterable
  MarkupLanguage(true),

  /**
   * 
   */
  @Filterable
  MostRecentConversionDate(true),

  /**
   * Name of this conversion tracker.
   */
  @Filterable
  Name(true),

  /**
   * 
   */
  @Filterable
  NumConversionEvents(true),

  /**
   * The number of converted clicks, a.k.a.
   * 1-per-click conversions.
   */
  @Filterable
  NumConvertedClicks(true),

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
   * Lookback window, in days, for whether product ads can be charged or not.
   */
  @Filterable
  ProductAdsChargeableConversionWindow(true),

  /**
   * Status of this conversion tracker.
   */
  @Filterable
  Status(true),

  /**
   * Text format for the site stats logo.
   */
  @Filterable
  TextFormat(true),

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
