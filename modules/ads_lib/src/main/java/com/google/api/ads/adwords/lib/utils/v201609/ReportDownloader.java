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

package com.google.api.ads.adwords.lib.utils.v201609;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.jaxb.v201609.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201609.ReportDefinition;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.common.annotations.VisibleForTesting;
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

  /** The version to append to url for Ad Hoc report downloads. */
  private static final String VERSION = "v201609";

  private final AdHocReportDownloadHelper adHocReportDownloadHelper;

  /**
   * Constructs a {@link ReportDownloader}.
   *
   * @param session AdWordsSession to use to make report download requests.
   */
  @Inject
  public ReportDownloader(AdWordsSession session) {
    this(new AdHocReportDownloadHelper(session, VERSION));
  }

  @VisibleForTesting
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
