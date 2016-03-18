// Copyright 2015 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.v201509;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.jaxb.v201509.DownloadFormat;
import com.google.api.ads.adwords.lib.jaxb.v201509.ReportDefinition;
import com.google.api.ads.adwords.lib.utils.AdHocReportDownloadHelper;
import com.google.api.ads.adwords.lib.utils.RawReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponse;
import com.google.api.ads.adwords.lib.utils.ReportDownloadResponseException;
import com.google.api.ads.adwords.lib.utils.ReportException;
import com.google.api.ads.adwords.lib.utils.XmlFieldExtractor;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.common.annotations.VisibleForTesting;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

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
  private static final String VERSION = "v201509";

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
   * @throws ReportDownloadResponseException If the server indicates a problem
   *         with the request.
   */
  public ReportDownloadResponse downloadReport(ReportDefinition reportDefinition)
      throws ReportException, ReportDownloadResponseException {
    return handleResponse(adHocReportDownloadHelper.downloadReport(
        new XmlReportDefinitionRequest(reportDefinition)));
  }

  /**
   * Processes the raw response into one suitable for consumption. Will throw an
   * exception if we receive an error response from the server.
   *
   * @param response raw response to process.
   * @return ReportDownloadResponse on success, otherwise an exception.
   * @throws ReportDownloadResponseException if the server indicated there was a
   *         problem processing the report download request.
   */
  private ReportDownloadResponse handleResponse(RawReportDownloadResponse response)
      throws ReportDownloadResponseException {
    if (response.getHttpStatus() == HttpURLConnection.HTTP_OK) {
      return new ReportDownloadResponse(response);
    }
    String responseText;
    try {
      responseText = Streams.readAll(response.getInputStream(), response.getCharset());
    } catch (IOException e1) {
      throw new ReportDownloadResponseException(response.getHttpStatus(), e1);
    }
    DetailedReportDownloadResponseException exception =
        new DetailedReportDownloadResponseException(response.getHttpStatus(), responseText);
    XmlFieldExtractor extractor = new XmlFieldExtractor();
    Map<String, String> fields = extractor.extract(
        new ByteArrayInputStream(responseText.getBytes()),
        new String[] {"fieldPath", "trigger", "type"});
    exception.setFieldPath(fields.get("fieldPath"));
    exception.setTrigger(fields.get("trigger"));
    exception.setType(fields.get("type"));
    throw exception;
  }

  /**
   * Downloads a report query (AWQL) and returns a ReportDownloadResponse with the results.
   *
   * @param reportQuery to download a report for.
   * @param format Format to download the report as. CSV,
   * @return {@link ReportDownloadResponse} If the HTTP request completes successfully.
   * @throws ReportException If there is any issue making HTTP request with server.
   * @throws ReportDownloadResponseException If the server indicates a problem
   *         with the request.
   */
  public ReportDownloadResponse downloadReport(String reportQuery, DownloadFormat format)
      throws ReportException, ReportDownloadResponseException {
    return handleResponse(adHocReportDownloadHelper.downloadReport(
        new AwqlReportRequest(reportQuery, format)));
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
