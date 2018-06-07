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

package com.google.api.ads.adwords.lib.selectorfields.v201806.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code FeedItem}.
 */
public enum FeedItemField implements EntityField {

  // Fields constants definitions

  /**
   * The feed item's attribute values.
   * For any unset/unspecified feed attributes, the value is considered unset/null on ADD and unchanged on SET.
   */
  AttributeValues(false),

  /**
   * End time in which this feed item is no longer effective and will stop serving.
   * The time zone of endTime must either match the time zone of the account or be unspecified where the time zone defaults to the account time zone.
   * This field may be null to indicate no end time restriction.
   * The special value "00000101 000000" may be used to clear an existing end time.
   */
  @Filterable
  EndTime(true),

  /**
   * ID of this feed item's feed
   */
  @Filterable
  FeedId(true),

  /**
   * ID of this feed item.
   * This may be unspecified if the user-defined key attributes are specified.
   */
  @Filterable
  FeedItemId(true),

  /**
   * The geo targeting restriction of a feed item.
   * If null then the geo restriction is cleared.
   */
  @Filterable
  GeoTargetingRestriction(true),

  /**
   * Summary of a feed item's offline validation, policy findings, and approval results for active feed mappings.
   */
  PolicySummaries(false),

  /**
   * Start time in which this feed item is effective and can begin serving.
   * The time zone of startTime must either match the time zone of the account or be unspecified where the time zone defaults to the account time zone.
   * This field may be null to indicate no start time restriction.
   * The special value "00000101 000000" may be used to clear an existing start time.
   */
  @Filterable
  StartTime(true),

  /**
   * Status of feed item
   */
  @Filterable
  Status(true),

  /**
   * A list of mappings to be used for substituting URL custom parameter tags in the trackingUrlTemplate, finalUrls, and/or finalMobileUrls.
   */
  UrlCustomParameters(false),

  ;

  private final boolean isFilterable;

  private FeedItemField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
