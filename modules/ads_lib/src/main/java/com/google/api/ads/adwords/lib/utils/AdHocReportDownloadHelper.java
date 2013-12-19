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

package com.google.api.ads.adwords.lib.utils;

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.common.annotations.VisibleForTesting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Helper class that handles AdHoc report downloads. Requests will be logged (header and payload) to
 * INFO. Successful reports will be logged (headers and response code) to INFO. Failed reports will
 * be logged in their entirety to WARN.
 *
 * @author Kevin Winter
 */
public class AdHocReportDownloadHelper {

  private static final Logger logger = LoggerFactory.getLogger(
      AdHocReportDownloadHelper.class.getPackage().getName() + ".report_download");

  private final AdWordsSession session;
  private final ReportRequestFactoryHelper reportRequestFactoryHelper;
  private final String version;

  /**
   * Constructor that stores the session for authentication and uses the provided version to
   * determine the report endpoint.
   */
  public AdHocReportDownloadHelper(AdWordsSession session, String version) {
    this.session = session;
    this.version = version;
    this.reportRequestFactoryHelper = new ReportRequestFactoryHelper(session);
  }

  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportDefinitionXml to download a report for.
   * @return {@link ReportDownloadResponse} When HTTP request completes. On
   *         success, the outputStream will be flushed and closed.
   * @throws ReportException If there is any issue making HTTP request with
   *         server.
   */
  public RawReportDownloadResponse downloadReport(String reportDefinitionXml)
      throws ReportException {
    return downloadReport(new ReportDefinitionBodyProvider(reportDefinitionXml));
  }

  /**
   * Downloads a report query and returns a ReportDownloadResponse with the results.
   *
   * @param reportQuery to download a report for.
   * @return {@link ReportDownloadResponse} When HTTP request completes. On
   *         success, the outputStream will be flushed and closed.
   * @throws ReportException If there is any issue making HTTP request with
   *         server.
   */
  public RawReportDownloadResponse downloadReport(String reportQuery, String format)
      throws ReportException {
    return downloadReport(new AwqlReportBodyProvider(reportQuery, format));
  }

  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportBodyProvider with HttpContent to send to the server.
   * @return encapsulated http response body and status code.
   * @throws ReportException If there is any exceptions making HTTP request to
   *         the server.
   */
  protected RawReportDownloadResponse downloadReport(ReportBodyProvider reportBodyProvider)
      throws ReportException {
    try {
      String downloadUrl = generateReportUrl(version);
      HttpRequestFactory requestFactory =
          reportRequestFactoryHelper.getHttpRequestFactory(downloadUrl);
      HttpRequest httpRequest = requestFactory
          .buildPostRequest(new GenericUrl(downloadUrl), reportBodyProvider.getHttpContent());
      HttpResponse response = httpRequest.execute();
      return new RawReportDownloadResponse(response.getStatusCode(), response.getContent());
    } catch (MalformedURLException e) {
      throw new ReportException("Created invalid report download URL.", e);
    } catch (IOException e) {
      throw new ReportException("Problem sending data to report download server.", e);
    } catch (AuthenticationException e) {
      throw new ReportException("Problem with OAuth authorization.", e);
    }
  }

  /**
   * Creates the report download URL.
   *
   * @param version to download from.
   * @return url to download a report from.
   */
  @VisibleForTesting
  String generateReportUrl(String version) {
    return session.getEndpoint() + ReportRequestFactoryHelper.DOWNLOAD_SERVER_URI + '/' + version;
  }

  /**
   * Returns the reportDownloadTimeout in milliseconds
   */
  public int getReportDownloadTimeout() {
    return reportRequestFactoryHelper.getReportDownloadTimeout();
  }

  /**
   * Sets the reportDownloadTimeout (milliseconds).
   */
  public void setReportDownloadTimeout(int reportDownloadTimeout) {
    reportRequestFactoryHelper.setReportDownloadTimeout(reportDownloadTimeout);
  }
}
