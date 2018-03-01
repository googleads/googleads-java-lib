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
 * A {@code Enum} to facilitate the selection of fields for {@code BatchJobOps}.
 */
public enum BatchJobOpsField implements EntityField {

  // Fields constants definitions

  /**
   * Approval status that combines review state and status.
   */
  @Filterable
  CombinedApprovalStatus(true),

  /**
   * The descriptive text of the ad.
   */
  @Filterable
  Description(true),

  /**
   * The first description line.
   */
  @Filterable
  Description1(true),

  /**
   * The second description line.
   */
  @Filterable
  Description2(true),

  /**
   * The duration of the associated audio, in milliseconds.
   */
  @Filterable
  DurationMillis(true),

  /**
   * Name of the ad.
   */
  Name(false),

  /**
   * 
   */
  OperatingSystemName(false),

  /**
   * Indicates whether the audio is ready to play on the web.
   */
  ReadyToPlayOnTheWeb(false),

  /**
   * The streaming URL of the audio.
   */
  StreamingUrl(false),

  /**
   * Type of the creative.
   */
  Type(false),

  ;

  private final boolean isFilterable;

  private BatchJobOpsField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
