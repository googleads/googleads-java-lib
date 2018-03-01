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
 * A {@code Enum} to facilitate the selection of fields for {@code CampaignBidModifier}.
 */
public enum CampaignBidModifierField implements EntityField {

  // Fields constants definitions

  /**
   * The advertising channel type of the campaign the criterion is in.
   */
  @Filterable
  AdvertisingChannelType(true),

  /**
   * The bid modifier for bids when the criterion matches.
   * <p>Valid modifier values range from {@code 0.1} to {@code 10.0}.
   */
  @Filterable
  BidModifier(true),

  /**
   * The campaign that the criterion is in.
   */
  @Filterable
  CampaignId(true),

  /**
   * The name of the campaign the criterion is in.
   */
  @Filterable
  CampaignName(true),

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

  ;

  private final boolean isFilterable;

  private CampaignBidModifierField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
