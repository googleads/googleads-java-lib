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
 * A {@code Enum} to facilitate the selection of fields for {@code CampaignGroupPerformanceTarget}.
 */
public enum CampaignGroupPerformanceTargetField implements EntityField {

  // Fields constants definitions

  /**
   * Id of the campaign group that this performance target is for.
   */
  @Filterable
  CampaignGroupId(true),

  /**
   * This property specifies desired outcomes for some clicks, conversions or impressions statistic for the given time period.
   * It's usually a constraint on the volume goal of the performance target, usually in terms of spending.
   * <p>Only specific efficiency target types are allowed for a volume goal type.
   * The following mapping explicitly specifies all allowed combinations.
   * Volume Goal Type : List of Efficiency Target Types MAXIMIZE_CLICKS : CPC_LESS_THAN_OR_EQUAL_TO MAXIMIZE_CONVERSIONS : CPA_LESS_THAN_OR_EQUAL_TO
   */
  @Filterable
  EfficiencyTargetType(true),

  /**
   * The numerical value that goes along with the expression specified by the efficiency target type.
   */
  @Filterable
  EfficiencyTargetValue(true),

  /**
   * The end date for the performance target.
   */
  @Filterable
  EndDate(true),

  /**
   * The forecast status specifies how well the campaigns of a performance targets are doing or have done in the past in relation to the targets set on the performance target.
   */
  @Filterable
  ForecastStatus(true),

  /**
   * Specifies whether this performance target has promoted suggestions associated with it.
   */
  @Filterable
  HasPromotedSuggestions(true),

  /**
   * Id of this campaign group performance target.
   */
  @Filterable
  Id(true),

  /**
   * A numerical value specifying just how much money the advertiser is willing to spend during the time period of this performance target.
   * This does not affect serving.
   * The spend target is always in micros of the customer's currency.
   */
  @Filterable
  SpendTarget(true),

  /**
   * 
   */
  @Filterable
  SpendTargetType(true),

  /**
   * The start date for the performance target.
   */
  @Filterable
  StartDate(true),

  /**
   * The volume goal of the performance target.
   * This property defines the way stats data will be reported for the time period specified.
   */
  @Filterable
  VolumeGoalType(true),

  /**
   * The value of the volume target.
   * This corresponds directly to the volume_goal_type property and defines a target that the advertiser intends to reach during the time the performance target is active.
   * As an example, if the volume_goal is MAXIMIZE_CONVERSIONS and the volume target is 3000, then the advertiser intends to reach at least 3000 conversions between start and end dates of the performance target.
   */
  @Filterable
  VolumeTargetValue(true),

  ;

  private final boolean isFilterable;

  private CampaignGroupPerformanceTargetField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
