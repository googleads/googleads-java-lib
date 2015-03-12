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

package com.google.api.ads.adwords.lib.selectorfields.v201406.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code FeedMapping}.
 */
public enum FeedMappingField implements EntityField {

  // Fields constants definitions

  /**
   * The list of feed attributes to placeholder fields mappings.
   * &lt;span class="constraint Required"&gt; This field is required and should not be {@code null} when it is contained within {@link Operator}s : ADD.&lt;/span&gt;
   */
  AttributeFieldMappings(false),

  /**
   * The criterion type for this mapping.
   * This field is mutually exclusive with placeholderType.
   */
  CriterionType(false),

  /**
   * Id of the Feed that is mapped by this mapping.
   */
  @Filterable
  FeedId(true),

  /**
   * Id of this FeedMapping.
   * &lt;span class="constraint Required"&gt; This field is required and should not be {@code null} when it is contained within {@link Operator}s : REMOVE.&lt;/span&gt;
   */
  @Filterable
  FeedMappingId(true),

  /**
   * The placeholder type for this mapping.
   */
  @Filterable
  PlaceholderType(true),

  /**
   * Status of the mapping.
   */
  @Filterable
  Status(true),

  ;

  private final boolean isFilterable;

  private FeedMappingField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
