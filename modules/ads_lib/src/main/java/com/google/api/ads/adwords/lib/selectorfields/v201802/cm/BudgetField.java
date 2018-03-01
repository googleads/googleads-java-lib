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
 * A {@code Enum} to facilitate the selection of fields for {@code Budget}.
 */
public enum BudgetField implements EntityField {

  // Fields constants definitions

  /**
   * Amount of budget in the local currency for the account.
   * This value represents an average daily budget amount; the actual daily costs might vary.
   * See <a href="https://support.google.com/adwords/answer/1704443">Charges and your daily budget</a>.
   */
  @Filterable
  Amount(true),

  /**
   * A Budget is created using the BudgetService ADD operation and is assigned a BudgetId.
   * The BudgetId is used when modifying the Budget with BudgetService, or associating the Budget to a Campaign with CampaignService.
   * A BudgetId can be shared across different campaigns--the system will then allocate the Budget among the Campaigns to get the optimum result.
   */
  @Filterable
  BudgetId(true),

  /**
   * Name of the Budget.
   * When creating a Budget through BudgetService, every explicitly shared Budget must have a non-null non-empty name.
   * In addition, all explicitly shared Budget names owned by an account must be distinct.
   * Budgets that are not explicitly shared derive their name from the attached Campaign's name.
   */
  @Filterable
  BudgetName(true),

  /**
   * Number of campaigns actively using this budget.
   * This field is only populated for Get operations.
   */
  @Filterable
  BudgetReferenceCount(true),

  /**
   * 
   */
  @Filterable
  BudgetStatus(true),

  /**
   * Delivery method for the Budget which determines the rate at which the Budget is spent.
   * Defaults to STANDARD and can be changed through BudgetService ADD or SET operations.
   */
  DeliveryMethod(false),

  /**
   * If true, this budget was created with the purpose of sharing this budget across one or more campaigns.
   * <p>If false, this budget was created with the intention to be dedicatedly used with a single campaign, and the Budget's name and status will stay in the sync with the associated Campaign's name and status.
   * Attempting to share this budget with a second Campaign will result in an error.</p>
   */
  @Filterable
  IsBudgetExplicitlyShared(true),

  ;

  private final boolean isFilterable;

  private BudgetField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
