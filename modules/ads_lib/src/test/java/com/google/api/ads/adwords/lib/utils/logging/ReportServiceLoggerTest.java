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
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.util.GenericData;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Tests for {@link ReportServiceLogger}.
 *
 * @author Josh Radcliff
 */
@RunWith(JUnit4.class)
public class ReportServiceLoggerTest {

  @Mock
  private Logger reportLogger;

  // Default values for various request/response attributes. These will all be set to some
  // non-null, meaningful value.
  private HttpContent defaultRequestContent;
  private GenericData defaultRequestHeaders;
  private Set<String> defaultExpectedHeaders;
  private Set<String> defaultRedactedHeaders;
  private GenericUrl defaultUrl;
  private String defaultRequestMethod;

  /**
   * ReportServiceLogger being tested.
   */
  private ReportServiceLogger reportServiceLogger;

  /**
   * Sets all instance variables to values for a successful request. Tests that require failed
   * requests or null/empty values should mutate the instance variables accordingly.
   */
  @Before
  public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    defaultRequestMethod = "GET";
    defaultUrl = new GenericUrl("http://www.foo.com/bar");
    reportServiceLogger = new ReportServiceLogger(reportLogger);

    // Constructs the request headers.
    Map<String, String> data = Maps.newHashMap();
    // Adds headers that should be scrubbed.
    for (String scrubbedHeader : ReportServiceLogger.SCRUBBED_HEADERS) {
      data.put(scrubbedHeader, "foo" + scrubbedHeader);
      // Also add the header in uppercase to confirm it will be scrubbed, regardless of case.
      data.put(scrubbedHeader.toUpperCase(), "fooUpper" + scrubbedHeader);
    }
    defaultRedactedHeaders = Sets.newHashSet(data.keySet());

    // Adds headers that should not be scrubbed.
    data.put("ClientCustomerId", "123-456-7890");
    data.put("SomeOtherHeader", "SomeOtherValue");

    defaultExpectedHeaders = Sets.newHashSet(data.keySet());
    defaultExpectedHeaders.removeAll(defaultRedactedHeaders);

    defaultRequestHeaders = new GenericData();
    defaultRequestHeaders.putAll(data);
    defaultRequestContent = new UrlEncodedContent(data);
  }

  @Test
  public void testLogRequest_nullRequestMethod() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertRequestDetailsLogged(false,
        null,
        defaultUrl,
        defaultRequestContent,
        defaultRequestHeaders,
        defaultExpectedHeaders,
        defaultRedactedHeaders);
  }

  @Test
  public void testLogRequest_nullUrl() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertRequestDetailsLogged(false,
        defaultRequestMethod,
        null,
        defaultRequestContent,
        defaultRequestHeaders,
        defaultExpectedHeaders,
        defaultRedactedHeaders);
  }

  @Test
  public void testLogRequest_nullContent() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertRequestDetailsLogged(false,
        defaultRequestMethod,
        defaultUrl,
        null,
        defaultRequestHeaders,
        defaultExpectedHeaders,
        defaultRedactedHeaders);
  }

  @Test
  public void testLogRequest_nullHeaders() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertRequestDetailsLogged(false,
        defaultRequestMethod,
        defaultUrl,
        defaultRequestContent,
        defaultRequestHeaders,
        defaultExpectedHeaders,
        defaultRedactedHeaders);
  }

  @Test
  public void testLogResponse_nullStatusMessage() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertResponseDetailsLogged(HttpStatusCodes.STATUS_CODE_FORBIDDEN, null, false);
  }

  /**
   * Tests that failed request details are logged with WARN level if warn is enabled.
   */
  @Test
  public void testLogFailedRequest_warnEnabled() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertRequestDetailsLogged(false,
        defaultRequestMethod,
        defaultUrl,
        defaultRequestContent,
        defaultRequestHeaders,
        defaultExpectedHeaders,
        defaultRedactedHeaders);
  }

  /**
   * Tests that failed request details are NOT logged with WARN level if warn is disabled.
   */
  @Test
  public void testLogFailedRequest_warnDisabled() {
    when(reportLogger.isWarnEnabled()).thenReturn(false);
    reportServiceLogger.logRequest(defaultRequestMethod, defaultUrl, defaultRequestContent,
        defaultRequestHeaders, false);

    verify(reportLogger, never()).warn(org.mockito.Matchers.anyString());
  }

  @Test
  public void testLogFailedResponse_warnEnabled() {
    when(reportLogger.isWarnEnabled()).thenReturn(true);

    assertResponseDetailsLogged(HttpStatusCodes.STATUS_CODE_SERVER_ERROR, "FAILED", false);
  }

  /**
   * Tests that failed response details are NOT logged with WARN level if warn is disabled.
   */
  @Test
  public void testLogFailedResponse_warnDisabled() {
    when(reportLogger.isWarnEnabled()).thenReturn(false);
    reportServiceLogger.logResponse(HttpStatusCodes.STATUS_CODE_BAD_GATEWAY, "Failure", false);

    verify(reportLogger, never()).warn(org.mockito.Matchers.anyString());
  }

  /**
   * Tests that successful request details are logged with INFO level if info is enabled.
   */
  @Test
  public void testLogSuccessfulRequest_infoEnabled() {
    when(reportLogger.isInfoEnabled()).thenReturn(true);

    assertRequestDetailsLogged(true,
        defaultRequestMethod,
        defaultUrl,
        defaultRequestContent,
        defaultRequestHeaders,
        defaultExpectedHeaders,
        defaultRedactedHeaders);
  }

  /**
   * Tests that successful request details are NOT logged with INFO level if info is disabled.
   */
  @Test
  public void testLogSuccessfulRequest_infoDisabled() {
    when(reportLogger.isInfoEnabled()).thenReturn(false);
    reportServiceLogger.logRequest(defaultRequestMethod, defaultUrl, defaultRequestContent,
        defaultRequestHeaders, true);

    verify(reportLogger, never()).info(org.mockito.Matchers.anyString());
  }

  @Test
  public void testLogSuccessfulResponse_infoEnabled() {
    when(reportLogger.isInfoEnabled()).thenReturn(true);

    assertResponseDetailsLogged(HttpStatusCodes.STATUS_CODE_OK, "SUCCESS", true);
  }

  /**
   * Tests that successful response details are NOT logged with INFO level if info is disabled.
   */
  @Test
  public void testLogSuccessfulResponse_infoDisabled() {
    when(reportLogger.isInfoEnabled()).thenReturn(false);
    reportServiceLogger.logResponse(HttpStatusCodes.STATUS_CODE_OK, "Status is OK", true);

    verify(reportLogger, never()).info(org.mockito.Matchers.anyString());
  }

  @Test
  public void testGetLogger() {
    assertNotNull("getLogger should return a non-null Logger", reportServiceLogger.getLogger());
    assertSame("getLogger should return the Logger passed to its constructor", reportLogger,
        reportServiceLogger.getLogger());
  }

  /**
   * Asserts that all of the request details were logged.
   *
   * @param isSuccessful if the request was successful
   * @param requestMethod HTTP request method of the request
   * @param url URL of the request
   * @param requestContent content of the request
   * @param requestHeaders headers on the request
   * @param expectedHeaders headers whose values should appear in log messages
   * @param redactedHeaders headers whose values should be redacted in log messages
   */
  private void assertRequestDetailsLogged(boolean isSuccessful,
      String requestMethod,
      GenericUrl url,
      HttpContent requestContent,
      GenericData requestHeaders,
      Set<String> expectedHeaders,
      Set<String> redactedHeaders) {
    // Invokes the report service logger so calls on it and its underlying SLF4J logger can
    // be verified.
    reportServiceLogger.logRequest(requestMethod, url, requestContent, requestHeaders,
        isSuccessful);

    // Verifies invocations and arguments.
    ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
    if (isSuccessful) {
      verify(reportLogger, times(2)).info(messageCaptor.capture());
    } else {
      verify(reportLogger, times(2)).warn(messageCaptor.capture());
    }
    List<String> capturedMessages = messageCaptor.getAllValues();
    assertEquals("Number of captured messages is incorrect", 2, capturedMessages.size());

    if (url != null) {
      assertThat("URL not logged", capturedMessages.get(0), containsString(url.build()));
    }
    if (requestMethod != null) {
      assertThat("Request method not logged", capturedMessages.get(0),
          containsString(requestMethod));
    }

    if (requestHeaders != null) {
      // Verifies that expected headers were logged with values and redacted headers were logged
      // with masked values.
      for (Entry<String, Object> headerEntry : requestHeaders.entrySet()) {
        String header = headerEntry.getKey();
        Object value = headerEntry.getValue();
        assertThat("Expected header name not logged", capturedMessages.get(1),
            containsString(header));

        Object expectedValue;
        if (expectedHeaders.contains(header)) {
          assertThat("Expected header value not logged", capturedMessages.get(1),
              containsString(value.toString()));
          expectedValue = value;
        } else {
          assertThat("Header is in neither redactedHeaders nor expectedHeaders - confirm "
              + "this test is set up correctly", redactedHeaders, Matchers.hasItem(header));
          assertThat("Redacted header value logged when it shouldn't be", capturedMessages.get(1),
              not(Matchers.containsString(value.toString())));
          expectedValue = ReportServiceLogger.SCRUBBED_HEADERS_VALUE;
        }

        assertThat("Header: value does not match expectatations", capturedMessages.get(1),
            Matchers.containsString(String.format("%s: %s", header, expectedValue)));
      }
    }
  }

  /**
   * Asserts that all of the response details were logged.
   */
  private void assertResponseDetailsLogged(int statusCode, String statusMessage,
      boolean isSuccessful) {
    // Invokes the report service logger so calls on it and its underlying SLF4J logger can
    // be verified.
    reportServiceLogger.logResponse(statusCode, statusMessage, isSuccessful);

    // Verifies invocations and arguments.
    ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
    if (isSuccessful) {
      verify(reportLogger, times(1)).info(messageCaptor.capture());
    } else {
      verify(reportLogger, times(1)).warn(messageCaptor.capture());
    }

    assertEquals("Number of captured messages is incorrect", 1,
        messageCaptor.getAllValues().size());

    String capturedMessage = messageCaptor.getValue();
    assertThat("Status code not logged", capturedMessage,
        containsString(String.valueOf(statusCode)));
    if (statusMessage != null) {
      assertThat("Status message not logged", capturedMessage, containsString(statusMessage));
    }
  }
}
