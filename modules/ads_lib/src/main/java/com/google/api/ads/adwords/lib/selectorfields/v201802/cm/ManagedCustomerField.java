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
 * A {@code Enum} to facilitate the selection of fields for {@code ManagedCustomer}.
 */
public enum ManagedCustomerField implements EntityField {

  // Fields constants definitions

  /**
   * The list of account labels associated with this customer.
   * Only labels owned by the requesting manager will be returned.
   * To change the list of labels applied to this customer, see {@code ManagedCustomerService#mutateLabels}.
   */
  @Filterable
  AccountLabels(true),

  /**
   * Whether this account can manage clients.
   * <span class="constraint ReadOnly">This field is read only and will be ignored when sent to the API.</span>
   */
  @Filterable
  CanManageClients(true),

  /**
   * The currency in which this account operates.
   * We support a subset of the currency codes derived from the ISO 4217 standard.
   * See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes" >Currency Codes</a> for the currently supported currencies.
   */
  @Filterable
  CurrencyCode(true),

  /**
   * The 10-digit ID that uniquely identifies the AdWords account.
   */
  @Filterable
  CustomerId(true),

  /**
   * The local timezone ID for this customer.
   * See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones" >Time Zone Codes</a> for the currently supported list.
   */
  @Filterable
  DateTimeZone(true),

  /**
   * ID of the label.
   * <p>This field is selectable/filterable in AccountLabelService.
   * To select labels or filter by label ID in {@code ManagedCustomerService#get}, use the {@code AccountLabels} field instead.
   */
  @Filterable
  LabelId(true),

  /**
   * Name of the label.
   * <p>This field is selectable in AccountLabelService.
   * To select labels in {@code ManagedCustomerService#get}, use the {@code AccountLabels} field instead.
   */
  LabelName(false),

  /**
   * The name used by the manager to refer to the client.
   */
  @Filterable
  Name(true),

  /**
   * Whether this managed customer's account is a test account.
   */
  TestAccount(false),

  ;

  private final boolean isFilterable;

  private ManagedCustomerField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
