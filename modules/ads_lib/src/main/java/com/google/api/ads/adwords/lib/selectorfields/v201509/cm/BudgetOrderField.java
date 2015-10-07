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

package com.google.api.ads.adwords.lib.selectorfields.v201509.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code BudgetOrder}.
 */
public enum BudgetOrderField implements EntityField {

  // Fields constants definitions

  /**
   * This must be passed as a string with dashes, e.g.
   * "1234-5678-9012-3456".
   */
  @Filterable
  BillingAccountId(true),

  /**
   * Enables user to specify meaningful name for a billing account to aid in reconciling monthly invoices.
   * This name will be printed in the monthly invoices.
   * <span class="constraint Billing">This element only applies if manager account is whitelisted for new billing backend.</span>
   */
  @Filterable
  BillingAccountName(true),

  /**
   * Enables user to specify meaningful name for referencing this budget order.
   * A default name will be provided if none is specified.
   * This name will be printed in the monthly invoices.
   * <span class="constraint Billing">This element only applies if manager account is whitelisted for new billing backend.</span>
   */
  @Filterable
  BudgetOrderName(true),

  /**
   * EndDateTime must be on or before "20361231 235959 America/Los_Angeles" or must set the same instant as "20371230 235959 America/Los_Angeles" to indicate infinite end date.
   * StartDateTime and EndDateTime must use the same time zone.
   */
  @Filterable
  EndDateTime(true),

  /**
   * 
   */
  @Filterable
  Id(true),

  /**
   * Contains fields that provide information on the last set of values that were passed in through the parent BudgetOrder for mutate.add and mutate.set.
   * <span class="constraint Billing">This element only applies if manager account is whitelisted for new billing backend.</span>
   */
  LastRequest(false),

  /**
   * Enables user to enter a value that helps them reference this budget order in their monthly invoices.
   * This number will be printed in the monthly invoices.
   * <span class="constraint Billing">This element only applies if manager account is whitelisted for new billing backend.</span>
   */
  @Filterable
  PoNumber(true),

  /**
   * A 12 digit billing ID assigned to the user by Google.
   * This must be passed in as a string with dashes, e.g.
   * "1234-5678-9012".
   * For mutate.add, this field is required if billingAccountId is not specified.
   * <span class="constraint Billing">This element only applies if manager account is whitelisted for new billing backend.</span>
   */
  @Filterable
  PrimaryBillingId(true),

  /**
   * For certain users, a secondary billing ID will be required on mutate.add.
   * If this requirement was not communicated to the user, the user may ignore this parameter.
   * If specified, this must be passed in as a string with dashes, e.g.
   * "1234-5678-9012".
   * <span class="constraint Billing">This element only applies if manager account is whitelisted for new billing backend.</span>
   */
  @Filterable
  SecondaryBillingId(true),

  /**
   * To specify an unlimited budget, set spendingLimit to -1 (in micros), otherwise spendingLimit must be greater than 0.
   */
  @Filterable
  SpendingLimit(true),

  /**
   * StartDateTime cannot be in the past, it must be on or before "20361231 235959 America/Los_Angeles".
   * StartDateTime and EndDateTime must use the same time zone.
   */
  @Filterable
  StartDateTime(true),

  ;

  private final boolean isFilterable;

  private BudgetOrderField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
