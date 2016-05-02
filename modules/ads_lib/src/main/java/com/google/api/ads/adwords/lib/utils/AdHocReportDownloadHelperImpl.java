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
import com.google.api.ads.adwords.lib.utils.DetailedReportDownloadResponseException.Builder;
import com.google.api.ads.common.lib.exception.AuthenticationException;
import com.google.api.ads.common.lib.utils.Streams;
import com.google.api.ads.common.lib.utils.XmlFieldExtractor;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.common.base.Preconditions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Map;

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
  public ReportDownloadResponse downloadReport(
      ReportRequest reportRequest, Builder exceptionBuilder)
      throws ReportDownloadResponseException, ReportException {
    return handleResponse(downloadReport(reportRequest), exceptionBuilder);
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

  @Override
  public ReportDownloadResponse handleResponse(
      RawReportDownloadResponse rawResponse, Builder exceptionBuilder)
      throws ReportDownloadResponseException {
    Preconditions.checkNotNull(rawResponse, "Null response");
    Preconditions.checkNotNull(exceptionBuilder, "Null exception builder");
    if (rawResponse.getHttpStatus() == HttpURLConnection.HTTP_OK) {
      return new ReportDownloadResponse(rawResponse);
    }
    String responseText;
    if (rawResponse.getInputStream() == null) {
      responseText = "";
    } else {
      try {
        responseText = Streams.readAll(rawResponse.getInputStream(), rawResponse.getCharset());
      } catch (IOException e1) {
        throw new ReportDownloadResponseException(rawResponse.getHttpStatus(), e1);
      }
    }
    DetailedReportDownloadResponseException exception =
        exceptionBuilder.build(rawResponse.getHttpStatus(), responseText);
    XmlFieldExtractor extractor = AdWordsInternals.getInstance().getXmlFieldExtractor();
    Map<String, String> fields =
        extractor.extract(
            new ByteArrayInputStream(responseText.getBytes()),
            new String[] {"fieldPath", "trigger", "type"});
    exception.setFieldPath(fields.get("fieldPath"));
    exception.setTrigger(fields.get("trigger"));
    exception.setType(fields.get("type"));
    throw exception;
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