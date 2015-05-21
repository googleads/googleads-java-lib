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
 * A {@code Enum} to facilitate the selection of fields for {@code Data}.
 */
public enum DataField implements EntityField {

  // Fields constants definitions

  /**
   * ID of the ad group that contains the criterion with which this bid landscape is associated.
   */
  @Filterable
  AdGroupId(true),

  /**
   * The bid amount used to estimate this landscape point's data.
   */
  @Filterable
  Bid(true),

  /**
   * 
   */
  @Filterable
  CampaignId(true),

  /**
   * Recommended category for the website domain.
   */
  @Filterable
  Category(true),

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
   * The language for the website.
   * Since many different domains can have the same categories, the domain and the language are used to uniquely identify the categories.
   * <p> The language can be specified in the DynamicSearchAdsSetting required for dynamic search ads.
   */
  IsoLanguage(false),

  /**
   * 
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
   */
  @Filterable
  LocalClicks(true),

  /**
   * Estimated cost at this bid.
   */
  @Filterable
  LocalCost(true),

  /**
   * Estimated number of impressions at this bid.
   */
  @Filterable
  LocalImpressions(true),

  /**
   * Estimated number of promoted impressions.
   */
  @Filterable
  PromotedImpressions(true),

  /**
   * First day on which this landscape is based.
   * Typically, it could be up to a week ago.
   */
  StartDate(false),

  ;

  private final boolean isFilterable;

  private DataField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
