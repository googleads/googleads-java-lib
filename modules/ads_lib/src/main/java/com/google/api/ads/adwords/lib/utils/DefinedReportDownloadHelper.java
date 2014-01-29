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
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.common.annotations.VisibleForTesting;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/**
 * Helper class that downloads Defined ReportDefinitions by Id.
 *
 * @author Kevin Winter
 * @deprecated Use {@link AdHocReportDownloadHelper} AdHoc reports instead.
 */
@Deprecated
public class DefinedReportDownloadHelper {

  private static final String SUCCESS = "SUCCESS";
  private static final String REPORT_BY_ID = "?__rd=%d";

  private final AdWordsSession session;
  private final ReportRequestFactoryHelper reportUrlConnectionHelper;
  private String version;

  /**
   * Constructor also instantiates a ReportUrlConnectionHelper to generate an HttpURLConnection.
   *
   * @param session to use for requests.
   * @param version to use for requests.
   */
  public DefinedReportDownloadHelper(AdWordsSession session, String version) {
    this.session = session;
    this.version = version;
    this.reportUrlConnectionHelper = new ReportRequestFactoryHelper(session);
  }

  /**
   * Creates the report download URL.
   *
   * @param reportDefinitionId if not null, added to URL.
   * @return url to download a report from.
   */
  @VisibleForTesting
  String generateReportUrl(Long reportDefinitionId, String version) {
    return session.getEndpoint() + ReportRequestFactoryHelper.DOWNLOAD_SERVER_URI + '/' + version
        + String.format(REPORT_BY_ID, reportDefinitionId);
  }

  /**
   * Downloads a report and returns a ReportDownloadResponse with the results.
   *
   * @param reportDefinitionId to download a report for.
   * @return {@link ReportDownloadResponse} When HTTP request completes. On success, the
   *         outputStream will be flushed and closed.
   * @throws ReportException If there is any issue making HTTP request with server.
   */
  public ReportDownloadResponse downloadReport(long reportDefinitionId) throws ReportException {
    try {
      String downloadUrl = generateReportUrl(reportDefinitionId, version);

      HttpRequestFactory requestFactory =
          reportUrlConnectionHelper.getHttpRequestFactory(downloadUrl);
      HttpRequest httpRequest = requestFactory.buildGetRequest(new GenericUrl(downloadUrl));
      HttpResponse httpResponse = httpRequest.execute();

      String responseMessage = SUCCESS;
      InputStream inputStream = null;
      int statusCode = httpResponse.getStatusCode();
      if (statusCode == HttpURLConnection.HTTP_OK) {
        inputStream = httpResponse.getContent();
      } else {
        // Anything other than success means the body has an error message.
        responseMessage = Streams.readAll(httpResponse.getContent());
      }

      return new ReportDownloadResponse(statusCode, responseMessage, inputStream);
    } catch (MalformedURLException e) {
      throw new ReportException("Created invalid report download URL.", e);
    } catch (IOException e) {
      throw new ReportException("Problem sending data to report download server.", e);
    } catch (AuthenticationException e) {
      throw new ReportException("Problem with OAuth authorization.", e);
    }
  }
}
