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
 * A {@code Enum} to facilitate the selection of fields for {@code ExpressBusiness}.
 */
public enum ExpressBusinessField implements EntityField {

  // Fields constants definitions

  /**
   * The structured address.
   */
  Address(false),

  /**
   * The lat/lng of the address of this business.
   * It will be derived by geocoding the specified address.
   */
  GeoPoint(false),

  /**
   * ID of this business.
   */
  @Filterable
  Id(true),

  /**
   * Name of this business.
   */
  @Filterable
  Name(true),

  /**
   * Phone number of this business.
   */
  PhoneNumber(false),

  /**
   * Status of this business.
   */
  @Filterable
  Status(true),

  /**
   * Website of this business.
   */
  @Filterable
  Website(true),

  ;

  private final boolean isFilterable;

  private ExpressBusinessField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
