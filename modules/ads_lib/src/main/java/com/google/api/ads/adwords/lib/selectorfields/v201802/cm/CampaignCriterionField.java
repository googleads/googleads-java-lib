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
 * A {@code Enum} to facilitate the selection of fields for {@code CampaignCriterion}.
 */
public enum CampaignCriterionField implements EntityField {

  // Fields constants definitions

  /**
   * Full address; <code>null</code> if unknonwn.
   */
  Address(false),

  /**
   * 
   */
  AgeRangeType(false),

  /**
   * A string that uniquely identifies a mobile application to AdWords API.
   * The format of this string is "<code>{platform}-{platform_native_id}</code>", where <code>platform</code> is "1" for iOS apps and "2" for Android apps, and where <code>platform_native_id</code> is the mobile application identifier native to the corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the end of an App Store URL (e.g., "476943146" for "Flood-It! 2" whose App Store link is http://itunes.apple.com/us/app/flood-it!-2/id476943146).
   * For Android, this native identifier is the application's package name (e.g., "com.labpixies.colordrips" for "Color Drips" given Google Play link https://play.google.com/store/apps/details?id=com.labpixies.colordrips).
   * A well formed app id for AdWords API would thus be "1-476943146" for iOS and "2-com.labpixies.colordrips" for Android.
   */
  @Filterable
  AppId(true),

  /**
   * ID of the base campaign from which this draft/trial campaign criterion was created.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseCampaignId(true),

  /**
   * The modifier for bids when the criterion matches.
   * <p>Valid modifier values range from {@code 0.1} to {@code 10.0}, with {@code 0.0} reserved for opting out of platform criterion.
   * <p>To clear an existing bid modifier, specify {@code -1.0} (invalid for initial {@code ADD} operations).
   */
  @Filterable
  BidModifier(true),

  /**
   * The status for criteria.
   */
  @Filterable
  CampaignCriterionStatus(true),

  /**
   * The campaign that the criterion is in.
   */
  @Filterable
  CampaignId(true),

  /**
   * Country code of the carrier.
   * Can be {@code null} if not applicable, e.g., for Carrier "Wifi".
   */
  CarrierCountryCode(false),

  /**
   * Name of the carrier.
   */
  CarrierName(false),

  /**
   * The YouTube uploader channel id or the channel code of a YouTube content channel.
   * <p>The uploader channel id can be obtained from the YouTube id-based URL.
   * For example, in <code>https://www.youtube.com/channel/UCEN58iXQg82TXgsDCjWqIkg</code> the channel id is <code>UCEN58iXQg82TXgsDCjWqIkg</code> <p>For more information see: https://support.google.com/youtube/answer/6180214
   */
  ChannelId(false),

  /**
   * The public name for a YouTube user channel.
   */
  ChannelName(false),

  /**
   * Content label type
   */
  @Filterable
  ContentLabelType(true),

  /**
   * 
   */
  @Filterable
  CriteriaType(true),

  /**
   * Day of the week the schedule applies to.
   */
  DayOfWeek(false),

  /**
   * 
   */
  DeviceName(false),

  /**
   * 
   */
  DeviceType(false),

  /**
   * 
   */
  Dimensions(false),

  /**
   * Title of this mobile application.
   */
  @Filterable
  DisplayName(true),

  /**
   * Display type of the location criterion.
   */
  DisplayType(false),

  /**
   * Ending hour in 24 hour time; <code>24</code> signifies end of the day.
   */
  EndHour(false),

  /**
   * Interval ends these minutes after the ending hour.
   * The value can be 0, 15, 30, and 45.
   */
  EndMinute(false),

  /**
   * Feed to be used for targeting around locations.
   * This is required for distance targets.
   */
  FeedId(false),

  /**
   * 
   */
  GenderType(false),

  /**
   * Latitude and longitude.
   */
  GeoPoint(false),

  /**
   * ID of this criterion.
   */
  @Filterable
  Id(true),

  /**
   * 
   */
  IncomeRangeType(false),

  /**
   * 
   */
  @Filterable
  IpAddress(true),

  /**
   * 
   */
  @Filterable
  IsNegative(true),

  /**
   * Match type of this keyword.
   */
  @Filterable
  KeywordMatchType(true),

  /**
   * Text of this keyword (at most 80 characters and ten words).
   */
  @Filterable
  KeywordText(true),

  /**
   * 
   */
  LanguageCode(false),

  /**
   * 
   */
  LanguageName(false),

  /**
   * Name of the location criterion.
   * <b> Note:</b> This field is filterable only in LocationCriterionService.
   * If used as a filter, a location name cannot be greater than 300 characters.
   */
  @Filterable
  LocationName(true),

  /**
   * 
   */
  ManufacturerName(false),

  /**
   * Matching function to filter out locations targeted by the criteria.
   * This allows advertisers to target based on the semantics of the location.
   */
  MatchingFunction(false),

  /**
   * ID of this mobile app category.
   * A complete list of the available mobile app categories is available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
   */
  MobileAppCategoryId(false),

  /**
   * 
   */
  OperatingSystemName(false),

  /**
   * The operator type.
   */
  OperatorType(false),

  /**
   * The OS Major Version number.
   */
  OsMajorVersion(false),

  /**
   * The OS Minor Version number.
   */
  OsMinorVersion(false),

  /**
   * The webpage criterion parameter.
   */
  Parameter(false),

  /**
   * Ordered list of parents of the location criterion.
   */
  ParentLocations(false),

  /**
   * 
   */
  ParentType(false),

  /**
   * The category to target or exclude.
   * Each subsequent element in the array describes a more specific sub-category.
   * For example, <code>{"Pets &amp; Animals", "Pets", "Dogs"}</code> represents the "Pets &amp; Animals/Pets/Dogs" category.
   * A complete list of available vertical categories is available <a href="/adwords/api/docs/appendix/verticals">here</a> This field is required and must not be empty.
   */
  Path(false),

  /**
   * Url of the placement.
   * <p>For example, "http://www.domain.com".
   */
  @Filterable
  PlacementUrl(true),

  /**
   * 
   */
  @Filterable
  PlatformName(true),

  /**
   * Radius distance units.
   */
  RadiusDistanceUnits(false),

  /**
   * Radius expressed in distance units.
   */
  RadiusInUnits(false),

  /**
   * Starting hour in 24 hour time.
   */
  StartHour(false),

  /**
   * Interval starts these minutes after the starting hour.
   * The value can be 0, 15, 30, and 45.
   */
  StartMinute(false),

  /**
   * The targeting status of the location criterion.
   */
  TargetingStatus(false),

  /**
   * Id of this user interest.
   * This is a required field.
   */
  UserInterestId(false),

  /**
   * Name of this user interest.
   */
  UserInterestName(false),

  /**
   * Parent Id of this user interest.
   */
  UserInterestParentId(false),

  /**
   * Determines whether a user list is eligible for targeting in the display network.
   */
  @Filterable
  UserListEligibleForDisplay(true),

  /**
   * Determines whether a user list is eligible for targeting in the google.com (search) network.
   */
  @Filterable
  UserListEligibleForSearch(true),

  /**
   * Id of this user list.
   * This is a required field.
   */
  UserListId(false),

  /**
   * 
   */
  @Filterable
  UserListMembershipStatus(true),

  /**
   * 
   */
  UserListName(false),

  /**
   * Id of this vertical.
   */
  VerticalId(false),

  /**
   * Id of the parent of this vertical.
   */
  VerticalParentId(false),

  /**
   * YouTube video id as it appears on the YouTube watch page.
   */
  VideoId(false),

  /**
   * Name of the video.
   */
  VideoName(false),

  ;

  private final boolean isFilterable;

  private CampaignCriterionField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
