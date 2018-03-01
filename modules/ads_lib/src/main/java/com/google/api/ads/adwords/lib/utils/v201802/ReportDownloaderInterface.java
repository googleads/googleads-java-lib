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

package com.google.api.ads.adwords.lib.utils.v201802;

import com.google.api.ads.adwords.lib.jaxb.v201802.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201802.ReportDefinition;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.adwords.lib.utils.SessionUtility;
import com.google.inject.ImplementedBy;

/** Utility for downloading AdWords API reports. */
@ImplementedBy(ReportDownloader.class)
@SessionUtility
public interface ReportDownloaderInterface {
  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportDefinition to download a report for.
   * @return {@link ReportDownloadResponse} If the HTTP request completes successfully.
   * @throws ReportException If we don't receive a response from the server.
   * @throws ReportDownloadResponseException If the server indicates a problem with the request.
   */
  public ReportDownloadResponse downloadReport(ReportDefinition reportDefinition)
      throws ReportException, ReportDownloadResponseException;

  /**
   * Downloads a report query (AWQL) and returns a ReportDownloadResponse with the results.
   *
   * @param reportQuery to download a report for.
   * @param format Format to download the report as. CSV,
   * @return {@link ReportDownloadResponse} If the HTTP request completes successfully.
   * @throws ReportException If there is any issue making HTTP request with server.
   * @throws ReportDownloadResponseException If the server indicates a problem with the request.
   */
  public ReportDownloadResponse downloadReport(String reportQuery, DownloadFormat format)
      throws ReportException, ReportDownloadResponseException;

  /** Returns the reportDownloadTimeout in milliseconds. */
  public int getReportDownloadTimeout();

  /**
   * Sets the timeout for both CONNECT and READ to the specified value. Defaults to 3 minutes. Set
   * property api.adwords.reportDownloadTimeout in ads.properties or as a system property to set a
   * default for all ReportDownloaders.
   *
   * @param reportDownloadTimeout the reportDownloadTimeout to set in milliseconds
   */
  public void setReportDownloadTimeout(int reportDownloadTimeout);
}
