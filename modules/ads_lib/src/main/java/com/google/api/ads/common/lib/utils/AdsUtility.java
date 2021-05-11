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

package com.google.api.ads.common.lib.utils;

/**
 * Enumeration of utilities available in the client library.
 */
public enum AdsUtility {
  
  /** AdWords SelectorBuilder */
  SELECTOR_BUILDER("SelectorBuilder"),
  /** AdWords ReportDownloader */
  REPORT_DOWNLOADER("ReportDownloader"),
  /** AdWords SelectorField enums */
  SELECTOR_FIELD("SelectorField"),
  /** AdWords shopping utility for managing shopping product partition trees */
  PRODUCT_PARTITION_TREE("ProductPartitionTree"),
  /** AdWords BatchJobService upload/download utility */
  BATCH_JOB_HELPER("BatchJobHelper"),
  /** AdWords ReportQueryBuilder */
  REPORT_QUERY_BUILDER("ReportQueryBuilder"),
  /** AdWords ServiceQueryBuilder */
  SERVICE_QUERY_BUILDER("ServiceQueryBuilder");

  private final String userAgentIdentifier;
  
  private AdsUtility(String userAgentIdentifier) {
    this.userAgentIdentifier = userAgentIdentifier;
  }

  /**
   * Returns the String to use for this utility when generating the user agent of a request.
   */
  public String getUserAgentIdentifier() {
    return userAgentIdentifier;
  }

}
