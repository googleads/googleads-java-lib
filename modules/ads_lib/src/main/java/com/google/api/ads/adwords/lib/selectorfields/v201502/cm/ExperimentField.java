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

package com.google.api.ads.adwords.lib.selectorfields.v201502.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code Experiment}.
 */
public enum ExperimentField implements EntityField {

  // Fields constants definitions

  /**
   * Number of creatives changed in this experiment
   */
  AdGroupAdsCount(false),

  /**
   * Number of criteria changed in this experiment
   */
  AdGroupCriteriaCount(false),

  /**
   * Number of adgroups changed in this experiment
   */
  AdGroupsCount(false),

  /**
   * 
   */
  @Filterable
  CampaignId(true),

  /**
   * The id of the control associated with this experiment
   */
  @Filterable
  ControlId(true),

  /**
   * Experiment ended serving date; {@code null} indicates campaign end date depends on start date.
   * If start date is null, this is undefined.
   * If start date is not null, this defaults to 30 days after the start date.
   */
  @Filterable
  EndDateTime(true),

  /**
   * 
   */
  @Filterable
  Id(true),

  /**
   * The last time any change was made to this experiment, such as adding a keyword to the experiment only, adding a keyword to the control only, or updating a bid modifier.
   */
  @Filterable
  LastModifiedDateTime(true),

  /**
   * Experiment name.
   */
  @Filterable
  Name(true),

  /**
   * The percentage of queries that will get routed to the experiment.
   * It is also the percentage of budget that will be used for the experiment.
   * Valid values for this field are 10, 20, 30, 40, 50, 60, 70, 80, 90.
   */
  @Filterable
  QueryPercentage(true),

  /**
   * Serving status of the experiment.
   */
  ServingStatus(false),

  /**
   * Experiment started serving date; {@code null} indicates campaign start date is indefinitely in the future.
   */
  @Filterable
  StartDateTime(true),

  /**
   * Status of the experiment.
   * For ADD, this can only be ACTIVE, as nothing else makes sense.
   * Default is ACTIVE for ADDs where this field is omitted.
   */
  @Filterable
  Status(true),

  ;

  private final boolean isFilterable;

  private ExperimentField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
