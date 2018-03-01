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
 * A {@code Enum} to facilitate the selection of fields for {@code TrialAsyncError}.
 */
public enum TrialAsyncErrorField implements EntityField {

  // Fields constants definitions

  /**
   * The error that occurred while processing the trial.
   */
  AsyncError(false),

  /**
   * The error occurred during trial promotion while updating this AdGroup or an entity in this AdGroup.
   */
  BaseAdGroupId(false),

  /**
   * The error occurred during trial promotion while updating this Campaign or an entity in this Campaign.
   */
  BaseCampaignId(false),

  /**
   * The error occurred during trial creation while updating this AdGroup or an entity in this AdGroup.
   */
  TrialAdGroupId(false),

  /**
   * The error occurred during trial creation while updating this Campaign or an entity in this Campaign.
   */
  TrialCampaignId(false),

  /**
   * The trial that was attempted to be created or promoted.
   */
  @Filterable
  TrialId(true),

  ;

  private final boolean isFilterable;

  private TrialAsyncErrorField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
