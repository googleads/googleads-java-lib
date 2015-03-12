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
 * A {@code Enum} to facilitate the selection of fields for {@code TargetingIdea}.
 */
public enum TargetingIdeaField implements EntityField {

  // Fields constants definitions

  /**
   * 
   */
  @Filterable
  CriteriaType(true),

  /**
   * Title of this mobile application.
   */
  @Filterable
  DisplayName(true),

  /**
   * ID of this criterion.
   */
  @Filterable
  Id(true),

  /**
   * Match type of this keyword.
   */
  @Filterable
  KeywordMatchType(true),

  /**
   * Text of this keyword (at most 80 characters and ten words).
   */
  @Filterable
  KeywordText(true),

  /**
   * ID of this mobile app category.
   * A complete list of the available mobile app categories is available <a href="/adwords/api/docs/appendix/mobileappcategories">here</a>.
   */
  MobileAppCategoryId(false),

  /**
   * The category to target or exclude.
   * Each subsequent element in the array describes a more specific sub-category.
   * For example, <code>{"Pets &amp; Animals", "Pets", "Dogs"}</code> represents the "Pets &amp; Animals/Pets/Dogs" category.
   * A complete list of available vertical categories is available <a href="/adwords/api/docs/appendix/verticals">here</a> This field is required and must not be empty.
   */
  Path(false),

  /**
   * Url of the placement.
   * <p>For example, "http://www.domain.com".
   */
  @Filterable
  PlacementUrl(true),

  /**
   * Id of this user interest.
   * This is a required field.
   */
  UserInterestId(false),

  /**
   * Name of this user interest.
   */
  UserInterestName(false),

  /**
   * Id of this user list.
   * This is a required field.
   */
  UserListId(false),

  /**
   * 
   */
  @Filterable
  UserListMembershipStatus(true),

  /**
   * 
   */
  UserListName(false),

  /**
   * Id of this vertical.
   */
  VerticalId(false),

  /**
   * Id of the parent of this vertical.
   */
  VerticalParentId(false),

  ;

  private final boolean isFilterable;

  private TargetingIdeaField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
