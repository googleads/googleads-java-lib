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

package com.google.api.ads.adwords.lib.selectorfields.v201406.cm;

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
   * Value of the product operand to comapare against
   */
  Argument(false),

  /**
   * The modifier for bids when the criterion matches.
   * Allowable modifier values depend on the criterion: <ul> <li>{@code 0.1} - {@code 10.0}: {@linkplain AdSchedule}</li> <li>{@code 0.1} - {@code 10.0}: {@linkplain Location}</li> <li>{@code 0.1} - {@code 4.0}: {@linkplain Platform} (mobile), {@code 0}: to opt out of mobile</li> </ul> Specify {@code -1.0} to clear existing bid modifier.
   */
  @Filterable
  BidModifier(true),

  /**
   * The campaign that the criterion is in.
   */
  @Filterable
  CampaignId(true),

  /**
   * 
   */
  CarrierCountryCode(false),

  /**
   * 
   */
  CarrierName(false),

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
   * Only following values are allowed as Operand : <ul><li>id</li> <li>product_type</li> <li>brand</li> <li>adwords_grouping</li> <li>condition</li> <li>adwords_labels</li></ul>
   */
  Operand(false),

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
   * Ordered list of parents of the location criterion.
   */
  ParentLocations(false),

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
  PlatformName(false),

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
   * Product criteria parameter
   */
  Text(false),

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

  ;

  private final boolean isFilterable;

  private CampaignCriterionField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
