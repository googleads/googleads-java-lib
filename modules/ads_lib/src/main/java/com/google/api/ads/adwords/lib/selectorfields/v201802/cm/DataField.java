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
 * A {@code Enum} to facilitate the selection of fields for {@code Data}.
 */
public enum DataField implements EntityField {

  // Fields constants definitions

  /**
   * ID of the ad group that contains the criterion with which this bid landscape is associated.
   * Only available for ad group bid landscapes and ad group criterion bid landscapes.
   */
  @Filterable
  AdGroupId(true),

  /**
   * The bid amount used to estimate this landscape point's data.
   * Only available for ad group bid landscapes and ad group criterion bid landscapes.
   */
  @Filterable
  Bid(true),

  /**
   * The bid modifier value of this point.
   * Only available for campaign criterion bid landscapes.
   */
  @Filterable
  BidModifier(true),

  /**
   * Estimated number of biddable conversions.
   * Only available for ad group bid landscapes and ad group criterion bid landscapes.
   */
  @Filterable
  BiddableConversions(true),

  /**
   * Estimated biddable conversions value.
   * Only available for ad group bid landscapes and ad group criterion bid landscapes.
   */
  @Filterable
  BiddableConversionsValue(true),

  /**
   * ID of the campaign that contains the criterion with which this bid landscape is associated.
   */
  @Filterable
  CampaignId(true),

  /**
   * Recommended category for the website domain.
   */
  @Filterable
  Category(true),

  /**
   * The position of this category in the recommended set of categories.
   */
  CategoryRank(false),

  /**
   * Coverage is the number of docs that match a label / number of docs that match the immediate parent label.
   * <p> Example : united states/ca/sfo matches 500 docs and united states/ca matches 1000 docs.
   * The coverage will be 50%.
   */
  Coverage(false),

  /**
   * ID of the criterion associated with this landscape.
   */
  @Filterable
  CriterionId(true),

  /**
   * The domain for the website.
   * Since many different domains can have the same categories, the domain and the language are used to uniquely identify the categories.
   * <p> The domain can be specified in the DynamicSearchAdsSetting required for dynamic search ads.
   */
  @Filterable
  DomainName(true),

  /**
   * Last day on which this landscape is based.
   */
  EndDate(false),

  /**
   * Used to determine whether a category has sub-categories associated with it.
   */
  HasChild(false),

  /**
   * The language for the website.
   * Since many different domains can have the same categories, the domain and the language are used to uniquely identify the categories.
   * <p> The language can be specified in the DynamicSearchAdsSetting required for dynamic search ads.
   */
  IsoLanguage(false),

  /**
   * Only applies to landscapes with {@code landscapeType == DEFAULT}.
   * If true, then this bid landscape contains the set of ad group criteria that <em>currently</em> do not have criterion-level bid overrides.
   * If false, then this bid landscape was derived from an earlier snapshot of ad group criteria, so it may contain criteria to which bid overrides were recently added, and may not contain criteria from which bid overrides were recently removed.
   * For other {@code landscapeType}s null is returned.
   */
  @Filterable
  LandscapeCurrent(true),

  /**
   * 
   */
  @Filterable
  LandscapeType(true),

  /**
   * Estimated number of clicks at this bid.
   * For mobile bid modifier landscapes, this is the estimated number of clicks for mobile only.
   */
  @Filterable
  LocalClicks(true),

  /**
   * Estimated cost at this bid.
   * For mobile bid modifier landscapes, this is the estimated cost for mobile only.
   */
  @Filterable
  LocalCost(true),

  /**
   * Estimated number of impressions at this bid.
   * For mobile bid modifier landscapes, this is the estimated number of impressions for mobile only.
   */
  @Filterable
  LocalImpressions(true),

  /**
   * Estimated number of promoted impressions.
   */
  @Filterable
  PromotedImpressions(true),

  /**
   * The recommended cost per click for the category.
   */
  RecommendedCpc(false),

  /**
   * Required daily budget to achieve the predicted stats at this bid.
   * Only available for campaign criterion bid landscapes.
   */
  @Filterable
  RequiredBudget(true),

  /**
   * First day on which this landscape is based.
   * Typically, it could be up to a week ago.
   */
  StartDate(false),

  /**
   * Estimated total clicks for all devices in mobile bid modifier landscape.
   * Only available for campaign criterion bid landscapes.
   */
  @Filterable
  TotalLocalClicks(true),

  /**
   * Estimated total cost for all devices in mobile bid modifier landscape.
   * Only available for campaign criterion bid landscapes.
   */
  @Filterable
  TotalLocalCost(true),

  /**
   * Estimated total impressions for all devices in mobile bid modifier landscape.
   * Only available for campaign criterion bid landscapes.
   */
  @Filterable
  TotalLocalImpressions(true),

  /**
   * Estimated total promoted impressions for all devices in mobile bid modifier landscape.
   * Only available for campaign criterion bid landscapes.
   */
  @Filterable
  TotalLocalPromotedImpressions(true),

  ;

  private final boolean isFilterable;

  private DataField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
