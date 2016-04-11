// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.common.lib.utils.AdsUtility;
import com.google.api.ads.common.lib.utils.UsesAdsUtilities;
import com.google.api.client.util.Charsets;
import com.google.common.annotations.VisibleForTesting;

import java.nio.charset.Charset;

/**
 * Helper object that handles AdWords API report requests.
 */
public interface AdHocReportDownloadHelperInterface {

  /**
   * The default Charset for report request and response contents.
   */
  @VisibleForTesting Charset REPORT_CHARSET = Charsets.UTF_8;

  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportRequest the report request.
   * @return encapsulated http response body and status code.
   * @throws ReportException If there is any exceptions making HTTP request to the server.
   */
  @UsesAdsUtilities({AdsUtility.REPORT_DOWNLOADER})
  RawReportDownloadResponse downloadReport(ReportRequest reportRequest) throws ReportException;

  /**
   * Returns the reportDownloadTimeout in milliseconds
   */
  int getReportDownloadTimeout();

  /**
   * Sets the reportDownloadTimeout (milliseconds).
   */
  void setReportDownloadTimeout(int reportDownloadTimeout);
}
