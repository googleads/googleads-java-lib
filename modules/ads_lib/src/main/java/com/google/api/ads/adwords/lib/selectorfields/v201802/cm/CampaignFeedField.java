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
 * A {@code Enum} to facilitate the selection of fields for {@code CampaignFeed}.
 */
public enum CampaignFeedField implements EntityField {

  // Fields constants definitions

  /**
   * ID of the base campaign from which this draft/trial feed was created.
   * This field is only returned on get requests.
   */
  @Filterable
  BaseCampaignId(true),

  /**
   * Id of the Campaign associated with the CampaignFeed.
   */
  @Filterable
  CampaignId(true),

  /**
   * Id of the Feed associated with the CampaignFeed.
   */
  @Filterable
  FeedId(true),

  /**
   * Matching function associated with the CampaignFeed.
   * The matching function will return true/false indicating which feed items may serve.
   */
  MatchingFunction(false),

  /**
   * Indicates which <a href="/adwords/api/docs/appendix/placeholders"> placeholder types</a> the feed may populate under the connected Campaign.
   */
  @Filterable
  PlaceholderTypes(true),

  /**
   * Status of the CampaignFeed.
   */
  @Filterable
  Status(true),

  ;

  private final boolean isFilterable;

  private CampaignFeedField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
