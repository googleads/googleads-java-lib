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
 * A {@code Enum} to facilitate the selection of fields for {@code CampaignExtensionSetting}.
 */
public enum CampaignExtensionSettingField implements EntityField {

  // Fields constants definitions

  /**
   * The id of the campaign for the feed items being added or modified.
   */
  @Filterable
  CampaignId(true),

  /**
   * The extension type the extension setting applies to.
   */
  @Filterable
  ExtensionType(true),

  /**
   * The list of feed items to add or modify.
   */
  Extensions(false),

  /**
   * Any platform (desktop, mobile) restrictions for feed items being served.
   * If set to DESKTOP or MOBILE, only those feed items with the appropriate device preference or no device preference will serve.
   */
  PlatformRestrictions(false),

  ;

  private final boolean isFilterable;

  private CampaignExtensionSettingField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
