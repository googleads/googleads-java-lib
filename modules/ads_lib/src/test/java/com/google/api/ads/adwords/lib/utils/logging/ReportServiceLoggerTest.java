// Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.lib.utils.logging;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import com.google.api.ads.common.lib.client.RequestInfo;
import com.google.api.ads.common.lib.client.ResponseInfo;
import com.google.api.ads.common.lib.utils.logging.RemoteCallLoggerDelegate;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.util.GenericData;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

/** Tests for {@link ReportServiceLogger}. */
@RunWith(JUnit4.class)
public class ReportServiceLoggerTest {

  @Mock private Logger reportLogger;
  @Mock private RemoteCallLoggerDelegate loggerDelegate;

  // Default values for various request/response attributes. These will all be set to some
  // non-null, meaningful value.
  @Mock private HttpTransport httpTransport;

  private HttpRequestFactory requestFactory;

  private HttpRequest httpRequest;
  private Map<String, String> rawRequestHeaders;
  private String url;
  private String requestMethod;

  /** ReportServiceLogger being tested. */
  private ReportServiceLogger reportServiceLogger;

  /**
   * Sets all instance variables to values for a successful request. Tests that require failed
   * requests or null/empty values should mutate the instance variables accordingly.
   */
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    requestMethod = "POST";
    url = "http://www.foo.com/bar";
    reportServiceLogger = new ReportServiceLogger(loggerDelegate);

    requestFactory = new NetHttpTransport().createRequestFactory();
    // Constructs the request headers and adds headers that should be scrubbed
    rawRequestHeaders =
        ReportServiceLogger.SCRUBBED_HEADERS
            .stream()
            .collect(Collectors.toMap(h -> h, h -> "foo" + h));
    // Adds headers that should not be scrubbed.
    rawRequestHeaders.put("clientCustomerId", "123-456-7890");
    rawRequestHeaders.put("someOtherHeader", "SomeOtherValue");

    GenericData postData = new GenericData();
    postData.put("__rdquery", "SELECT CampaignId FROM CAMPAIGN_PERFORMANCE_REPORT");

    httpRequest =
        requestFactory.buildPostRequest(new GenericUrl(url), new UrlEncodedContent(postData));

    for (Entry<String, String> rawHeaderEntry : rawRequestHeaders.entrySet()) {
      String key = rawHeaderEntry.getKey();
      if ("authorization".equalsIgnoreCase(key)) {
        httpRequest
            .getHeaders()
            .setAuthorization(Collections.<String>singletonList(rawHeaderEntry.getValue()));
      } else {
        httpRequest.getHeaders().put(key, rawHeaderEntry.getValue());
      }
    }

    httpRequest.getResponseHeaders().setContentType("text/csv; charset=UTF-8");
    httpRequest.getResponseHeaders().put("someOtherResponseHeader", "foo");
    httpRequest
        .getResponseHeaders()
        .put("multiValueHeader", Arrays.<String>asList("value1", "value2"));
  }

  @Test
  public void testBuildInfos_success() {
    RequestInfo requestInfo = reportServiceLogger.buildRequestInfo(httpRequest);
    checkRequestInfoAttributes(requestInfo, true);
    ResponseInfo responseInfo =
        reportServiceLogger.buildResponseInfo(httpRequest, HttpStatusCodes.STATUS_CODE_OK, null);
    checkResponseInfoAttributes(responseInfo, HttpStatusCodes.STATUS_CODE_OK, null);
  }

  @Test
  public void testBuildInfos_failure() {
    RequestInfo requestInfo = reportServiceLogger.buildRequestInfo(httpRequest);
    checkRequestInfoAttributes(requestInfo, true);
    ResponseInfo responseInfo =
        reportServiceLogger.buildResponseInfo(
            httpRequest, HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, "Bad gateway");
    checkResponseInfoAttributes(
        responseInfo, HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, "Bad gateway");
  }

  private void checkRequestInfoAttributes(RequestInfo requestInfo, boolean isCheckPayload) {
    assertEquals(requestMethod, requestInfo.getMethodName());
    assertEquals(url, requestInfo.getUrl());
    assertEquals("clientCustomerId", requestInfo.getContextName());
    assertEquals("123-456-7890", requestInfo.getContextValue());
    assertEquals("reportdownload", requestInfo.getServiceName());

    String requestPayload = requestInfo.getPayload();
    if (!isCheckPayload) {
      assertNull("Payload should have been null", requestPayload);
      return;
    }

    for (Entry<String, String> headerEntry : rawRequestHeaders.entrySet()) {
      String header = headerEntry.getKey().toLowerCase();
      String value = headerEntry.getValue();
      assertThat(
          "Expected header name not logged", requestPayload.toLowerCase(), containsString(header));

      Object expectedValue;
      if (ReportServiceLogger.SCRUBBED_HEADERS.contains(header)) {
        expectedValue = ReportServiceLogger.REDACTED_HEADER;
      } else {
        expectedValue = value;
      }

      assertThat(
          "Header: value does not match expectatations",
          requestPayload,
          Matchers.containsString(String.format("%s: %s", header, expectedValue)));
    }
  }

  private void checkResponseInfoAttributes(
      ResponseInfo responseInfo, int statusCode, @Nullable String statusMessage) {
    String responsePayloadLower = responseInfo.getPayload().toLowerCase();
    httpRequest
        .getResponseHeaders()
        .forEach(
            (key, value) -> {
              assertThat(
                  "Payload does not contain response header key",
                  responsePayloadLower,
                  containsString(key));
              assertThat(
                  "Payload does not contain response header value",
                  responseInfo.getPayload(),
                  containsString(String.valueOf(value)));
            });
    assertThat(
        "Payload does not contain redacted string",
        responseInfo.getPayload(),
        containsString(ReportServiceLogger.REDACTED_REPORT_DATA));
    assertThat(
        "Payload does not contain the HTTP status code",
        responseInfo.getPayload(),
        startsWith(Integer.toString(statusCode)));
    if (statusMessage != null) {
      assertThat(
          "Payload does not contain the HTTP status message",
          responseInfo.getPayload(),
          containsString(statusMessage));
    }
  }
}
