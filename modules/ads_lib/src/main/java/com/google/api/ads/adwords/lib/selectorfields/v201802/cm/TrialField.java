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
 * A {@code Enum} to facilitate the selection of fields for {@code Trial}.
 */
public enum TrialField implements EntityField {

  // Fields constants definitions

  /**
   * Id of the base campaign, which will be the control arm of this trial.
   */
  @Filterable
  BaseCampaignId(true),

  /**
   * Valid id of the draft this trial is based on.
   */
  @Filterable
  DraftId(true),

  /**
   * Date the campaign ends.
   * On add, defaults to the base campaign's end date.
   */
  @Filterable
  EndDate(true),

  /**
   * The id of this trial.
   */
  @Filterable
  Id(true),

  /**
   * The name of this trial.
   * Must not conflict with the name of another trial or campaign.
   */
  @Filterable
  Name(true),

  /**
   * Date the trial begins.
   * On add, defaults to the the base campaign's start date or the current day in the parent account's local timezone (whichever is later).
   */
  @Filterable
  StartDate(true),

  /**
   * Status of this trial.
   * Note that a running trial will always be ACTIVE, but not all ACTIVE trials are currently running: they may have ended or been scheduled for the future.
   */
  @Filterable
  Status(true),

  /**
   * Traffic share to be directed to the trial arm of this trial, i.e.
   * the arm containing the trial changes (in percent).
   * The remainder of the traffic (100 - {@code trafficSplitPercent}) will be directed to the base campaign.
   */
  @Filterable
  TrafficSplitPercent(true),

  /**
   * Id of the trial campaign.
   * This will be null if the Trial has status CREATING.
   */
  @Filterable
  TrialCampaignId(true),

  ;

  private final boolean isFilterable;

  private TrialField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
