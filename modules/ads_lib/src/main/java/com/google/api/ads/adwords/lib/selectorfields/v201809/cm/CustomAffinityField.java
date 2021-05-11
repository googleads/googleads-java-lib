// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.selectorfields.v201809.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code CustomAffinity}.
 */
public enum CustomAffinityField implements EntityField {

  // Fields constants definitions

  /**
   * The ID of the custom affinity.
   */
  @Filterable
  CustomAffinityId(true),

  /**
   * The description of this custom affinity audience.
   */
  @Filterable
  Description(true),

  /**
   * The name of this custom affinity.
   * It should be unique across the same custom affinity audience.
   */
  @Filterable
  Name(true),

  /**
   * Status of custom affinity, ENABLED or REMOVED.
   */
  @Filterable
  Status(true),

  /**
   * List of custom affinity tokens that this custom affinity is composed of.
   * Tokens can be added during CustomAffinity creation.
   * Later they can be added or removed using mutateToken method.
   * This field is returned by the {@code CustomAffinityService#get} method without the need to select.
   */
  Tokens(false),

  /**
   * The type of this custom affinity, CUSTOM_AFFINITY or CUSTOM_INTENT.
   * By default the type is set to CUSTOM_AFFINITY.
   */
  @Filterable
  Type(true),

  ;

  private final boolean isFilterable;

  private CustomAffinityField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
