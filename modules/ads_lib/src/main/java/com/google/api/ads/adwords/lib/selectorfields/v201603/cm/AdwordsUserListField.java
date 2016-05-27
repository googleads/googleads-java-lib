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

package com.google.api.ads.adwords.lib.selectorfields.v201603.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code AdwordsUserList}.
 */
public enum AdwordsUserListField implements EntityField {

  // Fields constants definitions

  /**
   * Indicates the reason this account has been granted access to the list.
   * The reason can be Shared, Owned, Licensed or Subscribed.
   */
  @Filterable
  AccessReason(true),

  /**
   * Indicates if this share is still active.
   * When a UserList is shared with the user this field is set to Active.
   * Later the userList owner can decide to revoke the share and make it Inactive.
   * The default value of this field is set to Active.
   */
  @Filterable
  AccountUserListStatus(true),

  /**
   * Conversion types associated with this user list.
   */
  ConversionTypes(false),

  /**
   * End date of users visit.
   * If set to <code>20371230</code>, then includes all users after <code>startDate</code>.
   * The date's format should be YYYYMMDD.
   * This field is selected by default.
   */
  DateSpecificListEndDate(false),

  /**
   * Boolean rule that defines visitor of a page.
   * This field is selected by default.
   */
  DateSpecificListRule(false),

  /**
   * Start date of users visit.
   * If set to <code>20000101</code>, then includes all users before <code>endDate</code>.
   * The date's format should be YYYYMMDD.
   * This field is selected by default.
   */
  DateSpecificListStartDate(false),

  /**
   * Description of this user list.
   */
  Description(false),

  /**
   * Boolean rule that defines this user list.
   * The rule consists of a list of rule item groups.
   * All the rule item groups are ORed for the evaluation.
   * This field is selected by default.
   */
  ExpressionListRule(false),

  /**
   * Id of this user list.
   */
  @Filterable
  Id(true),

  /**
   * An Id from external system.
   * It is used by user list sellers to correlate ids on their systems.
   */
  @Filterable
  IntegrationCode(true),

  /**
   * A flag that indicates this user list is eligible for Display Network.
   */
  @Filterable
  IsEligibleForDisplay(true),

  /**
   * A flag that indicates this user list is eligible for Google Search Network.
   */
  @Filterable
  IsEligibleForSearch(true),

  /**
   * A flag that indicates if a user may edit a list.
   * Depends on the list ownership and list type.
   * For example, external remarketing user lists are not editable.
   */
  IsReadOnly(false),

  /**
   * Type of this list: remarketing/logical/external remarketing.
   */
  @Filterable
  ListType(true),

  /**
   * Number of days a user's cookie stays on your list since its most recent addition to the list.
   * This field must be between 0 and 540 inclusive.
   * However, for CRM based userlists, this field can be set to 10000 which means no expiration.
   */
  @Filterable
  MembershipLifeSpan(true),

  /**
   * Name of this user list.
   * Depending on its AccessReason, the user list name may not be unique (e.g.
   * if {@code AccessReason=SHARED}).
   */
  @Filterable
  Name(true),

  /**
   * Logical list rules that define this user list.
   * The rules are defined as logical operator (ALL/ANY/NONE) and a list of user lists.
   * All the rules are anded for the evaluation.
   */
  Rules(false),

  /**
   * Estimated number of users in this seed user list.
   * This value is null if the number of users has not yet been determined.
   */
  @Filterable
  SeedListSize(true),

  /**
   * Description of this seed user list.
   */
  SeedUserListDescription(false),

  /**
   * Seed UserListId from which this list is derived.
   */
  @Filterable
  SeedUserListId(true),

  /**
   * Name of the seed user list.
   */
  SeedUserListName(false),

  /**
   * Membership status of this seed user list.
   */
  SeedUserListStatus(false),

  /**
   * Estimated number of users in this user list, on the Google Display Network.
   * This value is null if the number of users has not yet been determined.
   */
  @Filterable
  Size(true),

  /**
   * Estimated number of users in this user list in the google.com domain.
   * These are the users available for targeting in search campaigns.
   * This value is null if the number of users has not yet been determined.
   */
  @Filterable
  SizeForSearch(true),

  /**
   * Size range in terms of number of users of the UserList.
   */
  SizeRange(false),

  /**
   * Size range in terms of number of users of the UserList, for Search ads.
   */
  SizeRangeForSearch(false),

  /**
   * Membership status of this user list.
   * Indicates whether a user list is open or active.
   * Only open user lists can accumulate more users and can be targeted to.
   */
  @Filterable
  Status(true),

  ;

  private final boolean isFilterable;

  private AdwordsUserListField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
