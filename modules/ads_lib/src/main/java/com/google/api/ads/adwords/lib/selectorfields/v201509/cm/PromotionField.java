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
 * A {@code Enum} to facilitate the selection of fields for {@code Promotion}.
 */
public enum PromotionField implements EntityField {

  // Fields constants definitions

  /**
   * Monthly budget for this promotion.
   */
  Budget(false),

  /**
   * Whether call tracking should be enabled.
   * Default is 'False'.
   */
  CallTrackingEnabled(false),

  /**
   * IDs of the campaigns associated with this promotion.
   */
  CampaignIds(false),

  /**
   * Creatives of this promotion.
   */
  Creatives(false),

  /**
   * Destination URL to be used for this promotion.
   */
  DestinationUrl(false),

  /**
   * Name of this promotion.
   */
  Name(false),

  /**
   * Phone number associated with this promotion.
   */
  PhoneNumber(false),

  /**
   * Text of the product service.
   * <p>Please note that only {@code Operator.EQUALS} is supported.
   */
  @Filterable
  ProductServiceText(true),

  /**
   * Targeting criteria of this promotion.
   * The following criteria are supported: <ul> <li>{@code ProductService}</li> <li>{@code AdSchedule}</li> <li>{@code BusinessHour}</li> <li>{@code Language}</li> <li>{@code Location}</li> <li>{@code Proximity}</li> </ul> <p>Please note that {@code Address} is not supported in {@code Proximity}.
   * Please use {@code GeoPoint} instead.
   */
  PromotionCriteria(false),

  /**
   * ID of this promotion.
   */
  @Filterable
  PromotionId(true),

  /**
   * Remaining budget for the current month.
   */
  RemainingBudget(false),

  /**
   * Status of this promotion.
   */
  @Filterable
  Status(true),

  /**
   * Whether the street address of the business should be visible.
   * Default is 'True'.
   */
  StreetAddressVisible(false),

  ;

  private final boolean isFilterable;

  private PromotionField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
