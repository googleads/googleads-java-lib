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
   * Device preference for the feed item.
   */
  @Filterable
  DevicePreference(true),

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
   * Display type of the location criterion.
   */
  GeoTargetingDisplayType(false),

  /**
   * Name of the location criterion.
   * <b> Note:</b> This field is filterable only in LocationCriterionService.
   * If used as a filter, a location name cannot be greater than 300 characters.
   */
  GeoTargetingLocationName(false),

  /**
   * Ordered list of parents of the location criterion.
   */
  GeoTargetingParentLocations(false),

  /**
   * The geo targeting restriction of a feed item.
   * If null then the geo restriction is cleared.
   */
  @Filterable
  GeoTargetingRestriction(true),

  /**
   * The targeting status of the location criterion.
   */
  GeoTargetingStatus(false),

  /**
   * Match type of this keyword.
   */
  @Filterable
  KeywordMatchType(true),

  /**
   * ID of this criterion.
   */
  @Filterable
  KeywordTargetingCriterionId(true),

  /**
   * Text of this keyword (at most 80 characters and ten words).
   */
  @Filterable
  KeywordText(true),

  /**
   * List of details about a feed item's validation and approval state for active feed mappings.
   */
  PolicyData(false),

  /**
   * FeedItemScheduling specifying times for when the feed item may serve.
   * On retrieval or creation of the feed item, if the field is left null, no feed item scheduling restrictions are placed on the feed item.
   * On update, if the field is left unspecified, the previous feedItemScheduling state will not be changed.
   * On update, if the field is set with a FeedItemScheduling with an empty feedItemSchedules list, the scheduling will be cleared of all FeedItemSchedules indicating the feed item has no scheduling restrictions.
   */
  Scheduling(false),

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
   * The ID of the adgroup to target.
   */
  @Filterable
  TargetingAdGroupId(true),

  /**
   * The ID of the campaign to target.
   */
  @Filterable
  TargetingCampaignId(true),

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
