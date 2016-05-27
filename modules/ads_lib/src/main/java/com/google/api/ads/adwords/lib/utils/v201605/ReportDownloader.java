// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.utils.v201605;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.jaxb.v201605.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201605.ReportDefinition;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.common.annotations.VisibleForTesting;

/**
 * Reports are fetched synchronously like in the following code:
 *
 * <pre>
 *<code>new ReportDownloader(adWordsSession).downloadReport(reportDefinition);
 *</code>
 *</pre>
 *
 * The {@code adWordsSession} is used to authenticate the request against the
 * {@code reportDownloadUrl}.
 *
 * <p>
 * Implementation is not thread-safe.
 * </p>
 */
public class ReportDownloader {

  /** The version to append to url for Ad Hoc report downloads. */
  private static final String VERSION = "v201605";

  private final AdHocReportDownloadHelper adHocReportDownloadHelper;

  /**
   * Constructs a {@link ReportDownloader}.
   *
   * @param session AdWordsSession to use to make report download requests.
   */
  public ReportDownloader(AdWordsSession session) {
    this(new AdHocReportDownloadHelper(session, VERSION));
  }

  @VisibleForTesting
  ReportDownloader(AdHocReportDownloadHelper adHocReportDownloadHelper) {
    this.adHocReportDownloadHelper = adHocReportDownloadHelper;
  }
  
  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportDefinition to download a report for.
   * @return {@link ReportDownloadResponse} If the HTTP request completes successfully.
   * @throws ReportException If we don't receive a response from the server.
   * @throws ReportDownloadResponseException If the server indicates a problem with the request.
   */
  public ReportDownloadResponse downloadReport(ReportDefinition reportDefinition)
      throws ReportException, ReportDownloadResponseException {
    return adHocReportDownloadHelper.downloadReport(
        new XmlReportDefinitionRequest(reportDefinition),
        new DetailedReportDownloadResponseException.Builder());
  }

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
      throws ReportException, ReportDownloadResponseException {
    return adHocReportDownloadHelper.downloadReport(
        new AwqlReportRequest(reportQuery, format),
        new DetailedReportDownloadResponseException.Builder());
  }

  /**
   * Returns the reportDownloadTimeout in milliseconds.
   */
  public int getReportDownloadTimeout() {
    return adHocReportDownloadHelper.getReportDownloadTimeout();
  }

  /**
   * Sets the timeout for both CONNECT and READ to the specified value. Defaults
   * to 3 minutes. Set property api.adwords.reportDownloadTimeout in
   * ads.properties or as a system property to set a default for all
   * ReportDownloaders.
   *
   * @param reportDownloadTimeout the reportDownloadTimeout to set in
   *        milliseconds
   */
  public void setReportDownloadTimeout(int reportDownloadTimeout) {
    adHocReportDownloadHelper.setReportDownloadTimeout(reportDownloadTimeout);
  }
}
