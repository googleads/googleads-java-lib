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

import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.charset.Charset;

/**
 * Actual implementation of download functionality.
 */
class AdHocReportDownloadHelperImpl implements AdHocReportDownloadHelperInterface {
  private final AdWordsSession session;
  private final ReportRequestFactoryHelper reportRequestFactoryHelper;
  private final ReportBodyProviderFactory reportBodyProviderFactory;
  private final String version;

  AdHocReportDownloadHelperImpl(AdWordsSession session, String version) {
    this.session = session;
    this.version = version;
    this.reportRequestFactoryHelper = new ReportRequestFactoryHelper(session);
    this.reportBodyProviderFactory = new ReportBodyProviderFactory();
  }

  @Override
  public RawReportDownloadResponse downloadReport(ReportRequest reportRequest)
      throws ReportException {
    try {
      String downloadUrl = generateReportUrl(version);
      HttpRequestFactory requestFactory =
          reportRequestFactoryHelper.getHttpRequestFactory(downloadUrl, version);
      ReportBodyProvider reportBodyProvider =
          reportBodyProviderFactory.getReportBodyProvider(reportRequest);
      HttpRequest httpRequest = requestFactory
          .buildPostRequest(new GenericUrl(downloadUrl), reportBodyProvider.getHttpContent());
      HttpResponse response = httpRequest.execute();
      
      Charset charSet = REPORT_CHARSET;
      // Unfortunately, HttpResponse.getContentCharset defaults to Charsets.ISO_8859_1 if the
      // underlying MediaType is null or doesn't have a Charset parameter. Since we want to
      // default to REPORT_CHARSET, we have to inspect the MediaType ourselves.
      if (response.getMediaType() != null
          && response.getMediaType().getCharsetParameter() != null) {
        charSet = response.getMediaType().getCharsetParameter();
      }

      return new RawReportDownloadResponse(response.getStatusCode(), response.getContent(), charSet,
          reportRequest.getDownloadFormat().name());
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
  private String generateReportUrl(String version) {
    return session.getEndpoint() + ReportRequestFactoryHelper.DOWNLOAD_SERVER_URI + '/' + version;
  }

  @Override
  public int getReportDownloadTimeout() {
    return reportRequestFactoryHelper.getReportDownloadTimeout();
  }

  @Override
  public  void setReportDownloadTimeout(int reportDownloadTimeout) {
    reportRequestFactoryHelper.setReportDownloadTimeout(reportDownloadTimeout);
  }
}