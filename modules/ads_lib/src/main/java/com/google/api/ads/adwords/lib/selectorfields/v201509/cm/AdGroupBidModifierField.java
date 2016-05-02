// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.selectorfields.v201509.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdGroupBidModifier}.
 */
public enum AdGroupBidModifierField implements EntityField {

  // Fields constants definitions

  /**
   * The adgroup that the bid modifier override is in.
   */
  @Filterable
  AdGroupId(true),

  /**
   * The modifier for bids when the criterion matches.
   * Valid modifier values for the mobile platform criterion range from {@code 0.1} to {@code 4.0}, with {@code 0} reserved for opting out of mobile.
   */
  @Filterable
  BidModifier(true),

  /**
   * Bid modifier source.
   */
  @Filterable
  BidModifierSource(true),

  /**
   * The campaign that the criterion is in.
   */
  @Filterable
  CampaignId(true),

  /**
   * 
   */
  @Filterable
  CriteriaType(true),

  /**
   * ID of this criterion.
   */
  @Filterable
  Id(true),

  /**
   * 
   */
  @Filterable
  PlatformName(true),

  ;

  private final boolean isFilterable;

  private AdGroupBidModifierField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
