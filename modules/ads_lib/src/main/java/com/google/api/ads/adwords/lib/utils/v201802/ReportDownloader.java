// Copyright 2012 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201802;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.jaxb.v201802.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201802.ReportDefinition;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.inject.Inject;

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
public class ReportDownloader implements ReportDownloaderInterface {

  private final AdHocReportDownloadHelper adHocReportDownloadHelper;

  /**
   * Constructs a {@link ReportDownloader}.
   *
   * @param session AdWordsSession to use to make report download requests.
   */
  public ReportDownloader(AdWordsSession session) {
    this(
        AdWordsInternals.getBootstrapper().getInstanceOf(session, AdHocReportDownloadHelper.class));
  }

  /** Constructor used by Guice. */
  @Inject
  ReportDownloader(AdHocReportDownloadHelper adHocReportDownloadHelper) {
    this.adHocReportDownloadHelper = adHocReportDownloadHelper;
  }
  
  @Override
  public ReportDownloadResponse downloadReport(ReportDefinition reportDefinition)
      throws ReportException, ReportDownloadResponseException {
    return adHocReportDownloadHelper.downloadReport(
        new XmlReportDefinitionRequest(reportDefinition),
        new DetailedReportDownloadResponseException.Builder());
  }

  @Override
  public ReportDownloadResponse downloadReport(String reportQuery, DownloadFormat format)
      throws ReportException, ReportDownloadResponseException {
    return adHocReportDownloadHelper.downloadReport(
        new AwqlReportRequest(reportQuery, format),
        new DetailedReportDownloadResponseException.Builder());
  }

  @Override
  public int getReportDownloadTimeout() {
    return adHocReportDownloadHelper.getReportDownloadTimeout();
  }

  @Override
  public void setReportDownloadTimeout(int reportDownloadTimeout) {
    adHocReportDownloadHelper.setReportDownloadTimeout(reportDownloadTimeout);
  }
}
