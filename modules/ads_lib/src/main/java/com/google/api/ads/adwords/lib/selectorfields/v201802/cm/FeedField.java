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
 * A {@code Enum} to facilitate the selection of fields for {@code Feed}.
 */
public enum FeedField implements EntityField {

  // Fields constants definitions

  /**
   * The Feed's schema.
   * In SET operations, these attributes will be considered new attributes and will be appended to the existing list of attributes unless this list is an exact copy of the existing list (as would be obtained via {@code FeedService#get}).
   * If an empty attributes list is provided, the existing list of attributes will not be changed.
   */
  Attributes(false),

  /**
   * Status of the Feed.
   */
  @Filterable
  FeedStatus(true),

  /**
   * Id of the Feed.
   */
  @Filterable
  Id(true),

  /**
   * Name of the Feed.
   */
  @Filterable
  Name(true),

  /**
   * Specifies who manages the {@code FeedAttribute}s for the {@code Feed}.
   */
  @Filterable
  Origin(true),

  /**
   * The system data for the Feed.
   * This data specifies information for generating the feed items of the system generated feed.
   */
  SystemFeedGenerationData(false),

  ;

  private final boolean isFilterable;

  private FeedField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
