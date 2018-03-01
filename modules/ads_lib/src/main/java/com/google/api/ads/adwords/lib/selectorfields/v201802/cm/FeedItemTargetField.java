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
 * A {@code Enum} to facilitate the selection of fields for {@code FeedItemTarget}.
 */
public enum FeedItemTargetField implements EntityField {

  // Fields constants definitions

  /**
   * ID of the target ad group.
   */
  @Filterable
  AdGroupId(true),

  /**
   * Name of the target ad group.
   */
  @Filterable
  AdGroupName(true),

  /**
   * ID of the target campaign.
   */
  @Filterable
  CampaignId(true),

  /**
   * Name of the target campaign.
   */
  @Filterable
  CampaignName(true),

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
   * ID of the target feed item's feed.
   */
  @Filterable
  FeedId(true),

  /**
   * ID of the target's feed item.
   */
  @Filterable
  FeedItemId(true),

  /**
   * ID of this criterion.
   */
  @Filterable
  Id(true),

  /**
   * Indicates that the target criterion is negative.
   * Used only for filtering.
   * Use {@code NegativeFeedItemCriterionTarget} to create a negative criterion target.
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
   * Name of the location criterion.
   * <b> Note:</b> This field is filterable only in LocationCriterionService.
   * If used as a filter, a location name cannot be greater than 300 characters.
   */
  LocationName(false),

  /**
   * Name of the target ad group's campaign.
   */
  @Filterable
  ParentCampaignName(true),

  /**
   * Ordered list of parents of the location criterion.
   */
  ParentLocations(false),

  /**
   * 
   */
  @Filterable
  PlatformName(true),

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
   * Status of feed item target.
   */
  @Filterable
  Status(true),

  /**
   * Concrete subtype of FeedItemTarget.
   */
  @Filterable
  TargetType(true),

  /**
   * The targeting status of the location criterion.
   */
  TargetingStatus(false),

  ;

  private final boolean isFilterable;

  private FeedItemTargetField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
