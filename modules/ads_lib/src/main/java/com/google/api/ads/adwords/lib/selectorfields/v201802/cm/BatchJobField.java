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
 * A {@code Enum} to facilitate the selection of fields for {@code BatchJob}.
 */
public enum BatchJobField implements EntityField {

  // Fields constants definitions

  /**
   * The URL to use to download results for this job.
   * Results will be available for 30 days after job completion.
   * This field is only returned once {@code #status} is either {@code DONE} or {@code CANCELED}.
   */
  DownloadUrl(false),

  /**
   * ID of this job.
   */
  @Filterable
  Id(true),

  /**
   * A list of any errors that occurred during processing, not related to specific input operations, e.g.
   * input file corruption errors.
   */
  ProcessingErrors(false),

  /**
   * Statistics related to the progress of this job.
   */
  ProgressStats(false),

  /**
   * Status of this job.
   */
  Status(false),

  ;

  private final boolean isFilterable;

  private BatchJobField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  @Override
  public boolean isFilterable() {
    return this.isFilterable;
  }

}
